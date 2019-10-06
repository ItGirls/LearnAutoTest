package cn.ztt.code.cookies;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class MyGetCookiesTest {
    private String url;
    private ResourceBundle resourceBundle;
    private CookieStore store;

    @BeforeTest
    public void beforeTest() {
        resourceBundle = ResourceBundle.getBundle("application", Locale.CHINA);
        url = resourceBundle.getString("test.url");
    }

    @Test
    public void getCookiesTest() throws IOException {
        String testUrl = url + resourceBundle.getString("getCookies.uri");
        DefaultHttpClient client = new DefaultHttpClient();
        HttpGet get = new HttpGet(testUrl);
        HttpResponse response = client.execute(get);
        String result = EntityUtils.toString(response.getEntity(), "utf-8");
        System.out.println(result);

        this.store = client.getCookieStore();
        List<Cookie> cookies = store.getCookies();
        for (Cookie cookie : cookies) {
            String name = cookie.getName();
            String value = cookie.getValue();
            System.out.println("cookie name = "+name+", cookie value="+value);

        }
    }

    @Test(dependsOnMethods ={"getCookiesTest"})
    public void getWithCookiesTest() throws IOException {
        String testUrl = url + resourceBundle.getString("test.get.with.cookies");
        DefaultHttpClient client = new DefaultHttpClient();
        HttpGet get = new HttpGet(testUrl);
        client.setCookieStore(this.store);
        HttpResponse response = client.execute(get);


        int statusCode = response.getStatusLine().getStatusCode();
        System.out.println("statusCode = " + statusCode);
        if(statusCode == 200){
            String result = EntityUtils.toString(response.getEntity(),"utf-8");
            System.out.println(result);
        }
    }
}
