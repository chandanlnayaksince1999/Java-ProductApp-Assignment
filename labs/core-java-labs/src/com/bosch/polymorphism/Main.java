package com.bosch.polymorphism;

public class Main {
    public static void main(String[] args) {
        MemberInterface goldMember = new GoldMember("Chandu", 10, 1);
        MemberInterface silverMember = new SilverMember("Akhil", 5, 2);

        goldMember.displayMemberBenefits();
        silverMember.displayMemberBenefits();

        // Demonstrating method overloading
        goldMember.setName("Alice", "Platinum");
        silverMember.setLevel(8, 3);

        System.out.println("Gold Member new type: " + goldMember.getType());
        System.out.println("Silver Member new level: " + silverMember.getLevel());
        System.out.println("Silver Member new rank: " + silverMember.getRank());
    }
}