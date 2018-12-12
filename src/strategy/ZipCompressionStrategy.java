/**
 * 
 */
package strategy;

import java.io.File;
import java.util.ArrayList;

/**
 * @author Vaibhav
 *
 */
public class ZipCompressionStrategy implements IStrategy{

	@Override
	public void compressFiles(ArrayList<File> files) {
		System.out.println("compressing using zip...");
	}
	
}
