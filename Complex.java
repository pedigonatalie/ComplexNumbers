// Natalie Pedigo
// CS2336.504
// 10/29/2022
// Belkoura
//
// Create a Complex class that 
// is able to add, subtract, multiply, divide, 
// and find the absolute value of a complex number.

public class Complex implements Cloneable, Comparable<Complex>{

	// two double variables that represent the real and
	// imaginary parts of a complex number
	private double x, y;
	
	// constructor for complex number with format a+bi
	public Complex(double a, double b) {
		x = a;
		y = b;
	}
	
	// constructor for complex number with format a+0i
	public Complex(double a) {
		x = a;
		y = 0;
	}
	
	// constructor for complex number with format 0+0i
	public Complex() {
		x = 0;
		y = 0;
	}
	
	// returns the real part of the complex number
	public double getRealPart() {
		return x;
	}
	
	// returns the imaginary part of the complex number
	public double getimaginaryPart() {
		return y;
	}

	// adds two complex numbers, returns new complex number
	public Complex add(Complex other) {
		return new Complex(x + other.x, y + other.y);
	}
	
	// subtracts two complex numbers, returns new complex number
	public Complex subtract(Complex other) {
		return new Complex(x - other.x, y - other.y);
	}
	
	// multiplies two complex numbers, returns new complex number
	// formula for new imaginary and real parts were derived independently
	public Complex multiply(Complex other) {
		double new_x, new_y;
		new_x = ((this.x*other.x)+(this.y*other.y*-1));
		new_y = ((this.x*other.y)+(this.y*other.x));
		return new Complex(new_x, new_y);
	}
	
	// divides two complex numbers, returns new complex number
	// formula for new imaginary and real parts were derived independently
	public Complex divide(Complex other) {
		double new_x, new_y;
		double denominator = ((other.x*other.x)-(other.y*other.y*-1));
		new_x = (((this.x*other.x)-(this.y*other.y*-1))/denominator);
		new_y = (((-1*this.x*other.y)+(this.y*other.x))/denominator);
		return new Complex(new_x, new_y);
	}
	
	// returns the absolute value of a complex number
	public double abs() {
		double absValue = Math.sqrt(x*x + y*y);
		return absValue;
	}
	
	// returns a complex number in the format (a+bi)
	public String toString(){
		return "("+x + " + " + y + "i)";
	}

	// implements clonable
	public Complex clone(){
		return new Complex(x,y);
	}

	// implements comparable however I have not been able to figure this out yet
	@Override
	public int compareTo(Complex o) {

		return 0;
	} 

	
}
