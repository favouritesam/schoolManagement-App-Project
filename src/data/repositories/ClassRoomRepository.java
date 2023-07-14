package data.repositories;

import data.models.ClassRoom;

public interface ClassRoomRepository {
    ClassRoom save(ClassRoom classRoom);
    ClassRoom findClassRoomById(int classRoomId);
    boolean deleteClassRoomById(int classRoomId);
    ClassRoom updatedClassRoom(ClassRoom classRoom);
    ClassRoom findByClassroomName(String name);
    int classRoomListSize();
    }
