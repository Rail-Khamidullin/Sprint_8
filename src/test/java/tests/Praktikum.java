package tests;

import org.example.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class Praktikum {

    static String name;

    public Praktikum(String name) {
        this.name = name;
    }

    @Parameterized.Parameters
    public static Object[][] setSex() {
        return new Object[][]{
                {"Олегин ТутберидземакабидзеБольше19Символов"},
                {"Игорь Иванов"},
                {" Вячеслав Бутусов"},
                {"Виктор Смолин"},
                {"Анжелка Варум "},
                {" Иосиф Бродский "}
        };
    }

    @Test
    public void PractikumTest() {
        Account account = new Account(name);
        account.checkNameToEmboss();
    }
}
