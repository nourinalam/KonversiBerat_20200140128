/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversiberat.konversi.berat;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author user
 */
@Controller
public class ProjectController {
    private int beratPounds(int getKilogram){
        int pound = (int) (getKilogram * 2.20462);
        return pound;
    }
    
    private int beratOns(int getKilogram){
        int Ons = (int) (getKilogram *35.2739199982575);
        return Ons;
    }
    
    private int beratTon(int getKilogram){
        int ton = (int) (getKilogram /1000);
        return ton;
    }
    
    private int beratKwintal(int getKilogram){
        int kwintal = (int) (getKilogram /100);
        return kwintal;
    }
    
    private int beratGram(int getKilogram){
        int gram = (int) (getKilogram *1000);
        return gram;
    }
    @RequestMapping("/alam")
    //@ResponseBody
    public String getHasil(HttpServletRequest data, Model datas){
       String getnameberat = data.getParameter("nameberat");
       int getberatKilo = Integer.parseInt(data.getParameter("beratKilo")); 


      
       int pound = beratPounds(getberatKilo);
       int Ons = beratOns(getberatKilo);
       int Ton = beratTon(getberatKilo);
       int Kwintal = beratKwintal(getberatKilo);
       int Gram = beratGram(getberatKilo);
       
       datas.addAttribute("Pound", pound);
       datas.addAttribute("Ons", Ons);
       datas.addAttribute("Ton", Ton);
       datas.addAttribute("Kwintal", Kwintal);
       datas.addAttribute("Gram", Gram);
       datas.addAttribute("Kilo", getberatKilo);
       
       
       return "result";
    }
}
    
