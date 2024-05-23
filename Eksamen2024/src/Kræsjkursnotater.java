// import java.beans.EventHandler;
// import java.util.ArrayList;
// import java.util.List;

public class Kræsjkursnotater {
    // Java som språk

    // 1. Objektorientert språk
    // 2. Må kompilere før det kjører
    // 3. Statiske typer
    
    // Høynivå-språk
    // C-familien syntaks

    // Statiske typer:
    // Hvis en variabel får en type, er den stuck med den typen
    // Umulig med en liste med int og string
    // Mindre fleksibilitet, mindre risk for feil

    // PRIMITIVE OG REFERERTE TYPER

    // PRIMITIVE
    // - boolean
    // - byte
    // - short
    // - int
    // - long
    // - float
    // - double
    // - char

    // REFERERTE
    // - Boolean
    // - Byte
    // - Short
    // - Integer
    // - Long
    // - Float
    // - Double
    // - Character

    // Forskjellen mellom disse

    // Primitive typer lagres i "stack", primitive har en standard verdi som er null
    // Refererte typer lagres med en "pointer" som peker på en plass i "heapen"

    // LISTER OG ARRAYS

    int[] a = {1, 2, 3};

    // ArrayList<Integer> b = new ArrayList<Integer>();
    // b.add(1);
    // b.add(2);
    // b.add(3);

    // Hva vil det si at noe er statisk?
    // Noe som tilhører klassen og ikke objektet
    // Helt greit med statiske metoder
    // ALDRI HA STATISKE VARIABLER (nesten)
    // - statiske konstanter
    // - defaults

    // Grensesnitt
    // Abstrakte metode-deklarasjoner og javadocs
    // Metoden skal finnes, men klassen må implementere den
    // Kontrakt mellom klasse og interface, dersom klasse implementerer interface, skal klassen
    // også implementere metodene i interface

    // ARV

    // public abstract class Mammal {

    //     public boolean laysEggs(Mammal mammal) {
    //         if (mammal != platypus) {
    //             returns false;
    //         }
    //         else {
    //             return true;
    //         }
    //     }
    // }


    // == sammenligner minneadresse, god for primitive datatyper, ikke for refererte
    // .equals for referterte, sammenligner objekter

    // Alle objekter arver for Objects


    // LIKHET
    // - equals()
    // - Standardimplementasjon fra Object (java.lang)
    // - Må som regel lage egen
    //    - Sammenlign variabler
    // - Krav til likhet:
    //   - Refleksivitet
    //   - Symmetri
    //   - Transitivitet
    //   - Konsistent
    //   - Null-sikkerhet
    //   - Hash-sikkerhet

    // Refleksivitet
    // x = x

    // Symmetri
    // x = y <-> y = x

    // Transitivitet
    // x = y, y = z -> x = z

    // SAMMENLIGNING

    // Comparable<T>
    // - compareTo(T o)

    // Total orden
    // - Refleksiv
    // - Transitiv
    // - Antisymmetrisk
    //   - x <= y & y <= x -> x = y
    // - Total

    // Arv vs komposisjon
    // Klasser som arver "er en" av den typen
    // Klasser som benytter komposisjon "har en" av den typen

    // GENERISKE TYPER
    // ??????

    // JavaDoc
    // Kommentarer for metoder som spesifiserer parametere, return og hva metoden skal gjøre

    // Testing
    // Teste det viktigste av funksjonalitet
    // Teste public-metoder


    // OOP-PRINSIPPER
    // En standard for hvordan man skal programmere
    // Imperativ programmering, instrukser nedover
    // Funksjonell programmering -- all kode i funksjoner

    // Deler opp koden i mindre deler, setter sammen som byggeklosser

    // ABSTRAKSJON
    // Vanskelig å lage en 100% tro kopi
    // Fokus på de viktigste egenskapene
    // Hva trengs i ditt prosjekt?

    // Klassen Sheep i kræsjkurs-repoet er et eksempel på abstraksjon

    // INNKAPSLING
    // Et prosjekt er delt opp i pakker
    // Tilgangsmodifikasjoner
    // Restriktive typer
    // Prøv å være så streng som mulig
    // Get-ere og set-ere
    
    // PUBLIC åpent for klasse, pakke, subklasse, alle
    // PROTECTED åpent for klasse, pakke, subklasse, men ikke alle
    // INGEN MODIFIKATOR åpent for klasse og pakke
    // PRIVATE kun åpent for klasse

    // POLYMORFISME
    // Når flere klasser kan brukes på en uniform måte
    // Vanlig ved bruk av f.eks:
    // - Grensesnitt
    // - Arv

    // Statisk polymorfisme:
    // - Flere metoder med samme navn
    // - Ulik parameterliste

    // Dynamisk polymorfisme
    // - @Override

    // MUTABILITET
    // Sier noe om hvorvidt verdier kan endres
    // Noe er muterbart dersom det kan endres
    // - set-metoder
    // Noe er uforandelig dersom det ikke kan endres
    // - Final
    //   - Variabler - konstanter
    //   - Metoder - Kan ikke overskrives av subklasser
    //   - Klasser - Kan ikke utvides (nederst i hierarkiet)

    // RECORD
    // Innebygde get-ere, standardmetoder som equals(), hashCode(), og toString()
    // Feltvariabler er satt til final
    // Nærmeste man kommer til tuples i java

    // ITERATOR OG ITERABLE
    // - Gir oss en måte å se på alle objekter i en samlig

    // ITERATOR
    // - Et objekt som blar gjennom en samling av objekter

    // ITERABLE
    // - Et objekt som KAN bla gjennom flere ganger
    // - Lager flere iterator-objekter

    // DESIGNMØNSTRE
    // TYPE: CREATIONAL, STRUCTURAL, BEHAVIORAL
    // CREATIONAL:
    // - Kontroll over opprettelsen av objekter.
    // - Factory, singleton, builder
    // STRUCTURAL (NB!) minst relevante
    // - Kontroll over komposisjonen av klasser og objekter
    // - Adapter, decorator, proxy
    // BEHAVIORAL
    // - Kontroll over samspillet mellom klasser og objekter
    // - Iterator, observer, memento, eventbus

    // FACTORY
    // public abstract class ShapeFactory {
        // public static final Shape createShape(String shapeType) {
        //     if (shapeType.equals("Circle")) {
        //         return new Circle();
        //     }
        //     else if (shapeType.equals("Rectangle")) {
        //         return new Rectangle();
        //     }
        //     else if (shapeType.equals("Triangle")) {
        //         return new Triangle();
        //     }
        //     else {
        //         throw new IllegalArgumentException("Invalid shape type");
        //     }
        // }
    //}

    // EVENTBUS
    // public class EventBus {
    //     private List<EventHandler> eventHandlers = new ArrayList<>();

    //     void register(EventHandler handler) {
    //         eventHandlers.add(handler);
    //     }

    //     void post(Event event) {
    //         for (EventHandler eventHandler : eventHandlers) {
    //             eventHandler.handle(event);
    //         }
    //     }
    // }

    // public interface EventHandler {
    //     void handle(Event e);
    // }

    // public class Sender {
    //     private EventBus bus;

    //     public Sender(EventBus bus) {
    //         this.bus = bus;
    //     }

    //     void send(int one, int two) {
    //         System.out.println("Sending message:" + );
    //     }
    // }

    // ...
    // gjør ferdig fra kræsjkursslides

    // SWING
    // Utvidelse av java.awt, Javas originale bibliotek for GUI,
    // inneholder bl.a. Graphics, støtte for farger, geometriske former.

    // Lettere å anvende enn awt

    // Platformsuavhengige applikasjoner

    // Model-View-Controller
    // - designmønster for GUI-applikasjoner
    // - gir en modulær og innkapslet inndeling av programmet

    // Modell håndterer "kjernelogikken"
    // Kontrollør interagerer med denne modellen
    // Visning representerer modellen

    // MÅ ikke finnes en klasse for hver

    // JPanel
    // - "container" som kan holde på diverse grafiske komponenter
    // , særlig Graphics-objekter. (som kommer fra java.awt.)

    // I vår applikasjon skal vi lage en tegneklasse som vil
    // arve fra denne klassen

    // JFrame
    // - Tegneklassen vår, som er et JPanel, vil kunne legges til en "ramme" av typen JFrame.



}
