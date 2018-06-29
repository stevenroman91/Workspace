package fr.gtm.blog.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import fr.gtm.blog.business.CrudService;
import fr.gtm.blog.domain.Article;

@Controller
public class IndexController {
	@Autowired
	private CrudService<Article> service;
	
	@RequestMapping({"/index","/articles"})
	public ModelAndView index() {
		final ModelAndView mav = new ModelAndView("index");
		List<Article> liste=this.service.getList();
		mav.addObject("listArticle", liste);
		return mav;
	}
	
	@RequestMapping({"/delete"})
	public ModelAndView delete(@RequestParam("id") Integer id) {
		
		this.service.delete(id);
		return this.index();
	}
	
	@RequestMapping("/manage")
	public ModelAndView articles() {
		final ModelAndView mav = new ModelAndView("article");
		return mav;
	}
	
	@PostMapping("/manage")
	public String submit(@RequestParam("title") String title,@RequestParam("descr") String description) {

		this.service.create(new Article(title, description));
		return "redirect:/";
	}
}
