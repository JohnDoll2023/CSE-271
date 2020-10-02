
public class Tester {

	public static void main(String[] args) {
		Person p0 = new Person();
		p0.setBirth(1999);
		p0.setName("John");
		System.out.println(p0.toString());
		Person p1 = new Person("John", 2001);
		Person p2 = new Person(p1.getName(),p1.getBirth());
		System.out.println(p1.equals(p2));
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		p2.setName("Lauren");
		p1.setBirth(2004);
		System.out.println(p1.equals(p2));
		System.out.println(p1.toString());
		System.out.println(p2.toString());

		
		Student s0 = new Student();
		s0.setBirth(1999);
		s0.setName("John");
		s0.setMajor("Analytics");
		System.out.println(s0.toString());
		Student s1 = new Student("John", 2001, "CS");
		Student s2 = new Student(s1.getName(), s1.getBirth(), s1.getMajor());
		System.out.println(s1.equals(s2));
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		s2.setName("Lauren");
		s1.setBirth(2004);
		s1.setMajor("SE");
		System.out.println(s1.equals(s2));
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		
		
		Instructor i0 = new Instructor();
		i0.setBirth(1999);
		i0.setName("John");
		i0.setRank("Boss");
		System.out.println(i0.toString());
		Instructor i1 = new Instructor("John", 2001, "Professor");
		Instructor i2 = new Instructor(i1.getName(), i1.getBirth(), i1.getRank());
		System.out.println(i1.equals(i2));
		System.out.println(i1.toString());
		System.out.println(i2.toString());
		i2.setName("Lauren");
		i1.setBirth(2004);
		i1.setRank("Doctor");
		System.out.println(i1.equals(i2));
		System.out.println(i1.toString());
		System.out.println(i2.toString());
		
		
		Employee e0 = new Employee();
		e0.setBirth(1999);
		e0.setName("John");
		e0.setSalary(100);
		System.out.println(e0.toString());
		Employee e1 = new Employee("John", 2001, 5000);
		Employee e2 = new Employee(e1.getName(), e1.getBirth(), e1.getSalary());
		System.out.println(e1.equals(e2));
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		e2.setName("Lauren");
		e1.setBirth(2004);
		e1.setSalary(1000);
		System.out.println(e1.equals(e2));
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		
		
		Manager m0 = new Manager();
		m0.setBirth(1999);
		m0.setName("John");
		m0.setSalary(200);
		m0.setDepartment("jobless");
		System.out.println(m0.toString());
		Manager m1 = new Manager("John", 2001, 5000, "Marketing");
		Manager m2 = new Manager(m1.getName(), m1.getBirth(), m1.getSalary(), m1.getDepartment());
		System.out.println(m1.equals(m2));
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		m2.setName("Lauren");
		m1.setBirth(2004);
		m1.setSalary(1000);
		m2.setDepartment("Finance");
		System.out.println(m1.equals(m2));
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		
		
		Executive x0 = new Executive();
		x0.setBirth(1999);
		x0.setName("John");
		x0.setSalary(200);
		x0.setDepartment("jobless");
		x0.setOffice("Area 51");
		System.out.println(x0.toString());
		Executive x1 = new Executive("John", 2001, 5000, "Marketing", "101");
		Executive x2 = new Executive(x1.getName(), x1.getBirth(), x1.getSalary(), x1.getDepartment(), x1.getOffice());
		System.out.println(x1.equals(x2));
		System.out.println(x1.toString());
		System.out.println(x2.toString());
		x2.setName("Lauren");
		x1.setBirth(2004);
		x1.setSalary(1000);
		x2.setDepartment("Finance");
		x1.setOffice("Room 303");
		System.out.println(x1.equals(x2));
		System.out.println(x1.toString());
		System.out.println(x2.toString());
	}

}
