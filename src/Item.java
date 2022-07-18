public class Item implements Comparable<Item> {
    public String name;
    private int amount;
    private double price;
    public double sum;

    public Item(String name, int amount, double price){
        this.name = name;
        this.amount = amount;
        this.price = price;
        this.sum = price * amount;
    }


    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public double getSum(){
        return sum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    @Override
    public int compareTo(Item g) {
        return Double.compare(sum, g.sum);
    }

    public String toString(){
        return name + " amount " + amount + " price " + price + " sum " + sum;
    }


}

