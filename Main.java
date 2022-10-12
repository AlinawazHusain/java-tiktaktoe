import java.math.*;
import java.util.*;
public class Main {
    public static void play(char a[],int r,int s) {

        //designing the board
        System.out.println("====TIK TAK TOE===");
        System.out.println("     |     |     ");
        System.out.println("  " + a[1] + "  |  " + a[2] + "  |  " + a[3] + "  ");
        System.out.println("-----|-----|-----");
        System.out.println("     |     |     ");
        System.out.println("  " + a[4] + "  |  " + a[5] + "  |  " + a[6] + "  ");
        System.out.println("-----|-----|-----");
        System.out.println("     |     |     ");
        System.out.println("  " + a[7] + "  |  " + a[8] + "  |  " + a[9] + "  ");
        System.out.println("     |     |     ");

        checkConditions(a,r,s);
    }

    public static int end(){
        System.out.println("game over");
        return 0;
    }

    public static void choice(char a[],int r,int s) {
        Scanner sc = new Scanner(System.in);
        if(s>9 || r==1){
            end();
        }

        //player 1 input
        if(s%2!=0) {
            System.out.println("enter the index for inserting 0");
            int ch = sc.nextInt();
            a[ch] = '0';
            play(a,r,s);
        }

        else if (s%2==0) {


            //player 2 input
            System.out.println("enter the index for inserting X ");
             int ch = sc.nextInt();
            a[ch] = 'X';
            play(a,r,s);
        }
    }

    public static void checkConditions(char a[],int r,int s) {
        //winner condition
        if (a[1] =='0'&& a[2]=='0' && a[1] =='0' && a[3]=='0' || a[1] =='X'&& a[2]=='X' && a[1] =='X' && a[3]=='X') {
            System.out.println("winner is " + a[1]);
            r=1;
            end();
        } else if (a[1]=='0'&& a[4]=='0' && a[1] =='0' && a[7]=='0' || a[1]=='X'&& a[4]=='X' && a[1] =='X' && a[7]=='X') {
            System.out.println("winner is " + a[1]);
            r=1;
            end();
        } else if (a[5] =='0' &&a[2]=='0' && a[5] =='0' && a[8]=='0' || a[5] =='X' &&a[2]=='X' && a[5] =='X' && a[8]=='X') {
            System.out.println("winner is " + a[1]);
            r=1;
            end();
        } else if (a[3] =='0' &&a[6]=='0' && a[9] =='0' && a[3]=='0' || a[3] =='X' &&a[6]=='X' && a[9] =='X' && a[3]=='X') {
            System.out.println("winner is " + a[6]);
            r=1;
            end();
        } else if (a[4] =='0' && a[5]=='0'  && a[4] =='0' && a[6]=='0' || a[4] =='X' && a[5]=='X'  && a[4] =='X' && a[6]=='X' ) {
            System.out.println("winner is " + a[5]);
            r=1;
            end();
        } else if (a[7] =='0' && a[8]=='0'  && a[8] =='0' && a[9]=='0' || a[7] =='X' && a[8]=='X'  && a[8] =='X' && a[9]=='X') {
            System.out.println("winner is " + a[8]);
            r=1;
            end();
        } else if (a[1] =='0' && a[5]=='0' && a[5] =='0' && a[9]=='0'  || a[1] =='X' && a[5]=='X'  && a[5] =='X' && a[9]=='X') {
            System.out.println("winner is " + a[5]);
            r=1;
            end();
        } else if (a[7] =='0' && a[5]=='0'  && a[5] =='0' && a[3]=='0' || a[7] =='X' && a[5]=='X'  && a[5] =='X' && a[3]=='X') {
            System.out.println("winner is " + a[5]);
            r=1;
            end();
        } else {
            if(r==0) {
                s = s + 1;
                choice(a, r, s);
            }

        }
    }


    public static void main(String[] args) {
        int r=0;
        int s=1;
        char a[] = new char[10];
        play(a,r,s);

    }
}