/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st10248141_quizgame;

import java.util.ArrayList;

/**
 *
 * @author lab_services_student
 */
public class GenerateQuestionPair {
    
    
    ArrayList<QuestionsAnswers> LiteratureQnA;
    ArrayList<QuestionsAnswers> SciFiQnA;
    ArrayList<QuestionsAnswers> SuperHeroQnA;
    ArrayList<QuestionsAnswers> AnimeQnA;
    ArrayList<QuestionsAnswers> FilmTVQnA;
    ArrayList<QuestionsAnswers> VideoGamesQnA;
    
    GenerateQuestionPair(){
        LiteratureQnA= new ArrayList<>(); 
        SciFiQnA = new ArrayList<>();
        SuperHeroQnA = new ArrayList<>();
        AnimeQnA = new ArrayList<>();
        FilmTVQnA= new ArrayList<>();
        VideoGamesQnA = new ArrayList<>();
        
LiteratureQnA.add(new QuestionsAnswers("Who is the author of the 'Harry Potter' book series?", new ArrayList<String>() {{
            add("J.K. Rowling");
            add("JK Rowling");
            add("J K Rowling");
            add("Rowling");
        }}));
      
LiteratureQnA.add(new QuestionsAnswers("In the 'Lord of the Rings' trilogy, what is the name of the powerful and corrupting ring that is central to the story?", new ArrayList<String>() {{
            add("The One Ring");
        }}));

        LiteratureQnA.add(new QuestionsAnswers("Which famous detective created by Sir Arthur Conan Doyle is known for his deductive reasoning and pipe-smoking?", new ArrayList<String>() {{
            add("Sherlock Holmes");
        }}));

        LiteratureQnA.add(new QuestionsAnswers("What is the title of the dystopian novel by George Orwell, in which the government uses 'Big Brother' to control and surveil its citizens?", new ArrayList<String>() {{
            add("1984");
        }}));

        LiteratureQnA.add(new QuestionsAnswers("In the 'Game of Thrones' book series by George R.R. Martin, what is the name of the continent where most of the story takes place?", new ArrayList<String>() {{
            add("Westeros");
        }}));

        LiteratureQnA.add(new QuestionsAnswers("Who wrote the epic fantasy series 'A Song of Ice and Fire,' which inspired the 'Game of Thrones' TV series?", new ArrayList<String>() {{
            add("George R.R. Martin");
        }}));

        LiteratureQnA.add(new QuestionsAnswers("What is the name of the fictional world in which J.R.R. Tolkien's 'The Hobbit' and 'The Lord of the Rings' are set?", new ArrayList<String>() {{
            add("Middle-earth");
        }}));

        LiteratureQnA.add(new QuestionsAnswers("Which Shakespearean play features the famous characters Romeo and Juliet?", new ArrayList<String>() {{
            add("'Romeo and Juliet'");
        }}));

        LiteratureQnA.add(new QuestionsAnswers("In Jane Austen's novel 'Pride and Prejudice,' who is the wealthy and proud character who falls in love with Elizabeth Bennet?", new ArrayList<String>() {{
            add("Mr. Darcy");
        }}));

        LiteratureQnA.add(new QuestionsAnswers("What is the title of the novel by Harper Lee that addresses issues of racial injustice in the American South?", new ArrayList<String>() {{
            add("To Kill a Mockingbird");
        }}));

        LiteratureQnA.add(new QuestionsAnswers("In which classic novel by Mary Shelley does the scientist Victor Frankenstein create a creature often referred to as 'Frankenstein's Monster'?", new ArrayList<String>() {{
            add("Frankenstein's Monster");
        }}));

        LiteratureQnA.add(new QuestionsAnswers("What is the name of the young wizard who is the central character in the 'Harry Potter' book series?", new ArrayList<String>() {{
            add("Harry Potter");
        }}));

        LiteratureQnA.add(new QuestionsAnswers("Who wrote the novel 'The Great Gatsby,' which is set in the Roaring Twenties and features characters like Jay Gatsby and Daisy Buchanan?", new ArrayList<String>() {{
            add("F. Scott Fitzgerald");
            add("F Scott Fitzgerald");
        }}));

        LiteratureQnA.add(new QuestionsAnswers("What is the title of the first book in C.S. Lewis's 'The Chronicles of Narnia' series?", new ArrayList<String>() {{
            add("The Lion, the Witch and the Wardrobe");
            add("The Lion the Witch and the Wardrobe");
        }}));

        LiteratureQnA.add(new QuestionsAnswers("Which dystopian novel by Ray Bradbury depicts a future society where books are banned and burned by the government?", new ArrayList<String>() {{
            add("Fahrenheit 451");
        }}));

        LiteratureQnA.add(new QuestionsAnswers("Who wrote the 'A Series of Unfortunate Events' book series, which follows the misadventures of the Baudelaire orphans?", new ArrayList<String>() {{
            add("Lemony Snicket (pseudonym for Daniel Handler)");
            add("Daniel Handler");
        }}));

        LiteratureQnA.add(new QuestionsAnswers("In which classic novel by Victor Hugo does the character Jean Valjean seek redemption while pursued by Inspector Javert?", new ArrayList<String>() {{
            add("Les Misérables");
            add("Les Miserables");
            add("Les Mis");
        }}));

        LiteratureQnA.add(new QuestionsAnswers("Who wrote the novel 'The Catcher in the Rye,' which follows the experiences of the troubled teenager Holden Caulfield?", new ArrayList<String>() {{
            add("J.D. Salinger");
            add("J.D Salinger");
            add("JD Salinger");
            add("J D Salinger");
        }}));

        LiteratureQnA.add(new QuestionsAnswers("What is the title of the classic novel by Charles Dickens that tells the story of the orphan Oliver Twist?", new ArrayList<String>() {{
            add("Oliver Twist");
        }}));



SciFiQnA.add(new QuestionsAnswers("Who is the author of the 'Foundation' series, which is considered a cornerstone of science fiction literature?", new ArrayList<String>() {{
            add("Isaac Asimov");
        }}));

        SciFiQnA.add(new QuestionsAnswers("In the 'Star Trek' series, what is the name of the spaceship that serves as the central setting for most of the series?", new ArrayList<String>() {{
            add("USS Enterprise");
            add("Enterprise");
            add("The USS Enterprise");
            add("The Enterprise");
        }}));

        SciFiQnA.add(new QuestionsAnswers("What is the name of the AI system aboard the spaceship Discovery One in the movie '2001: A Space Odyssey'?", new ArrayList<String>() {{
            add("HAL 9000");
        }}));

        SciFiQnA.add(new QuestionsAnswers("Who wrote the novel 'Dune,' which is often regarded as one of the greatest science fiction novels of all time?", new ArrayList<String>() {{
            add("Frank Herbert");
        }}));

        SciFiQnA.add(new QuestionsAnswers("What is the title of the science fiction film directed by Ridley Scott, featuring an android named David and the tagline 'In space, no one can hear you scream'?", new ArrayList<String>() {{
            add("Alien");
        }}));

        SciFiQnA.add(new QuestionsAnswers("In the 'Star Wars' series, what is the name of the desert planet that is the homeworld of Anakin and Luke Skywalker?", new ArrayList<String>() {{
            add("Tatooine");
        }}));

        SciFiQnA.add(new QuestionsAnswers("Who directed the 1982 science fiction film 'Blade Runner'?", new ArrayList<String>() {{
            add("Ridley Scott");
        }}));

        SciFiQnA.add(new QuestionsAnswers("In the TV series 'Stargate Atlantis,' what is the name of the city-like spacecraft that serves as the main setting for the show and is located in the Pegasus Galaxy?", new ArrayList<String>() {{
            add("Atlantis");
        }}));

        SciFiQnA.add(new QuestionsAnswers("In the TV series 'Doctor Who,' what is the name of the Doctor's time-traveling spaceship?", new ArrayList<String>() {{
            add("TARDIS");
        }}));

        SciFiQnA.add(new QuestionsAnswers("Who wrote the novel 'Neuromancer,' which is considered one of the seminal works of the cyberpunk genre?", new ArrayList<String>() {{
            add("William Gibson");
        }}));

        SciFiQnA.add(new QuestionsAnswers("In the 'Matrix' film series, what is the real-world name of the character who is also known as Neo in the Matrix?", new ArrayList<String>() {{
            add("Thomas Anderson");
        }}));

        SciFiQnA.add(new QuestionsAnswers("What is the name of the highly advanced alien species in the 'War of the Worlds' by H.G. Wells?", new ArrayList<String>() {{
            add("Martians");
        }}));

        SciFiQnA.add(new QuestionsAnswers("Who directed the 1977 science fiction film 'Close Encounters of the Third Kind'?", new ArrayList<String>() {{
            add("Steven Spielberg");
        }}));

        SciFiQnA.add(new QuestionsAnswers("In the 'Terminator' film series, what model number is assigned to the Terminator portrayed by Arnold Schwarzenegger?", new ArrayList<String>() {{
            add("T-800");
        }}));

        SciFiQnA.add(new QuestionsAnswers("What is the title of the science fiction film directed by James Cameron, set on the moon of Pandora and featuring the Na'vi people?", new ArrayList<String>() {{
            add("Avatar");
        }}));

        SciFiQnA.add(new QuestionsAnswers("Who wrote the science fiction novel 'The Left Hand of Darkness,' exploring themes of gender and sexuality?", new ArrayList<String>() {{
            add("Ursula K. Le Guin");
        }}));

        SciFiQnA.add(new QuestionsAnswers("What is the term for the hypothetical scenario where humans merge with technology, often explored in science fiction?", new ArrayList<String>() {{
            add("Transhumanism");
        }}));

        SciFiQnA.add(new QuestionsAnswers("In the 'Star Trek' series, who is the Vulcan science officer aboard the USS Enterprise?", new ArrayList<String>() {{
            add("Spock");
            add("Mr Spock");
        }}));

        SciFiQnA.add(new QuestionsAnswers("Who directed the science fiction film 'Inception,' known for its intricate dream-within-a-dream narrative?", new ArrayList<String>() {{
            add("Christopher Nolan");
        }}));

        SciFiQnA.add(new QuestionsAnswers("In the TV series 'The X-Files,' what is the name of the FBI agent who is known for her skepticism of paranormal phenomena?", new ArrayList<String>() {{
            add("Dana Scully");
            add("Scully");
            add("Special Agent Dana Scully");
            add("Dr Dana Scully");
        }}));




SuperHeroQnA.add(new QuestionsAnswers("What is the civilian name of the superhero who becomes Spider-Man?", new ArrayList<String>() {{
            add("Peter Parker");
        }}));

        SuperHeroQnA.add(new QuestionsAnswers("Which superhero is known for wielding a shield made of vibranium?", new ArrayList<String>() {{
            add("Captain America");
        }}));

        SuperHeroQnA.add(new QuestionsAnswers("Who is the arch-nemesis of Batman and is often portrayed as the 'Clown Prince of Crime'?", new ArrayList<String>() {{
            add("The Joker");
            add("Joker");
        }}));

        SuperHeroQnA.add(new QuestionsAnswers("In the Marvel Comics, what is the real name of the superhero known as Black Widow?", new ArrayList<String>() {{
            add("Natasha Romanoff");
        }}));

        SuperHeroQnA.add(new QuestionsAnswers("Which superhero is known for being the 'Man of Steel' and hails from the planet Krypton?", new ArrayList<String>() {{
            add("Superman");
        }}));

        SuperHeroQnA.add(new QuestionsAnswers("In 'X-Men,' who can control the weather and is often seen as a leader of the mutant team?", new ArrayList<String>() {{
            add("Storm");
        }}));

        SuperHeroQnA.add(new QuestionsAnswers("Which superhero possesses a powerful suit of armor and is also known as Tony Stark?", new ArrayList<String>() {{
            add("Iron Man");
        }}));

        SuperHeroQnA.add(new QuestionsAnswers("What is the alias of the superhero who is also known as Diana Prince and hails from Themyscira?", new ArrayList<String>() {{
            add("Wonder Woman");
        }}));

        SuperHeroQnA.add(new QuestionsAnswers("Who is the alter ego of the superhero who becomes the Hulk when he gets angry?", new ArrayList<String>() {{
            add("Bruce Banner");
        }}));

        SuperHeroQnA.add(new QuestionsAnswers("In 'The Flash' TV series, who plays the role of Barry Allen, also known as The Flash?", new ArrayList<String>() {{
            add("Grant Gustin");
        }}));

        SuperHeroQnA.add(new QuestionsAnswers("What is the name of the superhero team in Marvel Comics that includes characters like Professor Xavier, Cyclops, and Wolverine?", new ArrayList<String>() {{
            add("X-Men");
            add("XMen");
            add("X Men");
        }}));

        SuperHeroQnA.add(new QuestionsAnswers("Which superhero, also known as Arthur Curry, is the ruler of the underwater kingdom of Atlantis?", new ArrayList<String>() {{
            add("Aquaman");
        }}));

        SuperHeroQnA.add(new QuestionsAnswers("In 'The Avengers' film series, who plays the character of Natasha Romanoff, also known as Black Widow?", new ArrayList<String>() {{
            add("Scarlett Johansson");
        }}));

        SuperHeroQnA.add(new QuestionsAnswers("Which superhero is known for his speed and is the fastest man alive?", new ArrayList<String>() {{
            add("The Flash");
            add("Flash");
            add("Barry Allen");
        }}));

        SuperHeroQnA.add(new QuestionsAnswers("What is the name of the superhero team in DC Comics that includes characters like Batman, Superman, and Wonder Woman?", new ArrayList<String>() {{
            add("The Justice League");
            add("Justice League");
        }}));

        SuperHeroQnA.add(new QuestionsAnswers("In 'Guardians of the Galaxy,' who is a talking raccoon with a love for weapons and explosives?", new ArrayList<String>() {{
            add("Rocket Raccoon");
            add("Rocket");
        }}));

        SuperHeroQnA.add(new QuestionsAnswers("Which superhero is often portrayed as the 'Dark Knight' and operates in the fictional Gotham City?", new ArrayList<String>() {{
            add("Batman");
        }}));

        SuperHeroQnA.add(new QuestionsAnswers("In the 'Avengers' films, what is the name of the powerful gauntlet that can harness the power of the Infinity Stones?", new ArrayList<String>() {{
            add("The Infinity Gauntlet");
            add("Infinity Gauntlet");
        }}));

        SuperHeroQnA.add(new QuestionsAnswers("Who is the alias of the superhero known for his web-slinging abilities and is often called Spidey?", new ArrayList<String>() {{
            add("Spider-Man");
            add("Spiderman");
            add("Spider Man");
        }}));

        SuperHeroQnA.add(new QuestionsAnswers("In 'Black Panther,' what is the name of the fictional African nation that T'Challa rules over as king?", new ArrayList<String>() {{
            add("Wakanda");
        }}));


AnimeQnA.add(new QuestionsAnswers("What is the full name of the main character in the anime 'Naruto' who aspires to become the Hokage of his village?", new ArrayList<String>() {{
            add("Naruto Uzumaki");
        }}));

AnimeQnA.add(new QuestionsAnswers("In 'Dragon Ball Z,' what transformation allows Goku to become a golden-haired, more powerful version of himself?", new ArrayList<String>() {{
            add("Super Saiyan");
        }}));

VideoGamesQnA.add(new QuestionsAnswers("In the 'Castlevania' anime series, what is the name of the vampire hunter and one of the main protagonists who seeks to destroy Dracula and his minions?", new ArrayList<String>() {{
    add("Trevor Belmont");
    add("Trevor");
}}));

AnimeQnA.add(new QuestionsAnswers("In 'Attack on Titan,' what is the name of the specialized branch of soldiers who are tasked with using omni-directional mobility gear to combat the Titans outside the walls?", new ArrayList<String>() {{
    add("The Survey Corps");
    add("Survey Corps");
    add("The Scouts");
    add("Scouts");
}}));

AnimeQnA.add(new QuestionsAnswers("In 'My Hero Academia,' what is the name of the superhero school where young students train to become heroes?", new ArrayList<String>() {{
            add("U.A. High School");
            add("U.A.");
            add("UA");
        }}));

AnimeQnA.add(new QuestionsAnswers("Who is the main character in the anime 'Death Note' who gains the power to kill anyone whose name he writes in a special notebook?", new ArrayList<String>() {{
            add("Light Yagami");
        }}));

AnimeQnA.add(new QuestionsAnswers("What is the name of the magical world where the majority of the action takes place in 'Sword Art Online'?", new ArrayList<String>() {{
            add("Aincrad");
        }}));

AnimeQnA.add(new QuestionsAnswers("In 'Fullmetal Alchemist,' what is the name of the mystical object that the Elric brothers seek in their quest to restore their bodies after a failed alchemical experiment?", new ArrayList<String>() {{
    add("The Philosopher's Stone");
    add("Philosopher's Stone");
    add("The Philosophers Stone");
    add("Philosophers Stone");
}}));

AnimeQnA.add(new QuestionsAnswers("In 'Cyberpunk: Edgerunners,' what is the name of the primary currency used in the world of Night City for various transactions and services?", new ArrayList<String>() {{
    add("Eddies");
     add("eds");
    add("Eurodollar");
    add("Eurobuck");
}}));

AnimeQnA.add(new QuestionsAnswers("What is the name of the protagonist in 'Berserk,' a lone mercenary with a dark and tragic past, who wields a massive sword known as the Dragonslayer?", new ArrayList<String>() {{
    add("Guts");
}}));

AnimeQnA.add(new QuestionsAnswers("In 'Neon Genesis Evangelion,' what are the giant creatures that threaten humanity and must be fought off by mechs called Evangelions?", new ArrayList<String>() {{
            add("Angels");
        }}));

AnimeQnA.add(new QuestionsAnswers("Who is the mentor and sensei of Naruto Uzumaki in the early stages of his ninja training?", new ArrayList<String>() {{
    add("Iruka Umino");
    add("Iruka");
    add("Umino");
}}));

AnimeQnA.add(new QuestionsAnswers("What is the name of the fictional online multiplayer game featured in the anime 'Log Horizon'?", new ArrayList<String>() {{
            add("Elder Tale");
        }}));

AnimeQnA.add(new QuestionsAnswers("In 'Cowboy Bebop,' what is the name of the bounty hunter crew's spaceship?", new ArrayList<String>() {{
            add("The Bebop");
        }}));

AnimeQnA.add(new QuestionsAnswers("Who is the main character in 'One Punch Man,' known for defeating any opponent with a single punch?", new ArrayList<String>() {{
            add("Saitama");
        }}));

AnimeQnA.add(new QuestionsAnswers("In 'Hunter x Hunter,' what is the name of the organization of elite assassins and criminals?", new ArrayList<String>() {{
            add("The Phantom Troupe");
        }}));

AnimeQnA.add(new QuestionsAnswers("Which anime series follows the adventures of a young alchemist named Edward Elric and his quest to find the Philosopher's Stone?", new ArrayList<String>() {{
            add("Fullmetal Alchemist");
        }}));

AnimeQnA.add(new QuestionsAnswers("What is the name of the virtual reality game featured in 'Sword Art Online' where players are trapped until they clear all the levels?", new ArrayList<String>() {{
            add("Sword Art Online");
            add("SAO");
        }}));

AnimeQnA.add(new QuestionsAnswers("In the anime 'Dragon Ball Z,' what is the name of Goku's eldest son, who possesses strong martial arts skills?", new ArrayList<String>() {{
            add("Gohan");
        }}));

AnimeQnA.add(new QuestionsAnswers("What is the title of the anime film directed by Hayao Miyazaki, featuring a young witch named Kiki?", new ArrayList<String>() {{
            add("'Kiki's Delivery Service'");
        }}));
        
        

FilmTVQnA.add(new QuestionsAnswers("Which film features a young boy who befriends a friendly extraterrestrial and helps him return home?", new ArrayList<String>() {{
add("E.T. the Extra-Terrestrial");
add("E.T.");
add("E.T");
add("ET");
}}));

FilmTVQnA.add(new QuestionsAnswers("Who is the actor known for playing James Bond in films like 'Casino Royale' and 'Skyfall'?", new ArrayList<String>() {{
add("Daniel Craig");
}}));

FilmTVQnA.add(new QuestionsAnswers("In the TV series 'Friends,' what is the name of Ross and Monica's dog who died when they were kids?", new ArrayList<String>() {{
add("Chi-Chi");
add("Chichi");
add("Chi Chi");
}}));

FilmTVQnA.add(new QuestionsAnswers("What is the name of the fictional school of witchcraft and wizardry attended by Harry Potter and his friends?", new ArrayList<String>() {{
add("Hogwarts School of Witchcraft and Wizardry");
add("Hogwarts");
}}));

FilmTVQnA.add(new QuestionsAnswers("In the TV series 'Brooklyn Nine-Nine,' what is the name of the captain of the 99th precinct, known for his stoic and no-nonsense demeanor?", new ArrayList<String>() {{
    add("Captain Raymond Holt");
    add("Captain Holt");
    add("Raymond Holt");
    add("Holt");
}}));

FilmTVQnA.add(new QuestionsAnswers("What is the name of the fictional town where the Simpson family resides and where most of the events in 'The Simpsons' take place?", new ArrayList<String>() {{
    add("Springfield");
}}));

FilmTVQnA.add(new QuestionsAnswers("Who played the character of Tony Stark, also known as Iron Man, in the Marvel Cinematic Universe?", new ArrayList<String>() {{
add("Robert Downey Jr.");
add("Robert Downey Jr");
}}));

FilmTVQnA.add(new QuestionsAnswers("In 'Breaking Bad,' what is the street name of the blue methamphetamine manufactured by Walter White?", new ArrayList<String>() {{
add("Blue Sky");
}}));

FilmTVQnA.add(new QuestionsAnswers("What is the name of the fictional paper company where the characters of 'The Office' work?", new ArrayList<String>() {{
add("Dunder Mifflin");
}}));

FilmTVQnA.add(new QuestionsAnswers("Who directed the film 'The Dark Knight,' featuring Heath Ledger as the Joker?", new ArrayList<String>() {{
add("Christopher Nolan");
}}));

FilmTVQnA.add(new QuestionsAnswers("In 'Game of Thrones,' what is the name of Jon Snow's direwolf?", new ArrayList<String>() {{
add("Ghost");
}}));

FilmTVQnA.add(new QuestionsAnswers("Which TV series revolves around a high school chemistry teacher who turns to cooking and selling methamphetamine?", new ArrayList<String>() {{
add("Breaking Bad");
}}));

FilmTVQnA.add(new QuestionsAnswers("What is the name of the fictional hospital where the TV series 'Grey's Anatomy' is set?", new ArrayList<String>() {{
add("Grey Sloan Memorial Hospital");
}}));

FilmTVQnA.add(new QuestionsAnswers("Who played the character of Katniss Everdeen in 'The Hunger Games' film series?", new ArrayList<String>() {{
add("Jennifer Lawrence");
}}));

FilmTVQnA.add(new QuestionsAnswers("In 'The Lord of the Rings' film trilogy, what is the name of the wizard who guides the Fellowship of the Ring?", new ArrayList<String>() {{
add("Gandalf");
}}));

FilmTVQnA.add(new QuestionsAnswers("Which TV series features a group of friends in New York City and includes characters like Ross, Rachel, and Monica?", new ArrayList<String>() {{
add("Friends");
}}));

FilmTVQnA.add(new QuestionsAnswers("Who is the actor known for portraying Jack Dawson in the film 'Titanic'?", new ArrayList<String>() {{
add("Leonardo DiCaprio");
}}));

FilmTVQnA.add(new QuestionsAnswers("In 'Stranger Things,' what is the name of the parallel dimension inhabited by the Demogorgon?", new ArrayList<String>() {{
add("The Upside Down");
}}));

FilmTVQnA.add(new QuestionsAnswers("What is the name of the fictional superhero team in the Marvel Cinematic Universe, consisting of Iron Man, Captain America, and Thor, among others?", new ArrayList<String>() {{
add("The Avengers");
}}));

FilmTVQnA.add(new QuestionsAnswers("In the TV series 'The Walking Dead,' what is the name of the baseball bat covered in barbed wire that is wielded by the character Negan?", new ArrayList<String>() {{
add("Lucille");
}}));       



VideoGamesQnA.add(new QuestionsAnswers("What is the name of the iconic Italian plumber who is the main character in the 'Super Mario' series?", new ArrayList<String>() {{
    add("Mario");
}}));

VideoGamesQnA.add(new QuestionsAnswers("In the video game 'The Legend of Zelda,' what is the name of the princess often rescued by the hero Link?", new ArrayList<String>() {{
    add("Princess Zelda");
        add("Zelda");
}}));

VideoGamesQnA.add(new QuestionsAnswers("Which video game franchise features a battle royale mode called 'Warzone' and includes titles like 'Modern Warfare'?", new ArrayList<String>() {{
    add("Call of Duty");
    add("COD");
}}));

VideoGamesQnA.add(new QuestionsAnswers("In the video game 'Pokémon,' what is the name of the legendary bird trio consisting of Articuno, Zapdos, and Moltres?", new ArrayList<String>() {{
    add("The Legendary Birds");
}}));

VideoGamesQnA.add(new QuestionsAnswers("Which video game franchise features a battle royale mode called 'Plunder' and is known for its pirate theme and ship battles?", new ArrayList<String>() {{
    add("Sea of Thieves");
}}));

VideoGamesQnA.add(new QuestionsAnswers("What is the name of the block-building game where players construct elaborate structures and landscapes?", new ArrayList<String>() {{
    add("Minecraft");
}}));

VideoGamesQnA.add(new QuestionsAnswers("In 'Super Smash Bros.,' which Nintendo character is known for his ability to eat various items and gain powers?", new ArrayList<String>() {{
    add("Kirby");
}}));

VideoGamesQnA.add(new QuestionsAnswers("In 'The Elder Scrolls V: Skyrim,' what is the name of the dragon that players must confront and defeat?", new ArrayList<String>() {{
    add("Alduin");
}}));

VideoGamesQnA.add(new QuestionsAnswers("In the game 'Fallout 4,' what is the name of the advanced technology organization that the player character is searching for throughout the wasteland?", new ArrayList<String>() {{
    add("The Institute");
    add("Institute");
}}));

VideoGamesQnA.add(new QuestionsAnswers("What is the name of the main character in the 'Legend of Zelda' series, often dressed in green and wielding a sword and shield?", new ArrayList<String>() {{
    add("Link");
}}));

VideoGamesQnA.add(new QuestionsAnswers("In 'Fortnite,' what is the term used to describe the constantly shrinking play area that forces players into closer combat encounters as the match progresses?", new ArrayList<String>() {{
    add("The Storm");
    }}));

VideoGamesQnA.add(new QuestionsAnswers("In the Pokémon series, what is the name of the professor who provides the player with their first Pokémon and a Pokédex to start their journey?", new ArrayList<String>() {{
    add("Professor Oak");
}}));

VideoGamesQnA.add(new QuestionsAnswers("Which video game franchise features a battle royale mode called 'Firestorm' and is set in the World War II era?", new ArrayList<String>() {{
    add("Battlefield");
}}));

VideoGamesQnA.add(new QuestionsAnswers("In 'Apex Legends,' what is the name of the in-game location that serves as the starting point for all squads and features various items and weapons?", new ArrayList<String>() {{
    add("Kings Canyon");
}}));

VideoGamesQnA.add(new QuestionsAnswers("In 'The Witcher 3: Wild Hunt,' what is the name of the monster hunter and main character?", new ArrayList<String>() {{
    add("Geralt of Rivia");
    add("Geralt");
}}));

VideoGamesQnA.add(new QuestionsAnswers("In the 'Elite' video game series, what is the name of the space station that serves as a central hub for trade and activities in the galaxy?", new ArrayList<String>() {{
    add("Jameson Memorial");
}}));

VideoGamesQnA.add(new QuestionsAnswers("In 'Overwatch,' what is the name of the character who is a highly skilled sniper with a cybernetic eye?", new ArrayList<String>() {{
    add("Widowmaker");
}}));

VideoGamesQnA.add(new QuestionsAnswers("In the video game 'The Legend of Zelda: Breath of the Wild,' what is the name of the ancient, highly advanced civilization that once existed in Hyrule?", new ArrayList<String>() {{
    add("The Sheikah");
    add("Sheikah");
}}));

VideoGamesQnA.add(new QuestionsAnswers("In 'League of Legends,' what is the term used to describe the main building located at the heart of each team's base that must be destroyed to achieve victory?", new ArrayList<String>() {{
    add("Nexus");
    add("The Nexus");
    add("The Enemy Nexus");
}}));

VideoGamesQnA.add(new QuestionsAnswers("In 'Animal Crossing: New Horizons,' what is the name of the raccoon character who runs the in-game store?", new ArrayList<String>() {{
    add("Tom Nook");
}}));
}
    
    public QuestionsAnswers getQAPair(GameCode.WedgeColor wedgecolor){  //select array list based of inputted wedge color

        int index;
    QuestionsAnswers QA;

    ArrayList<QuestionsAnswers> selectedQnA;

    switch (wedgecolor) {
        case Purple:
            selectedQnA = LiteratureQnA;
            break;
        case Blue:
            selectedQnA = SciFiQnA;
            break;
        case Red:
            selectedQnA = SuperHeroQnA;
            break;
        case Cyan:
            selectedQnA = AnimeQnA;
            break;
        case Yellow:
            selectedQnA = FilmTVQnA;
            break;
        default:
            selectedQnA = VideoGamesQnA;
            break;
    }

    index = randomIndex(selectedQnA);
    QA = selectedQnA.get(index);
    return QA;
    }
    
    public int randomIndex( ArrayList<QuestionsAnswers> QnA){ //generate randomIndex based of length of selected array list
        int randomIndex=GameCode.random().nextInt(QnA.size());
        return randomIndex;
    }
}
