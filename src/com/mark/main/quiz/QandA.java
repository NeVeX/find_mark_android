package com.mark.main.quiz;

import android.util.Log;

public class QandA {

	public static CharSequence[] questionsList;
	public static CharSequence[][] answersList;
	public static CharSequence[] correctAnswer;
	private static int totalQuestions = 87;
	private static String logID = QandA.class.getName();
	
	public QandA() {
		questionsList = new CharSequence[totalQuestions];
		answersList = new CharSequence[totalQuestions][4];
		correctAnswer = new CharSequence[totalQuestions];
		setUpQuestionsAndAnswers();
		Log.d(logID, "All Questions and Answers Setup.");
	}
	
	private void setUpQuestionsAndAnswers()
	{
		int i = 0;
		// question 1
		questionsList[i] = "What Is Your Name?";
		answersList[i][0] = "Vanessa Hudgens";
		answersList[i][1] = "Adriana";
		answersList[i][2] = "Woman!";
		answersList[i][3] = "Brown Woman";
		correctAnswer[i] = "Adriana";
		i++;
		// question 2a - info test question
		questionsList[i] = "Ok Adriana, To Clarify, If I Asked The Question: 'Where Are You From?', The Correct Response Would Be?";
		answersList[i][0] = "I Am From Ireland";
		answersList[i][1] = "I Am From Texas";
		answersList[i][2] = "You Are From Ireland";
		answersList[i][3] = "You Are From Texas";
		correctAnswer[i] = "I Am From Texas";
		i++;
		// question 2a - info test question
		questionsList[i] = "Conversely, If I Asked The Question: 'Where Am I From?', The Correct Response Would Be?";
		answersList[i][0] = "I Am From Texas";
		answersList[i][1] = "You Are From Texas";
		answersList[i][2] = "You Are From Ireland";
		answersList[i][3] = "I Am From Ireland";
		correctAnswer[i] = "You Are From Ireland";
		i++;
		// question 2
		questionsList[i] = "Now That Have Cleared Up How To Play, Adriana, Who Do You Love?";
		answersList[i][0] = "Jesus";
		answersList[i][1] = "Zac Efron";
		answersList[i][2] = "Mike Rowe/Rob Lowe";
		answersList[i][3] = "Mark";
		correctAnswer[i] = "Mark";
		i++;
		// question 3
		questionsList[i] = "When Is My [Mark's] Birthday?";
		answersList[i][0] = "9/6/1985";
		answersList[i][1] = "6/9/1986";
		answersList[i][2] = "9/6/1986";
		answersList[i][3] = "6/6/1985";
		correctAnswer[i] = "6/9/1986";
		i++;
		// question 4
		questionsList[i] = "Who Is My Favourite Sports Team?";
		answersList[i][0] = "Bruins";
		answersList[i][1] = "Celtics";
		answersList[i][2] = "Liverpool";
		answersList[i][3] = "Galway";
		correctAnswer[i] = "Liverpool";
		i++;
		// question 5
		questionsList[i] = "What Is My Mother's Name?";
		answersList[i][0] = "Mary";
		answersList[i][1] = "Ellen";
		answersList[i][2] = "Eileen";
		answersList[i][3] = "Niamh";
		correctAnswer[i] = "Eileen";
		i++;
		// question 6
		questionsList[i] = "What Is My Father's [Common] Name?";
		answersList[i][0] = "John";
		answersList[i][1] = "Frank";
		answersList[i][2] = "Jack";
		answersList[i][3] = "Francis";
		correctAnswer[i] = "Frank";
		i++;
		// question 7
		questionsList[i] = "What Is My Father's [Real] Name?";
		answersList[i][0] = "James";
		answersList[i][1] = "Francis";
		answersList[i][2] = "Richard";
		answersList[i][3] = "John";
		correctAnswer[i] = "John";
		i++;
		// question 8
		questionsList[i] = "What Is My Hometown Name?";
		answersList[i][0] = "Renmore";
		answersList[i][1] = "Galway";
		answersList[i][2] = "Dunmore";
		answersList[i][3] = "Tuam";
		correctAnswer[i] = "Dunmore";
		i++;
		// question 9
		questionsList[i] = "Who Is My Eldest Sister?";
		answersList[i][0] = "Caitriona";
		answersList[i][1] = "Sharon";
		answersList[i][2] = "Mary";
		answersList[i][3] = "Susan";
		correctAnswer[i] = "Caitriona";
		i++;
		// question 10
		questionsList[i] = "What Is My Middle Name?";
		answersList[i][0] = "Frank";
		answersList[i][1] = "James";
		answersList[i][2] = "John";
		answersList[i][3] = "Francis";
		correctAnswer[i] = "Francis";
		i++;
		// question 11
		questionsList[i] = "What Brand Is My New Electric Guitar?";
		answersList[i][0] = "Fender";
		answersList[i][1] = "Yamaha";
		answersList[i][2] = "Washburn";
		answersList[i][3] = "Samick";
		correctAnswer[i] = "Washburn";
		i++;
		// question 12
		questionsList[i] = "What Song Did I Play At My Secondary School Graduation?";
		answersList[i][0] = "Boston - More Than A Feeling";
		answersList[i][1] = "Sixpence None The Richer - Kiss Me";
		answersList[i][2] = "Coldplay - Yellow";
		answersList[i][3] = "SemiSonic - Closing Time";
		correctAnswer[i] = "SemiSonic - Closing Time";
		i++;
		// question 13
		questionsList[i] = "What Is My Favourite TV Show?";
		answersList[i][0] = "Extras";
		answersList[i][1] = "The Office [UK]";
		answersList[i][2] = "Arrested Development";
		answersList[i][3] = "Toddlers And Tiaras";
		correctAnswer[i] = "Arrested Development";
		i++;
		// question 14
		questionsList[i] = "El Nino Bebe";
		answersList[i][0] = "The Girl Child Drinks";
		answersList[i][1] = "The Man Drinks";
		answersList[i][2] = "The Girl Child Eats";
		answersList[i][3] = "The Boy Child Drinks";
		correctAnswer[i] = "The Boy Child Drinks";
		i++;
		// question 15
		questionsList[i] = "Bhris me an fhuinneog";
		answersList[i][0] = "The Boy Child Drinks";
		answersList[i][1] = "I Have A Drink";
		answersList[i][2] = "I Broke The Window";
		answersList[i][3] = "Leave Me Alone Will Ya";
		correctAnswer[i] = "I Broke The Window";
		i++;
		// question 16
		questionsList[i] = "My Favourite Band In Secondary School/College?";
		answersList[i][0] = "Boston";
		answersList[i][1] = "Jimmy Eat World";
		answersList[i][2] = "Metallica";
		answersList[i][3] = "The Shins";
		correctAnswer[i] = "Jimmy Eat World";
		
		// 2nd phase
		
		i++;
		// question 17
		questionsList[i] = "In the General Sense, What Degree Do I Hold?";
		answersList[i][0] = "Computer Science";
		answersList[i][1] = "Mathematical Science";
		answersList[i][2] = "Computer Engineering";
		answersList[i][3] = "Mathematics And Computer Science";
		correctAnswer[i] = "Mathematics And Computer Science";
		i++;
		// question 18
		questionsList[i] = "What Is My Career Title?";
		answersList[i][0] = "NNNeeerrrrrDD";
		answersList[i][1] = "Software Developer";
		answersList[i][2] = "IT Consultant";
		answersList[i][3] = "Fixes Computers";
		correctAnswer[i] = "Software Developer";
		i++;
		// question 19
		questionsList[i] = "What Province Am I From In Ireland?";
		answersList[i][0] = "Ulster";
		answersList[i][1] = "Connacht";
		answersList[i][2] = "Munster";
		answersList[i][3] = "Leinster";
		correctAnswer[i] = "Connacht";
		i++;
		// question 20
		questionsList[i] = "What Food Is Sure To Give Me Heartburn?";
		answersList[i][0] = "Burgers";
		answersList[i][1] = "Curry Cheese Chips";
		answersList[i][2] = "Salads";
		answersList[i][3] = "Chilli";
		correctAnswer[i] = "Curry Cheese Chips";
		i++;
		// question 21
		questionsList[i] = "What Greasy Food Do I Miss Most From Home?";
		answersList[i][0] = "Cheese Burgers";
		answersList[i][1] = "Greasy Potatoes";
		answersList[i][2] = "Kebabs";
		answersList[i][3] = "Curry Cheese Chips";
		correctAnswer[i] = "Kebabs";
		i++;
		// question 22
		questionsList[i] = "What Is The Best Ingredient In Popsicles?";
		answersList[i][0] = "Skittles";
		answersList[i][1] = "Nerds";
		answersList[i][2] = "Orange Juice";
		answersList[i][3] = "Lime";
		correctAnswer[i] = "Nerds";
		i++;
		// question 23
		questionsList[i] = "What Was The Name Of That Eye Condition I Had Last Year?";
		answersList[i][0] = "Trachoma";
		answersList[i][1] = "Keratitis";
		answersList[i][2] = "Pink Eye";
		answersList[i][3] = "Iritis";
		correctAnswer[i] = "Iritis";
		i++;
		// question 24
		questionsList[i] = "To Me, The Best Boobs Are?";
		answersList[i][0] = "Big Boobs!";
		answersList[i][1] = "Small Boobs!";
		answersList[i][2] = "Proportional Boobs!";
		answersList[i][3] = "All Boobs!";
		correctAnswer[i] = "Proportional Boobs!";
		i++;
		// question 25
		questionsList[i] = "What Is My Phone Number?";
		answersList[i][0] = "617-413-4135";
		answersList[i][1] = "617-413-4125";
		answersList[i][2] = "617-413-5125";
		answersList[i][3] = "617-413-5135";
		correctAnswer[i] = "617-413-4125";
		i++;
		// question 26
		questionsList[i] = "How Tall Am I?";
		answersList[i][0] = "5 FT 10 IN";
		answersList[i][1] = "5 FT 8 IN";
		answersList[i][2] = "6 FT";
		answersList[i][3] = "5 FT 6 IN";
		correctAnswer[i] = "5 FT 10 IN";
		i++;
		// question 27
		questionsList[i] = "My Current Waist Size?";
		answersList[i][0] = "32 IN";
		answersList[i][1] = "34 IN";
		answersList[i][2] = "36 IN";
		answersList[i][3] = "38 IN";
		correctAnswer[i] = "32 IN";
		i++;
		// question 28
		questionsList[i] = "If I Was To Get A Tattoo, What Would It Be Of?";
		answersList[i][0] = "Me";
		answersList[i][1] = "Some Chinese Shit";
		answersList[i][2] = "The Triforce";
		answersList[i][3] = "A Dead Rose In A Vase";
		correctAnswer[i] = "The Triforce";
		i++;
		// question 29
		questionsList[i] = "What Is The Name Of The Crisps I Love In Cheese Sandwiches?";
		answersList[i][0] = "Walkers";
		answersList[i][1] = "Lays";
		answersList[i][2] = "Kings";
		answersList[i][3] = "Taytos";
		correctAnswer[i] = "Taytos";
		i++;
		// question 30
		questionsList[i] = "What Event Happened When I Was Young That Made Me Afraid Of Bulls For Awhile?";
		answersList[i][0] = "A Bull Charged You";
		answersList[i][1] = "A Bull Trampled On You";
		answersList[i][2] = "A Bull Kicked You";
		answersList[i][3] = "A Bull Hit You With His Horns";
		correctAnswer[i] = "A Bull Kicked You";
		i++;
		// question 31
		questionsList[i] = "What Did My Dad Do To Me After He Saw Me Get Crippled By The Bull?";
		answersList[i][0] = "Came To Your Rescue";
		answersList[i][1] = "Yelled At You";
		answersList[i][2] = "Kicked You Further";
		answersList[i][3] = "Hugged You";
		correctAnswer[i] = "Yelled At You";
		i++;
		// question 32
		questionsList[i] = "Do I Love You?";
		answersList[i][0] = "Nope!";
		answersList[i][1] = "Yes!";
		answersList[i][2] = "Kinda!";
		answersList[i][3] = "Only When We Do It";
		correctAnswer[i] = "Yes!";
		i++;
		// question 33
		questionsList[i] = "Am I Very Happy With You?";
		answersList[i][0] = "Nope! You Are Sad With Me";
		answersList[i][1] = "Only When We Do It";
		answersList[i][2] = "Yes! All The Time";
		answersList[i][3] = "Only On Tuesdays";
		correctAnswer[i] = "Yes! All The Time";
		i++;
		// question 34
		questionsList[i] = "Do You Think Kevin James Is Hot?";
		answersList[i][0] = "No!";
		answersList[i][1] = "No!";
		answersList[i][2] = "No!";
		answersList[i][3] = "No!";
		correctAnswer[i] = "No!";
		i++;
		// question 35
		questionsList[i] = "Comparatively, Do You Think Nicholos Cage Is Hot?";
		answersList[i][0] = "OMG! He's So Hot Mark!";
		answersList[i][1] = "OMG! He's So Hot Mark!";
		answersList[i][2] = "OMG! He's So Hot Mark!";
		answersList[i][3] = "OMG! He's So Hot Mark!";
		correctAnswer[i] = "OMG! He's So Hot Mark!";
		i++;
		// question 36
		questionsList[i] = "And Do You Think I'm Hot?";
		answersList[i][0] = "You're In Between Kevin And Nicholos";
		answersList[i][1] = "You're Not As Hot As Kevin";
		answersList[i][2] = "You Are Hotter Then Nicholos";
		answersList[i][3] = "You? Hot?......**LAUGHS**";
		correctAnswer[i] = "You Are Hotter Then Nicholos";
		i++;
		// question 37
		questionsList[i] = "My Favourite Game Of All Time?";
		answersList[i][0] = "Mario";
		answersList[i][1] = "Portal 2";
		answersList[i][2] = "Zelda";
		answersList[i][3] = "Angry Birds";
		correctAnswer[i] = "Zelda";
		i++;
		// question 38
		questionsList[i] = "What Type Of Visa Do I Hold Here In The States?";
		answersList[i][0] = "L-1";
		answersList[i][1] = "J-1";
		answersList[i][2] = "H-1B";
		answersList[i][3] = "B-1";
		correctAnswer[i] = "H-1B";
		i++;
		// question 39
		questionsList[i] = "What Unusual Pet Did I Have When I Was Young?";
		answersList[i][0] = "A Lizard";
		answersList[i][1] = "A Calf";
		answersList[i][2] = "A LadyBird";
		answersList[i][3] = "A Wolf";
		correctAnswer[i] = "A Calf";
		i++;
		// question 40
		questionsList[i] = "What Did I Do With You That I Didn't Do With Others When We Started Dating?";
		answersList[i][0] = "You Made Me Pay For Everything";
		answersList[i][1] = "You Ignored Me";
		answersList[i][2] = "You Saw Me On The Weekends";
		answersList[i][3] = "You Called Me";
		correctAnswer[i] = "You Saw Me On The Weekends";
		i++;
		// question 41
		questionsList[i] = "What Do I call Bloomingdales - The ______ Store?";
		answersList[i][0] = "Crap";
		answersList[i][1] = "Overpriced";
		answersList[i][2] = "Don't Bring Your Parents There";
		answersList[i][3] = "Dress";
		correctAnswer[i] = "Dress";
		
		
		// 3rd phase
		i++;
		// question 42
		questionsList[i] = "What Hair Style Do I Love To See On You?";
		answersList[i][0] = "No Hairstyle";
		answersList[i][1] = "Fringe At The Front";
		answersList[i][2] = "That Bump Thing At The Front Of My Hair";
		answersList[i][3] = "Straightened";
		correctAnswer[i] = "That Bump Thing At The Front Of My Hair";
		i++;
		// question 43
		questionsList[i] = "Out Of 10, How Hot Do I Think You Are?";
		answersList[i][0] = "6";
		answersList[i][1] = "7";
		answersList[i][2] = "11";
		answersList[i][3] = "9";
		correctAnswer[i] = "11";
		i++;
		// question 44
		questionsList[i] = "Last Week, You Did Something Weird At Six In The Morning, Whilst Asleep. What Was It?";
		answersList[i][0] = "I Fell Out Of The Bed";
		answersList[i][1] = "I Started Snoring";
		answersList[i][2] = "I Kept Kicking The Sheets Off The Bed";
		answersList[i][3] = "I Cuddled You";
		correctAnswer[i] = "I Kept Kicking The Sheets Off The Bed";
		
		
		
		// correct to here
		i++;
		// question 45
		questionsList[i] = "Out Of The List Below, What Am I Most Afraid Of?";
		answersList[i][0] = "Commitment";
		answersList[i][1] = "Clowns";
		answersList[i][2] = "Mice";
		answersList[i][3] = "Balloons";
		correctAnswer[i] = "Balloons";
		i++;
		// question 46
		questionsList[i] = "My Favourite Stout?";
		answersList[i][0] = "Murphy's";
		answersList[i][1] = "Guinness";
		answersList[i][2] = "Beamish";
		answersList[i][3] = "Samuel Adams";
		correctAnswer[i] = "Guinness";
		i++;
		// question 47
		questionsList[i] = "My Favourite Beer(s)?";
		answersList[i][0] = "Hieneken/Stella Artois";
		answersList[i][1] = "Corona/Budweiser";
		answersList[i][2] = "Bud Light";
		answersList[i][3] = "Guinness";
		correctAnswer[i] = "Hieneken/Stella Artois";
		i++;
		// question 48
		questionsList[i] = "My Favourite Short?";
		answersList[i][0] = "Vodka";
		answersList[i][1] = "Jack Daniels";
		answersList[i][2] = "Jameson";
		answersList[i][3] = "Maker's Mark";
		correctAnswer[i] = "Jack Daniels";
		i++;
		// question 49
		questionsList[i] = "My, Now, Favourite Shot?";
		answersList[i][0] = "Sambuca";
		answersList[i][1] = "Tequila";
		answersList[i][2] = "Jagermeister";
		answersList[i][3] = "None Of The Above";
		correctAnswer[i] = "None Of The Above";
		i++;
		// question 50
		questionsList[i] = "Which Margarita Did I Not Like At The Engagement Party Last Friday?";
		answersList[i][0] = "Shaddock";
		answersList[i][1] = "The Fallen Angel";
		answersList[i][2] = "Starlite Cocktail";
		answersList[i][3] = "Fist Full Of Dollars";
		correctAnswer[i] = "The Fallen Angel";
		i++;
		// question 51
		questionsList[i] = "I Recieved An Award From Fidelity Last Year For Hard Work. What Was The Reward?";
		answersList[i][0] = "A Gift Voucher For The Canteen";
		answersList[i][1] = "A 7% Raise";
		answersList[i][2] = "A 2.5% Raise";
		answersList[i][3] = "A $100 Debit Card";
		correctAnswer[i] = "A $100 Debit Card";
		i++;
		// question 52
		questionsList[i] = "How Long Have I Worked At Fidelity, Including Ireland?";
		answersList[i][0] = "2 Years";
		answersList[i][1] = "4 Years";
		answersList[i][2] = "3 Years";
		answersList[i][3] = "5 Years";
		correctAnswer[i] = "3 Years";
		i++;
		// question 53
		questionsList[i] = "On The Day We Met, What Activity Was I Attempting To Do?";
		answersList[i][0] = "Paintballing";
		answersList[i][1] = "Bungee Jump";
		answersList[i][2] = "Drinking";
		answersList[i][3] = "Sky Diving";
		correctAnswer[i] = "Sky Diving";
		i++;
		// question 54
		questionsList[i] = "When The Sky Diving Was Cancelled, I Rang Home To Inform Mom That...";
		answersList[i][0] = "Some One Died That Morning From Sky Diving";
		answersList[i][1] = "You Were Too Sick To Dive";
		answersList[i][2] = "It Was Too Windy";
		answersList[i][3] = "That You Loved Your Mom";
		correctAnswer[i] = "Some One Died That Morning From Sky Diving";
		i++;
		// question 55
		questionsList[i] = "What Was The First Musical Instrument I Learned?";
		answersList[i][0] = "Electric Guitar";
		answersList[i][1] = "Acoustic Guitar";
		answersList[i][2] = "Tin Whistle";
		answersList[i][3] = "The Triangle";
		correctAnswer[i] = "Tin Whistle";
		i++;
		// question 56
		questionsList[i] = "If My Best Mate, Mark, Was A Woman, Or Changed To One, I Would, With Your Consent...";
		answersList[i][0] = "Marry Him";
		answersList[i][1] = "Snog Him";
		answersList[i][2] = "Love Him More";
		answersList[i][3] = "Move To Australia";
		correctAnswer[i] = "Marry Him";
		i++;
		// question 57
		questionsList[i] = "My Other Best Friend's (Who Is Gay) Name Is?";
		answersList[i][0] = "Brian";
		answersList[i][1] = "Brendan";
		answersList[i][2] = "Bruce";
		answersList[i][3] = "Bill";
		correctAnswer[i] = "Brendan";
		i++;
		// question 58
		questionsList[i] = "This Morning [Monday 13th February], What Happened When We Woke?";
		answersList[i][0] = "We Did It";
		answersList[i][1] = "I Freaked Out";
		answersList[i][2] = "I Again Kicked The Sheets Off The Bed";
		answersList[i][3] = "You Asked Me To Read My Phone";
		correctAnswer[i] = "I Freaked Out";
		i++;
		// question 59
		questionsList[i] = "Do You Like To Walk Long Distances In High Heels?";
		answersList[i][0] = "Absolutely";
		answersList[i][1] = "Are You Fucking Kidding Me";
		answersList[i][2] = "Only If The Walk Is More Than 3 Miles";
		answersList[i][3] = "Only At Night";
		correctAnswer[i] = "Are You Fucking Kidding Me";
		i++;
		// question 60
		questionsList[i] = "Phonetically, I Think You Pronounce My Name Like....";
		answersList[i][0] = "Merk";
		answersList[i][1] = "Maurk";
		answersList[i][2] = "Mork";
		answersList[i][3] = "Murk";
		correctAnswer[i] = "Maurk";
		i++;
		// question 61
		questionsList[i] = "What One Thing About You Does Caitriona Say Over And Over To Me?";
		answersList[i][0] = "Mark, Make Me A Sandwich";
		answersList[i][1] = "Mark Is In A Bad Mood Today";
		answersList[i][2] = "Marrrrkkk....Don't You Love Me";
		answersList[i][3] = "Hey Honey Bunny";
		correctAnswer[i] = "Mark, Make Me A Sandwich";
		i++;
		// question 62
		questionsList[i] = "The Night Before I Met You, I Saw Which Band?";
		answersList[i][0] = "The Shins";
		answersList[i][1] = "Jet";
		answersList[i][2] = "We Were Promised Jetpacks";
		answersList[i][3] = "Jimmy Eat World";
		correctAnswer[i] = "Jimmy Eat World";
		i++;
		// question 63
		questionsList[i] = "When Is Our Anniversary?";
		answersList[i][0] = "2nd December";
		answersList[i][1] = "Like Hell If I'd Know";
		answersList[i][2] = "3rd Decemeber";
		answersList[i][3] = "5th Decemeber";
		correctAnswer[i] = "2nd December";
		i++;
		// question 64
		questionsList[i] = "What Blood Type Am I?";
		answersList[i][0] = "O";
		answersList[i][1] = "A";
		answersList[i][2] = "B";
		answersList[i][3] = "Mark, You've No Idea Anyhow";
		correctAnswer[i] = "Mark, You've No Idea Anyhow";
		i++;
		// question 65
		questionsList[i] = "Knowing Me Now, What Would You Think Is The Answer Below?";
		answersList[i][0] = "Correct Answer! Trust Me!";
		answersList[i][1] = "You're Always Messing With Me";
		answersList[i][2] = "Correct Answer! Trust Me!";
		answersList[i][3] = "Correct Answer! Trust Me!";
		correctAnswer[i] = "You're Always Messing With Me";
		i++;
		// question 66
		questionsList[i] = "My Current Favourite Cereal?";
		answersList[i][0] = "Frosted Shredded Wheat";
		answersList[i][1] = "Rice Krispies";
		answersList[i][2] = "Apple Zincs";
		answersList[i][3] = "Lucky Charms";
		correctAnswer[i] = "Frosted Shredded Wheat";
		i++;
		// question 67
		questionsList[i] = "My Favourite Soda?";
		answersList[i][0] = "Ginger Ale";
		answersList[i][1] = "Fanta";
		answersList[i][2] = "Coke";
		answersList[i][3] = "Sprite";
		correctAnswer[i] = "Fanta";
		i++;
		// question 68
		questionsList[i] = "What Is The Best Thing To Mix With Orange Juice?";
		answersList[i][0] = "Sprite";
		answersList[i][1] = "Nerds";
		answersList[i][2] = "Lime";
		answersList[i][3] = "Water";
		correctAnswer[i] = "Sprite";
		i++;
		// question 69
		questionsList[i] = "What Phone Am I Waiting To Be Released Soon So I Can Buy?";
		answersList[i][0] = "Galaxy Nexus";
		answersList[i][1] = "Nexus Prime";
		answersList[i][2] = "Galaxy S3";
		answersList[i][3] = "Droid 4";
		correctAnswer[i] = "Galaxy S3";
		i++;
		// question 70
		questionsList[i] = "What Is Missing Over There....I Am Pointing To The Night Stand....";
		answersList[i][0] = "your c....ck";
		answersList[i][1] = "your C...ck";
		answersList[i][2] = "your c..CK";
		answersList[i][3] = "YOUR COCK!!!!";
		correctAnswer[i] = "YOUR COCK!!!!";
		i++;
		// question 71
		questionsList[i] = "Would My Parents Of Heard The Previous Answer?";
		answersList[i][0] = "Maybe";
		answersList[i][1] = "No";
		answersList[i][2] = "I Think So";
		answersList[i][3] = "Yes! Even If They Were In Ireland Too";
		correctAnswer[i] = "Yes! Even If They Were In Ireland Too";
		i++;
		// question 72
		questionsList[i] = "What Make Is My Personal Laptop?";
		answersList[i][0] = "HP";
		answersList[i][1] = "Samsung";
		answersList[i][2] = "Acer";
		answersList[i][3] = "Dell";
		correctAnswer[i] = "Acer";
		i++;
		// question 73
		questionsList[i] = "What Did People Think I Had On My First Day At Work Here?";
		answersList[i][0] = "A Cool Accent";
		answersList[i][1] = "Swine Flu";
		answersList[i][2] = "The Mumps";
		answersList[i][3] = "A Great Sense Of Fashion";
		correctAnswer[i] = "Swine Flu";
		i++;
		// question 74
		questionsList[i] = "At My Communion, What Did I Do When Recieving The Body Of Christ?";
		answersList[i][0] = "Bent Over";
		answersList[i][1] = "Kneeled Down";
		answersList[i][2] = "Saluted The Priest";
		answersList[i][3] = "Gave A Thumbs Up";
		correctAnswer[i] = "Saluted The Priest";
		i++;
		// question 75
		questionsList[i] = "What Did We Have For Dinner Last Night (13th Feb)?";
		answersList[i][0] = "Chicken Stir Fry";
		answersList[i][1] = "Steak, Fries And Pasta";
		answersList[i][2] = "Pizza";
		answersList[i][3] = "Sandwiches";
		correctAnswer[i] = "Steak, Fries And Pasta";
		i++;
		// question 76
		questionsList[i] = "What Happened The Last Time I Was Hungry For Your...No-No Parts?";
		answersList[i][0] = "You Turned Into A Beast";
		answersList[i][1] = "We Made Very Loud Noises";
		answersList[i][2] = "We Did It For 2 Hours";
		answersList[i][3] = "Your Laptop Got Destroyed";
		correctAnswer[i] = "Your Laptop Got Destroyed";
		i++;
		// question 77
		questionsList[i] = "So, I Told You Last Night I Needed To Do Work, When Really I Was?";
		answersList[i][0] = "Looking At Porn";
		answersList[i][1] = "Coding This Very Application";
		answersList[i][2] = "On Slickdeals";
		answersList[i][3] = "Doing Work";
		correctAnswer[i] = "Coding This Very Application";
		i++;
		// question 78
		questionsList[i] = "What Yummy Food Are You Making Right Now After Dinner (13th Feb)?";
		answersList[i][0] = "More Steak";
		answersList[i][1] = "Popsicles";
		answersList[i][2] = "Sherbet";
		answersList[i][3] = "Cake";
		correctAnswer[i] = "Sherbet";
		i++;
		// question 79
		questionsList[i] = "What Do Door Arches Make Me Do?";
		answersList[i][0] = "Make You Walk Through Them";
		answersList[i][1] = "They Do Nothing To You";
		answersList[i][2] = "Make You Dance Seductively";
		answersList[i][3] = "Make You Nervous";
		correctAnswer[i] = "Make You Dance Seductively";
		i++;
		// question 80
		questionsList[i] = "So, Do I Really Love You Adriana?";
		answersList[i][0] = "Yes! 100%";
		answersList[i][1] = "Nope";
		answersList[i][2] = "Yes!";
		answersList[i][3] = "Yes! With Infinite Love!";
		correctAnswer[i] = "Yes! With Infinite Love!";
		i++;
		// question 81
		questionsList[i] = "Do I Think We'll 'Make It'?";
		answersList[i][0] = "Depends...";
		answersList[i][1] = "Probably Not";
		answersList[i][2] = "You Hope So";
		answersList[i][3] = "You Know So";
		correctAnswer[i] = "You Know So";
		i++;
		// question 82
		questionsList[i] = "Do I Think I Am The Luckiest Guy In The World?";
		answersList[i][0] = "You're Not As Lucky As Zac Efron";
		answersList[i][1] = "You're Pretty Lucky";
		answersList[i][2] = "You Are The Luckiest Person Alive";
		answersList[i][3] = "Luck? Hello! You Make Your Own Luck";
		correctAnswer[i] = "You Are The Luckiest Person Alive";
		i++;
		// question 83
		questionsList[i] = "Are You The Most Beautiful Girl On The Planet?";
		answersList[i][0] = "I'm Not As Hot As Vanessa Hudgens";
		answersList[i][1] = "Without Doubt, I'm The Hottest Girl Ever!";
		answersList[i][2] = "I'm Kinda Hot";
		answersList[i][3] = "Hot? Hello! You Are The Hot One Mark! Not Me.";
		correctAnswer[i] = "Without Doubt, I'm The Hottest Girl Ever!";
		i++;
		// question 84
		questionsList[i] = "Are You My Soulmate?";
		answersList[i][0] = "Nope!";
		answersList[i][1] = "I Don't Have A Soul";
		answersList[i][2] = "Yes. We Are Destined Soulmates";
		answersList[i][3] = "We Are Just Mates";
		correctAnswer[i] = "Yes. We Are Destined Soulmates";
		i++;
		// question 85
		questionsList[i] = "How Long Do I Think I Will Be Together With You And Happy In Love With You?";
		answersList[i][0] = "a";
		answersList[i][1] = "b";
		answersList[i][2] = "Forever";
		answersList[i][3] = "d";
		correctAnswer[i] = "Forever";
	}
}
