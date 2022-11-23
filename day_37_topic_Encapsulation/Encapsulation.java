/* Topic :- Encapsulation
Encapsulation in Java is a process of wrapping code and data together into a single unit, for example, a capsule which is mixed of several medicines.
We can create a fully encapsulated class in Java by making all the data members of the class private.
Now we can use setter and getter methods to set and get the data in it.The Java Bean class is the example of a fully encapsulated class.
  
Program:- Create Encapsulated class of Account which contains private data member and with the help of getter and setter method show all the detail of Account.
  
Output:- Account no is :- 9199457676
                          Account Holder Name :-Sandeep Kumar
                          Email:-SandeepKumar2022@Vitbhopal.com
                          Total Amount:-500000.0
                      
Code with Explanation:- */
  
 package company.com;

 class ACCOUNT {
   
       //private data members
   
        private long acc_no;
        private String name,email;
        private float amount;
   
        //public getter and setter methods
   
        public long getAcc_no() {
            return acc_no;
        }
        public void setAcc_no(long acc_no) {
            this.acc_no = acc_no;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public float getAmount() {
            return amount;
        }
        public void setAmount(float amount) {
            this.amount = amount;
        }
 }

//A Java class to test the encapsulated class Account.

public class Encapsulation {
    public static void main(String[] args) {
        //creating instance of Account class
        ACCOUNT acc=new ACCOUNT();
        //setting values through setter methods
        acc.setAcc_no(9199457676L);
        acc.setName("Sandeep Kumar");
        acc.setEmail("SandeepKumar2022@Vitbhopal.com");
        acc.setAmount(500000f);
        //getting values through getter methods
        System.out.println("Account no is :- "+acc.getAcc_no());
        System.out.println("Account Holder Name :-"+acc.getName());
        System.out.println("Email:-" +acc.getEmail());
        System.out.println("Total Amount:-"+acc.getAmount());
    }
}
