import com.example.lab1_kot104.SinhVienModel
import com.example.lab1_kot104.ThemSV
import com.example.lab1_kot104.XoaSV
import java.util.Scanner

fun main() {
    val nguoi = Nguoi("Nguyen Van A", "15","abc","aff")
    val hocSinh = CBGV(nguoi, 10.0,10.0,6.0)

    println("Họ và tên: ${hocSinh.nguoi.hoTen}")
    println("Tuổi: ${hocSinh.nguoi.tuoi}")

    println("Lương : ${hocSinh.tinhLuongThuc()}")
    println("test: ${hocSinh.getThongTin()}")

    val listSV = mutableListOf<CBGV>()

    var keepRunning = true // Biến cờ để kiểm soát việc lặp
    do {
        println("_____________________________________")
        println("Hiển thị danh sách : ")
        for (i in listSV.indices)
            println("GV thu $i : ${listSV[i].getThongTin()}")
        println("Vui lòng chọn chức năng : 1-Thêm GV / 2-Xóa GV ")
        val scanner = Scanner(System.`in`)
        val s = scanner.nextLine()
        when (s) {
            "1" -> ThemSV(listSV)
            "2" -> XoaSV(listSV)
            else -> keepRunning = false // Nếu giá trị ob không hợp lệ, cũng thoát khỏi vòng lặp
        }
    } while (keepRunning)


}
fun ThemSV(listSV: MutableList<CBGV>) {
    println("Nhập thông tin sinh viên:")
    val scanner = Scanner(System.`in`)
    print("Tên GV: ")
    val tenGV = scanner.nextLine()
    print("Tuoi GV: ")
    val tuoiGV = scanner.nextLine()
    print("Que Quan: ")
    val queQuan = scanner.nextLine()
    print("Mã số GV: ")
    val maSo = scanner.nextLine()

    print("Luong Cung: ")
    val LuongCung = scanner.nextDouble()
    print("Luong Thuong: ")
    val luongThuong = scanner.nextDouble()
    print("Tien Phat: ")
    val tienPhat = scanner.nextDouble()

    val nguoi = Nguoi(tenGV,tuoiGV,queQuan,maSo)
    val cggv = CBGV(nguoi,LuongCung, luongThuong, tienPhat)
    listSV.add(cggv)
    println("Sinh viên đã được thêm vào danh sách.")
}
fun XoaSV(listSV: MutableList<CBGV>){
    println("Nhập mã số giáo viên cần xóa:")
    val scanner = Scanner(System.`in`)
    val maSo = scanner.nextLine()

    val index = listSV.indexOfFirst { it.nguoi.maSo == maSo }
    if (index != -1) {
        listSV.removeAt(index)
        println("Giáo viên với mã số $maSo đã được xóa khỏi danh sách.")
    } else {
        println("Không tìm thấy giáo viên với mã số $maSo trong danh sách.")
    }
}
