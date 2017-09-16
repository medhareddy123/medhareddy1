public class Main {

	public static void main(String[] args) {


		//You may test that your code works find here
		//Please check that your code works and has no
		//compilation problems before to submit
	StudentGroup std=new StudentGroup(7);
	Calendar cal = Calendar.getInstance();
cal.set(2013, Calendar.JANUARY, 9); //Year, month and day of month
Date date = cal.getTime();
	Student m[];
	 m[0]=new Student(77,"medha",date,60.46);
	std.setStudents(m);
	//std.addFirst(m1);
	//std.addLast(m1);
	}

}
