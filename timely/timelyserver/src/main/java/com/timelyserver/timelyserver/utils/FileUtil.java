package com.timelyserver.timelyserver.utils;

  import org.springframework.web.multipart.MultipartFile;

  import java.io.File;
  import java.io.IOException;

 public class FileUtil {
     public static Boolean uploadFileToFileSystem(MultipartFile file, String name, java.io.File zuleFolder) throws IOException {
         try {
             String filePath = zuleFolder + "/" + name;

             file.transferTo(new File(filePath));
             return true;
         } catch (Exception e) {
             System.out.println(e);
             return false;
         }
     }
 }