package com.mycompany.myapp.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.myapp.config.TaConfig;


@RestController
@RequestMapping("/api/ta")
public class TaController {

    @Autowired
    private TaConfig config;

    @RequestMapping(produces = "application/javascript")
    @ResponseBody
    public String ta() {
        return String.format("window._taConfig={enabled:%b,ak:\"%s\",url:\"%s\",collectorUrl:\"%s\"}", config.isTerminusTaEnable(), config.getTerminusKey(), config.getTerminusTaURL(), config.getTerminusTaCollectorURL());
    }
}

