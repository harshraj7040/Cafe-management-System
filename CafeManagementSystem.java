import java.util.*;
import java.io.*;

/*********
 * Home page for Cafe management Syatem
 **********/

class MainMenu {
  public void menu() {
    System.out.println("\t\t         ***************");
    System.out.println("\t\t\t     CAFE MANAGEMENT SYSTEM");
    System.out.println("\t\t          ***************");
    System.out.println("\t\t\t       --------------------");
    System.out.println("\t\t\t  Created By Aakash,Harsh,Nakesh");
    System.out.println("\t\t\t       --------------------");
    System.out.println("\n\nPress 1 : To Add an Customer's Details");
    System.out.println("Press 2 : To Take Orders ");
    System.out.println("Press 3 : To see customer details");
    System.out.println("Press 4 : To Exit the EMS Portal");

  }
}

/******** To add details of Customer *******/

class Cust_Add {
  public void createFile() {
    Scanner sc = new Scanner(System.in);

    CustDetail cus = new CustDetail();
    cus.getInfo();
    try {
      File f1 = new File("file" + cus.cust_id + ".txt");
      if (f1.createNewFile()) {
        FileWriter myWriter = new FileWriter("file" + cus.cust_id + ".txt");
        myWriter.write("Customer ID:" + cus.cust_id + "\n" + "Customer Name     :" + cus.name + "\n" +
            "Email Information :" + cus.email + "\n" + "Customer D.O.B     :" + cus.D_O_B + "\n" +
            "Customer Contact  :" + cus.cust_contact + "\n");
        myWriter.close();
        System.out.println("\nCustomer has been Added :)\n");

        System.out.print("\nPress Enter to Continue...");
        sc.nextLine();
      } else {
        System.out.println("\nCustomer already exists :(");
        System.out.print("\nPress Enter to Continue...");
        sc.nextLine();
      }
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}

/********* Taking Customer's Details *********/

class CustDetail {
  String name;
  String email;
  String cust_id;
  String D_O_B;
  String cust_contact;

  public void getInfo() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Customer's ID ----------: ");
    cust_id = sc.nextLine();
    System.out.print("Enter Customer's name --------: ");
    name = sc.nextLine();
    System.out.print("Enter Customer's Email ID ----: ");
    email = sc.nextLine();
    System.out.print("Enter Customer's D_O_B ----: ");
    D_O_B = sc.nextLine();
    System.out.print("Enter Customer contact No. --: ");
    cust_contact = sc.nextLine();
  }
}

/********* Taking orders ********/

class Order_Call {

  public void menu() {
    System.out.println("\t\t\t\t+===================================+");
    System.out.println("\t\t\t\t           Btech Dhaba wala          ");
    System.out.println("\t\t\t\t  Item code   Item name      Item Price");
    System.out.println("\t\t\t\t   1.        Normal Thali      145.00");
    System.out.println("\t\t\t\t   2.        Special Thali     240.00");
    System.out.println("\t\t\t\t   3.        Rajbhog Thali     330.00");
    System.out.println("\t\t\t\t   4.        CANCEL             ------");
    System.out.println("\t\t\t\t+====================================+");
  }

  public void det() {
    Scanner sc = new Scanner(System.in);
    String ord_id;
    String cust_id;
    System.out.print("Enter Customer's ID ----------: ");
    cust_id = sc.nextLine();
    System.out.print("Enter order's ID ----------: ");
    ord_id = sc.nextLine();
  }

  public void order() {
    System.out.println("Enter Item Code: -  ");
    Scanner sc = new Scanner(System.in);
    int choose, quantity = 1;
    int total = 0, pay;
    String again;
    choose = sc.nextInt();
    if (choose == 1) {
      System.out.println("You choose Normal THali");
      System.out.print("How many Normal Thali you want to Buy? :");
      quantity = sc.nextInt();
      total = total + (quantity * 145);

      System.out.println("You want to buy again? ");
      System.out.println("Press Y for Yes and N for N : ");
      again = sc.next();
      if (again.equalsIgnoreCase("Y")) {
        order();
      } else {
        System.out.println("Enter a payment ");
        pay = sc.nextInt();
        if (pay <= total) {
          System.out.println("Not enough payment");
          System.out.println("Order cancelled");
          MainMenu obj1 = new MainMenu();
          obj1.menu();

        } else {
          System.out.println("Total price is " + total);
          total = pay - total;
          System.out.println("The change is " + total);
          System.out.println("thanks for order");
          MainMenu obj1 = new MainMenu();
          obj1.menu();
        }
      }
    } else if (choose == 2) {
      System.out.println("You choose Special Thali");
      System.out.print("How many Special Thali you want to Buy? :");
      quantity = sc.nextInt();
      total = total + (quantity * 240);

      System.out.println("You want to buy again? ");
      System.out.println("Press Y for Yes and N for N : ");
      again = sc.next();
      if (again.equalsIgnoreCase("Y")) {
        order();
      } else {
        System.out.println("Enter a payment ");
        System.out.println(total);
        pay = sc.nextInt();
        if (pay <= total) {
          System.out.println("Not enough payment");
          System.out.println("Order cancelled");
          MainMenu obj1 = new MainMenu();
          obj1.menu();
        } else {
          System.out.println("Total price is " + total);
          total = pay - total;
          System.out.println("The change is " + total);
          System.out.println("thanks for order");
          MainMenu obj1 = new MainMenu();
          obj1.menu();
        }
      }
    } else if (choose == 3) {
      System.out.println("You choose RajBhog Thali");
      System.out.print("How many RajBhog Thali you want to Buy? :");
      quantity = sc.nextInt();
      total = total + (quantity * 330);

      System.out.println("You want to buy again? ");
      System.out.println("Press Y for Yes and N for N : ");
      again = sc.next();
      if (again.equalsIgnoreCase("Y")) {
        order();
      } else {
        System.out.println("Enter a payment ");
        pay = sc.nextInt();
        if (pay <= total) {
          System.out.println("Not enough payment");
          System.out.println("thanks for order");
          MainMenu obj1 = new MainMenu();
          obj1.menu();
        } else {
          System.out.println("Total price is " + total);
          total = pay - total;
          System.out.println("The change is " + total);
          System.out.println("thanks for order");
          MainMenu obj1 = new MainMenu();
          obj1.menu();
        }
      }
    } else if (choose == 4) {
      MainMenu obj1 = new MainMenu();
      obj1.menu();
    } else {
      MainMenu obj1 = new MainMenu();
      obj1.menu();
    }
  }
}

class Cust_Show {
  public void viewFile(String s) throws Exception {
    File file = new File("file" + s + ".txt");
    Scanner sc = new Scanner(file);

    while (sc.hasNextLine()) {
      System.out.println(sc.nextLine());
    }
  }
}

/******** To Exit from the CMS Portal *******/

class CodeExit {
  public void out() {
    System.out.println("\n***************");
    System.out.println("$ Thanku for Using our software :) ");
    System.out.println("***************");
    System.out.println("\t\t/~ Created by Aakash,Harsh,Nakesh As a java project(CSE310)\n");
    System.exit(0);
  }
}

/********** Main class ************/
class CafeManagementSystem {
  public static void main(String arv[]) {

    System.out.print("\033[H\033[2J");

    Scanner sc = new Scanner(System.in);
    Cust_Show epv = new Cust_Show();

    int i = 0;

    MainMenu obj1 = new MainMenu();
    obj1.menu();

    while (i < 5) {

      System.out.print("\nPlease Enter choice :");
      i = Integer.parseInt(sc.nextLine());

      switch (i) {
        case 1: {
          Cust_Add ep = new Cust_Add();
          ep.createFile();

          System.out.print("\033[H\033[2J");
          obj1.menu();
          break;
        }
        case 2: {
          Order_Call ca = new Order_Call();
          ca.menu();
          ca.det();
          ca.order();

          System.out.print("\nPress Enter to Continue...");
          sc.nextLine();
          System.out.print("\033[H\033[2J");
          obj1.menu();
          break;
        }

        case 3: {
          System.out.print("\nPlease Enter Customer's ID :");
          String s = sc.nextLine();
          try {
            epv.viewFile(s);
          } catch (Exception e) {
            System.out.println(e);
          }

          System.out.print("\nPress Enter to Continue...");
          sc.nextLine();
          System.out.print("\033[H\033[2J");
          obj1.menu();
          break;
        }

        case 4: {
          CodeExit obj = new CodeExit();
          obj.out();
        }
      }
    }
  }
}

/***********
 * CODED BY Aakash,Harsh,Nakesh
 ********/
/*********** End Of Java Project ********/