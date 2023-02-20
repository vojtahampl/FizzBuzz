public class Main {
    public static void main(String[] args) {
        //pro cyklus s opakováním 100, kdy je přičítána hodnota 1 od 1 do 1OO
        for (int i = 1; i <= 100; i++) {
            //je v případě, že je hodnota z cyklu dělitelná třemi i 5, je vypsána hodnota FIZZBUZZ
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FIZZBUZZ");
            }
            //je v případě, že je hodnota z cyklu dělitelná třemi, je vypsána hodnota FIZZ
            else if (i % 3 == 0) {
                System.out.println("FIZZ");
            }
            //je v případě, že je hodnota z cyklu dělitelná pěti, je vypsána hodnota BUZZ
            else if (i % 5 == 0) {
                System.out.println("BUZZ");
            } else {
                System.out.println(i);
            }
        }
    }
}