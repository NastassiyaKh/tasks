public class Task1_3 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        for (int x = 0, y = a.length - 1, z; x < a.length / 2; x += 1) {
            z = a[x];
            a[x] = a[y];
            a[y] = z;
            y -= 1;
        }
        for (int x = 0; x < a.length; x += 1) {
            System.out.print(a[x]);
        }
    }
}