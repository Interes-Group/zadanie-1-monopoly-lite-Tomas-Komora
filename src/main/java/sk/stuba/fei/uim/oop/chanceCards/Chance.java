package sk.stuba.fei.uim.oop.chanceCards;

import sk.stuba.fei.uim.oop.game.Players;

public abstract class Chance {

    protected String statement;

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }
    public abstract void chanceCard(Players player);

}
