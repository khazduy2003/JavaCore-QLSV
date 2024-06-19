package character.giaovien;
import character.Character;

public class GiaoVien extends Character {
    private String teacherID;
    protected GiaoVien(String teacherID, String fullName) {
        super(fullName);
        this.teacherID=teacherID;
    }
    public static GiaoVien createNewTeacher(String teacherID, String fullName) {
        return new GiaoVien(teacherID, fullName);
    }

    // getter
    protected String getteacherID() {
        return teacherID;
    }

    // setter
    protected void setTeacherID(String teacherID) {
        this.teacherID=teacherID;
    }

    @Override
    public void getState() {
        System.out.println("Đang dạy");
    }
    @Override
    public String getInformation() {
        return "Họ và tên giáo viên: "+getFullName() + " (Mã giáo viên: "+teacherID+")";
    }
}
