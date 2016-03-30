import java.util.Arrays;

public class RowTransInt implements Encryptable {
	
	private String[][] rowTransEncrypt;

	public String encrypt(String message, String key) {
		String encryptMessage = "";
		String noSpaces = message.replaceAll(" ", "");
		int rowsNeeded = key.length();
		int columnsNeeded;
		
		if (noSpaces.length() % rowsNeeded != 0) {
			columnsNeeded = (noSpaces.length() / rowsNeeded) + 1;
		}
		else {
			columnsNeeded = noSpaces.length() / rowsNeeded;
		}
		
		rowTransEncrypt = new String[columnsNeeded][rowsNeeded];
		int loopTrack = 0;
		
		for (int i = 0; i < columnsNeeded; i++) {
			for (int j = 0; j < rowsNeeded; j++) {
				while(loopTrack != (rowsNeeded * columnsNeeded)) {
					if (loopTrack >= noSpaces.length()) {
						rowTransEncrypt[i][j] = "*";
						loopTrack++;
						break;
					}
					else {
						rowTransEncrypt[i][j] = noSpaces.substring(loopTrack, loopTrack + 1);
						loopTrack++;
						break;
					}
				}
			}
		}
		
		for(String[] arr : rowTransEncrypt) {
			System.out.println(Arrays.toString(arr));
		}
		
		int[] arrayOrder = new int[key.length()];
		for (int i = 0; i < arrayOrder.length; i++) {
			arrayOrder[i] = Integer.parseInt(key.substring(i, i+1));
		}
		
		System.out.println(Arrays.toString(arrayOrder));
		
		
		
		return encryptMessage;
	}

	public String decrypt(String message, String key) {
		return null;
	}
	
	

}
