import model.ExpenseManager;

public class Main {

    public static void main(String[] args) {

        // Create ExpenseManager
        // This should automatically call loadFromFile()
        ExpenseManager expenseManager = new ExpenseManager();

        System.out.println("===== Expenses Loaded from File =====");

        expenseManager.displayExpenses();

        System.out.println("\nTotal Expenses: Rs. "
                + expenseManager.calculateTotalExpenses());
    }
}