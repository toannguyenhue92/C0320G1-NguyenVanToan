package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.TimeZone;

@Controller
public class TimeZoneController {

    @GetMapping("/world-clock")
    public String getTimeByTimezone(Model model,
                                    @RequestParam(required = false, defaultValue = "Asia/Ho_Chi_Minh") String city) {
        Date date = getCurrentTimeByTimezone(city);
        model.addAttribute("city", city);
        model.addAttribute("date", date);
        return "world-clock";
    }

    private Date getCurrentTimeByTimezone(String city) {
        TimeZone local = TimeZone.getDefault();
        TimeZone locale = TimeZone.getTimeZone(city);
        Date date = new Date();
        long localeTime = date.getTime() + (locale.getRawOffset() - local.getRawOffset());
        date.setTime(localeTime);
        return date;
    }
}
