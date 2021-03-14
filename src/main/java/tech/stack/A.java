package tech.stack;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * @author jianyuan.chen
 * @date 2020/9/7 14:48
 */
public class A {
    private int a = 14;

    private static int b = 10;

    public A() {
        this.a = 10;
    }

    public static void main(String[] args) throws IOException {
        CloseableHttpClient client = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost("https://baidu.com");
        CloseableHttpResponse execute = client.execute(httpPost);
        Header[] allHeaders = execute.getAllHeaders();
        Header[] allHeaders1 = httpPost.getAllHeaders();
        HttpEntity entity = execute.getEntity();
        String s = EntityUtils.toString(entity);
        System.out.println(s);
        new A();
    }
}
