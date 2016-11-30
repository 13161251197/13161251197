package com.b;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
//Target 注解的作用域 （区部变量 方法 包  借口  类字段   constructor）  (如：Element.type)
@Retention(RetentionPolicy.RUNTIME)//源码source   编译  class
//Retention 生命周期 （源代码、运行、编译）

public @interface Column {
	String value();
}
