package bad.robot.refactoring.chapter1;

public class Movie {

    public static final int CHILDREN = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;
    private int priceCode;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    public String getTitle() {
        return title;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int priceCode) {
        this.priceCode = priceCode;
    }

    protected int getFrequentRenterPoints(int daysRented) {
        int frequentRenterPoints = 1;
        // add bonus for a two day new release rental
        if (priceCode == NEW_RELEASE && daysRented > 1)
            frequentRenterPoints++;
        return frequentRenterPoints;
    }


}
