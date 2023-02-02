import java.util.Scanner;

class Ads{

    public void bubble(){

        System.out.println("Bubble code");
    }

    public void insertionsort(){
        System.out.println("Insertionsort code");
    }
    public static void name() {

        Scanner sc = new Scanner(System.in);

        Ads o = new Ads();
        o.bubble();

        int x;
        System.out.println("Enter 1 for bubble sort ,2 for insertionsort")
        x= sc.nextInt();
        switch ( x){
            case 1: 
               o.bubble();
                break;
            
            case 2:
            o.insertionsort();
            break;
            
            default:
            System.out.println("INvalid Input");


        }
    }
} 