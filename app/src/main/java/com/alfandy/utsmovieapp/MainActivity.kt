package com.alfandy.utsmovieapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val Movielist = listOf<Movie>(
            Movie(
                R.drawable.ant_man,
                "Ant Man",
                "Pada tahun 1989, ilmuwan Hank Pym mengundurkan diri dari S.H.I.E.L.D. setelah menemukan upaya mereka untuk meniru teknologi penyusutan Ant-Man-nya. Percaya teknologi akan berbahaya jika direplikasi, Pym bersumpah untuk menyembunyikannya selama dia hidup. Pada hari ini, putri Pym yang terasing, Hope van Dyne, dan mantan anak didiknya, Darren Cross, telah memaksanya keluar dari perusahaannya, Pym Technologies. Cross hampir menyempurnakan setelan menyusut sendiri, Yellowjacket, yang membuat Pym ngeri."
            ),

            Movie(
                R.drawable.super_man,
                "Super Man",
                "Superman telah hilang selama lima tahun, sejak melakukan perjalanan ke lokasi di mana para astronom percaya bahwa mereka telah menemukan sisa-sisa Krypton. Selama ketidakhadirannya, musuh Superman Lex Luthor dibebaskan dari penjara dan menikahi seorang janda kaya untuk mendapatkan kekayaannya setelah kematiannya. Superman, setelah gagal dalam usahanya untuk menemukan Kryptonians yang masih hidup, kembali ke Bumi dan, sebagai Clark Kent, melanjutkan pekerjaannya di Daily Planet di Metropolis."
            ),

            Movie(
                R.drawable.hulk,
                "The Incredible Hulk",
                "David Banner adalah peneliti genetika untuk pemerintah yang mencoba meningkatkan DNA manusia; atasannya, Jenderal Thaddeus \"Thunderbolt\" Ross, melarang eksperimen manusia, jadi David bereksperimen pada dirinya sendiri. Istrinya, Edith, segera melahirkan putra mereka, Bruce Banner. David menyadari Bruce mewarisi DNA mutannya dan mencoba menemukan obatnya. Setelah menemukan eksperimen berbahayanya, Ross menutup penelitian David; David rigs desert base reaktor gamma untuk meledak sebagai balas dendam. Percaya bahwa dia berbahaya, David mencoba membunuh Bruce tetapi secara tidak sengaja membunuh Edith ketika dia berada di antara mereka; Trauma menyebabkan Bruce untuk menekan kenangan masa kecilnya."
            ),
            Movie(
                R.drawable.spider_man,
                "Spider man",
                "Peter Parker berencana untuk melamar Mary Jane Watson, yang telah membuat debut musikal Broadway-nya. Di Central Park, sebuah meteorit mendarat di dekat keduanya, dan symbiote luar angkasa mengikuti Peter ke apartemennya dengan menempel pada sepeda motornya. Harry Osborn, mengetahui Peter adalah Spider-Man, berusaha untuk membalas kematian ayahnya. Menggunakan gas peningkat kinerja ayahnya dan teknologi Green Goblin, ia pertempuran Peter untuk kebuntuan akhirnya, mengembangkan amnesia parsial. Sementara itu, polisi mengejar narapidana Flint Marko yang melarikan diri, yang mengunjungi istri dan putrinya yang sakit sebelum melarikan diri. Jatuh ke dalam akselerator partikel eksperimental yang memadukan tubuhnya dengan pasir di sekitarnya, ia mendapatkan kemampuan untuk mengendalikan dan mereformasi tubuhnya dengan pasir, menjadi Sandman."
            ),
            Movie(
                R.drawable.wonder_woman,
                "Wonder Woman",
                "Di Paris saat ini, Diana Prince menerima piring fotografi dari Wayne Enterprises tentang dirinya dan empat pria yang diambil selama Perang Dunia I, mendorongnya untuk mengingat masa lalunya. Putri Ratu Hippolyta, Diana dibesarkan di pulau tersembunyi Themyscira, rumah bagi Amazon, pejuang wanita yang diciptakan oleh dewa Olimpiade untuk melindungi umat manusia. Hippolyta menjelaskan sejarah mereka kepada Diana, termasuk bagaimana Ares menjadi cemburu pada kemanusiaan dan mengatur kehancurannya."
            ),
            Movie(
                R.drawable.black_panther,
                "Black Panther",
                "Ribuan tahun yang lalu, lima suku Afrika berperang atas meteorit yang mengandung vibranium logam. Seorang prajurit menelan \"ramuan berbentuk hati\" yang dipengaruhi oleh logam dan mendapatkan kemampuan manusia super, menjadi \"Black Panther\" pertama. Dia menyatukan semua kecuali Suku Jabari untuk membentuk bangsa Wakanda. Selama berabad-abad, Wakanda menggunakan vibranium untuk mengembangkan teknologi canggih dan mengisolasi diri dari dunia dengan menyamar sebagai negara Dunia Ketiga."
            ),
            Movie(
                R.drawable.captain_marvel,
                "Captain Marvel",
                "Pada tahun 1995, di planet ibukota Kekaisaran Kree, Hala, anggota Starforce Vers menderita amnesia dan mimpi buruk berulang yang melibatkan seorang wanita yang lebih tua. Yon-Rogg, mentor dan komandannya, melatih Vers untuk mengendalikan kemampuannya, sementara Kecerdasan Tertinggi, kecerdasan buatan yang mengatur Kree, mendesaknya untuk menjaga emosinya tetap terkendali."
            ),
            Movie(
                R.drawable.thor,
                "Thor",
                "Pada tahun 965 M, Odin, raja Asgard, berperang melawan Frost Giants of Jotunheim dan pemimpin mereka Laufey, untuk mencegah mereka menaklukkan Sembilan Alam, dimulai dengan Bumi. Prajurit Asgardian mengalahkan Frost Giants di Tønsberg, Norwegia, dan merebut sumber kekuatan mereka, Peti Mati Musim Dingin Kuno."
            ),
            Movie(
                R.drawable.captain_america_civilwar,
                "Captain America: Civil War",
                "Pada tahun 1991, prajurit super yang dicuci otak James \"Bucky\" Barnes dikirim dari pangkalan Hydra di Siberia untuk mencegat sebuah mobil yang membawa kasus serum prajurit super. Pada hari ini, sekitar satu tahun setelah Ultron dikalahkan oleh Avengers di negara Sokovia, Steve Rogers, Natasha Romanoff, Sam Wilson, dan Wanda Maximoff menghentikan Brock Rumlow dari mencuri senjata biologis dari laboratorium di Lagos. . Rumlow meledakkan dirinya sendiri, mencoba membunuh Rogers. Maximoff secara telekinetically mengalihkan ledakan, secara tidak sengaja menghancurkan sebuah bangunan di dekatnya dan membunuh beberapa pekerja kemanusiaan Wakanda dalam prosesnya."
            ),
            Movie(
                R.drawable.doctor_strange,
                "Doctor Strange",
                "Di Kathmandu, penyihir Kaecilius dan orang-orang fanatiknya memasuki kompleks rahasia Kamar-Taj dan memenggal kepala pustakawannya. Mereka mencuri beberapa halaman dari teks mistis kuno milik Ancient One, seorang penyihir berumur panjang yang telah mengajar setiap siswa di Kamar-Taj, termasuk Kaecilius, dalam seni mistik. Yang Kuno mengejar para pengkhianat, tetapi Kaecilius dan para pengikutnya melarikan diri."
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = MovieAdapter(this, Movielist){
            val intent = Intent(this, DetailMovieActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }

    }
}