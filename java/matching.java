package experiment;

public class matching {
	
	public static void main(String[] args) {
		
		int top = 0;// 计数，左括号 1，右括号 -1，最后总和0则匹配
		int bigtop = 0;
		boolean end = true;
		
		String biaoda = "{((1+(2)-6))";
		char[] biao = biaoda.toCharArray();
		
		for(int i=0;i<biao.length;i++) {
			if(biao[i] == '(') {
				top++;
			}else if(biao[i] == ')') {
				if(!(top == 0)) {
					top--;
				}else {//top == 0,无左括号却有一个右括号，有一个右括号不匹配
					System.out.println("小括号不匹配");
					end = false;
					return;
				}
			}else if(biao[i] == '{') {
				bigtop++;
			}else if(biao[i] == '}') {
				if(!(bigtop == 0)) {
					bigtop--;
				}else {//top == 0,无左括号却有一个右括号，有一个右括号不匹配
					System.out.println("大括号不匹配");
					end = false;
					return;
				}
			}
		}
		
		if(top == 0 && end) {
			System.out.println("小括号匹配");
		}else if (top != 0 && end){
            System.out.println("小括号不匹配");
        }
		
		if(bigtop == 0 && end) {
			System.out.println("大括号匹配");
		}else if (bigtop != 0 && end){
            System.out.println("大括号不匹配");
        }	
	}

}
