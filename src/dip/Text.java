package dip;

public class Text implements Printable<String> {
    String text;

    public Text(String text) {
        this.text = text;
    }



    @Override
    public String getPrintableItem() {
        return text;
    }
}
