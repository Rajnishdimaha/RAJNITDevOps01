package com.nt.nb;

public class NetBankingService {
      public static String transferMoney(Long srcAccount,Long descAccount,String ifscCode ,Double amount)
      { 
    	  return amount+"is transfering to "+srcAccount+" to "+descAccount;
      }
}
