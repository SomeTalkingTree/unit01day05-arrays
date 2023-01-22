// good
public class MutableSort {
    public static void main(String[] args) {
        int[] a = {15, 20, 8};
        int num =a[0];
        int num2 =a[1];
        int num3 = a[2];

        int list =0;
        int lis = 0;
        if(num>num2){
            list = num;
            lis =num2;
            num = lis;
            num2 = list;
        }
        if(num>num3){
            list = num;
            lis =num3;
            num = lis;
            num3 = list; 
        }
        if(num2>num3){
            list = num2;
            lis =num3;
            num2 = lis;
            num3 = list; 
        }
        
        a[0] = num;
        a[1] = num2;
        a[2] = num3;
        System.out.println("Answer is "+a[0]+" "+a[1]+" "+a[2]);
    }
}
//javac MutableSort.java; java MutableSort