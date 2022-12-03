class RemoveDuplicate{
	public static void main(String[] args) {
		String name ="shashank boge";
		char ch[] =name.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i+1; j < ch.length; j++) {
				if(ch[i]==ch[j]) {
					
				}	
			}
		}
		System.out.println(name);
	}
}