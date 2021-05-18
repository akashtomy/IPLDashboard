/**************************************************
 * Copyright (c) 2020 RIA Advisory LLC.
 * All rights reserved.
 * @author Akash Thomas
 * Date: 5/17/2021
 * Time: 12:43 AM
 *
 **************************************************/
package com.akash.ipldashboard.repository;

import com.akash.ipldashboard.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatchRepository extends JpaRepository<Match, Long> {

    List<Match> findTop3ByTeam1OrTeam2OrderByDateDesc(String team1, String team2);
}
