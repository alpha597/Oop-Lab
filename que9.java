import java.util.*;
import java.time.Period;
import java.time.LocalDate;
class Person{
    String name;
    double wt_in_kg;
    double height;
    String dateOfBirth;
    int age;
    String address;
    public static int calTimePeriod(String time){
        LocalDate  now = LocalDate.now();
        LocalDate date = LocalDate.parse(time);
        int years = Period.between(date,now).getYears();
        return years;
    }
    public Person(String n, double w,double h,String dob,String add){
        name =n;
        wt_in_kg =w;
        height =h;
        dateOfBirth = dob;
        age = calTimePeriod(dateOfBirth);
        address = add;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public int getAge(){
        return age;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void printDetails(){
        System.out.println("Name is " +name);
        System.out.println("Age is " +age);
        System.out.println("Address is " + address);
        System.out.println("Height is " + height);
        System.out.println("Weight is " + wt_in_kg);
        System.out.println("DateOfBirth is " + dateOfBirth);
    }
}
class Employee extends Person{
    int salary;
    String dateOfJoining;
    int experience;
    public Employee(String n,double w,double h,String dob,String add,String dateOfJoining,int sal){
        super(n, w, h, dob, add);
        this.dateOfJoining = dateOfJoining;
        salary = sal;
        experience = calTimePeriod(dateOfJoining);
    }
    @Override
    public void printDetails(){
        System.out.println("Name is " +name);
        System.out.println("Age is " +age);
        System.out.println("Address is " + address);
        System.out.println("Height is " + height);
        System.out.println("Weight is " + wt_in_kg);
        System.out.println("DateOfBirth is " + dateOfBirth);
        System.out.println("Salary is " + salary);
        System.out.println("Experience is " + experience);
    }


}
class Pair{
    String sub;
    int marks;
    public Pair(String s, int m){
        sub = s;
        marks = m;
    }
    public String getSub(){
        return sub;
    }
    public int getMarks(){
        return marks;
    }
    public void setMarks(int m){
        marks =m;
    }
}
class Student extends Person{
    int roll;
    List<Pair> listOfSub;
    public Student(String n,double w, double h, String dob, String add,int roll){
        super(n, w, h, dob, add);
        this.roll = roll;
        listOfSub = new ArrayList<>();
    }
    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
    public void setListOfSub(List<Pair> listOfSub) {
        this.listOfSub = listOfSub;
    }
    public List<Pair> getListOfSub() {
        return listOfSub;
    }
    public double calGrade(){
        int sum =0;
        int count =0;
        for(Pair p :listOfSub){
            sum += p.getMarks();
            count++;
        }
        double grade =((double) sum /count*100)*100;
        return grade;
    }
    @Override
    public void printDetails(){
        System.out.println("Name is " +name);
        System.out.println("Age is " +age);
        System.out.println("Address is " + address);
        System.out.println("Height is " + height);
        System.out.println("Weight is " + wt_in_kg);
        System.out.println("DateOfBirth is " + dateOfBirth);
        System.out.println("Roll is " + roll);
        System.out.println("Grade is "+ calGrade());
        
    }

}
class Technician extends Employee{
    public Technician(String n,double w,double h,String dob,String add,String dateOfJoining,int sal){
        super(n, w, h, dob, add,dateOfJoining,sal);
        
    }
    @Override
    public void printDetails(){
        System.out.println("Name is " +name);
        System.out.println("Age is " +age);
        System.out.println("Address is " + address);
        System.out.println("Height is " + height);
        System.out.println("Weight is " + wt_in_kg);
        System.out.println("DateOfBirth is " + dateOfBirth);
        System.out.println("Salary is " + salary);
        System.out.println("Experience is " + experience);
    }
}
class Professor extends Employee{
    List<String> courses = new ArrayList<>();
    List<String> listOfAdvice = new ArrayList<>();
    public Professor(String n,double w,double h,String dob,String add,String dateOfJoining,int sal){
        super(n, w, h, dob, add,dateOfJoining,sal);
        
    }
    public List<String> getCourses() {
        return courses;
    }
    public List<String> getListOfAdvice() {
        return listOfAdvice;
    }
    public void setCourses(List<String> courses) {
        this.courses = courses;
    }
    public void setListOfAdvice(List<String> listOfAdvice) {
        this.listOfAdvice = listOfAdvice;
    }
    public void addCourse(String course){
        if(!courses.contains(course)){
            courses.add(course);
        }
    }
}
 class practice{
    public static void main(String[] args) {
        Person p1 = new Person("Alice",60,153,"2004-01-03","Kolkata");
        p1.printDetails();
        Employee e1 = new Employee("Bob", 55, 163, "2004-04-05", "Kolkata", "2020-05-06",50000);
        e1.printDetails();
        List<Pair> list = new ArrayList<>();
        list.add(new Pair("oop",90));
        list.add(new Pair("OS",95));
        list.add(new Pair("DBMS",92));
        Student s1 = new Student("Joy",60,153,"2005-01-01","Kolkata",500001);
        s1.setListOfSub(list);
        s1.printDetails();
        
    }
}
