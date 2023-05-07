package gdsldl.fl.generic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author:FL
 * @version: 2023年4月10日下午4:36:41
*/
@SuppressWarnings({"all"})
public class Generic_Ex2 {
public static void main(String[] args) {
	Employee emp1 = new Employee("张三", 23, new MyDate(4, 10, 1000));
	Employee emp2 = new Employee("李四", 24, new MyDate(4, 10, 1999));
	Employee emp3 = new Employee("王五", 22, new MyDate(12, 10, 2100));
	
	List<Employee> list = new ArrayList<>();
	list.add(emp1);
	list.add(emp2);
	list.add(emp3);
	
	list.sort(new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			if (!o1.getName().equals(o2.getName())) {//如果名字不相同

				return o1.getName().compareTo(o2.getName());
				
			} 
//			下面是对mydate的比较，最好放在mydate中
//			int yearMinus = o1.getBirthday().getYear() - o2.getBirthday().getYear();
//			if (yearMinus != 0) {
//				return yearMinus;
//			}
//			int monthMinus = o1.getBirthday().getMonth() - o2.getBirthday().getMonth();
//			if (monthMinus != 0) {
//				return monthMinus;
//			}
//			int dayMinus = o1.getBirthday().getDay() - o2.getBirthday().getDay();
//			if (dayMinus != 0) {
//				return dayMinus;
//			}
			return o1.getBirthday().compareTo(o2.getBirthday());
		};
	});
	
	System.out.println("list = "+list);
}
}
@SuppressWarnings({"all"})
class Employee{
	private String name;
	private double sal;
	private MyDate birthday;
	public Employee(String name, double sal, MyDate birthday) {
		super();
		this.name = name;
		this.sal = sal;
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "Employee name=" + name + ", sal=" + sal + ", birthday=" + birthday + ";";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public MyDate getBirthday() {
		return birthday;
	}
	public void setBirthday(MyDate birthday) {
		this.birthday = birthday;
	}
	
}
@SuppressWarnings({"all"})
class MyDate implements Comparable<MyDate>{
	private int month;
	private int day;
	private int year;
	public MyDate(int month, int day, int year) {
		super();
		this.month = month;
		this.day = day;
		this.year = year;
	}
	@Override
	public String toString() {
		return  month + "-" + day + "-" + year ;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public int compareTo(MyDate o) {
		int yearMinus = year - o.getYear();
		if (yearMinus != 0) {
			return yearMinus;
		}
		int monthMinus = month - o.getMonth();
		if (monthMinus != 0) {
			return monthMinus;
		}
		int dayMinus = day - o.getDay();
		return dayMinus;
	}
	
}