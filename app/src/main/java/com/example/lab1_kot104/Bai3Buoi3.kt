package com.example.lab1_kot104

fun main(){
    //khai bao va su dung lamba function
    val soA: Int?= 5
    val soB: Int?= 10
    val tong = tinhTong(soA!!,soB!!)
    println("Tong 2 so $soA va $soB = $tong" )
    val hieu = tinhHieu(soA,soB)
    println("Hieu 2 so $soA va $soB = $hieu" )
    val binhphuong = binhphuong(soA)
    println("Binh Phuon so $soA = $binhphuong" )
    val tinhThuong = tinhThuong(soA.toFloat(),soB.toFloat())()
    println("Thuong 2 so $soA = $tinhThuong" )

    val tenSV="abc"
    println("in hoa $tenSV = ${inHoa(tenSV)}")

    val length = tenSV.let{
        val l =it.length
        l
    }
    val length1 = tenSV.run{
        val l =length
        l
    }
    val a2=soA.run{
        val kq=this*2
        kq
//        this*2
    }
    println("Do dai chuoi $tenSV = $length")
    println("Do dai chuoi $tenSV = $length1")
    println(" $soA *2 = $a2")
}

val tinhTong : (Int,Int) -> Int={soA: Int,soB: Int -> (soA + soB)}
val tinhHieu ={soA: Int, soB: Int ->(soA - soB)}
val binhphuong :(Int) ->Int = {it * it}
val tinhThuong = {soA:Float,soB:Float ->{
    if(soB== 0F){
        "số bị chia phải khác 0"
    }else{
        val c = soA/soB
        c
    }
}
}
val inHoa:(String) ->String=String::uppercase