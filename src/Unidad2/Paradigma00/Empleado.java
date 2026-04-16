package Unidad2.Paradigma00;

public class Empleado {
    private int id;
    private double salario;

    public Empleado(int id, double salario) {
        this.id = id;
        this.salario = salario;
    }

    public void aumentarSalario(double porcentaje) {
        if (porcentaje > 0) {
            double aumento = this.salario * (porcentaje / 100);
            this.salario += aumento;
        }
    }

    public double getSalario() {
        return this.salario;
    }

    public static void main(String[] args) {
        Empleado emp = new Empleado(101, 15000.0);
        System.out.println("Salario inicial: $" + emp.getSalario());

        emp.aumentarSalario(10); // Aumento del 10%
        System.out.println("Salario tras aumento: $" + emp.getSalario());
    }
}
