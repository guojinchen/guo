package file;


/**该文件夹下有子文件夹（子文件夹里又有文件）、文件（包括图片、文本文件）···
 *
 * 把一个文件夹里的所有文件包括文件夹 一并原样拷贝到另一个目录中； 
 *@author guojinchen
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyDir001 {

	private  File dirFrom;
	private  File dirTo;

	public CopyDir001(File dirFrom, File dirTo) {
		super();
		this.dirFrom = dirFrom;
		this.dirTo = dirTo;
	}
	// 目标路径创建文件夹
	public void listFileInDir(File file) {
		File[] files = file.listFiles();
		for (File f : files) {
			String tempfrom = f.getAbsolutePath();    //源路径
			String tempto = tempfrom.replace(dirFrom.getAbsolutePath(),
					dirTo.getAbsolutePath()); // 把前面部分路径名替换为 目标路径名
			if (f.isDirectory()) {
				File tempFile = new File(tempto);
				tempFile.mkdirs();           //创建空文件夹
				listFileInDir(f);         //递回调用
			} else {
				System.out.println("源文件:" + tempfrom);
				System.out.println("目标点:" + tempto);
				copy(tempfrom, tempto);
			}
		}
	}
	/**
	 * 文件拷贝方法
	 */
	public void copy(String from, String to) {
		try {
			InputStream in = new FileInputStream(from);
			OutputStream out = new FileOutputStream(to);

			byte[] buff = new byte[1024];
			int len = 0;
			while ((len = in.read(buff)) != -1) {
				out.write(buff, 0, len);
			}
			in.close();
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		File fromfile = new File("e:\\test");// 源文件夹
		File tofile = new File("e:\\test1");// 目标

		CopyDir001 copy = new CopyDir001(fromfile,tofile);
		copy.listFileInDir(fromfile);

	}
}
