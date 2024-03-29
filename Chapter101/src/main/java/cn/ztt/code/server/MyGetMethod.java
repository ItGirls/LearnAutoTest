package cn.ztt.code.server;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestController
@Api(value = "/")
public class MyGetMethod {

    @RequestMapping(value = "/getCookies", method = RequestMethod.GET)
    @ApiOperation(value = "通过这个方法可以获取到Cookies", httpMethod = "GET")
    public String getCookies(HttpServletResponse response) {
        //HttpServerletRequest 装请求信息的类
        //HttpServerletResponse  装响应信息的类
        Cookie cookie = new Cookie("login", "true");
        response.addCookie(cookie);
        return "恭喜你获得cookies信息成功";
    }

    /**
     * 要求客户端携带cookies访问
     * 这是一个需要携带cookies信息才能访问的get请求
     */
    @RequestMapping(value = "/get/with/cookies", method = RequestMethod.GET)
    @ApiOperation(value = "携带cookies信息才能访问的get请求", httpMethod = "GET")
    public String getWithCookies(HttpServletRequest request) {
        //多个key,value组成的数组
        Cookie[] cookies = request.getCookies();
        if (Objects.isNull(cookies)) {
            return "你必须携带cookies来";
        }
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("login") && cookie.getValue().equals("true")) {
                return "恭喜你访问成功";
            }
        }
        return "你必须携带cookies来";
    }

    /**
     * 开发一个需要携带参数才能访问的get请求
     * 第一种实现方式 url?key=value&key=value
     * 我们来模拟获取商品列表
     */
    @RequestMapping(value = "/get/with/params", method = RequestMethod.GET)
    @ApiOperation(value="携带参数才能访问的get请求",httpMethod = "GET")
    public Map<String, Integer> getList(@RequestParam Integer start, @RequestParam Integer end) {
        Map<String, Integer> goods = new HashMap<>();
        goods.put("鞋", 350);
        goods.put("裙子", 250);
        goods.put("布娃娃", 50);

        return goods;
    }

    /**
     * 第二种需要携带参数才能访问的get请求
     * url:ip:port/get/with/param/10/20
     */
    @RequestMapping(value = "/get/with/params/{start}/{end}")
    @ApiOperation(value="携带参数才能访问的get请求",httpMethod = "GET")
    public Map<String, Integer> getList2(@PathVariable Integer start, @PathVariable Integer end) {
        Map<String, Integer> goods = new HashMap<>();
        goods.put("鞋", 350);
        goods.put("裙子", 250);
        goods.put("布娃娃", 50);

        return goods;
    }


}
