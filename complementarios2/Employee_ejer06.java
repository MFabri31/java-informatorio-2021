public class Employee_ejer06 extends Object {

        String name;
        String lastName;
        String id;
        int hoursWorked;
        int hourlyValue;  

        public Employee_ejer06(String name, String lastName, String id, int hoursWorked, int hourlyValue){
            this.name = name;
            this.lastName = lastName;
            this.id = id;
            this.hoursWorked = hoursWorked;
            this.hourlyValue = hourlyValue;
        }

        public int calculateSalary() {
            return (this.hoursWorked * this.hourlyValue);
        }

      
        @Override
        public boolean equals(Object other) {
            if(this == other){
                return true;
            }

            if (other == null) {
                return false;
            }
           
            if (other.getClass() != Employee_ejer06.class) {
                return false;
            }

            // comparación de atributos
            Employee_ejer06 employee = (Employee_ejer06) other;

            if(this.id.equals(employee.id)) {
                return true;
            }else{
                return false;
            }


        }
 
}
 