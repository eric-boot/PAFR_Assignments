package scenario_1;

/**
 * Created by Maarten de Klerk on 12-12-2016.
 */
public class FileFormatFactory {
    public FileFormatFactory(int fileFormatId){

        FileFormat fileformat = null;

        switch (fileFormatId){
            case 1: fileformat = new Word97(); break;
            case 2: fileformat = new RTF(); break;
            case 3: fileformat = new PlainText(); break;
            case 4: fileformat = new HTML(); break;
            case 5: fileformat = new Word(); break;
        }
        if(fileformat == null){
            System.out.println("Not a valid file format");
        } else {
            System.out.println(fileformat.toString());
        }
    }
}
