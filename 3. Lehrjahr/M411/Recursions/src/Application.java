public class Application {
    public static void main(String[] args) {
        String[] randomArr = new String[]{"o","o","o","o","o","o","o","o","x","o","o","o","o"};
        int n = 0;
        findX(randomArr, n);

        int money = 100;
    }

    private static void findX(String[] randomArr, int n) {
        if(randomArr[n].equals("x")) {
            System.out.printf("Found x at position: %d", (n + 1));
            return;
        }
        findX(randomArr, n + 1);
    }
}
