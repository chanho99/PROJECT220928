import java.util.Scanner;

class Rectangle3{
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle3(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int square() {
        return width*height;
    }

    public void show() {
        System.out.println("("+x+","+y+")에서 크기가 "+width+"x"+height+"인 사각형");
    }

    public boolean contains(Rectangle3 r) {
        if((this.x<r.x) && (this.y<r.y) && (this.x+this.width)>(r.x+r.width) && (this.y+this.height)>(r.y+r.height))
            return true;
        else
            return false;
    }
}

public class Rectangle2 {
    public static void main(String args[]) {
        Rectangle3 r = new Rectangle3(2, 2, 8, 7);
        Rectangle3 s = new Rectangle3(5, 5, 6, 6);
        Rectangle3 t = new Rectangle3(1, 1, 10, 10);

        r.show();
        System.out.println("의 면적은 "+s.square());
        if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
        if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
    }
}
