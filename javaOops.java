//Classes & Objects
/*import java.util.*;
public class javaOops{
    public static void main(String args[]){
        Pen p1 = new Pen();    //created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        //p1.setColor("Yellow");
        p1.color = "Yellow";
        System.out.println(p1.color);
    }
}

class Pen{               //Start the first letter of class with capital letter - as per a good developer
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;  //cgpa

    void calcPercentage(int phy, int chem, int maths){
        percentage = (phy + chem + maths) / 3;
    }
}*/

//Access Modifiers
/*import java.util.*;
public class javaOops{
    public static void main(String args[]){
        BankAccount myAcc = new BankAccount();
        myAcc.username = "AmishaMulani";
        System.out.println(myAcc.username);
        myAcc.setPassword("abcdefghi");
    }
}

class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}*/

//Getters & Setters
/*import java.util.*;
public class javaOops{
    public static void main(String args[]){
        Pen p1 = new Pen();    //created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        //p1.setColor("Yellow");
        p1.setColor("Yellow");
        System.out.println(p1.getColor());
    }
}

class Pen{
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }
    void setColor(String newColor){
        this.color = newColor;
    }
    void setTip(int tip){
        this.tip = tip;
    }
}*/

//Constructors
/*public class javaOops{
    public static void main(String args[]){
        Student s1 = new Student("Amisha");
        //System.out.println(s1.name);             //baadme comment out krna he rather removing argument
    }
}

class Student{
    String name;
    int roll;

    Student(String name){               //constructor
        //this.name = name;
        //if we dont want to pass a value in constructor we can do other work such as:
        //for this we remove argument- String name
        System.out.println("Constructor is called...");
    }
}*/

//Non-parameterized constructor
/*public class javaOops{
    public static void main(String args[]){
        Student s1 = new Student();
    }
}

class Student{
    String name;
    int roll;

    Student(){
        System.out.println("constructor is called...");
    }
}*/

//Parameterized constructor
/*public class javaOops{
    public static void main(String args[]){
        Student s1 = new Student("Amisha");
        //System.out.println(s1.name);
    }
}

class Student{
    String name;
    int roll;

    Student(String name){
        this.name = name;
    }
}*/

//Multiple constructors in a same class
//This is an example of constructor overloading - Polymorphism
/*public class javaOops{
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student("Amisha");
        Student s3 = new Student(123);
    }
}

class Student{
    String name;
    int roll;

    Student(){
        System.out.println("constructor is called....");
    }
    Student(String name){
        this.name = name;
    }
    Student(int roll){
        this.roll = roll;
    }
}*/

//Copy Constructor
/*public class javaOops{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "amisha";
        s1.roll = 456;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);   //copy
        s2.password = "xyz";
        s1.marks[2] = 100;
        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class Student{
    String name;
    int roll;
    String password;
    int marks[];

    //copy constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }

    Student(){
        marks = new int[3];
        System.out.println("constructor is called...");
    }
    Student(String name){
        marks = new int[3];
        this.name = name;
    }
    Student(int roll){
        marks = new int[3];
        this.roll = roll;
    }
}*/

//Shallow & Deep Copy
/*public class javaOops{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "amisha";
        s1.roll = 456;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);   //copy
        s2.password = "xyz";
        s1.marks[2] = 100;
        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class Student{
    String name;
    int roll;
    String password;
    int marks[];

    //shallow copy constructor
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

    //deep copy constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0; i<marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    }

    Student(){
        marks = new int[3];
        System.out.println("constructor is called...");
    }
    Student(String name){
        marks = new int[3];
        this.name = name;
    }
    Student(int roll){
        marks = new int[3];
        this.roll = roll;
    }
}*/

//Inheritance
//Also this is an example of single level inheritance
/*public class javaOops{
    public static void main(String args[]){
        Fish shark = new Fish();
        shark.eat();
    }
}

//base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

//derived class
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swims in water");
    }
}*/

//Multi level inheritance
/*public class javaOops{
    public static void main(String args[]){
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
    }
}

class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

class Mammal extends Animal{
    int legs;
}

class Dog extends Mammal{
    String breed;
}*/

//Hierarchial inheritance
/*public class javaOops{
    public static void main(String args[]){
        Mammal dog = new Mammal();
        dog.eat();
        Bird sparrow = new Bird();
        sparrow.breathe();
    }
}

class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}

class Mammal extends Animal{
    void walk(){
        System.out.println("walks");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("swims");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}*/

//Method Overloading - Compile Time Polymorphism
/*public class javaOops{
    public static void main(String args[]){
        Calculator calc = new Calculator();
        System.out.println(calc.sum(1, 2));
        System.out.println(calc.sum((float)1.5, (float)2.5));
        System.out.println(calc.sum(1, 2, 3));
    }
}

class Calculator{
    int sum(int a, int b){
        return a + b;
    }

    float sum(float a, float b){
        return a + b;
    }

    int sum(int a, int b, int c){
        return a + b + c;
    }
}*/

//Method Overriding - Run Time Polymorphism
/*public class javaOops{
    public static void main(String args[]){
        Deer d = new Deer();
        d.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("eats anything");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}*/

//Packages in Java - In-built package
/*import java.util.*;
public class javaOops{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a);
    }
}*/

//Abstraction
//Abstract Class
/*public class javaOops{
    public static void main(String args[]){
        // Horse h = new Horse();
        // h.eat();
        // h.walk();

        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();

        // System.out.println(h.color);

        Mustang myHorse = new Mustang();
        //Animal -> Horse -> Mustang
    }
}

abstract class Animal{       //abstract class
    String color;

    Animal(){                  //constructor
        //color = "brown";
        System.out.println("animal constructor called");
    }
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();         //abstract method
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called");
    }
    void changeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called");
    }
}

class Chicken extends Animal{
    void changeColor(){
        color = "yellow";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}*/

//Interfaces
/*public class javaOops{
    public static void main(String args[]){
        Queen q = new Queen();
        q.moves();
    }
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal (in all four directions)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagoanl (by 1 step)");
    }
}*/

//Multiple inheritance
/*public class javaOops{
    public static void main(String args[]){
        Bear bhaloo = new Bear();
        bhaloo.eat();
    }
}

interface Herbivore{
    void eat();
}

interface Carnivore{
    void eat();
}

class Bear implements Herbivore, Carnivore{
    public void eat(){
        System.out.println("eats grass and meat");
    }
}*/

//Static keyword
/*public class javaOops{
    public static void main(String args[]){
        Student s1= new Student();
        s1.schoolName = "JMV";

        Student s2 = new Student();
        System.out.println(s2.schoolName);
    }
}

class Student{
    String name;
    int roll;

    static String schoolName;

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }
}*/

//Super keyword
/*public class javaOops{
    public static void main(String args[]){
        Horse h = new Horse();
        System.out.println(h.color);
    }
}

class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor is called");
    }
}

class Horse extends Animal{
    Horse(){
        super.color = "brown";
        //super();          //super keyword se horse me animal ka constructor bhi call hota he
        System.out.println("Horse constructor is called");
    }
}*/

//Practice Question 5
//What will be the output
/*public class javaOops{
    public static void main(String args[]){
        Vehicle obj1 = new Car();
        obj1.print();

        Vehicle obj2 = new Vehicle();
        obj2.print();
    }
}

class Vehicle{
    void print(){
        System.out.println("Base class(Vehicle)");
    }
}
class Car extends Vehicle{
    void print(){
        System.out.println("Derived class(Car)");
    }
}*/

//Practice Question 6
//What will be the output == error
/*public class javaOops{
    public static void main(String args[]){
        Vehicle obj1 = new Car();
        obj1.print1();    //this will give an error as print1 is car class property 

        Vehicle obj2 = new Vehicle();
        obj2.print();
    }
}

class Vehicle{
    void print(){
        System.out.println("Base class(Vehicle)");
    }
}
class Car extends Vehicle{
    void print1(){
        System.out.println("Derived class(Car)");
    }
}*/

//Practice Question 8 
//What will be the output == 0 2
/*class Book{
    int price;
    static int count;

    public Book(int price){
        this.price = price;
        count++;
    }
}

public class javaOops{
    public static void main(String args[]){
        System.out.println(Book.count);  //at first count will initialize to zero
        Book b1 = new Book(150);
        Book b2 = new Book(250);
        System.out.println(Book.count);  //after updation it increments by two
    }
}*/

//Practice Question 9
//Which line has error == no error
/*class Test{
    static int marks;
    void set_marks(int marks){
        this.marks = marks;       //line 1
    }
}

public class javaOops{
    public static void main(String args[]){
        Test t = new Test();
        t.set_marks(98);      //line 2
        System.out.print(Test.marks);     //line 3
    }
}*/

//Practice Question 10
//What will be the output == 40
/*class Test{
    static int a = 10;
    static int b;
    static void changeB(){
        b = a * 3;
    }
}
public class javaOops{
    public static void main(String args[]){
        Test t = new Test();
        t.changeB();
        System.out.println(Test.a + Test.b); 
    }
}*/

//Assignment
//Question-1: Print the sum, difference & product of two complex no.s by creating a class named "Complex" with          
//separate methods for each operation whose real and imaginary parts are entered by the user
/*import java.util.*;
class Complex{
    int real;
    int imag;
    public Complex(int r, int i){
        real = r;
        imag = i;
    }
    public static Complex add(Complex a, Complex b){
        return new Complex((a.real+b.real), (a.imag+b.imag));
    }
    public static Complex diff(Complex a, Complex b){
        return new Complex((a.real-b.real), (a.imag-b.imag));
    }
    public static Complex product(Complex a, Complex b){
        return new Complex(((a.real*b.real)-(a.imag*b.imag)), ((a.real*b.imag)+(a.imag*b.real)));
    }
    public void printComplex(){
        if(real==0 && imag!=0){
            System.out.println(imag+"i");
        }
        else if(imag==0 && real!=0){
            System.out.println(real);
        }
        else{
            System.out.println(real+"+"+imag+"i");
        }
    }
}
class javaOops{
    public static void main(String args[]){
        Complex c = new Complex(4, 5);
        Complex d = new Complex(9, 4);

        Complex e = Complex.add(c, d);
        Complex f = Complex.diff(c, d);
        Complex g = Complex.product(c, d);
        e.printComplex();
        f.printComplex();
        g.printComplex();
    }
}*/
//Question-2: What is the output of the following program
/*class Automobile{
    private String drive(){
        return "Driving vehicle";
    }
}
class Car extends Automobile{
    protected String drive(){
        return "Driving car";
    }
}
public class javaOops extends Car{     //instead javaOops() used ElectricCar()
    @Override
    public final String drive(){
        return "Driving electric car";
    }
    public static void main(String wheels[]){
        final Car car = new javaOops();             //instead javaOops() used ElectricCar()
        System.out.print(car.drive());
    }
}*/
//Question-4: What is the output of the following program
abstract class Car{
    static{
        System.out.print("1");
    }
    public Car(String name){
        super();
        System.out.print("2");
    }
    {
        System.out.print("3");
    }
}
public class javaOops extends Car{
    {
        System.out.print("4");
    }
    public javaOops(){
        super("blue");
        System.out.print("5");
    }
    public static void main(String gears[]){
        new javaOops();
    }
}