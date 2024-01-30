import java.util.*;
class AutoMobile{
    String make;
    String type;
   int maxSpeed;
   double price;
    int milage;
   int registerNo;

    public AutoMobile (String m,String t, int mS,double p, int mile,int rN){
        make = m;
        type =t;
        maxSpeed = mS;
        price =p;
        milage = mile;
        registerNo = rN;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMilage() {
        return milage;
    }

    public void setMilage(int milage) {
        this.milage = milage;
    }

    public int getRegisterNo() {
        return registerNo;
    }

    public void setRegisterNo(int registerNo) {
        this.registerNo = registerNo;
    }
    public void print(){
        System.out.println("Maker is " +make);
        System.out.println("Type is " + type);
        System.out.println("MaxSpeed is "+maxSpeed);
        System.out.println("Price is " + price);
        System.out.println("Milage is " + milage);
        System.out.println("Registration Number " + registerNo);
    }
    
}
class Car extends AutoMobile{
    int noOfDoors;
    int sittingCapacity;

    public Car (String m, String t, int mS,double p,int mile,int rN,int noOfDoors, int sittingCapacity){
        super(m,t,mS,p,mile,rN);
        this.noOfDoors = noOfDoors;
        this.sittingCapacity = sittingCapacity;
    }

    public int getNoOfDoors() {
        return noOfDoors;
    }

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    public int getSittingCapacity() {
        return sittingCapacity;
    }

    public void setSittingCapacity(int sittingCapacity) {
        this.sittingCapacity = sittingCapacity;
    }
    @Override
    public void print(){
        System.out.println("Maker is " +make);
        System.out.println("Type is " + type);
        System.out.println("MaxSpeed is "+maxSpeed);
        System.out.println("Price is " + price);
        System.out.println("Milage is " + milage);
        System.out.println("Registration Number " + registerNo);
        System.out.println("NoOfDoors is " +noOfDoors);
        System.out.println("Sitting Capacity is " + sittingCapacity);
    }
    

    
}
class Truck extends AutoMobile{
    int capacity;
    String hoodType;
    int noOfWheels;
    
    public Truck(String m,String t,int mS,double p,int mile,int rN,int capacity,String hoodType,int noOfWheels){
        super(m, hoodType, mS, capacity, mile, rN);
        this.capacity = capacity;
        this.hoodType = hoodType;
        this.noOfWheels = noOfWheels;

    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getHoodType() {
        return hoodType;
    }

    public void setHoodType(String hoodType) {
        this.hoodType = hoodType;
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }
    @Override
    public void print(){
        System.out.println("Maker is " +make);
        System.out.println("Type is " + type);
        System.out.println("MaxSpeed is "+maxSpeed);
        System.out.println("Price is " + price);
        System.out.println("Milage is " + milage);
        System.out.println("Registration Number " + registerNo);
    }

}
class practice {
    public static void main(String args[]){
        Car c1 = new Car("Tyota","Petrol",150,250000,60,1034065,4,4);
        
        Car c2 = new Car("Swift","Petrol",160,260000,60,1084068,4,6);
        Truck t1 = new Truck("Mahindra","Petrol",200,500060,80,5034089,9,"Medium",10);
        c1.print();
        c2.print();
        t1.print();
        
    }
}
