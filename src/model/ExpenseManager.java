package model;
import java.io.*;
import java.util.ArrayList;

public class ExpenseManager {

    private static final String FILENAME = "expenses.txt";

    private ArrayList<Expense> expenses;

    public ExpenseManager() {
        expenses = new ArrayList<>();
        loadFromFile();
    }

    public void addExpense(Expense expense) {
        for(Expense existingExpense : expenses)
        {
            if(existingExpense.getExpenseId()==expense.getExpenseId())
            {
                System.out.println("ExpenseId already exist ");
                return;
            }
        }
        expenses.add(expense);
        saveToFile();
        System.out.println("Expense added successfully.");
    }

    public void displayExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses found.");
            return;
           
        } 
           
            System.out.println("\n===== Expenses =====");

            for (Expense expense : expenses) {
                System.out.println(expense);
                System.out.println("--------------------");
            }
        
    }


    public void deleteExpense(int expenseId) 
    {
        
        for (int i = 0; i < expenses.size(); i++) {
            if (expenses.get(i).getExpenseId() == expenseId) {
                expenses.remove(i);
                System.out.println("Expense deleted successfully.");
                saveToFile();
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


    public void saveToFile() {
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME))) {
            for (Expense expense : expenses) {
                writer.write(expense.toFileString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error occurred while saving to file: " + e.getMessage());
        }
    }

    public void loadFromFile() {

        File file = new File(FILENAME);
        if (!file.exists()) {
            System.out.println("No existing expenses found. Starting with an empty list.");
            return;
        }
        
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 5) {
                    int expenseId = Integer.parseInt(parts[0]);
                    double amount = Double.parseDouble(parts[1]);
                    String category = parts[2];
                    String description = parts[3];
                    String date = parts[4];
                    Expense expense = new Expense(expenseId, amount, category, description, date);
                    expenses.add(expense);
                }
            }
        } catch (IOException e) {
               System.out.println("Error occurred while loading from file: " + e.getMessage());
           }
              catch (NumberFormatException e) {
                System.out.println("Error occurred while parsing expense data: " + e.getMessage());
           }
        
    }


    
}
