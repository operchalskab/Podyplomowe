public class IfAndSwitch {
    public static void main(String[] args) {

//        if(args.length < 3){
//            System.out.println("Zbyt mało argumentów");
//            System.exit(-1);
//        }

        String server;
        if(args.length < 1){
            server = "localhost";
        } else{
            server = args[0];
        }
        System.out.println(server);

        char grade = 'D';

//        switch (grade){
//            case 'A':
//                System.out.println("Wspaniale!");
//                break;
//            case 'B':
//                System.out.println("Dobrze!");
//                break;
//            case 'C':
//                System.out.println("Mogło być lepiej");
//                break;
//            default:
//                System.out.println("Rozważ oszukiwanie");
//
//        }
        if(grade == 'A') {
            System.out.println("Wspaniale1");
        }
        else if (grade == 'B'){
                System.out.println("Dobrze");
            }
        else if (grade == 'C'){
            System.out.println("Mogło być lepiej");
        }
        else{
            System.out.println("Rozważ oszukiwanie");
        }
        int myScore = 5;
        int yourScore = 7;
        int bestScore;

        bestScore = myScore > yourScore ? myScore : yourScore;

        System.out.println(bestScore);
    }
}
