package com.ssm.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ssm.entity.User;
import com.ssm.service.IUserService;

/**
 * 
 * @author liyongqiang
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private IUserService userService;

	/**
	 * �û���¼
	 * 
	 * @param req
	 * @param mv
	 * @return
	 */
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest req, ModelAndView mv) {

		Map<String, String> map = new HashMap<String, String>();
		map.put("username", req.getParameter("username"));
		map.put("password", req.getParameter("password"));
		User user = userService.login(map);
		if (user != null) {//��¼�ɹ�������ҳ
			mv.setViewName("index");
		} else {//��¼ʧ�ܻص���¼ҳ��
			mv.addObject("message", "�û����������������,����������");
			mv.setViewName("login");
		}
		return mv;
	}


}

