import java.util.Comparator;

public class InvoiceComparator implements Comparator<Invoice> {

    @Override
    public int compare(Invoice invoice1, Invoice invoice2) {
        if (invoice1.getYear() == invoice2.getYear()){
            if (invoice1.getMonth() == invoice2.getMonth()){
                return invoice1.getDay() - invoice2.getDay();
            } else
                return invoice1.getMonth() - invoice2.getMonth();
        } else
            return invoice1.getYear() - invoice2.getYear();
    }
}

