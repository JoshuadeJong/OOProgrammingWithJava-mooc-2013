
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {

        // Part 1
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);

        // Part 2
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);

        // Part 3
        NHLStatistics.searchByPlayer("Sidney Crosby");

        // Part 4
        NHLStatistics.teamStatistics("PHI");

        // Part 5
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");







    }
}
