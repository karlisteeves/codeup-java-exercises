package codeup;

import com.sun.tools.javac.jvm.Code;

public class CodeupTest {
    public static void main(String[] args) {
        String [] student1 = {"Karli", "Steeves", "Deimos", "Macbook Pro"};

        CodeupStudent karli = new CodeupStudent
                (student1, true);

        karli.greeting();
        karli.study();
        karli.giveBusinessCards();
    }
}
