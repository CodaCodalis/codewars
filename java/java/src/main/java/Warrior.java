import java.util.ArrayList;

public class Warrior {
    int level = 1;
    int experience = 100;
    String rank;
    ArrayList<String> achievements = new ArrayList<String>();


    public Warrior() {
    }

    public int level() {
        return level;
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
        } else if (this.level <= 100) {
            this.rank = rankArr[9];
        }
        return this.rank;
    }

    public ArrayList achievements() {

        return this.achievements;
    }

    public String training(String achievement, int exp, int level) {
        this.experience += exp;
        if (this.experience > 10000) {
            this.experience = 10000;
        }
        this.level = this.experience / 100;
        this.achievements.add(achievement);
        return achievement;
    }

    public String battle(int enemyLevel) {
        if (enemyLevel < 1 || enemyLevel > 100) {
            return "Invalid level";
        }
        if (this.level == enemyLevel) {
            this.experience += 10;
        } else if (this.level == enemyLevel + 1) {
            this.experience += 5;
        } else if (this.level >= enemyLevel - 2) {
            // 0 experience
        } else if (this.level > enemyLevel) {

        }
        return "A good fight";
    }
}

