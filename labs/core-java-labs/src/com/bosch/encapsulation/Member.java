package com.bosch.encapsulation;

class Member implements MemberInterface{
    private String name;
    private String type;
    private int level;
    private int rank;

    public Member(String name, String type, int level, int rank) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.rank = rank;
    }

    @Override
    /* let's define our getter functions here */
    public String getName() { // what is your name?
        return this.name; // my name is ...
    }

    @Override
    public String getType() { // what is your type?
        return this.type; // my type is ...
    }

    @Override
    public int getLevel() { // what is your level?
        return this.level; // my level is ...
    }

    @Override
    public int getRank() { // what is your rank?
        return this.rank; // my rank is
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void setType(String type) {

    }

    @Override
    public void setLevel(int level) {

    }

    @Override
    public void setRank(int rank) {

    }
}