package com.example.lab1_kot104

fun main() {
    var danhSachTheMuon: MutableList<TheMuon> = mutableListOf()
    val sinhVien = SinhVien("Nguyễn Văn A", 20, "K60CNTT")
    while (true) {
        println("\nChọn chức năng:")
        println("1. Thêm thẻ mượn")
        println("2. Xóa thẻ mượn theo mã phiếu mượn")
        println("3. Hiển thị thông tin các thẻ mượn")
        println("4. Thoát")

        print("Nhập lựa chọn: ")
        val luaChon = readLine()?.toIntOrNull() ?: 0

        when (luaChon) {
            1 -> {
                // Thêm thẻ mượn
                val sinhVien = nhapThongTinSinhVien()
                val theMuon = nhapThongTinTheMuon(sinhVien)
                nhapThongTinTheMuon(sinhVien)
            }
            2 -> {
                // Xóa thẻ mượn theo mã phiếu mượn
                print("Nhập mã phiếu mượn: ")
                val maPhieuMuon = readLine()?.toIntOrNull() ?: 0
                xoaTheMuonTheoMaPhieuMuon(maPhieuMuon)
            }
            3 -> {
                // Hiển thị thông tin các thẻ mượn
                hienThiThongTinTheMuon(danhSachTheMuon)
            }
            4 -> {
                // Thoát
                println("Thoát chương trình.")
                break
            }
            else -> {
                println("Lựa chọn không hợp lệ.")
            }
        }
    }
}

fun nhapThongTinSinhVien(): SinhVien {
    print("Họ tên: ")
    val hoTen = readLine().orEmpty()
    print("Tuổi: ")
    val tuoi = readLine()?.toIntOrNull() ?: 0
    print("Lớp: ")
    val lop = readLine().orEmpty()
    return SinhVien(hoTen, tuoi, lop)
}

fun nhapThongTinTheMuon(sinhVien: SinhVien): TheMuon {
    print("Mã phiếu mượn: ")
    val maPhieuMuon = readLine()?.toIntOrNull() ?: 0
    print("Ngày mượn: ")
    val ngayMuon = readLine()?.toIntOrNull() ?: 0
    print("Hạn trả: ")
    val hanTra = readLine()?.toIntOrNull() ?: 0
    print("Số hiệu sách: ")
    val soHieuSach = readLine().orEmpty()
    return TheMuon(maPhieuMuon, ngayMuon, hanTra, soHieuSach, sinhVien)
}

fun hienThiThongTinTheMuon(danhSachTheMuon: List<TheMuon>) {
    if (danhSachTheMuon.isEmpty()) {
        println("Danh sách thẻ mượn rỗng.")
        return
    }

    println("Danh sách thẻ mượn:")
    danhSachTheMuon.forEach { theMuon ->
        println(theMuon)
    }
}
fun xoaTheMuonTheoMaPhieuMuon(maPhieuMuon: Int): Boolean {
    // Lấy danh sách thẻ mượn (có thể lưu trữ trong biến hoặc truy cập CSDL)
    val danhSachTheMuon: MutableList<TheMuon> = mutableListOf()

    // Tìm thẻ mượn cần xóa
    val theMuonCanXoa = danhSachTheMuon.find { it.maPhieuMuon == maPhieuMuon }

    // Xóa thẻ mượn nếu tìm thấy
    if (theMuonCanXoa != null) {
        danhSachTheMuon.remove(theMuonCanXoa)
        println("Xóa thẻ mượn với mã phiếu mượn $maPhieuMuon thành công.")
        return true
    }

    println("Không tìm thấy thẻ mượn với mã phiếu mượn $maPhieuMuon.")
    return false
}