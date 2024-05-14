package WT_Lab.Seasional;

import java.util.*;

class InputValidationException extends Exception {
    public InputValidationException(String errorMessage) {
        super(errorMessage);
    }
}

class Postpaid_Bill{
    int mobile_number;
    int customer_id;
    String bill_date;
    double[] monthly_transactions= new double[5];

    void get_Postpaidbill(){
        Scanner sc = new Scanner(System.in);
        try {
            // Input validation for mobile number
            System.out.print("Enter Mobile Number: ");
            int mobile_number = sc.nextInt();
            if (String.valueOf(mobile_number).length() != 10) {
                throw new InputValidationException("Mobile number should be of 10 digits");
            }
            this.mobile_number = mobile_number;

            // Input validation for customer ID
            System.out.print("Enter Customer ID: ");
            int customer_id = sc.nextInt();
            if (String.valueOf(customer_id).length() != 6 || customer_id < 100000 || customer_id > 999999) {
                throw new InputValidationException("Customer ID should be a 6-digit number");
            }
            this.customer_id = customer_id;

            // Input validation for bill date
            System.out.print("Enter Bill Date (dd-mm-yyyy): ");
            String bill_date_string = sc.next();
            
            // Input for monthly transactions
            for (int i = 0; i < 5; i++) {
                System.out.print("Enter Monthly Transaction " + (i+1) + ": ");
                monthly_transactions[i] = sc.nextFloat();
            }
        } catch (Exception e) {
            System.out.println("Input Validation Exception: " + e.getMessage());
        }
    }

}