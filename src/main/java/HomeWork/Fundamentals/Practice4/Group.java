package HomeWork.Fundamentals.Practice4;

import java.util.Arrays;

/**
 * Created by lapte on 29.05.2016.
 */
public class Group {
    private String groupName;
    private int groupSize;
    private Student [] students;


    public Group(String groupName, int groupSize, Student[] students) {
        setGroupName(groupName);
        setGroupSize(groupSize);
        setStudentArray(students);
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getGroupSize() {
        return groupSize;
    }

    public void setGroupSize(int groupSize) {
        this.groupSize = groupSize;
    }

    public Student[] getStudentArray() {
        return students;
    }

    public void setStudentArray(Student[] students) {
        this.students = students;
    }

    public void getStudentInformation (String name){
        int flag =0;
        for (int i = 0; i < students.length; i++) {
            if (name.equals(students[i].getName())) {
                System.out.println(students[i]);
                flag++;
            }
        }
        if (flag == 0){
            System.out.println("Нет такого студента");
        }
    }


    /*public int getSizeOfTheGroup() throws IOException {
        System.out.println("Введите размер группы (число студентов).");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }
*/

    @Override
    public String toString() {
        return "Group{" +
                "groupName= " + getGroupName() +
                ", groupSize= " + getGroupSize() +
                ", students= " + Arrays.toString(getStudentArray()) +
                '}';
    }
}
