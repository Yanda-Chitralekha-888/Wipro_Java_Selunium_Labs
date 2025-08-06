package Labs;

public class BankSystem {
	

	    //Account
	    static class Account {
	        protected long accNum;
	        protected double balance;
	        protected String accHolder;
	        private static long counter = 1000;

	        public Account(String accHolder, double balance) {
	            this.accNum = ++counter;
	            this.accHolder = accHolder;
	            this.balance = balance;
	        }

	        public boolean withdraw(double amount) {
	            if (balance >= amount) {
	                balance -= amount;
	                return true;
	            }
	            return false;
	        }

	        public void deposit(double amount) {
	            balance += amount;
	        }

	        public double getBalance() {
	            return balance;
	        }

	       
	        public String toString() {
	            return "Account Number: " + accNum + ", Holder: " + accHolder + ", Balance: ₹" + balance;
	        }
	    }

	    // Derived class: SavingsAccount
	    static class SavingsAccount extends Account {
	        private final double minimumBalance = 500;

	        public SavingsAccount(String accHolder, double balance) {
	            super(accHolder, balance);
	        }

	        public boolean withdraw(double amount) {
	            if (balance - amount >= minimumBalance) {
	                balance -= amount;
	                return true;
	            } else {
	                System.out.println("Withdrawal denied. Must maintain ₹" + minimumBalance + " in Savings Account.");
	                return false;
	            }
	        }
	    }

	    //  CurrentAccount
	    static class CurrentAccount extends Account {
	        private double overdraftLimit = 1000;

	        public CurrentAccount(String accHolder, double balance) {
	            super(accHolder, balance);
	        }

	        @Override
	        public boolean withdraw(double amount) {
	            if (balance - amount >= -overdraftLimit) {
	                balance -= amount;
	                return true;
	            } else {
	                System.out.println("❌ Withdrawal denied. Overdraft limit of ₹" + overdraftLimit + " exceeded.");
	                return false;
	            }
	        }
	    }

	    
	    public static void main(String[] args) {
	        SavingsAccount sa = new SavingsAccount("Smith", 2000);
	        CurrentAccount ca = new CurrentAccount("Kathy", 3000);

	        System.out.println("Initial Balances:");
	        System.out.println(sa);
	        System.out.println(ca);

	        // Try withdrawal
	        System.out.println("\nWithdrawing ₹1700 from Smith (Savings)...");
	        sa.withdraw(1700); 

	        System.out.println("\nWithdrawing ₹1500 from Kathy (Current)...");
	        ca.withdraw(1500);

	        System.out.println("\nWithdrawing ₹3000 from Kathy (Current)...");
	        ca.withdraw(3000);  
	        //  updated balances
	        System.out.println("\nUpdated Balances:");
	        System.out.println(sa);
	        System.out.println(ca);
	    }
	}

