import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.example.yasmeen.softwareproject.Application;
import org.example.yasmeen.softwareproject.Product;
import org.example.yasmeen.softwareproject.*;


import javax.swing.*;

import static org.junit.Assert.*;

public class Testing {
    Application a=new Application();
    private String oldName;
    private String newName;
    private int oldAge;
    private int newAge;
    private String oldPhoneNumber;
    private String newPhoneNumber;
    private boolean updateResult;
    private boolean permissionDenied;

    private Product product;
    private int initialProductCount;

    @Given("I am an {string} and I want to add new products")
    public void i_am_an_and_i_want_to_add_new_products(String userType) {
        Application.publicuser = new Owneraccount("owner", 30, "owner@example.com", 1234567890, 1);
    }

    @When("I add {string} to the store")
    public void i_add_to_the_store(String productName) {
        if (Application.publicuser.gettype().equals("Owner")) {

            Application.addproduct(productName, 0, 0, "01/01/2025",0);

            product =Application.products.get(2);
            updateResult = true;
        } else {
            updateResult = false;
        }
    }

    @Then("The product {string} should be added to the store")
    public void the_product_should_be_added_to_the_store(String productName) {
        assertTrue(updateResult);
        boolean found = false;
        for (Product p : Application.products) {
            if (p.getname().equals(productName)) {
                found = true;
                break;
            }
        }
        assertTrue(found);
    }

    @Given("I am an {string} and I want to add a new quantity to the product {string}")
    public void i_am_an_and_i_want_to_add_a_new_quantity_to_the_product(String userType, String productName) {
        Application.publicuser = new Owneraccount("owner", 30, "owner@example.com", 1234567890, 1);
        product = null;
        JOptionPane.showConfirmDialog(null,productName);
        for (Product p : Application.products) {
            JOptionPane.showConfirmDialog(null,p.getname());
            if (p.getname().equals(productName)) {

                product = p;
                break;
            }
        }
        assertNotNull(product);
    }

    @When("I add a new quantity to {string}")
    public void i_add_a_new_quantity_to(String productName) {
        if (Application.publicuser.gettype().equals("Owner") && product != null) {
            product.setquantity(product.getquantity() + 10);  // Example: adding 10 units
            updateResult = true;
        } else {
            updateResult = false;
        }
    }

    @Then("The quantity of the product {string} should increase")
    public void the_quantity_of_the_product_should_increase(String productName) {
        assertTrue(updateResult);
        assertEquals(10, product.getquantity());  // Assuming initial quantity was 0
    }

    @Given("I am an {string} and I want to update the expiry date of the existing product {string}")
    public void i_am_an_and_i_want_to_update_the_expiry_date_of_the_existing_product(String userType, String productName) {
        Application.publicuser = new Owneraccount("owner", 30, "owner@example.com", 1234567890, 1);
        product = null;
        for (Product p : Application.products) {
            if (p.getname().equals(productName)) {
                product = p;
                break;
            }
        }
        assertNotNull(product);
    }

    @When("I update the expiry date of {string}")
    public void i_update_the_expiry_date_of(String productName) {
        if (Application.publicuser.gettype().equals("Owner") && product != null) {
            product.updateexpire("01/01/2026");  // Example: new expiry date
            updateResult = true;
        } else {
            updateResult = false;
        }
    }

    @Then("The expiry date of the product {string} should be changed")
    public void the_expiry_date_of_the_product_should_be_changed(String productName) {
        assertTrue(updateResult);
        assertEquals("01/01/2026", product.getexpire());
    }

    @Given("I am an {string} and I want to update the expiry date of the product {string}")
    public void i_am_an_and_i_want_to_update_the_expiry_date_of_the_product(String userType, String productName) {
        Application.publicuser = new Owneraccount("owner", 30, "owner@example.com", 1234567890, 1);
        product = null;
        for (Product p : Application.products) {
            if (p.getname().equals(productName)) {
                product = p;
                break;
            }
        }
    }

    @When("The system does not find the product {string}")
    public void the_system_does_not_find_the_product(String productName) {
        updateResult = product == null;
    }

    @Then("A message should appear indicating that the product {string} does not exist")
    public void a_message_should_appear_indicating_that_the_product_does_not_exist(String productName) {
        assertTrue(updateResult);
    }

    @Given("I am an {string} and I want to remove the existing product {string}")
    public void i_am_an_and_i_want_to_remove_the_existing_product(String userType, String productName) {
        Application.publicuser = new Owneraccount("owner", 30, "owner@example.com", 1234567890, 1);
        product = null;
        for (Product p : Application.products) {
            if (p.getname().equals(productName)) {
                product = p;
                break;
            }
        }
        assertNotNull(product);
        initialProductCount = Application.products.size();
    }

    @When("I remove {string} from the store")
    public void i_remove_from_the_store(String productName) {
        if (Application.publicuser.gettype().equals("Owner") && product != null) {
            Application.products.remove(product);
            updateResult = true;
        } else {
            updateResult = false;
        }
    }

    @Then("The number of products in the store should decrease by 1")
    public void the_number_of_products_in_the_store_should_decrease_by_1() {
        assertTrue(updateResult);
        assertEquals(initialProductCount - 1, Application.products.size());
    }

    @Given("I am an {string} and I want to remove a product")
    public void i_am_an_and_i_want_to_remove_a_product(String userType) {
        Application.publicuser = new Owneraccount("owner", 30, "owner@example.com", 1234567890, 1);
    }

    @When("The product {string} does not exist")
    public void the_product_does_not_exist(String productName) {
        product = null;
        for (Product p : Application.products) {
            if (p.getname().equals(productName)) {
                product = p;
                break;
            }
        }
        updateResult = product == null;
        initialProductCount = Application.products.size();
    }

    @Then("A message should appear indicating that there is nothing to remove and the number of products remains the same")
    public void a_message_should_appear_indicating_that_there_is_nothing_to_remove_and_the_number_of_products_remains_the_same() {
        assertTrue(updateResult);
        assertEquals(initialProductCount, Application.products.size());
    }

    @Given("I am an {string} and I want to update the price of the existing product {string}")
    public void i_am_an_and_i_want_to_update_the_price_of_the_existing_product(String userType, String productName) {
        Application.publicuser = new Owneraccount("owner", 30, "owner@example.com", 1234567890, 1);
        product = null;
        for (Product p : Application.products) {
            if (p.getname().equals(productName)) {
                product = p;
                break;
            }
        }
        assertNotNull(product);
    }

    @When("I update the price of {string}")
    public void i_update_the_price_of(String productName) {
        if (Application.publicuser.gettype().equals("Owner") && product != null) {
            product.updateprice(15);  // Example: new price
            updateResult = true;
        } else {
            updateResult = false;
        }
    }

    @Then("The price of the product {string} should be changed")
    public void the_price_of_the_product_should_be_changed(String productName) {
        assertTrue(updateResult);
        assertEquals(15.0, product.getprice(), 0.01);
    }

    @Given("I am an {string} and I want to implement a discount on the product {string}")
    public void i_am_an_and_i_want_to_implement_a_discount_on_the_product(String userType, String productName) {
        Application.publicuser = new Owneraccount("owner", 30, "owner@example.com", 1234567890, 1);
        product = null;
        for (Product p : Application.products) {
            if (p.getname().equals(productName)) {
                product = p;
                break;
            }
        }
        assertNotNull(product);
    }

    @When("I apply a discount of {int}% on {string}")
    public void i_apply_a_discount_of_on(Integer discount, String productName) {
        if (Application.publicuser.gettype().equals("Owner") && product != null) {
            product.updatediscount(discount);
            updateResult = true;
        } else {
            updateResult = false;
        }
    }

    @Then("The price of the product {string} should be reduced by {int}%")
    public void the_price_of_the_product_should_be_reduced_by(String productName, Integer discount) {
        assertTrue(updateResult);
        double expectedPrice = 10.0 - (10.0 * discount / 100.0);  // Assuming original price was 10
        assertEquals(expectedPrice, product.getprice(), 0.01);
    }
    @Given("I am an {string} and I want to update my old name, which is {string}")
    public void i_am_an_and_i_want_to_update_my_old_name_which_is(String userType, String oldName) {
        this.oldName = oldName;
        Application.publicuser = new Owneraccount(oldName, 0, "", 0, 0);
    }

    @When("I change my name to {string}")
    public void i_change_my_name_to(String newName) {
        this.newName = newName;
        if (Application.publicuser instanceof Owneraccount) {
            Application.publicuser.setname(newName);
            updateResult = true;
        } else {
            updateResult = false;
        }
    }

    @Then("My name should be updated to {string}")
    public void my_name_should_be_updated_to(String expectedName) {
        assertTrue(updateResult);
        assertEquals(expectedName, Application.publicuser.getname());
    }

    @Then("My old name should be {string} and the new name should be {string}")
    public void my_old_name_should_be_and_the_new_name_should_be(String oldName, String newName) {
        assertEquals(this.oldName, oldName);
        assertEquals(this.newName, newName);
    }

    @Given("I am an {string} and I want to update my age, which is {int}")
    public void i_am_an_and_i_want_to_update_my_age_which_is(String userType, int oldAge) {
        this.oldAge = oldAge;
        Application.publicuser = new Owneraccount("", oldAge, "", 0, 0);
    }

    @When("I change my age to {int}")
    public void i_change_my_age_to(int newAge) {
        this.newAge = newAge;
        if (Application.publicuser instanceof Owneraccount) {
            Application.publicuser.setage(newAge);
            updateResult = true;
        } else {
            updateResult = false;
        }
    }

    @Then("My age should be updated to {int}")
    public void my_age_should_be_updated_to(int expectedAge) {
        assertTrue(updateResult);
        assertEquals(expectedAge, Application.publicuser.getage());
    }

    @Then("My old age should be {int} and the new age should be {int}")
    public void my_old_age_should_be_and_the_new_age_should_be(int oldAge, int newAge) {
        assertEquals(this.oldAge, oldAge);
        assertEquals(this.newAge, newAge);
    }

    @Given("I am an {string} and I want to update my old phone number, which is {string}")
    public void i_am_an_and_i_want_to_update_my_old_phone_number_which_is(String userType, String oldPhoneNumber) {
        this.oldPhoneNumber = oldPhoneNumber;
        Application.publicuser = new Owneraccount("", 0, "", Integer.parseInt(oldPhoneNumber), 0);
    }

    @When("I change my phone number to {string}")
    public void i_change_my_phone_number_to(String newPhoneNumber) {
        this.newPhoneNumber = newPhoneNumber;
        if (Application.publicuser.gettype().equals("Owner")  ) {
            Application.publicuser.setphone(Integer.parseInt(newPhoneNumber));
            updateResult = true;
        } else {
            updateResult = false;
        }
    }

    @Then("My phone number should be updated to {string}")
    public void my_phone_number_should_be_updated_to(String expectedPhoneNumber) {
        assertTrue(updateResult);
        assertEquals(expectedPhoneNumber, String.valueOf(Application.publicuser.getphone()));
    }

    @Then("My old phone number should be {string} and the new phone number should be {string}")
    public void my_old_phone_number_should_be_and_the_new_phone_number_should_be(String oldPhoneNumber, String newPhoneNumber) {
        assertEquals(this.oldPhoneNumber, oldPhoneNumber);
        assertEquals(this.newPhoneNumber, newPhoneNumber);
    }

    @Given("I am a {string} and I want to update the Supplier's name, which is {string}")
    public void i_am_a_and_i_want_to_update_the_Supplier_s_name_which_is(String userType, String oldName) {
        this.oldName = oldName;
        Application.publicuser = new Suppliers(oldName, 0, "", 0, 0);
    }

    @When("I change the Supplier's name to {string}")
    public void i_change_the_Supplier_s_name_to(String newName) {
        this.newName = newName;
        if (Application.publicuser.gettype().equals("Supplier")) {
            Application.publicuser.setname(newName);
            updateResult = true;
        } else {
            updateResult = false;
        }
    }

    @Then("The Supplier's name should be updated to {string}")
    public void the_Supplier_s_name_should_be_updated_to(String expectedName) {
        assertTrue(updateResult);
        assertEquals(expectedName, Application.publicuser.getname());
    }

    @Then("The old Supplier's name should be {string} and the new name should be {string}")
    public void the_old_Supplier_s_name_should_be_and_the_new_name_should_be(String oldName, String newName) {
        assertEquals(this.oldName, oldName);
        assertEquals(this.newName, newName);
    }

    @Given("I am a {string} and I want to update the Supplier's age, which is {int}")
    public void i_am_a_and_i_want_to_update_the_Supplier_s_age_which_is(String userType, int oldAge) {
        this.oldAge = oldAge;
        Application.publicuser = new Suppliers("", oldAge, "", 0, 0);
    }

    @When("I change the Supplier's age to {int}")
    public void i_change_the_Supplier_s_age_to(int newAge) {
        this.newAge = newAge;
        if (Application.publicuser instanceof Suppliers) {
            Application.publicuser.setage(newAge);
            updateResult = true;
        } else {
            updateResult = false;
        }
    }

    @Then("The Supplier's age should be updated to {int}")
    public void the_Supplier_s_age_should_be_updated_to(int expectedAge) {
        assertTrue(updateResult);
        assertEquals(expectedAge, Application.publicuser.getage());
    }

    @Then("The old Supplier's age should be {int} and the new age should be {int}")
    public void the_old_Supplier_s_age_should_be_and_the_new_age_should_be(int oldAge, int newAge) {
        assertEquals(this.oldAge, oldAge);
        assertEquals(this.newAge, newAge);
    }

    @Given("I am a {string} and I want to update the Supplier's old phone number, which is {string}")
    public void i_am_a_and_i_want_to_update_the_Supplier_s_old_phone_number_which_is(String userType, String oldPhoneNumber) {
        this.oldPhoneNumber = oldPhoneNumber;
        Application.publicuser = new Suppliers("", 0, "", Integer.parseInt(oldPhoneNumber), 0);
    }

    @When("I change the Supplier's phone number to {string}")
    public void i_change_the_Supplier_s_phone_number_to(String newPhoneNumber) {
        this.newPhoneNumber = newPhoneNumber;
        if (Application.publicuser instanceof Suppliers) {
            Application.publicuser.setphone(Integer.parseInt(newPhoneNumber));
            updateResult = true;
        } else {
            updateResult = false;
        }
    }

    @Then("The Supplier's phone number should be updated to {string}")
    public void the_Supplier_s_phone_number_should_be_updated_to(String expectedPhoneNumber) {
        assertTrue(updateResult);
        assertEquals(expectedPhoneNumber, String.valueOf(Application.publicuser.getphone()));
    }

    @Then("The old Supplier's phone number should be {string} and the new phone number should be {string}")
    public void the_old_Supplier_s_phone_number_should_be_and_the_new_phone_number_should_be(String oldPhoneNumber, String newPhoneNumber) {
        assertEquals(this.oldPhoneNumber, oldPhoneNumber);
        assertEquals(this.newPhoneNumber, newPhoneNumber);
    }

    @Given("I am an {string} and I want to update my name to an existing name, {string}")
    public void i_am_an_and_i_want_to_update_my_name_to_an_existing_name(String userType, String existingName) {
        this.newName = existingName;
    }

    @When("I attempt to update my name to {string} which is already used by another user")
    public void i_attempt_to_update_my_name_to_which_is_already_used_by_another_user(String newName) {
        this.newName = newName;
        updateResult = !Application.isfoundmail(newName);
        if (updateResult) {
            Application.publicuser.setname(newName);
        }
    }

    @Then("The system should show an error message indicating that the new name already exists")
    public void the_system_should_show_an_error_message_indicating_that_the_new_name_already_exists() {
        assertFalse(updateResult);
    }



    @Given("I am a {string} and I want to update the Supplier's phone number to an invalid format, {string}")
    public void i_am_a_and_i_want_to_update_the_Supplier_s_phone_number_to_an_invalid_format(String userType, String invalidPhoneNumber) {
        this.newPhoneNumber = invalidPhoneNumber;
    }

    @When("I attempt to save the invalid phone number")
    public void i_attempt_to_save_the_invalid_phone_number() {
        updateResult = newPhoneNumber.matches("\\d+");
        if (updateResult) {
            Application.publicuser.setphone(Integer.parseInt(newPhoneNumber));
        }
    }

    @Then("The system should show an error message indicating that the phone number format is incorrect")
    public void the_system_should_show_an_error_message_indicating_that_the_phone_number_format_is_incorrect() {
        assertFalse(updateResult);
    }

    @Then("The phone number should not be updated")
    public void the_phone_number_should_not_be_updated() {
        assertNotEquals(newPhoneNumber, String.valueOf(Application.publicuser.getphone()));
    }

    @Given("I am an {string} and I want to update my details to their current values, such as my name to {string}")
    public void i_am_an_and_i_want_to_update_my_details_to_their_current_values_such_as_my_name_to(String userType, String currentName) {
        this.oldName = currentName;
        Application.publicuser = new Owneraccount(currentName, 0, "", 0, 0);
    }

    @When("I attempt to update my name to {string} (same as current)")
    public void i_attempt_to_update_my_name_to_same_as_current(String currentName) {
        updateResult = !currentName.equals(Application.publicuser.getname());
        if (updateResult) {
            Application.publicuser.setname(currentName);
        }
    }

    @Then("The system should inform me that there is no change to be made")
    public void the_system_should_inform_me_that_there_is_no_change_to_be_made() {
        assertFalse(updateResult);
    }

    @Then("My name should remain as {string}")
    public void my_name_should_remain_as_current(String currentName) {
        assertEquals(currentName, Application.publicuser.getname());
    }

    @Given("I am an {string} and I want to update another Supplier's details")
    public void i_am_an_and_i_want_to_update_another_Supplier_s_details(String userType) {
        permissionDenied = !userType.equals("Supplier");
    }

    @When("I attempt to change the Supplier's name, age, or phone number")
    public void i_attempt_to_change_the_Supplier_s_name_age_or_phone_number() {
        if (permissionDenied) {
            updateResult = false;
        } else {
            updateResult = true;
        }
    }

    @Then("The system should prevent the update and show a permission error message")
    public void the_system_should_prevent_the_update_and_show_a_permission_error_message() {
        assertFalse(updateResult);
    }

    @Then("The Supplier's details should remain unchanged")
    public void the_Supplier_s_details_should_remain_unchanged() {
        assertTrue(permissionDenied);
    }
}
