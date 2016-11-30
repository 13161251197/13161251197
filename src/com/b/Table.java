package com.b;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
//Target ע��������� ���������� ���� ��  ���  ���ֶ�   constructor��  (�磺Element.type)
@Retention(RetentionPolicy.RUNTIME)//Դ��source   ����  class
//Retention �������� ��Դ���롢���С����룩

public @interface Table {
	String value();
}
