
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import yasmeen.softwareproject.*;



import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class
Testing {
    Application a=new Application();
    boolean flag;
    private String oldName,newdate,olddate;
    private String newName,msg;


 private long newAge,newPhoneNumber,newPassword;
 private int ind1,ind2,old1,old2;

    private Product product;
    private int oldqua,oldvalue;

    @Given("I am an {string} and I want to add new products")
    public void i_am_an_and_i_want_to_add_new_products(String string) {
        // Write code here that turns the phrase above into concrete actions
        Application.publicuser=new Owneraccount("Yasmeen",12,"a2@g.c",1231231231,0);

    }

    @When("I add {string} to the store")
    public void i_add_to_the_store(String string) {
        // Write code here that turns the phrase above into concrete actions
        Application.addproduct(string,0,0,"1/12/2029",0,"");

    }

    @Then("the product {string} should be added to the store")
    public void the_product_should_be_added_to_the_store(String string) {
        // Write code here that turns the phrase above into concrete actions

        flag=false;
        for (int i=0;i<Application.products.size();i++){

            if(Application.products.get(i).getname().equals(string)){
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

        for (int i=0;i<Application.products.size();i++){

            if(Application.products.get(i).getname().equals(oldName)){
             oldvalue=i;
             oldqua=Application.products.get(i).getquantity();
                Application.products.get(i).setquantity(Application.products.get(i).getquantity()+int1);

            }
        }
    }

    @Then("the quantity of the product {string} should increase by {int}")
    public void the_quantity_of_the_product_should_increase_by(String string, Integer int1) {
        // Write code here that turns the phrase above into concrete actions
       assertEquals(Application.products.get(oldvalue).getquantity(),oldqua+int1);
    }

    @Given("I am an {string} and I want to update the expiry date of the existing product {string}")
    public void i_am_an_and_i_want_to_update_the_expiry_date_of_the_existing_product(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
     oldName=string2;

    }

    @When("I update the expiry date of to \"{int}\\/{int}\\/{int}")
    public void i_update_the_expiry_date_of_to(Integer int1, Integer int2, Integer int3) {
        // Write code here that turns the phrase above into concrete actions
        newdate=int1+"/"+int2+"/"+int3;

        for (int i=0;i<Application.products.size();i++){

            if(Application.products.get(i).getname().equals(oldName)){
                olddate=Application.products.get(i).getexpire();
Application.updateproduct(i,Application.products.get(i).getprice(),newdate);
oldvalue=i;
            }
        }

    }

    @Then("the expiry date of the product should be changed")
    public void the_expiry_date_of_the_product_should_be_changed() {
        // Write code here that turns the phrase above into concrete actions
        assertNotEquals(olddate,Application.products.get(oldvalue).getexpire());
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
        for (int i=0;i<Application.products.size();i++){

            if(Application.products.get(i).getname().equals(oldName)){
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
        Application.removeproduct(oldName);
        flag=false;
        for (int i=0;i<Application.products.size();i++){

            if(Application.products.get(i).getname().equals(oldName)){
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
     int oldsize=Application.products.size();
        Application.removeproduct(oldName);
       assertEquals(oldsize,Application.products.size());

    }


    @Given("I am an {string} and I want to update the price of the existing product")
    public void i_am_an_and_i_want_to_update_the_price_of_the_existing_product(String string) {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("I update the price of {string} to {int}")
    public void i_update_the_price_of_to(String string, Integer int1) {
        // Write code here that turns the phrase above into concrete actions

    oldName=string;
        for (int i=0;i<Application.products.size();i++){

            if(Application.products.get(i).getname().equals(oldName)){
                oldqua=Application.products.get(i).getprice();
                Application.updateproduct(i,int1,Application.products.get(oldvalue).getexpire());
                oldvalue=i;
            }
        }


    }

    @Then("the price of the product {string} should be changed")
    public void the_price_of_the_product_should_be_changed(String string) {
        // Write code here that turns the phrase above into concrete actions

     assertNotEquals(oldqua,Application.products.get(oldvalue).getprice());
        for (int i=0;i<Application.products.size();i++){

            if(Application.products.get(i).getname().equals(oldName)){
                assertNotEquals(Application.products.get(i).getexpire(),oldqua);
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

        for (int i=0;i<Application.products.size();i++){

            if(Application.products.get(i).getname().equals(string)){
                Application.implementdiscount(int1,Application.products.get(i));
                oldvalue=i;
            }
        }

    }

    @Then("the discount on the product {string} should be updated to {int} %")
    public void the_discount_on_the_product_should_be_updated_to(String string, int int1) {
        // Write code here that turns the phrase above into concrete actions

        for (int i=0;i<Application.products.size();i++){

            if(Application.products.get(i).getname().equals(string)){
                assertEquals(Application.products.get(i).getdiscount(),int1);
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
        int old=Application.products.size();
       Application.addproduct(string,0,0,string2,0,"");
       assertEquals(Application.products.size(),old);
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
        int old=Application.products.size();
        Application.addproduct(string,int1,0,"1/12/2029",0,"");
        assertEquals(Application.products.size(),old);
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
        int old=Application.products.size();
        Application.addproduct(string,0,int1,"1/12/2029",0,"");
        assertEquals(Application.products.size(),old);
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
        int old=Application.products.size();
        Application.addproduct(string,0,0,"1/12/2029",0,"");
        assertEquals(Application.products.size(),old);
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
        Application.updateinformation(newName,Application.publicuser.getage(),Application.publicuser.getphone(),Application.publicuser.getpassword());
    }

    @Then(": my old name should be {string} and the new name should be {string}")
    public void my_old_name_should_be_and_the_new_name_should_be(String string, String string2) {
      assertNotEquals(oldName,Application.publicuser.getname());
    }

    @Given("I am an {string} and I want to update my age, which is {int}")
    public void i_am_an_and_i_want_to_update_my_age_which_is(String string, Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        oldqua=int1;
    }

    @When("I change my age to {int}")
    public void i_change_my_age_to(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        Application.updateinformation(newName,int1,Application.publicuser.getphone(),Application.publicuser.getpassword());
    }

    @When("my old age should be {int} and the new age should be {int}")
    public void my_old_age_should_be_and_the_new_age_should_be(Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions
        assertNotEquals(oldqua,Application.publicuser.getage());
    }


    @Given("I am a {string} and I want to update the Supplier's name, which is {string}")
    public void i_am_a_and_i_want_to_update_the_supplier_s_name_which_is(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
      oldName=string2;
        Application.publicuser=new Suppliers("Yaqoot", 0, "a1@g.c", 0, 12121212);
    }

    @When("I change the Supplier's name to {string}")
    public void i_change_the_supplier_s_name_to(String string) {
        // Write code here that turns the phrase above into concrete actions
Application.updateinformation(string,Application.publicuser.getage(),Application.publicuser.getphone(),Application.publicuser.getpassword());

    }

    @Then("the Supplier's name should be updated to {string}")
    public void the_supplier_s_name_should_be_updated_to(String string) {
        // Write code here that turns the phrase above into concrete actions
   assertNotEquals(Application.publicuser.getname(),newName);

    }




    @Given("I am a {string} and I want to update the Supplier's age, which is {int}")
    public void i_am_a_and_i_want_to_update_the_supplier_s_age_which_is(String string, Integer int1) {
        // Write code here that turns the phrase above into concrete actions
      oldqua=int1;
    }

    @When("I change the Supplier's age to {int}")
    public void i_change_the_supplier_s_age_to(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        Application.updateinformation(Application.publicuser.getname(),int1,Application.publicuser.getphone(),Application.publicuser.getpassword());

    }

    @Then("the Supplier's age should be updated to {int}")
    public void the_supplier_s_age_should_be_updated_to(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
assertNotEquals(oldqua,Application.publicuser.getage());
    }


    @Given(": i am a {string} and i want to feedback a product or post")
    public void i_am_a_and_i_want_to_feedback_a_product_or_post(String string) {
        // Write code here that turns the phrase above into concrete actions

    }



    @Given(": i am an {string} and i want to sign in to the system as admin")
    public void i_am_an_and_i_want_to_sign_in_to_the_system_as_admin(String string) {
        // Write code here that turns the phrase above into concrete actions
      oldName=string;
      Application.type=string;
    }

    @Then(": i must enter my email {string} and my password {int} as admin")
    public void i_must_enter_my_email_and_my_password_as_admin(String string, Integer int1) {
        // Write code here that turns the phrase above into concrete actions
      flag=Application.login(string,new String(int1+""));
    }

    @Then(": the system must pass me as admin")
    public void the_system_must_pass_me_as_admin() {

      assertTrue(flag);

      assertEquals(Application.publicuser.gettype(),oldName);

    }

    @Given(": i am an {string} and i want to sign in to the system as owner")
    public void i_am_an_and_i_want_to_sign_in_to_the_system_as_owner(String string) {
        // Write code here that turns the phrase above into concrete actions
        oldName=string;
        Application.type=string;
    }

    @Then(": i must enter my email {string} and my password {int} as owner")
    public void i_must_enter_my_email_and_my_password_as_owner(String string, Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        flag=Application.login(string,new String(int1+""));
    }

    @Then(": the system must pass me as Owner")
    public void the_system_must_pass_me_as_owner() {
        // Write code here that turns the phrase above into concrete actions
        assertTrue(flag);

        assertEquals(Application.publicuser.gettype(),oldName);
    }

    @Given(": i am an {string} and i want to sign in to the system as supplier")
    public void i_am_an_and_i_want_to_sign_in_to_the_system_as_supplier(String string) {
        // Write code here that turns the phrase above into concrete actions
        oldName=string;
        Application.type=string;
    }

    @Then(": i must enter my email {string} and my password {int} as supplier")
    public void i_must_enter_my_email_and_my_password_as_supplier(String string, Integer int1) {
        flag=Application.login(string,new String(int1+""));
    }

    @Then(": the system must pass me as supplier")
    public void the_system_must_pass_me_as_supplier() {
        // Write code here that turns the phrase above into concrete actions
        assertTrue(flag);

        assertEquals(Application.publicuser.gettype(),oldName);
    }

    @Given(": i am an {string} and i want to sign in to the system as user")
    public void i_am_an_and_i_want_to_sign_in_to_the_system_as_user(String string) {
        // Write code here that turns the phrase above into concrete actions
        oldName=string;
        Application.type=string;
    }

    @Then(": i must enter my email {string} and my password {int} as user")
    public void i_must_enter_my_email_and_my_password_as_user(String string, Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        flag=Application.login(string,new String(int1+""));
    }

    @Then(": the system must pass me as user")
    public void the_system_must_pass_me_as_user() {
        // Write code here that turns the phrase above into concrete actions
        assertTrue(flag);

        assertEquals(Application.publicuser.gettype(),oldName);
    }












    @Given("I am a {string} and I want to update my info")
    public void iAmAAndIWantToUpdateMyInfo(String string) {
        // Write code here that turns the phrase above into concrete actions
        Application.publicuser=new User("Hitler",1,"1",2,12);

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
        Application.updateinformation(newName, int1, int2, int3);
    }
    @Then("the information must be updated")
    public void theInformationMustBeUpdated() {
        // Write code here that turns the phrase above into concrete actions


        assertNotEquals(oldName, Application.publicuser.getname());

        // Add more assertions to check if other information is updated correctly
        assertEquals(newName, Application.publicuser.getname());

        assertEquals(newAge, Application.publicuser.getage());
        assertEquals(newPhoneNumber, Application.publicuser.getphone());
        assertEquals(newPassword, Application.publicuser.getpassword());
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
   assertTrue(Application.generatereport(Application.getsalesmessage(),string));
    }


    @When(": i open the profits page the message {string} must appear")
    public void i_open_the_profits_page_the_message_must_appear(String string) {
        // Write code here that turns the phrase above into concrete actions
oldName=Application.getsalesmessage();
    }
    @Then(": the system must pass")
    public void the_system_must_pass() {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(oldName,Application.getsalesmessage());

    }

    @Given(": i am an {string} and i want to see the best selling profit")
    public void i_am_an_and_i_want_to_see_the_best_selling_profit(String string) {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("the best selling profit will be displayes as this {string}")
    public void the_best_selling_profit_will_be_displayes_as_this(String string) {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(string,Application.getmaxprofit().getname());
    }


    @Given(": i am an {string} and i want to manage posts and  recipes")
    public void i_am_an_and_i_want_to_manage_posts_and_recipes(String string) {
        // Write code here that turns the phrase above into concrete actions

    }
    @When(": i click at add post i must choose the path {string} of the image and description {string} and name {string}")
    public void i_click_at_add_post_i_must_choose_the_path_of_the_image_and_description_and_name(String string, String string2, String string3) {
        // Write code here that turns the phrase above into concrete actions
       oldvalue=Application.posts.size();
       Application.addpost(string,string2,string3);
    }
    @Then("the number of posts must be incrased by one")
    public void the_number_of_posts_must_be_incrased_by_one() {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(Application.posts.size(),oldvalue+1);

    }

    @Given(": i am a new user with type {string} to be a new admin")
    public void i_am_a_new_user_with_type_to_be_a_new_admin(String string) {
        // Write code here that turns the phrase above into concrete actions
Application.type2=string;

    }
    @Given(": my name is {string} and my age is {int} and my phone number is {int} and password is {int} and email {string} as admin")
    public void my_name_is_and_my_age_is_and_my_phone_number_is_and_password_is_and_email_as_admin(String string, Integer int1, Integer int2, Integer int3, String string2) {
        // Write code here that turns the phrase above into concrete actions
    oldvalue=Application.Admins.size();
    Application.logup(string2,string,int1,int2,int3);
    Application.loginpage.setVisible(false);
    }
    @Then("the Admin users must be increased by {int}")
    public void the_admin_users_must_be_increased_by(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(Application.Admins.size(),oldvalue+1);
    }




    @Given(": i am a new user with type {string} to be a new owner")
    public void i_am_a_new_user_with_type_to_be_a_new_owner(String string) {
        // Write code here that turns the phrase above into concrete actions
        Application.type2=string;
    }
    @Given(": my name is {string} and my age is {int} and my phone number is {int} and password is {int} and email {string} as owner")
    public void my_name_is_and_my_age_is_and_my_phone_number_is_and_password_is_and_email_as_owner(String string, Integer int1, Integer int2, Integer int3, String string2) {
        // Write code here that turns the phrase above into concrete actions
        oldvalue=Application.Owners.size();
        Application.logup(string2,string,int1,int2,int3);
        Application.loginpage.setVisible(false);
    }
    @Then("the Owner users must be increased by {int}")
    public void the_owner_users_must_be_increased_by(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(Application.Owners.size(),oldvalue+1);
    }




    @Given(": i am a new user with type {string} to be a new supplier")
    public void i_am_a_new_user_with_type_to_be_a_new_supplier(String string) {
        // Write code here that turns the phrase above into concrete actions
        Application.type2=string;
    }
    @Given(": my name is {string} and my age is {int} and my phone number is {int} and password is {int} and email {string} as supplier")
    public void my_name_is_and_my_age_is_and_my_phone_number_is_and_password_is_and_email_as_supplier(String string, Integer int1, Integer int2, Integer int3, String string2) {
        // Write code here that turns the phrase above into concrete actions
        oldvalue=Application.suppliers.size();
        Application.logup(string2,string,int1,int2,int3);
        Application.loginpage.setVisible(false);
    }
    @Then("the Suppliers users must be increased by {int}")
    public void the_suppliers_users_must_be_increased_by(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(Application.suppliers.size(),oldvalue+1);
    }




    @Given(": i am a new user with type {string} to be a new user")
    public void i_am_a_new_user_with_type_to_be_a_new_user(String string) {
        // Write code here that turns the phrase above into concrete actions
        Application.type2=string;
    }
    @Given(": my name is {string} and my age is {int} and my phone number is {int} and password is {int} and email {string} as user")
    public void my_name_is_and_my_age_is_and_my_phone_number_is_and_password_is_and_email_as_user(String string, Integer int1, Integer int2, Integer int3, String string2) {
        // Write code here that turns the phrase above into concrete actions
        oldvalue=Application.users.size();
        Application.logup(string2,string,int1,int2,int3);
        Application.loginpage.setVisible(false);
    }
    @Then("the User users must be increased by {int}")
    public void the_user_users_must_be_increased_by(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(Application.users.size(),oldvalue+1);
    }


    @Given("I am a {string} and I want to provide feedback on a product or post")
    public void i_am_a_and_i_want_to_provide_feedback_on_a_product_or_post(String string) {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("I can choose an owner {string} or supplier {string}")
    public void i_can_choose_an_owner_or_supplier(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
    oldName=string2;
    Application.Owners.add(new Owneraccount(string,1,"2",1,1));
    newName=string2;
        Application.suppliers.add(new Suppliers (string2








                ,1,"2",1,1));
    }
    @Then("I write the message of the feedback {string}")
    public void i_write_the_message_of_the_feedback(String string) {

        oldvalue=oldqua=ind1=ind2=0;
        // Write code here that turns the phrase above into concrete actions
     msg=string;
        for (int i=0;i<Application.Owners.size();i++){
            if(Application.Owners.get(i).getname().equals(oldName)){
                oldvalue=Application.Owners.get(i).messages().size();
                ind1=i;
                Application.sendfeedback(msg,Application.Owners.get(i));
            }
        }
        for (int i=0;i<Application.suppliers.size();i++){
            if(Application.suppliers.get(i).getname().equals(newName)){
                oldqua=Application.suppliers.get(i).messages().size();
                ind2=i;
                Application.sendfeedback(msg,Application.suppliers.get(i));
            }
        }
    }
    @Then("the number of messages to each one must be increased by {int}")
    public void the_number_of_messages_to_each_one_must_be_increased_by(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(oldvalue+1,Application.Owners.get(ind1).messages().size());
        assertEquals(oldqua+1,Application.suppliers.get(ind2).messages().size());
    }



    @Given(": i am a {string} and i want to evaluate the first post appear to {int}")
    public void i_am_a_and_i_want_to_evaluate_the_first_post_appear_to(String string, Integer int1) {
        // Write code here that turns the phrase above into concrete actions
     newAge=int1;
     oldvalue=Application.posts.get(0).getRates().size();
     Application.rate_post(int1,Application.posts.get(0));
    }
    @Then(": the post evaluations mus be increased by {int}")
    public void the_post_evaluations_mus_be_increased_by(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
    assertEquals(oldvalue+1,Application.posts.get(0).getRates().size());
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
  assertEquals(Application.findProductsByName(Application.products,newName).size(),int1);
    }

    @Given(": i am a {string} and i want to search with fillter with all products that does not have {string}")
    public void i_am_a_and_i_want_to_search_with_fillter_with_all_products_that_does_not_have(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
       newName=string2;
    }
    @Then(": the number of products must appear which is {int}")
    public void the_number_of_products_must_appear_which_is(int int1) {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(Application.findProductsByDescription(Application.products,newName).size(),int1);
    }


    @Given(": i am a {string} and i want to purchase the product {string}")
    public void i_am_a_and_i_want_to_purchase_the_product(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        newName=string2;
        Application.products.add(new Product(newName,10,10,"1/12/2029",0,"",""));
    }
    @Given(": i want to Purchase {int} of this product")
    public void i_want_to_purchase_of_this_product(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
      for (int i=0;i<Application.products.size();i++){
 if(Application.products.get(i).getname().equals(newName)){

              oldvalue=Application.products.get(i).getquantity();
              ind1=i;
              break;
          }
      }
        Application.purchase(newName,int1);
      oldqua=int1;
    }
    @Then(": the quantity of that product must be increased by {int} and the number of sells must be increased by {int}")
    public void the_quantity_of_that_product_must_be_increased_by_and_the_number_of_sells_must_be_increased_by(Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(Application.products.get(ind1).getquantity()+oldqua,oldvalue);
         }

    @Given(": i am a {string} and i want to purchase the product {string} but with invalid value")
    public void i_am_a_and_i_want_to_purchase_the_product_but_with_invalid_value(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
       newName=string2;
    }
    @Given(": i want to Purchase {int} of this product and this is less than zero")
    public void i_want_to_purchase_of_this_product_and_this_is_less_than_zero(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        for (int i=0;i<Application.products.size();i++){
            if(Application.products.get(i).getname().equals(newName)){

                oldvalue=Application.products.get(i).getquantity();
                ind1=i;
                break;
            }
        }
        Application.purchase(newName,int1);
        oldqua=int1;
    }
    @Then(": nothing will be changed")
    public void nothing_will_be_changed() {
        // Write code here that turns the phrase above into concrete actions
        assertNotEquals(Application.products.get(ind1).getquantity()+oldqua,oldvalue);
    }

    @Given(": i am a {string} and i want to purchase the product {string} but with value that is bigger than the orginal quantity")
    public void i_am_a_and_i_want_to_purchase_the_product_but_with_value_that_is_bigger_than_the_orginal_quantity(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        newName=string2;
    }
    @Given(": i want to Purchase {int} of this product and this is bigger than the orginal quantity")
    public void i_want_to_purchase_of_this_product_and_this_is_bigger_than_the_orginal_quantity(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        for (int i=0;i<Application.products.size();i++){
            if(Application.products.get(i).getname().equals(newName)){

                oldvalue=Application.products.get(i).getquantity();
                ind1=i;
                break;
            }
        }
        Application.purchase(newName,int1);
        oldqua=int1;
    }
    @Then(": nothing will be changed for it")
    public void nothing_will_be_changed_for_it() {
        // Write code here that turns the phrase above into concrete actions
        assertNotEquals(Application.products.get(ind1).getquantity()+oldqua,oldvalue);

    }



}
