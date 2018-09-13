package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.ModelOperaciones;
import view.viewOperacion;
public class controllerOperacion implements ActionListener
{
    private final ModelOperaciones modelOperaciones;
    private final viewOperacion viewOperacion;
    public controllerOperacion(viewOperacion viewOperacion, ModelOperaciones modelOperaciones)
    {
        this.viewOperacion = viewOperacion;
        this.modelOperaciones = modelOperaciones;
        viewOperacion.jb_resta.addActionListener(this);
        viewOperacion.jb_suma.addActionListener(this);
        viewOperacion.jb_multiplicacion.addActionListener(this);
        viewOperacion.jb_divicion.addActionListener(this);
        viewOperacion.jb_modulo.addActionListener(this);
        initView();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
       if(e.getSource()==viewOperacion.jb_suma)
       {
           viewOperacion.jl_numero1.setText(modelOperaciones.getMessage());
           viewOperacion.jl_numero2.setText(modelOperaciones.getMessage());
       }
       if(e.getSource()==viewOperacion.jb_resta)
       {
           viewOperacion.jl_numero1.setText(modelOperaciones.getMessage());
           viewOperacion.jl_numero2.setText(modelOperaciones.getMessage());
       }
       if(e.getSource()==viewOperacion.jb_multiplicacion)
       {
           viewOperacion.jl_numero1.setText(modelOperaciones.getMessage());
           viewOperacion.jl_numero2.setText(modelOperaciones.getMessage());
       }
       if(e.getSource()==viewOperacion.jb_divicion)
       {
           viewOperacion.jl_numero1.setText(modelOperaciones.getMessage());
           viewOperacion.jl_numero2.setText(modelOperaciones.getMessage());
       }
       if(e.getSource()==viewOperacion.jb_modulo)
       {
           viewOperacion.jl_numero1.setText(modelOperaciones.getMessage());
           viewOperacion.jl_numero2.setText(modelOperaciones.getMessage());
       }
    }
    private void initView() 
    {
        viewOperacion.setTitle("Resolviendo operaciones básicas");
        viewOperacion.setLocationRelativeTo(null);
        viewOperacion.jl_numero1.setText(modelOperaciones.getMessage());
        viewOperacion.jl_numero2.setText(modelOperaciones.getMessage());
        viewOperacion.setVisible(true);
    }
}
