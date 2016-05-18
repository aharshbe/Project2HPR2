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
        values.put(COL_PAGES, "223 pages");
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
        values.put(COL_FAV_CHAR, "Dobby");
        values.put(COL_TOPQUOTE, "It is our choices, Harry, that show what we truly are, far more than our abilities.");
        values.put(COL_PAGES, "251 pages");
        db.insert(BOOKS_TABLE_NAME, null, values);
        //Book 3
        values = new ContentValues();
        values.put(COL_PLOT, "Forced to spend the summer of his thirteenth birthday stuck with the Dursleys on Privet Drive, Harry Potter is counting down the days until he can return to Hogwarts. After accidentally causing his horrible Aunt Marge to inflate like a balloon one evening near the end of term, Harry flees Privet Drive and rents a room at The Leaky Cauldron for the remainder of the holiday. The night before boarding the Hogwarts Express with friends Ron and Hermione, Harry learns that an infamous dark wizard, Sirius Black, has escaped from Azkaban (a wizard’s prison) in order to find and murder Harry.\n" +
                "\n" +
                "Harry’s third year gets off to a rough start. Professor Trelawney, the divination teacher, routinely predicts Harry’s early death to the class. Hagrid, recently appointed to teach Care of Magical Creatures, runs into trouble with the ministry after Draco Malfoy reports that Hagrid’s hippogriff, Buckbeak, is rogue and dangerous. The presence of dementors–Azkaban guards who feed on human emotion–surrounding the school for security only make Harry feel worse. Dementors have an unusual effect on Harry, triggering vivid recollections of his parents’ deaths. When the dementors storm the Quidditch Pitch and cause Harry to lose a match for Gryffindor, he persuades new Defense Against the Dark Arts teacher, Remus Lupin, to give him “anti-dementor lessons.” Lupin begins to teach Harry a patronus charm which chases off dementors with happiness. Harry finds it difficult to cast the Patronus charm and continues to hear his mother’s voice whenever a dementor approaches.\n" +
                "\n" +
                "Sirius Black is spotted at Hogwarts twice over the course of the school year, but is never caught. Harry also begins to spot a large black dog periodically, which Trelawney believes is sign of Harry’s impending death. Midway through the term, Harry discovers that Sirius Black was James Potter’s best friend, Harry’s godfather, and the wizard responsible for betraying the Potters to to Lord Voldemort. Professor Lupin confirms this disturbing detail and admits to knowing both James Potter and Sirius Black during his youth.\n" +
                "\n" +
                "As the end of term approaches, Harry learns that Hagrid’s hippogriff, Buckbeak, has been sentenced to death. Harry, Ron and Hermione decide to go to Hagrid’s hut to be with him during Buckbeak’s execution, even though it’s against the rules to venture off into the school grounds at night. Hagrid tries to save the trio from getting into trouble by pushing them out his back door as the executioner arrives. The large black dog appears and drags Ron into a secret tunnel beneath the Whomping Willow tree, which leads to an abandoned house called The Shrieking Shack in Hogsmeade. Harry and Hermione follow and discover a murderous Sirius Black waiting for them.\n" +
                "\n" +
                "Black explains that he is an animagus with the ability to transform into a dog. He also reveals that he is not after Harry, but Ron’s rat scabbers who is also an animagus named Peter Pettigrew. The trio don’t believe him at first, but Lupin turns up in the Shrieking Shack and the two force Pettigrew to transform out of his rat shape. Lupin and Black tell Harry that it was Pettigrew, not Black, who betrayed Harry’s parents to Lord Voldemort. Lupin also confirms Hermione’s suspicion that he is a werewolf and that Harry’s father, Sirius Black, and Pettigrew learned to become animaguses to accompany Lupin during his monthly transformations. Although Lupin and Black want to kill Pettigrew to avenge James and Lily, Harry intervenes. They decide to take Pettigrew up to the school to clear Black’s name, but Pettigrew escapes when Lupin transforms into his wolf shape after exposure to the full moon. Dementors swarm Harry and Sirius and, as Harry faints, he sees someone who looks like his father cast a Patronus charm that drives the dementors away.\n" +
                "\n" +
                "Harry awakens in the hospital wing with Hermione and an unconscious Ron. He learns that Black is being imprisoned in the school and about to be administered a “dementor’s kiss” which will remove his soul from his body. Dumbledore, who believes that Black is innocent, suggests that Harry and Hermione use Hermione’s time turner, which she secretly used to take an overloaded course schedule all year, to go back in time and save Sirius. Harry and Hermione turn the time turner and manage to save Buckbeak from execution without being seen. While waiting to save Sirius, Harry realizes that it was his patronus that saved his past self. He casts the charm which drives away the dementors and flies Buckbeak up to the tower where Black is being held prisoner. Black escapes with Buckbeak and goes into hiding. Harry returns to Privet Drive for the summer, but remains in correspondence with Sirius.");
        values.put(COL_TITLE, "Harry Potter and the Prisoner of Azkaban");
        values.put(COL_COVER, "book3");
        values.put(COL_DATE, "July 8, 1999");
        values.put(COL_FAV_CHAR, "Serius Black");
        values.put(COL_TOPQUOTE, "Mr. Moony presents his compliments to Professor Snape, and begs him to keep his abnormally large nose out of other people's business.\n" +
                "Mr. Prongs agrees with Mr. Moony, and would like to add that Professor Snape is an ugly git.\n" +
                "Mr. Padfoot would like to register his astonishment that an idiot like that ever became a professor.\n" +
                "Mr. Wormtail bids Professor Snape good day, and advises him to wash his hair, the slimeball.");
        values.put(COL_PAGES, "317 pages");
        db.insert(BOOKS_TABLE_NAME, null, values);
        //Book 4
        values = new ContentValues();
        values.put(COL_PLOT, "The book that could legitimately be called the turning point of the series is packed with action, backstory and significant darkness. It begins in the village of Little Hangleton, where Lord Voldemort and his servant Peter Pettigrew are in hiding. We hear that Voldemort is planning to return to power, and that he wants to kill Harry Potter. Harry sees this scene through a dream, and on his awakening, we find him having another miserable summer with the Dursleys in Privet Drive. However, he is saved by the Weasleys, who come to take Harry back to The Burrow so that he can attend the Quidditch World Cup with them. Their visit causes mayhem in the Dursley household, leaving Dudley even more terrified of wizards.\n" +
                "\n" +
                "The Weasleys, Harry and Hermione take a Portkey to the World Cup, but on the night after the game a group of Death Eaters reunite and start to terrorize Muggles. Death Eaters were Voldemort’s followers, but unbeknownst to them, a truly loyal Death Eater is among them: one who went to Azkaban rather than renounce his allegiance, and who shoots the Dark Mark (a sign used to signal death) into the sky to scare them. Harry, Hermione and the Weasleys all return to Hogwarts, and it is announced that a Triwizard Tournament will be held at Hogwarts this year. This is a centuries-old tournament in which three seventeen-year-old witches or wizards battle through various obstacles to win eternal glory. Students from two other wizarding schools, Beauxbatons and Durmstrang, arrive and the competing Champions are chosen from the Goblet of Fire. However, along with the Hogwarts Champion Cedric Diggory, Harry’s name inexplicably comes out too. He has no choice but to compete.\n" +
                "\n" +
                "Ron believes Harry entered his name on purpose, and succumbs to jealousy, feeling that he is overshadowed by both his friends and his family. Meanwhile, the conniving journalist Rita Skeeter has taken an interest in Harry, and writes many articles that tarnish his reputation. Hagrid shows Harry that he will have to face dragons in the first task. The new Defence Against the Dark Arts teacher, Mad-Eye Moody, advises Harry to play to his strengths, suggesting that he should fly on a broomstick to get past the dragon. Harry does so, and manages to complete the first task. After it, he and Ron reconcile. It is then announced that on Christmas day a Yule Ball will be held in honour of the Triwizard Tournament, and Harry asks Cho Chang to accompany him. She must refuse him as she is already going with Cedric, and although Harry is upset, he does manage to get Parvati Patil to go with him instead. It is revealed at the ball that Hermione is going with Viktor Krum, the Durmstrang Champion and internationally-famous Quidditch player. Ron is exceedingly jealous. The second task is set in the lake in the grounds of Hogwarts, and Harry must dive into its depths to save Ron. He successfully completes the task with a little help from Dobby the house-elf.\n" +
                "\n" +
                "In the summer, Harry competes in the third and final task. It is a maze filled with beasts and charms that the Champions have to battle through, but in the end he and Cedric get to the Triwizard Cup at the same time. They take it together, but it turns out that the Cup is a Portkey, and the two are transported to a graveyard. Cedric gets killed by Peter Pettigrew, who is lying in wait for them along with Lord Voldemort. Using some of Harry’s blood, Pettigrew brings Voldemort back to life, and Voldemort and Harry battle each other in a deadly duel. Harry manages to escape with Cedric’s body and returns to Hogwarts injured and devastated. He is taken by Mad-Eye Moody, who reveals that he is in fact the faithful Death Eater from the Quidditch World Cup, Barty Crouch Junior. He put Harry’s name into the Goblet of Fire, and has been making sure Harry got through the tasks and got to the Cup first so that he would be taken to Voldemort. Dumbledore arrives and takes Harry away, leaving Crouch to the care of some Dementors. Harry is broken after the death of Cedric and the knowledge that Voldemort is back. He leaves Hogwarts worried about the future, scared about what might happen, and frustrated that so few people actually believe his story.");
        values.put(COL_TITLE, "Harry Potter and the Goblet of Fire");
        values.put(COL_COVER, "book4");
        values.put(COL_DATE, "July 8, 2000");
        values.put(COL_FAV_CHAR, "Cedric Diggory");
        values.put(COL_TOPQUOTE, "Remember, if the time should come when you have to make a choice between what is right and what is easy, remember what happened to a boy who was good, and kind, and brave, because he strayed across the path of Lord Voldemort. Remember Cedric Diggory.");
        values.put(COL_PAGES, "636 pages");
        db.insert(BOOKS_TABLE_NAME, null, values);
        //Book 5
        values = new ContentValues();
        values.put(COL_PLOT, "Harry is stuck at Privet Drive with the Dursleys’ for his summer break with no contact from the wizarding world. He has resorted to stealing newspapers out of trashcans and sneaking around listening to the news to find out Voldemort’s plans. After getting into an argument with his uncle, he goes for a walk to a nearby park and sees Dudley. The two are then attacked by dementors, but Harry is able to rescue them both by using the Patronus Charm. Mrs. Figg, the Dursley’s neighbor, reveals that she is a Squib and has been tasked with looking after Harry on Dumbledore’s orders.\n" +
                "\n" +
                "After returning to Privet Drive, Harry receives a letter from the Ministry of Magic stating that he has been expelled from Hogwarts for performing magic in the presence of a Muggle. Dumbledore contacts the Ministry telling them they don’t have the authority to expel students. The Ministry then sends Harry a revised letter telling him that he’s suspended from school and must attend a disciplinary hearing. Harry then explains to the Dursleys what happened that night and that Voldemort has returned. This sends Uncle Vernon into a rage and he tells Harry that he has to leave the house. Petunia receives an anonymous Howler that says, “Remember my last, Petunia.” She tells the family that Harry had to stay.\n" +
                "\n" +
                "Nearly a week later, the Dursleys leave Harry at home to attend a (staged) awards ceremony for London’s best kept suburban lawns. While they are away, Mad Eye Moody and other members of the “Advance Guard” come to take Harry from Privet Drive. They arrive at 12 Grimmauld Plave, which is the headquarters of the Order of the Phoenix.");
        values.put(COL_TITLE, "Harry Potter and the Order of the Phoenix");
        values.put(COL_COVER, "book5");
        values.put(COL_DATE, "June 21, 2003");
        values.put(COL_FAV_CHAR, "Dolores Umbridge");
        values.put(COL_TOPQUOTE, "We won't be seeing you,' Fred told Professor Umbridge, swinging his leg over his broomstick.\n" +
                "\n" +
                "'Yeah, don't bother to keep in touch,' said George, mounting his own. \n" +
                "\n" +
                "Fred looked around at the assembled students, and at the silent, watchful crowd. 'If anyone fancies buying a Portable Swamp, as demonstrated upstairs, come to number ninety-three, Diagon Alley — Weasleys' Wizard Wheezes,' he said in a loud voice, 'Our new premises!'\n" +
                "\n" +
                "'Special discounts to Hogwarts students who swear they're going to use our products to get rid of this old bat,' added George, pointing at Professor Umbridge.\n" +
                "\n" +
                "'STOP THEM!' shrieked Umbridge, but it was too late. As the Inquisitorial Squad closed in, Fred and George kicked off from the floor, shooting fifteen feet into the air, the iron peg swinging dangerously below. Fred looked across the hall at the poltergeist bobbing on his level above the crowd.\n" +
                "\n" +
                "'Give her hell from us, Peeves.'\n" +
                "\n" +
                "And Peeves, who Harry had never seen take an order from a student before, swept his belled hat from his head and sprang to a salute as Fred and George wheeled about to tumultuous applause from the students below and sped out of the open front doors into the glorious sunset.");
        values.put(COL_PAGES, "766 pages");
        db.insert(BOOKS_TABLE_NAME, null, values);
        //Book 6
        values = new ContentValues();
        values.put(COL_PLOT, "Harry Potter and the Half-Blood Prince immediately highlights how dark and dangerous the times are. A visit to the Muggle Prime Minister’s office, where the newly-sacked Cornelius Fudge informs him of the rise of Lord Voldemort shows how the effects of his return are spreading. Narcissa Malfoy visits Severus Snape, begging him to protect her son Draco from the wrath of Voldemort: Draco has been given a task, and she knows that for him to fail would mean certain death. Snape makes an Unbreakable Vow agreeing to help Draco. Meanwhile, Dumbledore comes to Privet Drive, announcing that Sirius left Grimmauld Place to Harry in his will, then taking him to meet Horace Slughorn, a former Hogwarts Potions Master. Together, they convince Slughorn to return to Hogwarts, no doubt lured by Harry’s fame.\n" +
                "\n" +
                "As classes start, Harry finds he excels in Potions because of a book which has another student’s instructions scribbled in it. It is said to be the property of the Half-Blood Prince. Dumbledore gives Harry some private lessons, in which the two delve into memories pertaining to the younger Lord Voldemort. They see his family on his mother’s side, and him as an eleven-year-old at a Muggle Orphanage. Viewing the memories is an attempt to find his weakness. On a trip to Hogsmeade, Quidditch player Katie Bell is accidentally cursed by a necklace. Harry thinks Malfoy is behind it. Meanwhile, he is gradually realising feelings for Ginny, and Ron starts going out with Lavender Brown – much to Hermione’s devastation.\n" +
                "\n" +
                "Dumbledore shows Harry another memory: a memory from Slughorn which has been tampered with. It shows a sixteen-year-old Tom Riddle asking about Horcruxes, but gives no further information. Dumbledore asks Harry to try and obtain the real memory, which he eventually gets from Slughorn by using a potion that gives the drinker good luck. After watching this memory, Dumbledore guesses that Voldemort made seven Horcruxes: objects that contain pieces of someone’s soul. Meanwhile, on Ron’s birthday, he is given a drink which is laced with poison and nearly dies. Harry again suspects Malfoy.\n" +
                "\n" +
                "Dumbledore takes Harry to a cave which he suspects contains one of Voldemort’s Horcruxes. They work through the dark magic that guards the place and obtain it, seriously weakening Dumbledore in the process. On their return to Hogwarts they see a Dark Mark hovering above the castle, and race back to find the school awash with Death Eaters, and Draco Malfoy waiting for them. Harry is hidden under his Invisibility Cloak, and watches in horror as Snape comes out onto the Astronomy Tower and does what Draco could not: he kills Dumbledore. Snape then reveals that he is the Half-Blood Prince. At the funeral, Harry tells Ron, Hermione and Ginny, now his girlfriend, that he won’t return to Hogwarts next year, that he has to find and destroy the final Horcruxes. Ron and Hermione insist that they will accompany him wherever he goes.");
        values.put(COL_TITLE, "Harry Potter and the Half-Blood Prince");
        values.put(COL_COVER, "book6");
        values.put(COL_DATE, "July 16, 2005");
        values.put(COL_FAV_CHAR, "Horace Slughorn");
        values.put(COL_TOPQUOTE, "And Harry saw very clearly as he sat there under the hot sun how people who cared about him had stood in front of him one by one, his mother, his father, his godfather, and finally Dumbledore, all determined to protect him; but now that was over. He could not let anybody else stand between him and Voldemort; he must abandon forever the illusion he ought to have lost at the age of one, that the shelter of a parent’s arms meant that nothing could hurt him. There was no waking from this nightmare, no comforting whisper in the dark that he was safe really, that it was all in his imagination; the last and greatest of his protectors had died, and he was more alone than he had ever been.");
        values.put(COL_PAGES, "607 pages");
        db.insert(BOOKS_TABLE_NAME, null, values);
        //Book 7
        values = new ContentValues();
        values.put(COL_PLOT, "With Albus Dumbledore dead and the ministry weakened, Lord Voldemort’s power continues to grow over both the muggle and wizarding world. Harry leaves Privet Drive for the final time as the charm that offers Harry protection in the Dursleys’ home breaks. He escapes to The Burrow, which has become the temporary headquarters of the Order of the Phoenix. While Harry and the Weasley family are busy preparing for Bill and Fleur’s upcoming wedding, they receive a visit from the Minister for Magic, Rufus Scrimgeour. The minister reads portions of Albus Dumbledore’s will to Harry, Ron and Hermione, which reveals the unusual items left for each of them. Ron receives a deluminator (a device for capturing and releasing light) and Hermione receives a children’s book called The Tales of Beedle the Bard. Dumbledore leaves Harry the golden snitch Harry caught at his first quidditch match, as well as the sword of Godric Gryffindor. Scrimgeour reluctantly gives Harry the snitch, but claims that the sword belongs to Hogwarts and was not Dumbledore’s to give away.\n" +
                "\n" +
                "Bill and Fleur’s wedding reception is interrupted by news that the ministry has fallen into Voldemort’s hands. Harry, Ron and Hermione barely manage to disapparate as Death Eaters storm the wedding tent. After narrowly escaping two Death Eaters who manage to track them down on a muggle street, the trio take refuge at 12 Grimmauld Place. There, they learn that Sirius’ brother, Regulus Black, stole the real locket Horcrux and that it is now in the hands of Dolores Umbridge. The trio manages to sneak into the Ministry and steal the locket before retreating into the woods. Unable to destroy the Horcrux without the sword of Gryffindor, its presence brings out a dark side in Ron who leaves his friends in frustration. On Christmas Eve, Harry and Hermione visit Godric’s Hollow, the village where Voldemort murdered Harry’s parents, in the hopes of discovering another Horcrux. There, they are attacked by Voldemort’s snake, Nagini. Harry and Hermione narrowly escape before Voldemort arrives.\n" +
                "\n" +
                "Dismayed at the fruitlessness of their attempts to uncover and destroy more Horcruxes, Harry and Hermione make camp in the Forest of Dean. In the middle of the night, a ghostly silver doe leads Harry to the sword of Gryffindor, which is hidden beneath the surface of a frozen pond. Harry jumps into the pond to retrieve the sword, but is nearly suffocated by the locket Horcrux. Ron saves Harry and destroys the Horcrux using the sword. Back in their tent, Ron apologizes to Harry and Hermione for leaving and explains how his deluminator helped him find his way back.\n" +
                "\n" +
                "Curious about a mysterious symbol that keeps appearing in their horcrux search, the Trio visit Xenophilius Lovegood who explains that the symbol represents the legend of the Deathly Hallows: the Elder Wand, the Ressurection Stone, and a special invisibility cloak. When united, the objects are rumored to make one the master of death. Through his visions, Harry sees that Voldemort is hunting (and eventually uncovers), the Elder Wand, which previously belonged to Albus Dumbledore. After their visit to the Lovegoods’, Harry, Ron and Hermione are captured and taken to Malfoy manor. There, they are imprisoned with several others, including the wandmaker Ollivander and a goblin, Griphook. Dobby the house elf manages to help them escape to Bill and Fleur’s home, Shell Cottage, but is killed in the process. With Griphook’s help, the Trio breaks into Gringotts and retrieves another Horcrux, a cup once owned by Helga Hufflepuff. They are discovered, but escape on the back of a dragon.\n" +
                "\n" +
                "Harry sees a vision and knows that another Horcrux is at Hogwarts -a diadem made by Rowena Ravenclaw. Dumbledore’s brother, Aberforth, helps the trio sneak into the school and Ron and Hermione venture to the Chamber of Secrets to destroy Hufflepuff’s cup with basilisk fangs while Harry searches for Ravenclaw’s diadem. The trio find the diadem in the Room of Requirement, but are cornered by Malfoy, Crabbe and Goyle. Crabbe tries to kill the trio with Fiendfyre, but ends up destroying the Horcrux–and himself–in the blaze while the others escape. Students, teachers and even house elves defend Hogwarts as it is attacked by Death Eaters. Voldemort believes that Snape is preventing him from becoming master of the Elder Wand and kills the professor in the Shrieking Shack. In Snape’s last moments, he gives Harry a memory which Harry takes to the pensieve in the headmaster’s office. The memory reveals that Snape was in love with Lily Potter and had been secretly protecting Harry ever since Lily’s death. Harry also discovers that he became one of Voldemort’s horcruxes when the Dark Lord tried to kill him as a baby, and that he must sacrifice himself for Voldemort to be destroyed for good.\n" +
                "\n" +
                "Harry walks through the Forbidden Forest to Voldemort’s encampment, prepared to die. Voldemort casts the killing curse and Harry falls to the ground. He wakes up in a place that resembles a clean, empty King’s Cross station. There, Albus Dumbledore greets him and explains that Harry is not yet entirely dead because he is linked to the living Voldemort through his blood. Instead, Voldemort has only destroyed the piece of his own soul that lived in Harry. Harry finds himself back in the Forbidden Forest and pretends to be dead while Voldemort brings his body back to Hogwarts to announce victory. Neville refuses to accept Voldemort’s triumph and kills Nagini, the last remaining Horcrux, with the sword of Gryffindor. Harry springs from the ground and tells Voldemort that it is he who is the master of the Elder Wand, because he disarmed Draco (who had previously disarmed Dumbledore, at Malfoy Manor). Voldemort casts a killing curse as Harry disarms him. Since Harry is the true master of the wand, the killing curse backfires leaving Voldemort dead once and for all.\n" +
                "\n" +
                "Seventeen years later, Harry and his wife Ginny bring their children to King’s Cross Station to board the Hogwarts Express. Their younger son, Albus Severus, expresses concern that he might be sorted into Slytherin. Harry assures him that there is no shame to being in Slytherin. Hermione and Ron’s two children, Rose and Hugo, also board the train with their cousins. The epilogue closes with the assurance that, for Harry, “all was well.”");
        values.put(COL_TITLE, "Harry Potter and the Deathly Hallows");
        values.put(COL_COVER, "book7");
        values.put(COL_DATE, "July 21, 2007");
        values.put(COL_FAV_CHAR, "Severus Snape");
        values.put(COL_TOPQUOTE, "“Albus Severus,\" Harry said quietly, so that nobody but Ginny could hear, and she was tactful enough to pretend to be waving to Rose, who was now on the train, \"you were named for two headmasters of Hogwarts. One of them was a Slytherin and he was probably the bravest man I ever knew.” ");
        values.put(COL_PAGES, "607 pages");
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
