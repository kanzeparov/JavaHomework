class TotalGoals extends FootballTeam {
    private String homeClubName;
    private int homeScore;
    private String awayClubName;
    private int awayScore;

    public String getHomeClubName() {
        return homeClubName;
    }

    public void setHomeClubName(String homeClubName) {
        this.homeClubName = homeClubName;
    }

    public String getAwayClubName() {
        return awayClubName;
    }

    public void setAwayClubName(String awayClubName) {
        this.awayClubName = awayClubName;
    }

    public int getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }

    public int getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(int awayScore) {
        this.awayScore = awayScore;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        TotalGoals match = (TotalGoals) obj;
        return homeScore == match.homeScore // не разобрался как засунуть еще "&& return awayScore == match.awayScore"
                && (homeClubName == match.homeClubName
                || (homeClubName != null && homeClubName.equals(match.getHomeClubName())))
                && (awayClubName == match.awayClubName
                || (awayClubName != null && awayClubName.equals(match.getAwayClubName())));
    }

    @Override
    public int hashCode() {
        final int prime = 31; // фрагмент кода со статьи с JavaRush, не понял откуда взялось 31 и зачем
        int result = 1;
        result = prime * result + ((homeClubName == null) ? 0 : homeClubName.hashCode());
        result = prime * result + homeScore;
        result = prime * result + ((awayClubName == null) ? 0 : awayClubName.hashCode());
        result = prime * result + awayScore;
        return result;
    }

    @Override
    void lineup() {
    System.out.println("HomeClub use 4-4-2 formation");
    System.out.println("AwayClub use 5-4-1 formation");
    }
    // В качестве дополнительного теоритического материала использовал эту статью: https://habr.com/ru/post/168195/
}
