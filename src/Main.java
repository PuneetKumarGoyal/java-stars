import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        Main m = new Main();
        //Task 1
        System.out.println(m.getTwoToPowerNAsterisk(1));
    }

    public String getTwoToPowerNAsterisk(int n) {

        if (n < 0) throw new IllegalArgumentException();
        if (n == 0) return "*";

        return IntStream.range(1,
                IntStream.range(1, n + 1)
                        .map(x -> 2)
                        .reduce((left, right) -> left * right)
                        .getAsInt() + 1
        ).boxed().map(x -> "*")
                .reduce((left, right) -> left + right)
                .get();

    }
}
