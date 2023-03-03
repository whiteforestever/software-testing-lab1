//package domainModel;
//
//public class DomainModel {
//    public enum GasType {
//        HYDROGEN,
//        OZONE,
//        CARBON_MONOXIDE
//    }
//
//    public static class Person {
//        private String name;
//        private int age;
//        private String gender;
//        private String mood;
//
//        public Person(String name, int age, String gender, String mood) {
//            this.name = name;
//            this.age = age;
//            this.gender = gender;
//            this.mood = mood;
//        }
//
//        public void laugh() {
//            System.out.println("Hahaha!");
//        }
//
//        public void silent() {
//            System.out.println("...");
//        }
//
//    }
//
//    public class Girl extends Person {
//        public Girl(String name, int age, String gender, String mood) {
//            super(name, age, gender, mood);
//        }
//
//        public void hate() {
//            System.out.println("I hate him!");
//        }
//
//        public void evaporate() {
//            System.out.println("I'm evaporating!");
//        }
//
//        public void payAttention() {
//            System.out.println("I'm paying attention to it.");
//        }
//    }
//
//    public class Bar {
//        private String name;
//        private String location;
//
//        public Bar(String name, String location) {
//            this.name = name;
//            this.location = location;
//        }
//
//        public void open() {
//            System.out.println("The bar is now open!");
//        }
//
//        public void close() {
//            System.out.println("The bar is now closed.");
//        }
//    }
//
//    public class Moment {
//        private int duration;
//
//        public Moment(int duration) {
//            this.duration = duration;
//        }
//
//        public void arrive() {
//            System.out.println("The moment has arrived.");
//        }
//    }
//}
