import java.util.ArrayList;
import java.util.*;

public class Invoice implements Comparable<Invoice> {
    private int day;
    private int month;
    private int year;
    private String sender;
    private String recipient;
    private String type;
    ArrayList<Item> items = new ArrayList<>();

    public Invoice(int day, int month, int year, String sender, String recipient, String type){
        this.day = day;
        this.month = month;
        this.year = year;
        this.sender = sender;
        this.recipient = recipient;
        this.type = type;
        items = new ArrayList<>();
    }

    public void showItem(){
        System.out.println("Invoice <" + type +">:");
        items.forEach(System.out::println);
        System.out.println();
    }

    public void showItem(int index){
        if (index <= 0){
            System.out.println("Wrong input");
        } else {
            System.out.println("Invoice for item with number " + index + ": " + items.get(index - 1));
        }
        System.out.println();
    }

    public void showItem(String name){
        System.out.print("Invoice for item named by " + name + ": ");
        items.stream().filter(product -> Objects.equals(name, product.getName())).forEach(System.out::println);
        System.out.println();
    }

    public void showItem(double price){
        System.out.print("Invoice for item with the price " + price + ": ");
        items.stream().filter(product -> price == product.getPrice()).forEach(System.out::println);
        System.out.println();
    }

    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
    public String getSender() {
        return sender;
    }
    public String getRecipient() {
        return recipient;
    }
    public String getType() {
        return type;
    }


    public void setDay(int day) {
        this.day = day;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setSender(String sender) {
        this.sender = sender;
    }
    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }
    public void setType(String type) {
        this.type = type;
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void deleteItem(int index){
        if (index <= 0 ){
            System.out.println("Wrong input");
        } else {
            items.remove(index - 1);
        }
    }

    public void deleteItem(String name){
        for (int i = 0; i < items.size(); i++) {
            if (Objects.equals(items.get(i).getName(), name)){
                items.remove(i);
            }
        }
    }

    public void deleteItem(double sum){
        for (int i = 0; i < items.size(); i++) {
            if (Objects.equals(items.get(i).getSum(), sum)){
                items.remove(i);
            }
        }
    }

    public void changeItem(int index, Item item){
        items.remove(index - 1);
        items.add(item);
    }

    public void sort() {
        System.out.println("Sorted by sum: ");
        Collections.sort(items);
        items.forEach(System.out::println);
        System.out.println();
    }

    @Override
    public int compareTo(Invoice i) {
        return type.compareTo(i.type);
    }

    public String toString(){
        return "<" + type + ">" + " from " + sender + " to " + recipient
                + " date " + day +"." + month + "." + year;

    }
}
