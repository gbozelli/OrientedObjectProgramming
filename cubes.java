import java.util.Scanner;

class program{
    public static void main(String[] args){
        cubes cubes = new cubes();
    }
}

class cubes{
    Scanner scan = new Scanner(System.in);
    cubes(){
        cubes();
    }
    public void cubes(){
        String stg = scan.nextLine();
        if(stg.equals("end")){
            double number = Double.parseDouble(stg);
            System.out.println(calCube(number));
            cubes();
        }else{
            System.out.println("end");;
        }
    }
    public double calCube(double number){
        return Math.pow(number,3);
    }
}