package com.yash.exercises.oops.programs;

public class CricketPlayer extends Athletic {
	private String teamname;
	private int jersyno;
	private int totalruns;
	private int highestscore;
	private int avg;
	private int totalmatchedplayed;

	public CricketPlayer(int aid, String aname, String paddress, String dob, String teamname, int jersyno,
			int totalruns, int highestscore, int avg, int totalmatchedplayed) {
		super(aid, aname, paddress, dob);
		this.teamname = teamname;
		this.jersyno = jersyno;
		this.totalruns = totalruns;
		this.highestscore = highestscore;
		this.avg = avg;
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

	public int getTotalruns() {
		return totalruns;
	}

	public void setTotalruns(int totalruns) {
		this.totalruns = totalruns;
	}

	public int getHighestscore() {
		return highestscore;
	}

	public void setHighestscore(int highestscore) {
		this.highestscore = highestscore;
	}

	public int getAvg() {
		return avg;
	}

	public void setAvg(int avg) {
		this.avg = avg;
	}

	public int getTotalmatchedplayed() {
		return totalmatchedplayed;
	}

	public void setTotalmatchedplayed(int totalmatchedplayed) {
		this.totalmatchedplayed = totalmatchedplayed;
	}

	void display() {
		System.out.println("teamname:- " + teamname);
		System.out.println("jersyno:- " + jersyno);
		System.out.println("totalruns:- " + totalruns);

		System.out.println("highestscore:- " + highestscore);
		System.out.println("avg:- " + avg);
		System.out.println("totalmatchedplayed:- " + totalmatchedplayed);

	}

}
