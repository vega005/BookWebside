package com.example.ProjektJava.ProjektJava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Library {

    private BookRepository bookRepository;


    @Autowired
    public Library(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @EventListener(ApplicationReadyEvent.class)
    private void run() {

        Book book1 = new Book("Sztorm stulecia", "Stephen King", "9788380972322", BookType.HORROR,
                "Little Tall, mała wyspa u wybrzeży stanu Maine, przygotowuje się do nadejścia zimowej burzy, " +
                        "którą meteorologowie zapowiadają jako sztorm stulecia. Wraz z pierwszymi płatkami śniegu na " +
                        "wyspie zjawia się Andre Linoge.");
        bookRepository.save(book1);


        Book book2 = new Book("Wiedźmin", "Andrzej Sapkowski", "9788375780635", BookType.FANTASY,
                "Wiedźmin – jeden z najpopularniejszych polskich bohaterów fantasy zaprasza w niezwykłą podróż " +
                        "po Królestwie Północy, w którym świat rządzi się zupełnie innymi prawami, a za każdym rogiem " +
                        "czają się niebezpieczne przygody i magiczne stwory.");
        bookRepository.save(book2);


        Book book3 = new Book();
        book3.setTitle("Romeo i Julia");
        book3.setAuthor("William Shakespeare");
        book3.setIbsn("9788366325876");
        book3.setBookType(BookType.DRAMA);
        book3.setDescription("Dramat angielskiego pisarza Williama Szekspira napisany we wczesnym stadium jego kariery. " +
                "Przedstawia historię tragicznej miłości dwojga młodych ludzi, którzy stali się wzorcami romantycznych " +
                "kochanków.");
        bookRepository.save(book3);


        Book book4 = new Book();
        book4.setTitle("Kod Leonarda da Vinci");
        book4.setAuthor("Dan Brown");
        book4.setIbsn("9788366512474");
        book4.setBookType(BookType.MYSTERY);
        book4.setDescription("Jacques Saunière, kustosz Luwru, zostaje zamordowany. Francuska policja o pomoc w śledztwie " +
                "zwraca się do Roberta Langdona, specjalisty od symboli. Okazuje się, że na miejscu zbrodni znajduje się " +
                "wiele śladów, które mogą pomóc w ustaleniu zabójcy, ale też stanowią klucz do jeszcze większej zagadki − " +
                "niezwykłej tajemnicy sięgającej korzeniami początków chrześcijaństwa.");
        bookRepository.save(book4);


        Book book5 = new Book("Ostatnia piosenka", "Nicholas Sparks", "9788379856800", BookType.POETRY,
                "Zbuntowana siedemnastolatka, Ronnie, zostaje zmuszona do spędzenia wakacji w domu ojca, w " +
                        "odludnym nadmorskim miasteczku w Karolinie Północnej. To dla niej ciężka próba: nadal czuje żal " +
                        "do ojca po tym, ja trzy lata wcześniej opuścił rodzinę. Czy będą to najgorsze wakacje w życiu " +
                        "Ronnie?");
        bookRepository.save(book5);


        Book book6 = new Book("Władca Pierścieni Drużyna Pierścienia", "J.R.R.Tolkien", "9788328700789",
                BookType.FANTASY, "Akcja ksiązki toczy się w Śródziemiu - świecie fantasy zamieszkanym przez różne " +
                "rasy (np. elfy, orków i ludzi). Jest to uniwersum targane niepokojami, ponieważ po latach względnego " +
                "spokoju do głosu dochodzi złowrogi Sauron, który pragnie odzyskać utraconą moc. Kluczem do tego jest " +
                "magiczny pierścień, który trafia w ręce niepozornego hobbita z krainy Shire - Frodo Bagginsa.");
        bookRepository.save(book6);


        Book book7 = new Book();
        book7.setTitle("Outsider");
        book7.setAuthor("Stephen King");
        book7.setIbsn("9788381690805");
        book7.setBookType(BookType.HORROR);
        book7.setDescription("Wydaje się, że wszystko jest jasne. Wiadomo kto zabił, są na to dowody, ślady, świadkowie. " +
                "Sprawa wygląda na taką, która oczywiście poraża swoim okrucieństwem, ale nie będzie sprawiała większych " +
                "problemów. Czy na pewno? \"Outsider\" to wciągająca powieść Stephena Kinga, mistrza grozy i niepokoju!");
        bookRepository.save(book7);

    }
}
