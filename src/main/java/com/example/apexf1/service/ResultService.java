package com.example.apexf1.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class ResultService {

    private final String baseURL = "http://ergast.com/api/f1/";

    @Autowired
    RestTemplate restTemplate;


    public String findResultWithYearAndRaceNumber(String year, String raceNumber){
    /*    http://ergast.com/api/f1/current/last/results.json
        Current: year
        Last: nTh race
    */
        return restTemplate.getForObject(String.format(baseURL+"%1$s/%2$s/results.json",year,raceNumber), String.class);

    }






}
