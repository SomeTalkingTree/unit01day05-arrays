public class ThreeArrayRange {
    public static void main(String[] args) {
        int[] a = {5, 7, 9};
        int num = a[0];
        int less = a[0];
        if(num<a[1]){
            num = a[1];
        }
        if(num<a[2]){
            num=a[2];
        }
        if(less>a[1]){
            less = a[1];
        }
        if(less>a[2]){
            less = a[2];
        }
        int ans = num-less;
        System.out.println(ans);
    }
}
//javac ThreeArrayRange.java;java ThreeArrayRange