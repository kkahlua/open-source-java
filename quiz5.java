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
		name = "ȫ�浿";
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
		System.out.println("������������~~");
	}
	public void receiveCall() {
		System.out.println("��ȭ �Ծ��.");
	}
	public void sendSMS() {
		System.out.println("���ڰ��ϴ�.");
	}
	public void receiveSMS() {
		System.out.println("���ڿԾ��.");
	}
	public void play() {
		System.out.println("���� �����մϴ�.");
	}
	public void stop() {
		System.out.println("���� �ߴ��մϴ�.");
	}
	public void schedule() {
		System.out.println("���� �����մϴ�.");
	}
}
class SamsungPhone implements PhoneInterface{
	public void sendCall() {
		System.out.println("�츮������");
		}
	public void receiveCall() {
		System.out.println("��ȭ�� �Խ��ϴ�.");
	}
	public void flash() {
		System.out.println("��ȭ�⿡ ���� �������ϴ�.");
	}
}
/*
// ���� 5-1
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
//���� 5-2
public class quiz5 {
	public static void main(String[] args) {
		Student s = new Student();
		s.set();
	}
}
*/
/*
//���� 5-3
public class quiz5{
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5,6,"blue");
		cp.showColorPoint();
	}
}
*/
/*
//���� 5-4
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
//���� 5-5
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
//���� 5-6
public class quiz5{
	public static void main(String[] args) {
		Weapon weapon;
		weapon = new Weapon();
		System.out.println("�⺻ ������ ��� �ɷ��� "+weapon.fire());
		weapon = new Cannon();
		System.out.println("������ ��� �ɷ��� "+weapon.fire());
	}
}
*/
/*
//����5-7
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
//���� 5-8
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
//���� 5-9
public class quiz5{
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		phone.printLogo();
		phone.sendCall();
		phone.play();
		System.out.println("3�� 5�� ���ϸ�"+phone.calculate(3, 5));
		phone.schedule();
	}
}
*/