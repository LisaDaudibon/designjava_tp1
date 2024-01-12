//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int pair() {
        int sum = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int result = pair();
        System.out.printf("Le résultat de la somme des pairs entre %s et %s inclus est de %s", 0, 100, result);
    }
}