package com.a;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

//解析注解
public class ccc {
	
		public static void main(String[] args) {
			//使用类加载器加载类
			try {
				Class c=Class.forName("com.a.b");
				//找到类上面的注解
				boolean isE=c.isAnnotationPresent(sss.class);
			if(isE){
				//拿到注解的实体
				sss d=(sss)c.getAnnotation(sss.class);
				System.out.println(d.age());
			}
			//找到方法上的注解
			Method[] ms = c.getMethods();
			for (Method m : ms) {
				boolean isEm=m.isAnnotationPresent(sss.class);
				if(isEm){
					//拿到注解的实体
					sss d=(sss)m.getAnnotation(sss.class);
					System.out.println(d.age());
				}
			}
			
			//另外一种解析方法
			for (Method m : ms) {
				Annotation[] annotations = m.getAnnotations();
			for (Annotation a : annotations) {
				if(a instanceof sss){
					sss s=(sss)a;
					System.out.println(s.age());
				}
			}
			}
			
				
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
