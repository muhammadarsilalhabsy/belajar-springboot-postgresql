package com.m19y.web.service.spring.boot.configuration;

import com.m19y.web.service.spring.boot.repository.StudentRepository;
import com.m19y.web.service.spring.boot.model.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfiguration {

  @Bean
  CommandLineRunner commandLineRunner(StudentRepository studentRepository){
    return args -> {

      Student arsil = new Student("Arsil","arsil@gmail.com", LocalDate.of(2001, Month.SEPTEMBER, 2));
      Student abilal = new Student("Abilal","abilal@gmail.com", LocalDate.of(2018, Month.JANUARY, 4));
      Student apon = new Student("Apon","apon@gmail.com", LocalDate.of(2017, Month.OCTOBER, 12));
      Student ajieb = new Student("Ajieb","ajieb@gmail.com", LocalDate.of(2005, Month.SEPTEMBER, 24));
      Student zait = new Student("Zait","zait@gmail.com", LocalDate.of(2020, Month.DECEMBER, 21));

      studentRepository.saveAll(List.of(arsil,abilal,apon,ajieb,zait));
    };
  }
}
