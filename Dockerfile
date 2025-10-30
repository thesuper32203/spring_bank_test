# ---------- Build stage ----------
FROM eclipse-temurin:21-jdk AS build
WORKDIR /app

# 1) Bring in Maven Wrapper first (better cache)
COPY .mvn/ .mvn/
COPY mvnw mvnw.cmd ./

# 2) Copy only POMs first (parent + modules)
COPY pom.xml .
COPY api_client/pom.xml api_client/pom.xml
COPY bank_testing_spring/pom.xml bank_testing_spring/pom.xml

# 3) Prefetch dependencies for the modules (no sources yet)
#    -pl selects modules; -am builds their deps too
RUN ./mvnw -B -DskipTests -pl api_client,bank_testing_spring -am dependency:go-offline

# 4) Now copy the actual source code (keeps cache warm on POM changes)
COPY api_client/ api_client/
COPY bank_testing_spring/ bank_testing_spring/

# 5) Build all modules
RUN ./mvnw -B -DskipTests package

# ---------- Run stage ----------
FROM eclipse-temurin:21-jre AS app
WORKDIR /app
COPY --from=build /app/bank_testing_spring/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/app.jar"]
