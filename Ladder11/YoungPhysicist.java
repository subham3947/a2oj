import java.util.Scanner;

public class YoungPhysicist{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] coord = new int[n][3];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 3; j++){
                coord[i][j] = sc.nextInt();
            }
        }
        int x = 0, y = 0, z = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 3; j++){
                x += coord[i][0];
                y += coord[i][1];
                z += coord[i][2]; 
            }
        }
        if(x == 0 && y == 0 && z == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
            

    }
}
