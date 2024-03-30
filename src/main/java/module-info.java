module CrackingTheCodingInterview {
  requires java.base;
  exports com.klebermagno.code ;
  exports com.klebermagno.code.advanced.spring;
  requires spring.boot;
  requires spring.boot.autoconfigure;
  requires spring.context;
  requires spring.data.jpa;
  requires spring.data.commons;
  requires java.persistence;
  requires spring.web;
  requires spring.beans;
  opens com.klebermagno.code.advanced.spring ;
}
