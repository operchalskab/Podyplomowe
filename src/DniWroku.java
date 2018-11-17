public class DniWroku {

    public static void main(String[] args) {
        int yearIn = 1900;
        int monthIn = 2;

        for (int i = 1; i <= 12; i++)
            for (int j = 1; j<=countDays(i,yearIn); j++){
            System.out.println("R:"+ yearIn + " " + "M:" + i + " " + "D:" + j);
        }
    }


        static int countDays(int month, int year){
            int count = -1;

            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    count = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    count = 30;
                    break;

                case 2:
                    if(year % 4 == 0){
                        count = 29;
                    } else {
                        count = 28;
                    }
                    if ((year % 100 == 0) && (year % 400 != 0)){
                        count = 28;
                    }

            }
            return count;
        }





}
