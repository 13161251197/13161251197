package com.b;
//ע��ʵս һ����˾�ĳ־ò���  ��������hibernate�Ľ������ͨ��ע��ʵ��
//����1   �û���id  name  �ǳ�  age sex  city   ����  �ֻ��ţ�
//2  �����ÿ���ֶε���Ͻ��м�������ӡ��sql
//ʹ�÷�ʽ�㹻�� 

@Table("user")
public class Filter {
	@Column("id")
	private int id;
	@Column("userName")
	private String userName;
	@Column("nickName")
	private String nickName;
	@Column("age")
	private int age;
	@Column("city")
	private String city;
	@Column("mobile")
	private String mobile;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Filter(int id, String userName, String nickName, int age,
			String city, String mobile) {
		super();
		this.id = id;
		this.userName = userName;
		this.nickName = nickName;
		this.age = age;
		this.city = city;
		this.mobile = mobile;
	}
	public Filter() {
		super();
	}
	
}
