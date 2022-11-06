package com.example.apexf1.controller;

import com.example.apexf1.service.ResultService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ResultController {

    @Autowired
    ResultService resultService;


/*    http://ergast.com/api/f1/current/last/results.json
    Current: year
    Last: nTh race
*/
    @GetMapping("/results")
    public JSONObject getResults(
            @RequestParam(name="year") String year,
            @RequestParam(name="raceNum") String raceNum){

        ObjectMapper objectMapper = new ObjectMapper();

        return resultService.findResultWithYearAndRaceNumber(year,raceNum);
    }
}

