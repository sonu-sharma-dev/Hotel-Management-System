import java.util.*;
import java.util.Scanner;
public class Hotel {
    String[] Nm = new String[10];       // nm = Name(Customer Name)
    String[] Em = new String[10];      // Em = Email(Customer Email)
    String[] Ni = new String[10];      // Ni = Nic(Customer NIC (national identification card) )
    int[] Rn = new int[10];            // Rn = RoomNumber(Hotel RoomNumber)
    public int[] Nig = new int[10];    // Nig = NightStay(Customer Time)
    public int Val=0 , i=0, choice = 0;  // Val = Value (RECORDS = CustomerRecords)
    long[] total = new long[10];              // total = total bill of Customer Room.
    int j = 0, opt = 0;
    Scanner a = new Scanner(System.in);
    public void CreateData(){
        System.out.println("Rooms\t\t\t\tPrices\n\n1.Standard-Room\t\t15000\n2.Suit-Room\t\t\t20000\n3.Deluxe-Room\t\t18000\n4.doubleDelux-Room\t25000\n");
        System.out.println("Please enter your Choice: ");
        choice = a.nextInt();
        if (choice<=4) {
            do {
                System.out.println("How Many rooms do you want to book? \n(only 10 rooms are there in hotel.)");
                Val = a.nextInt();
                if (Val <= 0 || Val >= 10) { System.out.println("Plz Enter Correct Number "); }
                else {
                    for (i = 1; i <= Val; i++) {
                        do {
                            System.out.println("Record# " + i + " Enter RoomNumber: ");
                            Rn[i] = a.nextInt();
                            if (Rn[i] > 10) { System.out.println("Please Enter Number 1 to 10."); }
                        } while (Rn[i] > 10);
                        System.out.println("Record# " + i + " Enter you Name: ");
                        Nm[i] = a.next();
                        System.out.println("Record# " + i + " Enter Your Email: ");
                        Em[i] = a.next();
                        System.out.println("Record# " + i + " Enter Your Nic-Number: ");
                        Ni[i] = a.next();
                        System.out.println("Record# " + i + " How Many night do you want to stay? ");
                        Nig[i] = a.nextInt();
                        if (choice == 1) {
                            total[i] = Nig[i] * 15000;
                            System.out.println("Record# " + i + " Your Total bill is = " + total[i]);
                        } else if (choice == 2) {
                            total[i] = Nig[i] * 20000;
                            System.out.println("Record# " + i + " Your Total bill is = " + total[i]);
                        } else if (choice == 3) {
                            total[i] = Nig[i] * 18000;
                            System.out.println("Record# " + i + " Your Total bill is = " + total[i]);
                        } else if (choice == 4) {
                            total[i] = Nig[i] * 25000;
                            System.out.println("Record# " + i + " Your Total bill is = " + total[i]);
                        }
                    }
                }
            } while (Val >= 10);
        }
    }

    public void ReadData(){
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        System.out.println("No.\t\tRomNo\t\tName\t\t\tEmail\t\tNic-Number\t\tNight-Stay\tPrice.");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------");
        for (i = 1; i<=Val; i++){
            System.out.println(i+"\t\t"+Rn[i]+"\t\t"+Nm[i]+"\t\t"+Em[i]+"\t\t"+Ni[i]+"\t\t\t\t"+Nig[i]+"\t\t\t"+total[i]);
        } }


    public void UpdateData(){
        if (Val<=0){
            System.out.println("No Data to Update.");
        }
        else {
            ReadData();
            System.out.println("\nEnter Index Number to Update the Record?");
            j = a.nextInt();
            if (j<0||j>Val){
                throw new IllegalArgumentException();
            }
            else
            {
                do {
                    System.out.println("1.Name\t2.RoomNumber\t3.Email\t4.NightStay\t5.NIC\t6.Exit");
                    System.out.println("Enter Your Choice.");
                    opt = a.nextInt();

                    if (opt == 1) {
                        System.out.println("Enter Your Name");
                        Nm[j] = a.next();
                    }
                    else if (opt == 2) {
                        System.out.println("Enter Your RoomNumber");
                        Rn[j] = a.nextInt();
                    }
                    else if (opt == 3){
                        System.out.println("Enter Your Email");
                        Em[j]=a.next();
                    }
                    else if (opt == 4){
                        System.out.println("how many Nights do you want to Stay?");
                        Nig[j]=a.nextInt();
                    }
                }while (opt<=5);
            }
            System.out.println("After Updates Customer Records");
            ReadData();
        }
    }
    public void DeleteData(){
        if (Val<1){
            System.out.println("........No data to delete.\n");
        }
        else {
            ReadData();
            System.out.println("\n"+"...");
            System.out.println("Enter Index Number to Delete the Records");
            int j = a.nextInt();
            if (j<0||j>Val){throw new IllegalArgumentException();}
            for (int i=j; i<=Val;i++){
                Rn[i]=Rn[i+1];
                Nm[i]=Nm[i+1];
                Em[i]=Em[i+1];
                Ni[i]=Ni[i+1];
                Nig[i]=Nig[i+1];
            }
            Val--;
            System.out.println("\nAfter Deletion Customer Records");
            ReadData();
        }
    }
    public void SearchData(){
        System.out.println("Enter RoomNumber to Search Customer Records: (\n\t Rooms are 1 to 10.)");
        int room = a.nextInt();
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("No.\t\tRomNo\tName\t\t\tEmail\t\tNic-Number\t\tNight-Stay\t\tPrice.");
        System.out.println("-----------------------------------------------------------------------------------------");
        for (i=1; i<=Val; i++) {
            if (room == Rn[i]){
                System.out.println(i+"\t"+Rn[i]+"\t\t"+Nm[i]+"\t"+Em[i]+"\t"+Ni[i]+"\t\t"+Nig[i]+"\t\t"+total[i]);
            }

        }
    }
}