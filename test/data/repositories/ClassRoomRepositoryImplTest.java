package data.repositories;

import data.models.ClassRoom;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassRoomRepositoryImplTest {

    @BeforeEach
    void setUp() {
    }
    @Test
    public void testThatClassRoomCanBeSave(){
        ClassRoomRepositoryImpl classRoomRepository = new ClassRoomRepositoryImpl();
        ClassRoom classRoom = new ClassRoom();
        classRoom.setName(classRoom.getName());
        classRoom.setClassId(classRoom.getClassId());
        classRoom.setTeacherId(classRoom.getTeacherId());
    }
}