import java.util.ArrayList;

public class Warrior {
    int level = 1;
    int experience = 100;
    String rank;
    ArrayList<String> achievements = new ArrayList<String>();


    public Warrior() {
    }

    public int level() {
        return this.level;
    }

    public int experience() {
        return this.experience;
    }

    public String rank() {
        String[] rankArr = {"Pushover", "Novice", "Fighter", "Warrior", "Veteran", "Sage", "Elite", "Conqueror", "Champion", "Master", "Greatest"};
        if (this.level < 10)
            this.rank = rankArr[0];
        else if (this.level < 20) {
            this.rank = rankArr[1];
        } else if (this.level < 30) {
            this.rank = rankArr[2];
        } else if (this.level < 40) {
            this.rank = rankArr[3];
        } else if (this.level < 50) {
            this.rank = rankArr[4];
        } else if (this.level < 60) {
            this.rank = rankArr[5];
        } else if (this.level < 70) {
            this.rank = rankArr[6];
        } else if (this.level < 80) {
            this.rank = rankArr[7];
        } else if (this.level < 90) {
            this.rank = rankArr[8];
        } else if (this.level < 100) {
            this.rank = rankArr[9];
        } else if (this.level == 100) {
            this.rank = rankArr[10];
        }
        return this.rank;
    }

    public int getRankInt(int level) {
        int rank = 0;
        if (level < 10)
            rank = 1;
        else if (level < 20) {
            rank = 2;
        } else if (level < 30) {
            rank = 3;
        } else if (level < 40) {
            rank = 4;
        } else if (level < 50) {
            rank = 5;
        } else if (level < 60) {
            rank = 6;
        } else if (level < 70) {
            rank = 7;
        } else if (level < 80) {
            rank = 8;
        } else if (level < 90) {
            rank = 9;
        } else if (level < 100) {
            rank = 10;
        } else if (level == 100) {
            rank = 11;
        }
        return rank;
    }

    public ArrayList achievements() {
        return this.achievements;
    }

    public String training(String achievement, int exp, int level) {
        if (this.level < level) {
            return "Not strong enough";
        } else {
            this.experience += exp;
            if (this.experience > 10000) {
                this.experience = 10000;
            }
            this.level = this.experience / 100;
            this.achievements.add(achievement);
            return achievement;
        }
    }

    public String battle(int enemyLevel) {
        int rankWarrior = getRankInt(this.level);
        int rankEnemy = getRankInt(enemyLevel);
        int rankDiff = rankEnemy - rankWarrior;
        int levelDiff = enemyLevel - this.level;
        if (enemyLevel < 1 || enemyLevel > 100)
        {
            return "Invalid level";
        }
        if (levelDiff == 0) // warrior: 1 <--> enemy: 1 (+10 xp)
        {
            this.experience += 10;
            this.level = this.experience / 100;
            return "A good fight";
        }
        else if (levelDiff == -1) // warrior: 5 <--> enemy: 4 (+5 xp)
        {
            this.experience += 5;
            this.level = this.experience / 100;
            return "A good fight";
        }
        else if (levelDiff <= -2) // warrior: 3 <--> enemy: 1 (0 xp)
        {
            return "Easy fight";
        }
        else if (rankDiff == 0) // warrior: 1 <--> enemy: 3 (+80 xp)
        {
            this.experience += (20 * ((enemyLevel - this.level) * (enemyLevel - this.level)));
            this.level = this.experience / 100;
            return "An intense fight";
        }
        else if (rankDiff == 1 && levelDiff < 5) // warrior: 1 <--> enemy: 3 (+80 xp)
        {
            this.experience += (20 * ((enemyLevel - this.level) * (enemyLevel - this.level)));
            this.level = this.experience / 100;
            return "An intense fight";
        }
        else
        {
            return "You've been defeated";
        }
    }
}