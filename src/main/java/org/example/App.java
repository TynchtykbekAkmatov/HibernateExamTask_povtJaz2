package org.example;

import org.example.config.Config;
import org.example.entity.Course;
import org.example.entity.Instructor;
import org.example.entity.Lesson;
import org.example.entity.Task;
import org.example.service.CourseServiceImpl;
import org.example.service.InstructorServiceImpl;
import org.example.service.LessonServiceImpl;
import org.example.service.TaskServiceImpl;

import java.time.LocalDate;
import java.util.Scanner;


public class App {
    private static Instructor instructor1 = new Instructor("Zamir", "Sabyrjanov", "zamir@gmail.com", 999999999L);
    private static Instructor instructor2 = new Instructor("Muhammed", "Allanaov", "muhamed@gmail.com", 777777777L);
    private static Instructor instructor3 = new Instructor("Aijamal", "Asangazieva", "aijamal@gmail.com", 555555555L);
    private static Instructor instructor4 = new Instructor("Nurisa", "Mamiraimova", "nurisa@gmail.com", 888888888L);

    private static Course course1 = new Course("Java", 9L, LocalDate.of(2022, 4, 1), "talentlms.com/course_image#1", "backend-senior");
    private static Course course2 = new Course("JScript", 9L, LocalDate.of(2022, 5, 1), "talentlms.com/course_image2", "frontend-middle");
    private static Course course3 = new Course("Python", 9L, LocalDate.of(2022, 6, 1), "talentlms.com/course_image#3", "backend-junior");

    private static Lesson lesson1 = new Lesson("Git, Json", "talentlms.com/lesson#1" );
    private static Lesson lesson2 = new Lesson("Postgres SQL", "talentlms.com/lesson#2" );
    private static Lesson lesson3 = new Lesson("JDBC", "talentlms.com/lesson#3" );
    private static Lesson lesson4 = new Lesson("Hibernate", "talentlms.com/lesson#4" );
    private static Lesson lesson5 = new Lesson("Hibernate mapping", "talentlms.com/lesson#5" );

    private static Lesson lesson6 = new Lesson("Java Script киришуу", "talentlms.com/jslesson#1" );
    private static Lesson lesson7 = new Lesson("Java Script 1-сабак", "talentlms.com/jslesson#2" );
    private static Lesson lesson8 = new Lesson("Java Script 2-сабак", "talentlms.com/jslesson#3" );

    private static Lesson lesson9 = new Lesson("Python kirishuu", "talentlms.com/p_lesson#1" );
    private static Lesson lesson10 = new Lesson("Python 1 - сабак", "talentlms.com/p_lesson#2" );
    private static Lesson lesson11 = new Lesson("Python 2 - сабак", "talentlms.com/p_lesson#3" );

    private static Task task1 = new Task("Motor Depot", LocalDate.of(2022,7,11), "Ар бир этап буткондо Git ке merge жасап тургула!");
    private static Task task2 = new Task("Table SQL", LocalDate.of(2022,7,13), "Таблицадагы маалыматтарды сорттоп чыгаргыла!");
    private static Task task3 = new Task("JDBC тапшырма", LocalDate.of(2022,7,15), "Таблицаны JDBC менен тузгуло!");

    private static Task task4 = new Task("JS Home Work #1", LocalDate.of(2022,8,5), "JS деген эмне оз алдынча изилдеп келуу");
    private static Task task5 = new Task("JS Home Work #2", LocalDate.of(2022,8,7), "JS сайттын структурасы");
    private static Task task6 = new Task("JS Home Work #3", LocalDate.of(2022,8,9), "JS файлдар менен иштоо");

    private static Task task7 = new Task("Python Home Work #1", LocalDate.of(2022,8,11), "Python деген эмне оз алдынча изилдеп келуу");
    private static Task task8 = new Task("Python Home Work #2", LocalDate.of(2022,8,15), "Python сайттын структурасы");
    private static Task task9 = new Task("Python Home Work #3", LocalDate.of(2022,8,21), "Python файлдар менен иштоо"); // Таблицага берилуучу маанилер ушул жакта

    public static void main(String[] args) {

        Config.getSessionFactory();

        Scanner scanner = new Scanner(System.in);
        CourseServiceImpl courseService = new CourseServiceImpl();
        InstructorServiceImpl instructorService = new InstructorServiceImpl();
        LessonServiceImpl lessonService = new LessonServiceImpl();
        TaskServiceImpl taskService = new TaskServiceImpl();

        System.out.println("┌─────────────────────────────────────┬────┐ ");
        System.out.println("│ КУРСТАРДЫ ТАБЛИЦАГА САКТОО..........│  1 │ ");
        System.out.println("│ ИНСТРУКТОРЛОРДУ ТАБЛИЦАГА САКТОО....│  2 │ ");
        System.out.println("│ САБАКТАРДЫ ТАБЛИЦАГА САКТОО.........│  3 │ ");
        System.out.println("│ ТАПШЫРМАЛАРДЫ ТАБЛИЦАГА САКТОО......│  4 │ ");
        System.out.println("├─────────────────────────────────────┼────┤ ");
        System.out.println("│ КУРСТУ ID МЕНЕН ЧЫГАРУУ.............│  5 │");
        System.out.println("│ БАРДЫК КУРСТАРДЫ ЧЫГАРУУ............│  6 │");
        System.out.println("│ БИР КУРСТУ АЛМАШТЫРУУ...............│  7 │");
        System.out.println("│ КУРСТУ ID МЕНЕН ОЧУРУУ..............│  8 │");
        System.out.println("│ КУРСТУ АТЫ МЕНЕН ЧЫГАРУУ............│  9 │");
        System.out.println("├─────────────────────────────────────┼────┤");
        System.out.println("│ ИНСТРУКТОРДУ АЛМАШТЫРУУ УЧУН........│ 10 │");
        System.out.println("│ ИНСТРУКТОРДУ ID МЕНЕН ЧЫГАРУУ.......│ 11 │");
        System.out.println("│ ИНСТРУКТОРДУ ID МЕНЕН ОЧУРУУ........│ 12 │");
        System.out.println("│ ИНСТРУКТОРДУ КУРСКА ДАЙЫНДОО........│ 13 │");
        System.out.println("│ ИНСТРУК.ДУ КУРСТУН ID МЕНЕН ЧЫГАРУУ.│ 14 │");
        System.out.println("├─────────────────────────────────────┼────┤");
        System.out.println("│ САБАКТЫ БАШКА САБАКА АЛМАШТЫРУУ.....│ 15 │");
        System.out.println("│ САБАКТЫ ID МЕНЕН ЧЫГАРУУ............│ 16 │");
        System.out.println("│ САБАКТЫ КУРСТУН ID МЕНЕН ЧЫГАРУУ....│ 17 │");
        System.out.println("├─────────────────────────────────────┼────┤");
        System.out.println("│ ТАПШЫРМАНЫ БАШКАГА АЛМАШТЫРУУ.......│ 18 │");
        System.out.println("│ ТАП.ЛАРДЫ САБАКТЫН ID МЕНЕН ЧЫГАРУУ.│ 19 │");
        System.out.println("│ ТАПШЫРМАНЫ ID МЕНЕН ОЧУРУУ..........│ 20 │");
        System.out.println("└─────────────────────────────────────┴────┘");

        int num = scanner.nextInt();
        switch (num){
//--------------------------------------------------------------------------------saveMethods:
            case 1:
                    saveCoursesMethod(); // Курстарды таблицага сактоо
                break;
            case 2:
                    saveInstMethod(); // Инструкторлорду таблицага сактоо
                break;
            case 3:
                    saveLessonsMethod(); // Сабактарды таблицага сактоо
                break;
            case 4:
                    saveTasksMethod();  // Тапшырмаларды таблицага сактоо
                break;
//--------------------------------------------------------------------------------courseMethods:
            case 5:
                System.out.println("┌───────────────────────────────────────────────┐ ");
                System.out.println("│ КАЙСЫ КУРС ЧЫКСЫН? КУРСТУН ID НОМЕРИН ЖАЗЫНЫЗ │ ");
                System.out.println("└───────────────────────────────────────────────┘");
                Long courseID1 = scanner.nextLong();
                System.out.println(courseService.getCourseById(courseID1));  // Курсту ID менен алуу
                break;
            case 6:
                for (Course c: courseService.getAllCourse()) {  // Бардык курстарды чыгаруу
                System.out.println(c);
                }
                break;
            case 7:

                    System.out.println("┌───────────────────────────────────────────────┐");
                    System.out.println("│ КАЙСЫ КУРСТУ АЛМАШТЫРАСЫЗ ID НОМЕРИН ЖАЗЫНЫЗ  │");
                    System.out.println("└───────────────────────────────────────────────┘");
                Long courseID2 = scanner.nextLong();
                    System.out.println("┌──────────────────────────────────────┐");
                    System.out.println("│  КАЙСЫ КУРСКА АЛМАШТЫРАСЫЗ ТАНДАНЫЗ  │");
                    System.out.println("│   1: Java │ 2: JScript │ 3: Python   │");
                    System.out.println("└──────────────────────────────────────┘");
                int courseNum = scanner.nextInt();

                if (courseNum == 1){
                    courseService.update(courseID2, course1);        // Курсту алмаштыруу
                } else if (courseNum == 2) {
                    courseService.update(courseID2, course2);
                } else if (courseNum == 3) {
                    courseService.update(courseID2, course3);
                }

                break;
            case 8:
                System.out.println("┌─────────────────────────────────────────────┐");
                System.out.println("│ КАЙСЫ КУРСТУ ОЧУРОСУЗ ID НОМЕРИН ЖАЗЫНЫЗ    │");
                System.out.println("└─────────────────────────────────────────────┘");
                Long courseID3 = scanner.nextLong();
                courseService.deleteCourseById(courseID3); // Курсту ID менен очуруу
                break;
            case 9:

                getCourseByNameHelpMethod();
                break;
//--------------------------------------------------------------------------------InstructorMethods:
            case 10:
                System.out.println("┌─────────────────────────────────────────────────────┐");
                System.out.println("│ КАЙСЫ ИНСТРУКТОРДУ АЛМАШТЫРАСЫЗ ID НОМЕРИН ЖАЗЫНЫЗ  │");
                System.out.println("└─────────────────────────────────────────────────────┘");
                Long instID1 = scanner.nextLong();
                System.out.println("┌────────────────────────────────────────────────┐");
                System.out.println("│    КАЙСЫ ИНСТРУКТОРГО АЛМАШТЫРАСЫЗ ТАНДАНЫЗ    │");
                System.out.println("│1: Zamir │ 2: Muhammed │ 3: Aijamal │ 4: Nurisa │");
                System.out.println("└────────────────────────────────────────────────┘");
                int instNum = scanner.nextInt();

                if (instNum == 1){
                    instructorService.update(instID1, instructor1); // +++  ИНСТРУКТОРДУ АЛМАШТЫРУУ
                } else if (instNum == 2) {
                    instructorService.update(instID1, instructor2);
                } else if (instNum == 3) {
                    instructorService.update(instID1, instructor3);
                } else if (instNum == 4) {
                    instructorService.update(instID1, instructor4);
                }

                break;
            case 11:
                System.out.println("┌─────────────────────────────────────────────┐");
                System.out.println("│ КАЙСЫ ИНСТРУКТОР ЧЫКСЫН ID НОМЕРИН ЖАЗЫНЫЗ  │");
                System.out.println("└─────────────────────────────────────────────┘");
                Long instID2 = scanner.nextLong();
                instructorService.getInstructorById(instID2); // +++  ИНСТРУКТОРДУ ID МЕНЕН АЛУУ
                break;
            case 12:
                System.out.println("┌────────────────────────────────────────────┐");
                System.out.println("│ КАЙСЫ ИНСТРУКТОР ОЧСУН ID НОМЕРИН ЖАЗЫНЫЗ  │");
                System.out.println("└────────────────────────────────────────────┘");
                Long instID3 = scanner.nextLong();
                instructorService.deleteInstructorById(instID3);  // ИНСТРУКТОРДУ ID МЕНЕН ОЧУРУУ
                break;
            case 13:
                System.out.println("┌────────────────────────────────────────────────────────┐");
                System.out.println("│ Zamir, Muhammed, Aijamal, Nurisa УШУЛ ИНСТРУКТОРЛОРДОН │");
                System.out.println("│ БИРООСУН ТАНДАП, АНЫН ТАБЛИЦАДАГЫ ID НОМЕРИН ЖАЗЫНЫЗ   │");
                System.out.println("└────────────────────────────────────────────────────────┘");
                Long insID = scanner.nextLong();
                System.out.println("┌────────────────────────────────────────────────────┐");
                System.out.println("│ СИЗ ТАНДАГАН ИНСТРУКТОРДУ КАЙСЫ КУРСКА ДАЙЫНДЫЙСЫЗ │");
                System.out.println("│     ОШОЛ КУРСТУН ТАБЛИЦАДАГЫ ID НОМЕРИН ЖАЗЫНЫЗ    │");
                System.out.println("└────────────────────────────────────────────────────┘");
                Long corID = scanner.nextLong();
                instructorService.assignInstructorToCourse(corID, insID); // +++  ИНСТРУКТОРДУ КУРСКА ДАЙЫНДОО
                break;
            case 14:
                System.out.println("┌───────────────────────────────────────────────────────────────────────┐");
                System.out.println("│ ИНСТРУКТОРДУ ЧЫГАРУУ УЧУН АЛ САБАК БЕРГЕН КУРСТУН ID НОМЕРИН ЖАЗЫНЫЗ  │");
                System.out.println("└───────────────────────────────────────────────────────────────────────┘");
                Long courID1 = scanner.nextLong();
                instructorService.getInstructorByCourseId(courID1);

//                System.out.println(instructorService.getInstructorByCourseId(courID1)); // ИНСТРУК.ДУ КУРСТУН ID МЕНЕН ЧЫГАРУУ
                break;
//--------------------------------------------------------------------------------lessonMethods:
            case 15:
                System.out.println("┌───────────────────────────────────────────────┐");
                System.out.println("│ КАЙСЫ САБАКТЫ АЛМАШТЫРАСЫЗ ID НОМЕРИН ЖАЗЫНЫЗ │");
                System.out.println("└───────────────────────────────────────────────┘");
                Long lessID = scanner.nextLong();
                System.out.println("┌────────────────────────────────────┐");
                System.out.println("│КАЙСЫ САБАККА АЛМАШТЫРАСЫЗ ТАНДАНЫЗ │");
                System.out.println("├────────────────────────────────────┤");
                System.out.println("│  1│ Git, Json                      │ ");
                System.out.println("│  2│ Postgres SQL                   │ ");
                System.out.println("│  3│ JDBC                           │ ");
                System.out.println("│  4│ Hibernate                      │ ");
                System.out.println("│  5│ Hibernate mapping              │ ");
                System.out.println("│  6│ Java Script киришуу            │ ");
                System.out.println("│  7│ Java Script 1-сабак            │ ");
                System.out.println("│  8│ Java Script 2-сабак            │ ");
                System.out.println("│  9│ Python киришуу                 │ ");
                System.out.println("│ 10│ Python 1 - сабак               │ ");
                System.out.println("│ 11│ Python 2 - сабак               │ ");
                System.out.println("└────────────────────────────────────┘");
                int lessNum = scanner.nextInt();

                if (lessNum == 1){
                    lessonService.update(lessID, lesson1);
                }else if (lessNum == 2) {
                    lessonService.update(lessID, lesson2);
                }else if (lessNum == 3) {
                    lessonService.update(lessID, lesson3);
                }else if (lessNum == 4) {
                    lessonService.update(lessID, lesson4);
                }else if (lessNum == 5) {
                    lessonService.update(lessID, lesson5);
                }else if (lessNum == 6) {
                    lessonService.update(lessID, lesson6);
                }else if (lessNum == 7) {
                    lessonService.update(lessID, lesson7);
                }else if (lessNum == 8) {
                    lessonService.update(lessID, lesson8);
                }else if (lessNum == 9) {
                    lessonService.update(lessID, lesson9);
                }else if (lessNum == 10) {
                    lessonService.update(lessID, lesson10);
                }else if (lessNum == 11) {
                    lessonService.update(lessID, lesson11);
                }

                break;
            case 16:
                System.out.println("┌────────────────────────────────────────┐");
                System.out.println("│ КАЙСЫ САБАК ЧЫКСЫН ID НОМЕРИН ЖАЗЫНЫЗ  │");
                System.out.println("└────────────────────────────────────────┘");
                Long lessID1 = scanner.nextLong();
                lessonService.getLessonById(lessID1);
                break;
            case 17:
                System.out.println("┌──────────────────────────────────────────────────────────────────────┐");
                System.out.println("│ САБАКТЫ КУРСТУН ID НОМЕРИ МЕНЕН АЛУУ УЧУН КУРСТУН ID НОМЕРИН ЖАЗЫНЫЗ │");
                System.out.println("└──────────────────────────────────────────────────────────────────────┘");
                Long lessID2 = scanner.nextLong();
                lessonService.getLessonByCourseId(lessID2);
                break;
//--------------------------------------------------------------------------------taskMethods:
            case 18:
                //----------------------------------------------------------------------------
                System.out.println("┌──────────────────────────────────────────────────┐");
                System.out.println("│ КАЙСЫ ТАПШЫРМАНЫ АЛМАШТЫРАСЫЗ ID НОМЕРИН ЖАЗЫНЫЗ │");
                System.out.println("└──────────────────────────────────────────────────┘");
                Long taskID = scanner.nextLong();

                System.out.println("┌─────────────────────────────┐");
                System.out.println("│ КАЙСЫ ТАПШЫРМАГА            │");
                System.out.println("│ АЛМАШТЫРАСЫЗ ТАНДАНЫЗ:      │");
                System.out.println("├─────────────────────────────┤");
                System.out.println("│ 1 │ Motor Depot             │");
                System.out.println("│ 2 │ Table SQL               │");
                System.out.println("│ 3 │ JDBC тапшырма           │");
                System.out.println("│ 4 │ JS Home Work #1         │");
                System.out.println("│ 5 │ JS Home Work #2         │");
                System.out.println("│ 6 │ JS Home Work #3         │");
                System.out.println("│ 7 │ Python Home Work #1     │");
                System.out.println("│ 8 │ Python Home Work #2     │");
                System.out.println("│ 9 │ Python Home Work #3     │");
                System.out.println("└─────────────────────────────┘");
                int taskNum = scanner.nextInt();

                if (taskNum == 1){
                    taskService.update(taskID, task1); // +++
                } else if (taskNum == 2) {
                    taskService.update(taskID, task2);
                } else if (taskNum == 3) {
                    taskService.update(taskID, task3);
                } else if (taskNum == 4) {
                    taskService.update(taskID, task4);
                } else if (taskNum == 5) {
                    taskService.update(taskID, task5);
                } else if (taskNum == 6) {
                    taskService.update(taskID, task6);
                } else if (taskNum == 7) {
                    taskService.update(taskID, task7);
                } else if (taskNum == 8) {
                    taskService.update(taskID, task8);
                } else if (taskNum == 9) {
                    taskService.update(taskID, task9);
                }
                break;
            case 19:
                System.out.println("┌──────────────────────────────────────────┐");
                System.out.println("│ БИР САБАКТАГЫ ТАПШЫРМАЛАРДЫ ЧЫГАРУУ УЧУН │");
                System.out.println("│ ОШОЛ САБАКТЫН ID НОМЕРИН ЖАЗЫНЫЗ         │");
                System.out.println("└──────────────────────────────────────────┘");
                Long taskID1 = scanner.nextLong();
                for (Task t: taskService.getAllTaskByLessonId(taskID1)) {  // +++
                System.out.println(t);
                }
                break;
            case 20:
                System.out.println("┌──────────────────────────────────────────────┐");
                System.out.println("│ КАЙСЫ ТАПШЫРМАНЫ ОЧУРОСУЗ ID НОМЕРИН ЖАЗЫНЫЗ │");
                System.out.println("└──────────────────────────────────────────────┘");
                Long taskID2 = scanner.nextLong();
                taskService.deleteTaskById(taskID2);  // ---
                break;
        }
//---------------------------------------------------------------------
//        System.out.println(courseService.getCourseById(1L)); // +++
//---------------------------------------------------------------------
//        for (Course c: courseService.getAllCourse()) {  // +++
//            System.out.println(c);
//        }
//---------------------------------------------------------------------
//        courseService.update(3L, course1); // +++
//---------------------------------------------------------------------
//        courseService.deleteCourseById(1L); // +++
//---------------------------------------------------------------------
//        System.out.println(courseService.getCourseByCourseName("Java")); // +++
//---------------------------------------------------------------------
//        instructorService.update(2L, instructor2); // +++
//        instructorService.getInstructorById(2L); // +++
//        instructorService.deleteInstructorById(4L);
//        instructorService.assignInstructorToCourse(1L, 4L); // +++
//        System.out.println(instructorService.getInstructorByCourseId(2L));

//        lessonService.update(1L, lesson4);  // +++
//        lessonService.getLessonById(5L);
//        lessonService.getLessonByCourseId(1L);

//        taskService.update(9L, task2); // +++
//        for (Task t: taskService.getAllTaskByLessonId(2L)) {  // +++
//        System.out.println(t);
//        }
//        taskService.deleteTaskById(10L);  // ---

    }
    public static void saveCoursesMethod() {

        int a = 0;
        while (a < 3) {
            System.out.println("┌─────────────────────────────────────────────────────────┐");
            System.out.println("│ Java КУРСУН ТАБЛИЦАГА САКТОО УЧУН 1 БАСКЫЧЫН БАСЫНЫЗ    │");
            System.out.println("│ JScript КУРСУН ТАБЛИЦАГА САКТОО УЧУН 2 БАСКЫЧЫН БАСЫНЫЗ │");
            System.out.println("│ Python КУРСУН ТАБЛИЦАГА САКТОО УЧУН 3 БАСКЫЧЫН БАСЫНЫЗ  │");
            System.out.println("└─────────────────────────────────────────────────────────┘");

        Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            CourseServiceImpl courseService = new CourseServiceImpl();
            if (number == 1) {
                courseService.saveCourse(course1);
            } else if (number == 2) {
                courseService.saveCourse(course2);
            } else if (number == 3) {
                courseService.saveCourse(course3);
            }
            a++;
//        courseService.getCourseById(2L);
        }
    }
//---------------------------------------------------------------------
    public static void saveInstMethod(){

        int a = 0;
        while (a < 4) {
            System.out.println("┌────────────────────────────────────────────────────────────────┐");
            System.out.println("│ ЗАМИР САБЫРЖАНОВДУ ТАБЛИЦАГА САКТОО УЧУН 1 БАСКЫЧЫН БАСЫНЫЗ    │");
            System.out.println("│ МУХАММЕД АЛЛАНОВДУ ТАБЛИЦАГА САКТОО УЧУН 2 БАСКЫЧЫН БАСЫНЫЗ    │");
            System.out.println("│ АЙЖАМАЛ АСАНГАЗИЕВАНЫ ТАБЛИЦАГА САКТОО УЧУН 3 БАСКЫЧЫН БАСЫНЫЗ │");
            System.out.println("│ НУРИСА МАМИРАИМОВАНЫ ТАБЛИЦАГА САКТОО УЧУН 4 БАСКЫЧЫН БАСЫНЫЗ  │");
            System.out.println("└────────────────────────────────────────────────────────────────┘");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        InstructorServiceImpl instructorService = new InstructorServiceImpl();
        if (number == 1){
            instructorService.saveInstructor(instructor1);
        }else if (number == 2) {
                instructorService.saveInstructor(instructor2);
        } else if (number == 3) {
            instructorService.saveInstructor(instructor3);
        } else if (number == 4) {
            instructorService.saveInstructor(instructor4);
        }
        a++;

        }

    }
//---------------------------------------------------------------------
    public static void saveLessonsMethod(){

    int a = 0;
while (a < 11) {
    System.out.println("┌────────────────────────────┐ ");
    System.out.println("│ БИР САБАКТЫ ТАНДАНЫЗ:      │ ");
    System.out.println("├────────────────────────────┤");
    System.out.println("│ 1 │ Git, Json              │ ");
    System.out.println("│ 2 │ Postgres SQL           │ ");
    System.out.println("│ 3 │ JDBC                   │ ");
    System.out.println("│ 4 │ Hibernate              │ ");
    System.out.println("│ 5 │ Hibernate mapping      │ ");
    System.out.println("│ 6 │ Java Script киришуу    │ ");
    System.out.println("│ 7 │ Java Script 1-сабак    │ ");
    System.out.println("│ 8 │ Java Script 2-сабак    │ ");
    System.out.println("│ 9 │ Python киришуу         │ ");
    System.out.println("│ 10│ Python 1 - сабак       │ ");
    System.out.println("│ 11│ Python 2 - сабак       │ ");
    System.out.println("└────────────────────────────┘ ");

    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();

    LessonServiceImpl lessonService = new LessonServiceImpl();

    if (number == 1) {
        System.out.println("┌────────────────────────────────────────────────────────────────────────────────┐ ");
        System.out.println("│ СИЗ №1 - [Git, Json] САБАГЫН ТАНДАДЫНЫЗ                                        │ ");
        System.out.println("│ СИЗ ТАНДАГАН САБАКТЫ КАЙСЫ КУРСКА КОШУУНУ КААЛАЙСЫЗ КУРСТУН ID НОМЕРИН ЖАЗЫНЫЗ:│ ");
        System.out.println("│      Java КУРСУ ID: 1      │ JScript КУРСУ ID: 2      │ Python КУРСУ ID: 3     │ ");
        System.out.println("├────────────────────────────┴──────────────────────────┴────────────────────────┤");
        System.out.println("│   ЭСКЕРТУУ! КУРСТАРДЫН ID НОМЕРЛЕРИ ТАБЛИЦАДА БАШКА БОЛУУСУ МУМКУН АНДЫКТАН    │");
        System.out.println("│         ID НОМЕРДИ ЖАЗАРДАН МУРДА КУРСТАРДЫН ТАБЛИЦАСЫН КАРАП КОЙУНУЗ!         │");
        System.out.println("└────────────────────────────────────────────────────────────────────────────────┘");
        Long id = scanner.nextLong();
        lessonService.saveLesson(id, lesson1);
    } else if (number == 2) {
        System.out.println("┌────────────────────────────────────────────────────────────────────────────────┐");
        System.out.println("│ СИЗ №2 - [Postgres SQL] САБАГЫН ТАНДАДЫНЫЗ                                     │ ");
        System.out.println("│ СИЗ ТАНДАГАН САБАКТЫ КАЙСЫ КУРСКА КОШУУНУ КААЛАЙСЫЗ КУРСТУН ID НОМЕРИН ЖАЗЫНЫЗ:│");
        System.out.println("│      Java КУРСУ ID: 1      │ JScript КУРСУ ID: 2      │ Python КУРСУ ID: 3     │");
        System.out.println("├────────────────────────────┴──────────────────────────┴────────────────────────┤");
        System.out.println("│   ЭСКЕРТУУ! КУРСТАРДЫН ID НОМЕРЛЕРИ ТАБЛИЦАДА БАШКА БОЛУУСУ МУМКУН АНДЫКТАН    │");
        System.out.println("│         ID НОМЕРДИ ЖАЗАРДАН МУРДА КУРСТАРДЫН ТАБЛИЦАСЫН КАРАП КОЙУНУЗ!         │");
        System.out.println("└────────────────────────────────────────────────────────────────────────────────┘");
        Long id = scanner.nextLong();
        lessonService.saveLesson(id, lesson2);
    } else if (number == 3) {
        System.out.println("┌────────────────────────────────────────────────────────────────────────────────┐  ");
        System.out.println("│ СИЗ №3 - [JDBC] САБАГЫН ТАНДАДЫНЫЗ                                             │ ");
        System.out.println("│ СИЗ ТАНДАГАН САБАКТЫ КАЙСЫ КУРСКА КОШУУНУ КААЛАЙСЫЗ КУРСТУН ID НОМЕРИН ЖАЗЫНЫЗ:│  ");
        System.out.println("│      Java КУРСУ ID: 1      │ JScript КУРСУ ID: 2      │ Python КУРСУ ID: 3     │  ");
        System.out.println("├────────────────────────────┴──────────────────────────┴────────────────────────┤ ");
        System.out.println("│   ЭСКЕРТУУ! КУРСТАРДЫН ID НОМЕРЛЕРИ ТАБЛИЦАДА БАШКА БОЛУУСУ МУМКУН АНДЫКТАН    │");
        System.out.println("│         ID НОМЕРДИ ЖАЗАРДАН МУРДА КУРСТАРДЫН ТАБЛИЦАСЫН КАРАП КОЙУНУЗ!         │");
        System.out.println("└────────────────────────────────────────────────────────────────────────────────┘");
        Long id = scanner.nextLong();
        lessonService.saveLesson(id, lesson3);
    } else if (number == 4) {
        System.out.println("┌────────────────────────────────────────────────────────────────────────────────┐   ");
        System.out.println("│ СИЗ №4 - [Hibernate] САБАГЫН ТАНДАДЫНЫЗ                                        │ ");
        System.out.println("│ СИЗ ТАНДАГАН САБАКТЫ КАЙСЫ КУРСКА КОШУУНУ КААЛАЙСЫЗ КУРСТУН ID НОМЕРИН ЖАЗЫНЫЗ:│   ");
        System.out.println("│      Java КУРСУ ID: 1      │ JScript КУРСУ ID: 2      │ Python КУРСУ ID: 3     │   ");
        System.out.println("├────────────────────────────┴──────────────────────────┴────────────────────────┤   ");
        System.out.println("│   ЭСКЕРТУУ! КУРСТАРДЫН ID НОМЕРЛЕРИ ТАБЛИЦАДА БАШКА БОЛУУСУ МУМКУН АНДЫКТАН    │");
        System.out.println("│         ID НОМЕРДИ ЖАЗАРДАН МУРДА КУРСТАРДЫН ТАБЛИЦАСЫН КАРАП КОЙУНУЗ!         │");
        System.out.println("└────────────────────────────────────────────────────────────────────────────────┘");
        Long id = scanner.nextLong();
        lessonService.saveLesson(id, lesson4);
    } else if (number == 5) {
        System.out.println("┌────────────────────────────────────────────────────────────────────────────────┐   ");
        System.out.println("│ СИЗ №5 - [Hibernate mapping] САБАГЫН ТАНДАДЫНЫЗ                                │ ");
        System.out.println("│ СИЗ ТАНДАГАН САБАКТЫ КАЙСЫ КУРСКА КОШУУНУ КААЛАЙСЫЗ КУРСТУН ID НОМЕРИН ЖАЗЫНЫЗ:│   ");
        System.out.println("│      Java КУРСУ ID: 1      │ JScript КУРСУ ID: 2      │ Python КУРСУ ID: 3     │   ");
        System.out.println("├────────────────────────────┴──────────────────────────┴────────────────────────┤   ");
        System.out.println("│   ЭСКЕРТУУ! КУРСТАРДЫН ID НОМЕРЛЕРИ ТАБЛИЦАДА БАШКА БОЛУУСУ МУМКУН АНДЫКТАН    │ ");
        System.out.println("│         ID НОМЕРДИ ЖАЗАРДАН МУРДА КУРСТАРДЫН ТАБЛИЦАСЫН КАРАП КОЙУНУЗ!         │");
        System.out.println("└────────────────────────────────────────────────────────────────────────────────┘");
        Long id = scanner.nextLong();
        lessonService.saveLesson(id, lesson5);
    } else if (number == 6) {
        System.out.println("┌────────────────────────────────────────────────────────────────────────────────┐   ");
        System.out.println("│ СИЗ №6 - [Java Script киришуу] САБАГЫН ТАНДАДЫНЫЗ                              │   ");
        System.out.println("│ СИЗ ТАНДАГАН САБАКТЫ КАЙСЫ КУРСКА КОШУУНУ КААЛАЙСЫЗ КУРСТУН ID НОМЕРИН ЖАЗЫНЫЗ:│   ");
        System.out.println("│      Java КУРСУ ID: 1      │ JScript КУРСУ ID: 2      │ Python КУРСУ ID: 3     │   ");
        System.out.println("├────────────────────────────┴──────────────────────────┴────────────────────────┤   ");
        System.out.println("│   ЭСКЕРТУУ! КУРСТАРДЫН ID НОМЕРЛЕРИ ТАБЛИЦАДА БАШКА БОЛУУСУ МУМКУН АНДЫКТАН    │");
        System.out.println("│         ID НОМЕРДИ ЖАЗАРДАН МУРДА КУРСТАРДЫН ТАБЛИЦАСЫН КАРАП КОЙУНУЗ!         │");
        System.out.println("└────────────────────────────────────────────────────────────────────────────────┘ ");
        Long id = scanner.nextLong();
        lessonService.saveLesson(id, lesson6);
    } else if (number == 7) {
        System.out.println("┌────────────────────────────────────────────────────────────────────────────────┐   ");
        System.out.println("│ СИЗ №7 - [Java Script 1-сабак] АТТУУ САБАКТЫ ТАНДАДЫНЫЗ                        │   ");
        System.out.println("│ СИЗ ТАНДАГАН САБАКТЫ КАЙСЫ КУРСКА КОШУУНУ КААЛАЙСЫЗ КУРСТУН ID НОМЕРИН ЖАЗЫНЫЗ:│   ");
        System.out.println("│      Java КУРСУ ID: 1      │ JScript КУРСУ ID: 2      │ Python КУРСУ ID: 3     │   ");
        System.out.println("├────────────────────────────┴──────────────────────────┴────────────────────────┤   ");
        System.out.println("│   ЭСКЕРТУУ! КУРСТАРДЫН ID НОМЕРЛЕРИ ТАБЛИЦАДА БАШКА БОЛУУСУ МУМКУН АНДЫКТАН    │");
        System.out.println("│         ID НОМЕРДИ ЖАЗАРДАН МУРДА КУРСТАРДЫН ТАБЛИЦАСЫН КАРАП КОЙУНУЗ!         │ ");
        System.out.println("└────────────────────────────────────────────────────────────────────────────────┘");
        Long id = scanner.nextLong();
        lessonService.saveLesson(id, lesson7);
    } else if (number == 8) {
        System.out.println("┌────────────────────────────────────────────────────────────────────────────────┐   ");
        System.out.println("│ СИЗ №8 - [Java Script 2-сабак] АТТУУ САБАКТЫ ТАНДАДЫНЫЗ                        │   ");
        System.out.println("│ СИЗ ТАНДАГАН САБАКТЫ КАЙСЫ КУРСКА КОШУУНУ КААЛАЙСЫЗ КУРСТУН ID НОМЕРИН ЖАЗЫНЫЗ:│   ");
        System.out.println("│      Java КУРСУ ID: 1      │ JScript КУРСУ ID: 2      │ Python КУРСУ ID: 3     │   ");
        System.out.println("├────────────────────────────┴──────────────────────────┴────────────────────────┤   ");
        System.out.println("│   ЭСКЕРТУУ! КУРСТАРДЫН ID НОМЕРЛЕРИ ТАБЛИЦАДА БАШКА БОЛУУСУ МУМКУН АНДЫКТАН    │");
        System.out.println("│         ID НОМЕРДИ ЖАЗАРДАН МУРДА КУРСТАРДЫН ТАБЛИЦАСЫН КАРАП КОЙУНУЗ!         │  ");
        System.out.println("└────────────────────────────────────────────────────────────────────────────────┘");
        Long id = scanner.nextLong();
        lessonService.saveLesson(id, lesson8);
    } else if (number == 9) {
        System.out.println("┌────────────────────────────────────────────────────────────────────────────────┐   ");
        System.out.println("│ СИЗ №9 - [Python киришуу] АТТУУ САБАКТЫ ТАНДАДЫНЫЗ                             │   ");
        System.out.println("│ СИЗ ТАНДАГАН САБАКТЫ КАЙСЫ КУРСКА КОШУУНУ КААЛАЙСЫЗ КУРСТУН ID НОМЕРИН ЖАЗЫНЫЗ:│   ");
        System.out.println("│      Java КУРСУ ID: 1      │ JScript КУРСУ ID: 2      │ Python КУРСУ ID: 3     │   ");
        System.out.println("├────────────────────────────┴──────────────────────────┴────────────────────────┤   ");
        System.out.println("│   ЭСКЕРТУУ! КУРСТАРДЫН ID НОМЕРЛЕРИ ТАБЛИЦАДА БАШКА БОЛУУСУ МУМКУН АНДЫКТАН    │");
        System.out.println("│         ID НОМЕРДИ ЖАЗАРДАН МУРДА КУРСТАРДЫН ТАБЛИЦАСЫН КАРАП КОЙУНУЗ!         │ ");
        System.out.println("└────────────────────────────────────────────────────────────────────────────────┘   ");
        Long id = scanner.nextLong();
        lessonService.saveLesson(id, lesson9);
    } else if (number == 10) {
        System.out.println("┌────────────────────────────────────────────────────────────────────────────────┐    ");
        System.out.println("│ СИЗ №10 - [Python 1 - сабак] АТТУУ САБАКТЫ ТАНДАДЫНЫЗ                          │   ");
        System.out.println("│ СИЗ ТАНДАГАН САБАКТЫ КАЙСЫ КУРСКА КОШУУНУ КААЛАЙСЫЗ КУРСТУН ID НОМЕРИН ЖАЗЫНЫЗ:│    ");
        System.out.println("│      Java КУРСУ ID: 1      │ JScript КУРСУ ID: 2      │ Python КУРСУ ID: 3     │    ");
        System.out.println("├────────────────────────────┴──────────────────────────┴────────────────────────┤    ");
        System.out.println("│   ЭСКЕРТУУ! КУРСТАРДЫН ID НОМЕРЛЕРИ ТАБЛИЦАДА БАШКА БОЛУУСУ МУМКУН АНДЫКТАН    │    ");
        System.out.println("│         ID НОМЕРДИ ЖАЗАРДАН МУРДА КУРСТАРДЫН ТАБЛИЦАСЫН КАРАП КОЙУНУЗ!         │    ");
        System.out.println("└────────────────────────────────────────────────────────────────────────────────┘    ");
        Long id = scanner.nextLong();
        lessonService.saveLesson(id, lesson10);
    } else if (number == 11) {
        System.out.println("┌────────────────────────────────────────────────────────────────────────────────┐   ");
        System.out.println("│ СИЗ №11 - [Python 2 - сабак] АТТУУ САБАКТЫ ТАНДАДЫНЫЗ                          │   ");
        System.out.println("│ СИЗ ТАНДАГАН САБАКТЫ КАЙСЫ КУРСКА КОШУУНУ КААЛАЙСЫЗ КУРСТУН ID НОМЕРИН ЖАЗЫНЫЗ:│   ");
        System.out.println("│      Java КУРСУ ID: 1      │ JScript КУРСУ ID: 2      │ Python КУРСУ ID: 3     │   ");
        System.out.println("├────────────────────────────┴──────────────────────────┴────────────────────────┤   ");
        System.out.println("│   ЭСКЕРТУУ! КУРСТАРДЫН ID НОМЕРЛЕРИ ТАБЛИЦАДА БАШКА БОЛУУСУ МУМКУН АНДЫКТАН    │   ");
        System.out.println("│         ID НОМЕРДИ ЖАЗАРДАН МУРДА КУРСТАРДЫН ТАБЛИЦАСЫН КАРАП КОЙУНУЗ!         │   ");
        System.out.println("└────────────────────────────────────────────────────────────────────────────────┘   ");
        Long id = scanner.nextLong();
        lessonService.saveLesson(id, lesson11);
    }
    a++;
}
    }
//---------------------------------------------------------------------
    public static void saveTasksMethod(){


    int a = 0;
    while (a < 10) {
        System.out.println("┌─────────────────────────────┐");
        System.out.println("│ ТАПШЫРМАНЫ ТАБЛИЦАГА САКТОО │");
        System.out.println("│ УЧУН НОМЕРИН ТАНДАНЫЗ:      │");
        System.out.println("├─────────────────────────────┤");
        System.out.println("│ 1 │ Motor Depot             │");
        System.out.println("│ 2 │ Table SQL               │");
        System.out.println("│ 3 │ JDBC тапшырма           │");
        System.out.println("│ 4 │ JS Home Work #1         │");
        System.out.println("│ 5 │ JS Home Work #2         │");
        System.out.println("│ 6 │ JS Home Work #3         │");
        System.out.println("│ 7 │ Python Home Work #1     │");
        System.out.println("│ 8 │ Python Home Work #2     │");
        System.out.println("│ 9 │ Python Home Work #3     │");
        System.out.println("└─────────────────────────────┘");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        TaskServiceImpl taskService = new TaskServiceImpl();

        if (number == 1) {
            System.out.println("┌───────────────────────────────────────────────────────────────────────────────┐ ");
            System.out.println("│ СИЗ №1 - [Motor Depot] ТАПШЫРМАНЫ ТАНДАДЫНЫЗ                                  │ ");
            System.out.println("│ ТАПШЫРМАНЫ КАЙСЫ САБАКА КОШУУНУ КААЛАЙСЫЗ САБАКТЫН ID НОМЕРИН  ЖАЗЫНЫЗ:       │ ");
            System.out.println("├───────────────────────────────────────────────────────────────────────────────┤ ");
            System.out.println("│               ЭСКЕРТУУ! САБАКТАРДЫН ID НОМЕРЛЕРИН ЖАЗАРДАН МУРДА              │");
            System.out.println("│                        lessons ТАБЛИЦАСЫН КАРАП КОЙУНУЗ!                      │");
            System.out.println("└───────────────────────────────────────────────────────────────────────────────┘");
            System.out.println("┌────────────────────────────┐ ┌────────────────────────────────────────────────┐");
            System.out.println("│ ID│ САБАКТАР:              │ │ ID НОМЕРЛЕРИ ТАБЛИЦАДА БАШКАЧА БОЛУУСУ МУМКУН! │");
            System.out.println("│ 1 │ Git, Json              │ └────────────────────────────────────────────────┘");
            System.out.println("│ 2 │ Postgres SQL           │ ");
            System.out.println("│ 3 │ JDBC                   │ ");
            System.out.println("│ 4 │ Hibernate              │ ");
            System.out.println("│ 5 │ Hibernate mapping      │ ");
            System.out.println("│ 6 │ Java Script киришуу    │ ");
            System.out.println("│ 7 │ Java Script 1-сабак    │ ");
            System.out.println("│ 8 │ Java Script 2-сабак    │ ");
            System.out.println("│ 9 │ Python киришуу         │ ");
            System.out.println("│ 10│ Python 1 - сабак       │ ");
            System.out.println("│ 11│ Python 2 - сабак       │ ");
            System.out.println("└────────────────────────────┘ ");
            Long id = scanner.nextLong();
            taskService.saveTask(id, task1);
        } else if (number == 2) {
            System.out.println("┌────────────────────────────────────────────────────────────────────────────────┐ ");
            System.out.println("│ СИЗ №2 - [Table SQL] ТАПШЫРМАНЫ ТАНДАДЫНЫЗ                                   │ ");
            System.out.println("│ ТАПШЫРМАНЫ КАЙСЫ САБАКА КОШУУНУ КААЛАЙСЫЗ САБАКТЫН ID НОМЕРИН ЖАЗЫНЫЗ:         │ ");
            System.out.println("├────────────────────────────────────────────────────────────────────────────────┤");
            System.out.println("│               ЭСКЕРТУУ! САБАКТАРДЫН ID НОМЕРЛЕРИН ЖАЗАРДАН МУРДА               │");
            System.out.println("│                        lessons ТАБЛИЦАСЫН КАРАП КОЙУНУЗ!                       │");
            System.out.println("└────────────────────────────────────────────────────────────────────────────────┘");
            System.out.println("┌────────────────────────────┐  ┌────────────────────────────────────────────────┐");
            System.out.println("│ ID│ САБАКТАР:              │  │ ID НОМЕРЛЕРИ ТАБЛИЦАДА БАШКАЧА БОЛУУСУ МУМКУН! │");
            System.out.println("│ 1 │ Git, Json              │  └────────────────────────────────────────────────┘");
            System.out.println("│ 2 │ Postgres SQL           │");
            System.out.println("│ 3 │ JDBC                   │");
            System.out.println("│ 4 │ Hibernate              │");
            System.out.println("│ 5 │ Hibernate mapping      │");
            System.out.println("│ 6 │ Java Script киришуу    │");
            System.out.println("│ 7 │ Java Script 1-сабак    │");
            System.out.println("│ 8 │ Java Script 2-сабак    │");
            System.out.println("│ 9 │ Python киришуу         │");
            System.out.println("│ 10│ Python 1 - сабак       │");
            System.out.println("│ 11│ Python 2 - сабак       │");
            System.out.println("└────────────────────────────┘");
            Long id = scanner.nextLong();
            taskService.saveTask(id, task2);
        } else if (number == 3) {
            System.out.println("┌────────────────────────────────────────────────────────────────────────────────┐ ");
            System.out.println("│ СИЗ №3 - [JDBC тапшырма] ТАПШЫРМАНЫ ТАНДАДЫНЫЗ                                   │ ");
            System.out.println("│ ТАПШЫРМАНЫ КАЙСЫ САБАКА КОШУУНУ КААЛАЙСЫЗ САБАКТЫН ID НОМЕРИН ЖАЗЫНЫЗ:         │ ");
            System.out.println("├────────────────────────────────────────────────────────────────────────────────┤");
            System.out.println("│               ЭСКЕРТУУ! САБАКТАРДЫН ID НОМЕРЛЕРИН ЖАЗАРДАН МУРДА               │");
            System.out.println("│                        lessons ТАБЛИЦАСЫН КАРАП КОЙУНУЗ!                       │");
            System.out.println("└────────────────────────────────────────────────────────────────────────────────┘");
            System.out.println("┌────────────────────────────┐  ┌────────────────────────────────────────────────┐");
            System.out.println("│ ID│ САБАКТАР:              │  │ ID НОМЕРЛЕРИ ТАБЛИЦАДА БАШКАЧА БОЛУУСУ МУМКУН! │");
            System.out.println("│ 1 │ Git, Json              │  └────────────────────────────────────────────────┘");
            System.out.println("│ 2 │ Postgres SQL           │");
            System.out.println("│ 3 │ JDBC                   │");
            System.out.println("│ 4 │ Hibernate              │");
            System.out.println("│ 5 │ Hibernate mapping      │");
            System.out.println("│ 6 │ Java Script киришуу    │");
            System.out.println("│ 7 │ Java Script 1-сабак    │");
            System.out.println("│ 8 │ Java Script 2-сабак    │");
            System.out.println("│ 9 │ Python киришуу         │");
            System.out.println("│ 10│ Python 1 - сабак       │");
            System.out.println("│ 11│ Python 2 - сабак       │");
            System.out.println("└────────────────────────────┘");
            Long id = scanner.nextLong();
            taskService.saveTask(id, task3);
        } else if (number == 4) {
            System.out.println("┌────────────────────────────────────────────────────────────────────────────────┐ ");
            System.out.println("│ СИЗ №4 - [JS Home Work #1] ТАПШЫРМАНЫ ТАНДАДЫНЫЗ                                   │ ");
            System.out.println("│ ТАПШЫРМАНЫ КАЙСЫ САБАКА КОШУУНУ КААЛАЙСЫЗ САБАКТЫН ID НОМЕРИН ЖАЗЫНЫЗ:         │ ");
            System.out.println("├────────────────────────────────────────────────────────────────────────────────┤");
            System.out.println("│               ЭСКЕРТУУ! САБАКТАРДЫН ID НОМЕРЛЕРИН ЖАЗАРДАН МУРДА               │");
            System.out.println("│                        lessons ТАБЛИЦАСЫН КАРАП КОЙУНУЗ!                       │");
            System.out.println("└────────────────────────────────────────────────────────────────────────────────┘");
            System.out.println("┌────────────────────────────┐  ┌────────────────────────────────────────────────┐");
            System.out.println("│ ID│ САБАКТАР:              │  │ ID НОМЕРЛЕРИ ТАБЛИЦАДА БАШКАЧА БОЛУУСУ МУМКУН! │");
            System.out.println("│ 1 │ Git, Json              │  └────────────────────────────────────────────────┘");
            System.out.println("│ 2 │ Postgres SQL           │");
            System.out.println("│ 3 │ JDBC                   │");
            System.out.println("│ 4 │ Hibernate              │");
            System.out.println("│ 5 │ Hibernate mapping      │");
            System.out.println("│ 6 │ Java Script киришуу    │");
            System.out.println("│ 7 │ Java Script 1-сабак    │");
            System.out.println("│ 8 │ Java Script 2-сабак    │");
            System.out.println("│ 9 │ Python киришуу         │");
            System.out.println("│ 10│ Python 1 - сабак       │");
            System.out.println("│ 11│ Python 2 - сабак       │");
            System.out.println("└────────────────────────────┘");
            Long id = scanner.nextLong();
            taskService.saveTask(id, task4);
        } else if (number == 5) {
            System.out.println("┌────────────────────────────────────────────────────────────────────────────────┐ ");
            System.out.println("│ СИЗ №5 - [JS Home Work #2] ТАПШЫРМАНЫ ТАНДАДЫНЫЗ                                   │ ");
            System.out.println("│ ТАПШЫРМАНЫ КАЙСЫ САБАКА КОШУУНУ КААЛАЙСЫЗ САБАКТЫН ID НОМЕРИН ЖАЗЫНЫЗ:         │ ");
            System.out.println("├────────────────────────────────────────────────────────────────────────────────┤");
            System.out.println("│               ЭСКЕРТУУ! САБАКТАРДЫН ID НОМЕРЛЕРИН ЖАЗАРДАН МУРДА               │");
            System.out.println("│                        lessons ТАБЛИЦАСЫН КАРАП КОЙУНУЗ!                       │");
            System.out.println("└────────────────────────────────────────────────────────────────────────────────┘");
            System.out.println("┌────────────────────────────┐  ┌────────────────────────────────────────────────┐");
            System.out.println("│ ID│ САБАКТАР:              │  │ ID НОМЕРЛЕРИ ТАБЛИЦАДА БАШКАЧА БОЛУУСУ МУМКУН! │");
            System.out.println("│ 1 │ Git, Json              │  └────────────────────────────────────────────────┘");
            System.out.println("│ 2 │ Postgres SQL           │");
            System.out.println("│ 3 │ JDBC                   │");
            System.out.println("│ 4 │ Hibernate              │");
            System.out.println("│ 5 │ Hibernate mapping      │");
            System.out.println("│ 6 │ Java Script киришуу    │");
            System.out.println("│ 7 │ Java Script 1-сабак    │");
            System.out.println("│ 8 │ Java Script 2-сабак    │");
            System.out.println("│ 9 │ Python киришуу         │");
            System.out.println("│ 10│ Python 1 - сабак       │");
            System.out.println("│ 11│ Python 2 - сабак       │");
            System.out.println("└────────────────────────────┘");
            Long id = scanner.nextLong();
            taskService.saveTask(id, task5);
        }else if (number == 6) {
            System.out.println("┌────────────────────────────────────────────────────────────────────────────────┐ ");
            System.out.println("│ СИЗ №6 - [JS Home Work #3] ТАПШЫРМАНЫ ТАНДАДЫНЫЗ                                   │ ");
            System.out.println("│ ТАПШЫРМАНЫ КАЙСЫ САБАКА КОШУУНУ КААЛАЙСЫЗ САБАКТЫН ID НОМЕРИН ЖАЗЫНЫЗ:         │ ");
            System.out.println("├────────────────────────────────────────────────────────────────────────────────┤");
            System.out.println("│               ЭСКЕРТУУ! САБАКТАРДЫН ID НОМЕРЛЕРИН ЖАЗАРДАН МУРДА               │");
            System.out.println("│                        lessons ТАБЛИЦАСЫН КАРАП КОЙУНУЗ!                       │");
            System.out.println("└────────────────────────────────────────────────────────────────────────────────┘");
            System.out.println("┌────────────────────────────┐  ┌────────────────────────────────────────────────┐");
            System.out.println("│ ID│ САБАКТАР:              │  │ ID НОМЕРЛЕРИ ТАБЛИЦАДА БАШКАЧА БОЛУУСУ МУМКУН! │");
            System.out.println("│ 1 │ Git, Json              │  └────────────────────────────────────────────────┘");
            System.out.println("│ 2 │ Postgres SQL           │");
            System.out.println("│ 3 │ JDBC                   │");
            System.out.println("│ 4 │ Hibernate              │");
            System.out.println("│ 5 │ Hibernate mapping      │");
            System.out.println("│ 6 │ Java Script киришуу    │");
            System.out.println("│ 7 │ Java Script 1-сабак    │");
            System.out.println("│ 8 │ Java Script 2-сабак    │");
            System.out.println("│ 9 │ Python киришуу         │");
            System.out.println("│ 10│ Python 1 - сабак       │");
            System.out.println("│ 11│ Python 2 - сабак       │");
            System.out.println("└────────────────────────────┘");
            Long id = scanner.nextLong();
            taskService.saveTask(id, task6);
        }else if (number == 7) {
            System.out.println("┌────────────────────────────────────────────────────────────────────────────────┐ ");
            System.out.println("│ СИЗ №7 - [Python Home Work #1] ТАПШЫРМАНЫ ТАНДАДЫНЫЗ                                   │ ");
            System.out.println("│ ТАПШЫРМАНЫ КАЙСЫ САБАКА КОШУУНУ КААЛАЙСЫЗ САБАКТЫН ID НОМЕРИН ЖАЗЫНЫЗ:         │ ");
            System.out.println("├────────────────────────────────────────────────────────────────────────────────┤");
            System.out.println("│               ЭСКЕРТУУ! САБАКТАРДЫН ID НОМЕРЛЕРИН ЖАЗАРДАН МУРДА               │");
            System.out.println("│                        lessons ТАБЛИЦАСЫН КАРАП КОЙУНУЗ!                       │");
            System.out.println("└────────────────────────────────────────────────────────────────────────────────┘");
            System.out.println("┌────────────────────────────┐  ┌────────────────────────────────────────────────┐");
            System.out.println("│ ID│ САБАКТАР:              │  │ ID НОМЕРЛЕРИ ТАБЛИЦАДА БАШКАЧА БОЛУУСУ МУМКУН! │");
            System.out.println("│ 1 │ Git, Json              │  └────────────────────────────────────────────────┘");
            System.out.println("│ 2 │ Postgres SQL           │");
            System.out.println("│ 3 │ JDBC                   │");
            System.out.println("│ 4 │ Hibernate              │");
            System.out.println("│ 5 │ Hibernate mapping      │");
            System.out.println("│ 6 │ Java Script киришуу    │");
            System.out.println("│ 7 │ Java Script 1-сабак    │");
            System.out.println("│ 8 │ Java Script 2-сабак    │");
            System.out.println("│ 9 │ Python киришуу         │");
            System.out.println("│ 10│ Python 1 - сабак       │");
            System.out.println("│ 11│ Python 2 - сабак       │");
            System.out.println("└────────────────────────────┘");
            Long id = scanner.nextLong();
            taskService.saveTask(id, task7);
        }else if (number == 8) {
            System.out.println("┌────────────────────────────────────────────────────────────────────────────────┐ ");
            System.out.println("│ СИЗ №8 - [Python Home Work #2] ТАПШЫРМАНЫ ТАНДАДЫНЫЗ                                   │ ");
            System.out.println("│ ТАПШЫРМАНЫ КАЙСЫ САБАКА КОШУУНУ КААЛАЙСЫЗ САБАКТЫН ID НОМЕРИН ЖАЗЫНЫЗ:         │ ");
            System.out.println("├────────────────────────────────────────────────────────────────────────────────┤");
            System.out.println("│               ЭСКЕРТУУ! САБАКТАРДЫН ID НОМЕРЛЕРИН ЖАЗАРДАН МУРДА               │");
            System.out.println("│                        lessons ТАБЛИЦАСЫН КАРАП КОЙУНУЗ!                       │");
            System.out.println("└────────────────────────────────────────────────────────────────────────────────┘");
            System.out.println("┌────────────────────────────┐  ┌────────────────────────────────────────────────┐");
            System.out.println("│ ID│ САБАКТАР:              │  │ ID НОМЕРЛЕРИ ТАБЛИЦАДА БАШКАЧА БОЛУУСУ МУМКУН! │");
            System.out.println("│ 1 │ Git, Json              │  └────────────────────────────────────────────────┘");
            System.out.println("│ 2 │ Postgres SQL           │");
            System.out.println("│ 3 │ JDBC                   │");
            System.out.println("│ 4 │ Hibernate              │");
            System.out.println("│ 5 │ Hibernate mapping      │");
            System.out.println("│ 6 │ Java Script киришуу    │");
            System.out.println("│ 7 │ Java Script 1-сабак    │");
            System.out.println("│ 8 │ Java Script 2-сабак    │");
            System.out.println("│ 9 │ Python киришуу         │");
            System.out.println("│ 10│ Python 1 - сабак       │");
            System.out.println("│ 11│ Python 2 - сабак       │");
            System.out.println("└────────────────────────────┘");
            Long id = scanner.nextLong();
            taskService.saveTask(id, task8);
        }else if (number == 9) {
            System.out.println("┌────────────────────────────────────────────────────────────────────────────────┐ ");
            System.out.println("│ СИЗ №9 - [Python Home Work #3] ТАПШЫРМАНЫ ТАНДАДЫНЫЗ                           │ ");
            System.out.println("│ ТАПШЫРМАНЫ КАЙСЫ САБАКА КОШУУНУ КААЛАЙСЫЗ САБАКТЫН ID НОМЕРИН ЖАЗЫНЫЗ:         │ ");
            System.out.println("├────────────────────────────────────────────────────────────────────────────────┤");
            System.out.println("│               ЭСКЕРТУУ! САБАКТАРДЫН ID НОМЕРЛЕРИН ЖАЗАРДАН МУРДА               │");
            System.out.println("│                        lessons ТАБЛИЦАСЫН КАРАП КОЙУНУЗ!                       │");
            System.out.println("└────────────────────────────────────────────────────────────────────────────────┘");
            System.out.println("┌────────────────────────────┐  ┌────────────────────────────────────────────────┐");
            System.out.println("│ ID│ САБАКТАР:              │  │ ID НОМЕРЛЕРИ ТАБЛИЦАДА БАШКАЧА БОЛУУСУ МУМКУН! │");
            System.out.println("│ 1 │ Git, Json              │  └────────────────────────────────────────────────┘");
            System.out.println("│ 2 │ Postgres SQL           │");
            System.out.println("│ 3 │ JDBC                   │");
            System.out.println("│ 4 │ Hibernate              │");
            System.out.println("│ 5 │ Hibernate mapping      │");
            System.out.println("│ 6 │ Java Script киришуу    │");
            System.out.println("│ 7 │ Java Script 1-сабак    │");
            System.out.println("│ 8 │ Java Script 2-сабак    │");
            System.out.println("│ 9 │ Python киришуу         │");
            System.out.println("│ 10│ Python 1 - сабак       │");
            System.out.println("│ 11│ Python 2 - сабак       │");
            System.out.println("└────────────────────────────┘");
            Long id = scanner.nextLong();
            taskService.saveTask(id, task9);
        }
        a++;
    }
    }
//---------------------------------------------------------------------

    public static void getCourseByNameHelpMethod(){
        CourseServiceImpl courseService = new CourseServiceImpl();
        Scanner scanner = new Scanner(System.in);
        System.out.println("┌────────────────────────────────┬──────┬─────────┬────────┐");
        System.out.println("│ КАЙСЫ КУРС ЧЫКСЫН АТЫН ЖАЗЫНЫЗ │ Java │ JScript │ Python │");
        System.out.println("└────────────────────────────────┴──────┴─────────┴────────┘");
        String courseName = scanner.nextLine();
        System.out.println(courseService.getCourseByCourseName(courseName)); // Курсту аты менен алуу
    }
}
