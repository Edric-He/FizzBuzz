public class Multiples {

    public static void main(String[] args){
        int j = 0;
        for (int i = 0; i < 1000; i ++){
            if (i % 3 == 0){
                j++;
            }
            else if (i % 5 == 0){
                j++;
            }
        }
        System.out.println(j);
    }
}
