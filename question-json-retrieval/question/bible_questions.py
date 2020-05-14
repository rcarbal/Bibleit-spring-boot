from question.book import Book

GENESIS = Book.genesis

MATHEWS = Book.mathews

QUESTION = 'question'
ANSWER = 'answer'
VERSE = 'verse'
NOTE = 'note'
KEYWORDS = 'keywords'

NOT_ANSWERED = 'The answer is not found'
NOT_VERSE = 'Verse NOT FOUND'
NO_REFERENCE = 'NO_VERSE'
NO_QUESTION = 'NO QUESTION'

ANSWERED_QUESTIONS = {
    {
        QUESTION: 'when did God create the heavens and the earth?',
        ANSWER: 'In the beginning everything was created by God.',
        VERSE: '{} 1:1'.format(Book.genesis)
    },
    {
        QUESTION: 'what did God create in the beginning?',
        ANSWER: 'God created all the the heavens and the earth in the beginning.',
        VERSE: '{} 1:1'.format(Book.genesis)
    },
    {
        QUESTION: 'who created everything in the beginning?',
        ANSWER: 'God created everything on earth and above the earth in the beginning.',
        VERSE: '{} 1:1'.format(Book.genesis)
    },
    {
        QUESTION: 'what was the earth like in the beginning?',
        ANSWER: 'The earth was formless and empty.',
        VERSE: '{} 1:2'.format(Book.genesis)
    },
    {
        QUESTION: 'was the Holy Spirit present on earth in the beginning?',
        ANSWER: 'The spirit of God was hovering over the waters before the earth was ordered.',
        VERSE: '{} 1:2'.format(Book.genesis)
    },
    {
        QUESTION: 'how did God create light?',
        ANSWER: 'God spoke light into existence.',
        VERSE: '{} 1:3'.format(Book.genesis)
    },

    # Genesis 1:4 "And God saw that light was good, and he separated the light from the darkness.
    {
        QUESTION: 'how did God perceive light, after he created it?',
        ANSWER: 'God saw it that light was good after he spoke it into existence.',
        VERSE: '{} 1:4'.format(Book.genesis)
    },
    {
        QUESTION: 'where does it say that light is good?',
        ANSWER: 'In Genesis chapter 1, verse 4, it is written that God saw that the light was good after he created it.',
        VERSE: '{} 1:4'.format(Book.genesis)
    },
    {
        QUESTION: 'what did God do on the first day of creation?',
        ANSWER: 'God created light, and separated it from darkness. After evening and morning, the first day was '
                'complete.',
        VERSE: '{} 1:5'.format(Book.genesis)
    },
    {
        QUESTION: 'when did God name light "day" and darkness "night"?',
        ANSWER: 'God named light "day" and darkness "night" on the first day creation, after he created light.',
        VERSE: '{} 1:5'.format(Book.genesis)
    },
    {
        QUESTION: 'when did God create light?',
        ANSWER: 'God created light on the first day of creation.',
        VERSE: '{} 1:5'.format(Book.genesis)
    },
    {
        QUESTION: 'how did God create the skies?',
        ANSWER: 'And God said, "Let there be vault between waters to separate waters from waters,'
                '", so God made a space that is now the atmosphere.',
        VERSE: '{} 1:6'.format(Book.genesis)
    },
    {
        QUESTION: 'did God separate waters that were on top of waters when creating the skies?',
        ANSWER: 'Yes, the bible says that to create the skies God separated the waters and put a vault between them.',
        VERSE: '{} 1:7'.format(Book.genesis)
    },
    {
        QUESTION: 'how do we know that the space God made between the waters was the sky?',
        ANSWER: 'after God created the vault (expanse, space) between the waters above and below he called it sky.',
        VERSE: '{} 1:7-{} 1:8'.format(Book.genesis, Book.genesis)
    },
    {
        QUESTION: 'what day did God create the sky on earth.',
        ANSWER: 'God created the skies on earth on the second day of creation.',
        VERSE: '{} 1:8'.format(Book.genesis)
    },
    {
        QUESTION: 'how did God create the land we walk on?',
        ANSWER: 'On the third day of creation God commanded the waters be gathered to one place, and dry ground '
                'appeared.',
        VERSE: '{} 1:9'.format(Book.genesis)
    },
    {
        QUESTION: 'did God name the land and sea?',
        ANSWER: 'After creating dry ground, God named it "land", and after gathering the waters he called them "seas".',
        VERSE: '{} 1:10'.format(Book.genesis)
    },
    {
        QUESTION: 'how did God create plants and trees?',
        ANSWER: 'God spoke, and commanded the dry land to produce vegetation.',
        VERSE: '{} 1:11'.format(Book.genesis)
    },
    {
        QUESTION: "how did the dry land respond to God's command to produce vegetation?",
        ANSWER: "When God commanded, the dry land responded by producing fruit bearing trees and vegetation that had "
                "seeds.  Creation always responds according to God's will and decrees.",
        VERSE: "{} 1:11-{} 1:12".format(Book.genesis, Book.genesis)
    },
    {
        QUESTION: 'In what day did God create the skies, seas and vegetation?',
        ANSWER: 'God created the skies along with the seas, dry land, and vegetation on the third day of creation.',
        VERSE: '{} 1:9-{} 1:13'.format(Book.genesis, Book.genesis)
    },
    {
        QUESTION: "what was God's command for creating the sun and the moon.",
        ANSWER: "In Genesis chapter 1 verse 14 we find God's command for creating the sun and the moon.",
        VERSE: "{} 1:14".format(Book.genesis)
    },
    {
        QUESTION: "what is the purpose for the sun and moon.",
        ANSWER: "God's purpose for the sun and moon were and still are to bring light over the earth.",
        VERSE: "{} 1:15-{} 1:18".format(Book.genesis, Book.genesis)
    },
    {
        QUESTION: 'did God make the sun, moon and stars?',
        ANSWER: "God made the sun and moon to and stars, each with its purpose, to bring light to day time and night "
                "time. ",
        VERSE: '{} 1:16'.format(Book.genesis)
    },
    {
        QUESTION: 'does God want to separate the light from darkness?',
        ANSWER: "In God's perfect creation, his will is to separate light from darkness.",
        VERSE: '{} 1:18'.format(Book.genesis)
    },
    {
        QUESTION: 'when did God create the sun, moon and stars?',
        ANSWER: "God created the sun, moon and stars on the fourth day.",
        VERSE: '{} 1:14-{} 1:19'.format(Book.genesis, Book.genesis)
    },
    {
        QUESTION: 'what was God command to create fish and birds',
        ANSWER: "God's command to create fish and birds can be found in Genesis chapter 1 verse 20.",
        VERSE: '{} 1:20'.format(Book.genesis)
    },
    {
        QUESTION: "did God create the all the creatures in the sea, and all the creautres that fly?",
        ANSWER: 'On the fifth day of creation God created all animals that live in the sea and all the animals that '
                'fly in the sky.',
        VERSE: "{} 1:21".format(Book.genesis)
    },
    {
        QUESTION: "did God bless the fish and birds?",
        ANSWER: "After creating all the creatures in the sea and all the creatures that fly in the sky he blessed "
                "them.  God commanded them to increase in number to fill the earth and sea.",
        VERSE: "{} 1:23".format(Book.genesis)
    },
    {
        QUESTION: "when did God create all the sea creatures and birds of the sky?",
        ANSWER: "God created all the sea creatures and the birds on the fifth day of creation.",
        VERSE: "{} 1:23".format(Book.genesis)
    },
    {
        QUESTION: "what was God command to create the walk on the ground?",
        ANSWER: 'you can find God\'s command for the land to produce all the creatures that walk in the ground in the '
                'book of Genesis chapter 1 verse 25.',
        VERSE: "{} 1:24".format(Book.genesis)
    },
    {
        QUESTION: 'did God create the animals that walk on the land?',
        ANSWER: "God created all the animals of the land.",
        VERSE: '{} 1:25'.format(Book.genesis)
    },
    {
        QUESTION: 'did God create man according to his image?',
        ANSWER: 'God declared man would be according to his likeness, and image.',
        VERSE: '{} 1:26-{} 1:27, {} 5:1'.format(Book.genesis, Book.genesis, Book.genesis)
    },
    {
        QUESTION: 'did God give mankind authority over all the animals?',
        ANSWER: 'When creating mankind, God declared that they would rule over all fish, bird and animal that walked '
                'in the ground.',
        VERSE: '{} 1:26'.format(Book.genesis)
    },
    {
        QUESTION: 'how many genders did God create for mankind?',
        ANSWER: 'God created two genders for mankind, male and female.',
        VERSE: '{} 1:27, {} 5:1'.format(Book.genesis, Book.genesis)
    },
    {
        QUESTION: 'does God want mankind to populate the earth?',
        ANSWER: 'God commanded mankind to be fruitful, increase in number and populate the earth?',
        VERSE: '{} 1:28, {} 9:1'.format(Book.genesis, GENESIS)
    },
    {
        QUESTION: 'did God intend mankind to rule over all the animals?',
        ANSWER: 'When blessing mankind, God stated mankind should rule over all the animals in the world. He also put '
                'fear and terror of mankind over the animals, and put mankind\'s dominion over the animals of the '
                'earth.',
        VERSE: '{} 1:28, {} 9:2'.format(Book.genesis, GENESIS)
    },
    {
        QUESTION: 'what did God intend mankind to eat?',
        ANSWER: 'God gave all the plants with seeds, and trees with fruit that have seeds as food for mankind. He '
                'also gave all the animals in the earth as food for mankind. ',
        VERSE: '{} 1:29, {} 9:3'.format(Book.genesis, GENESIS)
    },
    {
        QUESTION: 'Should people eat meat?',
        ANSWER: 'God gave all the plants with seeds, and trees with fruit that have seeds as food for mankind. He '
                'also gave all the animals in the earth as food for mankind. But you cannot eat meat that still has '
                'blood in it.',
        VERSE: '{} 1:29, {} 9:3-{} 9:4'.format(Book.genesis, GENESIS, GENESIS)
    },
    {
        QUESTION: 'what did God intend all the animals in the earth to eat?',
        ANSWER: 'God gave all green plant as food for all the animals on earth.',
        VERSE: '{} 1:30'.format(Book.genesis)
    },
    {
        QUESTION: 'when did God create mankind?',
        ANSWER: 'God created mankind on the sixth day of creation.',
        VERSE: '{} 1:26-{} 1:31'.format(Book.genesis, Book.genesis)
    },
    {
        QUESTION: 'when did God create all the animals that walk on land?',
        ANSWER: 'God created all the animals that walk on the ground on the sixth day of creation, along with mankind.',
        VERSE: '{} 1:24-{} 1:25, {} 1:31'.format(Book.genesis, Book.genesis, Book.genesis)
    },

    # Genesis 2
    {
        QUESTION: 'was creation ever completed?',
        ANSWER: 'After the sixth day of creation, it the bible declares that everything was finished.',
        VERSE: '{} 2:1'.format(Book.genesis)
    },
    {
        QUESTION: 'what was completed when God finished creation?',
        ANSWER: 'All the heavens and the earth and all the hosts of them were completed',
        VERSE: '{} 2:1'.format(Book.genesis)
    },
    {
        QUESTION: 'when did God rest after finishing all of creation?',
        ANSWER: 'On the seventh day, good ended his work and rested.',
        VERSE: '{} 2:2'.format(Book.genesis)
    },
    {
        QUESTION: 'how long did it take God to finish everything?',
        ANSWER: 'It took God six days to finish the work of creation.',
        VERSE: '{} 2:2'.format(Book.genesis)
    },
    {
        QUESTION: 'why is the seventh day considered holy?',
        ANSWER: 'The seventh day is holy because God rested from all his work, and he blessed it and made it holy.',
        VERSE: '{} 2:3'.format(Book.genesis)
    },
    {
        QUESTION: 'how was the ground watered before man was created?',
        ANSWER: 'Before God sent rain, the ground was watered by streams that rose from the ground.',
        VERSE: '{} 2:5-{} 2:6'.format(Book.genesis, Book.genesis)
    },
    {
        QUESTION: 'what did God use to form man?',
        ANSWER: 'God used the dust from the ground to form man.',
        VERSE: '{} 2:7'.format(Book.genesis)
    },
    {
        QUESTION: 'how did God form man?',
        ANSWER: 'God took dust from the ground and breathed into his nostrils the breath of life.',
        VERSE: '{} 2:7'.format(Book.genesis)
    },
    {
        QUESTION: 'did God plant a garden in Eden?',
        ANSWER: 'the Lord planted a garden in the east, in Eden.',
        VERSE: '{} 2:8'.format(Book.genesis)
    },
    {
        QUESTION: 'in what direction was the garden of Eden placed?',
        ANSWER: 'the Lord planted the garden of Eden to the east.',
        VERSE: '{} 2:8'.format(Book.genesis)
    },
    {
        QUESTION: 'did God place man in the garden of Eden?',
        ANSWER: 'God placed man in the garden of Eden?',
        VERSE: '{} 2:8'.format(Book.genesis)
    },
    {
        QUESTION: 'what kind of trees did God put in the garden of Eden?',
        ANSWER: 'God made all kinds of beautiful trees in the garden of Eden that were good for food.',
        VERSE: '{} 2:9'.format(Book.genesis)
    },
    {
        QUESTION: 'what was in the middle of the garden of Eden?',
        ANSWER: 'in the middle of the garden God placed the tree of life, and the tree of the knowledge of good and '
                'evil',
        VERSE: '{} 2:9'.format(Book.genesis)
    },

    {
        QUESTION: 'where is the tree of life located?',
        ANSWER: 'The tree of life is located in the middle of the garden of Eden.',
        VERSE: '{} 2:9'.format(Book.genesis)
    },
    {
        QUESTION: 'what is the tree of life?',
        ANSWER: 'the tree of life is one of the two trees God placed in the middle of the garden of Eden.',
        VERSE: '{} 2:9'.format(Book.genesis)
    },
    {
        QUESTION: 'what is the tree of knowledge of good and evil?',
        ANSWER: 'the tree of life is one of the two trees God placed in the middle of the garden of Eden.',
        VERSE: '{} 2:9'.format(Book.genesis)
    },
    {
        QUESTION: 'how was the garden of Eden watered?',
        ANSWER: 'a river flowed from the garden of Eden and watered it.',
        VERSE: '{} 2:10'.format(Book.genesis)
    },
    {
        QUESTION: 'did the river that watered the garden of Eden separate into other rivers?',
        ANSWER: 'the river that watered the garden of Eden separated into four other rivers; they are Pishon, Gihon, '
                'Tigris and Euphrates.',
        VERSE: '{} 2:10-{} 2:14'.format(Book.genesis, Book.genesis)
    },
    {
        QUESTION: 'what is the Pishon river?',
        ANSWER: 'When the river that waters the garden of Eden separates into four main rivers, the first is the '
                'Pishon river.',
        VERSE: '{} 2:11'.format(Book.genesis)
    },
    {
        QUESTION: 'where does the Pishon river travel trough?',
        ANSWER: 'The Pishon river travels through the entire land of Havilah.',
        VERSE: '{} 2:11'.format(Book.genesis)
    },
    {
        QUESTION: 'is there gold iin Havilah?',
        ANSWER: 'The gold in the land of Havilah is good, along with resin and onyx.',
        VERSE: '{} 2:11-{} 2:12'.format(Book.genesis, Book.genesis)
    },
    {
        QUESTION: 'What kind of natural resources are found in Havilah?',
        ANSWER: 'Havilah has gold, resin and onyx of good quality.',
        VERSE: '{} 2:11-{} 2:12'.format(Book.genesis, Book.genesis)
    },
    {
        QUESTION: 'what is the Gihon river?',
        ANSWER: 'When the river that waters the garden of Eden separates into four main rivers, the second is the '
                'Gihon river.',
        VERSE: '{} 2:13'.format(Book.genesis)
    },
    {
        QUESTION: 'where does the Gihon river travel through?',
        ANSWER: 'The Gihon river travels through the entire land of Cush.',
        VERSE: '{} 2:13'.format(Book.genesis)
    },
    {
        QUESTION: 'what is the Tigris river?',
        ANSWER: 'When the river that waters the garden of Eden separates into four main rivers, the third is the '
                'Tigris river.',
        VERSE: '{} 2:14'.format(Book.genesis)
    },
    {
        QUESTION: 'where does the Tigris river travel through?',
        ANSWER: 'The Tigris river travels through the east side of Ashur.',
        VERSE: '{} 2:14'.format(Book.genesis)
    },
    {
        QUESTION: 'What is the Euphrates river?',
        ANSWER: 'When the river that waters the garden of Eden separates into four main rivers, the fourth is the '
                'Euphrates river.',
        VERSE: '{} 2:14'.format(Book.genesis)
    },
    {
        QUESTION: 'Why did God put man in the garden of Eden?',
        ANSWER: 'The Lord put man in the garden of Eden to work it and care for it.',
        VERSE: '{} 2:15'.format(Book.genesis)
    },
    {
        QUESTION: 'what did man eat in the garden of Eden?',
        ANSWER: 'man was free to eat from any tree in the garden, except from the tree of the knowledge of good and '
                'evil. ',
        VERSE: '{} 2:15'.format(Book.genesis)
    },
    {
        QUESTION: 'what was man not allowed to eat in the garden of Eden?',
        ANSWER: 'Man was not allowed to eat from the tree of knowledge of good and evil.',
        VERSE: '{} 2:17'.format(Book.genesis)
    },
    {
        QUESTION: 'was man allowed to eat from the tree of knowledge of good and evil?',
        ANSWER: 'Man was not allowed to eat from the tree of knowledge of good and evil.',
        VERSE: '{} 2:17'.format(Book.genesis)
    },
    {
        QUESTION: 'what would happen to man if he ate from the fruit of the tree of knowledge of good and evil?',
        ANSWER: 'God declared that if man ate from the fruit of the tree of knowledge of good and evil, he would '
                'certainly die. ',
        VERSE: '{} 2:17'.format(Book.genesis)
    },
    {
        QUESTION: 'does God want man to be alone?',
        ANSWER: 'The Lord God said, "It is not good for man to be alone."',
        VERSE: '{} 2:18'.format(Book.genesis)
    },
    {
        QUESTION: 'what did God first do to aid mans\' loneliness?',
        ANSWER: 'God brought all the animals of the land and birds of the sky to Adam, so he could name them.',
        VERSE: '{} 2:19'.format(Book.genesis)
    },
    {
        QUESTION: 'did Adam give names to all the animals?',
        ANSWER: 'God gave Adam the task of naming all the animals.',
        VERSE: '{} 2:19'.format(Book.genesis)
    },
    {
        QUESTION: 'was any suitable helper found within the animals for Adam?',
        ANSWER: 'There was no suitable helper found in any animal.',
        VERSE: '{} 2:20'.format(Book.genesis)
    },
    {
        QUESTION: 'how did God remove a rib from Adam?',
        ANSWER: 'God made Adam fall into a deep sleep, and took a rib from him.',
        VERSE: '{} 2:21'.format(Book.genesis)
    },
    {
        QUESTION: 'what did God remove from Adam when he put him to sleep?',
        ANSWER: 'God removed a rib from Adam after putting him in a deep sleep.',
        VERSE: '{} 2:21'.format(Book.genesis)
    },
    {
        QUESTION: 'why did God remove a rib from Adam?',
        ANSWER: 'God removed a rib from Adam to create a woman.',
        VERSE: '{} 2:22'.format(Book.genesis)
    },
    {
        QUESTION: 'what did God create with Adam\'s rib?',
        ANSWER: 'God used Adams\'s rib to create a women.',
        VERSE: '{} 2:22'.format(Book.genesis)
    },
    {
        QUESTION: 'what did adam say when he saw Eve?',
        ANSWER: 'When Adam saw eve he said, "This is now bone of my bone and flesh of my flesh." and named her women',
        VERSE: '{} 2:23'.format(Book.genesis)
    },
    {
        QUESTION: 'Why does man leave his father and mother?',
        ANSWER: 'Man will leave his father and mother to become one with his wife.',
        VERSE: '{} 2:24'
    },
    {
        QUESTION: 'what happens when a man and a women unite?',
        ANSWER: 'When a man and a women unite, they become one flesh.',
        VERSE: '{} 2:24'.format(Book.genesis)
    },
    {
        QUESTION: 'were Adam and Eve naked in the garden of Eden?',
        ANSWER: 'Adam and Eve were naked in garden of Eden, but they were not ashamed.',
        VERSE: '{} 2:25'.format(Book.genesis)
    },
    {
        QUESTION: 'was Adam and Eve ashamed of being naked in the garden of Eden?',
        VERSE: 'Even thou Adam and Eve were naked in the garden of Eden, they were not ashamed.',
        ANSWER: '{} 2:25'.format(Book.genesis)
    },

    # Genesis 3
    {
        QUESTION: 'who was the craftiest animal the Lord had made?',
        ANSWER: 'Of all the animals, the serpent was the craftiest animal the Lord had made.',
        VERSE: '{} 3:1'.format(Book.genesis)
    },
    {
        QUESTION: 'did Eve know she was not suppose to eat the fruit of the three of knowledge of good and evil?',
        ANSWER: 'Eve knew that they were not allowed to touch or eat of the tree that is in the middle of the garden.',
        VERSE: '{} 3:2-{} 3:3'.format(Book.genesis, Book.genesis)
    },
    {
        QUESTION: 'how did the snake trick Eve into eating the fruit.',
        ANSWER: 'The serpent told Eve that if they ate of the fruit of knowledge they would not die.',
        VERSE: '{} 3:4'.format(Book.genesis)
    },
    {
        QUESTION: 'who did the snake trick into eating the fruit?',
        ANSWER: 'The serpent tricked Eve into eating the fruit of knowledge of good and evil.',
        VERSE: '{} 3:4'.format(Book.genesis)
    },
    {
        QUESTION: 'what would happen to Eve if she ate of the fruit of knowledge according to the snake?',
        ANSWER: 'The snake said that she would not die, and she would be like God.',
        VERSE: '{} 3:4-{} 3:5'.format(Book.genesis, Book.genesis)
    },
    {
        QUESTION: 'what did Eve see when she looked at the fruit of knowledge?',
        ANSWER: 'Eve saw that fruit was pleasing to look at and desirable for gaining knowledge.',
        VERSE: '{} 3:6'.format(Book.genesis)
    },
    {
        QUESTION: 'did Eve give to her husband Adam some of the fruit to eat?',
        ANSWER: 'After eating of the fruit of knowledge, she gave some to her husband Adam.',
        VERSE: '{} 3:6'.format(Book.genesis)
    },
    {
        QUESTION: 'did Adam eat of the fruit of knowledge of good and evil?',
        ANSWER: 'After Eve was tricked into eating of the fruit, she gave some to her husband Adam and he ate the '
                'fruit. ',
        VERSE: '{} 3:6'.format(Book.genesis)
    },
    {
        QUESTION: 'what happened to Adam and Eve after they ate the fruit of knowledge of good and evil?',
        ANSWER: 'After eating of the fruit of knowledge, both Adam and Eve\'s eyes were opened, and they realize they '
                'were naked. ',
        VERSE: '{} 3:7'.format(Book.genesis)
    },
    {
        QUESTION: 'how did Adam and Eve realize that they were both naked?',
        ANSWER: 'Adam and Eve both realized that they were naked after eating the fruit of the tree of knowledge that '
                'God had forbidden. ',
        VERSE: '{} 3:6-{} 3:7'.format(Book.genesis, Book.genesis)
    },
    {
        QUESTION: 'how did Adam and Eve cover themselves after they realized they were naked?',
        ANSWER: 'After realizing they naked, Adam and Eve sowed fig leaves together to cover themselves.',
        VERSE: '{} 3:7'.format(Book.genesis)
    },
    {
        QUESTION: 'what did Adam and Eve use to cover themselves?',
        ANSWER: 'Adam and Eve used fig leaves sewn together cover themselves. ',
        VERSE: '{} 3:7'.format(Book.genesis)
    },
    {
        QUESTION: 'what did Adam and Eve hear after eating of the fruit of knowledge of good and evil?',
        ANSWER: 'After eating of the fruit, Adam and Eve heard the Lord God walking in the garden in the cool of the '
                'day.',
        VERSE: '{} 3:8'.format(Book.genesis)
    },
    {
        QUESTION: 'what did Adam and Eve do when they heard the Lord God walking through the garden?',
        ANSWER: 'When Adam and Eve heard the Lord God waling through the garden, they were afraid and hid among the '
                'trees. ',
        VERSE: '{} 3:8'.format(Book.genesis)
    },
    {
        QUESTION: 'did the Lord God call out to Adam when he and his Eve hid from him??',
        ANSWER: 'The Lord God called out to them when they were hiding from him in the trees of the garden.',
        VERSE: '{} 3:9'.format(Book.genesis)
    },
    {
        QUESTION: 'why did Adam hide from the Lord after he realized he was naked?',
        ANSWER: 'Adam hid from the Lord after he realized he was naked because he was afraid?',
        VERSE: '{} 3:10'.format(Book.genesis)
    },
    {
        QUESTION: 'what was Adam afraid of when the Lord called out to him after Adam realized he was naked?',
        ANSWER: 'The bible does not say what Adam was afraid of, when God called out to him.',
        VERSE: '{} 3:10'.format(Book.genesis)
    },
    {
        QUESTION: 'did God question Adam how he know he was naked?',
        ANSWER: 'God asked Adam who had revealed to them that they were naked, and if he had eaten of the fruit of '
                'knowledge?',
        VERSE: '{} 3:11'.format(Book.genesis)
    },
    {
        QUESTION: 'what was Adam\'s excuse to the Lord God on why he ate the fruit of knowledge?',
        ANSWER: 'Adam blamed Eve for giving him some of the fruit to eat.',
        VERSE: '{} 3:12'.format(Book.genesis)
    },
    {
        QUESTION: 'what was Eve\'s excuse to the Lord God on why she ate the fruit?',
        ANSWER: 'Eve blamed the serpent for tricking her into eating of the fruit of knowledge.',
        VERSE: '{} 3:13'.format(Book.genesis)
    },
    {
        QUESTION: 'what was God\'s curse to the serpent for tricking Eve into eating of the fruit of knowledge?',
        ANSWER: 'God cursed the serpent above all animals, it would crawl on its belly and eat dust. God put '
                'hostility between man and serpent. ',
        VERSE: '{} 3:14-{} 3:15'.format(Book.genesis, Book.genesis)
    },
    {
        QUESTION: 'why did God curse the serpent?',
        ANSWER: 'God cursed the serpent because it had tricked Eve into eating of the fruit of knowledge.',
        VERSE: '{} 3:13-{} 3:15'.format(Book.genesis, Book.genesis)
    },
    {
        QUESTION: 'why did God curse Eve?',
        ANSWER: 'God cursed Eve because she had eaten of the fruit of knowledge: God had forbidden Adam and Eve from '
                'eating of that fruit. ',
        VERSE: '{} 2:17, {} 3:16'.format(Book.genesis, Book.genesis)
    },
    {
        QUESTION: 'what was God\'s curse to Eve?',
        ANSWER: 'God\'s curse to Eve was that giving birth would be severely painful, that her desire would be for '
                'her husband, and that her husband would rule over her. ',
        VERSE: '{} 3:16'.format(Book.genesis)
    },
    {
        QUESTION: 'why is giving birth so painful to a women?',
        ANSWER: 'Giving birth is painful for a woman because it is God\'s decree over Eve for eating of the fruit of '
                'knowledge. ',
        VERSE: '{} 3:16'.format(Book.genesis)
    },
    {
        QUESTION: 'what is a woman\'s desire?',
        ANSWER: 'Decreed by God, a woman\'s desire is for her husband.',
        VERSE: '{} 3:16'.format(Book.genesis)
    },
    {
        QUESTION: 'Is a husband suppose to rule over his wife?',
        ANSWER: 'Decreed by God, a husband is to rule over his wife.',
        VERSE: '{} 3:16'.format(Book.genesis)
    },
    {
        QUESTION: 'why did God curse Adam.',
        ANSWER: 'God cursed Adam because he listened to his wife and ate from the tree of knowledge, which God had '
                'forbidden both from eating. ',
        VERSE: '{} 3:17'.format(Book.genesis)
    },
    {
        QUESTION: 'what was Adam\'s curse.',
        ANSWER: 'God decreed that Adam would have to work for his food, his work would be hard until he died; when he '
                'died he would return to the ground. ',
        VERSE: '{} 3:17-{} 3:19'.format(Book.genesis, Book.genesis)
    },
    {
        QUESTION: 'is the ground cursed because of Adam\'s sin?',
        ANSWER: 'The ground was cursed because of Adam\'s sin, it now produces thorns and thistles.',
        VERSE: '{} 3:17-{} 3:19'.format(Book.genesis, Book.genesis)
    },
    {
        QUESTION: 'how was mankind suppose to get food after the Lord God kicked them out of the garden?',
        ANSWER: 'Through hard work, would mankind eat from the plants of thr ground.',
        VERSE: '{} 3:17-{} 3-19'.format(Book.genesis, Book.genesis)
    },
    {
        QUESTION: 'is man suppose to work hard?',
        ANSWER: 'God sentenced man to work hard all his life until the day he dies.',
        VERSE: '{} 3:17-{} 3-19'.format(Book.genesis, Book.genesis)
    },
    {
        QUESTION: 'is mankind suppose to die?',
        ANSWER: 'All men will return to the dust he came from, this was declared by the Lord God.',
        VERSE: '{} 3:19'.format(Book.genesis)
    },
    {
        QUESTION: 'did Adam name his wife \"Eve\"?',
        ANSWER: 'Adam named his wife Eve because she would become the mother of all the people to come.',
        VERSE: '{} 3:20'.format(Book.genesis)
    },
    {
        QUESTION: 'is Eve the mother of all the people in the world?',
        ANSWER: 'Since Eve is the first women, she is the mother of all the people who came after her.',
        VERSE: '{} 3:20'.format(Book.genesis)
    },
    {
        QUESTION: 'did the Lord God clothed Adam and Eve?',
        ANSWER: 'The Lord made garments of skin for Adam and his wife and clothed them.',
        VERSE: '{} 3:21'.format(Book.genesis)
    },
    {
        QUESTION: 'did mankind become like God after they ate of the fruit of knowledge?',
        ANSWER: 'The Lord God said, "The man has now become like one of us, knowing good and evil. He must no be '
                'allowed to reach out his hand and take also from the tree of life and eat, and live forever. ',
        VERSE: '{} 3:22'.format(Book.genesis)
    },
    {
        QUESTION: 'how did mankind become like God after they ate from the fruit of knowledge?',
        ANSWER: 'Man became like God in knowing good and evil after they ate of the fruit of knowledge of good and '
                'evil.',
        VERSE: '{} 3:22'.format(Book.genesis)
    },
    {
        QUESTION: 'what was mankind not allowed to do after eating of the fruit of knowledge?',
        ANSWER: 'Mankind was not allowed to eat from the fruit of the tree of life, and live forever.',
        VERSE: "{} 3:22".format(Book.genesis)
    },
    {
        QUESTION: 'what is the tree of life?',
        ANSWER: 'The tree of life is one of two trees that God placed in the middle of the garden of Eden. According '
                'to Genesis chapter 3 verse 22; if man reached out and ate from the tree of life he could live '
                'forever. ',
        VERSE: '{} 3:22'.format(Book.genesis)
    },
    {
        QUESTION: 'can you live forever if you eat from the tree of life?',
        ANSWER: 'You live forever if you eat from the tree of life?',
        VERSE: '{} 3:22'.format(Book.genesis)
    },
    {
        QUESTION: 'why did the Lord God banish Adam and Eve from the garden of Eden?',
        ANSWER: 'God banished Adam and Eve from the garden of Eden because they ate from the tree of knowledge, which'
                'he forbid them from eating.',
        VERSE: '{} 3:10-{} 3:22'.format(Book.genesis, Book.genesis)
    },
    {
        QUESTION: 'what did Adam do after he was banished from the garden of Eden?',
        ANSWER: 'After Adam was banished from he garden of Eden he worked the ground.',
        VERSE: '{} 3:23'.format(Book.genesis)
    },
    {
        QUESTION: 'how is the garden of Eden protected after man was banished from it?',
        ANSWER: 'God placed cherubim and a flaming sword on the east side of the garden.',
        VERSE: '{} 3:23'.format(Book.genesis)
    },
    {
        QUESTION: 'are there angels protecting the garden of Eden?',
        ANSWER: 'God placed cherubim and a flaming sword on the east side of the garden.',
        VERSE: '{} 3:24'.format(Book.genesis)
    },
    {
        QUESTION: 'what is protecting the garden of Eden now?',
        ANSWER: 'God placed cherubim and a flaming sword on the east side of the garden.',
        VERSE: '{} 3:24'.format(Book.genesis)
    },
    ## GENESIS 4
    {
        QUESTION: 'who was Adam\'s first born son?',
        ANSWER: 'Adam and Eve\'s first born was Cain.',
        VERSE: '{} 4:1'.format(Book.genesis)
    },
    {
        QUESTION: 'who was Eve\'s first born son?',
        ANSWER: 'Adam and Eve\'s first born was Cain.',
        VERSE: '{} 4:1'.format(Book.genesis)
    },
    {
        QUESTION: 'what did Eve say when she gave birth to Cain?',
        ANSWER: 'After giving birth to Cain Eve said, "With the help of the lord I have brought forth a man."',
        VERSE: '{} 4:1'.format(Book.genesis)
    },
    {
        QUESTION: 'who was Adam\'s second born son?',
        ANSWER: 'Adam and Eve\'s first born was Abel.',
        VERSE: '{} 4:2'.format(Book.genesis)
    },
    {
        QUESTION: 'who was Eve\'s first born son?',
        ANSWER: 'Adam and Eve\'s first born was Abel.',
        VERSE: '{} 4:2'.format(Book.genesis)
    },
    {
        QUESTION: 'what did Abel do for work?',
        ANSWER: 'Abel was a shepherd so he kept flocks.',
        VERSE: '{} 4:2'.format(Book.genesis)
    },
    {
        QUESTION: 'what did Cain do for work?',
        ANSWER: 'Cain was farmer so he worked the soil.',
        VERSE: '{} 4:2'.format(Book.genesis)
    },
    {
        QUESTION: 'is Cain older than Abel?',
        ANSWER: 'Cain wa born first to Adam and Eve, afterward Abel was born.',
        VERSE: '{} 4:1-{} 4:2'.format(Book.genesis, Book.genesis)
    },
    {
        QUESTION: 'is Abel younger than Cain?',
        ANSWER: 'Cain wa born first to Adam and Eve, afterward Abel was born.',
        VERSE: '{} 4:1-{} 4:2'.format(Book.genesis, Book.genesis)
    },
    {
        QUESTION: 'what did Cain and Abel do for work?',
        ANSWER: 'Cain was a farmer so he worked the soil, Abel was a shepherd so he kept flocks.',
        VERSE: '{} 4:2'.format(Book.genesis)

    },
    {
        QUESTION: 'what did Cain bring to God as an offering?',
        ANSWER: 'Cain brought some fruits from the soil as an offering to God.',
        VERSE: '{} 4:3'.format(Book.genesis)
    },
    {
        QUESTION: 'what did Abel bring to God as an offering?',
        ANSWER: 'Abel brought some fat portions from the firstborn of the flock.',
        VERSE: '{} 4:4'.format(Book.genesis)
    },
    {
        QUESTION: 'Who\'s offering did God see with favor, Cain or Abel?',
        ANSWER: 'God saw Abel\'s offering of fat from the firstborn of his flock with favor.',
        VERSE: '{} 4:4'.format(Book.genesis)
    },
    {
        QUESTION: 'Did the Lord God see Abel\'s offering with favor?',
        ANSWER: 'God saw Abel\'s offering of fat from the firstborn of his flock with favor.',
        VERSE: '{} 4:4'.format(Book.genesis)
    },
    {
        QUESTION: 'Did the Lord God see Cain\'s offering with favor?',
        ANSWER: 'God did not see Cain\'s offering of fruit from the ground with favor.',
        VERSE: '{} 4:5'.format(Book.genesis)
    },
    {
        QUESTION: 'Why did Cain become angry after giving God his offering?',
        ANSWER: 'Cain became very after giving God his offering of fruit because the Lord saw Abel\'s offering with '
                'favor and not his.',
        VERSE: '{} 4:4-{} 4:5'.format(Book.genesis, Book.genesis)
    },
    {
        QUESTION: 'What was Cain\'s reaction after God did not see his offering with favor?',
        ANSWER: 'Cain became angry, and his face was downcast.',
        VERSE: '{} 4:5'.format(Book.genesis)
    },
    {
        QUESTION: 'What did God say to Cain became angry?',
        ANSWER: 'When Cain became angry, he asked him "Why are you angry? Why is your face downcast?',
        VERSE: '{} 4:6'.format(Book.genesis)
    },
    {
        QUESTION: 'How could Cain\'s offering be accepted before God?',
        ANSWER: 'If Cain does what is right, he will be accepted.',
        VERSE: '{} 4:7'.format(Book.genesis)
    },
    {
        QUESTION: 'Does God want us to do what is right?',
        ANSWER: 'God wants us to do what is right, no bad deed is acceptable before his eyes.',
        VERSE: '{} 4:7'.format(Book.genesis)
    },
    {

        QUESTION: 'What happens if you do what is wrong?',
        ANSWER: 'To those who do wrong, sin waits for them, sin wants to rule over them.',
        VERSE: '{} 4:7'.format(Book.genesis)

    },
    {
        QUESTION: 'Can sin consume someone life?',
        ANSWER: 'Sin wishes to rule over you, always waiting at your door.',
        VERSE: '{} 4:7'.format(Book.genesis)
    },
    {
        QUESTION: 'How did Cain kill Abel?',
        ANSWER: 'Cain said to Abel, "Let\'s go out to the field", while they were in the field Cain killed his brother.',
        VERSE: '{} 4:8'.format(Book.genesis)
    },
    {
        QUESTION: 'Did Cain kill Abel?',
        ANSWER: 'While the brothers where out in the field, Cain attacked and killed Abel.',
        VERSE: '{} 4:8'.format(Book.genesis)
    },
    {
        QUESTION: 'What did Cain reply to the Lord God asked him where his brother able was?',
        ANSWER: 'Cain replied to the Lord, "Id don\'t know, am I my brothers keeper?"',
        VERSE: '{} 4:9'.format(Book.genesis)
    },
    {
        QUESTION: 'What did the Lord say about Able\'s death after he was murdered by Cain?',
        ANSWER: 'The Lord God said to Cain, "Listen! Your brother\'s blood cries out to me from the ground."',
        VERSE: '{} 4:10'.format(Book.genesis)
    },
    {
        QUESTION: 'Was Cain placed under a curse for murdering his brother Abel?',
        ANSWER: 'God placed Cain under a curse for murdering his brother Abel, which would drive him from the land.',
        VERSE: '{} 4:11'.format(Book.genesis)
    },
    {
        QUESTION: 'What was Cain curse for killing his brother Abel?',
        ANSWER: 'Cain was driven from the land, it would no longer yield crops for him. He would be a restless '
                'wanderer on the earth',
        VERSE: '{} 4:11-{} 4:12'.format(Book.genesis, Book.genesis)
    },
    {
        QUESTION: 'Was Cain afraid of the curse God placed on him?',
        ANSWER: 'Cain was afraid of being driven from the land, and hidden from God\'s presence. He was afraid of '
                'being killed by whoever found him. ',
        VERSE: '{} 4:13-{} 4-14'.format(Book.genesis, Book.genesis)
    },
    {
        QUESTION: 'Did God protect Cain from being murdered?',
        ANSWER: 'God place a mark on Cain, and declared that anyone who killed Cain would suffer vengeance seven '
                'times over. ',
        VERSE: '{} 4:15'.format(Book.genesis)
    },
    {
        QUESTION: 'Was Cain no longer in the Lord\'s presence?',
        ANSWER: 'After murdering his brother Abel, Cain went out of the Lord\'s presence and lived in the land of Nod.',
        VERSE: '{} 4:13-{}4:16'.format(Book.genesis, Book.genesis)
    },
    {
        QUESTION: 'Where did Cain live after he murdered his brother Abel?',
        ANSWER: 'After murdering his brother Abel and going out of the Lord\'s presence Cain lived in the land of Nod, '
                'east of Eden. ',
        VERSE: '{} 4:16'.format(Book.genesis)
    },
    {
        QUESTION: 'What was the name of Cain\'s first born son?',
        ANSWER: 'Cain first born son was named Enoch.',
        VERSE: '{} 4:17'.format(Book.genesis)
    },
    {
        QUESTION: 'What did Cain do after he left because murdered his bother Abel?',
        ANSWER: 'Cain built a city and named it after his son Enoch.',
        VERSE: '{} 4:17'.format(Book.genesis)
    },
    {
        QUESTION: 'Did Cain build a city?',
        ANSWER: 'Cain built a city and named it after his son Enoch.',
        VERSE: '{} 4:17'.format(Book.genesis)
    },
    {
        QUESTION: 'What was the name of Enoch son?',
        ANSWER: 'Enoch\'s son was named Irad.',
        VERSE: '{} 4:18'.format(Book.genesis)
    },
    {
        QUESTION: 'What was the name of Irad son?',
        ANSWER: 'Irad\'s son was named Mehujael.',
        VERSE: '{} 4:18'.format(Book.genesis)
    },
    {
        QUESTION: 'What was the name of Mehujael\'s son?',
        ANSWER: 'Mehujael\'s son was named Methushael.',
        VERSE: '{} 4:18'.format(Book.genesis)
    },
    {
        QUESTION: 'What was the name of Methushael\'s son?',
        ANSWER: 'Methushael\'s son was named Lamech.',
        VERSE: '{} 4:18'.format(Book.genesis)
    },
    {
        QUESTION: 'How many wives did Lamech have?',
        ANSWER: 'Lamech had two wives, one was named Adah and the other was named Zillah.',
        VERSE: '{} 4:19'.format(Book.genesis)
    },
    {
        QUESTION: 'Who was Adah?',
        ANSWER: 'Adah was one of Lamech\'s wives, the other was Zillah.',
        VERSE: '{} 4:19'.format(Book.genesis)
    },
    {
        QUESTION: 'Who was Zillah?',
        ANSWER: 'Zillad was one of Lamech\'s wives, the other was Adah.',
        VERSE: '{} 4:19'.format(Book.genesis)
    },
    {
        QUESTION: 'Who was Jabal?',
        ANSWER: 'Jabal was one of two sons Lamech had with Adah.',
        VERSE: '{} 4:20'.format(Book.genesis)
    },
    {
        QUESTION: 'Who was Jabal\'s mother?',
        ANSWER: 'Jabal\'s mother was Adah, and his father was Lamech.',
        VERSE: '{} 4:20'.format(Book.genesis)
    },
    {
        QUESTION: 'Who was Jabal\'s father?',
        ANSWER: 'Jabal\'s mother was Adah, and his father was Lamech.',
        VERSE: '{} 4:20'.format(Book.genesis)
    },

    {
        QUESTION: 'Who are the descendants of Jabal? ',
        ANSWER: 'The descendants of Jabal are the people known for living in tents and raising livestock.',
        VERSE: '{} 4:20'.format(Book.genesis)
    },
    {
        QUESTION: 'Who was Jubal?',
        ANSWER: 'Jubal was one of two sons Lamech had with Adah.',
        VERSE: '{} 4:21'.format(Book.genesis)
    },
    {
        QUESTION: 'Who was Jubal\'s mother?',
        ANSWER: 'Jubal\'s mother was Adah, and his father was Lamech.',
        VERSE: '{} 4:21'.format(Book.genesis)
    },
    {
        QUESTION: 'Who was Jubal\'s father?',
        ANSWER: 'Jubal\'s mother was Adah, and his father was Lamech.',
        VERSE: '{} 4:21'.format(Book.genesis)
    },
    {
        QUESTION: 'Who are the descendants of Jubal? ',
        ANSWER: 'The descendants of Jubal are the people known for playing stringed instruments and pipes.',
        VERSE: '{} 4:21'.format(Book.genesis)
    },
    {
        QUESTION: 'Did Adah have any children?',
        ANSWER: 'Adah had two sons, Jabal and Jubal.',
        VERSE: '{} 4:20-{}4:21'.format(Book.genesis, Book.genesis)
    },
    {
        QUESTION: 'Did Zillah have any children?',
        ANSWER: 'Lamech had two children with Zillah, a son named Tubal-Cain and a daugther named Naamah.',
        VERSE: '{} 4:22'.format(Book.genesis)
    },
    {
        QUESTION: 'Who was Tubal-Cain?',
        ANSWER: 'Tubal-Cain was the son Lamech with Zillah.',
        VERSE: '{} 4:22'.format(Book.genesis)
    },
    {
        QUESTION: 'What was Tubal-Cain known for?',
        ANSWER: 'Tubal-Cain was known for forging all kinds of tools out of Bronze and Iron.',
        VERSE: '{} 4:22'.format(Book.genesis)
    },
    {
        QUESTION: 'Did Tubal-Cain have any siblings?',
        ANSWER: 'Tubal-Cain had a sister named Naamah.',
        VERSE: '{} 4:22'.format(Book.genesis)
    },
    {
        QUESTION: 'Did Tubal-Cain have a sister?',
        ANSWER: 'Tubal-Cain had a sister named Naamah.',
        VERSE: '{} 4:22'.format(Book.genesis)
    },
    {
        QUESTION: 'Did Lamech kill a someone?',
        ANSWER: 'Lamech killed a young man for injuring him.',
        VERSE: '{} 4:23'.format(Book.genesis)
    },
    {
        QUESTION: 'Why did Lamech kill someone?',
        ANSWER: 'Lamech killed a young man because the man injured him.',
        VERSE: '{} 4:23'.format(Book.genesis)
    },
    {
        QUESTION: 'Did Lamech want to be avenged if he was killed?',
        ANSWER: 'Lamech wanted to be avenged seventy times compared to the seven times God decreed over Cain.',
        VERSE: '{} 4:24'.format(Book.genesis)
    },
    {
        QUESTION: 'Who is Seth?',
        ANSWER: 'Seth is Adam\'s third son.',
        VERSE: '{} 4:25'.format(Book.genesis)
    },
    {
        QUESTION: 'Did Seth have children?',
        ANSWER: 'Seth had a son, he named him Enosh.',
        VERSE: '{} 4:26, {} 5:6'.format(Book.genesis, Book.genesis)
    },
    {
        QUESTION: 'Who is Enosh?',
        ANSWER: 'Enosh is the son of Seth.',
        VERSE: '{} 4:26, {} 5:6'.format(Book.genesis, Book.genesis)
    },
    {
        QUESTION: 'When did people begin to call on the name of the Lord?',
        ANSWER: 'During the time of Enosh\'s life, people began to call on God.',
        VERSE: '{} 4:26'.format(Book.genesis)
    },

    {
        QUESTION: 'Why do we say "Mankind"?',
        ANSWER: 'When God created humans he called them "Mankind.',
        VERSE: '{} 5:2'.format(Book.genesis)
    },
    {
        QUESTION: 'Did God name humans "Mankind"?',
        ANSWER: 'When God created humans he called them "Mankind.',
        VERSE: '{} 5:2'.format(Book.genesis)
    },
    {
        QUESTION: 'At what age did Adam have Seth?',
        ANSWER: 'Seth was born when Adam was 120 years old.',
        VERSE: '{} 5:3'.format(Book.genesis)
    },
    {
        QUESTION: 'How many years did Adam live after he had Seth?',
        ANSWER: 'Adam lived an additional 800 years after he had Seth.',
        VERSE: '{} 5:4'.format(Book.genesis)
    },
    {
        QUESTION: 'Did Adam have more children after he had Seth?',
        ANSWER: 'Adam did have more children after he had Seth.',
        VERSE: '{} 5:4'.format(Book.genesis)
    },
    {
        QUESTION: 'How many years did Adam live?',
        ANSWER: 'Adam lived a total of 930 years.',
        VERSE: '{} 5:5'.format(Book.genesis)
    },
    {
        QUESTION: 'At what age did Adam die?',
        ANSWER: 'Adam died at the age of 930 years old.',
        VERSE: '{} 5:5'.format(Book.genesis)
    },
    {
        QUESTION: 'At what age did Seth have Enosh?',
        ANSWER: 'Enosh was born when Seth was 105 years old.',
        VERSE: '{} 5:6'.format(Book.genesis)
    },
    {
        QUESTION: 'How many years did Seth live after he had Enosh?',
        ANSWER: 'Seth lived an additional 807 years after he had Enosh.',
        VERSE: '{} 5:7'.format(Book.genesis)
    },
    {
        QUESTION: 'Did Seth have more children after Enosh?',
        ANSWER: 'Seth did have more children after Enosh.',
        VERSE: '{} 5:7'.format(Book.genesis)
    },
    {
        QUESTION: 'How many years did Seth live',
        ANSWER: 'Seth lived a total of 912 years.',
        VERSE: '{} 5:8'.format(Book.genesis)
    },
    {
        QUESTION: 'At what age did Seth die?',
        ANSWER: 'Seth died at the age of 912 years old.',
        VERSE: '{} 5:8'.format(Book.genesis)
    },
    # 03/19/20 -1
    {
        QUESTION: 'At what age did Enosh have Kenan?',
        ANSWER: 'Kenan was born when Enosh was 90 years old.',
        VERSE: '{} 5:9'.format(Book.genesis)
    },
    {
        QUESTION: 'How many years did Enosh live after he had Kenan?',
        ANSWER: 'Enosh lived an additional 815 years after he had Kenan.',
        VERSE: '{} 5:10'.format(Book.genesis)
    },
    {
        QUESTION: 'Did Enosh have more children after Kenan?',
        ANSWER: 'Enosh did have more children after Kenan.',
        VERSE: '{} 5:10'.format(Book.genesis)
    },
    {
        QUESTION: 'How many years did Enosh live?',
        ANSWER: 'Enosh lived a total of 905 years.',
        VERSE: '{} 5:11'.format(Book.genesis)
    },
    {
        QUESTION: 'At what age did Enosh die?',
        ANSWER: 'Enosh died at the age of 905 years old.',
        VERSE: '{} 5:11'.format(Book.genesis)
    },
    {
        QUESTION: 'At what age did Kenan have Mahalalel?',
        ANSWER: 'Mahalalel was born when Kenan was 70 years old.',
        VERSE: '{} 5:12'.format(Book.genesis)
    },
    {
        QUESTION: 'How many years did Kenan live after he had Mahalalel?',
        ANSWER: 'Kenan lived an additional 840 years after he had Mahalalel.',
        VERSE: '{} 5:13'.format(Book.genesis)
    },
    {
        QUESTION: 'Did Kenan have more children after Mahalalel?',
        ANSWER: 'Kenan did have more children after Mahalalel.',
        VERSE: '{} 5:13'.format(Book.genesis)
    }

    # 03/27 #1
    ,
    {
        QUESTION: 'How many years did Kenan live?',
        ANSWER: 'Kenan lived a total of 910 years.',
        VERSE: '{} 5:14'.format(Book.genesis)
    },
    {
        QUESTION: 'At what age did Kenan die?',
        ANSWER: 'Kenan died at the age of 905 years old.',
        VERSE: '{} 5:14'.format(Book.genesis)
    }
    # 2
    ,
    {
        QUESTION: 'At what age did Mahalalel have Jared?',
        ANSWER: 'Jared was born when Kenan was 65 years old.',
        VERSE: '{} 5:15'.format(Book.genesis)
    },
    # 3
    {
        QUESTION: 'How many years did Mahalalel live after he had Jared?',
        ANSWER: 'Mahalalel lived an additional 830 years after he had Jared.',
        VERSE: '{} 5:16'.format(Book.genesis)
    },
    {
        QUESTION: 'Did Mahalalel have more children after Jared?',
        ANSWER: 'Mahalalel did have more children after Jared.',
        VERSE: '{} 5:16'.format(Book.genesis)
    },
    # 4
    {
        QUESTION: 'How many years did Mahalalel live?',
        ANSWER: 'Mahalalel lived a total of 895 years.',
        VERSE: '{} 5:17'.format(Book.genesis)
    },
    {
        QUESTION: 'At what age did Mahalalel die?',
        ANSWER: 'Mahalalel died at the age of 895 years old.',
        VERSE: '{} 5:17'.format(Book.genesis)
    }
    # 5
    ,
    {
        QUESTION: 'At what age did Jared have Enoch?',
        ANSWER: 'Enoch was born when Jared was 162 years old.',
        VERSE: '{} 5:18'.format(Book.genesis)
    },
    # 6
    {
        QUESTION: 'How many years did Jared live after he had Enoch?',
        ANSWER: 'Jared lived an additional 800 years after he had Enoch.',
        VERSE: '{} 5:19'.format(Book.genesis)
    },
    {
        QUESTION: 'Did Jared have more children after Enoch?',
        ANSWER: 'Jared did have more children after Enoch.',
        VERSE: '{} 5:19'.format(Book.genesis)
    },
    # 7
    {
        QUESTION: 'How many years did Jared live?',
        ANSWER: 'Jared lived a total of 962 years.',
        VERSE: '{} 5:20'.format(Book.genesis)
    },
    {
        QUESTION: 'At what age did Jared die?',
        ANSWER: 'Mahalalel died at the age of 962 years old.',
        VERSE: '{} 5:20'.format(Book.genesis)
    }

    # 8
    ,
    {
        QUESTION: 'At what age did Enoch have Methuselah?',
        ANSWER: 'Methuselah was born when Enoch was 65 years old.',
        VERSE: '{} 5:21'.format(Book.genesis)
    },
    # 9
    {
        QUESTION: 'How many years did Enoch live after he had Methuselah?',
        ANSWER: 'Enoch did not die, he walked faithfully with God an additional 300 years after he had Methuselah, '
                'then God took him without seeing death.',
        VERSE: '{} 5:22, {} 5:24, {} 11:5'.format(Book.genesis, Book.genesis, Book.hebrews)
    },
    {
        QUESTION: 'Did Enoch have more children after Methuselah?',
        ANSWER: 'Enoch did have more children after Methuselah.',
        VERSE: '{} 5:22'.format(Book.genesis)
    },
    # 10
    {
        QUESTION: 'How many years did Enoch live?',
        ANSWER: 'Enoch lived a total of 365 years before God took him.',
        VERSE: '{} 5:23'.format(Book.genesis)
    },
    {
        QUESTION: 'At what age did Enoch die?',
        ANSWER: 'Enoch did not die, he lived 365 years before God took him without seeing death.',
        VERSE: '{} 5:23-{} 5:24, {} 11:5'.format(Book.genesis, Book.genesis, Book.hebrews)
    },
    # 11
    {
        QUESTION: 'Who walked faithfully with God?',
        ANSWER: 'Enoch walked faithfully with God, because of that God took him.',
        VERSE: '{} 5:24'.format(Book.genesis)

    },
    {
        QUESTION: 'Why did God take Enoch?',
        ANSWER: "God took Enoch because he walked faithfully in God's eyes.",
        VERSE: '{} 5:24'.format(Book.genesis)
    },
    {
        QUESTION: 'At what age did Methuselah have Lamech?',
        ANSWER: 'Lamech was born when Methuselah was 187 years old.',
        VERSE: '{} 5:25'.format(Book.genesis)
    },
    # 04/23/2020 START - 1
    {
        QUESTION: 'how many years did Methuselah live after he had Lamech?',
        ANSWER: 'Methuselah lived an additional 782 years after he had Lamech.',
        VERSE: '{} 5:26'.format(Book.genesis)
    },
    {
        QUESTION: 'did Methuselah have mare children after Lamech?',
        ANSWER: 'Methuselah did have more children after he had Lamech.',
        VERSE: '{} 5:26'.format(Book.genesis)
    },
    {
        QUESTION: 'How many years did Methuselah live?',
        ANSWER: 'Methuselah lived a total of 969 years.',
        VERSE: '{} 5:27'.format(Book.genesis)
    },
    {
        QUESTION: 'At what age did Methuselah die?',
        ANSWER: 'Methuselah died at the age of 962 years old.',
        VERSE: '{} 5:27'.format(Book.genesis)
    },

    # ===============> Next person
    {
        QUESTION: 'At what age did Lamech have Noah?',
        ANSWER: 'Noah was born when Lamech was 182 years old.',
        VERSE: '{} 5:28'.format(Book.genesis)
    },
    {
        QUESTION: 'What did Lamech say his son Noah would do?',
        ANSWER: 'Lamech said his son Noah, "... would confront us in the labor and toil of our hands caused by the '
                'ground the Lord has cursed." ',
        VERSE: '{} 5:29'.format(Book.genesis)
    },
    {
        QUESTION: 'what does it mean that Noah would "confront" in the labor and toil his father Lamech declared?',
        ANSWER: NOT_ANSWERED,
        VERSE: NOT_VERSE
    },
    {
        QUESTION: 'how many years did Lamech live after he had Noah?',
        ANSWER: 'Lamech lived an additional 595 years after he had Noah.',
        VERSE: '{} 5:30'.format(Book.genesis)
    },
    {
        QUESTION: 'did Lamech have mare children after Noah?',
        ANSWER: 'Lamech did have more children after he had Noah.',
        VERSE: '{} 5:30'.format(Book.genesis)
    },
    # 7
    {
        QUESTION: 'How many years did Lamech live?',
        ANSWER: 'Lamech lived a total of 777 years.',
        VERSE: '{} 5:31'.format(Book.genesis)
    },
    {
        QUESTION: 'At what age did Lamech die?',
        ANSWER: 'Lamech died at the age of 777 years old.',
        VERSE: '{} 5:31'.format(Book.genesis)
    },
    {
        QUESTION: 'At what age did Noah have his sons?',
        ANSWER: 'Shem, Ham and Japheth were born when Lamech was 500 years old.',
        VERSE: '{} 5:32'.format(Book.genesis)
    },
    {
        QUESTION: "what were the names of Noah's sons?",
        ANSWER: "Shem, Ham and Japheth were Noah's sons in the book of Genesis.",
        VERSE: '{} 5:32, {} 6:10'.format(Book.genesis, GENESIS)
    },
    {
        QUESTION: 'who are Shem, Ham and Japheth in the Book of Genesis?',
        ANSWER: 'They are the Sons of Noah.',
        VERSE: '{} 5:32, {} 6:10'.format(Book.genesis, GENESIS)
    },
    {
        QUESTION: 'what did the sons of God do to the daughters of humans?',
        ANSWER: 'The sons of God took any of the women they choose, and marry them.',
        VERSE: '{} 6:1-{} 6:2'.format(Book.genesis, Book.genesis)
    },
    {
        QUESTION: 'why did the sons of God take and marry the daughters of humans?',
        ANSWER: 'The sons of God saw that women were beautiful, so they took and marry which ever they choose.',
        VERSE: '{} 6:1-{} 6:2'.format(Book.genesis, Book.genesis)
    },
    {
        QUESTION: 'who are the sons of God?',
        ANSWER: NOT_ANSWERED,
        VERSE: NOT_VERSE
    },
    {
        QUESTION: 'who are the daughters of humans?',
        ANSWER: 'In the book of Genesis, when humans started to populate the world, daughters were born to them.',
        VERSE: '{} 6:1'.format(Book.genesis)
    },
    {
        QUESTION: "did God limit humans lifespan?",
        ANSWER: "God declared that mankind lifespan would be 120 years.",
        VERSE: '{} 6:3'.format(Book.genesis)
    },
    {
        # God will not fight - argue with humans
        QUESTION: 'why did God limit humans lifespan',
        ANSWER: NOT_ANSWERED,
        VERSE: NOT_VERSE
    },
    {
        QUESTION: 'does God still contend with humankind?',
        ANSWER: NOT_ANSWERED,
        VERSE: NOT_VERSE
    },
    {
        QUESTION: "what does it mean that God's spirit will not contend with humans forever?",
        ANSWER: NOT_ANSWERED,
        VERSE: NOT_VERSE
    },

    # 6:3
    {
        QUESTION: 'when were the Nephilim on earth?',
        ANSWER: 'The Nephilim where on earth in the days of Noah and can be found in the days of Moses.',
        VERSE: '{} 6:4'.format(Book.genesis)
    },
    {
        QUESTION: 'what are Nephilim?',
        ANSWER: 'Nephilim are famous and power giants of ancient times. They were on the earth in the days of Noah '
                'and in the days of Moses. ',
        VERSE: '{} 6:4, {} 13:33'.format(Book.genesis, Book.numbers)
    },
    {
        QUESTION: 'did giants exist?',
        ANSWER: NOT_ANSWERED,
        VERSE: NOT_VERSE
    },

    # 04/23/2020 END - 1 - 11
    {
        QUESTION: 'are people naturally evil?',
        ANSWER: 'The human heart will lean to evil and wickedness, continuously.',
        VERSE: '{} 6:5'.format(Book.genesis)
    },
    {
        QUESTION: 'what is the human heart?',
        ANSWER: NOT_ANSWERED,
        VERSE: NOT_VERSE
    },
    {
        QUESTION: 'what are the thoughts of the human heart?',
        ANSWER: 'Without God the thoughts of the human heart are only evil all the time.',
        VERSE: '{} 6:5'.format(Book.genesis)
    },
    {
        QUESTION: 'can the human race be wicked?',
        ANSWER: 'Without God the human race can be greatly wicked, and always thinking of evil things?',
        VERSE: '{} 6:5'.format(Book.genesis)
    },
    {
        # 'evil'
        QUESTION: 'what is evil?',
        ANSWER: NOT_ANSWERED,
        VERSE: NOT_VERSE
    },
    {
        # 'The Lord's regret - salvation through Jesus's sacrifice. 'lamented': regret is a feeling.  'deep lament'
        QUESTION: 'does God regret things?',
        ANSWER: NOT_ANSWERED,
        VERSE: NOT_VERSE
    },
    {
        QUESTION: 'what is God\'s regret?',  #
        # deep lament
        ANSWER: NOT_ANSWERED,
        VERSE: NOT_VERSE
    },
    {
        QUESTION: "can God's heart be troubled?",
        ANSWER: NOT_ANSWERED,
        VERSE: NOT_VERSE
    },
    {
        QUESTION: 'what did God feel when he saw mankind\'s wickedness?',
        ANSWER: 'God\'s heart was deeply troubled because of how great humans\'s wickedness was.',
        VERSE: '{} 6:6'.format(Book.genesis)
    },
    {
        QUESTION: 'why did God wipe all mankind, the animals that walk the ground, and the birds?',
        ANSWER: 'Because of how great mankind wickedness was, God wiped away all things that moved on the ground and '
                'flew through the air, except Noah and his family. ',
        VERSE: '{} 6:5-{} 6:8'.format(Book.genesis, Book.genesis)
    },
    {
        QUESTION: 'who was the only one that found favor when God was going to destroy the world with a flood?',
        ANSWER: 'Noah and his family were the only ones that found favor in God\'s eyes when the world was going to '
                'be destroyed. ',
        VERSE: '{} 6:7-{} 6:8, {} 7:1'.format(Book.genesis, Book.genesis, GENESIS)
    },
    {
        QUESTION: 'why did Noah find favor in God\'s eyes?',
        ANSWER: 'Noah was a righteous man, blameless among the people of his time who walked with God.',
        VERSE: '{} 6:9, {} 7:1'.format(GENESIS, GENESIS)
    },
    {
        QUESTION: 'what were people like in Noah\'s time?',
        ANSWER: 'The world was corrupted, full of violence, everything they did, and all the thoughts in people\'s '
                'hearts were wicked all the time. ',
        VERSE: '{} 6:5, {} 6:11-{} 6:12'.format(GENESIS, GENESIS, GENESIS)
    },
    {
        QUESTION: 'how bad can mankind get?',
        ANSWER: 'Without God, the world can be full of perversion, violence, with everything people think and do be '
                'wicked all time.',
        VERSE: '{} 6:5, {} 6:11-{} 6:12'.format(GENESIS, GENESIS, GENESIS)
    },
    {
        QUESTION: 'who\'s fault was it that the earth wicked in Noah\'s time?',
        ANSWER: 'The people filled the earth with wickedness and violence, and because of that God destroyed the earth.',
        VERSE: '{} 6:11-{} 6:13'.format(GENESIS, GENESIS)
    },
    {
        QUESTION: 'what did God command Noah to build?',
        ANSWER: 'God commanded Noah to build an ark.',
        VERSE: '{} 6:14'.format(GENESIS)
    },
    {
        QUESTION: 'how was Noah suppose to build the ark?',
        ANSWER: 'The ark was suppose to be built using gopherwood (cypress in the NIV). It was to have rooms coated '
                'inside and out with pitch. ',
        VERSE: '{} 6:14'.format(GENESIS)
    },
    {
        QUESTION: 'what kind of wood was Noah suppose to use to build the ark?',
        ANSWER: 'The hebrew word is transliterated as gopherwood, which is only known and used once in original '
                'scripture.  Different translations use timber, cypress, lumber, cedar, etc.',
        VERSE: '{} 6:14'.format(GENESIS)
    },
    {
        QUESTION: 'what is gopher wood?',
        ANSWER: 'Gopher is the term transliterated from the original scriptures to describe the type of wood '
                'Noah was to use to build the ark. It is only known and used once. Different translations use timber, '
                'cypress, lumber, cedar, etc. ',
        VERSE: '{} 6:14'.format(GENESIS)
    },
    {
        QUESTION: 'what is pitch?',
        ANSWER: 'Pitch coating used to in buildings and vessels. ',
        VERSE: '{} 6:14'.format(GENESIS)
    },
    {
        QUESTION: 'what are the measurements of Noah\'s ark?',
        ANSWER: 'Noah\'s ark was 300 cubits long, 50 cubits wide, and 30 cubits high.',
        VERSE: '{} 6:15'.format(GENESIS)
    },
    {
        QUESTION: 'How long was Noah\'s ark?',
        ANSWER: 'Noah\'s ark was 300 cubits long.',
        VERSE: '{} 6:15'.format(GENESIS)
    },
    {
        QUESTION: 'How wide was Noah\'s ark?',
        ANSWER: 'Noah\'s ark was 50 cubits wide.',
        VERSE: '{} 6:15'.format(GENESIS)
    },
    {
        QUESTION: 'How tall was Noah\'s ark?',
        ANSWER: 'Noah\'s ark was 30 cubits tall.',
        VERSE: '{} 6:15'.format(GENESIS)
    },
    {
        QUESTION: 'how long is a cubit?',
        ANSWER: 'There are different lengths for a cubit in the ancient world.  Generally a cubit the length from the '
                'elbow to the longest finger in the hand. ',
        VERSE: NO_REFERENCE
    },
    {
        QUESTION: 'how tall was the roof opening on Noah\'s ark?',
        ANSWER: 'The roof opening was one cubit high all around.',
        VERSE: '{} 6:16'.format(GENESIS)
    },
    {
        QUESTION: 'where was the door opening on Noah\'s ark?',
        ANSWER: 'The door was located on the side of the ark.',
        VERSE: '{} 6:16'.format(GENESIS)
    },
    {
        QUESTION: 'how many decks did Noah\'s ark have?',
        ANSWER: 'The ark that Noah and his family built had three decks. Lower, middle, and upper decks.',
        VERSE: '{} 6:16'.format(GENESIS)
    },
    {
        QUESTION: 'how did God destroy the earth in Noah\'s time?',
        ANSWER: 'God made it rain for 40 days and 40 nights. He brought the flood waters to destroy everything that '
                'lived on the earth.',
        VERSE: '{} 6:17, {} 7:4, {} 7:12, {} 7:14'.format(GENESIS, GENESIS, GENESIS, GENESIS)
    },
    {
        QUESTION: 'who where the people saved from the flood?',
        ANSWER: 'Noah, his wife, his sons, and their wives were the only people saved from the flood. They entered '
                'the ark during the great flood.',
        VERSE: '{} 6:18, {} 7:1, {} 7:7, {} 7:13'.format(GENESIS, GENESIS, GENESIS, GENESIS)
    },
    {
        QUESTION: 'what animals did Noah bring into the ark?',
        ANSWER: 'God commanded Noah to bring into the ark a pair of every kind of bird and animal the moves along the '
                'ground according to their kinds. He had to bring 7 pairs of clean animals and birds, and one pair of '
                'unclean animals and birds.  A pair is made up of a male and female. ',
        VERSE: '{} 6:19-{} 6:20, {} 7:8-{} 7:9, {} 7:14, {} 7:15'.format(GENESIS, GENESIS, GENESIS, GENESIS, GENESIS,
                                                                         GENESIS),
        NOTE: 'Genesis 7:2 gives a different number then 6:19,6:20'
    },
    {
        QUESTION: 'what did Noah, his family, and all the animals eat while inside the ark?',
        ANSWER: 'God commanded Noah to take and store all the food the animals and his family needed to eat.',
        VERSE: '{} 6:20-{} 6:21'.format(GENESIS, GENESIS)
    },
    {
        QUESTION: 'how did Noah respond to God\'s commands of building the ark, taking the animals and storing food?',
        ANSWER: 'Noah did everything just as God commanded.',
        VERSE: '{} 6:14-{} 6:16, {} 6:19-{} 6:22, {} 7:5'.format(GENESIS, GENESIS, GENESIS, GENESIS, GENESIS)
    },
    {
        QUESTION: NO_QUESTION,
        VERSE: '{} 7:2'.format(GENESIS)
    },
    {
        QUESTION: NO_QUESTION,
        VERSE: '{} 7:3'.format(GENESIS)
    },
    {
        QUESTION: 'how early did God warn Noah about the rains and floodwaters?',
        ANSWER: 'The bible only specifies that God commanded Noah to build the ark and how he would destroy the '
                'world. Then warned him seven days before the rains came.',
        VERSE: '{} 7:4, {} 7:10'.format(GENESIS, GENESIS),
    },
    {
        QUESTION: 'how long did it rain when God sent the floodwaters in Noah\'s time?',
        ANSWER: 'It rained for 40 days and 40 nights when God sent the great flood in Noah\'s time.',
        VERSE: '{} 7:4, {} 7:12, {} 7:14'.format(GENESIS, GENESIS, GENESIS)
    },
    {
        QUESTION: 'how old was Noah when God flooded the world?',
        ANSWER: 'Noah was 600 years, 2 months and 7 days old when God sent the great flood. ',
        VERSE: '{} 7:6'.format(GENESIS)
    },
    {
        QUESTION: 'where did the great flood come from?',
        ANSWER: 'God sent the great flood to destroy the world. God opened up the great waters from the sky, '
                'and the great waters from under the ground to flood the earth. ',
        VERSE: '{} 7:11, {} 8:2'.format(GENESIS, GENESIS)
    },
    {
        QUESTION: 'who closed the ark?',
        ANSWER: 'After all the animals and Noah and his family entered the ark, God closed them in.',
        VERSE: '{} 7:16'.format(GENESIS)
    },
    {
        QUESTION: 'for how long did the flood waters kept rising?',
        ANSWER: 'the waters of the great flood kept rising for 40 days.',
        VERSE: '{} 7:17, {} 7:19, {} 6:18, {} 7:1, {} 7:7, {} 7:13'.format(GENESIS, GENESIS, GENESIS, GENESIS, GENESIS,
                                                                           GENESIS)
    },
    {
        QUESTION: 'did the ark float?',
        ANSWER: 'The flood waters rose and lifted the ark. The ark floated to the surface of the water.',
        VERSE: '{} 7:17-{} 7:18'.format(GENESIS, GENESIS)
    },
    {
        QUESTION: 'did the flood cover everything?',
        ANSWER: 'The flood was so great that it covered even the highest mountains. It covered the mountains more '
                'than (estimated) 20 feet.',
        VERSE: '{} 7:17-{} 7:20'
    },
    {
        QUESTION: 'did everything outside the ark die during the great flood?',
        ANSWER: 'Everything that walked on the ground and flew in the sky that was not inside the ark died in the '
                'great flood.',
        VERSE: '{} 7:21-{} 7:23'.format(GENESIS, GENESIS)
    },
    {
        QUESTION: 'how long did flood last?',
        ANSWER: 'During the great flood, it rained for 40 day and 40 nights and the world was flooded 150 days.',
        VERSE: '{} 7:4, {} 7:12, {} 7:14, {} 7:24, {} 8:3'.format(GENESIS, GENESIS, GENESIS, GENESIS, GENESIS)
    }
    # remembered - is an expressions used. 'pendiente' - dad
    ,
    {
        QUESTION: 'did God ever forget?',
        ANSWER: NOT_ANSWERED,
        VERSE: '{} 8:1'.format(GENESIS)
    },
    {
        QUESTION: 'how did God stop the flood?',
        ANSWER: 'God sent a wind over all the earth, and closed the floodgates in the heavens and the deep, '
                'and stopped the rains. The waters slowly fell back. ',
        VERSE: '{} 8:1-{} 8:3'.format(GENESIS, GENESIS)
    },
    {
        QUESTION: 'where did Noah\'s ark end up?',
        ANSWER: 'When the waters of the great flood subsided, the ark ended up on the mountains of Ararat.',
        VERSE: '{} 8:4'.format(GENESIS)
    },
    {
        QUESTION: 'where are the mountains of Ararat located?',
        ANSWER: 'The mountains of Ararat are located in Turkey.',
        VERSE: '{} 8:4'.format(GENESIS)
    },
    {
        QUESTION: 'when did the ark finally rest on the mountains?',
        ANSWER: 'The ark came to rest on the 17th day of the 7th month, on the year of the flood.',
        VERSE: '{} 8:4'.format(GENESIS)
    },
    {
        QUESTION: 'after the Ararat mountains, when did the rest of the mountains become visible?',
        ANSWER: 'The rest of the mountains became visible on the 1st day of the 10th month, on year of the flood.',
        VERSE: '{} 8:5'.format(GENESIS)
    },
    {
        QUESTION: 'when did Noah look out of the ark?',
        ANSWER: 'Noah looked out through a window after forty days.',
        VERSE: '{} 8:6'.format(GENESIS),
        NOTE: 'Need to make sure that this verse refers to the forty days after it stopped raining.'
    },
    {
        QUESTION: 'what did Noah first sent out to find land?',
        ANSWER: 'Noah sent out a raven to find land, but it kept flying back and forth.',
        VERSE: '{} 8:7'.format(GENESIS)
    },
    {
        QUESTION: 'what did Noah send out after the raven?',
        ANSWER: 'After the raven, Noah sent out a dove to see if the waters had gone down.',
        VERSE: '{} 8:8'.format(GENESIS)
    },
    {
        QUESTION: 'what was the second animal noah sent out to look for land?',
        ANSWER: 'The second animal Noah sent out to look for land was a dove.',
        VERSE: '{} 8:8'.format(GENESIS)
    },
    {
        QUESTION: 'what were the animal that Noah sent out to look for land?',
        ANSWER: 'Noah first sent out a raven, then he sent out a dove to look for land.',
        VERSE: '{} 8:7-{} 8:8'.format(GENESIS, GENESIS)
    },
    {
        QUESTION: 'how many times did Noah sent out the dove to look for land?',
        ANSWER: 'Noah sent out the dove 3 times to look for land. The first time it did not find any land. The second '
                'time it found an olive tree. The third time it did not return. ',
        VERSE: '{} 8:8-{} 8:12'.format(GENESIS, GENESIS)
    },
    {
        QUESTION: 'what did the dove find the first time Noah sent it out to find land?',
        ANSWER: 'The first time that Noah sent out the dove, it did not find anything?',
        VERSE: '{} 8:8-{} 8:9'.format(GENESIS, GENESIS)
    },
    {
        QUESTION: 'why did the dove not find anything the first time it went out?',
        ANSWER: 'The dove could not find anywhere to rest the first time it went out, because everything was still '
                'covered by the floodwaters. ',
        VERSE: '{} 8:9'.format(GENESIS)
    },
    {
        QUESTION: 'how long did Noah wait, until he sent out the dove again after it returned?',
        ANSWER: 'Noah waited 7 days before he sent out the dove again.',
        VERSE: '{} 8:10, {} 8:12'.format(GENESIS, GENESIS)
    },
    {
        QUESTION: 'what did the dove find on the second time Noah sent it out?',
        ANSWER: 'On the second time the dove was sent out, it found a an olive tree, which it took of a leaf and '
                'brought it back to Noah.',
        VERSE: '{} 8:11'.format(GENESIS)
    },
    {
        QUESTION: 'how did Noah know that the flood waters were going down?',
        ANSWER: 'The second time that the dove returned, it had a olive leaf it took from a tree. This is how Noah '
                'knew the floodwaters were going down. ',
        VERSE: '{} 8:11'.format(GENESIS)
    },
    {
        QUESTION: 'what happened to the dove on the third time Noah sent it out?',
        ANSWER: 'On the third time that Noah sent out the dove, it did not return.',
        VERSE: '{} 8:12'.format(GENESIS)
    },
    {
        QUESTION: 'when did the floodwaters dry up from the earth?',
        ANSWER: 'By the  1st day of the 1st month, on the year that Noah was 601 years old, Noah could see the dry '
                'land, and by the 27th day of the second month all the water from the great flood was completely '
                'gone. ',
        VERSE: '{} 8:13-{} 8:14'.format(GENESIS, GENESIS)
    },
    {
        QUESTION: 'when did Noah come out of the ark?',
        ANSWER: 'God commanded Noah, his family, and all the animals inside the ark to come out, after the waters had '
                'dried up. ',
        VERSE: '{} 8:14-{} 8:19'.format(GENESIS, GENESIS)
    },
    {
        QUESTION: 'what did Noah do after coming out of the ark?',
        ANSWER: 'Noah built an altar for the Lord, and sacrificed some of the clean animals?',
        VERSE: '{} 8:20'.format(GENESIS)
    },
    {
        QUESTION: 'did Noah kill some of the animals he had in the ark?',
        ANSWER: 'After everything came out of the ark, Noah sacrificed some of the clean animals and birds he had '
                'with him. He had 7 pairs of all the clean animals and birds, not just 1. ',
        VERSE: '{} 7:2-{} 7:3, {} 8:20'.format(GENESIS, GENESIS, GENESIS)
    },
    {
        QUESTION: 'did God promise never to destroy the world again?',
        ANSWER: 'God promised he would not curse the ground because of mankind\'s evil, or destroy every living thing '
                'as he did with the great flood again. ',
        VERSE: '{} 8:21'.format(GENESIS)
    },
    {
        QUESTION: 'how early do people have evil in them?',
        ANSWER: 'Mankind has evil thoughts in their hearts as early is childhood.',
        VERSE: '{} 8:21'.format(GENESIS)
    },
    {
        QUESTION: 'are kids evil?',
        ANSWER: 'Evil is in the hearts of people as early as childhood.',
        VERSE: '{} 8:21'.format(GENESIS),
        KEYWORDS: 'child children'

    },
    {
        QUESTION: 'will the seasons ever end?',
        ANSWER: 'As long as the earth exists, heat and cold,  seed-time and harvest, summer and winter, day and night '
                'will never end. That is what God All Mighty declared. ',
        VERSE: '{} 8:22'.format(GENESIS)
    },
    {
        QUESTION: 'can day time or night time ever end?',
        ANSWER: 'As long as the earth exists, heat and cold,  seed-time and harvest, summer and winter, day and night '
                'will never end. That is what God All Mighty declared. ',
        VERSE: '{} 8:22'.format(GENESIS)
    },
    {
        QUESTION: 'are all the animals naturally afraid mankind?',
        ANSWER: 'All the animals in the world naturally fear humans.',
        VERSE: '{} 9:2'.format(GENESIS)
    },
    {
        QUESTION: 'can I eat meat that still blood in it?',
        ANSWER: NOT_ANSWERED,
        VERSE: '{} 9:4'.format(GENESIS)
    },

    # MATHEWS
    {
        QUESTION: 'who is Jesus Christ?',
        ANSWER: 'Jesus Christ is the Messiah.',
        VERSE: '{} 1:1'.format(MATHEWS)
    }
}
