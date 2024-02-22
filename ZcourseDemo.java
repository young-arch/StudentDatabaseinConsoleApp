public class ZcourseDemo {
    public static void main(String[] args) {

        Zinstructor myInstructor = new Zinstructor("Gabriel", "Mawule", "RH800");

        Ztestbook myTestbook = new Ztestbook("Starting out with java", "Gaddis", "Pearson");

        Zcourse myCourse = new Zcourse("Java", myInstructor, myTestbook);

        System.out.println(myCourse);

    }

}
