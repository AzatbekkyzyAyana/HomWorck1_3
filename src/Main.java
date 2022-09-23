public class Main {
    public static void main(String[] args) {
    double [] num = {3.3, -5.4, 3.3, 3.5, 5.5, -6.7, 2.3, 2.7, 8.6, 2.6, 6.0, 5.9, 9.2, 9.1,};
    int nums = 0;
    double nomber = 0;
    boolean nar =false;
        for (double pol: num  ) {
            if (pol < 0 ) {
                nar = true;
            } else if (pol > 0 && nar) {
                System.out.println(nar);
                if (pol > 0){
                    nomber = nomber + pol;
                    nums ++;
                }
            }

        }
        System.out.println("положительное число = " + nums);
        System.out.println("сумма = " + nomber );
        System.out.println("средние положительные арифметические числы = " + nomber / nums);
        

    }
    
}