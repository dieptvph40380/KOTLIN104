package com.example.lab1_kot104

import java.util.Scanner

fun main() {
    val sv1 = SinhVienModel("pham minh phuong", "ph40381", 4f)
    val sv2 = SinhVienModel("pham minh phong", "ph40382", 7f)

    sv2.daTotNghiep = false
    sv2.tuoi = 22

    val sv3 = SinhVienModel("Tran Thu Phuong", "PH12533", 8.5f, false, 22)

    val listSV = mutableListOf<SinhVienModel>()
    listSV.add(sv1)
    listSV.add(sv2)
    listSV.add(sv3)
    listSV.removeAt(listSV.size - 1)
    for (sinhvien in listSV) {
        println(sinhvien.getThongTin())
    }
    for (i in listSV.indices)
        println("SV thu $i - ${listSV[i].getThongTin()}")

    var keepRunning = true // Biến cờ để kiểm soát việc lặp
    do {
        println("_____________________________________")
        println("Hiển thị danh sách : ")
        for (sinhvien in listSV) {
            println(sinhvien.getThongTin())
        }
        for (i in listSV.indices)
            println("SV thu $i - ${listSV[i].getThongTin()}")
        println("Vui lòng chọn chức năng : 1 2 3")
        val scanner = Scanner(System.`in`)
        val s = scanner.nextLine()
        when (s) {
            "1 - Thêm sinh viên" -> ThemSV(listSV)
            "2 - Xóa sinh viên" -> XoaSV(listSV)
            else -> keepRunning = false // Nếu giá trị ob không hợp lệ, cũng thoát khỏi vòng lặp
        }
    } while (keepRunning)
}

fun ThemSV(listSV: MutableList<SinhVienModel>) {
    println("Nhập thông tin sinh viên:")
    val scanner = Scanner(System.`in`)
    print("Tên sinh viên: ")
    val tenSV = scanner.nextLine()
    print("Mã số sinh viên: ")
    val mssv = scanner.nextLine()
    print("Điểm trung bình: ")
    val diemTB = scanner.nextFloat()
    print("Đã tốt nghiệp (true/false): ")
    val daTotNghiep = scanner.nextBoolean()
    print("Tuổi: ")
    val tuoi = scanner.nextInt()

    val sv = SinhVienModel(tenSV, mssv, diemTB, daTotNghiep, tuoi)
    listSV.add(sv)
    println("Sinh viên đã được thêm vào danh sách.")
}
fun XoaSV(listSV: MutableList<SinhVienModel>){
    println("Nhập vị trí sinh viên cần xóa: ")
    val scanner = Scanner(System.`in`)
    val position = scanner.nextInt()
    if (position in 0 until listSV.size) {
        listSV.removeAt(position)
        println("Sinh viên tại vị trí $position đã được xóa khỏi danh sách.")
    } else {
        println("Vị trí nhập vào không hợp lệ.")
    }
}
