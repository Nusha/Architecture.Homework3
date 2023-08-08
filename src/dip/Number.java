package dip;

public class Number implements Printable<Integer> {
    Integer number;

    public Number(Integer number) {
        this.number = number;
    }

    @Override
    public Integer getPrintableItem() {
        return number;
    }
}
