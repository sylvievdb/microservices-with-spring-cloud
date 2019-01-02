package com.syvac.springcloudm2configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RefreshScope
public class RateController {

    @Value("${rate}")
    String rate;
    @Value("${lanecount}")
    String lanecount;
    @Value("${tollstart}")
    String tollstart;
    @Value("${connstring}")
    String connstring;

    @GetMapping("/rate")
    public String getRate(Model m){
        m.addAttribute("rateamount", rate);
        m.addAttribute("lanes", lanecount);
        m.addAttribute("tollstart", tollstart);
        m.addAttribute("connstring", connstring);

        // name of view
        return "rateview";
    }
}
