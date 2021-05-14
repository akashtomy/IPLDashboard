/**************************************************
 * Copyright (c) 2020 RIA Advisory LLC.
 * All rights reserved.
 * @author Akash Thomas
 * Date: 5/13/2021
 * Time: 6:48 PM
 *
 **************************************************/
package com.akash.ipldashboard.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

/**
 * The type Match inputs.
 *
 * @author Akash Thomas
 */
@Entity
@Data
public class Match {

    /**
     * The Id.
     */
    @Id
    private long id;
    /**
     * The City.
     */

    private String city;
    /**
     * The Date.
     */
    private LocalDate date;
    /**
     * The Player of match.
     */
    private String playerOfMatch;
    /**
     * The Venue.
     */
    private String venue;
    /**
     * The Team 1.
     */
    private String team1;
    /**
     * The Team 2.
     */
    private String team2;
    /**
     * The Toss winner.
     */
    private String tossWinner;
    /**
     * The Toss decision.
     */
    private String tossDecision;
    /**
     * The Winner.
     */
    private String matchWinner;
    /**
     * The Result.
     */
    private String result;
    /**
     * The Result margin.
     */
    private String resultMargin;
    /**
     * The Eliminator.
     */
    private String eliminator;
    /**
     * The Method.
     */
    private String method;
    /**
     * The Umpire 1.
     */
    private String umpire1;
    /**
     * The Umpire 2.
     */
    private String umpire2;
}
