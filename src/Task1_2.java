public class Task1_2 {
    public static void main(String[] args) {
    int[] a;
    a = new int[10];
    int n = 7;
    int sum = 0;
    for (int x = 2; x < a.length; x += 1) {
        a[0] = 0;
        a[1] = 1;
        a[x] = a[x-1] + a[x-2];
    }
    for (int x = 0; x < a.length; x += 1) {
        if (x == n) {
            break;
        }
        if (a[x] % 2 == 0) {
            sum = sum + a[x];
        }
    }
    System.out.println("Сумма чётных чисел до n = " + sum);
}
}
