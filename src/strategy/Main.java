/**
 * 
 */
package strategy;

/**
 * @author vaibh
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Context context = new Context(new TarCompressionStrategy());
		context.createArchive(null);
	}

}
