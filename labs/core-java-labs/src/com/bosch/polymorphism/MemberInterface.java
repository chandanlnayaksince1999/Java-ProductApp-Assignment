package com.bosch.polymorphism;

public interface MemberInterface {
    String getName();
    String getType();
    int getLevel();
    int getRank();
    void setName(String name);
    void setType(String type);
    void setLevel(int level);
    void setRank(int rank);
    void setName(String name, String type); // Overloaded method
    void setLevel(int level, int rank); // Overloaded method
    void displayMemberBenefits();
}

