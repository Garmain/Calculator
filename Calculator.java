public class Calculator {

private double a;
private double b;

public Calculator(){
    this.a = 0;
    this.b = 0;

}
public Calculator(double a, double b){
    this.a = a;
    this.b = b;
}
public double sl(){
    return a + b;
}

public double vs(){
    return a - b;
}

public double ym(){
    return a * b;
}

public double rt(){
    return a / b;
}



    }
