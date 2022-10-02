public class Main {
    public static void main(String[] args) {
       int n = 1;
       int m = 2;
       int p = 3;
       int k = 1;
       int sum = 0;
       int[] a = {m, p, k};
       for (int x = 0; x < a.length; x += 1) {
          if (a[x] == n) {
               continue;
          }
           sum = sum + a[x];
       }
        System.out.println("sum of array = " + sum);
    }
}

