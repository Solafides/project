package ATM_INTERFACE;

import java.util.Scanner;

public class runner {


    public static void main(String[] args) {
         account[] y = new account[]
                {           new saving("Solomon", "Timiso", "10023", "123",500,0.10),
                        new checking("Samuel", "Girma", "10024", "1234",200,0.20),
                        new saving("Noah", "Abera", "10025", "12345",100,0.15),
                        new checking("Desalegn", "Alemayehu", "10027", "123456",500,0.17),
                        new saving("kalikidan", "Tilahun", "10028", "1234567",300,0.14),
                        new checking("Destaye", "Andegna", "10029", "12345678",400,0.15)
                };

        Scanner input = new Scanner(System.in);
        int x;

            System.out.println("Dear Customer please enter your PIN CODE  to LOGIN");
            String password = input.next();
            boolean checker = false;
            for (account acct : y) {
                if (acct.getPIN().equals(password)) {
                    System.out.println(acct.displayer());
                    checker = true;
                }

            }

      if(checker) {
          do {
              menu();
              x = input.nextInt();

              switch (x) {

                  case 1:


                          System.out.print("Enter the account number: ");
                          String accountNumber = input.next();
                      System.out.println("Dear Customer please enter your PASSWORD to withdraw");
                      String pass = input.next();
                          boolean accountFound = false;
                          for (account acc : y) {
                              if(password.equals(pass)){
                              if (acc.getAcctNo().equals(accountNumber) && acc.getPIN().equals(pass)) {
                                  System.out.print("Enter the withdrawal amount: ");
                                  double withdrawalAmount = input.nextDouble();
                                  acc.withdraw(withdrawalAmount);
                                  accountFound = true;
                                  break;
                              }
                          }
                          }
                          if (!accountFound) {
                              System.out.println("Incorrect Account number or password. please Try again");
                          }

                      break;
                  case 2:
                      System.out.println("please enter the amount you want to deposit");
                      double dep=input.nextDouble();
                      for(account actor:y){
                          if(actor.getPIN().equals(password))
                              actor.deposit(dep);
                      }

                      break;
                  case 3:
                      System.out.println("please enter your account number");
                      String accountNo = input.next();
                      boolean chek=false;
                      for (account acct : y) {
                          if (acct.getPIN().equals(password) && acct.getAcctNo().equals(accountNo) ){

                              System.out.println(acct.toString());
                              chek=true;
                                }
                      }
                  if(!chek)
                      System.out.println("dear customer you entered incorrect account no please try again ");
                      break;
                  case 4:
                      System.out.println("your are exiting from the system");
                      break;
                  default:
                      System.out.println("you entered wrong number please enter your choice again");

              }
          }
          while (x != 4);
      }else if (!checker) {
          System.out.println("invalid password");

      }

    }

    public static void menu() {
        System.out.println("enter 1 to withdraw balance ");
        System.out.println("enter 2 to deposit balance ");
        System.out.println("enter 3 to check balance");
        System.out.println("enter 4 to exit ");

    }

}


