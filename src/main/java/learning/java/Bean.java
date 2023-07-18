package learning.java;

public class Bean {
    private CoffeeTypes type;
    private Integer strength;

    public Bean(CoffeeTypes type, Integer strength) {
        this.type = type;
        this.strength = strength;
    }

    public CoffeeTypes getType() {
        return type;
    }

    public void setType(CoffeeTypes type) {
        this.type = type;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }
}
