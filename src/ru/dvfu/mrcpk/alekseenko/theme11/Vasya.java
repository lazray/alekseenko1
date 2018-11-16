package ru.dvfu.mrcpk.alekseenko.theme11;



// Определение типа объекта "Вася"

    public class Vasya extends Person {

        // Данные в записной книжке
        private String firstname, lastname, middlename, gender, email, phonenumber, addresses;


        // Пустой конструктор
        Vasya() {
        }


        // Конструктор с заданием параметров
        public Vasya(String firstname, String lastname, String middlename) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.middlename = middlename;
        }

        public String getGender() {
            return gender;
        }

        public String getEmail() {
            return email;
        }

        public String getPhonenumber() {
            return phonenumber;
        }

        public String getAddresses() {
            return addresses;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setPhonenumber(String phonenumber) {
            this.phonenumber = phonenumber;
        }

        public void setAddresses(String addresses) {
            this.addresses = addresses;
        }
    }
