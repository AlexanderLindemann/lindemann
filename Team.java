
public class Team {


    public Team(String[] String) {
    }
    public void showResults(){
        System.out.print("дистанцию прошли: " + finish[]);
    }

    public static void main(String[] args) {
        Course c = new Course(new int[] {4,5,6,3,4,5,6}); // Создаем полосу препятствий
        Team team = new Team(new String[] {"Sasha", "Potter", "Ron", "Germiona"}); // Создаем команду
        c.doIt(team); // Просим команду пройти полосу
        team.showResults(); // Показываем результаты
    }
