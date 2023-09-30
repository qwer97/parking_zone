package Industryacademic.project.backend.repository;

import Industryacademic.project.backend.Entity.CAR;
import Industryacademic.project.backend.Entity.PARKING_LOT;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PARKING_LOTRepository extends JpaRepository<PARKING_LOT,Long> {
    PARKING_LOT findByCno(String Cno);

}
