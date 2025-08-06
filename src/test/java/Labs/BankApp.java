package Labs;

public class BankApp {


	    // Inner Person class
	    static class Person {
	        private String name;
	        private float age;

	        public Person(String name, float age) {
	            this.name = name;
	            this.age = age;
	        }

	        // Getters
	        public String getName() {
	            return name;
	        }

	        public float getAge() {
	            return age;
	        }

	        // toString for person
	        @Override
	        public String toString() {
	            return "Person{Name='" + name + "', Age=" + age + "}";
	        }
	    }

	    // Account class
	    static class Account {
	        private static long accCounter = 1001;
	        private long accNum;
	        private double balance;
	        private Person accHolder;
	        private static final double MIN_BALANCE = 500.0;

	        public Account(Person accHolder, double initialBalance) {
	            this.accNum = accCounter++;
	            this.accHolder = accHolder;
	            this.balance = initialBalance;
	        }

	        public void deposit(double amount) {
	            if (amount > 0) {
	                balance += amount;
	            }
	        }

	        public void withdraw(double amount) {
	            if (balance - amount >= MIN_BALANCE) {
	                balance -= amount;
	            } else {
	                System.out.println("Cannot withdraw ₹" + amount + " from account " + accNum + ": Minimum balance ₹500 must be maintained.");
	            }
	        }

	        public double getBalance() {
	            return balance;
	        }

	        @Override
	        public String toString() {
	            return "Account{" +
	                    "Account Number=" + accNum +
	                    ", Balance=₹" + balance +
	                    ", Holder=" + accHolder +
	                    '}';
	        }
	    }

	    public static void main(String[] args) {
	        // Create accounts
	        Person smith = new Person("Smith", 30);
	        Person kathy = new Person("Kathy", 28);

	        Account smithAcc = new Account(smith, 2000);
	        Account kathyAcc = new Account(kathy, 3000);

	        // b) Deposit 2000 into Smith's account
	        smithAcc.deposit(2000);

	        // c) Withdraw 2000 from Kathy's account
	        kathyAcc.withdraw(2000);

	        // d) Display updated balances
	        System.out.println("Smith's Account Balance: ₹" + smithAcc.getBalance());
	        System.out.println("Kathy's Account Balance: ₹" + kathyAcc.getBalance());

	        // e) Print full account details
	        System.out.println("\nAccount Details:");
	        System.out.println(smithAcc);
	        System.out.println(kathyAcc);
	    }
	}