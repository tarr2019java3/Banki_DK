package pl.sda.banki;

public class Main {

//      Zły trop :<
//    public static void przypiszBank(User user, BankAccount bank){
//        System.out.println("Imię: " + user.getName());
//        System.out.println("Nazwisko: " + user.getLastName());
//        System.out.println("Wiek: " + user.getAge());
//        System.out.println("Nazwa Banku: " + bank.getName());
//        System.out.println("Numer konta: " + bank.getAccountNumber());
//        System.out.println("Saldo: " + bank.getBalance());
//        System.out.println();
//    }

    public static void main(String[] args) {

        User user1 = new User("Jan", "Kowalski", 44);
        User user2 = new User("Marcin", "Nowak", 66);
        User user3 = new User("Katarzyna", "Dobroń", 33);
        User user4 = new User("Ola", "Lewandowska", 33);

        BankAccount bank1 = new BankAccount(1, "BankDlaBogatych", 5555, 6555);
        BankAccount bank2 = new BankAccount(2,"Bank Nowoczesny", 4444, 6532455);
        BankAccount bank3 = new BankAccount(3, "Bank", 3333, 234234);
        BankAccount bank4 = new BankAccount(4, "BigBank", 2222, 2342);

        user1.setBankAccount(bank1);
        user2.setBankAccount(bank2);
        user3.setBankAccount(bank3);
        user4.setBankAccount(bank4);

        System.out.println(user1.getBankAccount().getBalance());
        System.out.println(user2.getBankAccount().getBalance());
        System.out.println(user3.getBankAccount().getBalance());
        System.out.println(user4.getBankAccount().getBalance());

    }

}
