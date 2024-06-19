package character.sinhvien;
import character.Character;

public class SinhVien extends Character {
    private String studentID;

    protected SinhVien(String studentID, String fullName) {
        super(fullName);
        this.studentID = studentID;

    }

    public static SinhVien createNewStudent(String studentID, String fullName) {
        return new SinhVien(studentID, fullName);
    }

    //getter
    public String getStudentID() {
        return studentID;
    }
    public String getFullname() {
        return getFullName();
    }
    
    @Override
    public void getState() {
        System.out.println("Đang học");
    }

    @Override
    public String getInformation() {
        System.out.println("Họ và tên: "+getFullname() + "MSSV: "+studentID + "Địa chỉ: "+ getAddress());
        return null;
    }

    //setter
    protected void setSinhVien(String studentID) {
        this.studentID=studentID;
    }

}
