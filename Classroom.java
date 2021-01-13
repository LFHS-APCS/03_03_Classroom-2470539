public class Classroom{
  private String name;
  private String students;
  private int num_students;
  private final int MAX_STUDENTS = 30;
  public Classroom(String theName){
    name = theName;
  }
  public String getName(){
    return name;
  }
  public String setName(String aName){
    name = aName;
    return name;
  }
  public int getNumStudents(){
  return num_students;  
  }
  public String addStudents(String student){
    students = students + " " + student;
    return students.trim();

  }
  public String toString(){
    return students.trim();
  }

}