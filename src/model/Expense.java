package model;



public class Expense {

    private int expenseId;
    private double amount;
    private String category;
    private String description;
    private String date;

    public Expense(int expenseId, double amount, String category, String description, String date) {
        this.expenseId = expenseId;
        this.amount = amount;
        this.category = category;
        this.description = description;
        this.date = date;
    }

    public int getExpenseId() {
        return expenseId;
    }

    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

       @Override
       public String toString() {
         return "Expense ID: " + expenseId + "\n" +
           "Amount: Rs. " + amount + "\n" +
           "Category: " + category + "\n" +
           "Description: " + description + "\n" +
           "Date: " + date + "\n";
        }


    public String toFileString() {
        return expenseId + "," + amount + "," + category + "," + description + "," + date;
    }
    
}
