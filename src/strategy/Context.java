package strategy;

import java.io.File;
import java.util.ArrayList;

/**
 * @author vaibh
 *
 */
public class Context {
	private IStrategy strategy;
	
	public Context(IStrategy strategy) {
		System.out.println("strategy : "+strategy);
		this.strategy = strategy;
	}
	
	public void createArchive(ArrayList<File> files) {
		System.out.println("creating archive...");
		System.out.println("current object "+this);
		strategy.compressFiles(files);
	}
}
