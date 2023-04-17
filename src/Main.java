public class Main {

    public static void main(String[] args) {


        Sabiranje sabiranje = new Sabiranje();

        sabiranje.a = 5;
        sabiranje.b = 10;

        sabiranje.sum();

        int sum = sabiranje.sum2(); //15


        System.out.println(sabiranje.sum2() + 20);
        System.out.println(sum + 50);

        int sum3 = sabiranje.sum3(50, 60);
        System.out.println(sum3);

        String ispis = "Rezultat je: ";
        sabiranje.sum4(100, 700, ispis);






    }


}
