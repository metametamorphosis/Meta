public class Main {
    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4,5));
    }

    private static long sum(int ... values) {
        long sum = 0;
        for (int i : values) {
            sum += i;
        }
        return sum;
    }
}