package com.bosch.polymorphism;

// Specific member class GoldMember
public class GoldMember extends AbstractMember {
    public GoldMember(String name, int level, int rank) {
        super(name, "Gold", level, rank);
    }

    @Override
    public void displayMemberBenefits() {
        System.out.println("Gold Member benefits include: Free shipping, Exclusive discounts, and Priority support.");
    }
}

