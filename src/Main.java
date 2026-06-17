import model.Expense;
import model.ExpenseManager;

public class Main {

    public static void main(String[] args) {

        ExpenseManager expenseManager = new ExpenseManager();

        Expense expense1 = new Expense(
                1,
                250.0,
                "Food",
                "Lunch with friends",
                "2026-06-17"
        );

        Expense expense2 = new Expense(
                2,
                1200.0,
                "Transport",
                "Monthly bus pass",
                "2026-06-17"
        );

        Expense expense3 = new Expense(
                3,
                500.0,
                "Entertainment",
                "Movie tickets",
                "2026-06-18"
        );

        // Test addExpense()
        expenseManager.addExpense(expense1);
        expenseManager.addExpense(expense2);
        expenseManager.addExpense(expense3);

        // Test displayExpenses()
        System.out.println("\n===== All Expenses =====");
        expenseManager.displayExpenses();

        // Test calculateTotalExpenses()
        System.out.println("\nTotal Expenses: Rs."
                + expenseManager.calculateTotalExpenses());

        // Test deleteExpense()
        System.out.println("\nDeleting expense with ID 2...");
        expenseManager.deleteExpense(2);

        // Test displayExpenses() after deletion
        System.out.println("\n===== Expenses After Deletion =====");
        expenseManager.displayExpenses();

        // Test calculateTotalExpenses() after deletion
        System.out.println("\nUpdated Total Expenses: Rs."
                + expenseManager.calculateTotalExpenses());

        // Test deleting a non-existent expense
        System.out.println("\nDeleting expense with ID 10...");
        expenseManager.deleteExpense(10);
    }
}