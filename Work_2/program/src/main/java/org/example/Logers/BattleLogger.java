package org.example.Logers;

public class BattleLogger implements Log{
    private static BattleLogger battleLogger;
    private static String logFile = "This battle log of moves. \n\n";
    private static int moves = 0;

    public static synchronized BattleLogger getBattleLogger() {
        if (battleLogger == null) {
            battleLogger = new BattleLogger();
        }

        return battleLogger;
    }

    private BattleLogger() {

    }

    @Override
    public void addStringInLog(String addLog) {
        this.logFile += "Move " + moves + ": " + addLog + "\n";
        this.moves++;
    }

    @Override
    public void showBattleLog() {
        System.out.println(this.battleLogger);
    }

    @Override
    public void showFullLog() {
        System.out.println(logFile);
    }

}
