public class User {
    int rank = -8;
    int progress = 0;

    public User() {
    }

    public int incProgress(int activityRank) {
        if (this.rank < 0 && activityRank < 0) {
            int userRank = Math.abs(this.rank);
            activityRank = Math.abs(activityRank);
            int diff = userRank - activityRank;
            this.progress += ((int) Math.pow(diff, 2)) * 10;
        }
        if (this.progress >= 100) {
            this.progress -= 100;
            this.rank += 1;
        }
        return this.progress;
    }
}
