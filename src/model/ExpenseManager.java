package model;
import java.util.ArrayList;

public class ExpenseManager {


    private ArrayList<Expense> expenses;

    public ExpenseManager() {
        expenses = new ArrayList<>();
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
        System.out.println("Expense added successfully.");
    }

    public void displayExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses found.");
        } else {
            System.out.println("Expenses:");
            for (Expense expense : expenses) {
                System.out.println(expense);
            }
        }
    }


    public void deleteExpense(int expenseId) 
    {
        
        for (int i = 0; i < expenses.size(); i++) {
            if (expenses.get(i).getExpenseId() == expenseId) {
                expenses.remove(i);
                System.out.println("Expense deleted successfully.");
                return;
            }
        }
        
            System.out.println("Expense with ID " + expenseId + " not found.");
        
        
    }

    public double calculateTotalExpenses() {
        double total = 0;
        for (Expense expense : expenses) {
            total += expense.getAmount();
        }
        return total;
    }

    public ArrayList<Expense> filterByCategory(String category) {
        ArrayList<Expense> filteredExpenses = new ArrayList<>();
        for (Expense expense : expenses) {
            if (expense.getCategory().equalsIgnoreCase(category)) {
                filteredExpenses.add(expense);
            }
        }
        return filteredExpenses;
        
    }


    
}
