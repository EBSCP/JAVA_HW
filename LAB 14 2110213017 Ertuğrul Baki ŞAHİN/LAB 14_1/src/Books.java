public class Books {
    public String Name;
    public double Price;

    public Books (String Name,double Price) {
        this.Name = Name;
        this.Price = Price;
    }
    public double TotalPrice() {
        return Price+0.08*Price;
    }
}
