public class Circle2 {
    int r;
    String n;

    public Circle2(){
        r = 1; n = "";
    }

    public Circle2(int r, String n){
        this.r = r; this.n = n;
    }

    double getArea(){
        return 3.14 * r * r;
    }

    public static void main(String args[]){
        Circle2 pizza = new Circle2(10, "자바피자");
        double area = pizza.getArea();
        System.out.println("자바피자의 면적은 " + area);

        Circle2 donut = new Circle2();
        donut.n = "도넛피자";
        area = donut.getArea();
        System.out.println("도넛피자의 면적은 " + area);
    }
}
