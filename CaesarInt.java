/**
 * 
 * @author Devin Harris
 * A class that uses the methods of Caesar Cipher encryption/decryption to encrypt/decrypt messages.
 *
 */
public class CaesarInt implements Encryptable {
	
	/**
	 * An array that contains the alphabet, within the array the position of the letter holds the value
	 * that is used in the Caesar Cipher encryption/decryption
	 */
	private String[] alphabetArray = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
	
	
	/**
	 * The method that encrypts a message given a message and key
	 */
	public String encrypt(String message, String key) {
		int encryptKey = Integer.parseInt(key);
		String returnMessage = "";
		
		for (int i = 0; i < message.length(); i++) {
			for (int j = 0; j < alphabetArray.length; j++) {
				if (message.substring(i, i+1).equals(alphabetArray[j])) {
					if (j + encryptKey > 25) {
						returnMessage += alphabetArray[(j + encryptKey) - 25];
					}
					else if (j + encryptKey < 0) {
						returnMessage += alphabetArray[(j + encryptKey) + 25];
					}
					else {
						returnMessage += alphabetArray[j + encryptKey];
					}
					break;
				}
				else if (message.substring(i, i+1).equals(" ")) {
					returnMessage += " ";
					break;
				}
			}
		}
		
		return returnMessage;
		
	}
	
	/**
	 * A method that decrypts the message given a message and key
	 */
	public String decrypt(String message, String key) {
		int encryptKey = Integer.parseInt(key);
		String returnMessage = "";
		
		for (int i = 0; i < message.length(); i++) {
			for (int j = 0; j < alphabetArray.length; j++) {
				if (message.substring(i, i+1).equals(alphabetArray[j])) {
					if (j - encryptKey < 0) {
						returnMessage += alphabetArray[(j + 25) - encryptKey];
					}
					else if (j - encryptKey >= 25) {
						returnMessage += alphabetArray[(j - encryptKey) - 25];
					}
					else {
						returnMessage += alphabetArray[j - encryptKey];
					}
					break;
				}
				else if (message.substring(i, i+1).equals(" ")) {
					returnMessage += " ";
					break;
				}
			}
		}
		
		return returnMessage;
		
	}
	

}
