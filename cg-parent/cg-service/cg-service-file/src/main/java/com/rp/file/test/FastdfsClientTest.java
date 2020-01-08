package com.rp.file.test;

import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.junit.Test;

public class FastdfsClientTest {

    @Test
    public void test(){
        System.out.println("=====");
    }

    /**
     * 文件上传
     *
     * @throws Exception
     * http://192.168.25.201:8080/group1/M00/00/00/wKgZyV4V6Z2AM_ZpAAHltJ5vmAg97.jpeg
     */
    @Test
    public void upload() throws Exception {

        //加载全局的配置文件
        ClientGlobal.init("/Users/rp/study/cg/cg-parent/cg-service/cg-service-file/src/main/resources/fdfs_client.conf");

        //创建TrackerClient客户端对象
        TrackerClient trackerClient = new TrackerClient();
        //通过TrackerClient对象获取TrackerServer信息
        TrackerServer trackerServer = trackerClient.getConnection();
        //获取StorageClient对象
        StorageClient storageClient = new StorageClient(trackerServer, null);

        //执行文件上传
        String[] jpgs = storageClient.upload_file("/Users/rp/Documents/q4.jpeg", "jpeg", null);

        for (String jpg : jpgs) {

            System.out.println(jpg);
        }

    }



}
