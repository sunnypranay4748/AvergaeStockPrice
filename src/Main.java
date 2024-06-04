
public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock();
        stock.buy(36.5, 3000);
        stock.buy(38.2, 4000);
        stock.sell(49.9, 2000);

        System.out.println("No of holding shares: "+stock.getShares());
        System.out.println("Latest price per share: "+stock.getPrice());
        System.out.println("Average price of share in your portfolio: "+ stock.getAveragePrice());

    }
}