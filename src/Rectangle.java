import java.util.Scanner;

public class Rectangle {
    int w, h;

    public int getArea(){
        return w * h;
    }

    public static void main(String args[]){
        Rectangle rect = new Rectangle();
        Scanner sc = new Scanner(System.in);
        System.out.print(">> ");

        rect.w = sc.nextInt();
        rect.h = sc.nextInt();

        System.out.print("사각형의 면적은 " + rect.getArea());

        sc.close();
    }
}
