import java.util.Scanner;

import src.model.Cash;
import src.model.CreditCard;
import src.model.Customer;
import src.model.PaymentMethod;
import src.model.Pistol;
import src.model.Rifle;
import src.model.Store;
import src.model.Weapon;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("+-----------------------------------------------------------------------------------------------+");
        System.out.println("|                                          NWORD GUNSHOP                                        |");
        System.out.println("+-----------------------------------------------------------------------------------------------+");

        // Pilih metode pembayaran
        System.out.println("Pilih Metode Pembayaran: ");
        System.out.println("1. Tunai | 2. Kartu Kredit");
        int paymentChoice = scanner.nextInt();
        PaymentMethod paymentMethod;

        if (paymentChoice == 1) {
            System.out.print("Masukkan uang anda: ");
            double cashBalance = scanner.nextDouble();
            paymentMethod = new Cash(cashBalance);
        } else {
            System.out.print("Masukkan nomor kartu kredit: ");
            String cardNumber = scanner.next();
            System.out.print("Masukkan batas kredit: ");
            double creditLimit = scanner.nextDouble();
            paymentMethod = new CreditCard(cardNumber, creditLimit);
        }

        Store store = new Store();
        store.addWeapon(new Pistol("Glock 17", 500.0, 10, 9.0));
        store.addWeapon(new Pistol("Desert Eagle", 1200.0, 7, 12.0));
        store.addWeapon(new Rifle("AK-47", 1500.0, 5, 800));
        store.addWeapon(new Rifle("M16", 1700.0, 3, 900));
        
        Customer customer = new Customer("Asep", paymentMethod);

        boolean buying = true;
        while (buying) {
            System.out.println();
            System.out.println("Cecep: Halo, " + customer.getName() + "! Apakah senjata mana yang ingin kamu beli?");
            store.tampilkanStock();
            System.out.println("| Masukkan nomor senjata yang ingin dibeli (0 untuk selesai): ");
            System.out.println("+-------------------------------------------------------------------------------------------+");
            int choice = scanner.nextInt();
            
            if (choice == 0) {
                buying = false;
            } else {
                Weapon selectedWeapon = store.selectWeapon(choice - 1);
                if (selectedWeapon != null) {
                    customer.buyWeapon(selectedWeapon);
                } else {
                    System.out.println("+-----------------------------------------------+");
                    System.out.println("| Pilihan tidak tersedia! ");
                    System.out.println("+-----------------------------------------------+");
                }
            }
        }

        // Terapkan diskon jika total pembelian melebihi $1000
        customer.displayPurchasedWeapons();
        customer.applyDiscount();
        customer.displayTotalPurchase();
        scanner.close();

        System.out.println("Hi " + customer.getName() + ", Senang berbisnis dengan anda! ");
        
        System.out.println("+--------------------------------------------------------------------------------------------+");
        System.out.println("|                          Created by: Asep  a.k.a Septian Adhitya N.                        |");
        System.out.println("+--------------------------------------------------------------------------------------------+");
    }
}
