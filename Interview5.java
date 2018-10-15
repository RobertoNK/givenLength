
public class Interview5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String list[] = {"a","bb","ccc","dddd","eeeee","ffffff","a","bb","dddd"};
		int givenLength =8;
		int count = 0;
		System.out.print("Strings with length equal to "+ givenLength+" are : ");
		for (int i = 0; i < list.length ; i++) {
			if(list[i].length()==givenLength) {
				System.out.print(list[i]+" ");
				count++;
				
			}
			
		}
		System.out.println(" ");
		if(count == 0) {
			System.out.println(count);
			
			
		}else {
			System.out.println("The number of strings with length equal to "+givenLength+" is: "+count);
			
		}
	}

}
