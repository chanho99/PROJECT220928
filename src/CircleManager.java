import java.util.Scanner;

class Circles{
    private double x, y;
    private int radius;
    public Circles(double x, double y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public void show() {
        System.out.println("("+x+","+y+")"+radius);
    }
    public int getR() {
        return radius;
    }
}

public class CircleManager {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Circles c[] = new Circles[3];
        for(int i=0; i<c.length; i++) {
            System.out.print("x, y, radius >>");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            int radius = scanner.nextInt();
            c[i] = new Circles(x, y, radius);
        }

        int tmp = 0;
        for(int i=1; i<c.length; i++)
        {
            if(c[tmp].getR() < c[i].getR())
                tmp = i;
        }

        System.out.print("가장 면적이 큰 원은 ");
        c[tmp].show();
        scanner.close();
    }
}