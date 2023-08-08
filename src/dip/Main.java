package dip;



import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Printable<String> myText = new Text("<---Это печать текста---> \n Привет! \n");
        Printable<List<String>> document = new Document(Arrays.asList("<---Это печать документа---> \nLorem ipsum dolor sit amet,", "consectetur adipiscing elit", "sed do eiusmod " +
                "tempor incididunt ut labore et dolore magna aliqua. \n"));
        Printable<String> myImage = new Image("<---Это печать какой-то картинки--->\n Some image \n");

        Printable<Integer> myNumber = new Number(77);

        Printer myPrinter = new Printer();
        myPrinter.print(myText);
        myPrinter.print(document);
        myPrinter.print(myImage);
        myPrinter.print(myNumber);
    }
}
//Вывод:
//<---Это печать текста--->
//        Привет!
//
//<---Это печать документа--->
//        Lorem ipsum dolor sit amet,
//        consectetur adipiscing elit
//        sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
//
//<---Это печать какой-то картинки--->
//        Some image
//
//<---Это печать объекта Number--->
//        77
