public class Description {
    private int day;
    private int month;
    private int year;
    private String sender;
    private String recipient;
    private String basis;

    public Description(int day, int month, int year, String sender, String recipient, String Basis){
        this.day = day;
        this.month = month;
        this.year = year;
        this.sender = sender;
        this.recipient = recipient;
        this.basis = Basis;
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
    public String getBasis() {
        return basis;
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
    public void setBasis(String basis) {
        this.basis = basis;
    }


}

