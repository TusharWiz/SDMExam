FROM openjdk:11
COPY . /src/exam/sdm
WORKDIR /src/exam/sdm
RUN javac Factorial.java
CMD ["java" , "Factorial"]