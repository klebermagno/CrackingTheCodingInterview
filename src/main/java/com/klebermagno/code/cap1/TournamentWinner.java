package com.klebermagno.code.cap1;

import java.util.*;

class tournamentWinner {

  public String tournamentWinner(
    ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results
  ) {
    /*
    * There's an algorithms tournament taking place in which teams of programmers compete against each other to 
    * solve algorithmic problems as fast as possible. Teams compete in a round robin, where each team faces off 
    * against all other teams. Only two teams compete against each other at a time, and for each competition,
    * one team is designated the home team, while the other team is the away team. In each competition there's * 
    * always one winner and one loser; there are no ties. A team receives 3 points if it wins and 0 points if it loses. 
    * The winner of the tournament is the team that receives the most amount of points. 
    * 
    * [[homeTeam][awayTeam],
    * [][],
    * [][],
    * [][] ]
    *
    * [],[],[],[]
    * 1 = homeTeam won
    * 0 = awayTeam won
    */
    // Write your code here.
    Map<String,Integer> score = new HashMap<>();
    for (int i = 0; i< competitions.size(); i++) {
      int team = 0;
      if (results.get(i) == 0){
        team = 1;
      } 
      String teamName = competitions.get(i).get(team);
      int points = 0;
      if ( score.get(teamName) !=null){
        points = score.get(teamName);
      }
      score.put(competitions.get(i).get(team),points + 3);
    }
    int max = 0;
    String winner = "";
    for (String name : score.keySet()){
      if (score.get(name)>max){
        max=score.get(name);
        winner=name;
      }
    }
    return winner;
  }
}
