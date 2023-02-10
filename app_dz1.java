/**
 * app_dz1
 */
public class app_dz1 {

    public static void main(String[] args) {

        System.out.println(GetTriangleNum(3));

    }

    public static int GetTriangleNum(int n) {
        return n * (n + 1) / 2;
    }
}