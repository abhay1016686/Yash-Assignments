package com.yash.exercises.oops.programs;

public class Hockey extends Athletic {
	private String teamname;
	private int jersyno;
	private int totalgoals;
	private int max_goal_in_a_match;
	private int total_matched_played;

	public Hockey(int aid, String aname, String paddress, String dob, String teamname, int jersyno, int totalgoals,
			int max_goal_in_a_match, int total_matched_played) {
		super(aid, aname, paddress, dob);
		this.teamname = teamname;
		this.jersyno = jersyno;
		this.totalgoals = totalgoals;
		this.max_goal_in_a_match = max_goal_in_a_match;
		this.total_matched_played = total_matched_played;
	}

	void diplayHockeyPlayers() {
		System.out.println("teamname:- " + teamname);
		System.out.println("jersyno:- " + jersyno);
		System.out.println("totalgoals:- " + totalgoals);
		System.out.println("max_goal_in_a_match:- " + max_goal_in_a_match);
		System.out.println("total_matched_played:- " + total_matched_played);
	}
}
