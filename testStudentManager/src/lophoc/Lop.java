package lophoc;
import character.giaovien.GiaoVien;
import character.sinhvien.SinhVien;
import java.util.ArrayList;
import monhoc.MonHoc;

public class Lop {
    public String classID;
    public GiaoVien giaovien;
    public ArrayList<SinhVien> students;
    public ArrayList<MonHoc> subjects;

    public Lop(String classID, GiaoVien giaovien) {
        this.classID = classID;
        this.giaovien = giaovien;
        this.students = new ArrayList<>();
        this.subjects = new ArrayList<>();
    }

    //getter
    public String getClassID() {
        return classID;
    }
    public GiaoVien getGiaovien() {
        return giaovien;
    }
    public ArrayList<SinhVien> getStudents() {
        return students;
    }
    public ArrayList<MonHoc> getSubjects() {
        return subjects;
    }

    //setter
    public void setClassID(String classID) {
        this.classID=classID;
    }
    public void setGiaovien(GiaoVien giaovien) {
        this.giaovien = giaovien;
    }
    public void setStudents(ArrayList<SinhVien> students) {
        this.students = students;
    }
    public void setSubjects(ArrayList<MonHoc> subjects) {
        this.subjects = subjects;
    }

    // add teacher
    public void addTeacher(String teacherID, String fullName) {
        this.giaovien= GiaoVien.createNewTeacher(teacherID, fullName);
    }
    // add student
    public void addStudent(SinhVien student) {
        students.add(student);
    }

    // add subject
    public void addSubject(MonHoc subject) {
        subjects.add(subject);
    }
    public void classInformation() {

        System.out.println("Thông tin lớp học:");
        System.out.println("Mã lớp: " + classID);
        System.out.println(giaovien.getInformation());

        System.out.println("Danh sách sinh viên:");
        for (SinhVien sv : students) {
            System.out.println("- " + sv.getFullName() + " (Mã sinh viên: " + sv.getStudentID() + ")");
        }
        System.out.println("Danh sách môn học:");
        for (MonHoc mh : subjects) {
            mh.showInfoMonHoc();
        }
    }
}
