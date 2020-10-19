import java.util.Scanner;

public class AirlineReservationSystem {
    private boolean[] arrSeats = new boolean[10];
    private static Scanner sc = new Scanner(System.in);

    public static void start(){
        AirlineReservationSystem ars= new AirlineReservationSystem();
        ars.printGreeting();
        while(ars.seatAvailable()){
            ars.printMenu();
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    ars.assignSeat("economy"); break;
                case 2:
                    ars.assignSeat("first");break;
                default:
                    continue;
            }
        }
        System.out.println("Plane is full");
    }



    public boolean assignSeat(String section) {
        if (section == "first") {
            if (getFreeSeats(section) > 0) {
                for (int i = 0; i < 5; i++) {
                    if (arrSeats[i] == false) {
                        arrSeats[i] = true;
                        printBoardingPass(i);
                        return true;
                    }
                }
            }
        } else if (section == "economy") {
            if (getFreeSeats(section) > 0) {
                for (int i = 5; i < arrSeats.length; i++) {
                    if (arrSeats[i] == false) {
                        arrSeats[i] = true;
                        printBoardingPass(i);
                        return true;
                    }
                }
            }
        }
        System.out.printf("All seats in section \"%s\" are booked. \n", section );
        String otherSection=(section=="first")?"economy":"first";
        System.out.printf("Would you like to be moved to section \"%s\" (y/n)?",otherSection );
        if(sc.next().charAt(0)=='y')
            assignSeat(otherSection);
        else System.out.printf("\nNext Flight leaves in 3 hours. \n" );
        return false;
    }
    public boolean seatAvailable(){
        for(boolean seat: arrSeats)
            if(seat==false)
                return true;


        return false;
    }

    public void printGreeting() {
        System.out.println("\nWelcome to IUT Airlines booking system! ");}

    private void printBoardingPass(int seat){
        System.out.println("\nBoarding pass for IUT Airlines. ");
        System.out.printf("\nSECTION: %s\nSEAT NUMBER: %d\n\n\n",(seat<5)? "first": "economy", seat+1);
    }

    public void printMenu(){
        int economySeats=0, firstClassSeats=0;
        economySeats=getFreeSeats("economy");
        firstClassSeats=getFreeSeats("first");

        System.out.printf("1. Economy class %s\n",(economySeats>0)?"("+ economySeats+")": "(full)");
        System.out.printf("2. First class %s\n",(firstClassSeats>0)?"("+ firstClassSeats+")": "(full)");
        System.out.print(">");

    }
    private int getFreeSeats(String section) {
        int total = 0;
        if (section == "first") {
            for (int i = 0; i < 5; i++) {
                if (arrSeats[i] == false) total += 1;
            }
        }else if(section=="economy"){
            for(int i=5;i<arrSeats.length;i++){
                if(arrSeats[i]==false)
                    total +=1;
            }
        }
        return total;


    }
}
