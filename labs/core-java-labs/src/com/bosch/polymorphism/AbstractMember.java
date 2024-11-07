package com.bosch.polymorphism;

// Abstract class implementing the interface
public abstract class AbstractMember implements MemberInterface {
    private String name;
    private String type;
    private int level;
    private int rank;

    public AbstractMember(String name, String type, int level, int rank) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.rank = rank;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public int getRank() {
        return this.rank;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public void setRank(int rank) {
        this.rank = rank;
    }


    public void setName(String name, String type) {
        this.name = name;
        this.type = type;
    }

    // Overloaded setLevel method
    public void setLevel(int level, int rank) {
        this.level = level;
        this.rank = rank;
    }

    // Abstract method to be implemented by subclasses
    @Override
    public abstract void displayMemberBenefits();
}