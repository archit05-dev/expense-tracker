
import java.io.*;
import java.util.ArrayList;
import model.Expense;
import model.ExpenseManager;

public class Main {

    public static void main(String[] args) {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        ExpenseManager expenseManager = new ExpenseManager();

        int choice=0;


        do {

            System.out.println("\n===== Expense Tracker =====");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Delete Expense");
            System.out.println("4. Filter by Category");
            System.out.println("5. Show Total Expenses");
            System.out.println("6. Exit\n");

            System.out.print("Enter your choice: ");

            try
                {
                        choice = Integer.parseInt(br.readLine());

                }
                catch(IOException e)
                {
                        System.out.println("Error reading input. Please try again.");
                        continue;
                }
                catch(NumberFormatException e)
                {
                        System.out.println("Invalid input. Please enter a number.");
                        continue;
                }



            switch(choice)
            {
                case 1:
                        try
                        {
                                 System.out.print("Enter Expense ID: ");
                                 int expenseId = Integer.parseInt(br.readLine());

                                  System.out.print("Enter Amount: ");
                                  double amount = Double.parseDouble(br.readLine());

                                  System.out.print("Enter Category: ");
                                  String category = br.readLine();

                                  System.out.print("Enter Description: ");
                                  String description = br.readLine();

                                  System.out.print("Enter Date (YYYY-MM-DD): ");
                                  String date = br.readLine();

                                  Expense expense = new Expense(
                                                              expenseId,
                                                              amount,
                                                              category,
                                                              description,
                                                              date
                                                                        );

                                 expenseManager.addExpense(expense);
                        }

                        catch(NumberFormatException e)
                        {
                           System.out.println("Invalid number entered. Please try again.");
                        }

                        catch(IOException e)
                        {
                                System.out.println("Error reading input. Please try again.");
                        }

                    break;

                 case 2:
                        expenseManager.displayExpenses();
                        break;

                 case 3:
                        try
                        {
                                 System.out.print("Enter Expense ID for expense to be deleted: ");
                                 int expenseId=Integer.parseInt(br.readLine());

                                 expenseManager.deleteExpense(expenseId);

                        }

                        catch(NumberFormatException e)
                        {
                           System.out.println("Invalid number entered. Please try again.");
                        }

                        catch(IOException e)
                        {
                                System.out.println("Error reading input. Please try again.");
                        }
                      


                break;

                 case 4:
                        try
                        {
                               System.out.print("Enter category: ");
                               String category=br.readLine();
                               
                               ArrayList<Expense> filteredExpenses = expenseManager.filterByCategory(category);

                               if(filteredExpenses.isEmpty())
                               {
                                System.out.println("No expense found of this category");
                               }

                               else
                               {
                                System.out.println("\n===== Filtered Expenses =====");
                                
                                for(Expense expense : filteredExpenses)
                                {
                                        System.out.println(expense);
                                        System.out.println("--------------------");
                                }
                               }
                        }


                        catch(IOException e)
                        {
                                System.out.println("Error reading input. Please try again.");
                        }


                break;

                 case 5:
                        System.out.println("Total Expenses: Rs. "+ expenseManager.calculateTotalExpenses());
                        break;

                 case 6:
                        System.out.println("Exiting ......");
                        break;        

                 default:
                        System.out.println("Invalid input Please select an option from 1 to 6");        


            }

        } while (choice != 6);



    }
}