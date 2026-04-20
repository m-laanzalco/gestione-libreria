import java.util.ArrayList;
import java.util.List;

public class ExpenseTracker {
    private List<Expense> expenses = new ArrayList<>();

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    // Assicurati che questo metodo esista esattamente così!
    public void showExpenses() {
        System.out.println("\n--- Le tue spese ---");
        for (Expense e : expenses) {
            System.out.println(e);
        }
        System.out.println("Totale speso: €" + getTotal());
    }

    public double getTotal() {
        double total = 0;
        for (Expense e : expenses) {
            total += e.getAmount();
        }
        return total;
    }
}