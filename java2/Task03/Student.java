package ADF2.Task03;

public class Student {
        String name;
        String classes;
        double maths, chemistry,physics;
        public  Student(){}
    public Student(String name, String classes, double maths, double chemistry, double physics) {
        this.name = name;
        this.classes = classes;
        this.maths = maths;
        this.chemistry = chemistry;
        this.physics = physics;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public double getMaths() {
        return maths;
    }

    public double getChemistry() {
        return chemistry;
    }

    public double getPhysics() {
        return physics;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public void setMaths(double maths) throws  Exception {
      if (maths >=0 && maths <=10){
          this.maths = maths;
        }else {
          throw  new Exception("Math mus be 0-10");
        }
    }

    public void setChemistry(double chemistry) throws  Exception {
            if (chemistry >=0 && chemistry <=10){
                this.chemistry = chemistry;
            }else {
                throw  new Exception("Chemistry mus be 0-10");
            }
        }

    public void setPhysics(double physics) throws  Exception{
        if (physics >=0 && physics <=10){
            this.physics = physics;
        }else {
            throw  new Exception("Physics mus be 0-10");
        }
        }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                ", maths=" + maths +
                ", chemistry=" + chemistry +
                ", physics=" + physics +
                '}';
    }
    public  double getAverage(){
            return (maths + physics + chemistry)/3;
    }
    public String getType() {
       double average = getAverage();
        if (average < 4) {
            return "Type : D";
        } else if (average >= 4 && average < 6) {
            return "Type : C";
        } else if (average >= 6 && average <= 7.5) {
            return "Type : B";
        } else if (average > 7.5){
            return "Type : A";
        } else
            return "";
    }

}
