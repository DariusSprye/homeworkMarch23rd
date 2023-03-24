public class homeworkMarch23rd {
    public static void calculateDiscount(double price, double discountAmount, String productName) {
        double discount = (discountAmount) * price;
        System.out.println("You've saved a total of: " +discount);
        double finalPrice = price - discount;
        System.out.println(productName + " savings are: " + finalPrice);

    }
    public static void main(String[] args) {
        calculateDiscount(1000, .30, "Gucci Shoes");
        calculateDiscount(500, .25, "Prada Bag");

    }

}
