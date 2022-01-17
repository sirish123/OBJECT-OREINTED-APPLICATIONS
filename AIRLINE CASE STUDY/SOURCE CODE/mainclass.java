import java.util.*;
import java.text.*;

//----------------------------------------------------------------------------------------------------------------------------//
class userinfo {
    private long seatpref;
    private long classtype;
    private long cid;
    private String name;
    private String age;
    private String gender;
    private String passnum;
    private String permadd;
    private String username;
    private String aadharnum;
    private String password;
    
    userinfo(String name, String age, String gender, String passnum, String permadd, String username, String aadharnum,long seatpref, long classtype, String password, long cid) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.passnum = passnum;
        this.permadd = permadd;
        this.username = username;
        this.aadharnum = aadharnum;
        this.seatpref = seatpref;
        this.classtype = classtype;
        this.password = password;
        this.cid = cid;
    }

    protected long getseatpref() {
        return seatpref;
    }

    protected long getclasstype() {
        return classtype;
    }

    protected long getcid() {
        return cid;
    }

    protected String getname() {
        return name;
    }

    protected String getgen() {
        return gender;
    }

    protected String getage() {
        return age;
    }

    protected String getpassnum() {
        return passnum;
    }

    protected String getpermadd() {
        return permadd;
    }

    protected String getusername() {
        return username;
    }

    protected String getaadhar() {
        return aadharnum;
    }

    protected String getpassword() {
        return password;
    }
}

//----------------------------------------------------------------------------------------------------------------------------//
class Links {
    private long commonid;
    private String age;
    private String passnumber;
    private String aadharnumber;
    private String name;
    private String gender;

    Links(long commonid, String passnumber, String aadharnumber, String name, String age, String gender) {
        this.commonid = commonid;
        this.passnumber = passnumber;
        this.aadharnumber = aadharnumber;
        this.name=name;
        this.age = age;
        this.gender = gender;
    }

    protected long getcomid() {
        return commonid;
    }

    protected String getage() {
        return age;
    }

    protected String getthename() {
        return name;
    }

    protected String getaadharnumber() {
        return aadharnumber;
    }

    protected String getpassnumber() {
        return passnumber;
    }

    protected String getgender() {
        return gender;
    }
}

//----------------------------------------------------------------------------------------------------------------------------//
class flights {
    private long flightid;
    private String departurecity;
    private String arrivalcity;
    private Date departuredate;
    private Date departuretime;
    private Date arrivaldate;
    private Date arrivaltime;
    private String airlinename;
    private long ditype;
    private long price;

    flights(long fid, String dc, String ac, Date ddt, Date adt, Date dt, Date at, String airname,long price,long ditype) {
        this.flightid = fid;
        this.departurecity = dc;
        this.arrivalcity = ac;
        this.departuredate = ddt;
        this.arrivaldate = adt;
        this.departuretime = dt;
        this.arrivaltime = at;
        this.airlinename = airname;
        this.price = price;
        this.ditype = ditype;
    
    }

    protected long getflightid() {
        return flightid;
    }

    protected Date getddt() {
        return departuredate;
    }

    protected Date getadt() {
        return arrivaldate;
    }

    protected Date getdtime() {
        return departuretime;
    }

    protected Date getatime() {
        return arrivaltime;
    }

    protected String getairlinename() {
        return airlinename;
    }

    protected String getdepcity() {
        return departurecity;
    }

    protected String getarrcity() {
        return arrivalcity;
    }
    protected long getprice()
    {
        return price;
    }
    protected long getditype()
    {
        return ditype;
    }
    protected void setditype(long dd)
    {
        ditype = dd;
    }
    protected void setprice(long pi)
    {
        price = pi;
    }
    protected void setddt(Date inp) {
        departuredate = inp;
    }

    protected void setadt(Date inp) {
        arrivaldate = inp;
    }

    protected void setdtime(Date inp) {
        departuretime = inp;
    }

    protected void setatime(Date inp) {
        arrivaltime = inp;
    }

    protected void setdepcity(String inp) {
        departurecity = inp;
    }

    protected void setarrcity(String inp) {
        arrivalcity = inp;
    }

}
//----------------------------------------------------------------------------------------------------------------------------//

class FlightSeats {
    private String flightname;
    private long flightid;
    private long seatnumber;
    private long seattype;
    private long businesstype;
    private boolean occupied;

    FlightSeats(long flightid, long seatnumber, long seattype, boolean occupied, long businesstype, String flightname) {
        this.flightid = flightid;
        this.seatnumber = seatnumber;
        this.occupied = occupied;
        this.seattype = seattype;
        this.businesstype = businesstype;
        this.flightname = flightname;
    }

    protected long getflightid() {
        return flightid;
    }

    protected long getseatnumber() {
        return seatnumber;
    }

    protected long getseattype() {
        return seattype;
    }

    protected boolean getoccupied() {
        return occupied;
    }

    protected long getbusinesstype() {
        return businesstype;
    }

    protected String getflightname() {
        return flightname;
    }

    protected void setisoccupied(boolean occ) {
        occupied = occ;
    }
}

//----------------------------------------------------------------------------------------------------------------------------//
class Admin {
    private String password;

    Admin() {
        this.password = "Airline123@";
    }

    protected String getpassword() {
        return password;
    }

    protected void setpassword(String pass) {
        password = pass;
    }

}
//----------------------------------------------------------------------------------------------------------------------------//
class transactions
{    
    private long fid;
    private long seatnumber;
    private long lid;
    private String name;
    private String descity;
    private String arrcity;
    private boolean transac;
    protected long tid;
    private long price;
    private Date tratime;

    transactions(Date tratime,long tid,long fid, long seatnumber, long lid, String name,String descity,String arrcity,long price,boolean transac)
    {   this.tratime=tratime;
        this.tid=tid;
        this.fid = fid;
        this.seatnumber = seatnumber;
        this.lid = lid;
        this.name=name;
        this.descity = descity;
        this.arrcity = arrcity;
        this.transac = transac;
        this.price = price;
    }
    protected long gettid()
    {
        return tid;
    }
    protected long getfid()
    {
        return fid;
    }
    protected long getseatnumber()
    {
        return seatnumber;
    }
    protected long getlid()
    {
        return lid;
    }
    protected String getname()
    {
        return name;
    }
    protected String getdescity()
    {
        return descity;
    }
    protected String getarrcity()
    {
        return arrcity;
    }
    protected boolean gettransac()
    {
        return transac;
    }
    protected void settransac(boolean t)
    {
        transac=t;
    }
    protected Date gettratime()
    {
        return tratime;
    }
    protected long getprice()
    {
        return price;
    }

}
//----------------------------------------------------------------------------------------------------------------------------//
class linkcity
{
    long cid;
    String city;

    linkcity(long cid, String city)
    {
        this.cid = cid;
        this.city = city;
    }

    protected long getcid()
    {
        return cid;
    }
    protected String getcity()
    {
        return city;
    }
}
//----------------------------------------------------------------------------------------------------------------------------//
class transacarray
{
    private ArrayList<transactions> bookings = new ArrayList<transactions>();

    protected void addbooking(Date tratime,long tid,long fid, long seatnumber, long lid, String name,String descity,String arrcity,long price,boolean transac)
    {
        bookings.add(new transactions(tratime,tid,fid, seatnumber, lid, name, descity, arrcity, price,transac));
    }
    protected boolean tidChecker(long tid) {
        for (int i = 0; i < bookings.size(); i++) {
            long temp = bookings.get(i).gettid();
            if (temp == tid) {
                return true;
            }
        }
        return false;
    }
    protected int printtra(long lid)
    {   int count=0;
        SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        
        for(int i=bookings.size()-1;i>=0;i++)
        {   if(count<5)
            {
                if(bookings.get(i).getlid()==lid)
                {   String tp = df.format(bookings.get(i).gettratime());
                    System.out.println(" TICKETNUMBER     DATE OF BOOKING     NAME     SEATNUMBER     STATUS");
                    
                    if(bookings.get(i).gettransac()==true)
                    {
                        System.out.println(" "+bookings.get(i).gettid()+"     "+tp+"     "+bookings.get(i).getname()+"     "+bookings.get(i).getseatnumber()+"     "+"     "+"BOOKED");
                    }
                    else if(bookings.get(i).gettransac()==false)
                    {
                        System.out.println(" "+bookings.get(i).gettid()+"     "+tp+"     "+bookings.get(i).getname()+"     "+bookings.get(i).getseatnumber()+"     "+"     "+"CANCELLED");
                    }
                }
                    count++;
            }
            else
            {
                return count;
            }
           
        }
        return count;
    }
    protected boolean cancelticket(long tid)
    {
        for(int i=bookings.size()-1;i>=0;i++)
        {
            if(bookings.get(i).gettid()==tid)
            {
                bookings.get(i).settransac(false);
                return true;
            }
        }
        return false;
    }

}
//----------------------------------------------------------------------------------------------------------------------------//
class linkcityarray
{
   private ArrayList<linkcity> lcityarray = new ArrayList<linkcity>();

   protected void addcity(long cid, String city)
   {
        lcityarray.add( new linkcity(cid, city));
   }
   protected boolean removecity(long cid, String city)
   {
       for(int i=0;i<lcityarray.size();i++)
       {
           if(lcityarray.get(i).getcid()==cid && lcityarray.get(i).getcity().equals(city))
           {
               lcityarray.remove(i);
               return true;
           }
       }
       return false;
   }
   protected int numchecker(long cid)
   {    int count=0;
    for(int i=0;i<lcityarray.size();i++)
    {   
        if(lcityarray.get(i).getcid()==cid)
        {
          count++;
        }
    }
    return count;
   }

}
//----------------------------------------------------------------------------------------------------------------------------//
class flightsarray {

    ArrayList<flights> flightinfo = new ArrayList<flights>();
    private long fidarr[] = {909912,109323,899999,734563,541333};
    private String dcarr[]={"BANGALORE","DELHI","CHENNAI","CHICAGO","PUNJAB"};
    private String acarr[] ={"TIRUPATI","PUNE","HARAYANA","NEW YORK","HARYANA"};
    private String ddtarr[]={"05/10/2021","12/12/2021","07/10/2021","18/09/2021","03/06/2021"};
    private String adtarr[]={"06/10/2021","13/12/2021","08/10/2021","19/09/2021","04/06/2021"};
    private String dtarr[]={"09:12:00","12:45:00","21:31:00","23:14:00","06:06:00"};
    private String atarr[]={"08:12:00","09:30:00","20:31:00","19:14:00","21:06:00"};
    private String airarr[]={"LUFTHANSA","SPICEJET","AIRFRANCE","AIRINDIA","KINGFISHER"};
    private long parr[] = {9000,8000,40000,9800,5500};
    private long diarr[] = {1,2,2,2,1};
    flightsarray()
    {
        for(int i=0;i<5;i++)
        {   
            Date ddt=datechecker(ddtarr[i]);
            Date adt=datechecker(adtarr[i]);
            Date dt = timechecker(dtarr[i]);
            Date at = timechecker(atarr[i]);
            flightinfo.add(new flights(fidarr[i], dcarr[i], acarr[i], ddt, adt, dt, at, airarr[i],parr[i],diarr[i]));

        }
    }

    protected void addflight(long fid, String dc, String ac, Date ddt, Date adt, Date dt, Date at, String airname,long price,long ditype) {

        flightinfo.add(new flights(fid, dc, ac, ddt, adt, dt, at, airname,price,ditype));

    }
    protected String getarrcity(long id)
    {   String t = "";
        for (int i = 0; i < flightinfo.size(); i++) {
            if (flightinfo.get(i).getflightid() == id) {
                t = flightinfo.get(i).getarrcity();
                return t;
            }
        }
        return t;
    }
    protected int removeflight(long id) {
        for (int i = 0; i < flightinfo.size(); i++) {
            if (flightinfo.get(i).getflightid() == id) {
                flightinfo.remove(i);
                return 1;
            }
        }
        return 0;
    }

    protected void adminprintflights() {
        for (int i = 0; i < flightinfo.size(); i++) {
            System.out.println("FLIGHT-ID:" + flightinfo.get(i).getflightid() + "   " + "FLIGHT-NAME:"
                    + flightinfo.get(i).getairlinename());
        }
    }

    protected int searchbydate(String ddt) {
        int count = 0;
        SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        for (int i = 0; i < flightinfo.size(); i++) {
            Date t = flightinfo.get(i).getddt();
            String strDate = df.format(t);
            if (strDate.equals(ddt)) {
                count++;
                SimpleDateFormat df1 = new SimpleDateFormat("hh:mm:ss");
                String dp = df.format(flightinfo.get(i).getddt());
                String adt = df.format(flightinfo.get(i).getadt());
                String dt = df1.format(flightinfo.get(i).getdtime());
                String at = df1.format(flightinfo.get(i).getatime());
                System.out.println();
                System.out.println("|--------------------------------------------------------------------------------------------------------------------------|");
                System.out.println();
                System.out.println(" FLIGHTID   AIRLINENAME    DEPARTURE CITY    ARRIVAL CITY   DEPARTURE DATE   ARRIVAL DATE   DEPARTURE TIME   ARRIVAL TIME");
                
                System.out.println("  "+flightinfo.get(i).getflightid()+"     "+flightinfo.get(i).getairlinename() + "      " + flightinfo.get(i).getdepcity() + "         "
                        + flightinfo.get(i).getarrcity() + "       " + dp + "        "+
                        adt+"       "+dt+"      "+at);
            }
        }
        if (count == 0) {
            System.out.println("|--------------------------------------------------|");
            System.out.println("            NO FLIGHTS ON GIVEN DATE");
            System.out.println("|--------------------------------------------------|");
        }
        return count;
    }

    protected int searchbycity(String city) {
        int count = 0;
        for (int i = 0; i < flightinfo.size(); i++) {
            String t = flightinfo.get(i).getdepcity();
            if (t.equals(city)) {
                count++;
                SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
                SimpleDateFormat df1 = new SimpleDateFormat("hh:mm:ss");
                String ddt = df.format(flightinfo.get(i).getddt());
                String adt = df.format(flightinfo.get(i).getadt());
                String dt = df1.format(flightinfo.get(i).getdtime());
                String at = df1.format(flightinfo.get(i).getatime());
                System.out.println();
                System.out.println("|--------------------------------------------------------------------------------------------------------------------------|");
                System.out.println();
                System.out.println(" FLIGHTID   AIRLINENAME    DEPARTURE CITY    ARRIVAL CITY   DEPARTURE DATE   ARRIVAL DATE   DEPARTURE TIME   ARRIVAL TIME");
                
                System.out.println("  "+flightinfo.get(i).getflightid()+"     "+flightinfo.get(i).getairlinename() + "      " + flightinfo.get(i).getdepcity() + "         "
                        + flightinfo.get(i).getarrcity() + "       " + ddt + "        "+
                        adt+"       "+dt+"      "+at);
            }
        }
        if (count == 0) {
            System.out.println("|--------------------------------------------------|");
            System.out.println("            NO FLIGHTS FROM GIVEN CITY");
            System.out.println("|--------------------------------------------------|");
        }
        return count;
    }
    protected long retprice(long fid)
    {
        for(int i=0;i<flightinfo.size();i++)
        {
            if(flightinfo.get(i).getflightid()==fid)
            {
                return flightinfo.get(i).getprice();
            }
        }
        return 0;
        
    }
    protected void printstuff(long fid) {
        for (int i = 0; i < flightinfo.size(); i++) {
            long temp = flightinfo.get(i).getflightid();
            if (temp == fid) {

                System.out.println(flightinfo.get(i).getddt());
                System.out.println(flightinfo.get(i).getadt());
                System.out.println(flightinfo.get(i).getatime());
                System.out.println(flightinfo.get(i).getdtime());
            }

        }
    }

    protected boolean fidChecker(long fid) {
        for (int i = 0; i < flightinfo.size(); i++) {
            long temp = flightinfo.get(i).getflightid();
            if (temp == fid) {
                return true;
            }
        }
        return false;
    }

    protected void changeflightdetails(long fid, String dc, String ac, Date ddt, Date adt, Date dt, Date at,long price,long ditype) {
        for (int i = 0; i < flightinfo.size(); i++) {
            long temp = flightinfo.get(i).getflightid();
            if (temp == fid) {
                flightinfo.get(i).setdepcity(dc);
                flightinfo.get(i).setarrcity(ac);
                flightinfo.get(i).setddt(ddt);
                flightinfo.get(i).setadt(adt);
                flightinfo.get(i).setdtime(dt);
                flightinfo.get(i).setatime(at);
                flightinfo.get(i).setprice(price);
                flightinfo.get(i).setditype(ditype);
            }
        }
    }

    protected Date datechecker(String date) {
        SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        Date testDate = null;
        try {
            testDate = df.parse(date);
        } catch (ParseException e) {
            System.out.println("invalid format");
        }

        if (!df.format(testDate).equals(date)) {
            System.out.println("invalid date!!");
        } else {
            //System.out.println("valid date");

        }
        return testDate;
    }

    protected Date timechecker(String date) {
        SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
        Date testDate = null;
        try {
            testDate = df.parse(date);
        } catch (ParseException e) {
            System.out.println("invalid format");
        }

        if (!df.format(testDate).equals(date)) {
            System.out.println("invalid date!!");
        } else {
            //System.out.println("valid date");

        }
        return testDate;
    }
}


//----------------------------------------------------------------------------------------------------------------------------//
class FlightSeatsArray {

    private ArrayList<FlightSeats> FlightSeats = new ArrayList<FlightSeats>();
    private long fidarr[] = {909912,109323,899999,734563,541333};
    private String airarr[]={"LUFTHANSA","SPICEJET","AIRFRANCE","AIRINDIA","KINGFISHER"};
    FlightSeatsArray()
    {
        for(int i=0;i<5;i++)
        {
            addnewflight(5, 10,airarr[i],fidarr[i]);
        }
    }
    protected long getpricec(long fid,long seat,long price)
    {
        for (int i = 0; i < FlightSeats.size(); i++) {
            long temp = FlightSeats.get(i).getflightid();
            long temp1 = FlightSeats.get(i).getseatnumber();
            long temp2 =  FlightSeats.get(i).getbusinesstype();
            if (temp == fid && temp1 == seat && temp2 ==1)
            {
                return price*7/2;
            }
            else if(temp == fid && temp1 == seat && temp2 ==2)
            {
                return price*3/2;
            }
        }
        return 0;

    }
    protected boolean userbookflight(long fid, long seatnumber) {
        for (int i = 0; i < FlightSeats.size(); i++) {
            long temp = FlightSeats.get(i).getflightid();
            long temp1 = FlightSeats.get(i).getseatnumber();
            boolean temp2 = FlightSeats.get(i).getoccupied();

            if (temp == fid && temp1 == seatnumber && temp2 == false) {
                FlightSeats.get(i).setisoccupied(true);
                return true;

            }

        }
        return false;
    }

    protected void addnewflight(long btype, long etype, String flightname, long flightid) {
        for (int i = 0; i < btype; i++) {
            FlightSeats.add(new FlightSeats(flightid, i + 1, 1, false, 1, flightname));
            FlightSeats.add(new FlightSeats(flightid, i + btype + 1, 2, false, 1, flightname));
            FlightSeats.add(new FlightSeats(flightid, i + 2 * btype + 1, 3, false, 1, flightname));
            FlightSeats.add(new FlightSeats(flightid, i + 3 * btype + 1, 4, false, 1, flightname));
            FlightSeats.add(new FlightSeats(flightid, i + 4 * btype + 1, 5, false, 1, flightname));
            FlightSeats.add(new FlightSeats(flightid, i + 5 * btype + 1, 6, false, 1, flightname));

        }
        for (int i = 0; i < etype; i++) {
            FlightSeats.add(new FlightSeats(flightid, 6 * btype + i + 1, 1, false, 2, flightname));
            FlightSeats.add(new FlightSeats(flightid, 6 * btype + i + etype + 1, 2, false, 2, flightname));
            FlightSeats.add(new FlightSeats(flightid, 6 * btype + i + 2 * etype + 1, 3, false, 2, flightname));
            FlightSeats.add(new FlightSeats(flightid, 6 * btype + i + 3 * etype + 1, 4, false, 2, flightname));
            FlightSeats.add(new FlightSeats(flightid, 6 * btype + i + 4* etype + 1, 5, false, 2, flightname));
            FlightSeats.add(new FlightSeats(flightid, 6 * btype + i + 5 * etype + 1, 6, false, 2, flightname));

        }
    }

    protected boolean FlightIdChecker(long flightid) {
        for (int i = 0; i < FlightSeats.size(); i++) {
            long temp = FlightSeats.get(i).getflightid();
            if (temp == flightid) {
                return true;
            }
        }
        return false;
    }

    protected void removeflight(long flightid) {
        for (int i = 0; i < FlightSeats.size(); i++) {
            long temp = FlightSeats.get(i).getflightid();
            if (temp == flightid) {
                FlightSeats.remove(i);
            }
        }
    }

    public void printseats(long flightid, long businesstype) {
        if (businesstype == 1) {
            System.out.println();
            System.out.println("                                      |-------------------------|");
            System.out.println("                                             BUSINESS CLASS");
            System.out.println("                                      |-------------------------|");
            System.out.println("    WINDOW" + "        " + "MIDDLE" + "        " + "AISLE"
                    + "                                " + "AISLE " + "        " + "MIDDLE" + "        " + "WINDOW");
            System.out.println();
        } else {
            System.out.println();
            System.out.println("                                      |-------------------------|");
            System.out.println("                                             ECONOMY CLASS");
            System.out.println("                                      |-------------------------|");
            System.out.println("    WINDOW" + "        " + "MIDDLE" + "        " + "AISLE"
                    + "                                " + "AISLE " + "        " + "MIDDLE" + "        " + "WINDOW");
            System.out.println();
        }

        int count = 0;
        for (int i = 0; i < FlightSeats.size(); i++) {
            long temp = FlightSeats.get(i).getflightid();
            if (temp == flightid) {
                if ((FlightSeats.get(i).getseattype() == 1||FlightSeats.get(i).getseattype() == 6) && FlightSeats.get(i).getbusinesstype() == businesstype) {
                    System.out.print("    ");
                    if (FlightSeats.get(i).getoccupied() == true) {
                        System.out.print("WS-" + FlightSeats.get(i).getseatnumber() + "->" + "TAKEN");
                        count++;
                    } else {
                        System.out.print("WS-" + FlightSeats.get(i).getseatnumber() + "->" + "FREE");
                        count++;
                    }
                }

                if ((FlightSeats.get(i).getseattype() == 2||FlightSeats.get(i).getseattype() == 5) && FlightSeats.get(i).getbusinesstype() == businesstype) {
                    System.out.print("    ");
                    if (FlightSeats.get(i).getoccupied() == true) {
                        System.out.print("MS-" + FlightSeats.get(i).getseatnumber() + "->" + "TAKEN");
                        count++;
                    } else {
                        System.out.print("MS-" + FlightSeats.get(i).getseatnumber() + "->" + "FREE");
                        count++;
                    }

                }
                if ((FlightSeats.get(i).getseattype() ==3 ||FlightSeats.get(i).getseattype() ==4) && FlightSeats.get(i).getbusinesstype() == businesstype) {
                    if(FlightSeats.get(i).getseattype() == 3)
                    {
                        System.out.print("    ");
                    }
                    else{
                        System.out.print("                         ");
                    }
                    if (FlightSeats.get(i).getoccupied() == true) {
                        System.out.print("AS-" + FlightSeats.get(i).getseatnumber() + "->" + "TAKEN");
                        count++;
                    } else {
                        System.out.print("AS-" + FlightSeats.get(i).getseatnumber() + "->" + "FREE");
                        count++;
                    }
                }
                if (count == 6) {
                    System.out.println();
                    count = 0;
                }

            }
        }

    }

}

//----------------------------------------------------------------------------------------------------------------------------//
class userinfoarray {
    private ArrayList<userinfo> ACCOUNT = new ArrayList<userinfo>();
    private long cidarr[]={123456,890123,901123,876512,431234};
    private String namearr[]={"EESHAN","PRANTIK","SIRISH","SACHIN","SRIDHAR"};
    private String agearr[]={"25","21","20","27","39"};
    private long s[]={1,2,3,2,1};
    private long c[]={1,2,2,1,2};
    private String genderarr[]={"MALE","MALE","MALE","MALE","MALE",};
    private String passnumarr[]={"P213AU75678","L872KB45678","H123AB45678","G789CB47653","F129CB45678"};
    private String permaddarr[]={"INDIA","INDIA","INDIA","INDIA","INDIA"};
    private String usernamearr[]={"AIR123","CA123","RAM123","PMI321","TRA123"};
    private String passnamearr[]={"AIR123","CA123","RAM123","PMI321","TRA123"};
    private String aadnumarr[]={"B987AB45678","P876AB45678","Y897AB45678","H456AB45678","B923AB45678"};


     userinfoarray()
     {   for(int i=0;i<5;i++)
         {
            addnewacc(namearr[i], agearr[i], genderarr[i], passnumarr[i], permaddarr[i], usernamearr[i], aadnumarr[i], s[i], c[i], passnamearr[i], cidarr[i]);
       }
        
     }
     protected void printuserinfo(String passnum)
     {
        for (int i = 0; i < ACCOUNT.size(); i++) {
            if(ACCOUNT.get(i).getpassnum().equals(passnum))
            {
                System.out.println("NAME:"+ACCOUNT.get(i).getname());
                System.out.println("AGE"+ACCOUNT.get(i).getage());
                System.out.println("GENDER"+ACCOUNT.get(i).getgen());
                System.out.println("AADHAR:"+ACCOUNT.get(i).getaadhar());
                System.out.println("PASSPORT NUMBER:"+ACCOUNT.get(i).getpassnum());
                System.out.println("ADDRESS:"+ACCOUNT.get(i).getpermadd());
            }
            
        }

     }
    protected void addnewacc(String name, String age, String gender, String passnum, String permadd, String username,
            String aadharnum, long seatpref, long classtype, String password, long cid) {
        ACCOUNT.add(new userinfo(name, age, gender, passnum, permadd, username, aadharnum, seatpref, classtype,
                password, cid));
    }

    protected void printstuff() {
        for (int i = 0; i < ACCOUNT.size(); i++) {
            System.out.println(ACCOUNT.get(i).getname() + " " + ACCOUNT.get(i).getaadhar());
        }

    }
    protected long getcid(String user,String pass)
    {
        for (int i = 0; i < ACCOUNT.size(); i++) {
            if (ACCOUNT.get(i).getpassword().equals(pass) && ACCOUNT.get(i).getusername().equals(user)) {
                return ACCOUNT.get(i).getcid();
            }
        }
        return 0;
    }
    
    protected boolean checkpass(String passnum) {
        for (int i = 0; i < ACCOUNT.size(); i++) {
            if (ACCOUNT.get(i).getpassword().equals(passnum)) {
                return true;
            }
        }
        return false;
    }
    protected String getname (String user,String pass)
    {   String t="";
        for (int i = 0; i < ACCOUNT.size(); i++) {
            if (ACCOUNT.get(i).getpassword().equals(pass) && ACCOUNT.get(i).getusername().equals(user)) {
                t = ACCOUNT.get(i).getname();
                return t;
            }
        }
        return t;
    }
    protected boolean usernamechecker(String username) {
        for (int i = 0; i < ACCOUNT.size(); i++) {
            if (ACCOUNT.get(i).getusername().equals(username)) {
                return true;
            }
        }
        return false;
    }

}

//----------------------------------------------------------------------------------------------------------------------------//
class LinksArray {
    private ArrayList<Links> Linkarray = new ArrayList<Links>();
    private long cidarr[]={123456,890123,901123,876512,431234};
    public String naki[] = {"RAM", "KRISHNA","GOVINDA","SUBHASH","SACHIN"};
    LinksArray()
    {
        for(int i=0;i<5;i++)
        {
            Linkarray.add(new Links(cidarr[i], "A12398HY11", "H12678C01A",  naki[i], "27", "MALE"));
        }

    }
    protected boolean uniqueidchecker(long cid) {
        for (int i = 0; i < Linkarray.size(); i++) {
            long temp = Linkarray.get(i).getcomid();
            if (temp == cid) {
                return false;

            }
        }
        return true;
    }

    protected void addpeopleprefernces(long commonid, String passnumber, String aadharnumber, String name, String age,
            String gender) {
        Linkarray.add(new Links(commonid, passnumber, aadharnumber, name, age, gender));
    }

    protected void printname(long cid) {
        int count=1;
        System.out.println();
        for (int i = 0; i < Linkarray.size(); i++) 
        {   
            if(Linkarray.get(i).getcomid()==cid)
            {
                System.out.println("          "+count+"."+Linkarray.get(i).getthename());
                count++;

            }      
        }

    }
}

//----------------------------------------------------------------------------------------------------------------------------//
public class mainclass {
    static void mainmenu() {
        System.out.println();
        System.out.println("|--------------------------------------------------|");
        System.out.println("       WELCOME TO AIRLINE RESERVATION SYSTEM");
        System.out.println();
        System.out.println("               1.ACCOUNT CREATION");
        System.out.println("               2.ACCOUNT LOGIN");
        System.out.println("               3.ADMIN LOGIN");
        System.out.println("               4.EXIT");
        System.out.println("|--------------------------------------------------|");
    }

    static void userloginmenu() {
        System.out.println();
        System.out.println("|--------------------------------------------------|");
        System.out.println("                  USER MENU");
        System.out.println();
        System.out.println("               1.SEARCH FLGHTS");
        System.out.println("               2.BOOK FLIGHTS");
        System.out.println("               3.CANCEL FLIGHTS");
        System.out.println("               4.ADD PEOPLE YOU TRAVEL WITH");
        System.out.println("               5.ADD PREFERRED CITIES");
        System.out.println("               6.EXIT");
        System.out.println("|--------------------------------------------------|");
    }

    static void adminloginmenu() {
        System.out.println();
        System.out.println("|--------------------------------------------------|");
        System.out.println("                  ADMIN MENU");
        System.out.println();
        System.out.println("               1.CREATE NEW FLIGHT");
        System.out.println("               2.ADD FLIGHT DETAILS");
        System.out.println("               3.REMOVE ENTIRE FLIGHT");
        System.out.println("               4.VIEW USER INFO");
        System.out.println("               5.CHANGE ADMIN PASSWORD");
        System.out.println("               6.EXIT");
        System.out.println("|--------------------------------------------------|");

    }

    public static void main(String args[]) {
        userinfoarray obj = new userinfoarray();
        flightsarray obj1 = new flightsarray();
        LinksArray obj2 = new LinksArray();
        FlightSeatsArray obj3 = new FlightSeatsArray();
        Admin obj4 = new Admin();
        transacarray obj5 = new transacarray();
        linkcityarray obj6 = new linkcityarray();
        Scanner sc = new Scanner(System.in);
        boolean check1 = true;
        mainmenu();
        while (check1 != false) {
            int n = sc.nextInt();
            if (n == 1) {
                sc.nextLine();
                System.out.println("|--------------------------------------------------|");
                System.out.println(" ENTER USERS NAME");
                System.out.print(" ");
                String iname = sc.nextLine();
                System.out.println("|--------------------------------------------------|");
                System.out.println(" ENTER USERS GENDER");
                System.out.print(" ");
                String igender = sc.nextLine();
                System.out.println("|--------------------------------------------------|");
                System.out.println(" ENTER USERS PASSPORTNUMBER");
                System.out.print(" ");
                String ipass = sc.nextLine();
                System.out.println("|--------------------------------------------------|");
                System.out.println(" ENTER USERS AADHAR NUMBER");
                System.out.print(" ");
                String iaadh = sc.nextLine();
                System.out.println("|--------------------------------------------------|");
                System.out.println(" ENTER USERS PERMANENT ADDRESS");
                System.out.print(" ");
                String iperm = sc.nextLine();
                System.out.println("|--------------------------------------------------|");
                System.out.println(" ENTER USERS SEAT PREFERENCE");
                System.out.println(" 1.WINDOW");
                System.out.println(" 2.MIDDLE");
                System.out.println(" 3.AISLE");
                System.out.print(" ");
                long iseat = sc.nextLong();
                System.out.println("|--------------------------------------------------|");
                System.out.println(" ENTER USERS AGE");
                System.out.print(" ");
                String age = sc.nextLine();
                System.out.println("|--------------------------------------------------|");
                System.out.println("  WHATS YOUR PREFERRED CLASS ENTER 1 OR 2");
                System.out.println("  1.BUSINESS");
                System.out.println("  2.ECONOMY");
                System.out.print(" ");
                long ct = sc.nextLong();
                sc.nextLine();
                System.out.println("|--------------------------------------------------|");
                System.out.println(" SET ACCOUNT USERNAME");
                System.out.print(" ");
                String iuser = sc.nextLine();
                System.out.println("|--------------------------------------------------|");
                System.out.println(" SET ACCOUNTS PASSWORD");
                System.out.print(" ");
                String password = sc.nextLine();

                boolean c = false;
                while (c != true) {
                    Random rnd = new Random();
                    long cid = rnd.nextInt(999999);
                    if (obj2.uniqueidchecker(cid)) {
                        c = true;
                        obj.addnewacc(iname, age, igender, ipass, iperm, iuser, iaadh, iseat, ct, password, cid);
                   
                    }

                }
                //obj2.print();
                mainmenu();
            } else if (n == 2) {
                sc.nextLine();
                System.out.println("|--------------------------------------------------|");
                System.out.println(" ENTER ACCOUNTS USERNAME");
                System.out.print(" ");
                String username = sc.nextLine();
                if (obj.usernamechecker(username)) {
                    System.out.println("|--------------------------------------------------|");
                    System.out.println(" ENTER ACCOUNTS PASSWORD");
                    System.out.print(" ");
                    String password = sc.nextLine();
                    boolean check2 = obj.checkpass(password);
                    boolean check3 = true;
                    if (check2 == true) {
                        userloginmenu();

                        while (check3 != false) {
                            int input = sc.nextInt();
                            if (input == 1) {
                               
                                System.out.println("|--------------------------------------------------|");
                                System.out.println("                  SEARCH MENU");
                                System.out.println();
                                System.out.println("               1.SEARCH BY DATE");
                                System.out.println("               2.SEARCH BY CITY");
                                System.out.print(" ");
                                int n1 = sc.nextInt();
                                sc.nextLine();
                                if (n1 == 1) {
                                    System.out.println("|--------------------------------------------------|");
                                    System.out.println(" ENTER THE DEPARTURE DATE");
                                    System.out.print(" ");
                                    String date = sc.nextLine();
                                    obj1.searchbydate(date);
                                } else if (n1 == 2) {
                                    System.out.println("|--------------------------------------------------|");
                                    System.out.println(" ENTER THE DEPARTURE CITY");
                                    System.out.print(" ");
                                    String city = sc.nextLine();
                                    obj1.searchbycity(city);
                                }
                                userloginmenu();

                            } else if (input == 2) {

                                System.out.println("|--------------------------------------------------|");
                                System.out.println("                  SEARCH MENU");
                                System.out.println();
                                System.out.println("               1.SEARCH BY DATE");
                                System.out.println("               2.SEARCH BY CITY");
                                System.out.print(" ");
                                int n1 = sc.nextInt();
                                sc.nextLine();
                                int count=0;
                                String city="";
                                if (n1 == 1) {
                                    System.out.println("|--------------------------------------------------|");
                                    System.out.println(" ENTER THE DEPARTURE DATE");
                                    System.out.print(" ");
                                    String date = sc.nextLine();
                                    count=obj1.searchbydate(date);
                                } else if (n1 == 2) {
                                    System.out.println("|--------------------------------------------------|");
                                    System.out.println(" ENTER THE DEPARTURE CITY");
                                    System.out.print(" ");
                                    city = sc.nextLine();
                                    count=obj1.searchbycity(city);
                                }
                                if(count>0)
                                {   long cid = obj.getcid(username, password);
                                    String nami = obj.getname(username, password);
                                    System.out.println("|--------------------------------------------------|");
                                    System.out.println(" ENTER THE FLIGHT ID TO BOOK SEATS");
                                    System.out.print(" ");
                                    long n3 = sc.nextLong();
                                    if(obj3.FlightIdChecker(n3))
                                    {   String at = obj1.getarrcity(n3);
                                        obj3.printseats(n3, 1);
                                        obj3.printseats(n3, 2);
                                        System.out.println("|--------------------------------------------------|");
                                        System.out.println(" ENTER THE SEAT YOU WANT TO BOOK");
                                        System.out.print(" ");
                                        long n4 = sc.nextLong();
                                        if(obj3.userbookflight(n3, n4)==true)
                                        {   
                                            long pt = obj1.retprice(n3);
                                            long pt1 = obj3.getpricec(n3, n4, pt);
                                            System.out.println("|--------------------------------------------------|");
                                            System.out.println(" PAY AN AMOUNT OF "+ pt1);
                                            System.out.print(" ");
                                            long pt2 = sc.nextLong();
                                            if(pt2==pt1)
                                            {
                                                boolean cp = false;
                                                while (cp != true) {
                                                 Random rnd = new Random();
                                                 long tid = rnd.nextInt(999999);
                                                 if (obj5.tidChecker(tid)==false)
                                                 {  
                                                    Date tratime = new Date();
                                                     obj5.addbooking(tratime, tid, n3, n4, cid, nami, city, at, pt1, true);
                                                     cp=true;
                                                     System.out.println("|--------------------------------------------------|");
                                                     System.out.println("            PROCESSING TRANSACTION..........");
                                                     System.out.println("            SEAT SUCCESSFULLY BOOKED");
                                                     System.out.println("|--------------------------------------------------|");
                                                 }
                            
                                            }
                                            }
                                            else
                                            {
                                                System.out.println("|--------------------------------------------------|");
                                                System.out.println("                 TRANSACTION FAILED");
                                                System.out.println("              PLEASE ENTER CORRECT AMOUNT");
                                                System.out.println("|--------------------------------------------------|");
            
                                            }
                                            
                                        }
                                        else
                                        {   
                                            
                                            System.out.println("|--------------------------------------------------|");
                                            System.out.println("                 SEAT TAKEN/NO SUCH SEAT");
                                            System.out.println("|--------------------------------------------------|");
                                        }
                                        boolean c=false;
                                        while(c!=true)
                                        {   System.out.println();
                                            System.out.println();
                                            System.out.println("|--------------------------------------------------|");
                                            System.out.println("         WOULD YOU LIKE TO BOOK ANOTHER SEAT FOR");
                                            obj2.printname(cid);
                                            //System.out.println(cid);
                                            System.out.println();
                                            System.out.println("         PRESS 1 FOR YES, 2 FOR NO");
                                            System.out.println("|--------------------------------------------------|");
                                            int k = sc.nextInt();
                                            if(k==1)
                                            {   sc.nextLine();
                                                System.out.println("ENTER THE NAME OF PERSON YOU WOULD LIKE TO BOOK FOR");
                                                String namii = sc.nextLine();
                                                obj3.printseats(n3, 1);
                                                obj3.printseats(n3, 2);
                                                System.out.println("|--------------------------------------------------|");
                                                System.out.println(" ENTER THE SEAT YOU WANT TO BOOK");
                                                System.out.print(" ");
                                                long n5 = sc.nextLong();
                                                if(obj3.userbookflight(n3, n5)==true)
                                                {   
                                                    long pt = obj1.retprice(n3);
                                                    long pt1 = obj3.getpricec(n3, n5, pt);
                                                    System.out.println("|--------------------------------------------------|");
                                                    System.out.println(" PAY AN AMOUNT OF "+ pt1);
                                                    System.out.print(" ");
                                                    long pt2 = sc.nextLong();
                                                    if(pt2==pt1)
                                                    {
                                                        boolean cp = false;
                                                        while (cp != true) {
                                                        Random rnd = new Random();
                                                        long tid = rnd.nextInt(999999);
                                                        if (obj5.tidChecker(tid)==false)
                                                        {  
                                                            Date tratime = new Date();
                                                            obj5.addbooking(tratime, tid, n3, n5, cid, namii, city, at, pt1, true);
                                                            cp=true;
                                                            System.out.println("|--------------------------------------------------|");
                                                            System.out.println("            PROCESSING TRANSACTION..........");
                                                            System.out.println("            SEAT SUCCESSFULLY BOOKED");
                                                            System.out.println("|--------------------------------------------------|");
                                                            
                                                        }
                                    
                                                    }
                                                    }
                                                    else
                                                    {
                                                        System.out.println("|--------------------------------------------------|");
                                                        System.out.println("                 TRANSACTION FAILED");
                                                        System.out.println("              PLEASE ENTER CORRECT AMOUNT");
                                                        System.out.println("|--------------------------------------------------|");
                            

                                                    }
                                                    
                                                }
                                                else
                                                {   
                                                    
                                                    System.out.println("|--------------------------------------------------|");
                                                    System.out.println("                 SEAT TAKEN/NO SUCH SEAT");
                                                    System.out.println("|--------------------------------------------------|");
                                                }
                                               
                                                
                                            }
                                            else if(k==2)
                                            {
                                                c=true;
                                                userloginmenu();
                                            }
                                            else
                                            {
                                                System.out.println("|--------------------------------------------------|");
                                                System.out.println("                 ENTER A VALID INPUT");
                                                System.out.println("|--------------------------------------------------|");
                                                
                                            }
                                        }
                                    }
                                    else{
                                        System.out.println("|--------------------------------------------------|");
                                        System.out.println("                 WRONG FLIGHTID");
                                        System.out.println("|--------------------------------------------------|");
                                        userloginmenu();
                                    }
                                   
                                       
                                }
                                
                            } 
                            else if (input == 3)
                            {
                                sc.nextLine();
                                System.out.println("|--------------------------------------------------|");
                                System.out.println(" TO CANCEL A BOOKING PRESS 1 ");
                                System.out.print(" ");
                                long nn = sc.nextLong();
                                if(nn==1)
                                {   long cid = obj.getcid(username, password);
                                    obj5.printtra(cid);
                                    System.out.println("|--------------------------------------------------|");
                                    System.out.println(" ENTER TICKET NUMBER TO CANCEL");
                                    System.out.print(" ");
                                    long np = sc.nextLong();
                                    if(obj5.cancelticket(np))
                                    {
                                        System.out.println("|--------------------------------------------------|");
                                        System.out.println("                 CANCELLATION SUCCESSFUL");
                                        System.out.println("|--------------------------------------------------|");
                                    }
                                    else
                                    {
                                        System.out.println("|--------------------------------------------------|");
                                        System.out.println("                 CANCELLATION FAILED");
                                        System.out.println("|--------------------------------------------------|");
                                    }
                                }
                                else{
                                    System.out.println("|--------------------------------------------------|");
                                    System.out.println("                 HAVE A NICE DAY");
                                    System.out.println("|--------------------------------------------------|");
                                }
                                userloginmenu();
                            } else if (input == 4) 
                            {
                                sc.nextLine();
                                System.out.println("|--------------------------------------------------|");
                                System.out.println(" ENTER USERS NAME");
                                System.out.print(" ");
                                String iname = sc.nextLine();
                                System.out.println("|--------------------------------------------------|");
                                System.out.println(" ENTER USERS GENDER");
                                System.out.print(" ");
                                String igender = sc.nextLine();
                                System.out.println("|--------------------------------------------------|");
                                System.out.println(" ENTER USERS PASSPORTNUMBER");
                                System.out.print(" ");
                                String ipass = sc.nextLine();
                                System.out.println("|--------------------------------------------------|");
                                System.out.println(" ENTER USERS AADHAR NUMBER");
                                System.out.print(" ");
                                String iaadh = sc.nextLine();
                                System.out.println("|--------------------------------------------------|");
                                System.out.println(" ENTER USERS AADHAR NUMBER");
                                System.out.print(" ");
                                String agi = sc.nextLine();
                                long ccid = obj.getcid(username, password);
                                obj2.addpeopleprefernces(ccid, ipass, iaadh, iname, agi, igender);
                                userloginmenu();
                            } else if (input == 5) {
                                System.out.println();
                                System.out.println("|--------------------------------------------------|");
                                System.out.println("                PREFERENCE MENU");
                                System.out.println();
                                System.out.println("                1.ADD CITY");
                                System.out.println("                2.REMOVE CITY");
                                int inp9 = sc.nextInt();
                                long cid = obj.getcid(username, password);
                                if(inp9==1)
                                {
                                    System.out.println("|--------------------------------------------------|");
                                    System.out.println(" ENTER A PREFERRED CITY YOU TRAVEL TO");
                                    System.out.print(" ");
                                    String city = sc.nextLine();
                                    
                                    int count  = obj6.numchecker(cid);
                                    if(count<5)
                                    {
                                        obj6.addcity(cid, city);
                                    }
                                    else if(count==5)
                                    {
                                        System.out.println("|----------------------------------------------------------|");
                                        System.out.println(" ONLY 5 PREFERNCES CAN BE ADDED PLS REMOVE 1 AND THEN ADD");
                                        System.out.println("|----------------------------------------------------------|");
                                    }
                                    userloginmenu();
                                    
                                }
                                else if(inp9==2)
                                {
                                    System.out.println("|--------------------------------------------------|");
                                    System.out.println(" ENTER THE CITY YOU WOULD LIKE TO REMOVE");
                                    System.out.print(" ");
                                    String city1 = sc.nextLine();
                                    if(obj6.removecity(cid, city1))
                                    {
                                        System.out.println("|-----------------------------|");
                                        System.out.println("  CITY SUCCESSFULLY REMOVED");
                                        System.out.println("|-----------------------------|");
                                    }
                                    else{
                                        System.out.println("|-----------------------------|");
                                        System.out.println("  CITY NOT PRESENT");
                                        System.out.println("|-----------------------------|");
                                    }
                                    userloginmenu();
                                }
                               

                            }
                            else if(input==6)
                            {
                                check3=false;
                                mainmenu();
                            }

                        }
                    } 
                    else{
                        System.out.println("|--------------------------------------------------|");
                        System.out.println("                 WRONG PASSWORD");
                        System.out.println("|--------------------------------------------------|");
                        mainmenu();
                    }
                } 
                else {
                    System.out.println("|--------------------------------------------------|");
                    System.out.println("                 WRONG USERNAME");
                    System.out.println("|--------------------------------------------------|");
                    mainmenu();
                }

            } else if (n == 3) 
            {
                System.out.println("|------------------------------------------------------|");
                System.out.println("               ENTER ADMIN PASSWORD: ");
                sc.nextLine();
                String apass = sc.nextLine();
                if (obj4.getpassword().equals(apass)) {
                    boolean loop = true;
                    adminloginmenu();
                    while (loop != false) 
                    {
                        System.out.print(" ");
                        int input = sc.nextInt();
                        if (input == 1) {
                            sc.nextLine();
                            System.out.println("|--------------------------------------------------|");
                            System.out.println("  ENTER THE FLIGHT NAME");
                            System.out.print(" ");
                            String s1 = sc.nextLine();
                            System.out.println("|--------------------------------------------------|");
                            System.out.println("  ENTER NUMBER OF BUSINESS CLASS ROWS");
                            System.out.print(" ");
                            int i1 = sc.nextInt();
                            sc.nextLine();
                            System.out.println("|--------------------------------------------------|");
                            System.out.println("  ENTER NUMBER OF ECONOMY CLASS ROWS");
                            System.out.print(" ");
                            int i2 = sc.nextInt();
                            boolean c = false;
                            long fid = 0;
                            while (c != true) {
                                Random rnd = new Random();
                                fid = rnd.nextInt(999999);
                                if (obj3.FlightIdChecker(fid)==false)
                                {
                                    c = true;
                                    obj3.addnewflight(i1, i2, s1, fid);
                                    obj1.addflight(fid, "", "", null, null, null, null, s1,0,0);
                                }

                            }
                            adminloginmenu();
                            
                        } 
                        else if (input == 2) 
                        {
                            obj1.adminprintflights();
                            System.out.println("|--------------------------------------------------|");
                            System.out.println("  ENTER FLIGHT ID TO ADD/CHANGE DETAILS");
                            System.out.print(" ");
                            long fid = sc.nextLong();
                            if (obj1.fidChecker(fid)) {
                                sc.nextLine();
                                System.out.println("|--------------------------------------------------|");
                                System.out.println("  ENTER THE DESTINATION CITY");
                                System.out.print(" ");
                                String dc = sc.nextLine();
                                System.out.println("|--------------------------------------------------|");
                                System.out.println("  ENTER THE ARRIVAL CITY");
                                System.out.print(" ");
                                String ac = sc.nextLine();
                                System.out.println("|--------------------------------------------------|");
                                System.out.println("  ENTER THE DEPARTURE DATE");
                                System.out.print(" ");
                                String ddate = sc.nextLine();
                                Date testDate1 = obj1.datechecker(ddate);
                                System.out.println("|--------------------------------------------------|");
                                System.out.println("  ENTER THE ARRIVAL DATE");
                                System.out.print(" ");
                                String adate = sc.nextLine();
                                Date testDate2 = obj1.datechecker(adate);
                                System.out.println("|--------------------------------------------------|");
                                System.out.println("  ENTER THE DEPARTURE TIME");
                                System.out.print(" ");
                                String dtime = sc.nextLine();
                                Date testDate3 = obj1.timechecker(dtime);
                                System.out.println("|--------------------------------------------------|");
                                System.out.println("  ENTER THE ARRIVAL TIME");
                                System.out.print(" ");
                                String atime = sc.nextLine();
                                Date testDate4 = obj1.timechecker(atime);
                                System.out.println("|--------------------------------------------------|");
                                System.out.println("  ENTER THE BASE PRICE PER TICKET");
                                System.out.print(" ");
                                long price = sc.nextLong();
                                System.out.println("|--------------------------------------------------|");
                                System.out.println("  ENTER THE FLIGHT TYPE");
                                System.out.println("  1.INTERNATIONAL");
                                System.out.println("  2.DOMESTIC");
                                System.out.print(" ");
                                long di = sc.nextLong();
                                obj1.changeflightdetails(fid, dc, ac, testDate1, testDate2, testDate3, testDate4,price,di);
                                obj1.printstuff(fid);
                            } else {
                                System.out.println("|--------------------------------------------------|");
                                System.out.println("               NO SUCH FLIGHT ID");
                                System.out.println("|--------------------------------------------------|");

                            }
                            adminloginmenu();
                        }
                        else if (input == 3)
                        {
                            obj1.adminprintflights();
                            System.out.println("|--------------------------------------------------|");
                           System.out.println("  ENTER FLIGHT ID TO REMOVE IT COMPLETELY");
                            System.out.print(" ");
                            long fid = sc.nextLong();
                            if (obj1.fidChecker(fid)) {
                                obj1.removeflight(fid);
                                obj3.removeflight(fid);
                            } else {
                                System.out.println("|--------------------------------------------------|");
                                System.out.println("               NO SUCH FLIGHT ID");
                                System.out.println("|--------------------------------------------------|");
                            }
                            adminloginmenu();
                       }
                       else if(input==4)
                       {
                        sc.nextLine();
                        System.out.println("|------------------------------------------------------|");
                        System.out.println("    ENTER USERS PASSPORTNUMBER TO VIEW HIS INFO ");
                        String inp8  = sc.nextLine();
                        obj.printuserinfo(inp8);
                        adminloginmenu();
                       }
                       else if(input==5)
                       {
                        sc.nextLine();
                        System.out.println("|------------------------------------------------------|");
                        System.out.println("               ENTER OLD ADMIN PASSWORD: ");
                        String pass = sc.nextLine();
                        if (obj4.getpassword().equals(pass)) {
                        System.out.println("|------------------------------------------------------|");
                        System.out.println("               ENTER NEW ADMIN PASSWORD: ");
                        String npass = sc.nextLine();
                        obj4.setpassword(npass);
                        adminloginmenu();
                        } else {
                        System.out.println("|--------------------------------------------------|");
                        System.out.println("                 WRONG PASSWORD");
                        System.out.println("|--------------------------------------------------|");
                        adminloginmenu();
                        }
                       
                       }
                        else if(input==6)
                        {
                            loop=false;
                            mainmenu();
                        }
                    }
                }
                else{
                    System.out.println("|--------------------------------------------------|");
                    System.out.println("                 WRONG PASSWORD");
                    System.out.println("|--------------------------------------------------|");
                    mainmenu();
                }

            } 
            else if (n == 4) 
            {
                check1 = false;
            } else 
            {
                System.out.println("|--------------------------------------------------|");
                System.out.println("                 ENTER VALID INPUT");
                System.out.println("|--------------------------------------------------|");
                mainmenu();
            }
        }
        sc.close();
    }
}



