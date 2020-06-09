package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;
import java.util.TreeMap;

@Controller
public class EnglishVietnameseDictionaryController {

    private static Map<String, String> dictionary = new TreeMap<>();

    static {
        dictionary.put("hello", "xin chào");
        dictionary.put("book", "quyển sách");
        dictionary.put("green", "màu xanh");
        dictionary.put("brown", "màu nâu");
        dictionary.put("library", "thư viện");
    }

    @GetMapping("/en-vi")
    public String showFindForm() {
        return "english-vietnamese-dictionary";
    }

    @PostMapping("/en-vi")
    public ModelAndView showResult(@RequestParam("word") String word) {
        ModelAndView modelAndView = new ModelAndView("english-vietnamese-dictionary-result");
        String result = dictionary.get(word);
        modelAndView.addObject("word", word);
        modelAndView.addObject("result", result);
        return modelAndView;
    }
}
