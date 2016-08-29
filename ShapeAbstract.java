abstract class Shape{
protected String color;
protected boolean filled;
public Shape(){}
public Shape(String color, boolean filled){
	this.color=color;
	this.filled=filled;
}
public String getColor(){
	return color;
}
public void setColor(String color){
	this.color=color;
}
public boolean isFilled(){
	return filled;
}
public void setFilled(boolean filled){
	this.filled=filled;
}
public abstract double getArea();
public abstract double getPerimeter();
public abstract String toString();

}
class Circle extends Shape{
	protected double radius;
	public Circle(){}
	public Circle(double radius){
		this.radius=radius;
	}
	public Circle(double radius,String color,boolean filled){
		super(color,filled);
		this.radius=radius;
	}
	public double getArea(){
		return 3.14 * radius * radius;
	}
	public double getPerimeter(){
		return 2.0 * 3.14 * radius;
	}
	public String toString(){
		return "circle";
	}
	
}
class Rectangle extends Shape{
	protected double width;
	protected double length;
	public Rectangle(){}
	Public Rectangle(double width,double length){
		this.width=width;
		this.length=length;
	}
	Public Rectangle(double width,double length,String color,boolean filled){
		super(color,filled);
		this.width=width;
		this.length=length;
		
	}
	public double getWidth(){
		return width;
	}
	public setWidth(double width){
		this.width=width;
	}
	public double getLength(){
		return length;
	}
	public void setLength(double length){
		this.length=length;
	}	
	public double getArea(){
		return radius * radius;
	}
	public double getPerimeter(){
		return 2.0 * (width +length);
	}
	public String toString(){
		return "rectangle";
	}
	
}
class Square extends Rectangle{
	public Square(){}
	public Square(double side){
		super(side,side);
	}
	public Square(double side,String color,boolean filled){
		super(side,side);
		this.color=color;
		this.filled=filled;
	}
	public getSide(){
		return length;
	}
	public setSide(double side){
		this.length=side;
		this.width=side;
	}
	public double getArea(){
		return length * width;
	}
	public double getPerimeter(){
		return 2.0 * (width +length);
	}
	public String toString(){
		return "square";
	}
	
}



















