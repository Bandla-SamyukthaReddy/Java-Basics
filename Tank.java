import java.util.Scanner;
class Tank{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Tank Capacity:");
        int capacity = sc.nextInt();
        int totalwater= 0, water=0;
        while(totalwater<capacity){
            if(totalwater< capacity){
                System.out.println("Add Water");
                water = sc.nextInt();
                System.out.println("Water"+water+"Added");
                //totalwater += water;
            }
            totalwater += water;
            int remain = totalwater - capacity;
            if(totalwater > capacity){
                System.out.println("Tank Capacity "+remain+" overloaded");
            }else if (totalwater == capacity) System.out.println("Tank Filled Successfully.");
            else System.out.println("Remain Tank Capacity: "+(capacity - totalwater));
                
            }
            System.out.println("==TANK STATUS==");
                System.out.println("Tank Capacity = "+capacity);
                System.out.println("Water Stored= "+totalwater);    
        }
        
    }  