package api.demo;

import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;

public class UploadImg
{
    private static List Img=new ArrayList();
    private static List<File> data= new ArrayList<>();
    public static void main(String[] args) throws IOException {
        ImgName();
        getImg("E:\\官网改造\\templates-master-28ffde369cfe358100de8e6a33d2f8839bf91087\\img");
        for (File datum : data) {
            System.out.println(datum.getName());
        }
//        ajax(data.get(0));

    }
    public static void getImg(String path)
    {
//        System.out.println(111);
        File file=new File(path);
        File[] files=file.listFiles();
        if (files!=null){
            for (File file1 : files) {
                if (file1.isDirectory()){
                    getImg(file1.getAbsolutePath());
                } else{
                    for (int i = 0; i <Img.size() ; i++) {
//                        System.out.println(file1.isFile() && file1.getName().endsWith((String) Img.get(i)));
                        if (file1.isFile() && file1.getName().endsWith((String) Img.get(i))){
                            data.add(file1);
                        }
                    }
                }
            }
        }


    }
    public static void  ImgName(){
        Img.add(".png");
        Img.add(".jpg");
       Img.add(".gif");
    }
    /**
     * 集上传单个文件与传递参数于一体的方法
     *
     * @param actionURL  上传文件的URL地址包括URL
     * @param name       文件标识，用于服务器解析（相当于表单名）
     * @param fileStream 文件流
     * @param fileName   文件名
     * @param fileType   文件类型
     * @param parameters 跟文件一起传输的参数
     * @return
     */
    public static String singleFileUploadWithParameters(String actionURL, String name,  InputStream fileStream,
                                                        String fileName, String fileType, HashMap<String, String> parameters) {
        String end = "\r\n";
        String twoHyphens = "--";
        String boundary = "----WebKitFormBoundary851PD6JXXxfIPFk9";
        String response = "";
        try {
            URL url = new URL(actionURL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            // 发送post请求需要下面两行
            connection.setDoInput(true);
            connection.setDoOutput(true);
            // 设置请求参数
            connection.setUseCaches(false);
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Connection", "Keep-Alive");
            connection.setRequestProperty("Charset", "UTF-8");
            connection.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + boundary);
            // 获取请求内容输出流
            DataOutputStream ds = new DataOutputStream(connection.getOutputStream());
            // 开始写表单格式内容
            // 写参数
            if (parameters != null) {
                Set<String> keys = parameters.keySet();
                for (String key : keys) {
                    ds.writeBytes(twoHyphens + boundary + end);
                    ds.writeBytes("Content-Disposition: form-data; name=\"");
                    ds.write(key.getBytes());
                    ds.writeBytes("\"" + end);
                    ds.writeBytes(end);
                    ds.write(parameters.get(key).getBytes());
                    ds.writeBytes(end);
                }
            }
            // 写文件
            ds.writeBytes(twoHyphens + boundary + end);
            ds.writeBytes("Content-Disposition: form-data; " + "name=\"" + name + "\"; " + "filename=\"");
            // 防止中文乱码
            ds.write(fileName.getBytes());
            ds.writeBytes("\"" + end);
            ds.writeBytes("Content-Type: " + fileType + end);
            ds.writeBytes(end);
            // 根据路径读取文件
            byte[] buffer = new byte[1024];
            int length = -1;
            while ((length = fileStream.read(buffer)) != -1) {
                ds.write(buffer, 0, length);
            }
            ds.writeBytes(end);
            fileStream.close();
            ds.writeBytes(twoHyphens + boundary + twoHyphens + end);
            ds.writeBytes(end);
            ds.flush();
            try {
                // 获取URL的响应
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"));
                String s = "";
                String temp = "";
                while ((temp = reader.readLine()) != null) {
                    s += temp;
                }
                response = s;
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("No response get!!!");
            }
            ds.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Request failed!");
        }
        return response;
    }
}
