package strategy;

import java.io.File;
import java.util.ArrayList;

/**
 * @author vaibh
 *
 */
public class RarCompressionStrategy implements IStrategy {

	@Override
	public void compressFiles(ArrayList<File> files) {
		System.out.println("compressing using rar...");
	}

}
