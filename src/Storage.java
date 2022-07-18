import java.util.ArrayList;
import java.util.*;

public class Storage {
    ArrayList<Invoice> invoices = new ArrayList<>();

    public Storage() {
        invoices = new ArrayList<>();
    }

    public void showInvoice(){
        System.out.println("Invoices: ");
        invoices.forEach(System.out::println);
        System.out.println();
    }

    public void showInvoice(String sender){
        System.out.println("Invoice from : " + sender);
        invoices.stream().filter(invoice -> Objects.equals(sender, invoice.getSender())).forEach(System.out::println);
        System.out.println();
    }

    public void showInvoice(int year){
        System.out.println("Invoice from " + year);
        invoices.stream().filter(invoice -> year == invoice.getYear()).forEach(System.out::println);
        System.out.println();
    }

    public void sortByDate(InvoiceComparator invoiceComparator) {
        System.out.println("Sort by date: ");
        invoices.sort(new InvoiceComparator());
        System.out.println(invoices);
        System.out.println();
    }

    public void sortByName() {
        System.out.println("Sort by name: ");
        Collections.sort(invoices);
        System.out.println(invoices);
        System.out.println();
    }

    public void addIn(Invoice invoice){
        invoices.add(invoice);
    }

    public void delete(int index){
        if (index <= 0 ){
            System.out.println("Wrong input");
        } else {
            invoices.remove(index - 1);
        }
    }

    public void delete(String type){
        for (int i = 0; i < invoices.size(); i++) {
            if (Objects.equals(invoices.get(i).getType(), type)){
                invoices.remove(i);
            }
        }
    }

    public void delete(int day, int month, int year){
        for (int i = 0; i < invoices.size(); i++) {
            if (Objects.equals(invoices.get(i).getDay(), day)){
                if (Objects.equals(invoices.get(i).getMonth(), month)){
                    if (Objects.equals(invoices.get(i).getYear(), year)){
                        invoices.remove(i);
                    }
                }
            }
        }
    }

    public void change(int index, Invoice invoice){
        invoices.remove(index - 1);
        invoices.add(invoice);
    }
}

