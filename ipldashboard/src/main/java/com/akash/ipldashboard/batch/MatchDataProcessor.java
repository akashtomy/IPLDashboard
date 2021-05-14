/**************************************************
 * Copyright (c) 2020 RIA Advisory LLC.
 * All rights reserved.
 * @author Akash Thomas
 * Date: 5/13/2021
 * Time: 6:55 PM
 *
 **************************************************/
package com.akash.ipldashboard.batch;

import com.akash.ipldashboard.dto.MatchInputs;
import com.akash.ipldashboard.entities.Match;
import org.springframework.batch.item.ItemProcessor;

import java.time.LocalDate;

public class MatchDataProcessor implements ItemProcessor<MatchInputs, Match> {
    @Override
    public Match process(MatchInputs matchInputs) throws Exception {
        String firstInningsTeam, secondInningsTeam;
        if ("bat".equals(matchInputs.getToss_decision())) {
            firstInningsTeam = matchInputs.getToss_winner();
            secondInningsTeam = matchInputs.getToss_winner().equals(matchInputs.getTeam1()) ? matchInputs.getTeam2() : matchInputs.getTeam1();
        } else {
            secondInningsTeam = matchInputs.getToss_winner();
            firstInningsTeam = matchInputs.getToss_winner().equals(matchInputs.getTeam1()) ? matchInputs.getTeam2() : matchInputs.getTeam1();
        }
        Match match = new Match();
        match.setId(Long.parseLong(matchInputs.getId()));
        match.setCity(matchInputs.getCity());
        match.setDate(LocalDate.parse(matchInputs.getDate()));
        match.setEliminator(matchInputs.getEliminator());
        match.setMatchWinner(matchInputs.getWinner());
        match.setMethod(matchInputs.getMethod());
        match.setPlayerOfMatch(matchInputs.getPlayer_of_match());
        match.setResult(matchInputs.getResult());
        match.setResultMargin(matchInputs.getResult_margin());
        match.setTeam1(firstInningsTeam); //First innings teams
        match.setTeam2(secondInningsTeam); //Second innings teams
        match.setVenue(matchInputs.getVenue());
        match.setUmpire1(matchInputs.getUmpire1());
        match.setUmpire2(matchInputs.getUmpire2());
        match.setTossWinner(matchInputs.getToss_winner());
        match.setTossDecision(matchInputs.getToss_decision());
        return match;
    }
}
