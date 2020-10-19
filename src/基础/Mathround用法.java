package 基础;
public class Mathround用法 {
    public static void main(String[] args) {
        int a=10000;
        System.out.println("本金："+a);
        double b=a+a*0.0035;//活期一年
        double c=a+a*0.0035*2;//活期两年
        double d=a+a*0.015;//定期一年
        double e=a+a*0.021*2;//定期两年
        System.out.println("活期1年本金总计："+Math.round(b));
        System.out.println("定期1年本金总计："+Math.round(d));
        System.out.println("活期2年本金总计："+Math.round(c));
        System.out.println("定期2年本金总计："+Math.round(e));
    }
}
