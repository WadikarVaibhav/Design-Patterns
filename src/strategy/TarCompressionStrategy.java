/**
 * 
 */
package strategy;

import java.io.File;
import java.util.ArrayList;

/**
 * @author vaibh
 *
 */
public class TarCompressionStrategy implements IStrategy {

	@Override
	public void compressFiles(ArrayList<File> files) {
		System.out.println("compressing using tar...");
		System.out.println("current object: "+this);
	}

}
