package com.example.lab1_kot104


    fun main () {
        val kq = phepChia(4, 2f)
        println(kq)

        val arrX = intArrayOf(1,2,3,4)
        arrX[arrX.size-1] = 5
        println(arrX.asList())

        for (i in arrX.indices) {
            println("Phan tu trong mang la: ${arrX[i]}")
        }
    }
    fun phepChia (soA: Int, soB: Float) : String {
        if (soB == 0f){
            return "SoB phai khac 0"
        }
        val c = soA / soB
        return "$soA : $soB = ${String.format("%.2f", c)}"
    }