package com.yash.exercises.oops.programs;

public class FootBallPlayer extends Athletic {
	private String teamname;
	private int jersyno;
	private int totalgoals;
	private int highestgoal_in_a_match;
	private int totalmatchedplayed;

	public FootBallPlayer(int aid, String aname, String paddress, String dob, String teamname, int jersyno,
			int totalgoals, int highestgoal_in_a_match, int totalmatchedplayed) {
		super(aid, aname, paddress, dob);
		this.teamname = teamname;
		this.jersyno = jersyno;
		this.totalgoals = totalgoals;
		this.highestgoal_in_a_match = highestgoal_in_a_match;
		this.totalmatchedplayed = totalmatchedplayed;
	}

	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	public int getJersyno() {
		return jersyno;
	}

	public void setJersyno(int jersyno) {
		this.jersyno = jersyno;
	}

	public int getTotalgoals() {
		return totalgoals;
	}

	public void setTotalgoals(int totalgoals) {
		this.totalgoals = totalgoals;
	}

	public int getHighestgoal_in_a_match() {
		return highestgoal_in_a_match;
	}

	public void setHighestgoal_in_a_match(int highestgoal_in_a_match) {
		this.highestgoal_in_a_match = highestgoal_in_a_match;
	}

	public int getTotalmatchedplayed() {
		return totalmatchedplayed;
	}

	public void setTotalmatchedplayed(int totalmatchedplayed) {
		this.totalmatchedplayed = totalmatchedplayed;
	}

	void playerDetails() {
		System.out.println("teamname:- " + teamname);
		System.out.println("jersyno:- " + jersyno);
		System.out.println("totalgoals:- " + totalgoals);
		System.out.println("highestgoal_in_a_match:- " + highestgoal_in_a_match);
		System.out.println("totalmatchedplayed:- " + totalmatchedplayed);

	}

}
