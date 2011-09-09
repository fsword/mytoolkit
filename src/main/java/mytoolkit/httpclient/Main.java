package mytoolkit.httpclient;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){
		//编写一段代码，获取google页面
      HttpClient client = new DefaultHttpClient();
      InputStream in = null;
      try {
          HttpResponse resp = client.execute(new HttpHost("docs.google.com"), new HttpGet("/"));
          // execute method and handle any error responses.
          in = resp.getEntity().getContent();
          for(Object result: IOUtils.readLines(in)){
              System.out.println(result);
          }
          System.out.println();
      } catch (IOException e) {
          e.printStackTrace();
      }finally {
          if(in!=null){
              try {
                  in.close();
              } catch (IOException e) {
                  e.printStackTrace();
              }
          }
      }
//        HttpClient client = new HttpClient(new MultiThreadedHttpConnectionManager());
//        GetMethod get = new GetMethod("http://jakarta.apache.org");
//        // execute method and handle any error responses
//        try {
//            int status = client.executeMethod(get);
//            InputStream in = get.getResponseBodyAsStream();
//            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
//            String result = reader.readLine();
//            while(result!=null){
//                System.out.println(result);
//                result = reader.readLine();
//            }
//            System.out.println("execute status: " + status);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
////            if(in!=null){
////                try {
////                    in.close();
////                } catch (IOException e) {
////                    e.printStackTrace();
////                }
////            }
//            get.releaseConnection();
//        }
//        
	}




    
   
}
