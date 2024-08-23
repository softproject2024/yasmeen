

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;


import yasmeen.softwareproject.*;


import java.util.Objects;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static yasmeen.softwareproject.Application.*;

public class
Testing {
    Application a=new Application();
    boolean flag;
    private String oldName;
    private String olddate;
    private String newName;


    private long newAge,newPhoneNumber,newPassword;
 private int ind1,ind2;


    private int oldqua,oldvalue;

    @Given("I am an {string} and I want to add new products")
    public void i_am_an_and_i_want_to_add_new_products(String string) {
        // Write code here that turns the phrase above into concrete actions

        publicuser=new Owneraccount("Yasmeen",12,"a2@g.c",1231231231,0);
        assertEquals(string, publicuser.gettype());

    }

    @When("I add {string} to the store")
    public void i_add_to_the_store(String string) {
        // Write code here that turns the phrase above into concrete actions
        addproduct(string,0,0,"1/12/2029",0,"");

    }

    @Then("the product {string} should be added to the store")
    public void the_product_should_be_added_to_the_store(String string) {
        // Write code here that turns the phrase above into concrete actions

        flag=false;
        for (int i = 0; i< products.size(); i++){

            if(products.get(i).getname().equals(string)){
                flag=true;

            }
        }
        assertTrue(flag);

    }

    @Given("I am an {string} and I want to add a new quantity to the product {string}")
    public void i_am_an_and_i_want_to_add_a_new_quantity_to_the_product(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
       oldName=string2;
    }

    @When("I add a new quantity with value {int}")
    public void i_add_a_new_quantity_with_value(Integer int1) {
        // Write code here that turns the phrase above into concrete actions

        for (int i = 0; i< products.size(); i++){

            if(products.get(i).getname().equals(oldName)){
             oldvalue=i;
             oldqua= products.get(i).getquantity();
                products.get(i).setquantity(products.get(i).getquantity()+int1);

            }
        }
    }

    @Then("the quantity of the product {string} should increase by {int}")
    public void the_quantity_of_the_product_should_increase_by(String string, Integer int1) {
        // Write code here that turns the phrase above into concrete actions
       assertEquals(products.get(oldvalue).getquantity(),oldqua+int1);
    }

    @Given("I am an {string} and I want to update the expiry date of the existing product {string}")
    public void i_am_an_and_i_want_to_update_the_expiry_date_of_the_existing_product(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
     oldName=string2;

    }

    @When("I update the expiry date of to \"{int}\\/{int}\\/{int}")
    public void i_update_the_expiry_date_of_to(Integer int1, Integer int2, Integer int3) {
        // Write code here that turns the phrase above into concrete actions
        String newdate = int1 + "/" + int2 + "/" + int3;

        for (int i = 0; i< products.size(); i++){

            if(products.get(i).getname().equals(oldName)){
                olddate= products.get(i).getexpire();
updateproduct(i, products.get(i).getprice(), newdate);
oldvalue=i;
            }
        }

    }

    @Then("the expiry date of the product should be changed")
    public void the_expiry_date_of_the_product_should_be_changed() {
        // Write code here that turns the phrase above into concrete actions
        assertNotEquals(olddate, products.get(oldvalue).getexpire());
    }

    @Given("I am an {string} and I want to update the expiry date of the product {string}")
    public void i_am_an_and_i_want_to_update_the_expiry_date_of_the_product(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
       oldName=string;
    }

    @When("the system does not find the product {string}")
    public void the_system_does_not_find_the_product(String string) {
        // Write code here that turns the phrase above into concrete actions
     flag=false;
        for (int i = 0; i< products.size(); i++){

            if(products.get(i).getname().equals(oldName)){
              flag=true;
              break;
            }
        }
        assertFalse(flag);
    }

    @Then("a message should appear indicating that the product {string} does not exist")
    public void a_message_should_appear_indicating_that_the_product_does_not_exist(String string) {
        // Write code here that turns the phrase above into concrete actions

    }

    @Given("I am an {string} and I want to remove the existing product")
    public void i_am_an_and_i_want_to_remove_the_existing_product(String string) {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("I remove {string} from the store")
    public void i_remove_from_the_store(String string) {
        // Write code here that turns the phrase above into concrete actions
        oldName=string;

    }

    @Then("the number of products in the store should decrease by {int}")
    public void the_number_of_products_in_the_store_should_decrease_by(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        oldqua= products.size();
        removeproduct(oldName);
        flag=false;
        for (int i = 0; i< products.size(); i++){

            if(products.get(i).getname().equals(oldName)){
                flag=true;
                break;
            }
        }
        assertFalse(flag);

    }



    @Given("I am an {string} and I want to remove a product")
    public void i_am_an_and_i_want_to_remove_a_product(String string) {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("the product {string} does not exist")
    public void the_product_does_not_exist(String string) {
        // Write code here that turns the phrase above into concrete actions
   oldName=string;
    }

    @Then("a message should appear indicating that there is nothing to remove and the number of products remains the same")
    public void a_message_should_appear_indicating_that_there_is_nothing_to_remove_and_the_number_of_products_remains_the_same() {
        // Write code here that turns the phrase above into concrete actions
     int oldsize= products.size();
        removeproduct(oldName);
       assertEquals(oldsize, products.size());

    }


    @Given("I am an {string} and I want to update the price of the existing product")
    public void i_am_an_and_i_want_to_update_the_price_of_the_existing_product(String string) {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("I update the price of {string} to {int}")
    public void i_update_the_price_of_to(String string, Integer int1) {
        // Write code here that turns the phrase above into concrete actions
oldqua=int1;
    oldName=string;
        for (int i = 0; i< products.size(); i++){

            if(products.get(i).getname().equals(oldName)){

                updateproduct(i,int1, products.get(oldvalue).getexpire());
                oldvalue=i;
            }
        }


    }

    @Then("the price of the product {string} should be changed")
    public void the_price_of_the_product_should_be_changed(String string) {
        // Write code here that turns the phrase above into concrete actions


        for (int i = 0; i< products.size(); i++){

            if(products.get(i).getname().equals(string)){
                assertEquals(products.get(i).getprice(),oldqua);
            }
        }
    }

    @Given("I am an {string} and I want to implement a discount on the product")
    public void i_am_an_and_i_want_to_implement_a_discount_on_the_product(String string) {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("I apply a discount of {int} % on {string}")
    public void i_apply_a_discount_of_on(Integer int1, String string) {
        // Write code here that turns the phrase above into concrete actions

        for (int i = 0; i< products.size(); i++){

            if(products.get(i).getname().equals(string)){
                implementdiscount(int1, products.get(i));
                oldvalue=i;
            }
        }

    }

    @Then("the discount on the product {string} should be updated to {int} %")
    public void the_discount_on_the_product_should_be_updated_to(String string, int int1) {
        // Write code here that turns the phrase above into concrete actions

        for (int i = 0; i< products.size(); i++){

            if(products.get(i).getname().equals(string)){
                assertEquals(products.get(i).getdiscount(),int1);
            }
        }
    }

    @Given("I am an {string} and I want to add a new product with an invalid expiry date")
    public void i_am_an_and_i_want_to_add_a_new_product_with_an_invalid_expiry_date(String string) {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("I attempt to add {string} with the expiry date {string}")
    public void i_attempt_to_add_with_the_expiry_date(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        int old= products.size();
       addproduct(string,0,0,string2,0,"");
       assertEquals(products.size(),old);
    }

    @Then("a message should appear indicating that the expiry date format is incorrect")
    public void a_message_should_appear_indicating_that_the_expiry_date_format_is_incorrect() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Given("I am an {string} and I want to add a new product  with an invalid price")
    public void i_am_an_and_i_want_to_add_a_new_product_with_an_invalid_price(String string) {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("I attempt to add {string} with a price of {int}")
    public void i_attempt_to_add_with_a_price_of(String string, int int1) {
        // Write code here that turns the phrase above into concrete actions
        int old= products.size();
        addproduct(string,int1,0,"1/12/2029",0,"");
        assertEquals(products.size(),old);
    }

    @Then("a message should appear indicating that the price is invalid")
    public void a_message_should_appear_indicating_that_the_price_is_invalid() {
        // Write code here that turns the phrase above into concrete actions

    }


    @Given("I am an {string} and I want to add a new product with an invalid quantity")
    public void i_am_an_and_i_want_to_add_a_new_product_with_an_invalid_quantity(String string) {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("I attempt to add {string} with a quantity of {int}")
    public void i_attempt_to_add_with_a_quantity_of(String string, Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        int old= products.size();
        addproduct(string,0,int1,"1/12/2029",0,"");
        assertEquals(products.size(),old);
    }

    @Then("a message should appear indicating that the quantity is invalid")
    public void a_message_should_appear_indicating_that_the_quantity_is_invalid() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Given("I am an {string} and I want to add a duplicate product")
    public void i_am_an_and_i_want_to_add_a_duplicate_product(String string) {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("I attempt to add {string} with a different price and quantity")
    public void i_attempt_to_add_with_a_different_price_and_quantity(String string) {
        // Write code here that turns the phrase above into concrete actions
        int old= products.size();
        addproduct(string,0,0,"1/12/2029",0,"");
        assertEquals(products.size(),old);
    }

    @Then("a message should appear indicating that the product already exists")
    public void a_message_should_appear_indicating_that_the_product_already_exists() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Given("I am an {string} and I want to update my old name, which is {string}")
    public void i_am_an_and_i_want_to_update_my_old_name_which_is(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
       oldName=string2;
    }

    @When("I change my name to {string}")
    public void i_change_my_name_to(String string) {
        // Write code here that turns the phrase above into concrete actions
        newName=string;
        updateinformation(newName, publicuser.getage(), publicuser.getphone(), publicuser.getpassword());
    }

    @Then(": my old name should be {string} and the new name should be {string}")
    public void my_old_name_should_be_and_the_new_name_should_be(String string, String string2) {
      assertNotEquals(oldName, publicuser.getname());
    }

    @Given("I am an {string} and I want to update my age, which is {int}")
    public void i_am_an_and_i_want_to_update_my_age_which_is(String string, Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        oldqua=int1;
    }

    @When("I change my age to {int}")
    public void i_change_my_age_to(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        updateinformation(newName,int1, publicuser.getphone(), publicuser.getpassword());
    }

    @When("my old age should be {int} and the new age should be {int}")
    public void my_old_age_should_be_and_the_new_age_should_be(Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions
        assertNotEquals(oldqua, publicuser.getage());
    }


    @Given("I am a {string} and I want to update the Supplier's name, which is {string}")
    public void i_am_a_and_i_want_to_update_the_supplier_s_name_which_is(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
      oldName=string2;
        publicuser=new Suppliers("Yaqoot", 0, "a1@g.c", 0, 12121212);
    }

    @When("I change the Supplier's name to {string}")
    public void i_change_the_supplier_s_name_to(String string) {
        // Write code here that turns the phrase above into concrete actions
updateinformation(string, publicuser.getage(), publicuser.getphone(), publicuser.getpassword());

    }

    @Then("the Supplier's name should be updated to {string}")
    public void the_supplier_s_name_should_be_updated_to(String string) {
        // Write code here that turns the phrase above into concrete actions
   assertNotEquals(publicuser.getname(),newName);

    }




    @Given("I am a {string} and I want to update the Supplier's age, which is {int}")
    public void i_am_a_and_i_want_to_update_the_supplier_s_age_which_is(String string, Integer int1) {
        // Write code here that turns the phrase above into concrete actions
      oldqua=int1;
    }

    @When("I change the Supplier's age to {int}")
    public void i_change_the_supplier_s_age_to(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        updateinformation(publicuser.getname(),int1, publicuser.getphone(), publicuser.getpassword());

    }

    @Then("the Supplier's age should be updated to {int}")
    public void the_supplier_s_age_should_be_updated_to(int int1) {
        // Write code here that turns the phrase above into concrete actions
assertNotEquals(oldqua, publicuser.getage());

    }


    @Given(": i am a {string} and i want to feedback a product or post")
    public void i_am_a_and_i_want_to_feedback_a_product_or_post(String string) {
        // Write code here that turns the phrase above into concrete actions

    }



    @Given(": i am an {string} and i want to sign in to the system as admin")
    public void i_am_an_and_i_want_to_sign_in_to_the_system_as_admin(String string) {
        // Write code here that turns the phrase above into concrete actions
      oldName=string;
      type=string;
    }

    @Then(": i must enter my email {string} and my password {int} as admin")
    public void i_must_enter_my_email_and_my_password_as_admin(String string, Integer int1) {
        // Write code here that turns the phrase above into concrete actions
      flag= login(string, int1 + "");
    }

    @Then(": the system must pass me as admin")
    public void the_system_must_pass_me_as_admin() {

      assertTrue(flag);

      assertEquals(publicuser.gettype(),oldName);

    }

    @Given(": i am an {string} and i want to sign in to the system as owner")
    public void i_am_an_and_i_want_to_sign_in_to_the_system_as_owner(String string) {
        // Write code here that turns the phrase above into concrete actions
        oldName=string;
        type=string;
    }

    @Then(": i must enter my email {string} and my password {int} as owner")
    public void i_must_enter_my_email_and_my_password_as_owner(String string, Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        flag= login(string, int1 + "");
    }

    @Then(": the system must pass me as Owner")
    public void the_system_must_pass_me_as_owner() {
        // Write code here that turns the phrase above into concrete actions
        assertTrue(flag);

        assertEquals(publicuser.gettype(),oldName);
    }

    @Given(": i am an {string} and i want to sign in to the system as supplier")
    public void i_am_an_and_i_want_to_sign_in_to_the_system_as_supplier(String string) {
        // Write code here that turns the phrase above into concrete actions
        oldName=string;
        type=string;
    }

    @Then(": i must enter my email {string} and my password {int} as supplier")
    public void i_must_enter_my_email_and_my_password_as_supplier(String string, Integer int1) {
        flag= login(string, int1 + "");
    }

    @Then(": the system must pass me as supplier")
    public void the_system_must_pass_me_as_supplier() {
        // Write code here that turns the phrase above into concrete actions
        assertTrue(flag);

        assertEquals(publicuser.gettype(),oldName);
    }

    @Given(": i am an {string} and i want to sign in to the system as user")
    public void i_am_an_and_i_want_to_sign_in_to_the_system_as_user(String string) {
        // Write code here that turns the phrase above into concrete actions
        oldName=string;
        type=string;
    }

    @Then(": i must enter my email {string} and my password {int} as user")
    public void i_must_enter_my_email_and_my_password_as_user(String string, Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        flag= login(string, int1 + "");
    }

    @Then(": the system must pass me as user")
    public void the_system_must_pass_me_as_user() {
        // Write code here that turns the phrase above into concrete actions
        assertTrue(flag);

        assertEquals(publicuser.gettype(),oldName);
    }












    @Given("I am a {string} and I want to update my info")
    public void iAmAAndIWantToUpdateMyInfo(String string) {
        // Write code here that turns the phrase above into concrete actions
        publicuser=new User("Hitler",1,"1",2,12);

    }
    @Given("my old name is {string}")
    public void myOldNameIs(String string) {
        // Write code here that turns the phrase above into concrete actions
        oldName=string;
    }
    @Given("my new name is {string} and new age is {int} and new phone number is {int} and new password is {int}")
    public void myNewNameIsAndNewAgeIsAndNewPhoneNumberIsAndNewPasswordIs(String string, int int1, int int2, int int3) {
        // Write code here that turns the phrase above into concrete actions
        this.newName = string;
        this.newAge = int1;
        this.newPhoneNumber =int2;
        this.newPassword = int3;

        // Assuming Application.updateInformation updates the user's info
        updateinformation(newName, int1, int2, int3);
    }
    @Then("the information must be updated")
    public void theInformationMustBeUpdated() {
        // Write code here that turns the phrase above into concrete actions


        assertNotEquals(oldName, publicuser.getname());

        // Add more assertions to check if other information is updated correctly
        assertEquals(newName, publicuser.getname());

        assertEquals(newAge, publicuser.getage());
        assertEquals(newPhoneNumber, publicuser.getphone());
        assertEquals(newPassword, publicuser.getpassword());
    }


    @Given(": i am an {string} and i want to see the profits")
    public void i_am_an_and_i_want_to_see_the_profits(String string) {
        // Write code here that turns the phrase above into concrete action
    }
    @When(": i click at the button generate report")
    public void i_click_at_the_button_generate_report() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then(": i choose the report name {string}")
    public void i_choose_the_report_name(String string) {
        // Write code here that turns the phrase above into concrete actions
   assertTrue(generatereport(getsalesmessage(),string));
    }


    @When(": i open the profits page the message {string} must appear")
    public void i_open_the_profits_page_the_message_must_appear(String string) {
        // Write code here that turns the phrase above into concrete actions
oldName= getsalesmessage();
    }
    @Then(": the system must pass")
    public void the_system_must_pass() {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(oldName, getsalesmessage());

    }

    @Given(": i am an {string} and i want to see the best selling profit")
    public void i_am_an_and_i_want_to_see_the_best_selling_profit(String string) {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("the best selling profit will be displayes as this {string}")
    public void the_best_selling_profit_will_be_displayes_as_this(String string) {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(string, Objects.requireNonNull(getmaxprofit()).getname());
    }


    @Given(": i am an {string} and i want to manage posts and  recipes")
    public void i_am_an_and_i_want_to_manage_posts_and_recipes(String string) {
        // Write code here that turns the phrase above into concrete actions

    }
    @When(": i click at add post i must choose the path {string} of the image and description {string} and name {string}")
    public void i_click_at_add_post_i_must_choose_the_path_of_the_image_and_description_and_name(String string, String string2, String string3) {
        // Write code here that turns the phrase above into concrete actions
       oldvalue= posts.size();
       addpost(string,string2,string3);
    }
    @Then("the number of posts must be incrased by one")
    public void the_number_of_posts_must_be_incrased_by_one() {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(posts.size(),oldvalue+1);

    }

    @Given(": i am a new user with type {string} to be a new admin")
    public void i_am_a_new_user_with_type_to_be_a_new_admin(String string) {
        // Write code here that turns the phrase above into concrete actions
type2=string;

    }
    @Given(": my name is {string} and my age is {int} and my phone number is {int} and password is {int} and email {string} as admin")
    public void my_name_is_and_my_age_is_and_my_phone_number_is_and_password_is_and_email_as_admin(String string, Integer int1, Integer int2, Integer int3, String string2) {
        // Write code here that turns the phrase above into concrete actions
    oldvalue= Admins.size();
    logup(string2,string,int1,int2,int3);
    loginpage.setVisible(false);
    }
    @Then("the Admin users must be increased by {int}")
    public void the_admin_users_must_be_increased_by(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(Admins.size(),oldvalue+int1);
    }




    @Given(": i am a new user with type {string} to be a new owner")
    public void i_am_a_new_user_with_type_to_be_a_new_owner(String string) {
        // Write code here that turns the phrase above into concrete actions
        type2=string;
    }
    @Given(": my name is {string} and my age is {int} and my phone number is {int} and password is {int} and email {string} as owner")
    public void my_name_is_and_my_age_is_and_my_phone_number_is_and_password_is_and_email_as_owner(String string, Integer int1, Integer int2, Integer int3, String string2) {
        // Write code here that turns the phrase above into concrete actions
        oldvalue= Owners.size();
        logup(string2,string,int1,int2,int3);
        loginpage.setVisible(false);
    }
    @Then("the Owner users must be increased by {int}")
    public void the_owner_users_must_be_increased_by(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(Owners.size(),oldvalue+int1);
    }




    @Given(": i am a new user with type {string} to be a new supplier")
    public void i_am_a_new_user_with_type_to_be_a_new_supplier(String string) {
        // Write code here that turns the phrase above into concrete actions
        type2=string;
    }
    @Given(": my name is {string} and my age is {int} and my phone number is {int} and password is {int} and email {string} as supplier")
    public void my_name_is_and_my_age_is_and_my_phone_number_is_and_password_is_and_email_as_supplier(String string, Integer int1, Integer int2, Integer int3, String string2) {
        // Write code here that turns the phrase above into concrete actions
        oldvalue= suppliers.size();
        logup(string2,string,int1,int2,int3);
        loginpage.setVisible(false);
    }
    @Then("the Suppliers users must be increased by {int}")
    public void the_suppliers_users_must_be_increased_by(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(suppliers.size(),oldvalue+int1);
    }




    @Given(": i am a new user with type {string} to be a new user")
    public void i_am_a_new_user_with_type_to_be_a_new_user(String string) {
        // Write code here that turns the phrase above into concrete actions
        type2=string;
    }
    @Given(": my name is {string} and my age is {int} and my phone number is {int} and password is {int} and email {string} as user")
    public void my_name_is_and_my_age_is_and_my_phone_number_is_and_password_is_and_email_as_user(String string, Integer int1, Integer int2, Integer int3, String string2) {
        // Write code here that turns the phrase above into concrete actions
        oldvalue= users.size();
        logup(string2,string,int1,int2,int3);
        loginpage.setVisible(false);
    }
    @Then("the User users must be increased by {int}")
    public void the_user_users_must_be_increased_by(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(users.size(),oldvalue+int1);
    }


    @Given("I am a {string} and I want to provide feedback on a product or post")
    public void i_am_a_and_i_want_to_provide_feedback_on_a_product_or_post(String string) {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("I can choose an owner {string} or supplier {string}")
    public void i_can_choose_an_owner_or_supplier(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
    oldName=string2;
    Owners.add(new Owneraccount(string,1,"2",1,1));
    newName=string2;
        suppliers.add(new Suppliers (string2








                ,1,"2",1,1));
    }
    @Then("I write the message of the feedback {string}")
    public void i_write_the_message_of_the_feedback(String string) {

        oldvalue=oldqua=ind1=ind2=0;
        // Write code here that turns the phrase above into concrete actions
        for (int i = 0; i< Owners.size(); i++){
            if(Owners.get(i).getname().equals(oldName)){
                oldvalue= Owners.get(i).messages().size();
                ind1=i;
                sendfeedback(string, Owners.get(i));
            }
        }
        for (int i = 0; i< suppliers.size(); i++){
            if(suppliers.get(i).getname().equals(newName)){
                oldqua= suppliers.get(i).messages().size();
                ind2=i;
                sendfeedback(string, suppliers.get(i));
            }
        }
    }
    @Then("the number of messages to each one must be increased by {int}")
    public void the_number_of_messages_to_each_one_must_be_increased_by(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(oldvalue+int1, Owners.get(ind1).messages().size());
        assertEquals(oldqua+1, suppliers.get(ind2).messages().size());
    }



    @Given(": i am a {string} and i want to evaluate the first post appear to {int}")
    public void i_am_a_and_i_want_to_evaluate_the_first_post_appear_to(String string, Integer int1) {
        // Write code here that turns the phrase above into concrete actions
     newAge=int1;
     oldvalue= posts.getFirst().getRates().size();
     rate_post(int1, posts.getFirst());
    }
    @Then(": the post evaluations mus be increased by {int}")
    public void the_post_evaluations_mus_be_increased_by(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
    assertEquals(oldvalue+int1, posts.getFirst().getRates().size());
    }


    @Given(": i am an {string} and i want to see the accounts in the system")
    public void i_am_an_and_i_want_to_see_the_accounts_in_the_system(String string) {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("this message must be displayed {string}")
    public void this_message_must_be_displayed(String string) {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then(": the system must complete working")
    public void the_system_must_complete_working() {
        // Write code here that turns the phrase above into concrete actions
     assertTrue(true );
    }
    @Given(": i am an {string} and i want to search for the product {string}")
    public void i_am_an_and_i_want_to_search_for_the_product(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
      newName=string2;
    }
    @Then(": the product must appear which is {int}")
    public void the_product_must_appear_which_is(int int1) {
        // Write code here that turns the phrase above into concrete actions
  assertEquals(findProductsByName(products,newName).size(),int1);
    }

    @Given(": i am a {string} and i want to search with fillter with all products that does not have {string}")
    public void i_am_a_and_i_want_to_search_with_fillter_with_all_products_that_does_not_have(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
       newName=string2;
    }
    @Then(": the number of products must appear which is {int}")
    public void the_number_of_products_must_appear_which_is(int int1) {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(findProductsByDescription(products,newName).size(),int1);
    }


    @Given(": i am a {string} and i want to purchase the product {string}")
    public void i_am_a_and_i_want_to_purchase_the_product(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        newName=string2;
        products.add(new Product(newName,10,10,"1/12/2029",0,"",""));
    }
    @Given(": i want to Purchase {int} of this product")
    public void i_want_to_purchase_of_this_product(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
      for (int i = 0; i< products.size(); i++){
 if(products.get(i).getname().equals(newName)){

              oldvalue= products.get(i).getquantity();
              ind1=i;
              break;
          }
      }
        purchase(newName,int1);
      oldqua=int1;
    }
    @Then(": the quantity of that product must be increased by {int} and the number of sells must be increased by {int}")
    public void the_quantity_of_that_product_must_be_increased_by_and_the_number_of_sells_must_be_increased_by(Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(products.get(ind1).getquantity()+oldqua,oldvalue);
         }

    @Given(": i am a {string} and i want to purchase the product {string} but with invalid value")
    public void i_am_a_and_i_want_to_purchase_the_product_but_with_invalid_value(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
       newName=string2;
    }
    @Given(": i want to Purchase {int} of this product and this is less than zero")
    public void i_want_to_purchase_of_this_product_and_this_is_less_than_zero(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        for (int i = 0; i< products.size(); i++){
            if(products.get(i).getname().equals(newName)){

                oldvalue= products.get(i).getquantity();
                ind1=i;
                break;
            }
        }
        purchase(newName,int1);
        oldqua=int1;
    }
    @Then(": nothing will be changed")
    public void nothing_will_be_changed() {
        // Write code here that turns the phrase above into concrete actions
        assertNotEquals(products.get(ind1).getquantity()+oldqua,oldvalue);
    }

    @Given(": i am a {string} and i want to purchase the product {string} but with value that is bigger than the orginal quantity")
    public void i_am_a_and_i_want_to_purchase_the_product_but_with_value_that_is_bigger_than_the_orginal_quantity(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        newName=string2;
    }
    @Given(": i want to Purchase {int} of this product and this is bigger than the orginal quantity")
    public void i_want_to_purchase_of_this_product_and_this_is_bigger_than_the_orginal_quantity(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        for (int i = 0; i< products.size(); i++){
            if(products.get(i).getname().equals(newName)){

                oldvalue= products.get(i).getquantity();
                ind1=i;
                break;
            }
        }
        purchase(newName,int1);
        oldqua=int1;
    }
    @Then(": nothing will be changed for it")
    public void nothing_will_be_changed_for_it() {
        // Write code here that turns the phrase above into concrete actions
        assertNotEquals(products.get(ind1).getquantity()+oldqua,oldvalue);

    }



}
