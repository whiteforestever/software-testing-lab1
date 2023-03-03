//package domainModelTest;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class DomainModelTest {
//
//    @Test
//    public void testPerson() {
//        DomeinModel.Person person = new DomeinModel.Person("John", 25, "Male", "Happy");
//        assertEquals("John", person.getName());
//        assertEquals(25, person.getAge());
//        assertEquals("Male", person.getGender());
//        assertEquals("Happy", person.getMood());
//        person.laugh();
//        person.silent();
//    }
//
//    @Test
//    public void testGirl() {
//        Girl girl = new Girl("Emily", 22, "Female", "Angry");
//        assertEquals("Emily", girl.getName());
//        assertEquals(22, girl.getAge());
//        assertEquals("Female", girl.getGender());
//        assertEquals("Angry", girl.getMood());
//        girl.hate();
//        girl.payAttention();
//        girl.evaporate();
//    }
//
//    @Test
//    public void testBar() {
//        Bar bar = new Bar("The Green Dragon", "123 Main St.");
//        assertEquals("The Green Dragon", bar.getName());
//        assertEquals("123 Main St.", bar.getLocation());
//        bar.open();
//        bar.close();
//    }
//
//    @Test
//    public void testMoment() {
//        Moment moment = new Moment(60);
//        assertEquals(60, moment.getDuration());
//        moment.arrive();
//    }
//
//}
