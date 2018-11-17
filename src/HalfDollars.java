public class HalfDollars {
    public static void main(String[] args) {
        int[] denver = {1_700_000, 4_600_000, 2_100_000, 1_000_000};
        int[] philidelphi = {1_700_000, 4_600_000, 2_100_000, 1_000_000};
//        int[] philadelphia = new int[denver.length];
        int[] total = new int[denver.length];
        int[] average;
        int sum = 0;

        for(int i = 0 ; i < denver.length ; i ++) {
            total[i] = denver[i] + philidelphi[i];
            System.out.println("Produkcja w " + (2012 + i) + ":" );
            System.out.format("%, d%n", total[i]);
            sum += total[i];
        }
        }

//        start
//        for (int i =1; i <= denver.length; i++) { - to by Beata
//            System.out.println(denver[i-1] + denver[i]); - to by Beata
  //      }
//        philadelphia[0] = 1_800_000;
//        philadelphia[1] = 5_000_000;
//        philadelphia[2] = 2_500_000;
//
//        total [0] = denver[0] + philadelphia[0];
//        total [1] = denver[1] + philadelphia[1];
//        total [2] = denver[2] + philadelphia[2];
//
////        average = (total[0] + total[1] + total[2]);
//
//        System.out.println("Produkcja w 2012: ");
//        System.out.format("%,d%n", total[0]);
//        System.out.println("Produkcja w 2013: ");
//        System.out.format("%,d%n", total[1]);
//        System.out.println("Produkcja w 2014: ");
//        System.out.format("%,d%n", total [2]);
//
////        average = (total[0] + total[1] + total[2])/3;

    }

