public class Main {
    public static void main(String[] args) {
        ExpenseTracker tracker = new ExpenseTracker();

        // Passiamo SOLO i valori, niente scritte "category:", "amount:" etc.
        tracker.addExpense(new Expense("Cibo", 12.50, "20/04/2026"));
        tracker.addExpense(new Expense("Trasporti", 5.00, "20/04/2026"));
        tracker.addExpense(new Expense("Svago", 25.00, "20/04/2026"));

        tracker.showExpenses();
    }
}