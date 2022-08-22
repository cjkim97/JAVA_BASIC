public class condition {
    public static void main(String[] args) {
    //     if (0) { // 파이썬에서는 0일 경우 False 로 인식 됐는데 여긴 안 된다
    //     System.out.print("HELLO");
    //    }

        
        int x=0;
        int level=1;

        // if (true) {
        //     System.out.print("true");
        // }

        if (x>0) {
            System.out.println("x>0");
        
        }
        else if (x<0) {
            System.out.println("x<0");
        }
        else {
            System.out.println("x==0");
        }

        // Switch 문에 break 이 없으면 상위 케이스에서만 조건을 만족해도 밑에 모든 케이스에서 다 실행된다
        // case 조건값은 무조건 '정수인 상수'여야 한다!
        // 즉, 변수(final 로 선언하지 않은 경우), 실수 리터럴(상수이나 실수 인 경우)은 안 된다
        level = 4; // default test 
        level = 2;
        switch (level) {
            case 1 : 
                System.out.println("level 1");
                break;
            case 2 : 
                System.out.println("level 2");
                break;
            case 3 : 
                System.out.println("level 3");
                break;
            default : 
                System.out.println("default");
                
        }
        
        level=1;
        switch (level) {
            case 1 : 
                System.out.println("case 1 level 1");
                //break;
            case 2 : 
                System.out.println("case 2 but level 1");
                //break;
            case 3 : 
                System.out.println("case 3 but level 1");
                //break;
                
        }
    }
    
}