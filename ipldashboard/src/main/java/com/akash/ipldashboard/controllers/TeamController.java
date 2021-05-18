/**************************************************
 * Copyright (c) 2020 RIA Advisory LLC.
 * All rights reserved.
 * @author Akash Thomas
 * Date: 5/17/2021
 * Time: 12:41 AM
 *
 **************************************************/
package com.akash.ipldashboard.controllers;


import com.akash.ipldashboard.entities.Match;
import com.akash.ipldashboard.entities.Team;
import com.akash.ipldashboard.repository.MatchRepository;
import com.akash.ipldashboard.repository.TeamRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/teams")
public class TeamController {
    private TeamRepository teamRepository;
    private MatchRepository matchRepository;

    public TeamController(TeamRepository teamRepository, MatchRepository matchRepository) {
        this.teamRepository = teamRepository;
        this.matchRepository = matchRepository;
    }

    @GetMapping("/{teamName}")
    public Team getTeam(@PathVariable String teamName) {
        Team team = teamRepository.findByTeamName(teamName);
        List<Match> matches = this.matchRepository.findTop3ByTeam1OrTeam2OrderByDateDesc(teamName, teamName);
        team.setMatches(matches);
        return team;
    }


}
