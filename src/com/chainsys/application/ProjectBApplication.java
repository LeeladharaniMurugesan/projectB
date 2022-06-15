package com.chainsys.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication 
class ProjectBApplication {

public static void main(String[] args) {
    SpringApplication.run(ProjectBApplication.class, args); //launch JVM then main method is loaded then TOMCAT is running then spring container loaded

    }

}