package io.codelex.classesandobjects.chain;

public class MainProgramm {
    public static void main(String[] args) {

        Link l1 = new Link("John");
        Link l2 = new Link("Lisa");
        Link l3 = new Link("Peter");

        l1.setNextLink(l2);
        l2.setNextLink(l3);

        Chain chain = new Chain(l1);
        chain.addLink(l2);
        chain.addLink(l3);

    }
}
