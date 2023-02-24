
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Scanner scan = new Scanner(System.in);
        String MainMenu = ("\nEnter 1. For RoomBooking.\nEnter 2. For ViewRecord.\nEnter 3. For UpdateRecord\nEnter 4. For DeleteRecord\nEnter 5. For SearchRecord\nEnter 0. for End.");
        int option = 0;
        System.out.print("Welcome!");
        System.out.println("\n\t\t\t\t\t------------------------");
        System.out.println("\t\t\t\t\t|HOTEL-MANAGEMENT-SYSTEM|");
        do {
            System.out.println(MainMenu);
            System.out.println("_____________________________");
            System.out.println("\n\nEnter Your Choice: ");
            option = scan.nextInt();
            switch (option) {
                case 1: { hotel.CreateData(); }
                break;
                case 2: { hotel.ReadData();
                }
                break;
                case 3: { hotel.UpdateData();}
                break;
                case 4: { hotel.DeleteData(); }
                break;
                case 5: {hotel.SearchData();}
                break;
                default:
                    System.out.println("Please Enter correct Number.!");
            }
        } while (option != 0);

    }
}