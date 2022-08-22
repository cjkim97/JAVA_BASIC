class output {
    public static void main(String[] args){

        String for_print1 = "저는 줄바꿈을 하지 않아요 <end> ";
        String for_print2 = "정말이죠? <end> ";
        String for_print3 = "이제 '\\n'을 써서 줄바꿈을 해볼게요 <end> \n";

        String for_println1 = "줄바꿈 됐나요?";
        String for_println2 = "println은 줄바꿈이 자동으로 된답니다 ";

        int for_printf = 20;
        String for_printf1 = "\nprintf 함수는 파이썬에서 문자열 포맷팅이라고 보면 돼요. ";
        String for_printf2 = "마찬가지로 줄바꿈을 하지 않습니다. \n\n";
        
        

        System.out.print(for_print1);
        System.out.print(for_print2);
        System.out.print(for_print3);

        System.out.println(for_println1);
        System.out.println(for_println2);

        System.out.printf(for_printf1);
        System.out.printf(for_printf2);
        
        System.out.printf("I am %d years old \n", for_printf);
        System.out.printf("My ID : %06d\n", for_printf);
        System.out.printf("My ID : %-6d\n", for_printf);
        System.out.printf("My ID : %6d\n", for_printf);
        
        System.exit(0);
    }
}
