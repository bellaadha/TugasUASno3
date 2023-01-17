import java.util.ArrayList;
import java.util.Scanner;

public class nomer3 {
    public static void main(String[] args) {
        public int intMessageID;
        Private int intMessageName;
        public int intContext;
        public nomer3() {

        }
        int jum=4;
        UAS1D myMessage = new UAS1D();
        Scanner sc = new Scanner(System.in);
        myMessage.setMessageID(sc.nextLine());
        myMessage.setMessageName (sc.nextLine());
        ArrayList<String>context = new ArrayList<>();
        for(int index=0;index<jum;index++){
            context.add(sc.nextLine());
        }
        MyMessage.setContext(context);

        System.out.print("Kata yang dicari :");
        String cari = sc.nextLine();
        System.out.println(myMessage.FinWords(context,cari));


    }
}
