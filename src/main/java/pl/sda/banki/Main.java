package pl.sda.banki;

public class Main {

    public static void przypiszBank(User user, BankAccount bank){
        System.out.println("Imię: " + user.getName());
        System.out.println("Nazwisko: " + user.getLastName());
        System.out.println("Wiek: " + user.getAge());
        System.out.println("Nazwa Banku: " + bank.getName());
        System.out.println("Numer konta: " + bank.getAccountNumber());
        System.out.println("Saldo: " + bank.getBalance());
        System.out.println();
    }

    public static void main(String[] args) {

        User user1 = new User("Jan", "Kowalski", 44);
        User user2 = new User("Marcin", "Nowak", 66);
        User user3 = new User("Katarzyna", "Dobroń", 33);
        User user4 = new User("Ola", "Lewandowska", 33);

        BankAccount bank1 = new BankAccount(1, "BankDlaBogatych", 5555, 6555);
        BankAccount bank2 = new BankAccount(2,"Bank Nowoczesny", 4444, 6532455);
        BankAccount bank3 = new BankAccount(3, "Bank", 3333, 234234);
        BankAccount bank4 = new BankAccount(4, "BigBank", 2222, 2342);

       Main.przypiszBank(user1, bank1);
       Main.przypiszBank(user2, bank2);
       Main.przypiszBank(user3, bank3);
       Main.przypiszBank(user4, bank4);


    }

}
