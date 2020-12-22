package api.Url;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@Controller
public class Image {//返回图片和文件


    /**
     下载图片
     url：/upload/{img}
     传参方式：路径传参
     参数：
     {img}：图片名称

     **/
    @RequestMapping("/upload/{img}")
    public void Uploadimg(HttpServletResponse response, @PathVariable("img") String img){
        FileInputStream file=null;
        response.setContentType("image/*");
        try{
            OutputStream out=response.getOutputStream();
            File file1=new File("E:"+File.separator+"image"+File.separator+img);
            if (!file1.exists()){
                return;
            }
            file =new FileInputStream(file1);
            byte[] bytes=new byte[file.available()];
            file.read(bytes);
            out.write(bytes);
            out.flush();
        }catch (Exception e){
            System.out.println("图片报错！！！错误："+e);
            return;
        }finally {
            if (file!=null){
                try{
                    file.close();
                }catch (IOException e){
                    e.printStackTrace();
                }

            }
        }

    }


    /**
     * 获取图片
     * url:/img/{img}
     传值方式：路径传参
     参数：
     {img}：图片名称
     请求方式:get
     **/
    @RequestMapping("/{img}")
    public void getImageStr(String imgFile,@PathVariable("img") String img,HttpServletResponse response) throws IOException {
        BufferedInputStream inputStream = null;
        ServletOutputStream out=null;
        try {
            File file=new File("E:"+File.separator+"image"+File.separator+img);
            if (!file.exists()){
                return;
            }
            inputStream = new BufferedInputStream(new FileInputStream(file));
            out=response.getOutputStream();
            byte[] bytes=new byte[1024];
            while (inputStream.read(bytes)!=-1){
                out.write(bytes);
            }
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }finally {
            if (inputStream!=null)inputStream.close();
            if (out!=null)out.close();
        }
    }
}

