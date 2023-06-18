package com.example.uts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animeList = listOf<KsbClass>(
            KsbClass(
                R.drawable.foto1,
                ksbname = "Ahmad Hulaimi",
                ksbdate = "Nomor Anggota: \n234/KSBULM/XIII/21",
                ksbauthor = "Jabatan: \nKetua Umum atau Kepala Adat",
                ksbdesc = "Tentang KSB: \nKalimantan Selatan adalah salah satu bagian pulau yang ada di Indonesia, yang dianugrahi dengan berbagai kelebihan dan kuantitas sumber daya alam dan sumber daya manusia yang melimpah ruah, maka dari itu tidak salah kalau Kalimantan Selatan bisa dikatakan daerah yang kaya. Kekayaan tersebut juga dapat dilihat pada keanekaragaman budaya, adat istiadat, dan kesenian tradisi yang juga dijadikan sebagai identitas dari daerah tersebut." +
                        "\nSayangnya di Kalimantan Selatan banyak unsur-unsur budaya, adat istiadat, dan kesenian tradisi yang hampir punah karena lekang oleh zaman dan terpengaruh oleh masuknya kebudayaan asing melalui arus globalisasi yang berpangkal pada majunya teknologi dan informasi. Sungguh sebuah keadaan yang memperihatinkan jika dulu masyarakat kita Kalimantan Selatan masih menjalankan adat seperti ritual-ritual yang dilakukan dalam sebuah prosesi perkawinan seperti bamandi-mandi, pangantin bausung, dan pangantin baarak bakarita. Juga ritual-ritual lain seperti batapung tawar, dan seterusnya. Sementara pada bidang kesenian kita mengenal istilah-istilah seperti balamut, bagandut, bakisah, dundam, wayang gong, kuda gepang, musik panting, manoping dan lain-lain. Akan tetapi sekarang ini hal-hal tersebut sudah mulai ditinggalkan oleh masyarakat tanpa adanya usaha yang mengarah pada pelestarian adat dan budaya tersebut." +
                        "\nersoalan mencintai, memelihara dan mengembangkan budaya tidak pernah selesai dibicarakan, meskipun selalu dikomunikasikan sebagai bentuk kepedulian. Tetapi setiap dibicarakan atau didiskusikan semakin sulit untuk merealisasikannya dalam bentuk tindakan sesuai dengan harapan yang diinginkan. Dalam keadaan pertahanan budaya yang rapuh dan semakin ditinggalkan masyarakat pendukungnya, memang harus ada upaya konkret yang dapat mengembalikan kesadaran budaya agar warisan budaya sebagai identitas suku bangsa tetap terpelihara dengan baik.\n" +
                        "Sesungguhnya warisan budaya merupakan identitas suku bangsa yang berbudaya, sumber inspirasi dan penguat jati diri bahkan sebagai sumber ekonomi. Kini warisan budaya yang bernilai tinggi tersebut banyak yang tergusur karena kitatidak bangga lagi, tidak ada rasa memiliki dan cukup menyedihkan tidak tertarik untuk mengembangkan serta menyesuaikannya dengan tuntunan keadaan. Oleh karenanya upaya untuk mengungkapkan warisan budaya yang diyakini dapat menggugah peningkatan kreativitas dan sekaligus mempertahankan identitas suku bangsa yang berbudaya luhur itu perlu dilakukan sebagai wujud kesadaran budaya." +
                        "\nBerangkat dari segelintir permasalahan dan kegelisahan diatas, sudah saatnya mahasiswa sebagai agen perubahan sosial untuk bergerak dan lebih intens mengeksplorasi kreativitas dalam sebuah wadah guna melestarikan khazanah dan warisan budaya sebagai perwujudan rasa cinta terhadap tanah air dan bangsa." +
                        "\nUnit Kegiatan Mahasiswa ini bernama Kampoeng Seni Boedaja Universitas Lambung Mangkurat yang kemudian disingkat menjadi KSB UNLAM. KSB UNLAM berkedudukan di Universitas Lambung Mangkurat Banjarmasin Kalimantan Selatan. KSB UNLAM didirikan di Banjarmasin pada tanggal 10 Maret 2008. KSB UNLAM diresmikan di Banjarmasin pada tanggal 10 Maret 2009, dengan surat keputusan rektor Universitas Lambung Mangkurat Nomor Kep. 42/H8/KM/2009 tertanggal 02 Maret 2009."
            ),
            KsbClass(
                R.drawable.foto2,
                ksbname = "M. Dance Amrullah",
                ksbdate = "Nomor Anggota: \n230/KSBULM/XIII/21",
                ksbauthor = "Jabatan: \nKetua Departemen Kegiatan seni dan budaya",
                ksbdesc = "Deskripsi: \nDepartemen Kegiatan Seni dan Budaya atau yang sering disebut Mantri Hawas, adalah sebuah departemen yang ada dalam struktur kepengurusan KSB ULM yang berfungsi sebagai menjadwalkan atau membuat program kerja seluruh kegiatan seni dan budaya yang ada di KSB ULM, adapun program kerja Departement Kegiatan KSB ULM 2023 adalah:" +
                        "\n 1. Memperingati Hari lahir KSB ULM " +
                        "\n 2. Aruh Seni KSB ULM " +
                        "\n 3. Festival Teater Modern " +
                        "\n 4. Pentas Tunggal Anggota Muda " +
                        "\n 5. Peran KSB (Pentas Pinggiran)" +
                        "\n Diatas adalahh Program kerja utama dari Departemen kegiagtan seni dan budaya KSBULM periode 2023, departemen kegiatan juga membawahi atau memantau langsung pergerakan seluruh balai atau bidang kesenian yang ada di KSB ULM, yaitu: Musik,Teater,Seni Rupa,Tari,Sastra"),

            KsbClass(
                R.drawable.foto3,
                ksbname = "Noorhani",
                ksbdate = "Nomor Anggota: \n241/KSBULM/XIV/22",
                ksbauthor = "Jabatan: \nAnggota Departemen Kegiatan Seni dan Budaya",
                ksbdesc = "Deskripsi: \nDidalam Departemen Kegiatan Seni dan Budaya terdapat 2 Anggota salahsatunya adalah Noorhani atau yang sering dipanggil hani, didalam departemen ini Noorhani diamanahkan untuk menghandle beberapa programkerja di Departemen Kegiatan KSB ULM periode 2023 dan menghandle beberapa balai diantaranya balai: Tari dan teater, balai tari dan teater memiliki program kerja yaitu: " +
                        "\n 1. Workshop tari tradisional " +
                        "\n 2. Workshop Keaktoran"
            ),
            KsbClass(
                R.drawable.foto4,
                ksbname = "Rizky Ircham Muzaki",
                ksbdate = "Nomor Anggota: \n238/KSBULM/XIV/22",
                ksbauthor = "Jabatan: \nAnggota Departemen Kegiatan Seni dan Budaya",
                ksbdesc = "Deskripsi: \nDidalam Departemen Kegiatan Seni dan Budaya terdapat 2 Anggota salahsatunya adalah Rizky Ircham Muzaki atau yang sering dipanggil Muza, didalam departemen ini muza diamanahkan untuk menghandle beberapa programkerja di Departemen Kegiatan KSB ULM periode 2023 dan menghandle beberapa balai diantaranya balai: Seni Rupa, Sastra dan Musik, balai Seni Rupa, Sastra dan musik memiliki program kerja yaitu: " +
                        "\n 1. Workshop Kepenulisan" +
                        "\n 2. Workshop Musik " +
                        "\n 3. Workshop Melukis"
            ),

        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = KsbAdapter(this, animeList) {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)



        }
    }
}


