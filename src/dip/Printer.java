package dip;

public class Printer {
    public <T> void print(Printable<T> printable) {
        if (printable instanceof Document){
            System.out.println(((Document) printable).listToString());
        } else if (printable instanceof Number) {
            System.out.println("<---Это печать объекта Number---> \n"+printable.getPrintableItem());
        } else {
            System.out.println(printable.getPrintableItem());
        }

    }
}
