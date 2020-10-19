package If条件;

import java.util.Scanner;

public class N01 {
    public static void main(String[] args) {
        for (int num=0;num<500;num++){
        Scanner input=new Scanner(System.in);
        /*System.out.print("请输入你的JAVA成绩：");
        int score= input.nextInt();
        System.out.print("请输入你的音乐成绩：");
        int music = input.nextInt();
        if ((score>90 && music>80)||(score>70 && music>90)){
            System.out.println("\n你他妈的真流弊");
        }else {
            System.out.println("\n你真他妈的垃圾");
        }*/



        System.out.println("\n请输入年龄");

       num= input.nextInt();

        if (num>=100 && num<=250){
            System.out.println("🍆：住在山里面真不错");
        }else if(num>1 && num<85){
            System.out.println("我曾踏足山巅，也曾跌入谷底，二者使我受益良多");
        }else{
            System.out.println("优雅，从不过时");
            break;
        }

        }
    }
}