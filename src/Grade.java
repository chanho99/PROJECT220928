import java.util.Scanner;

class Grades {
    private int math;
    private int science;
    private int english;

    public Grades(int math, int science, int english){
        this.math = math;
        this.science = science;
        this.english = english;
    }
    public int avg(){
        return (math + science + english) / 3;
    }
}

public class Grade {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
        int math = sc.nextInt();
        int science = sc.nextInt();
        int english = sc.nextInt();
        Grades me = new Grades(math, science, english);

        System.out.println("평균은" + me.avg());

        sc.close();
    }
}
