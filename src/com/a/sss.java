package com.a;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



//Ԫע����Զ���
@Target({ElementType.METHOD,ElementType.TYPE})
	//Target ע��������� ���������� ���� ��  ���  ���ֶ�   constructor��  (�磺Element.type)
@Retention(RetentionPolicy.RUNTIME)//Դ��source   ����  class
	//Retention �������� ��Դ���롢���С����룩
@Inherited  //ֻ���������ϲ��������÷����ϲ���
	//Inherited  ��ʾ�Ե�����������ע��
@Documented 
	//Documented ����javadoc�ĵ�ʱ�����ע�����Ϣ
public @interface sss {
	/*��Ա���޲����쳣��ʽ���� 
	 ������������ԭʼ����   String  Class Annotation Enumeration 
	ע��ֻ��һ����Ա������ʱ��  ��Ա������Ϊvalue������ʹ�õ�ʱ����Ժ��Գ�Ա���͸�ֵ�ţ�=��
	ע�������û�г�Ա  û�г�Ա��ע���Ϊ��ʾע��*/
	String name();
	int age();
}
//ע��ʵս һ����˾�ĳ־ò���  ��������hibernate�Ľ������ͨ��ע��ʵ��
//����1   �û���id  name  �ǳ�  age sex  city   ����  �ֻ��ţ�
//2  �����ÿ���ֶε���Ͻ��м�������ӡ��sql
//ʹ�÷�ʽ�㹻�� 

