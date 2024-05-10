package com.example.lab1_kot104

class SinhVienModel  (var tenSV: String, var mssv: String, var diemTB: Float) {

    var daTotNghiep : Boolean? = null
    var tuoi : Int? = null

    constructor( tenSV: String,  mssv: String,  diemTB: Float, datotnghiep: Boolean?, tuoi: Int?) : this(tenSV, mssv, diemTB) {
        this.daTotNghiep = datotnghiep
        this.tuoi = tuoi
    }

    fun getThongTin () : String {

        var sDatotNghiep : String
        if (daTotNghiep == null) {
            sDatotNghiep = "Chua co du lieu"
        } else {
            if (daTotNghiep!!)
                sDatotNghiep = "Da tot nghiep"
            else {
                sDatotNghiep = "Chua tot nghiep"
            }
        }

        var sTuoi : String
        if (tuoi == null) {
            sTuoi = "Chua co du lieu"
        } else {
            sTuoi = tuoi.toString()
        }

        return "Ten: $tenSV , mssv: $mssv , diemTB: $diemTB , da tot nghiep: $sDatotNghiep , tuoi: $sTuoi"
    }


}