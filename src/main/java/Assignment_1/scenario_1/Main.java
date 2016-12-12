package scenario_1;

import java.util.Scanner;

/**
 * Created by Maarten de Klerk on 30-11-16.
 */
public class Main {
    final static String Word97 = "word97";
    final static String RTF = "RTF";
    final static String PlainText = "PlainText";
    final static String HTML = "HTML";
    final static String Word ="Word";

    public static void main(String[] args){
        SaveAs();
        Scanner scanner = new Scanner(System.in);

        if(scanner.hasNextInt()){
            new FileFormatFactory(scanner.nextInt());
        }
    }
    private static void SaveAs(){
        System.out.println("Save as: \n\t1: Word97\n\t2: RTF\n\t3: PlainText\n\t4: HTML\n\t5: Word\nSelect number: ");
    }
}
