package me.dio.salasDeReuniao.repository;

import me.dio.salasDeReuniao.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
