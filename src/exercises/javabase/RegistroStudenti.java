package exercises.javabase;

public class RegistroStudenti {
    // String[] studentList = new String[30];
    Studente[] studentsList;
    private int currentSize = 0;

    // construttore senza parametri per inizializzare il registro vuoto

    public RegistroStudenti() {
        studentsList = new Studente[30];
    }

    // metodo pubblico per aggiungere studenti al registro
    public void addStudent(Studente newStudent) {
        studentsList[currentSize] = newStudent;
        currentSize++;
    }

    // metodo che stampi la lista degli studenti
    public void printArray() {
        for (int i = 0; i < studentsList.length; i++) {
            if (studentsList[i] != null) {
                System.out.println(studentsList[i]);
            }
        }
    }
}
