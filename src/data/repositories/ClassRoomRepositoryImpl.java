package data.repositories;

import data.models.Admin;
import data.models.ClassRoom;
import data.models.Student;

import java.util.ArrayList;
import java.util.List;

public class ClassRoomRepositoryImpl implements ClassRoomRepository {

    ArrayList<ClassRoom>classRooms = new ArrayList<>();
    private int classRoomId = 0;
    private List<ClassRoom> classRoomsList = new ArrayList<>();

    @Override
    public ClassRoom save(ClassRoom classRoom) {
        classRoom.setClassId(createClassRoomId());
        classRoomsList.add(classRoom);
        return classRoomsList.get(classRoom.getClassId());
    }

    @Override
    public ClassRoom findClassRoomById(int classRoomId) {
        return classRoomsList.get(classRoomId);
    }

    @Override
    public boolean deleteClassRoomById(int classRoomId) {
        classRoomsList.remove(classRoomId);
        return true;
    }

    @Override
    public ClassRoom updatedClassRoom(ClassRoom classRoom) {
        classRoomsList.remove(classRoom.getClassId());
        classRoomsList.add(classRoom);
        return classRoomsList.get(classRoom.getClassId());
    }

    @Override
    public ClassRoom findByClassroomName(String name) {
        return null;
    }

    @Override
    public int classRoomListSize() {
        return classRoomsList.size();
    }
    private int createClassRoomId() {
        return classRoomId +=1;
    }

}
