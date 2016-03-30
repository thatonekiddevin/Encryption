public class Driver {

	public static void main(String[] args) {
		Encryptable Caesar = new CaesarInt();
		
		String key = "22";
		
		String eMessage = Caesar.encrypt("math is boring", key);
		System.out.println(eMessage);
		
		String dMessage = Caesar.decrypt(eMessage, key);
		System.out.println(dMessage);
		
		Encryptable RowTrans = new RowTransInt();
		String rowTransTest = RowTrans.encrypt("math is boring", "54231");
		System.out.println(rowTransTest);
	}
}
