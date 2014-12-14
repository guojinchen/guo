package cal;

public class Str {
        public static void main(String[] args) {
			String str  = "ADFKSFKADHKFLdfafd";
			int count=0 ;
			for(int i=0;i< str.length();i++){
				char ch =    str.charAt(i);
				System.out.println(ch);
				
				if(Character.isUpperCase(ch)){
					count++;
				}
			}
			System.out.println(count);
			
			
			
		}
}
