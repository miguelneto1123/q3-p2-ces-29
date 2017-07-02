package exe03;

/**
 * Created by miguel on 7/2/17.
 */
public class ControllerFactory {
    public static Controller buildController(Object model, Object view){
        return new Controller(model, view);
    }
}
