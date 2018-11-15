package ru.dvfu.mrcpk.alekseenko.theme11;



// Определение типа объекта "Вася"

    public class Vasya extends Person{

        // Данные в записной книжке
       private String  firstname, lastname, middlename, gender, email, phonenumber, addresses;


        // Пустой конструктор
        Vasya(){}


        // Конструктор с заданием параметров
        public Vasya(String firstname, String lastname, String middlename) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.middlename = middlename;




        // Метод задания
        void setFIO(String gender,  String email){
            this.a = a1;
            this.b = b1;
        }

        @Override
        void setParams(float[] params) {
            this.a = params[0];
            this.b = params[1];
        }

        // Метод отображения прямоугольника
        @Override
        void draw(){
            System.out.println("Рисуем прямоугольник со сторонами:");
            System.out.println("a = " + a + ", b = " + b);
            System.out.println("в координатах (" + x + "," + y + ");" );
        }

        // Метод рассчета площади прямоугольника
        float getSquare(){
            return a * b;
        }

        // Метод рассчета периметра прямоугольника
        float getArea(){
            return 2 * a + 2 * b;
        }

        @Override
        public String toString() {
            return "Фигура: Прямоугольник со сторонами \n" +
                    "a = " + a + ", b = " + b +"\n" +
                    "в координатах (" + x + "," + y + ");" ;
        }



}
