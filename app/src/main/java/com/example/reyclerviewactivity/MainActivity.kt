package com.example.reyclerviewactivity

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.reyclerviewactivity.R.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        val recyclerview:RecyclerView= findViewById(id.rec)

        val adapter = articleadapter(getArticles())
        recyclerview.adapter=adapter

        val manager= LinearLayoutManager(this)
        recyclerview.layoutManager= manager

    }

    fun getArticles(): List<article> {
        val articles = ArrayList<article>()

        articles.add(article("4.3","2000","The Great Gatsby", "Set in the summer of 1922, the novel follows the life of a young and mysterious millionaire, his extravagant lifestyle in Long Island, and his obsessive love for a beautiful former debutante. As the story unfolds, the millionaire's dark secrets and the corrupt reality of the American dream during the Jazz Age are revealed. The narrative is a critique of the hedonistic excess and moral decay of the era, ultimately leading to tragic consequences.",  "1922","PKR 2,000",R.drawable.thegreatgatsby,"300","F. Scott Fitzgerald",R.drawable.userimage,"10 x 40"))
        articles.add(article("4.1","10000","In Search of Lost Time", "This renowned novel is a sweeping exploration of memory, love, art, and the passage of time, told through the narrator's recollections of his childhood and experiences into adulthood in the late 19th and early 20th century aristocratic France. The narrative is notable for its lengthy and intricate involuntary memory episodes, the most famous being the madeleine episode. It explores the themes of time, space and memory, but also raises questions about the nature of art and literature, and the complex relationships between love, sexuality, and possession.",  "1913","PKR 2,720",R.drawable.insearchoflosttime,"300","Marcel Proust",R.drawable.userimage,"10 x 40"))
        articles.add(article("5.0","5000","Ulysses", "Set in Dublin, the novel follows a day in the life of Leopold Bloom, an advertising salesman, as he navigates the city. The narrative, heavily influenced by Homer's Odyssey, explores themes of identity, heroism, and the complexities of everyday life. It is renowned for its stream-of-consciousness style and complex structure, making it a challenging but rewarding read.","1922","PKR 2,500",R.drawable.ulysses,"300","James Joyce",R.drawable.userimage,"10 x 40"))
        articles.add(article("4.8","6000","Hundred Years of Solitude", "This novel is a multi-generational saga that focuses on the Buendía family, who founded the fictional town of Macondo. It explores themes of love, loss, family, and the cyclical nature of history. The story is filled with magical realism, blending the supernatural with the ordinary, as it chronicles the family's experiences, including civil war, marriages, births, and deaths. The book is renowned for its narrative style and its exploration of solitude, fate, and the inevitability of repetition in history.","1967","PKR 2,720",R.drawable.onehundredyearsofsolitude,"300","Gabriel García Márquez",R.drawable.userimage,"10 x 40"))
        articles.add(article("4.3","2000","The Catcher in the Rye", "The novel follows the story of a teenager named Holden Caulfield, who has just been expelled from his prep school. The narrative unfolds over the course of three days, during which Holden experiences various forms of alienation and his mental state continues to unravel. He criticizes the adult world as phony and struggles with his own transition into adulthood. The book is a profound exploration of teenage rebellion, alienation, and the loss of innocence.",  "1951","PKR 1,000",R.drawable.thecatcherintherye,"300","J. D. Salinger",R.drawable.userimage,"10 x 40"))
        articles.add(article("4.4","6000","Nineteen Eighty Four", "Set in a dystopian future, the novel presents a society under the total control of a totalitarian regime, led by the omnipresent Big Brother. The protagonist, a low-ranking member of 'the Party', begins to question the regime and falls in love with a woman, an act of rebellion in a world where independent thought, dissent, and love are prohibited. The novel explores themes of surveillance, censorship, and the manipulation of truth.",  "1949","PKR 2,000",R.drawable.nineteeneightyfour,"300","George Orwell",R.drawable.userimage,"10 x 40"))
        articles.add(article("4.2","7000","Wuthering Heights", "This classic novel is a tale of love, revenge and social class set in the Yorkshire moors. It revolves around the intense, complex relationship between Catherine Earnshaw and Heathcliff, an orphan adopted by Catherine's father. Despite their deep affection for each other, Catherine marries Edgar Linton, a wealthy neighbor, leading Heathcliff to seek revenge on the two families. The story unfolds over two generations, reflecting the consequences of their choices and the destructive power of obsessive love.",  "1847","PKR 2,700",R.drawable.wutheringheights,"300","Emily Brontë",R.drawable.userimage,"10 x 40"))
        articles.add(article("4.7","3000","Don Quixote", "This classic novel follows the adventures of a man who, driven mad by reading too many chivalric romances, decides to become a knight-errant and roam the world righting wrongs under the name Don Quixote. Accompanied by his loyal squire, Sancho Panza, he battles windmills he believes to be giants and champions the virtuous lady Dulcinea, who is in reality a simple peasant girl. The book is a richly layered critique of the popular literature of Cervantes' time and a profound exploration of reality and illusion, madness and sanity.",  "1605","PKR 2,720",R.drawable.donquixote,"300","Miguel de Cervantes",R.drawable.userimage,"10 x 40"))
        articles.add(article("4.9","5000","Crime and Punishment", "A young, impoverished former student in Saint Petersburg, Russia, formulates a plan to kill an unscrupulous pawnbroker to redistribute her wealth among the needy. However, after carrying out the act, he is consumed by guilt and paranoia, leading to a psychological battle within himself. As he grapples with his actions, he also navigates complex relationships with a variety of characters, including a virtuous prostitute, his sister, and a relentless detective. The narrative explores themes of morality, redemption, and the psychological impacts of crime.",  "1866","PKR 2,720",R.drawable.crimeandpunishment,"300","Marcel Proust",R.drawable.userimage,"10 x 40"))
        articles.add(article("4.4","1000","Pride and Prejudice", "Set in early 19th-century England, this classic novel revolves around the lives of the Bennet family, particularly the five unmarried daughters. The narrative explores themes of manners, upbringing, morality, education, and marriage within the society of the landed gentry. It follows the romantic entanglements of Elizabeth Bennet, the second eldest daughter, who is intelligent, lively, and quick-witted, and her tumultuous relationship with the proud, wealthy, and seemingly aloof Mr. Darcy. Their story unfolds as they navigate societal expectations, personal misunderstandings, and their own pride and prejudice.",  "1866","$12",R.drawable.prideandprejudice,"300","Jane Austen",R.drawable.userimage,"10 x 40"))
        articles.add(article("4.6","3000","To Kill a Mockingbird", "Set in the racially charged South during the Depression, the novel follows a young girl and her older brother as they navigate their small town's societal norms and prejudices. Their father, a lawyer, is appointed to defend a black man falsely accused of raping a white woman, forcing the children to confront the harsh realities of racism and injustice. The story explores themes of morality, innocence, and the loss of innocence through the eyes of the young protagonists.","1966","PKR 2,720",R.drawable.tokillamockingbird,"300","Harper Lee",R.drawable.userimage,"10 x 40"))
        articles.add(article("4.8","500","War and Peace", "et in the backdrop of the Napoleonic era, the novel presents a panorama of Russian society and its descent into the chaos of war. It follows the interconnected lives of five aristocratic families, their struggles, romances, and personal journeys through the tumultuous period of history. The narrative explores themes of love, war, and the meaning of life, as it weaves together historical events with the personal stories of its characters.","1966","PKR 2,720",R.drawable.warandpeace,"300","Leo Tolstoy",R.drawable.userimage,"10 x 40"))
        articles.add(article("4.6","1000","Madame Bovary", "Madame Bovary is a tragic novel about a young woman, Emma Bovary, who is married to a dull, but kind-hearted doctor. Dissatisfied with her life, she embarks on a series of extramarital affairs and indulges in a luxurious lifestyle in an attempt to escape the banalities and emptiness of provincial life. Her desire for passion and excitement leads her down a path of financial ruin and despair, ultimately resulting in a tragic end.","1966","PKR 2,720",R.drawable.madamebovary,"300","Leo Tolstoy",R.drawable.userimage,"10 x 40"))
        articles.add(article("4.3","900","The Stranger", "The narrative follows a man who, after the death of his mother, falls into a routine of indifference and emotional detachment, leading him to commit an act of violence on a sun-drenched beach. His subsequent trial becomes less about the act itself and more about his inability to conform to societal norms and expectations, ultimately exploring themes of existentialism, absurdism, and the human condition.","1966","PKR 1,500",R.drawable.thestranger,"300","Albert Camus",R.drawable.userimage,"10 x 40"))
        articles.add(article("4.2","4000","The Lord of the Rings", "This epic high-fantasy novel centers around a modest hobbit who is entrusted with the task of destroying a powerful ring that could enable the dark lord to conquer the world. Accompanied by a diverse group of companions, the hobbit embarks on a perilous journey across Middle-earth, battling evil forces and facing numerous challenges. The narrative, rich in mythology and complex themes of good versus evil, friendship, and heroism, has had a profound influence on the fantasy genre.","1966","PKR 2,720",R.drawable.thelordoftherings,"300","J.R.R.Tolkien",R.drawable.userimage,"10 x 40"))







        return articles
    }
}