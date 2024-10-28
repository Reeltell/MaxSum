import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader bf = new BufferedReader( new FileReader("file.txt"))){

            String str = "";
            int sum = 0;
            int min = 10000;

            while ((str = bf.readLine()) != null){
                String[] temp = str.split(" ");
                int a = Integer.parseInt(temp[0]);
                int b = Integer.parseInt(temp[1]);

                sum += Math.max(a, b);

                if (Math.abs(a-b) % 3 != 0){
                    min = Math.min(min, Math.abs(a - b));
                }
            }

            if (sum % 3 != 0)
            {
                System.out.println(sum);
            }
            else
            {
                System.out.println(sum - min);
            }

        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}