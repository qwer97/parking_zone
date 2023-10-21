package Industryacademic.project.backend.Service;

import Industryacademic.project.backend.BackendApplication;
import Industryacademic.project.backend.Entity.CAR;
import Industryacademic.project.backend.Entity.MEMBER;
import Industryacademic.project.backend.repository.CARRepository;
import Industryacademic.project.backend.repository.MEMBERRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = BackendApplication.class)
class RegisterCarServiceTest {

    @Autowired
    private CARRepository c;

    @Autowired
    private MEMBERRepository s;

    @Autowired
    private RegistCarService r;

    @Test
    void registerCar_test() {
        // given
        int sno = 2010125001;
        String cno = "12";

        MEMBER student = new MEMBER();
        student.setMno(sno);
        CAR C = new CAR();
        C.setCno(cno);
        C.setMember(student);

        r.registerCar(cno, sno);
    }
}
