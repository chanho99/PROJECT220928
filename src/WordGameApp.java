import java.util.Scanner;

class Player{
    String name;
    String getWordFromUser(){
        Scanner sc = new Scanner (System.in);
        String word = sc.next();
        return word;
    }
    void check(char lastChar, char firstChar){
        if(lastChar != firstChar){
            System.out.print(name + "이 졌습니다.");
            System.exit(0);
        }
    }
}

public class WordGameApp {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("끝말잇기 게임을 시작합니다...");
        System.out.print("게임에 참가하는 인원은 몇명입니까>>");
        int num = sc.nextInt();
        Player player[] = new Player[num];

        for(int i=0 ; i<num ; i++){
            player[i] = new Player();
        }
        for(int i=0 ; i<num ; i++){
            System.out.print("참가자의 이름을 입력하세요>>");
            player[i].name = sc.next();
        }

        System.out.println("시작하는 단어는 아버지입니다");
        String word = "아버지";
        int lastIndex = word.length() - 1;
        char lastChar = word.charAt(lastIndex);
        char firstChar = word.charAt(0);

        for(int i =0 ; i<num ; i++){
            System.out.print(player[i].name + ">>");
            word = player[i].getWordFromUser();
            firstChar = word.charAt(0);
            player[i].check(lastChar, firstChar);
            if (i == num - 1){
                i =- 1;
            }
            lastIndex = word.length() - 1;
            lastChar = word.charAt(lastIndex);
        }
    }
}
