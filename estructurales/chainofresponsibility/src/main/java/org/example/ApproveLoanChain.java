package org.example;

/**
 * Created by albertopalomarrobledo on 30/7/19.
 */
public interface ApproveLoanChain {
    void setNext(ApproveLoanChain loan);
    ApproveLoanChain getNext();
    void crediCardRequest(int totalLoan);
}
