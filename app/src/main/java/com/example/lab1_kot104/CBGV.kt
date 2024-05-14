
class CBGV(val nguoi: Nguoi, val luongCung: Double,
           val luongThuong: Double,
           val tienPhat: Double){

    fun tinhLuongThuc(): Double {
        return luongCung + luongThuong - tienPhat
    }
    fun getThongTin () : String {

        return "\nTen: ${nguoi.hoTen}  \nTuoi: ${nguoi.tuoi} \nQueQuan: ${nguoi.queQuan} \nMaSo: ${nguoi.maSo} \nluong: ${tinhLuongThuc()}"
    }
}

