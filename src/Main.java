public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("Wed.rings", 2,1500.0);
        Item item2 = new Item("Earrings", 4,50.0);
        Item item3 = new Item("Necklace", 1,500.0);
        Item item4 = new Item("Wristband", 1,200.0);

        Invoice invoices = new Invoice(10, 9, 2021, "Sender", "Recipient", "Jewellery");
        invoices.addItem(item1);
        invoices.addItem(item2);
        invoices.addItem(item3);
        invoices.addItem(item4);

        invoices.showItem();
        invoices.showItem(1);
        invoices.showItem("Earrings");
        invoices.showItem(500.0);

        invoices.sort();

        invoices.deleteItem(4);
        invoices.deleteItem(500.0);
        invoices.deleteItem("Earrings");
        invoices.showItem();

        invoices.changeItem(1, new Item("Silver rings", 2,100.0));

        Invoice cosmetics = new Invoice(10,10,2020,"Sender", "Recipient", "Cosmetics");

        Item cosmetics1 = new Item("Sunscreen", 1,65.0);
        Item cosmetics2 = new Item("Primer", 2,70.0);
        Item cosmetics3 = new Item("Mascara", 1,50.0);


        Invoice gadgets = new Invoice(15,7,2020,"Sender", "Recipient", "Gadgets");

        Item gadget1 = new Item("Mirror", 1, 800.0);
        Item gadget2 = new Item("Massager", 1, 150.0);
        Item gadget3 = new Item("Sanitizer", 1, 100.0);

        cosmetics.addItem(cosmetics1);
        cosmetics.addItem(cosmetics2);
        cosmetics.addItem(cosmetics3);
        cosmetics.showItem();

        gadgets.addItem(gadget1);
        gadgets.addItem(gadget2);
        gadgets.addItem(gadget3);
        gadgets.showItem();


        Storage storage = new Storage();

        storage.addIn(invoices);
        storage.addIn(cosmetics);
        storage.addIn(gadgets);

        storage.showInvoice();
        storage.showInvoice("Sender");
        storage.showInvoice(2020);

        storage.addIn(new Invoice(1,1,2022, "FACE AG", "BEAUTY", "Cosmetics2"));
        storage.showInvoice();

        storage.sortByName();
        storage.sortByDate(new InvoiceComparator());

        storage.delete("Cosmetics");
        storage.showInvoice();
        storage.delete(15,7,2020);
        storage.showInvoice();
    }
}

