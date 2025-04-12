import java.util.ArrayList;

public class RegistroVehicular {
    private static ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    public boolean agregarVehiculo(Vehiculo v) {
        for (Vehiculo veh: vehiculos) {
            vehiculos.add(v);
            System.out.println("Vehiculo agregado correctamente");
            return true;
        }
        vehiculos.add(v);
        System.out.println("Vehiculo agregado correctamente");
        return true;

    }

    public Vehiculo buscarVehiculoPorPlaca(String placa) {
        for (Vehiculo veh : vehiculos) {
            if (veh.getPlaca().equals(placa)) {
                return veh;
            }
        }
        return null;

    }
    public void mostrarTodosVehiculos(){
        if (vehiculos.isEmpty()){
            System.out.println("No hay vehiculos registrados");
        }
        for (Vehiculo veh : vehiculos) {
            veh.mostrarDetalles();
            System.out.println("--------------------");
        }
    }

}