package jan09;

public class Test01 {
	public static void main(String[] args) {
		
		String code = ".... .  ... .-.. . . .--. ...  . .- .-. .-.. -.--";
		
		String[] re = code.split(" ");	//공백 하나 기준으로
		
		for (int i = 0; i < re.length; i++) {
			System.out.println(re[i]);
		}
		
	}
}
