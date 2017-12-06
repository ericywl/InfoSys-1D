package profchoper._misc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import profchoper.professor.Professor;
import profchoper.professor.ProfessorDAO;
import profchoper.professor.ProfessorService;
import profchoper.slot.Slot;
import profchoper.slot.SlotDAO;
import profchoper.slot.SlotService;
import profchoper.student.Student;
import profchoper.student.StudentDAO;

import java.time.LocalDate;
import java.util.*;

@Controller
public class LoginTest {

    @Autowired
    private SlotService slotService;

    @RequestMapping("/")
    String index() {
        return "index";
    }

    @RequestMapping("/student")
    public String student(Map<String, Object> model) {
        try {
            List<Slot> slotList = slotService.getSlotsByWeek(LocalDate.of(2017, 12, 3));

            model.put("bookings", slotList);
            return "student";
        } catch (Exception ex) {
            model.put("message", ex.getMessage());
            return "error";
        }
    }

    @RequestMapping("/prof")
    public String prof() {
        return "prof";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/403")
    public String Error403() {
        return "403";
    }
}