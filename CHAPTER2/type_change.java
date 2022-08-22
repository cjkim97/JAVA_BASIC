public class type_change {
    public static void main(String[] args){

        char i = (char)1000; // 명시적 형변환
        char j = 1000; // 자동형변환?

        System.out.println(i);
        System.out.println(j);
        // System.out.printf("%d", j); // error 발생
        System.out.printf("%d", (int)j); 


        System.exit(0);
    }
}
