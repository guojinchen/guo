package sms;

import java.io.UnsupportedEncodingException;
import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;

public class SendMsg_webchinese {

public static void main(String[] args)throws Exception
{

HttpClient client = new HttpClient();
PostMethod post = new PostMethod("http://gbk.sms.webchinese.cn"); 
post.addRequestHeader("Content-Type","application/x-www-form-urlencoded;charset=gbk");//在头文件中设置转码
NameValuePair[] data ={ new NameValuePair("Uid", "jinchen"),new NameValuePair("Key", "2759ae5ad1ceb3b51c2f"),new NameValuePair("smsMob","18501366175"),new NameValuePair("smsText","胡哥，我在用自己写得程序给你发短信。调用SMS的接口，晚上加班不？。收到没？。。，验证码：8888")};
post.setRequestBody(data);

client.executeMethod(post);
Header[] headers = post.getResponseHeaders();
int statusCode = post.getStatusCode();
System.out.println("statusCode:"+statusCode);
for(Header h : headers)
{
System.out.println(h.toString());
}
String result = new String(post.getResponseBodyAsString().getBytes("gbk")); 
System.out.println(result); //打印返回消息状态


post.releaseConnection();

}

}