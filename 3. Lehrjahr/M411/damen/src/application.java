public class application {

    public static void main(String[] args) {
        int size = 8;
        DameProblem solve = new DameProblem(size);

        System.out.println("Start");

        if (solve.setQueen(0)) {
            for(int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if(solve.getBoard()[i][j] == 1) {
                        System.out.print("Q ");
                    } else {
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
        }
    }
}
