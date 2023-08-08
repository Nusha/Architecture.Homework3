package dip;

public class Image implements Printable<String> {
   String image;

    public Image(String image) {
        this.image = image;
    }


    @Override
    public String getPrintableItem() {
        return image.toString();
    }
}
