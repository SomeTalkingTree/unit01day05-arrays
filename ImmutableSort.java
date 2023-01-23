// TODO: propose 5 more descriptive variable names to replace num, num2, num3, list, and lis
public class ImmutableSort {
    public static void main(String[] args) {
        int[] a = {6, 2, 1};
        int a1 =a[0];
        int a2 =a[1];
        int a3 = a[2];

        int placeholder =0;
        int placeholder1 = 0;
        if(a1>a2){
            placeholder = a1;
            placeholder1 =a2;
            a1 = placeholder1;
            a2 = placeholder;
        }
        if(a1>a3){
            placeholder = a1;
            placeholder1 =a3;
            a1 = placeholder1;
            a3 = placeholder; 
        }
        if(a2>a3){
            placeholder = a2;
            placeholder1 =a3;
            a2 = placeholder1;
            a3 = placeholder; 
        }
        int[] b = {a1,a2,a3};
        System.out.println("Answer is "+b[0]+" "+b[1]+" "+b[2]);
        System.out.println("From the list of "+a[0]+" "+a[1]+" "+a[2]);
    }
}
//javac ImmutableSort.java; java ImmutableSort