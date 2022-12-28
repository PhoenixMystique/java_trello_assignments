package task6;

public class Complex {
    double real;
    double imaginary;

    public Complex() {
        real = 0;
        imaginary = 0;
    }

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex complex) {
        double real = this.real + complex.real;
        double imaginary = this.imaginary + complex.imaginary;
        return new Complex(real, imaginary);
    }

    public Complex subtract(Complex complex) {
        double real = this.real - complex.real;
        double imaginary = this.imaginary - complex.imaginary;
        return new Complex(real, imaginary);
    }

    public Complex multiply(Complex complex) {
        double real = (this.real * complex.real) - (this.imaginary * complex.imaginary);
        double imaginary = (this.real * complex.imaginary) + (this.imaginary * complex.real);
        return new Complex(real, imaginary);
    }

    public String toString() {
        return real + " + " + imaginary + "i";
    }

    public static void main(String[] args) {
        Complex complex1 = new Complex(1, 1);
        Complex complex2 = new Complex(2, 3);
        System.out.println(complex1.add(complex2));
        System.out.println(complex1.subtract(complex2));
        System.out.println(complex1.multiply(complex2));
    }
}
