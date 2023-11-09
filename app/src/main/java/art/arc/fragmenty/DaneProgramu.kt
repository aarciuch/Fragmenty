package art.arc.fragmenty

import android.os.Parcel
import android.os.Parcelable

class DaneProgramu() : Parcelable {
    private var string1: String = ""
    private var string2: String = ""
    private var dlugosci: String = getStringsLengths()

    constructor(parcel: Parcel) : this() {
    }

    fun setString1(s: String) {
        this.string1 = s
    }
    fun setString2(s: String) {
        this.string2 = s
    }

    fun getString1() : String {
        return this.string1
    }

    fun getString2() : String{
        return this.string2
    }

    fun setStringsLengths() {
        dlugosci = "${string1.length} : ${string2.length}"
    }

    fun getStringsLengths() : String {
        return dlugosci
    }


    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<DaneProgramu> {
        override fun createFromParcel(parcel: Parcel): DaneProgramu {
            return DaneProgramu(parcel)
        }

        override fun newArray(size: Int): Array<DaneProgramu?> {
            return arrayOfNulls(size)
        }
    }
}