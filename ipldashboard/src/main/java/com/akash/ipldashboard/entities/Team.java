/**************************************************
 * Copyright (c) 2020 RIA Advisory LLC.
 * All rights reserved.
 * @author Akash Thomas
 * Date: 5/13/2021
 * Time: 6:48 PM
 *
 **************************************************/
package com.akash.ipldashboard.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

/**
 * The type Team.
 *
 * @author Akash Thomas
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Team {

    /**
     * The Id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    /**
     * The Team name.
     */
    private String teamName;
    /**
     * The Team matches.
     */
    private long totalMatches;
    /**
     * The Total wins.
     */
    private long totalWins;

    @Transient
    private List<Match> matches;

    public Team(String teamName, long totalMatches) {
        this.teamName = teamName;
        this.totalMatches = totalMatches;
    }
}
