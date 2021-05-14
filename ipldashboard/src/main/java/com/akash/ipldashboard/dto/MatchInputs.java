/**************************************************
 * Copyright (c) 2020 RIA Advisory LLC.
 * All rights reserved.
 * @author Akash Thomas
 * Date: 5/13/2021
 * Time: 6:48 PM
 *
 **************************************************/
package com.akash.ipldashboard.dto;

import lombok.Data;

/**
 * The type Match inputs.
 *
 * @author Akash Thomas
 */
@Data
public class MatchInputs {

    /**
     * The Id.
     */
    private String id;
    /**
     * The City.
     */
    private String city;
    /**
     * The Date.
     */
    private String date;
    /**
     * The Player of match.
     */
    private String player_of_match;
    /**
     * The Venue.
     */
    private String venue;
    /**
     * The Neutral venue.
     */
    private String neutral_venue;
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
    private String toss_winner;
    /**
     * The Toss decision.
     */
    private String toss_decision;
    /**
     * The Winner.
     */
    private String winner;
    /**
     * The Result.
     */
    private String result;
    /**
     * The Result margin.
     */
    private String result_margin;
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
