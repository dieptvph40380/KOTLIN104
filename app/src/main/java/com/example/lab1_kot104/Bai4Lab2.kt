package com.example.lab1_kot104

fun main(){
    val sv1=SinhVienModel("pham minh phuong",  "ph40381",  4f)
    val sv2=SinhVienModel( "pham minh phong",  "ph40382",  7f)

    sv2.daTotNghiep=false
    sv2.tuoi=22

    val sv3 = SinhVienModel("Tran Thu Phuong", "PH12533", 8.5f, false, 22)

    val listSV= mutableListOf<SinhVienModel>()
    listSV.add(sv1)
    listSV.add(sv2)
    listSV.add(sv3)
    listSV.removeAt(listSV.size - 1)
    for(sinhvien in listSV){
        println(sinhvien.getThongTin())
    }
    for (i in listSV.indices)
        println("SV thu $i - ${listSV.get(i).getThongTin()}")
    chucnang()

}

fun chucnang(){
    println("1. Thêm sinh viên")
    println("2. Xóa sinh viên ")
    println("3. Xem danh sách sinh viên")
}