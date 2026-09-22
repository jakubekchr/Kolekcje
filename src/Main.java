import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> liczby = new ArrayList<>();
        for (int i = 200; i < 301; i = i+2) {
            liczby.add(i);

        }
        System.out.println(liczby);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj szukana liczbe");
        int ls = scanner.nextInt();

        for (int i = 0; i < liczby.size(); i++) {
            if (liczby.get(i).equals(ls)){
                System.out.println("Wynosi " + i);
            }
        }
    }
}