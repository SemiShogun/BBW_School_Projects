public class Recursion {

    public int function(int v) {
        if (v == 1) {
            return 1;
        } else {
            System.out.println(v);
            return function(v-1) * v;
        }
    }
}
