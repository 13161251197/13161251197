package com.a;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

//����ע��
public class ccc {
	
		public static void main(String[] args) {
			//ʹ���������������
			try {
				Class c=Class.forName("com.a.b");
				//�ҵ��������ע��
				boolean isE=c.isAnnotationPresent(sss.class);
			if(isE){
				//�õ�ע���ʵ��
				sss d=(sss)c.getAnnotation(sss.class);
				System.out.println(d.age());
			}
			//�ҵ������ϵ�ע��
			Method[] ms = c.getMethods();
			for (Method m : ms) {
				boolean isEm=m.isAnnotationPresent(sss.class);
				if(isEm){
					//�õ�ע���ʵ��
					sss d=(sss)m.getAnnotation(sss.class);
					System.out.println(d.age());
				}
			}
			
			//����һ�ֽ�������
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
