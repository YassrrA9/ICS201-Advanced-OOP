package package04;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person Obj1 = new Person("Khaled Ali","Dhahran","0546738261","KhaledA@kfupm");
		Employee Obj2 = new Employee("Sulaiman Ahmad","Dammam","0578493072","SulAhm@kfupm",153,12000.25,"25 jan 2018");
		Faculty  Obj3 = new Faculty("12:00 - 13:00","Prof","Ali Faissal","Khobar","0538472950","Ali@kfupm",123,15000.25,"25 Sep 2016");
		Staff Obj4 = new Staff("Director","Ahmad Faissal","Khobar","0539822950","AhmadFai@kfupm",100,20000.25,"05 Sep 2015");
		Student Obj5 = new Student("Sophmore","Yasser Ali","Dhahran","0521738261","Yasser@kfupm");
		
		System.out.println(Obj1);
		System.out.println(Obj2);
		System.out.println(Obj3);
		System.out.println(Obj4);
		System.out.println(Obj5);


	}

}
