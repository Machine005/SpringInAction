package com.spring.chapter5.spittr.web;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // ����Ϊһ��������
@RequestMapping("/")
public class HomeController {

  @RequestMapping(method = GET) // ����� "/" ������.
  public String home() {
    return "home"; // ��ͼ��Ϊhome.
  }
}
