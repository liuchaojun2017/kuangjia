package com.lechenggu.controller;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.Session;
import org.apache.catalina.connector.Request;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.lechenggu.bean.User05;
import com.lechenggu.bean.UserVo;
import com.lechenggu.service.UserService;

@Controller
//可以在这个地方加上@RequestMapping(value="") 表示所有对该类下的方法的请求的路径中必须得有value后的值
public class HelloController {
	@Autowired
	private UserService use;
	
	/*ModelAndView 带着数据 返回视图路径
	 * 
	 * String 返回视图路径  可以利用Model 类型的形参 帮助传递内容到前端
	 * 
	 * void 适合ajax 的使用
	 * 
	 * */
//	表示 此方法 对应着两个请求的处理  可以接受post和get方式的 请求
	@RequestMapping(value={"/items/itemlist.action","/items/chaxun.action"},method={RequestMethod.POST,RequestMethod.GET})
	public ModelAndView get(){
		ModelAndView ma = new ModelAndView();
		List<User05> li = use.userList();
		ma.addObject("UserList", li);
		ma.setViewName("itemlist");
		return ma;
		
	}
	
	@RequestMapping(value="/item/edit.action",method=RequestMethod.POST)
	/*SpringMvc支持基本类型数据的 绑定 也支持 pojo映射的绑定*/
	
	public void edit(UserVo vo){
		
		Arrays.toString(vo.getIds());
		System.out.println("ids");
		System.out.println(vo.getUserlist().size());
	}
	@RequestMapping(value="/item/update.action")
	public String update(Model model){
		model.addAttribute("list","jjf");
		//return "updatesue";
		//return "redirect:/items/itemlist.action"; 请求重定向
		return "forward:/items/itemlist.action";
	}
	
	 @RequestMapping(value="/item/upload.action",method=RequestMethod.POST)
     public String upload(HttpServletRequest request,@RequestParam("picture") MultipartFile file,Model model) throws Exception {

      String name = UUID.randomUUID().toString();
        //如果文件不为空，写入上传路径
        if(!file.isEmpty()) {
            //上传文件路径
            String path = request.getServletContext().getRealPath("/upload/");
            System.out.println("上传的路路径是："+path);
            //上传文件名
            String filename = file.getOriginalFilename();
            
            //获取文件类型
            String geshi=FilenameUtils.getExtension(filename);
            System.out.println("原文件名字为："+filename);
            
        /*    File filepath = new File(path,filename);
            //判断路径是否存在，如果不存在就创建一个
            if (!filepath.getParentFile().exists()) { 
                filepath.getParentFile().mkdirs();
            }*/
            //将上传文件保存到一个目标文件当中  
            file.transferTo(new File("C:\\Users\\"+ name+"."+geshi));
            model.addAttribute("pic", "C:\\Users\\"+ name+"."+geshi);
            return "success";
        } else {
            return "error";
        }

     }
	 @RequestMapping(value="/item/jdf.action",method=RequestMethod.POST)
	/* @RequestBody 将json 格式的数据 自动封装到 实例里*/
	 
	 public @ResponseBody  User05 jsong(@RequestBody User05 u){
	 System.out.println("进入后天的json");
	 System.out.println(u.getAge());	 
	 return u;
	 }
	
}
