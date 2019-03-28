package experiment;

import java.io.File;

import javax.swing.filechooser.FileFilter;

public class MyFileFillter extends FileFilter{
	public boolean accept(File f) {
		if(f.getName().contains(".txt") || f.isDirectory()) {
			return true;
		}
		return false;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "txt文件";
	}
	
	

}
