import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.junit.Test;

import com.mysql.jdbc.Connection;
import com.zhangyuhao.cms.DateUtils;
import com.zhangyuhao.cms.FileUtils;


public class Demo {

	//获取月初
	@Test
	public void getBeginMonth(){
		Date date = new Date();
		System.out.println(date);
		Date beginOfMonth = DateUtils.getBeginOfMonth();
		System.out.println(beginOfMonth);
	}
	//获取月末
	@Test
	public void getMonth(){
		Date date = new Date();
		System.out.println(date);
		Date endOfMonth = DateUtils.getEndOfMonth();
		System.out.println(endOfMonth);
	}
	
	
	//获取尾缀名
	@Test
	public void getExtendName(){
		String add = "add.jpg";
		String suffixName = FileUtils.getSuffixName(add);
		System.out.println(suffixName);
	}
	//关闭流
	@Test
	public void closeAll() throws Exception{
		FileInputStream fir = new FileInputStream("");
		FileUtils.closeStream(fir);
	}
	//读取文件并关闭流
	@Test
	public void readTextFile() throws IOException{
		String read = "D:\\01\\week.txt";
		String read2 = FileUtils.read(read);
		System.out.println(read2);
		FileUtils.closeStream();
	}
	//拼接sql
	@Test
	public void SQl(){
		String sql = "select * from t_order where create_time>='"+DateUtils.getBeginOfMonth()+"' and create_time<='"+DateUtils.getEndOfMonth()+"' ";
		System.out.println(sql);
	}
	
}
