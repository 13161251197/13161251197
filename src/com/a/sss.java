package com.a;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



//元注解的自定义
@Target({ElementType.METHOD,ElementType.TYPE})
	//Target 注解的作用域 （区部变量 方法 包  借口  类字段   constructor）  (如：Element.type)
@Retention(RetentionPolicy.RUNTIME)//源码source   编译  class
	//Retention 生命周期 （源代码、运行、编译）
@Inherited  //只能用在类上才能起作用方法上不行
	//Inherited  标示性的允许有子类注解
@Documented 
	//Documented 生成javadoc的的时候包含注解的信息
public @interface sss {
	/*成员以无参无异常方式声明 
	 类型受限制有原始类型   String  Class Annotation Enumeration 
	注解只有一个成员变量的时候  成员名必须为value（）在使用的时候可以忽略成员名和赋值号（=）
	注解类可以没有成员  没有成员的注解成为标示注解*/
	String name();
	int age();
}
//注解实战 一个公司的持久层框架  用来代替hibernate的解决方案通过注解实现
//需求1   用户表（id  name  昵称  age sex  city   邮箱  手机号）
//2  方便对每个字段的组合进行检索并打印出sql
//使用方式足够简单 

