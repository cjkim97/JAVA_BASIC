public class operator {
    public static void main(String[] args) {
        int x = 5;
        System.out.println("++/-- 연산자의 흐름, 단 한 식에 여러번 사용하는 것은 주의");
        x = x++ - ++x;
        System.out.printf("x = 5일때, x++ - ++x : %d\n",x);

        x = 5;
        x = ++x - x++;
        System.out.printf("x = 5일때, ++x - x++ : %d\n",x);

        x = 5;
        int y = 4;

        System.out.printf("int / int : %d / %d = ", x, y );
        System.out.print(x/y);
        
        System.out.println("Math.round()");
        // 버림을 하고 싶으면 형변환 이용
        // round 를 이용하여 반올림 가능(소수점 첫째자리에서 반올림)
        System.out.println(Math.round(3.141592));

        String s1 = new String("abc");
        String s1_1 = new String("abc");
        
        String s2 = "abc";

        System.out.printf("s1 = new String(%s),s1_1 = new String(%s) , s2 = %s%n", s1,s1_1,s2);
        System.out.printf("s1 == s1_1 : %b%n", s1==s1_1);
        System.out.printf("s1 == s2 : %b%n", s1==s2);
        System.out.printf("s1 == 'abc' : %b%n", s1=="abc");
        System.out.printf("s2 == 'abc' : %b%n", s2=="abc");
        
        System.out.printf("s1.equals(s2) : %b%n", s1.equals(s2));
        System.out.printf("s1.equals('abc') : %b%n", s1.equals("abc"));
        System.out.printf("s2.equals('abc') : %b%n", s1.equals("abc"));
        System.out.printf("s2.equalsIgnoreCase('Abc') : %b%n", s1.equalsIgnoreCase("Abc"));
        
        
        int result = 0;
        result = 4>5 ? result +=1 : result;

        System.out.println("? : 연산자");
        System.out.print(result);

    }
    
}
