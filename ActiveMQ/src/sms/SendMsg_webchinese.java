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
post.addRequestHeader("Content-Type","application/x-www-form-urlencoded;charset=gbk");//��ͷ�ļ�������ת��
NameValuePair[] data ={ new NameValuePair("Uid", "jinchen"),new NameValuePair("Key", "2759ae5ad1ceb3b51c2f"),new NameValuePair("smsMob","18501366175"),new NameValuePair("smsText","���磬�������Լ�д�ó�����㷢���š�����SMS�Ľӿڣ����ϼӰ಻�����յ�û����������֤�룺8888")};
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
System.out.println(result); //��ӡ������Ϣ״̬


post.releaseConnection();

}

}