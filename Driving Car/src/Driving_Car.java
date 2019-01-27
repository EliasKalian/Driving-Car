import java.util.*;
public class Driving_Car {

	private static Scanner sc;

	public static void main(String[] args) {
		String speed;
		int loops;
		sc = new Scanner(System.in);
		System.out.println("SPEED: ");
		speed = sc.nextLine();
		System.out.println("LOOPS: ");
		loops = sc.nextInt();
        String txt = "";
        String lines = "";
        String head = " _____ ";
        String body = "( CAR )";
        String wheel= "O-----O";
        String street= "____________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________";
        int s = 0;
        if((speed.equalsIgnoreCase("slow") || speed.equalsIgnoreCase("fast") || speed.equalsIgnoreCase("average"))) {
            if(speed.equalsIgnoreCase("slow")) {
               s = 100;   
            }
            else if (speed.equalsIgnoreCase("fast")) {
               s = 10;   
            }
            else {
                s = 50;
            }
            for(int i=0; i<=loops; i++) {
                txt += " ";
                try { Thread.sleep(s); } catch (Exception x) {};
                System.out.print("\u000C");
                System.out.println(lines + txt+head);
                System.out.println(txt+body);
                System.out.println(txt+wheel);
                System.out.println(street);
                if (i%269 == 0)
                {
                    txt = "";
                    lines += "\n";
                }
              
    
            }
        }
        else {
         System.out.println("Es gibt nur fast, average, slow!");   
        }

	}

}
