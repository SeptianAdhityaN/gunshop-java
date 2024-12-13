package view;

import controller.CustomerController;
import controller.WeaponController;
import model.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WeaponView weaponView = new WeaponView();
        WeaponController weaponController = new WeaponController();
        CustomerView customerView = new CustomerView();
        
        System.out.println("+================================================================================================+");
        System.out.println("|                                         Asep Gunshop                                           |");
        System.out.println("+================================================================================================+");

        System.out.println("Pilih Metode Pembayaran: ");
        System.out.println("1. Tunai | 2. Kartu Kredit");
        int paymentChoice = scanner.nextInt();
        PaymentMethod paymentMethod;

        if (paymentChoice == 1) {
            System.out.print("Masukkan uang anda: ");
            double cashBalance = scanner.nextDouble();
            
            /* !!! Mengganti class Cash menjadi UpdatedCash !!! */

            // paymentMethod = new Cash(cashBalance);
            paymentMethod = new UpdatedCash(cashBalance);
        } else {
            System.out.print("Masukkan nomor kartu kredit: ");
            String cardNumber = scanner.next();
            System.out.print("Masukkan batas kredit: ");
            double creditLimit = scanner.nextDouble();
            paymentMethod = new CreditCard(cardNumber, creditLimit);
        }

        weaponController.addWeapon(new Pistol("Glock 17", 500.0, 10, 9.0));
        weaponController.addWeapon(new Pistol("Desert Eagle", 1200.0, 7, 12.0));
        weaponController.addWeapon(new Rifle("AK-47", 1500.0, 5, 800));
        weaponController.addWeapon(new Rifle("M16", 1700.0, 3, 900));

        CustomerController customerController = new CustomerController(paymentMethod);

        boolean buying = true;
        while (buying) {
            weaponView.displayStock(weaponController.getStockList());
            System.out.println("Masukkan nomor senjata yang ingin dibeli (0 untuk selesai): ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                buying = false;
            } else if (choice > 0 && choice <= weaponController.getStockList().size()) {
                Weapon selectedWeapon = weaponController.selectWeapon(choice - 1);
                customerController.buyWeapon(selectedWeapon);
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }

        customerView.displayPurchasedWeapons(customerController.getPurchasedWeapons());
        customerView.displayTotalPurchase(customerController.getTotalSpent());

        scanner.close();
        System.out.println("+================================================================================================+");
        System.out.println("|                           created by: Septian Adhitya Nugroho aka. Asep                        |");
        System.out.println("+================================================================================================+");
    }
}
