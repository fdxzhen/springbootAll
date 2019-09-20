package com.zhenhao;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class CookieController {
    @RequestMapping(value = "/setCookies",method = RequestMethod.GET)
    public String setCookies(HttpServletResponse response){
        Cookie cookie = new Cookie("sessionId","1234456667");
        Cookie name = new Cookie("name","zhenhao");
        response.addCookie(cookie);
        response.addCookie(name);
        return "getCookieSuccess";
    }

    @RequestMapping(value = "/getCookies",method = RequestMethod.GET)
    public String getCookies(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        if(cookies!=null){
            for(Cookie cookie : cookies){
                return cookie.getName()+"" + cookie.getValue();
            }
        }
        return  null;
    }
}
