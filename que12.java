import java.util.*;
class Student{
   int roll;
   String name;
   List<String> sub;
   public Student(String n,int roll){
    this.roll = roll;
    name  =n;
    sub = new ArrayList<>();
   }
public int getRoll() {
    return roll;
}
public void setRoll(int roll) {
    this.roll = roll;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public List<String> getSub() {
    return sub;
}
public void setSub(List<String> sub) {
    this.sub = sub;
}
   
}
class TabulationSheet{
    String nameOfSub;
    List<Integer> marksOfStudent;
    public TabulationSheet(String name){
        nameOfSub = name;
        marksOfStudent = new ArrayList<>();
    }
    public String getNameOfSub() {
        return nameOfSub;
    }
    public void setNameOfSub(String nameOfSub) {
        this.nameOfSub = nameOfSub;
    }
    public List<Integer> getMarksOfStudent() {
        return marksOfStudent;
    }
    public void setMarksOfStudent(List<Integer> marksOfStudent) {
        this.marksOfStudent = marksOfStudent;
    }
    
}
class pair{
    String sub;
    int marks;
    public pair(String s, int m){
        sub =s;
        marks =m;
    }
    public String getSub() {
        return sub;
    }
    public void setSub(String sub) {
        this.sub = sub;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
    
}
class MarkSheet {
     String nameOfStu;
     int roll;
     List<pair> marks;
     public MarkSheet(String nameOfStu,int r){
        this.roll =r;
        this.nameOfStu = nameOfStu;
        marks = new ArrayList<>();
     }
    public String getNameOfStu() {
        return nameOfStu;
    }
    public void setNameOfStu(String nameOfStu) {
        this.nameOfStu = nameOfStu;
    }
    public void setMarks(List<pair> marks) {
        this.marks = marks;
    }
    public void printMarkSheet(){
        System.out.println("MarkSheet of Student "+nameOfStu);
        for(int a=0;a<marks.size();a++){
            System.out.println("Subject : "+marks.get(a).getSub()+" ," +"Number : " + marks.get(a).getMarks() );
        }
    }
     
 
}
class practice{
    public static void main(String[] args) {
        Student s1 = new Student("Alice",500001);
        List<String> l1 = new ArrayList<>();
        l1.add("SE");
        l1.add("OOPS");
        l1.add("MATH");
        l1.add("DSA");
        l1.add("CN");
        s1.setSub(l1);
        MarkSheet m1 = new MarkSheet("Alice",500001);
        List<pair> lm1 = new ArrayList<>();
        lm1.add(new pair("SE",90));
        lm1.add(new pair("OOPS",91));
        lm1.add(new pair("MATH",85));
        lm1.add(new pair("DSA",90));
        lm1.add(new pair("CN",90));
        m1.setMarks(lm1);
        Student s2 = new Student("Bob",500002);
        List<String> l2 = new ArrayList<>();
        l2.add("SE");
        l2.add("OOPS");
        l2.add("MATH");
        l2.add("DSA");
        l2.add("CN");
        s2.setSub(l2);
        MarkSheet m2 = new MarkSheet("Bob",500002);
        List<pair> lm2 = new ArrayList<>();
        lm2.add(new pair("SE",95));
        lm2.add(new pair("OOPS",92));
        lm2.add(new pair("MATH",85));
        lm2.add(new pair("DSA",86));
        lm2.add(new pair("CN",90));
        m2.setMarks(lm2);
        Student s3 = new Student("Ben",500003);
        List<String> l3 = new ArrayList<>();
        l3.add("DBMS");
        l3.add("OOS");
        l3.add("MATH");
        l3.add("OS");
        l3.add("CN");
        s3.setSub(l3);
        MarkSheet m3 = new MarkSheet("Ben",500003);
        List<pair> lm3 = new ArrayList<>();
        lm3.add(new pair("DBMS",94));
        lm3.add(new pair("OOS",92));
        lm3.add(new pair("MATH",85));
        lm3.add(new pair("OS",86));
        lm3.add(new pair("CN",90));
        m3.setMarks(lm3);
        TabulationSheet t1 = new TabulationSheet("OOPS");
        TabulationSheet t2 = new TabulationSheet("DSA");
        TabulationSheet t3 = new TabulationSheet("SE");
        TabulationSheet t4 = new TabulationSheet("MATH");
        TabulationSheet t5 = new TabulationSheet("CN");
        List<Integer> lt1 = new ArrayList<>();
        lt1.add(91);
        lt1.add(92);
        t1.setMarksOfStudent(lt1);
        List<Integer> lt2 = new ArrayList<>();
        lt2.add(90);
        lt2.add(86);
        t2.setMarksOfStudent(lt2);
        List<Integer> lt3= new ArrayList<>();
        lt3.add(90);
        lt3.add(86);
        t3.setMarksOfStudent(lt3);
        List<Integer> lt4 = new ArrayList<>();
        lt4.add(90);
        lt4.add(86);
        t4.setMarksOfStudent(lt4);

        m1.printMarkSheet();
        m2.printMarkSheet();
        m3.printMarkSheet();
        
        
    }
}
