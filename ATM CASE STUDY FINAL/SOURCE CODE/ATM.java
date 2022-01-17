import java.util.*;
import java.util.Date;
import java.text.*;

//----------------------------------------------------------------------------------------------------------//

abstract class ADMINSETUSERINFO {

    abstract protected void setaccnumber(long t, long l, long k, String name, long g, long p,String mobile,String email);

    abstract protected void setpassword(String pass);
}

// ----------------------------------------------------------------------------------------------------------//

abstract class ADMINSETTRANSAC {

    abstract protected void settransac(long accnumber);

}

// ----------------------------------------------------------------------------------------------------------//

// concept of ENCAPSULATION/DATA HIDING has been implemented here to make the
// data secure
class USERINFO {
    private long accountnumber;
    private long pin;
    private long userbalance;
    private long userlimit;
    private long depositlimit;
    protected String Name;
    private String mobilenum;
    private String email;

    // constructor
    USERINFO(long accountnumber, long pin, long userbalance, String name, long userlimit, long depositlimit,
            String mobilenum, String email) {
        this.accountnumber = accountnumber;
        this.pin = pin;
        this.userbalance = userbalance;
        this.Name = name;
        this.userlimit = userlimit;
        this.depositlimit = depositlimit;
        this.mobilenum = mobilenum;
        this.email = email;
    }

    // set email
    protected void setemail(String mail) {
        email = mail;
    }

    // get email
    protected String getemail() {
        return email;
    }

    // set mobilenum
    protected void setmob(String mob) {
        mobilenum = mob;
    }

    // get mobilenum
    protected String getmob() {
        return mobilenum;
    }

    // set account number
    protected long getaccnumber() {
        return accountnumber;
    }

    // set user balance
    protected long getpin() {
        return pin;
    }

    // get user balance
    protected long getuserbalance() {
        return userbalance;
    }

    // get deposit limit
    protected long getdeposit() {
        return depositlimit;
    }

    // get the withdrawal limit
    protected long getuserlimit() {
        return userlimit;
    }

    // set the deposit limit which is 50000
    protected void setdepositlimit(long deplim) {
        depositlimit = deplim;
    }

    // set the user pin
    protected void setpin(long newpin) {
        pin = newpin;
    }

    // set the balance
    protected void setbalance(long newbalance) {
        userbalance = newbalance;
    }

    // set the daily user limit which is 50000 and decrease as withdrawals happen
    protected void setuserlimit(long userlimiti) {
        userlimit = userlimiti;
    }

}

// ----------------------------------------------------------------------------------------------------------//

// concept of ENCAPSULATION/DATA and POLYMORPHISM has been implemented here
class ATMMONEY {
    private long atmbalance;
    private long depositlim;
    private String transaction;
    private long accnumber;

    // POLYMORPHISM has been used in these constructors to serve different needs
    ATMMONEY(long accountnumb, String transaction) {
        this.accnumber = accountnumb;
        this.transaction = transaction;
    }

    ATMMONEY(long atmbalance, long depbal) {
        this.atmbalance = atmbalance;
        this.depositlim = depbal;
    }

    // Returns the deposit limit, the max amount the ATM can take in altogether
    protected long getdepositlimit() {
        return depositlim;
    }

    // get the transaction info
    protected String gettransac() {
        return transaction;
    }

    // get the account number
    protected long gettheaccnumb() {
        return accnumber;
    }

    // get the amount of money left in atm after withdrawals
    protected long getatmmoney() {
        return atmbalance;
    }

    // set the atm deposit limit after each deposit
    protected void ATMDEPLIMIT(long dep) {
        depositlim = depositlim + dep;
    }

    // Function to Change atm money as each person withdraws also used by admin
    protected void ATMWITHLIMIT(long atmb) {
        atmbalance = atmbalance + atmb;

    }

    // update the transaction info after each transaction
    protected void changetransac(String t, int n) {
        SimpleDateFormat formatter = new SimpleDateFormat("kk:mm:ss");
        Date EntryTime = new Date();
        String timings = formatter.format(EntryTime.getTime());
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date Entrydate = new Date();
        String dateofentry = dateFormat.format(Entrydate.getTime());
        if (n == 1) {
            transaction = transaction + dateofentry + "$" + timings + "+" + t + " ";
        } else if (n == 2) {
            transaction = transaction + dateofentry + "$" + timings + "-" + t + " ";
        }

    }

}
// ----------------------------------------------------------------------------------------------------------//

// concept of abstraction and inheritance has been implemneted here
class ATMMONEYARRAY extends ADMINSETTRANSAC {
    private ArrayList<ATMMONEY> TRANSAC = new ArrayList<ATMMONEY>();
    private long ANUM[] = { 72511, 32148, 92345, 87345, 54321 };

    // constructor
    ATMMONEYARRAY() {
        for (int i = 0; i < 5; i++) {
            TRANSAC.add(new ATMMONEY(ANUM[i], ""));
        }
    }

    // sets new transaction block in array for new user by admin
    protected void settransac(long accnum) {
        TRANSAC.add(new ATMMONEY(accnum, ""));
    }

    // updates the transactions for differnet users
    protected void change(String t, int n, long accnum) {
        for (int i = 0; i < TRANSAC.size(); i++) {
            if (TRANSAC.get(i).gettheaccnumb() == accnum) {
                TRANSAC.get(i).changetransac(t, n);
            }
        }

    }

    // displays all tarnsactions
    protected void display(long accnum) {
        String stuff = "";
        for (int i = 0; i < TRANSAC.size(); i++) {
            if (TRANSAC.get(i).gettheaccnumb() == accnum) {
                stuff = TRANSAC.get(i).gettransac();
                break;
            }
        }
        System.out.println("|------------------------------------|");
        System.out.println("      YOUR TRANSACTIONS ARE: ");
        System.out.println();
        char ch[] = stuff.toCharArray();
        for (int i = 0; i < stuff.length(); i++) {
            if (ch[i] == '+' || ch[i] == '-') {
                System.out.print(" ");
                if (ch[i] == '+') {
                    System.out.print(" CREDITED ");
                    System.out.print(ch[i]);

                } else {
                    System.out.print(" WITHDRAWN ");
                    System.out.print(ch[i]);

                }

            } else if (Character.isWhitespace(ch[i])) {
                System.out.println();
                System.out.println(" ");
            } else if (ch[i] == '$') {
                System.out.print(" ");
            } else {
                System.out.print(ch[i]);
            }
        }

    }

}

// ----------------------------------------------------------------------------------------------------------//
// concept of inheritance and abstraction
class USERINFOARRAY extends ADMINSETUSERINFO {
    private String password;
    private ArrayList<USERINFO> ACCOUNT = new ArrayList<USERINFO>();
    private long ANUM[] = { 72511, 32148, 92345, 87345, 54321 };
    private long PINNUM[] = { 54312, 45678, 54672, 12654, 90876 };
    private long BALANCE[] = { 500000, 674568, 456874, 986453, 789654 };
    private String mobile[] = { "9765432111", "7655432111", "8765432111", "8965432211", "7776543211" };
    String names[] = { "EESHAN", "PRANTIK", "VINAY", "SRIDHAR", "SRIRAM" };
    String emails[] = { "EESHAN@gmail.com", "PRANTIK@gmail.com", "VINAY@gmail.com", "SRIDHAR@gmail.com",
            "SRIRAM@gmail.com" };

    // constructor
    USERINFOARRAY() {
        for (int i = 0; i < 5; i++) {
            ACCOUNT.add(new USERINFO(ANUM[i], PINNUM[i], BALANCE[i], names[i], 50000, 50000, mobile[i], emails[i]));

        }
        this.password = "ATM@123";
    }

    // sets the user password
    protected void setpassword(String numb) {
        password = numb;
    }

    // gets the users password
    protected String getpassword() {
        return password;
    }

    // sets the mobilenum
    protected void setmob(long accnumb, String mob) {
        for (int i = 0; i < ACCOUNT.size(); i++) {
            if (ACCOUNT.get(i).getaccnumber() == accnumb) {
                ACCOUNT.get(i).setmob(mob);
                break;
            }
        }
    }
    // sets the email
    protected void setemail(long accnumb, String mail) {
        for (int i = 0; i < ACCOUNT.size(); i++) {
            if (ACCOUNT.get(i).getaccnumber() == accnumb) {
                ACCOUNT.get(i).setemail(mail);
                break;
            }
        }
    }
    // gets email for particular accnumb
    protected String getemail(long accnumb) {
        String result = "";
        for (int i = 0; i < ACCOUNT.size(); i++) {
            if (ACCOUNT.get(i).getaccnumber() == accnumb) {
                result = ACCOUNT.get(i).getemail();
                break;
            }
        }
        return result;
    }
    // gets mobilenum for particular accnumb
    protected String getmobilenum(long accnumb) {
        String result = "";
        for (int i = 0; i < ACCOUNT.size(); i++) {
            if (ACCOUNT.get(i).getaccnumber() == accnumb) {
                result = ACCOUNT.get(i).getmob();
                break;
            }
        }
        return result;
    }

    // sets the depositlimit after each deposit
    protected void settingbalancelimit(long accnumb, long amount) {
        for (int i = 0; i < ACCOUNT.size(); i++) {
            if (ACCOUNT.get(i).getaccnumber() == accnumb) {
                ACCOUNT.get(i).setdepositlimit(amount);

                break;
            }
        }
    }

    // returns users current depositlimit
    protected long checkdepositlimit(long accnumb) {
        long num = 0;
        for (int i = 0; i < ACCOUNT.size(); i++) {
            if (ACCOUNT.get(i).getaccnumber() == accnumb) {
                num = ACCOUNT.get(i).getdeposit();
                break;
            }
        }
        return num;
    }

    // sets the users current withdrawal limit
    protected void settuserlimit(long accnumb, long amount) {
        for (int i = 0; i < ACCOUNT.size(); i++) {
            if (ACCOUNT.get(i).getaccnumber() == accnumb) {
                ACCOUNT.get(i).setuserlimit(amount);

                break;
            }
        }
    }

    // returns the users daily limit and see if he crosses it
    protected long checkuserlimt(long accnumb) {
        long num = 0;
        for (int i = 0; i < ACCOUNT.size(); i++) {
            if (ACCOUNT.get(i).getaccnumber() == accnumb) {
                num = ACCOUNT.get(i).getuserlimit();
                break;
            }
        }
        return num;
    }

    // returns the account number if exists
    protected boolean checkaccnum(long accnumb) {
        boolean num = false;
        for (int i = 0; i < ACCOUNT.size(); i++) {
            if (ACCOUNT.get(i).getaccnumber() == accnumb) {
                num = true;
                break;
            }
        }
        return num;
    }

    // checks the pin for correct match
    protected boolean checkpin(long accpin) {
        boolean num = false;
        for (int i = 0; i < ACCOUNT.size(); i++) {
            if (ACCOUNT.get(i).getpin() == accpin) {
                num = true;
                break;
            }
        }
        return num;
    }

    // gets the users name
    protected String getname(long accnumb) {
        String result = "";
        for (int i = 0; i < ACCOUNT.size(); i++) {
            if (ACCOUNT.get(i).getaccnumber() == accnumb) {
                result = ACCOUNT.get(i).Name;
                break;
            }
        }
        return result;
    }

    // gets the balance
    protected long viewbalance(long accnumb) {
        long result = 0;
        for (int i = 0; i < ACCOUNT.size(); i++) {
            if (ACCOUNT.get(i).getaccnumber() == accnumb) {
                result = ACCOUNT.get(i).getuserbalance();
                break;
            }
        }
        return result;

    }

    // setting balance after transactions
    protected void changebalance(long accnumb, long newbalance) {
        for (int i = 0; i < ACCOUNT.size(); i++) {
            if (ACCOUNT.get(i).getaccnumber() == accnumb) {
                ACCOUNT.get(i).setbalance(newbalance);
                break;
            }
        }
    }

    // setting new pin by admin or user
    protected void settingpin(long accnumb, long newpin) {
        for (int i = 0; i < ACCOUNT.size(); i++) {
            if (ACCOUNT.get(i).getaccnumber() == accnumb) {
                ACCOUNT.get(i).setpin(newpin);
            }
        }
    }

    // setting new account by admin
    protected void setaccnumber(long t, long l, long k, String name, long g, long p,String mobile,String email) {
        ACCOUNT.add(new USERINFO(t, l, k, name, g, p,mobile,email));
    }

}

// ----------------------------------------------------------------------------------------------------------//
public class ATM {
    static void welcomemenu() {
        System.out.println();
        System.out.println("|--------------------------------------------------|");
        System.out.println("              WELCOME TO DEUSCHE BANK");
        System.out.println();
        System.out.println("         PLEASE ENTER YOUR ACCOUNT NUMBER");
    }

    static void optionsmenu() {
        System.out.println();
        System.out.println("          USER MENU");
        System.out.println("        1.VIEW BALANCE");
        System.out.println("        2.WITHDRAW CASH");
        System.out.println("        3.DEPOSIT CASH");
        System.out.println("        4.CHANGE PIN");
        System.out.println("        5.TRANSACTION HISTORY");
        System.out.println("        6.TRANSFER FUNDS");
        System.out.println("        7.UPDATE PROFILE");
        System.out.println("        8.EXIT");
        System.out.println();
        System.out.println(" PLEASE ENTER A NUMBER BASED ON YOUR NEED");

    }

    static void adminmenu() {
        System.out.println();
        System.out.println("|--------------------------------------------------|");
        System.out.println("                 ADMIN MENU");
        System.out.println("             1.ADD NEW USER");
        System.out.println("             2.ADD ATM MONEY");
        System.out.println("             3.CHANGE ADMIN PASSWORD");
        System.out.println("             4.RETRIEVE DEPOSITED CASH");
        System.out.println("             5.EXIT");
        System.out.println();
        System.out.println("        PLEASE ENTER A NUMBER BASED ON YOUR NEED");
        System.out.println("|--------------------------------------------------|");

    }

    static void mainmenu() {
        System.out.println();
        System.out.println("|--------------------------------------------------|");
        System.out.println("              WELCOME TO DEUSCHE BANK");
        System.out.println();
        System.out.println("                 1.USER PORTAL");
        System.out.println("                 2.NEW USER");
        System.out.println("                 3.EXIT");
        System.out.println();
        System.out.println("     PLEASE ENTER A NUMBER BASED ON YOUR NEED");
        System.out.println("|---------------------------------------------------|");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean start2 = true;
        ATMMONEYARRAY objnew = new ATMMONEYARRAY();
        ATMMONEY obj6 = new ATMMONEY(1000000, 1000000);
        USERINFOARRAY obj = new USERINFOARRAY();
        mainmenu();
        while (start2 != false) {
            System.out.print(" ");
            int inp6 = sc.nextInt();
            if (inp6 == 1) {
                boolean start = true;
                welcomemenu();
                while (start != false) {
                    System.out.print(" ");
                    long inp = sc.nextLong();
                    boolean check = obj.checkaccnum(inp);
                    if (check == true) {
                        System.out.println();
                        System.out.println("|--------------------------------------------------|");
                        System.out.println(" ENTER YOUR PIN");
                        System.out.print(" ");
                        long inpin = sc.nextLong();
                        boolean check1 = obj.checkpin(inpin);
                        if (check1 == true) {
                            String name = obj.getname(inp);
                            System.out.println();
                            System.out.println("|-------------------------------|");
                            System.out.println("         WELCOME " + name);
                            System.out.println("|-------------------------------|");
                            optionsmenu();
                            System.out.println("|-----------------------------------------|");
                            boolean stuff = false;
                            while (stuff != true) {
                                System.out.print(" ");
                                int inp2 = sc.nextInt();
                                if (inp2 == 1) {
                                    long balance = obj.viewbalance(inp);
                                    Date today = new Date();
                                    System.out.println();
                                    System.out.println("|-----------------------------------------|");
                                    System.out.println("             ACCOUNT BALANCE");
                                    System.out.println("|-----------------------------------------|");
                                    System.out.println(" YOUR ACCOUNT BALANCE ON: ");
                                    System.out.println(" " + today + " IS: ");
                                    System.out.println(" " + balance);
                                    System.out.println("|-----------------------------------------|");
                                    optionsmenu();

                                } else if (inp2 == 2) {
                                    System.out.println();
                                    System.out.println("|------------------------------------------------------|");
                                    System.out.println("                 WITHDRAWAL PORTAL");
                                    System.out.println("|------------------------------------------------------|");
                                    System.out.println(" DISCLAIMER: ENTER IN 100,1000,500,2000 DENOMINATIONS ");
                                    System.out.println(" ELSE TRANSACTION WILL FAIL");
                                    System.out.println("|------------------------------------------------------|");
                                    System.out.println();
                                    System.out.println(" ENTER THE AMOUNT YOU WOULD LIKE TO WITHDRAW: ");
                                    System.out.print(" ");
                                    long inp4 = sc.nextLong();
                                    if (obj.checkuserlimt(inp) >= inp4 && obj6.getatmmoney() >= inp4
                                            && obj.viewbalance(inp) >= inp4) {
                                        if (inp4 % 100 == 0) {
                                            objnew.change(Long.toString(inp4), 2, inp);
                                            long ttt = obj.checkuserlimt(inp) - inp4;
                                            obj.settuserlimit(inp, ttt);
                                            long newbalance = obj.viewbalance(inp) - inp4;
                                            obj.changebalance(inp, newbalance);
                                            long finalamount = obj.viewbalance(inp);
                                            obj6.ATMWITHLIMIT(-inp4);
                                            System.out.println();
                                            System.out.println(" TRANSACTION IS BEING PROCESSED.......");
                                            System.out.println(" PLEASE TAKE YOUR CASH FROM DISPENSER");
                                            System.out.println(
                                                    "|------------------------------------------------------|");
                                            System.out.println("                     ATM RECEIPT    ");
                                            Date now = new Date();
                                            System.out.println(
                                                    "|------------------------------------------------------|");
                                            System.out.println(" ACOUNT HOLDER:" + name);
                                            System.out.println(" " + now);
                                            System.out.println(" CASH WITHDRAWN IS: " + inp4);
                                            System.out.println(" YOUR CURRENT ACCOUNT BALANCE IS: ");
                                            System.out.print(" ");
                                            System.out.println(finalamount);
                                            System.out.println(
                                                    "|------------------------------------------------------|");

                                        } else {
                                            System.out.println();
                                            System.out.println(
                                                    "|------------------------------------------------------|");
                                            System.out.println("  TRY ANOTHER AMOUNT/AMOUNT DENOMINATIONS TOO SMALL");
                                            System.out.println(
                                                    "|------------------------------------------------------|");
                                        }

                                    } else if (obj.viewbalance(inp) < inp4) {
                                        System.out.println();
                                        System.out.println("|------------------------------------------------------|");
                                        System.out.println("               INSUFFCIENT BALANCE");
                                        System.out.println("|------------------------------------------------------|");
                                    } else if (obj.checkuserlimt(inp) < inp4) {
                                        System.out.println();
                                        System.out.println("|------------------------------------------------------|");
                                        System.out.println(" YOU HAVE CROSSED YOUR DAILY LIMIT/DAILY LIMIT IS 50000");
                                        System.out.println("|------------------------------------------------------|");
                                    } else if (obj6.getatmmoney() < inp4) {
                                        System.out.println();
                                        System.out.println("|------------------------------------------------------|");
                                        System.out.println("            ATM DOESNT HAVE ENOUGH BALANCE");
                                        System.out.println("|------------------------------------------------------|");
                                    }
                                    optionsmenu();

                                } else if (inp2 == 3) {
                                    System.out.println();
                                    System.out.println(
                                            "|----------------------------------------------------------------------|");
                                    System.out.println("                          DEPOSIT PORTAL");
                                    System.out.println(
                                            "|----------------------------------------------------------------------|");
                                    System.out.println("                    ALL DENOMINATIONS ACCEPTED");
                                    System.out.println(
                                            "|----------------------------------------------------------------------|");
                                    System.out.println();
                                    System.out.println(" ENTER THE AMOUNT YOU WOULD LIKE TO DEPOSIT: ");
                                    System.out.print(" ");
                                    long inp4 = sc.nextLong();
                                    if (obj.checkdepositlimit(inp) >= inp4 && obj6.getdepositlimit() >= inp4) {
                                        objnew.change(Long.toString(inp4), 1, inp);
                                        long ttt = obj.checkdepositlimit(inp) - inp4;
                                        obj.settingbalancelimit(inp, ttt);
                                        long newbalance = obj.viewbalance(inp) + inp4;
                                        obj.changebalance(inp, newbalance);
                                        long finalamount = obj.viewbalance(inp);
                                        obj6.ATMDEPLIMIT(-inp4);
                                        System.out.println();
                                        System.out.println(" PLEASE DEPOSIT CASH IN THE DEPOSIT RECEIVER");
                                        System.out.println(" TRANSACTION IS BEING PROCESSED.......");
                                        System.out.println("|------------------------------------------------------|");
                                        System.out.println("                     ATM RECEIPT    ");
                                        Date now = new Date();
                                        System.out.println("|------------------------------------------------------|");
                                        System.out.println(" ACOUNT HOLDER:" + name);
                                        System.out.println(" " + now);
                                        System.out.println(" CASH DEPOSITED IS: " + inp4);
                                        System.out.println(" YOUR CURRENT ACCOUNT BALANCE IS: ");
                                        System.out.print(" ");
                                        System.out.println(finalamount);
                                        System.out.println("|------------------------------------------------------|");
                                    } else if (obj.checkdepositlimit(inp) < inp4) {
                                        System.out.println();
                                        System.out.println(
                                                "|----------------------------------------------------------------------|");
                                        System.out.println(
                                                "   YOU HAVE CROSSED YOUR DAILY DEPOSIT LIMIT/DAILY LIMIT IS 50000");
                                        System.out.println(
                                                "|----------------------------------------------------------------------|");
                                    } else if (obj6.getdepositlimit() < inp4) {
                                        System.out.println();
                                        System.out.println("|------------------------------------------------------|");
                                        System.out.println("             ATM CANT TAKE ANY MORE CASH");
                                        System.out.println("|------------------------------------------------------|");
                                    }
                                    optionsmenu();

                                } else if (inp2 == 4) {
                                    System.out.println(" PLEASE ENTER YOUR OLD PIN: ");
                                    System.out.print(" ");
                                    int inp3 = sc.nextInt();
                                    boolean check2 = obj.checkpin(inp3);
                                    if (check2 == true) {
                                        System.out.println(" PLEASE ENTER YOUR NEW PIN: ");
                                        System.out.print(" ");
                                        long inpnew = sc.nextLong();
                                        long k = String.valueOf(inpnew).length();
                                        if (k == 5) {
                                            obj.settingpin(inp, inpnew);
                                            System.out.println();
                                            System.out.println(
                                                    "|------------------------------------------------------|");
                                            System.out.println("             NEW PIN SUCCCESSFULLY SET");
                                            System.out.println(
                                                    "|------------------------------------------------------|");
                                        } else {
                                            System.out.println();
                                            System.out.println(
                                                    "|------------------------------------------------------|");
                                            System.out.println("   PIN LENGTH SHOULD BE 5 CHARCATERS PLEASE TRY AGAIN");
                                            System.out.println(
                                                    "|------------------------------------------------------|");
                                        }

                                    } else {
                                        System.out.println();
                                        System.out.println("|------------------------------------------------------|");
                                        System.out.println("             WRONG OLD PIN HAS BEEN ENTERED");
                                        System.out.println("|------------------------------------------------------|");
                                    }
                                    optionsmenu();

                                } else if (inp2 == 5) {
                                    System.out.println();
                                    System.out.println("|------------------------------------|");
                                    System.out.println("           MINISTATEMENT");
                                    objnew.display(inp);
                                    long balance = obj.viewbalance(inp);
                                    System.out.println("YOUR ACCOUNT BALANCE IS: " + balance);
                                    System.out.println("|------------------------------------|");
                                    optionsmenu();
                                } else if (inp2 == 6) {
                                    System.out.println();
                                    System.out.println("|------------------------------------------------------|");
                                    System.out.println("                 FUND TRANSFER PORTAL");
                                    System.out.println("|------------------------------------------------------|");
                                    System.out.println(" ENTER THE AMOUNT YOU WOULD LIKE TO TRANSFER: ");
                                    System.out.print(" ");
                                    long re1 = sc.nextLong();
                                    if (re1 < obj.viewbalance(inp)) {
                                        System.out.println();
                                        System.out.println(" ENTER THE ACOUNT NUMBER OF THE BENEFICIARY: ");
                                        System.out.print(" ");
                                        long re2 = sc.nextLong();
                                        if (obj.checkaccnum(re2) == true) {
                                            long newbalance1 = obj.viewbalance(inp) - re1;
                                            long newbalance2 = obj.viewbalance(inp) + re1;
                                            obj.changebalance(inp, newbalance1);
                                            obj.changebalance(re2, newbalance2);
                                            objnew.change(Long.toString(re1), 2, inp);
                                            objnew.change(Long.toString(re1), 1, re2);
                                            long finalamount = obj.viewbalance(inp);
                                            System.out.println();
                                            System.out.println(" FUND TRANSFER SUCCESSFULL");
                                            System.out.println(
                                                    "|------------------------------------------------------|");
                                            System.out.println("                     ATM RECEIPT    ");
                                            Date now = new Date();
                                            System.out.println(
                                                    "|------------------------------------------------------|");
                                            System.out.println(" ACOUNT HOLDER:" + name);
                                            System.out.println(" " + now);
                                            System.out.println(
                                                    " AMOUNT TRANSFERED IS: " + re1 + " TO " + obj.getname(re2));
                                            System.out.println(" YOUR ACCOUNT BALANCE IS: " + finalamount);
                                            System.out.println(
                                                    "|------------------------------------------------------|");

                                        } else {
                                            System.out.println();
                                            System.out.println(
                                                    "|------------------------------------------------------|");
                                            System.out.println("           NON EXISTANT BENEFICIARY ACCOUNT");
                                            System.out.println(
                                                    "|------------------------------------------------------|");
                                        }

                                    } else {
                                        System.out.println();
                                        System.out.println("|------------------------------------------------------|");
                                        System.out.println("          BALANCE INSUFFICIENT FOR TRANSFER");
                                        System.out.println("|------------------------------------------------------|");
                                    }
                                    optionsmenu();

                                } else if (inp2 == 7) {
                                    System.out.println();
                                        System.out.println("|------------------------------------------------------|");
                                        System.out.println("                  BASIC PROFILE UPDATE");
                                        System.out.println("|------------------------------------------------------|");
                                        System.out.println("                 1.CHANGE MOBILENUMBER");
                                        System.out.println("                 2.CHANGE EMAIL");
                                        System.out.println("|------------------------------------------------------|");
                                        int n = sc.nextInt();
                                        if(n==1)
                                        {   System.out.println();
                                            System.out.println("|------------------------------------------------------|");
                                            System.out.println("              ENTER THE NEW MOBILENUMBER ");
                                            System.out.print(" ");
                                            sc.nextLine();
                                            String mob = sc.nextLine();
                                            if(mob.length()==10)
                                            {  
                                                obj.setmob(inp, mob);
                                                System.out.println(" NEW MOBILE NUMBER IS:" + obj.getmobilenum(inp));
                                                System.out.println("|------------------------------------------------------|");
                                                optionsmenu();
                                            }
                                            else{
                                                System.out.println();
                                                System.out.println("|------------------------------------------------------|");
                                                System.out.println("        MOBILE NUMBER IS 10 DIGITS LONG/TRY AGAIN");
                                                System.out.println("|------------------------------------------------------|");
                                                optionsmenu();
                                            }
                                            

                                        }else if(n==2)
                                        {
                                            System.out.println();
                                            System.out.println("|------------------------------------------------------|");
                                            System.out.println("               ENTER THE NEW EMAILID");
                                            sc.nextLine();
                                            System.out.print(" ");
                                            String mail = sc.nextLine();
                                            obj.setemail(inp, mail);
                                            System.out.println(" NEW EMAILID IS:" + obj.getemail(inp));
                                            System.out.println("|------------------------------------------------------|");
                                            
                                            optionsmenu();
                                        }
                                        else
                                        {
                                            System.out.println();
                                            System.out.println("|------------------------------------------------------|");
                                            System.out.println("                SELECT A VALID INPUT:");
                                            System.out.println("|------------------------------------------------------|");
                                            optionsmenu();
                                        }
                                }
                                else if (inp2 == 8) {
                                    stuff = true;
                                    start = false;
                                    mainmenu();
                                }
                                else{
                                    System.out.println();
                                    System.out.println("|------------------------------------------------------|");
                                    System.out.println("                SELECT A VALID INPUT:");
                                    System.out.println("|------------------------------------------------------|");
                                    optionsmenu();
                                }

                            }
                        } else {
                            System.out.println();
                            System.out.println("|------------------------------------------------------|");
                            System.out.println("                  WRONG PIN/RETRY AGAIN");
                            System.out.println("|------------------------------------------------------|");
                            welcomemenu();
                        }
                    } else {
                        System.out.println();
                        System.out.println("|---------------------------------------------------------|");
                        System.out.println("  PLEASE CHECK IF YOU ENTERED THE CORRECT ACCOUNTNUMBER");
                        System.out.println("|---------------------------------------------------------|");
                        start = false;
                        mainmenu();
                    }

                }
            } else if (inp6 == 2) {
                System.out.println("|------------------------------------------------------|");
                System.out.println("               ENTER ADMIN PASSWORD: ");
                sc.nextLine();
                String inp8 = sc.nextLine();
                if (obj.getpassword().equals(inp8)) {
                    boolean start3 = true;
                    adminmenu();
                    while (start3 != false) {
                        int inp7 = sc.nextInt();
                        if (inp7 == 1) {
                            System.out.println("|------------------------------------------------------|");
                            System.out.println("               ENTER USER NAME:");
                            sc.nextLine();
                            String name = sc.nextLine();
                            System.out.println("|------------------------------------------------------|");
                            System.out.println("               ENTER MOBILE NUMBER:");
                            String mobile = sc.nextLine();
                            System.out.println("|------------------------------------------------------|");
                            System.out.println("               ENTER EMAIL:");
                            String email = sc.nextLine();
                            System.out.println("|------------------------------------------------------|");
                            System.out.println("           ENTER UNIQUE CARD NUMBER(5 DIGIT):");
                            long cardnumb = sc.nextLong();
                            long k = String.valueOf(cardnumb).length();
                            if (k == 5 && obj.checkaccnum(cardnumb) == false) {
                                System.out.println("|------------------------------------------------------|");
                                System.out.println("                ENTER PIN(5 DIGIT):");
                                long pin = sc.nextLong();
                                long k1check = String.valueOf(pin).length();
                                if (k1check == 5) {
                                    System.out.println("|------------------------------------------------------|");
                                    System.out.println("         ENTER USER BALANCE AND DEPOSIT CASH");
                                    long Balanace = sc.nextLong();
                                    obj.setaccnumber(cardnumb, pin, Balanace, name, 50000, 50000,mobile,email);
                                    objnew.settransac(cardnumb);
                                    System.out.println("|------------------------------------------------------|");
                                    System.out.println("             ACCOUNT CREATION SUCCESSFULL");
                                    System.out.println("|------------------------------------------------------|");
                                    adminmenu();
                                } else {
                                    System.out.println();
                                    System.out.println("|------------------------------------------------------|");
                                    System.out.println("        PIN SHOULD BE 5 DIGITS LONG/TRYAGAIN ");
                                    System.out.println("|------------------------------------------------------|");
                                    adminmenu();
                                }
                            } else {
                                System.out.println();
                                System.out.println("|------------------------------------------------------|");
                                System.out.println("        CARD NUMBER SHOULD BE 5 DIGITS LONG");
                                System.out.println("        OR CARD NUMBER IS TAKEN /TRYAGAIN ");
                                System.out.println("|------------------------------------------------------|");
                                adminmenu();
                            }

                        } else if (inp7 == 2) {
                            System.out.println();
                            System.out.println("|------------------------------------------------------|");
                            System.out.println(" CURRENT ATM BALANCE");
                            System.out.println(" " + obj6.getatmmoney());
                            System.out.println("|------------------------------------------------------|");
                            System.out.println("       ENTER THE AMOUNT OF ATM CASH TO BE DEPOSITED ");
                            System.out.print(" ");
                            long atmcash = sc.nextLong();
                            if (atmcash + obj6.getatmmoney() <= 1000000 && atmcash % 100 == 0) {
                                obj6.ATMWITHLIMIT(atmcash);
                                System.out.println("|------------------------------------------------------|");
                                System.out.println(" NEW ATM BALANCE");
                                System.out.println(" " + obj6.getatmmoney());
                                System.out.println("                  SUCCESSFULL DEPOSIT ");
                                System.out.println("|------------------------------------------------------|");
                                adminmenu();
                            } else {
                                System.out.println("|------------------------------------------------------|");
                                System.out.println("         ATM MONEY CANT EXCEED 10 LACKS/RETRY ");
                                System.out.println("         /WRONG DENOMINATIONS WERE USED ");
                                System.out.println("|------------------------------------------------------|");
                                adminmenu();
                            }

                        } else if (inp7 == 3) {
                            System.out.println();
                            System.out.println("|------------------------------------------------------|");
                            System.out.println("               ENTER THE OLD PASSWORD ");
                            sc.nextLine();
                            System.out.print(" ");
                            String oldpass = sc.nextLine();
                            if (oldpass.equals(obj.getpassword())) {
                                System.out.println("|------------------------------------------------------|");
                                System.out.println("               ENTER THE NEW PASSWORD ");
                                System.out.print(" ");
                                String newpass = sc.nextLine();
                                obj.setpassword(newpass);
                                System.out.println("|------------------------------------------------------|");
                                System.out.println("                NEW PASSWORD SET SUCCESSFULLY ");
                                System.out.println("|------------------------------------------------------|");
                                adminmenu();
                            } else {
                                System.out.println("|------------------------------------------------------|");
                                System.out.println("                 WRONG OLD PASSWORD ");
                                System.out.println("|------------------------------------------------------|");
                                adminmenu();
                            }

                        } else if (inp7 == 4) {
                            System.out.println();
                            System.out.println("|------------------------------------------------------|");
                            System.out.println("          CURRENT VALUE OF DEPOSITED CASH");
                            System.out.println(" " + (1000000 - obj6.getdepositlimit()));
                            System.out.println("|------------------------------------------------------|");
                            System.out.println("    ENTER THE ADMIN PASSWORD TO EMPTY USER DEPOSITS");
                            System.out.println();
                            sc.nextLine();
                            System.out.print(" ");
                            String oldpass = sc.nextLine();
                            if (oldpass.equals(obj.getpassword())) {
                                obj6.ATMDEPLIMIT(1000000 - obj6.getdepositlimit());
                                System.out.println("|------------------------------------------------------|");
                                System.out.println("            SUCCESSFULLY REMOVED USER DEPOSITS ");
                                System.out.println("|------------------------------------------------------|");
                                adminmenu();

                            } else {
                                System.out.println("|------------------------------------------------------|");
                                System.out.println("                 WRONG PASSWORD ");
                                System.out.println("|------------------------------------------------------|");
                                adminmenu();
                            }

                        } else if (inp7 == 5) {
                            start3 = false;
                            mainmenu();
                        } else {
                            System.out.println();
                            System.out.println("|------------------------------------------------------|");
                            System.out.println("                SELECT A VALID INPUT:");
                            System.out.println("|------------------------------------------------------|");
                            adminmenu();
                        }

                    }
                } else {
                    System.out.println();
                    System.out.println("|------------------------------------------------------|");
                    System.out.println("                WRONG PASSWORD");
                    System.out.println("|------------------------------------------------------|");
                    mainmenu();
                }

            } else if (inp6 == 3) {
                start2 = false;
            } else {
                System.out.println();
                System.out.println("|------------------------------------------------------|");
                System.out.println("                SELECT A VALID INPUT:");
                System.out.println("|------------------------------------------------------|");
                mainmenu();
            }
        }
    }
}
// ----------------------------------------------------------------------------------------------------------//