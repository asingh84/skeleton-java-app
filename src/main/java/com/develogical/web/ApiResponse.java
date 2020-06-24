package com.develogical.web;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ApiResponse {

    private final String answer;

    public ApiResponse(String answer) {
        this.answer = answer;
    }
    //just adding comment to test again
    public void writeTo(HttpServletResponse resp) throws IOException {
        resp.setContentType("text/plain");
        PrintWriter writer = resp.getWriter();
        writer.println(answer);
    }
}