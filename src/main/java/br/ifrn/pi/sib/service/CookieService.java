package br.ifrn.pi.sib.service;

import jakarta.servlet.http.HttpServletResponse;

// ! import java.io.IOException;
// ! import java.io.UnsupportedEncodingException;
// ! import java.net.URLDecoder;
// ! import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Optional;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;

public class CookieService {

    // ! public static void setCookie(HttpServletResponse response, String key, String valor, int segundos)
    //            throws IOException
    public static void setCookie(HttpServletResponse response, String key, String valor, int segundos) {
        // ! Cookie cookie = new Cookie(key, URLEncoder.encode(valor, "UTF-8"));
        Cookie cookie = new Cookie(key, valor);
        cookie.setHttpOnly(true);
        cookie.setMaxAge(segundos);
        response.addCookie(cookie);
    }

    // ! public static String getCookie(HttpServletRequest request, String key) throws UnsupportedEncodingException
    public static String getCookie(HttpServletRequest request, String key) {
        // !  valor = Optional.ofNullable(request.getCookies())
         return Optional.ofNullable(request.getCookies())
                .flatMap(cookies -> Arrays.stream(cookies)
                        .filter(cookie -> key.equals(cookie.getName()))
                        .findAny())
                .map(e -> e.getValue())
                .orElse(null);

       // ! valor = URLDecoder.decode(valor, "UTF-8");
       // ! return valor;
    }
}
