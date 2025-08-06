package Labs;

public class Person {
	
	    private String name;
	    private float age;

	    public Person(String name, float age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Getters & Setters
	    public String getName() {
	        return name;
	    }

	    public float getAge() {
	        return age;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setAge(float age) {
	        this.age = age;
	    }

	    @Override
	    public String toString() {
	        return "Person{name='" + name + "', age=" + age + "}";
	    }
	}

	abstract class Account {
	    private static long nextAccNum = 100001;
	    protected long accNum;
	    protected double balance;
	    protected Person accHolder;

	    public Account(Person accHolder, double initialBalance) {
	        this.accNum = nextAccNum++;
	        this.accHolder = accHolder;
	        this.balance = initialBalance;
	    }

	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println("Deposited ₹" + amount + " into account " + accNum);
	    }

	    public abstract void withdraw(double amount); // Abstract method

	    public double getBalance() {
	        return balance;
	    }

	    public long getAccNum() {
	        return accNum;
	    }

	    public Person getAccHolder() {
	        return accHolder;
	    }

	    @Override
	    public String toString() {
	        return "Account{accNum=" + accNum +
	               ", balance=₹" + balance +
	               ", accHolder=" + accHolder + "}";
	    }
	}

	class SavingsAccount extends Account {
	    private static final double MIN_BALANCE = 500;

	    public SavingsAccount(Person accHolder, double initialBalance) {
	        super(accHolder, initialBalance);
	        if (initialBalance < MIN_BALANCE) {
	            throw new IllegalArgumentException("Initial balance must be at least ₹500");
	        }
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (balance - amount >= MIN_BALANCE) {
	            balance -= amount;
	            System.out.println("Withdrawn ₹" + amount + " from account " + accNum);
	        } else {
	            System.out.println("Cannot withdraw ₹" + amount + ". Minimum balance of ₹500 must be maintained.");
	        }
	    }
	}

	class Main {
	    public static void main(String[] args) {
	        Person smith = new Person("Smith", 30);
	        Person kathy = new Person("Kathy", 28);

	        SavingsAccount acc1 = new SavingsAccount(smith, 2000);
	        SavingsAccount acc2 = new SavingsAccount(kathy, 3000);

	        acc1.deposit(2000);
	        acc2.withdraw(2000);

	        // Display final account info
	        System.out.println("\nFinal Account Details:");
	        System.out.println(acc1);
	        System.out.println(acc2);
	    }
	}


