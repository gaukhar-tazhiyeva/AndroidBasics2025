package com.example.androidbasicscourse

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class NewsFeed : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: NewsFeedAdapter

    private val posts = listOf(
        "В Астане прошёл международный экономический форум." to "https://picsum.photos/id/1011/400/200",
        "Новый мост через реку откроют завтра." to "https://picsum.photos/id/1015/400/200",
        "Учёные нашли способ продлить жизнь кошкам." to "https://picsum.photos/id/1025/400/200",
        "В Алматы выпал неожиданный первый снег." to "https://picsum.photos/id/1031/400/200",
        "На автосалоне представили инновационный электромобиль." to "https://picsum.photos/id/1073/400/200",
        "Сергей Лазарев и Дима Билан рискнули жизнью ради успеха" to "https://picsum.photos/id/1012/400/200",
        "Спортсмен из Казахстана завоевал золотую медаль." to "https://picsum.photos/id/1044/400/200",
        "В школах внедрят новые цифровые учебники." to "https://picsum.photos/id/1060/400/200",
        "Туристы массово приезжают на курорты Турции." to "https://picsum.photos/id/1016/400/200",
        "В Европе открыли самую большую солнечную станцию." to "https://picsum.photos/id/1003/400/200",
        "В театре поставили современную версию «Гамлета»." to "https://picsum.photos/id/1050/400/200",
        "Сегодня умер Дима Билан. Известный певец ПОГИБ УТРОМ." to "https://picsum.photos/id/1027/400/200",
        "Учёные предсказали необычное северное сияние в октябре." to "https://picsum.photos/id/1043/400/200",
        "Жители жалуются на рост цен на продукты." to "https://picsum.photos/id/1020/400/200",
        "В метро установили новые системы безопасности." to "https://picsum.photos/id/1033/400/200",
        "Рынок криптовалюты переживает резкое падение курсов." to "https://picsum.photos/id/1062/400/200",
        "В Казахстане запустили первую частную ракету." to "https://picsum.photos/id/1008/400/200",
        "Билан опроверг слухи о своей смерти разместив свежие фото" to "https://picsum.photos/id/1019/400/200",
        "На границе открыли современный логистический центр." to "https://picsum.photos/id/1048/400/200",
        "Водители пожаловались на рост штрафов за парковку." to "https://picsum.photos/id/1052/400/200",
        "Новый фильм собрал рекордные кассовые сборы." to "https://picsum.photos/id/1069/400/200",
        "В зоопарке родился редкий белый тигр." to "https://picsum.photos/id/1024/400/200",
        "В столице построят крупнейший спортивный комплекс." to "https://picsum.photos/id/1049/400/200",
        "Сегодня похороны Димы Билана. Болезнь унесла певца. Усталость виновна в случившимся. Смотрите фото." to "https://picsum.photos/id/1070/400/200",
        "Учёные разработали нанороботов для лечения сосудов." to "https://picsum.photos/id/1066/400/200"
    )

    private var likes = MutableList(posts.size) { false }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // у тебя уже есть layout с RecyclerView

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        if (savedInstanceState != null) {
            likes = savedInstanceState.getBooleanArray("likes")?.toMutableList() ?: likes
        }

        adapter = NewsFeedAdapter(posts, likes)
        recyclerView.adapter = adapter
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putBooleanArray("likes", likes.toBooleanArray())
    }
}
