package com.learning.corejava.service;

import com.learning.corejava.dto.Calculator;
import org.springframework.stereotype.Service;

@Service
public class CoreJavaPrograms {


    public String checkPrime(int n) {
        String message ="Invalid" ;
        int i,m=0,flag=0;

        m=n/2;
        if(n==0||n==1){
            message = (n+" is not prime number");
        }else{
            for(i=2;i<=m;i++){
                if(n%i==0){
                    message = (n+" is not prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0)  {
                message = (n+" is prime number"); }
        }//end of else
        return message;
    }

    public int performOperation(Calculator calculator) {
        if("+".equalsIgnoreCase(calculator.getOperation()) ) {
            return calculator.getNumber1()+calculator.getNumber2();
        } else  if("-".equalsIgnoreCase(calculator.getOperation())) {
            return calculator.getNumber1()-calculator.getNumber2();
        }else  if("*".equalsIgnoreCase(calculator.getOperation())) {
            return calculator.getNumber1()*calculator.getNumber2();
        }
        return 0;
    }
}
