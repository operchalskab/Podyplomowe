public class Loops {
    public static void main(String[] args) {
//        for (;;){
//            System.out.println("Pętla nieskończona");
//        for (int i = 1; i <100; i++){
//            System.out.println("i= " + i);
//        int i = 0;
//        while (i < 100)
//            System.out.println("i-"+ i);
//        i++;
//        int i = 0;
//        do {
//            System.out.println("i=" + i);
//            i++;
//        } while (i < 100);
//        final String FORBIDEN = "dwa";
//        String[] strings = {"raz", "dwa", "trzy"};
//        int i = 0;
//        System.out.println("---------------------------START");
//        while (i < strings.length) {
//            if(strings[i].equals(FORBIDEN)) {
//                break;
//            }
//            System.out.println(strings[i]);
//            i++;
//
//        }
//
//        System.out.println("---------------------------KONIEC");

      out:  for (int i =0; i<10;i++){
            for (int j =0; j<10;j++){
                System.out.println("i="+i +"j="+j);
                if ((i==5) && (j==5)){
                    break out;
                }
            }
        }
    }
}
