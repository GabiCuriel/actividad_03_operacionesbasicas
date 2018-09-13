
package main;

import view.viewOperacion;
import model.ModelOperaciones;
import controller.controllerOperacion;

public class Main {
    private static viewOperacion viewOperacion;
    private static ModelOperaciones modelOperaciones;
    private static controllerOperacion controllerOperacion;

    public static void main(String[] args)
    {
        viewOperacion = new viewOperacion();
        modelOperaciones = new ModelOperaciones();
        controllerOperacion = new controllerOperacion(viewOperacion, modelOperaciones);
    }
}
    