class var_error {
	public static void main(String[] args) {
		/*
			String str = ""; // OK : 빈 문자열
		   	char ch = ''; // ERROR : 반드시 하나의 문자가 들어가야 함
			char ch = ' '; // OK : 공백이 하나의 문자가 됨
			char ch = "A"; // ERROR : cannot convert from String to char
			String str = 'a'; // ERROR : cannot convert from char to String
			String str = 'abc'; // ERROR : Invalid character constant
		 */
        String v1 = "a";
		String v2 = new String("abc");
		//char v1 = "A";
		System.out.println(v1); // 주석처리
		System.out.println(v2); // 주석처리
		System.exit(0);
	}
}
