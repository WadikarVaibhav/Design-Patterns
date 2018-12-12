/**
 * 
 */
package strategy;

import java.io.File;
import java.util.ArrayList;

/**
 * @author vaibhav
 *
 */
public interface IStrategy {
	public void compressFiles(ArrayList<File> files);
}
