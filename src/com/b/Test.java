package com.b;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;


public class Test {

	private static final String Table = null;

	public static void main(String[] args) {
		Filter f1=new Filter();
		f1.setId(10);
		
		Filter f2=new Filter();
		f1.setUserName("luck");
		//f1.setAge(0);
		Filter f3=new Filter();
		f1.setMobile("2432354");
		
		String sql1=query(f1);
		String sql2=query(f2);
		String sql3=query(f3);
		
		System.out.println(sql1);



	}

	private static String query(Filter f) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();
		//����ע��
		Class<? extends Filter> c =f.getClass();
		boolean ISE=c.isAnnotationPresent(Table.class);
		if(!ISE){return null;}
		Table table=(Table)c.getAnnotation(Table.class);
		sb.append("select * from ").append(table.value()).append(" where 1=1");
		//�������е��ֶ�
		Field[] fa=c.getDeclaredFields();
		for (Field field : fa) {
			//����ÿ���ֶζ�Ӧ��sql
			//�õ��ֶ�����ֵ  sql
			//ͨ��ʵ�����õ���Ӧ��ͨ��ע��õ��ı���ֶ���
			boolean ISE1=field.isAnnotationPresent(Column.class);
			if(!ISE1){ continue;}
			//�õ��ֶ���
			Column cou=field.getAnnotation(Column.class);
			String couv=cou.value();
			
			
			String name = field.getName();
			//�õ���Ӧ�ķ���
			String getmname="get"+name.substring(0,1).toUpperCase()+name.substring(1);
			Object fv=null;
			try {
				Method getm=c.getMethod(getmname);
			try {
				//�õ���Ӧ��ֵ
				//����������age  intĬ������ֵΪ0   ����ע���ϱ߸�ֵΪ0 ��Ĭ��Ϊ0������
				fv=getm.invoke(f);
				
				if(fv instanceof String){
					fv="'"+fv+"'";
				}
				
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(fv==null||(fv==null&&fv instanceof Integer && (Integer)fv==0)){
			//sb.append(" and ").append(name).append("=").append(fv);
			continue;
			}
			sb.append(" and ").append(name).append("=").append(fv);

			
		}
		return sb.toString();
	}

}
