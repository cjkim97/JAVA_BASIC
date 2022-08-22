import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int[] score = new int[]{1, 2, 3, 4,5 }; // new int[] 와 {} 사이에 띄어쓰기가 있으면 오류가 발생함
        int[] score2 = {1,2,3,4} ; // new int[] 생략 가능
        int[] score3; // 먼저 선언이 가능
        // score3 = {1, 2, 3}; // 선언 이후에 값을 넣을 때는 new int[] 생략이 불가
        score3 = new int[]{1, 2, 3, 4, 5};

        // 배열의 길이 및 출력
        System.out.println(score3); // [I : int 형 배열, @ 이후는 주소
        System.out.println(Arrays.toString(score3)); 
        System.out.printf("score 3의 길이 : %d\n",score3.length);

        char[] grade = {'a', 'b'};
        System.out.println(grade); // char 형은 예외로 바로 출력 가능, 하지만 이어서 출력이 됨
        System.out.println(Arrays.toString(grade));
        
        // 배열의 복사 System.arraycopy
        // tmp 배열에 GRADE 와 grade 를 합쳐서 넣어보자
        char[] GRADE = {'A', 'B'};
        System.out.printf("GRADE : %s, grade : %s \n", Arrays.toString(GRADE), Arrays.toString(grade));
        char[] tmp = new char[GRADE.length + grade.length]; // 사이즈 지정 선언 및 INT 일 경우 0으로 초기화
        System.out.printf("tmp : %s\n", Arrays.toString(tmp)); // tmp 는 공백이 4개 있는 걸로 초기화 되었음
        System.arraycopy(GRADE, 0, tmp, 0, GRADE.length);
        System.out.println("GRADE 복사 >> ");
        System.out.printf("tmp : %s\n", Arrays.toString(tmp)); // tmp 는 공백이 4개 있는 걸로 초기화 되었음
        System.arraycopy(grade, 0, tmp, GRADE.length, grade.length);
        System.out.println("grade 복사 >> ");
        System.out.printf("tmp : %s\n", Arrays.toString(tmp)); // tmp 는 공백이 4개 있는 걸로 초기화 되었음
        
    }
}
