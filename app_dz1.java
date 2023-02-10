import java.util.Scanner;

/**
 * app_dz1
 */
public class app_dz1 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int num = getNumberByUser("Введите номер искомого треугольного числа: ");
        System.out.printf("Треугольное число номер %d равно %d.\n", num, GetTriangleNum(num));

    }
    
    public static int GetTriangleNum(int n) {
        return n * (n + 1) / 2;
    }

    public static int getNumberByUser(String text) {
        System.out.print(text);
        return input.nextInt();
    }
}