package qap.app;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author christian
 */
@ManagedBean(name = "app") // creado en faces-config
@SessionScoped
public class AppJsf implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private final AppModel info;

    public AppJsf() {
        //info = appSvc.getInfo("Qap"); ... si hay logica de negocio, sino
        info = new AppModel("Qap");
    }

    public AppModel getInfo() {
        return info;
    }
            
}
