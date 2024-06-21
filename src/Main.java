import java.util.*;

public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int res = n;
        int cnt = 1;
        int tmp = n;
        
        n--;
        
        while (n > 0) {
            if (cnt % 4 == 1) {
                res *= n;
            } else if (cnt % 4 == 2) {
                res /= n;
            } else if (cnt % 4 == 3) {
                res += n;
            } else {
                res -= n;
            }
            
            cnt++;
            n--;
        }
        
        System.out.println(res);
    }
   
}
