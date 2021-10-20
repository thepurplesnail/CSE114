public class Stock {
    private String symbol, name;
    private double previousClosingPrice, currentPrice;
    public Stock(String symbol, String name){
        this.symbol = symbol;
        this.name = name;
    }
    // accessors
    public String getSymbol(){return this.symbol;}
    public String getName(){return this.name;}
    public double getPreviousClosingPrice(){return this.previousClosingPrice;}
    public double getCurrentPrice(){return this.currentPrice;}

    // mutators
    public void setPreviousClosingPrice(double newPreviousClosingPrice){this.previousClosingPrice = newPreviousClosingPrice;}
    public void setCurrentPrice(double newCurrentPrice){this.currentPrice = newCurrentPrice;}

    public double changePercent(){
        return (this.currentPrice - this.previousClosingPrice)/this.previousClosingPrice * 100;
    }

    // test program
    public static void main(String[] args){
        Stock stock1 = new Stock("GOOG", "Google Inc.");
        stock1.setPreviousClosingPrice(100);
        stock1.setCurrentPrice(90);
        System.out.println(stock1.getName() + " % change in stock price: " + stock1.changePercent());
        System.out.println();

        Stock stock2 = new Stock("FB", "Facebook Inc.");
        stock2.setPreviousClosingPrice(341.38);
        stock2.setCurrentPrice(341.50);
        System.out.println(stock2.getName() + " % change in stock price: " + stock2.changePercent());

        Stock stock3 = new Stock("AMZN", "Amazon.com Inc.");
        stock3.setPreviousClosingPrice(3428.41);
        stock3.setCurrentPrice(3429.7);
        System.out.println(stock3.getName() + " % change in stock price: " + stock3.changePercent());


    }
}
