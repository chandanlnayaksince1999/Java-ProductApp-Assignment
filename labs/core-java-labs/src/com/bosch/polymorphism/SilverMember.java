package com.bosch.polymorphism;

// Specific member class SilverMember
public class SilverMember extends AbstractMember {
    public SilverMember(String name, int level, int rank) {
        super(name, "Silver", level, rank);
    }

    @Override
    public void displayMemberBenefits() {
        System.out.println("Silver Member benefits include: Free standard shipping and Discounted rates.");
    }
}