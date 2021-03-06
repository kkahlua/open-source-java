package hellojava;


class Point {
	private int x, y;

	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public Point() {}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColorPoint extends Point {
	private String color;
	public ColorPoint() {}
	public ColorPoint(int x,int y, String color) {
		super(x,y);
		this.color=color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}
class Person {
	private int weight;
	int age;
	protected int height;
	public String name;
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getWeight() {
		return weight;
	}
}

class Student extends Person {
	public void set() {
		age = 30;
		name = "홍길동";
		height = 175;
		// weight=99;
		setWeight(99);
	}
}
class Shape{
	public Shape next;
	public Shape() {next= null;}
	
	public void draw() {
		System.out.println("Shape");
	}
}
class Line extends Shape{
	public void draw() {
		System.out.println("Line");
	}
}
class Rect extends Shape{
	public void draw() {
		System.out.println("Rect");
	}
}
class Circle extends Shape{
	public void draw() {
		System.out.println("Circle");
	}
}
class Weapon{
	protected int fire() {
		return 1;
	}
}
class Cannon extends Weapon{
	protected int fire() {
		return 10;
	}
}
abstract class Calculator{
	public abstract int add(int a, int b);
	public abstract int subtract(int a, int b);
	public abstract double average(int[] a);
}
interface PhoneInterface{
	final int TIMEOUT = 10000;
	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("**Phone**");
	}
}
interface MobilePhoneInterface extends PhoneInterface{
	void sendSMS();
	void receiveSMS();
}
interface MP3Interface{
	public void play();
	public void stop();
}
class PDA{
	public int calculate(int x, int y) {
		return x+y;
	}
}
class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface{
	public void sendCall() {
		System.out.println("따르릉따르릉~~");
	}
	public void receiveCall() {
		System.out.println("전화 왔어요.");
	}
	public void sendSMS() {
		System.out.println("문자갑니다.");
	}
	public void receiveSMS() {
		System.out.println("문자왔어요.");
	}
	public void play() {
		System.out.println("음악 연주합니다.");
	}
	public void stop() {
		System.out.println("음악 중단합니다.");
	}
	public void schedule() {
		System.out.println("일정 관리합니다.");
	}
}
class SamsungPhone implements PhoneInterface{
	public void sendCall() {
		System.out.println("띠리리리링");
		}
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
	}
	public void flash() {
		System.out.println("전화기에 불이 켜졌습니다.");
	}
}
/*
// 예제 5-1
public class quiz5 {               
	public static void main(String[] args) {
		Point p = new Point();
		p.set(1, 2);
		p.showPoint();

		ColorPoint cp = new ColorPoint();
		cp.set(3, 4);
		cp.setColor("red");
		cp.showColorPoint();
	}
}
*/
/*
//예제 5-2
public class quiz5 {
	public static void main(String[] args) {
		Student s = new Student();
		s.set();
	}
}
*/
/*
//예제 5-3
public class quiz5{
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5,6,"blue");
		cp.showColorPoint();
	}
}
*/
/*
//예제 5-4
class Researcher extends Person{}
class Professor extends Researcher{}
public class quiz5{
	static void print(Person p) {
		if(p instanceof Person)
			System.out.print("Person ");
		if(p instanceof Student)
			System.out.print("Student ");
		if(p instanceof Researcher)
			System.out.print("Researcher ");
		if(p instanceof Professor)
			System.out.print("Professor ");
		System.out.println();
	}
	public static void main(String[] args) {
		System.out.print("new Student() ->\t"); print(new Student());
		System.out.print("new Researcher() ->\t"); print(new Researcher());
		System.out.print("new Professor() ->\t"); print(new Professor());
	}
}
*/
/*
//예제 5-5
public class quiz5{
	static void paint(Shape p) {
		p.draw();
	}
	
	public static void main(String[] args) {
		Line line = new Line();
		paint(line);
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
	}
}
*/
/*
//예제 5-6
public class quiz5{
	public static void main(String[] args) {
		Weapon weapon;
		weapon = new Weapon();
		System.out.println("기본 무기의 살상 능력은 "+weapon.fire());
		weapon = new Cannon();
		System.out.println("대포의 살상 능력은 "+weapon.fire());
	}
}
*/
/*
//예제5-7
public class quiz5 extends Calculator{
	public int add(int a, int b) {
		return a+b;
	}
	public int subtract(int a, int b) {
		return a-b;
	}
	public double average(int[] a) {
		double sum = 0;
		for(int i=0;i<a.length;i++)
			sum+= a[i];
		return sum/a.length;
	}
	public static void main(String[] args)
	{
		quiz5 c = new quiz5();
		System.out.println(c.add(2,3));
		System.out.println(c.subtract(2,3));
		System.out.println(c.average(new int[] {2,3,4}));
	}
}
*/
/*
//예제 5-8
public class quiz5{
	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
	}
}
*/
/*
//예제 5-9
public class quiz5{
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.printLogo();
		phone.sendCall();
		phone.play();
		System.out.println("3과 5를 더하면"+phone.calculate(3, 5));
		phone.schedule();
	}
}
*/