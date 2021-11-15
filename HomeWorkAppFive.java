package HomeTaskFive;

public class HomeWorkAppFive {
    public static void main(String[] args) {
        Person[] personArray = givePeople();
        giveMoreThan40Years(personArray);
    }

    private static void giveMoreThan40Years(Person[] personArray) {
        for (int i = 0; i < personArray.length; i++) {
            if (personArray[i].getAge() > 40)
                personArray[i].printInfoPerson();
        }
    }

    private static Person[] givePeople() {
        Person[] personArray = new Person[5];

        personArray[0] = new Person("Ivanov I.", "Team lead", "ivanov@mail.com", "+79001111111", 300000, 46);
        personArray[2] = new Person("Sidorov S.", "Senior engineer", "sidorov@mail.com", "+79002222222", 250000, 41);
        personArray[3] = new Person("Petrov P.", "Middle engineer", "petrov@mail.com", "+79003333333", 200000, 34);
        personArray[4] = new Person("Sidorova S.", "Junior engineer", "sidorova@mail.com", "+79004444444", 150000, 29);
        personArray[1] = new Person("Petrova P.", "HR", "petrova@mail.com", "+79005555555", 100000, 27);
        return personArray;
    }
}
