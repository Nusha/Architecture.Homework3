package dip;

import java.util.List;

public class Document implements Printable<List<String>> {
    List<String> lines;

    public Document(List<String> lines) {
        this.lines = lines;
    }

    @Override
    public List<String> getPrintableItem() {
        return lines;
    }
    public String listToString() {
        return String.join(System.lineSeparator(), lines);
    }

}


