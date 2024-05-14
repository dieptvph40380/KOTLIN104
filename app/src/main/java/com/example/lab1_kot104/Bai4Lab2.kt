package com.example.lab1_kot104

import java.util.Scanner

fun main() {
    val listSV = mutableListOf<SinhVienModel>()

    var keepRunning = true // Biến cờ để kiểm soát việc lặp
    do {
        println("_____________________________________")
        println("Hiển thị danh sách : ")
        for (i in listSV.indices)
            println("SV thu $i - ${listSV[i].getThongTin()}")
        println("Vui lòng chọn chức năng : 1-Thêm sinh viên / 2-Xóa sinh viên ")
        val scanner = Scanner(System.`in`)
        val s = scanner.nextLine()
        when (s) {
            "1" -> ThemSV(listSV)
            "2" -> XoaSV(listSV)
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
