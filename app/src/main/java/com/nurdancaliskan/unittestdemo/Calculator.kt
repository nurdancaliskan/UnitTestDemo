package com.nurdancaliskan.unittestdemo

class Calculator {

    fun add(baseNumber:Int,addNumber:Int,result:Int):Int{
        if(result==0){
            return addNumber+baseNumber
        }
        else{
            return addNumber+result
        }
    }

    fun sub(baseNumber:Int,addNumber:Int,result:Int,temp:Int):Int{
        if(result==0 && temp==0){
            return baseNumber-addNumber
        }
        else{
            return result-addNumber
        }
    }
}