/**
 * IMPORTANT: Add your package below. Package name can be found in the project's AndroidManifest.xml file.
 * This is the package name our example uses:
 * <p>
 * package com.example.android.justjava;
 */
package com.example.android.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    int quantity = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {

        int price = quantity * 5;
        String priceMessage = "Total: $"+price;
        priceMessage = priceMessage + "\nThank you!";

        //calculatePrice(quantity);
        calculatePrice(quantity,10);
        //calculatePrice();

        //displayPrice(quantity * 5);
        displayMessage(priceMessage);
    }


    /**
     * This method is called when the + button is clicked.
     */
    public void increment(View view) {
        quantity = quantity +1;
        displayQuantity(quantity);
        //displayPrice(quantity * 5);
    }

    /**
     * This method is called when the - button is clicked.
     */
    public void decrement(View view) {
        quantity = quantity - 1;
        displayQuantity(quantity);
        //displayPrice(quantity * 5);
    }

    /**
     * This method displays the given quantity value on the screen.
     *
     * * @param numberOfCoffees number of coffee cups
     */
    private void displayQuantity(int numberOfCoffees) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + numberOfCoffees);
    }

    /**
     * This method displays the given price on the screen.
     *
     * @param number

    private void displayPrice(int number) {
    TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
    priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

     */

    /**
     * This method displays the given price on the screen.
     *
     * @param message is the message to display
     */

    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }



    /**
     * Calculates the price of the order.
     *
     * @param quantity is the number of cups of coffee ordered
     * @param pricePerCup is the price of one cup of coffee
     */
    private void calculatePrice(int quantity, int pricePerCup) {
        // int price = 5 * 5;
        // int price = quantity * 5;
        int price = quantity * pricePerCup;
    }

}

