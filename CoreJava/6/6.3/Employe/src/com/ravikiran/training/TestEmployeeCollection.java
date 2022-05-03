package com.ravikiran.training;

import java.util.Vector;
public class TestEmployeeCollection {
	private static final Employee[] v = null;
	public static void main(String[] args) {
		Vector<Employee> v = addInput();
		display(v);
		}

	private static Vector<Employee> addInput() {
		// TODO Auto-generated method stub
		return null;
	}

	private static void display(Vector<Employee> v) {
		// TODO Auto-generated method stub
		
	}

	public static void main1(String[] args) {
		Employee e1=new Employee (101,"ram", "Vijayawada");
		Employee e2=new Employee (102,"sri", "Guntur");
		Employee e3=new Employee (103,"alok", "Eluru");
		Vector<Employee> v=new Vector<Employee>();
		v.add(e1);
		v.add(e2);
		v.add(e3);
		return;
	}
	public static void main11(String[] args) {
		for(Employee e:v)
		{
			System.out.println(e.getEmpid()+"\t"+e.getEname()+"\t"+e.getAddress());
		}
	}
}