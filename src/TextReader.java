import java.util.*;
import java.io.*;
class TextReader{
    private ArrayList<String> arr = new ArrayList();
    private ArrayList<String> common = new ArrayList();



    public TextReader(String f, String c){
        try {
            File textFile = new File(f);
            Scanner textScanner = new Scanner(textFile);
            File commonFile = new File(c);
            Scanner commonScanner = new Scanner(commonFile);
            while (commonScanner.hasNext()) {
                common.add(commonScanner.next().toLowerCase());
            }
            while (textScanner.hasNext()) {
                String word = textScanner.next().toLowerCase();
                word = word.replace(".", "");
                word = word.replace("?", "");
                word = word.replace(",", "");
                word = word.replace("!", "");
                if (!common.contains(word.toLowerCase())) if(!Arrays.asList(word.toLowerCase().split("")).contains("’")) arr.add(word);
            }
        }
        catch (Exception e){System.out.println(e);}
    }

    public ArrayList<String> getArr() {
        return arr;
    }




}