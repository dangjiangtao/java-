package cn.itcast.demo;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.StorageServer;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;

public class Test {
public static void main(String[] args) throws FileNotFoundException, IOException, Exception {
	ClientGlobal.init("C:\\Users\\dangjiangtao\\Desktop\\testkongjian\\fastDfsdemo\\src\\main\\resources\\fdfs_client.conf");
	TrackerClient trackerClient = new TrackerClient();
	TrackerServer trackerServer = trackerClient.getConnection();
	StorageServer storageServer = null;
	StorageClient storageClient = new StorageClient(trackerServer, storageServer);
	String[] strings = storageClient.upload_file("D:\\µ≥””””\\youyou.mp4", "mp4",
			null);
	for (String string : strings) {
		System.out.println(string);
	}
}
}
