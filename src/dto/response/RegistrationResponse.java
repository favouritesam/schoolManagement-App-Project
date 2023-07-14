package dto.response;

public class RegistrationResponse {
    public int classRoomId;
    public int studentId;
    private int adminId;
    private String name;
    private int teacherId;
    private String classRoom;

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public int getClassRoomId() {
        return classRoomId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoomId(int classRoomId) {
        this.classRoomId = classRoomId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("RegistrationResponse{");
        sb.append("classRoom='").append(classRoomId).append('\'');
        sb.append(", studentId=").append(studentId);
        sb.append('}');
        return sb.toString();
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public int getAdminId() {
        return adminId;
    }

}
