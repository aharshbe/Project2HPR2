package com.example.austin.harrypotterrev2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by austin on 5/12/16.
 */
public class OpenHelper2 extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "books.db";

    //Creating variables for each of the columns
    public static final String BOOKS_TABLE_NAME = "booksDescription";
    public static final String COL_ID = "_id";
    public static final String COL_COVER = "cover";
    public static final String COL_PLOT = "plot";
    public static final String COL_DATE = "date";
    public static final String COL_PAGES = "pages";
    public static final String COL_TOPQUOTE = "topquote";
    public static final String COL_FAV_CHAR = "char";
    public static final String COL_TITLE = "title";




    public static final String[] BOOKS_COLUMNS = {COL_ID, COL_TITLE, COL_COVER, COL_PLOT, COL_DATE, COL_PAGES, COL_TOPQUOTE, COL_FAV_CHAR};


    private static final String CREATE_BOOKS_TABLE =
            "CREATE TABLE " + BOOKS_TABLE_NAME +
                    "(" +
                    COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    COL_TITLE + " TEXT, " +
                    COL_COVER + " TEXT, " +
                    COL_DATE + " TEXT, " +
                    COL_FAV_CHAR + " TEXT, " +
                    COL_TOPQUOTE + " TEXT, " +
                    COL_PAGES + " TEXT, " +
                    COL_PLOT + " TEXT )";


    private static OpenHelper instance;

    public static OpenHelper getInstance(Context context) {
        if (instance == null) {
            instance = new OpenHelper(context);
        }
        return instance;
    }

    public OpenHelper2(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_BOOKS_TABLE);
        setDefaultData(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + BOOKS_TABLE_NAME);
        this.onCreate(db);
    }

    public void setDefaultData(SQLiteDatabase db) {
        ContentValues values = new ContentValues();

        //Book one
        values.put(COL_PLOT, "Harry Potter is not a normal boy. Raised by his cruel Aunt and Uncle, and tormented by his bully of a cousin, Dudley, he has resigned to a life of neglect. On his eleventh birthday, however, a half-giant called Hagrid comes crashing-–quite literally-–into his life, and announces that Harry is a wizard. Together they journey to London to get school supplies for Harry’s first year at Hogwarts School of Witchcraft and Wizardry. On 1st September Harry takes a train from King’s Cross station, Platform 9 ¾, to Hogwarts school, where he meets Ron Weasley and Hermione Granger. The three are sorted into the same House, Gryffindor, and although Harry and Ron find Hermione bossy and annoying at first, the three soon become best friends.\n" +
                "\n" +
                "After accidentally stumbling into a forbidden corridor and finding a three-headed dog guarding a mysterious trapdoor, the trio attempt to find out what’s concealed within. Some useful slip-ups from Hagrid lead them to research a man called Nicholas Flamel. When Harry uses his father’s Invisibility Cloak to search at night, he happens upon a curious mirror which shows him his dead parents and family. Headmaster Albus Dumbledore reveals to him that this Mirror of Erised shows the beholder their deepest desires, and that what Harry wants most in the world is a family.\n" +
                "\n" +
                "Later in the year, Hagrid obtains a dragon egg, and Harry, Ron and Hermione know that once it has hatched he can’t keep it, because it is illegal. Harry and Hermione arrange to give it away one night, but are caught, along with Harry’s enemy Draco Malfoy and their fellow Gryffindor, Neville Longbottom. The four are given detentions, which they carry out with Hagrid in the Forbidden Forest. Harry and Draco come across a slain Unicorn, and crouching over it is the dark wizard, Lord Voldemort, the man who killed Harry’s parents and who Harry supposedly defeated as a baby.\n" +
                "\n" +
                "Hermione realises that what is hidden behind the trapdoor is the Philosopher’s Stone, which makes the person who possesses it immortal. The three guess that Voldemort wants the Stone, and that the suspicious Professor Snape is helping him. They journey through the many obstacles that lie behind the trapdoor to get to the Stone, but Harry finds that it is Professor Quirrell who was helping Voldemort all along. He manages to defeat Voldemort and save the Stone, but not Quirrell’s life. After Dumbledore explains all to him, Harry leaves Hogwarts at the end of the year, returning to his Aunt and Uncle.");
        values.put(COL_TITLE, "Harry Potter and the Sorcerer’s Stone");
        values.put(COL_COVER, "book1");
        values.put(COL_DATE, "Harry Potter and the Sorcerer’s Stone");
        values.put(COL_FAV_CHAR, "Hagrid");
        values.put(COL_TOPQUOTE, "It takes a great deal of bravery to stand up to our enemies, but just as much to stand up to our friends." + "\n" + "- Professor Dumbledore");
        values.put(COL_PAGES, "223");
        db.insert(BOOKS_TABLE_NAME, null, values);
        //Book 2
        values = new ContentValues();
        values.put(COL_PLOT, "Could things possibly get worse for Harry at the Dursley’s? With Harry home, fresh from his first year at Hogwarts, the Dursley’s fear of magic and anything to do with it has increased tenfold. If it’s not bad enough that all of his magic supplies have been locked in the cupboard under the stairs, he’s banished to his room during his uncle’s business dinner with Mr. and Mrs. Mason when a house elf called Dobby arrives in his room. The little elf tells Harry that “there is a plot to make most terrible things happen” at Hogwarts this year. The elf won’t say much more than that, but he begs Harry not to return to school.\n" +
                "\n" +
                "When Harry refuses this, Dobby heads down to the dinner party and drops Aunt Petunia’s pudding on the floor. After an owl brings a letter of warning to Harry from the Ministry about the use of magic which terrifies Mrs. Mason who has a fear of birds, Harry is locked in his room and served food through a cat flap. Mr. Dursley even goes so far as to put bars on Harry’s window to stop him from escaping or going back to Hogwarts. When Ron and his older brothers, Fred and George, show up in a flying car to rescue him, they pull the bars off his window and sneak his trunk out of the downstairs closet.\n" +
                "\n" +
                "They narrowly escape when Harry’s uncle Vernon is woken by their noise and almost catches Harry. Upon their arrival at the Burrow, however, they don’t manage to escape the wrath of Mrs. Weasley. She swoops down on them like a bird of prey, yelling and screaming at them for flying their father’s car since they could have been spotted. Their father, however, isn’t quite as upset with them.\n" +
                "\n" +
                "Harry greatly enjoys his first stay with a wizarding family. He even takes part in the de-gnoming of the garden. The only part he doesn’t particularly enjoy is the trip to Diagon Alley by Floo Powder. He doesn’t manage out the name very clearly while coughing on the dust of the Floo Powder and ends up in Diagon Alley’s much darker counterpart, Knockturn Alley. Here, he encounters his enemy from school, Draco Malfoy, who is with his father, Lucius, in a Borgin and Burkes, a shop that buys and sells dark objects, where they are pawning off some particularly incriminating items.\n" +
                "\n" +
                "Harry manages to escape the shop without being seen and luckily runs into Hagrid who is in Knockturn Alley looking for Flesh-Eating Slug Repellent. Hagrid leads Harry back to the safety of the Weasley’s in Diagon Alley who have since been joined by the Grangers. On their trip into Flourish and Blott’s, they discover from the man himself that Gilderoy Lockheart will be taking the post of Defense Against the Dark Arts. When Lucius and Draco start bullying Harry, Hermione, and the Weasleys, Lucius and Mr. Weasley get into a fight, knocking over several shelves and sending books toppling to the floor.\n" +
                "\n" +
                "After what one could only call a very eventful summer, Harry and the Weasleys head to King’s Cross Station (after turning around several times for fireworks and Ginny’s diary) on September 1st to make the journey back to Hogwarts. Most unfortunately for Harry and Ron, the gateway through to Platform 9 ¾ seals itself so they can’t get through to board the train. In a desperate attempt to make it to school, the two foolishly steal the flying Ford Anglia and fly it to school where it promptly dies and crashes into the Whomping Willow, a tree that beats anything that gets near it. If Ron’s wand snapping and both boys getting detention for this isn’t bad enough, there are much worse problems on the horizon.\n" +
                "\n" +
                "Not only is Harry being practically stalked by a new first year, Colin Creevey, but he’s also being harassed by Lockheart who seems to think that Harry flew the car to school in attempt to be more in the limelight as Lockheart is, more famous like Lockheart, as if Harry isn’t already more famous than he ever wants to be. He even has to endure the fact that Draco Malfoy is now playing Seeker on the Slythering House Quidditch team and making derogatory comments about Hermione’s parentage.\n" +
                "\n" +
                "Worse still are the voices that Harry begins to hear, talking about ripping, tearing, and killing, killing this time. When Harry, Ron, and Hermione skip the Halloween feast in favour of Nearly-Headless Nick’s Death Day party, they find themselves in the wrong place at the wrong time when Harry follows the mysterious voice to the place where Mrs. Norris, the caretaker’s cat, has been Petrified and a message has been written on the wall in blood: “THE CHAMBER OF SECRETS HAS BEEN OPENED. ENEMIES OF THE HEIR, BEWARE.” The floor is flooded and a line of spiders are fleeing the castle. Mr. Filch is furious, but once it is determined that they at least didn’t Petrify the cat, they are let go.\n" +
                "\n" +
                "The legend of the Chamber of Secrets quickly spreads through the halls of Hogwarts. Everyone knows that the Heir of Slytherin is supposedly the only one who can open the Chamber of Secrets and control the monster that is said to lie within. The question remains, though, who is the Heir of Slytherin? The trio has formed a plan to brew Polyjuice Potion to transform themselves into members of Slytherin House so they can talk to Draco Malfoy, the person they believe to be the real Heir of Slytherin.\n" +
                "\n" +
                "They manage to steal the potion ingredients from Snape and brew the potion in the girls’ lavatory on the second floor which is out of use due to the fact that Moaning Myrtle, a weepy ghost girl haunts it. When Harry’s arm gets broken by a hexed bludger in the Quidditch match against Slytherin, Lockheart tries to ‘fix’ it, but only manages to remove all of the bones from Harry’s right arm. Harry spends a painful night in the Hospital wing while his bones grow back. While there, he is visited once again by Dobby.\n" +
                "\n" +
                "He learns that it was Dobby who sealed the barrier to Platform 9 ¾ and set the bludger after him. Dobby only wants Harry to leave the school, but Harry gets frustrated with the elf. Once Dobby Disapparates, Professors Dumbledore and McGonagall, along with the nurse, Madame Pomfrey, bring in Colin Creevey, Harry’s tiny fan. Colin has been Petrified.\n" +
                "\n" +
                "Things only manage to get worse from there. After Harry calls off a snake in the first meeting of the dueling club by speaking to it in Parseltongue, snake language, when it tries to attack Justin Finch-Fletchly, the entire school seems most certain that it is Harry who is the Heir of Slytherin. It doesn’t help his case that he is the one who finds Justin and Nearly-Headless Nick Petrified in the hall. Luckily, Dumbledore believes that Harry is innocent and once again lets him go.\n" +
                "\n" +
                "On Christmas, the Polyjuice Potion is finally ready. Harry and Ron transform into Crabbe and Goyle, Malfoy’s brutish cronies, but they have to go about the rest of the plan alone because Hermione refuses to go with them. When they finally find the Slytherin Common Room and talk to Malfoy, they learn that Malfoy definitely isn’t the Heir of Slytherin and he doesn’t even know who is. However, he does tell them that he only knows that the Chamber was opened before, fifty years ago, and that the last time it was opened, a “mudblood” died.\n" +
                "\n" +
                "After this, Harry and Ron, who are starting to transform back into themselves, run back to the bathroom on the second floor, only to discover that Hermione accidentally plucked a cat hair off the robes of the Slytherin girl into whom she was supposed to be transforming. As the Polyjuice Potion is only for human transformations, she looks sort of like a cross between Hermione and a cat, complete with ears and a tail. Due to this, she has to spend several weeks in the Hospital wing.\n" +
                "\n" +
                "When someone throws a book at Moaning Myrtle and causes her to overflow the bathroom, Harry and Ron go to investigate. The book turns out to be a diary belonging to someone named T.M. Riddle. Ron recognizes the name from a trophy he had to polish during his detention for the flying car. Tom Marvolo Riddle, as it turns out, attended Hogwarts fifty years previously and received an award for special services to the school.\n" +
                "\n" +
                "Neither boy knows what those services might be, though, and the diary doesn’t prove to be any help at all since it’s completely blank. Valentine’s Day brings with it some good surprises and some that are not so good. The not so good are the “cupids” that Gilderoy Lockheart hired to deliver singing Valentines to Hogwarts students. Of course, they’re not really cupids at all; in actuality, they’re just dwarfs dressed in golden wings and carrying harps. Later in the afternoon, one catches up to Harry in the corridor and he’s absolutely mortified when it tackles him, smashing his ink bottle and splattering his books before serenading him. The only book unscathed is Riddle’s diary. Harry examines it that night and finds that there isn’t a single drop of ink on any of the pages. He drops some ink onto a page and is stunned when it vanishes as though it’s being absorbed into the page.\n" +
                "\n" +
                "He quickly scrawls out an introduction which vanishes too. From the book come words that Harry hadn’t written; the writer is Tom Riddle. Upon Harry’s request, Tom tells him about when the Chamber of Secrets was last open when he was at school and that he can show Harry the night he caught the person responsible. Harry is puzzled at first as he doesn’t know how Riddle expects to show him what happened fifty years ago. The pages fluttered until they reached June thirteenth where the square for the date seemed to have transformed into a miniscule television. Harry is sucked into the pages of the diary and he watches as Tom asks the Hogwarts Headmaster of fifty years ago, Armando Dippet, if he can stay at Hogwarts for the summer instead of returning to his home at the orphanage.\n" +
                "\n" +
                "Professor Dippet says that it is possible that the school may have to close to everyone due to the trouble caused by the chamber and Tom starts to ask about what might happen if it all stopped. He leaves the Headmaster’s office and heads downstairs where he meets a much younger Professor Dumbledore who tells him to go to bed since it’s best not to wander the corridors nowadays. Riddle watches him walk away before he heads off into the dungeons where he finds none other than Hagrid with a giant spider. He tells Hagrid that he has no choice except to turn him in since the spider had killed someone.\n" +
                "\n" +
                "As Hagrid has always had an unnatural love for terrible creatures, it’s not hard for the trio to believe that he could have found the spider and wanted to keep it as his own pet. While Ron thinks Riddle was a prat for turning in Hagrid, Harry and Hermione can’t help but face the facts; the spider had killed someone after all. They come to the decision that if there’s another attack, they’ll confront Hagrid. To make matters worse, someone breaks into Harry’s dormitory and steals Riddle’s diary. On the morning of the Gryffindor vs. Hufflepuff Quidditch match, Harry hears the disembodied voice again for the first time in months.\n" +
                "\n" +
                "He’s thankful that everyone will be out of the castle, but unfortunately, that isn’t the case; the match is cancelled when Hermione and a Ravenclaw prefect are Petrified. This comes as a shock to Harry and Ron, but they follow through on their plan and don Harry’s invisibility cloak to head down to Hagrid’s. Hagrid just begins to explain when Dumbledore and Cornelius Fudge, the Minister of Magic himself, arrive at his cabin to inform Hagrid that he is under arrest on suspicion of reopening the Chamber. Dumbledore makes it clear that Hagrid has his full support. It’s the arrival of Lucius Malfoy that really causes a stir.\n" +
                "\n" +
                "He comes with the news that he and the other school governors have decided that it’s time for Dumbledore’s removal since Dumbledore can’t seem to put a stop to the attacks on students. Hagrid is outraged by this, certain that, with Dumbledore gone, students will be getting killed next. Dumbledore states reassuringly that he will never truly be gone as long as those who remain are loyal to him and that help will always be given at Hogwarts to those who ask for it. Hagrid’s parting words before he is led out are that if anyone should need to know anything, they should follow the spiders and that someone would need to care for his dog, Fang, while he’s away.\n" +
                "\n" +
                "Ron and Harry decide that the next time the see a trail of spiders, they’ll do as Hagrid suggested and follow them. Most unluckily, there doesn’t seem to be a single spider left to follow. When they finally spot a line of spiders heading toward the forest during Herbology one day, they decide that they have to follow them. That night, they set out after them with Fang. Deep in the Forbidden Forest, they find Ron’s dad’s car, turned wild from it’s time in the forest. Suddenly, they’re ambushed by giant spiders and carried deeper into the forest to a hollow where more giant spiders wait.\n" +
                "\n" +
                "Through the clicking of their pincers, the spiders summon their leader, an arachnid the size of a small elephant with milky white eyes: Aragog, the spider that Riddle said had been the monster in the Chamber. Aragog tells them that it wasn’t he who had killed the girl in the bathroom; he had never seen more of Hogwarts than the cupboards in which Hagrid had kept him. He did know what the monster was, but he never told Hagrid because spiders do not speak the name of the creature because it is one they fear above all others. Harry and Ron begin to leave, but Aragog informs them that his children don’t harm Hagrid on his orders. He tells them that won’t deny his children fresh meat, even if they are friends of Hagrid. When the flying car rescues them and gets them out of the forest safely, Ron gets violently sick before asking what even the point of going into the forest was.\n" +
                "\n" +
                "Harry says that at least they know that it wasn’t Hagrid. Once safely back in their dormitory, Harry has a sudden realization. He wakes Ron and asks him if he thinks that the girl who died in the bathroom could still be there, if she could have never left, if she could have been Moaning Myrtle.\n" +
                "\n" +
                "The next day, after an awkward encounter with Ginny and Percy at breakfast, they boys go to the hospital wing with the permission of Professor McGonagall and they find a piece of paper in her hand about a giant snake called the Basilisk that kills by looking people in the eye and causes spiders to flee. It also explains why only Harry can understand it. Ron asks why no one is dead yet and Harry says that it’s because no one did look the Basilisk in the eye: Mrs. Norris saw it in the water on the floor, Collin saw it through his camera lens, Justin saw it through Nearly-Headless Nick, Nick was dead and couldn’t die again, and Hermione and the prefect girl saw it in a mirror that Hermione had had in her hand when she had been found.\n" +
                "\n" +
                "The boys are just on their way to tell Professor McGonagall what they know when they hear the announcement for all students to return to their dormitories. They hide in a cabinet in the staff room and listen in as the staff gathers and Professor McGonagall tells them that a student has been taken into the Chamber by the monster and that the Heir of Slytherin left another message right beneath the first: “HER SKELETON WILL LIE IN THE CHAMBER FOREVER.” The student who has been taken is Ron’s own little sister, Ginny. Snape suggests that Lockheart go after her and Professor Sprout agrees, adding that he had just been saying the night before that he knew all along where the entrance to the Chamber was. Lockheart leaves to get ready. Once he’s gone, the staff decides that this will mean the end of the school.\n" +
                "\n" +
                "After spending the whole day in the Gryffindor Common Room, Harry and Ron go to see Lockheart to tell him what they know since they’re sure that he doesn’t even know where the entrance really is. They find him packing up his office, ready to flee. He admits that he never really did any of the things he says in his books. They manage to threaten him into going with them to Moaning Myrtle’s bathroom where Harry uses Parseltongue to open the Chamber of Secrets. They three dive down the chute into the bowels of Hogwarts. As they make their way along through the piles of animal bones and grime, they come across a giant snake skin. While they’re distracted, Lockheart grabs Ron’s broken wand and attempts to erase their memories. The spell backfires and the roof caves, separating Harry from Ron and a memory-less Lockheart. Harry continues on to find Ginny while Ron works on clearing away the wall of rock.\n" +
                "\n" +
                "Harry finds Ginny in a dimly lit chamber. Harry’s afraid that she might be dead, but Tom Riddle is there and he tells her that she isn’t dead…yet. Harry learns that Tom Marvolo Riddle framed Hagrid and that he isn’t the good prefect he made himself out to be. In reality, Tom Marvolo Riddle is a sixteen-year-old Lord Voldemort. His name is an anagram for “I AM LORD VOLDEMORT.” He tells Harry that the diary in which he had first spoken to Harry had belonged to Ginny before him. Ginny had opened the Chamber of Secrets. Ginny had written on the walls. Ginny had set the Basilisk on students. When she had become afraid of what had been happening and that she couldn’t remember where she had been, she threw the diary away where Harry found it.\n" +
                "\n" +
                "Now, Ginny was about to die and Tom Riddle would be back, very much alive and no one, not even Dumbledore could stop him. Harry defends Dumbledore and Dumbledore’s phoenix, Fawkes, brings Harry the Sorting Hat. When Riddle sends the Basilisk after Harry, Fawkes blinds the Basilisk and from the hat, Harry pulls out a sword with which he slays the Basilisk, but not without injury; the Basilisk’s fang ends up in Harry’s arm and the venom is already working its way into Harry’s system, killing him when Fawkes lands next to him and cries onto the wound, healing it with his tears. Harry then plunges the fang into the diary, killing Riddle.\n" +
                "\n" +
                "Ginny returns to consciousness, ashamed of herself for what she had unknowingly done for Riddle. Together, they leave the chamber and find Ron and Lockheart. Fawkes carries the four of them back up to the castle where they are met by Mr. and Mrs. Weasley and Professor McGonagall who takes them to Dumbledore who has been newly reinstated as Headmaster where they recount the events of the evening. While they may have broken more than fifty school rules, they had saved the school in the process and Dumbledore awards them each a trophy for special services to the school.\n" +
                "\n" +
                "Once everyone else leaves the room, Dumbledore tells Harry that He and Riddle had so many similarities because Voldemort unwittingly transferred some of his powers to Harry when he tried to kill him. Dumbledore shows Harry that the sword he pulled from the hat belonged to Godric Gryffindor and that only a true Gryffindor could have managed that. As Harry starts to leave, Lucius Malfoy enters with his house elf, Dobby.\n" +
                "\n" +
                "Lucius is clearly irate that Dumbledore is back at Hogwarts, but there is nothing he can do. When Dumbledore suggests that Lucius both was the cause for the diary getting into Ginny’s hands in the first place and that he threatened the other governors to get Dumbledore out, Lucius leaves. Harry asks to take the diary and follows Mr. Malfoy down the corridor where he gives the diary to him, saying that it was his and that he slipped it into Ginny’s cauldron in Flourish and Blott’s. Lucius denies it and throws the book to Dobby who opens the book upon Harry’s silent suggestion and finds a sock, freeing him from his terrible master.\n" +
                "\n" +
                "Harry goes down to the feast to celebrate and is very happy to see the return of Hermione and the other victims who have been successfully restored from their Petrified state and Hagrid who has been released from Azkaban prison and cleared of all charges. Nothing causes more celebration, though, than the cancellation of the end of year exams. At least it does for everyone except Hermione who can’t bear the idea of skipping exams.\n" +
                "\n" +
                "The train ride from Hogwarts is a pleasant one full of games of Exploding Snap and even a secret from Ginny about the awkward moment at breakfast before she was taken into the Chamber: she had caught Percy kissing the Ravenclaw prefect girl who had been Petrified and he had thought she was going to tell them. Harry gives Ron and Hermione his phone number and Hermione asks whether his aunt and uncle will be proud of all he’s done this year, but Harry says they’ll be furious that he could have died and didn’t manage as they head back together into the Muggle world.");
        values.put(COL_TITLE, "Harry Potter and the Chamber of Secrets");
        values.put(COL_COVER, "book2");
        values.put(COL_DATE, "Jul 02, 1998");
        values.put(COL_FAV_CHAR, "");
        values.put(COL_TOPQUOTE, "");
        values.put(COL_PAGES, "");
        db.insert(BOOKS_TABLE_NAME, null, values);
        //Book 3
        values = new ContentValues();
        values.put(COL_PLOT, "");
        values.put(COL_COVER, "");
        values.put(COL_DATE, "");
        values.put(COL_FAV_CHAR, "");
        values.put(COL_TOPQUOTE, "");
        values.put(COL_PAGES, "");
        db.insert(BOOKS_TABLE_NAME, null, values);
        //Book 4
        values = new ContentValues();
        values.put(COL_PLOT, "");
        values.put(COL_COVER, "");
        values.put(COL_DATE, "");
        values.put(COL_FAV_CHAR, "");
        values.put(COL_TOPQUOTE, "");
        values.put(COL_PAGES, "");
        db.insert(BOOKS_TABLE_NAME, null, values);
        //Book 5
        values = new ContentValues();
        values.put(COL_PLOT, "");
        values.put(COL_TITLE, "");
        values.put(COL_COVER, "");
        values.put(COL_DATE, "");
        values.put(COL_FAV_CHAR, "");
        values.put(COL_TOPQUOTE, "");
        values.put(COL_PAGES, "");
        db.insert(BOOKS_TABLE_NAME, null, values);
        //Book 6
        values = new ContentValues();
        values.put(COL_PLOT, "");
        values.put(COL_TITLE, "");
        values.put(COL_COVER, "");
        values.put(COL_DATE, "");
        values.put(COL_FAV_CHAR, "");
        values.put(COL_TOPQUOTE, "");
        values.put(COL_PAGES, "");
        db.insert(BOOKS_TABLE_NAME, null, values);
        //Book 7
        values = new ContentValues();
        values.put(COL_PLOT, "");
        values.put(COL_TITLE, "");
        values.put(COL_COVER, "");
        values.put(COL_DATE, "");
        values.put(COL_FAV_CHAR, "");
        values.put(COL_TOPQUOTE, "");
        values.put(COL_PAGES, "");
        db.insert(BOOKS_TABLE_NAME, null, values);
        //Book 8
        values = new ContentValues();
        values.put(COL_PLOT, "");
        values.put(COL_TITLE, "");
        values.put(COL_COVER, "");
        values.put(COL_DATE, "");
        values.put(COL_FAV_CHAR, "");
        values.put(COL_TOPQUOTE, "");
        values.put(COL_PAGES, "");
        db.insert(BOOKS_TABLE_NAME, null, values);

    }

    public Cursor listBooks() {

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(
                BOOKS_TABLE_NAME, // a. table
                new String[]{COL_ID, COL_TITLE, COL_COVER, COL_PLOT, COL_DATE, COL_FAV_CHAR, COL_TOPQUOTE, COL_PAGES}, // b. column names
                null, // c. selections //or // or
                null, // d. selections args
                null, // e. group by
                null, // f. having
                null, // g. order by
                null); // h. limit

        //Just creates a dump so I can reference what is being sourced from the database in the console

        DatabaseUtils.dumpCursor(cursor);

        return cursor;
    }

    public Cursor searchBooks(String query) {

        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(
                BOOKS_TABLE_NAME, // a. table
                BOOKS_COLUMNS, // b. column names
                COL_PLOT + " LIKE ? or " + COL_COVER + " LIKE ? or " + COL_TITLE + " LIKE ? or " + COL_DATE + " LIKE ? or " + COL_FAV_CHAR + " LIKE ? or " + COL_TOPQUOTE + " LIKE ? or " + COL_PAGES + " LIKE ? ", // c. selections //or // or
                new String[]{"%" + query + "%", "%" + query + "%", "%" + query + "%", "%" + query + "%", "%" + query + "%", "%" + query + "%"}, // d. selections args
                null, // e. group by
                null, // f. having
                null, // g. order by
                null); // h. limit

        //Just creates a dump so I can reference what is being sourced from the database in the console

        DatabaseUtils.dumpCursor(cursor);

        return cursor;
    }
}
