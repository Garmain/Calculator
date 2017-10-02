import java.util.Scanner;

public class Read {
    public double readNextDouble(){

        Scanner sc = new Scanner(System.in);
        double i = 0;
        if(sc.hasNextDouble()){
            i = sc.nextDouble();
        }
        else{
            System.out.println("Вы ввели не целое число");

        }
           return i;
    }
}
