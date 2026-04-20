public class Expense {
    private String category;
    private double amount;
    private String date;

    public Expense(String category, double amount, String date) {
        this.category = category;
        this.amount = amount;
        this.date = date;
    }

    // Getter utili per i calcoli
    public double getAmount() { return amount; }
    public String getCategory() { return category; }

    @Override
    public String toString() {
        return "[" + date + "] " + category + ": €" + amount;
    }
}