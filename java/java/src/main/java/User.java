import org.w3c.dom.ranges.RangeException;

public class User {
    int rank = -8;
    int progress = 0;

    public User() {
    }

    public int incProgress(int activityRank) {
        if (activityRank > 8 || activityRank < -8  || activityRank == 0) {
            throw new RangeException((short) 1,"out of range");
        }

        int diff = 0;
        if (activityRank < 0 && this.rank < 0) {
            diff = Math.abs(activityRank) + this.rank;
        } else if (activityRank >= 0 && this.rank < 0) {
            diff = activityRank + Math.abs(this.rank);
        } else if (activityRank >= 0 && this.rank > 0) {
            diff = this.rank - activityRank;
        }
        if (this.rank == activityRank) {
            this.progress += 3;
        } else if (this.rank == activityRank + 1) {
            this.progress += 1;
        } else {
            this.progress += ((int) Math.pow(diff, 2)) * 10;
        }
        while (this.progress >= 100) {
            this.progress -= 100;
            this.rank += 1;
            if (this.rank == 0) {
                this.rank += 1;
            }
        }
        return this.progress;
    }
}
