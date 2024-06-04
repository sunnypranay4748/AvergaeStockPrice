public class Stock {
    private int shares;
    private double price;
    private double capital;

    public void buy(double p,int s){
        price = p;
        shares += s;
        capital += price * shares;
    }

    public void sell(double p, int s){
        price = p;
        shares -= s;
        capital -= price * shares;
    }

    public int getShares(){
        return shares;
    }

    public double getPrice(){
        return price;
    }

    public double getAveragePrice(){
        return capital/getShares();
    }
}
