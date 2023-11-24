package Model;

import java.util.Objects;

public class Car {
    private String license;
    private  int age;
    private String model;

    public Car(String license ,int age , String model){
        this.license=license;
        this.age= age;
        this.model=model;

    }
    public Car() {
        this("",-1,"");
    }

    public String getMatricula() {
        return license;
    }

    public void setMatricula(String matricula) {
        this.license = matricula;
    }

    public int getPuertas() {
        return age;
    }

    public void setPuertas(int puertas) {
        this.age = puertas;
    }
    public String getMarca() {
        return model;
    }

    public void setMarca(String marca) {
        this.model = marca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(license, car.license);
    }

    @Override
    public String toString() {
        return "Car{" +
                "license='" + license + '\'' +
                ", age=" + age +
                ", model='" + model + '\'' +
                '}';
    }
}
