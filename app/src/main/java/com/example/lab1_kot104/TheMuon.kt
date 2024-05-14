package com.example.lab1_kot104


class TheMuon(
    val maPhieuMuon: Int,
    val ngayMuon: Int,
    val hanTra: Int,
    val soHieuSach: String,
    val sinhVien: SinhVien
) {
    override fun toString(): String {
        return "TheMuon(maPhieuMuon=$maPhieuMuon, ngayMuon=$ngayMuon, hanTra=$hanTra, soHieuSach='$soHieuSach', sinhVien=$sinhVien)"
    }

}