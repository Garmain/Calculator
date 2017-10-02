public class Main {
    public static void main(String[] args) {

        Read read = new Read();
        double one;
        double two;
        int action;

        do {
            System.out.print("Введите первое число: ");
            one = read.readNextDouble();
            System.out.print("Введите второе число: ");
            two = read.readNextDouble();

            Calculator calculator = new Calculator(one, two);

            System.out.println("Выберите действие: ");
            System.out.println("1. Сложить: ");
            System.out.println("2. Вычесть: ");
            System.out.println("3. Умножить: ");
            System.out.println("4. Разделить: ");
            System.out.println("0. Выход: ");


            action = (int) read.readNextDouble();

            switch (action) {
                case 1:
                    System.out.println(calculator.sl());
                    break;
                case 2:
                    System.out.println(calculator.vs());
                    break;
                case 3:
                    System.out.println(calculator.ym());
                    break;
                case 4:
                    System.out.println(calculator.rt());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Возникла ошибка");
            }
        } while (action != 0);

    }

}
