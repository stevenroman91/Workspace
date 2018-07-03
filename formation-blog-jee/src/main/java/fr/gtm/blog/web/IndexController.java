package fr.gtm.blog.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
		mav.addObject("listArticle", this.service.getList());
		return mav;
	}
	
	@RequestMapping({"/delete"})
	public String delete(@RequestParam Integer id) {
		this.service.delete(id);
		return "redirect:/";
	}
	
	/*@RequestMapping("/manage")
	public ModelAndView articles() {
		final ModelAndView mav = new ModelAndView("article");
		return mav;
	}*/
	
	@GetMapping("/manage")
	public ModelAndView addArticle() {
		final ModelAndView mav = new ModelAndView("article");
		mav.getModel().put("modelArticle", new Article());
		return mav;
	}
	
	@GetMapping("/update")
	public ModelAndView updateArticle(@RequestParam Integer id) {
		final ModelAndView mav = new ModelAndView("article");
		mav.getModel().put("modelArticle", this.service.read(id));
		return mav;
	}
//	@PostMapping("/manage")
//	public String validateArticle(@RequestParam("title") String title,@RequestParam("descr") String description) {
//
//		this.service.create(new Article(title, description));
//		return "redirect:/";
//	}
	
	@PostMapping({"/manage", "update"})
	public String validateArticle(@ModelAttribute Article modelArticle) {
		if(modelArticle.getId()==null) {
			this.service.create(modelArticle);
		}else {
			this.service.edit(modelArticle);
		}
		return "redirect:/";
	}
	
}
