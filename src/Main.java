public class Main {
    public static void main(String[] args) {
        Griffindor[] people = {
                new Griffindor("Гарри Поттер", 5, 10, 12),
                new Griffindor("Гермиона Грейнджер", 3,8 ,11),
                new Griffindor(" Рон Уизли",1,5,6),
        };
        System.out.println("Ученики Гриффиндор: " + people.length);
        for (int i = 0; i < people.length; i++) {
            Griffindor griffindor = people[i];
            System.out.println("Имя: " + griffindor.getName() + " Благородство: " + griffindor.getNobility() +
                    " Честь: "+ griffindor.getHonor() + " Храбрость: " + griffindor.getBravery());
        }
        System.out.println();
        Puffenduy[] child ={
               new Puffenduy("Захария Смит",2,5,8),
                new Puffenduy("Седрик Диггори",3, 6,9),
                new Puffenduy("Джастин Финч-Флетчли", 1, 4, 5),
        };
        System.out.println("Ученики Пуфендуй: " + child.length);
        for (int i = 0; i < child.length; i++) {
            Puffenduy puffenduy = child[i];
            System.out.println(" Имя: " +puffenduy.getName() + " Трудолюбие: " +puffenduy.getIndustriousness()+
                    " Верность: " +puffenduy.getLoyalty() + " Честность: " +puffenduy.getHonesty());
        }
        System.out.println();
        Kogtevran[] students = {
                new Kogtevran("Чжоу Чанг",4, 5, 8,12),
                new Kogtevran("Падма Патил", 3, 6,1,9),
                new Kogtevran("Маркус Белби",5, 8,2, 15),
        };
        System.out.println("Ученики Когтевран: "+ students.length);
        for (int i = 0; i < students.length; i++) {
            Kogtevran kogtevran = students[i];
            System.out.println("Имя: " +kogtevran.getName() + " Ум: " + kogtevran.getMind() +
                    " Мудрость: " + kogtevran.getWisdom() + " Остроумие: " + kogtevran.getWit() +
                    " Творчество: " + kogtevran.getCreation() );
        }
        System.out.println();
        Slizerin[] students2 = {
                new Slizerin("Драко Малфой", 5, 9,10,8,15),
                new Slizerin("Грэхэм Монтегю", 3, 4, 6, 8,5),
                new Slizerin("Грегори Гойл", 2, 4, 7, 1, 7),
        };
        System.out.println("Ученики Слизерин: " + students2.length);
        for (int i = 0; i < students2.length; i++) {
            Slizerin slizerin = students2[i];
            System.out.println("Имя: " + slizerin.getName() + " Хитрость: " + slizerin.getCunning() +
                    " Решительность: " + slizerin.getDetermination() + " Амбициозность: "
                    + slizerin.getAmbition() + " Находчивость: " + slizerin.getResourcefulness() +
                    " Жажда влсти: " + slizerin.getLustForPower());
        }
    }
}