package com.example.androidbasicscourse

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class NewsFeed : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: NewsFeedAdapter

    private val posts = listOf(
        "В Астане прошёл международный экономический форум." to "https://yastatic.net/s3/bro-bg-store/d46e03c4-bac5-424b-a83a-b0057403d0a4.jpg",
        "Новый мост через реку откроют завтра." to "https://wallpapers.com/images/hd/san-francisco-4k-daytime-photograph-fbtv4jed6kiy67kv.jpg",
        "Учёные нашли способ продлить жизнь кошкам." to "https://wallpaper.forfun.com/fetch/3d/3d11be2da5b3db35d751305d5c8820fd.jpeg",
        "В Алматы выпал неожиданный первый снег." to "https://cdn-kz.kursiv.media/wp-content/uploads/2024/12/06-25.jpg",
        "На автосалоне представили инновационный электромобиль." to "https://i.ytimg.com/vi/Usqk_RRXAHI/maxresdefault.jpg",
        "Сергей Лазарев и ДИМА БИЛАН рискнули жизнью ради успеха" to "https://cdn.7days.ru/pic/bc4/991095/1502972/104.jpg",
        "Спортсмен из Казахстана завоевал золотую медаль." to "https://cdn.nur.kz/images/1200x675/c6384cb31a3bf0cb.jpeg?version=1",
        "В школах внедрят новые цифровые учебники." to "https://www.bu.edu/files/2010/03/digital-textbook_t.jpg",
        "Туристы массово приезжают на курорты Турции." to "https://i.pinimg.com/originals/5f/e6/89/5fe68989070a3e93b5ce781056d4d37b.jpg",
        "В Европе открыли самую большую солнечную станцию." to "https://avatars.mds.yandex.net/i?id=cf35a96ecf26723bcef4589649237b16_l-4259532-images-thumbs&n=13",
        "В театре поставили современную версию «Гамлета»." to "https://avatars.mds.yandex.net/i?id=e480900b53ef1c2a3f1d4f869cdb8ec7_l-4855057-images-thumbs&n=13",
        "Сегодня умер ДИМА БИЛАН. Известный певец ПОГИБ УТРОМ." to "https://globalsib.com/wp-content/uploads/2018/04/Dima-Bilan-umer-ili-net-15.01.2018-pravda-i-lozh-pohorony-poslednie-novosti-foto.jpg",
        "Учёные предсказали необычное северное сияние в октябре." to "https://cdn.myslo.ru/Content/NewsImage/0c/34/0c34be42-3757-42eb-82e1-1807a2e6c9bc_3.jpg",
        "Жители жалуются на рост цен на продукты." to "https://f.azh.kz/news-kaz/61501.jpeg",
        "В метро установили новые системы безопасности." to "https://cdn.nur.kz/images/1200x675/fb7e84397352b8a2.jpeg?version=1",
        "Рынок криптовалюты переживает резкое падение курсов." to "https://avatars.mds.yandex.net/i?id=f55a5ecd5be5013e0136035783d308f83efcf8fa-5344516-images-thumbs&n=13",
        "В Казахстане запустили первую частную ракету." to "https://i.ytimg.com/vi/JACRcU2JOpo/maxresdefault.jpg",
        "Билан опроверг слухи о СВОЕЙ СМЕРТИ разместив СВЕЖИЕ ФОТО" to "https://sonxeber.az/uploads/f85e67c3ae1c84a0deaf519b840207e2.jpg",
        "На границе открыли современный логистический центр." to "https://img2.kapital.kz/VPp3TlWCHos/el:true/rs:fit:1010:581/dpr:1.5/f:webp/czM6Ly9rYXBpdGFsLXN0YXRpYy9pbWcvNy9iLzUvMy81L2JlZjcyOTQwMDM0NmVjNDQ5ZjEyODBhYTcwZC5qcGc",
        "Водители пожаловались на рост штрафов за парковку." to "https://liter.kz/cache/imagine/1200/uploads/news/2024/12/27/677256bb5621f544889513.jpeg",
        "Новый фильм собрал рекордные кассовые сборы." to "https://img-s-msn-com.akamaized.net/tenant/amp/entityid/AA1IJrTo.img?w=1200&h=700&m=4&q=87",
        "В зоопарке родился редкий белый тигр." to "https://i.pinimg.com/originals/a8/ef/5b/a8ef5b31bce564a07a0dd0579d11441a.jpg",
        "В столице построят крупнейший спортивный комплекс." to "https://avatars.mds.yandex.net/i?id=d1afbb774c03022d06b5d231fb9e13f2_l-10114558-images-thumbs&n=13",
        "СЕГОДНЯ ПОХОРОНЫ ДИМЫ БИЛАНА. БОЛЕЗНЬ УНЕСЛА ПЕВЦА. УСТАЛОСТЬ ВИНОВНА В СЛУЧИВШИМСЯ. Смотрите фото." to "https://i.ytimg.com/vi/NolJHr1HFTE/maxresdefault.jpg",
        "Учёные разработали нанороботов для лечения сосудов." to "https://i.ytimg.com/vi/2kR1ROCPVII/maxresdefault.jpg"
    )

    private var likes = MutableList(posts.size) { false }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

//        if (savedInstanceState != null) {
//            likes = savedInstanceState.getBooleanArray("likes")?.toMutableList() ?: likes
//        }

        adapter = NewsFeedAdapter(posts, likes)
        recyclerView.adapter = adapter
    }

//    override fun onSaveInstanceState(outState: Bundle) {
//        super.onSaveInstanceState(outState)
//        outState.putBooleanArray("likes", likes.toBooleanArray())
//    }
}
