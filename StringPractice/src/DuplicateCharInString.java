
public class DuplicateCharInString {
	public static void main(String[] args) {
		String name ="shashank boge";
		String [] arr=name.replace(" ","").split("");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i].equals(arr[j])) {
					System.out.print(arr[j]+" ");
				}	
			}
		}
	}
}
