import javax.faces.component.UIComponent;
import javax.faces.view.facelets.ComponentConfig;
import javax.faces.view.facelets.ComponentHandler;
import javax.faces.view.facelets.FaceletContext;

public class FrontendComponentHandler extends ComponentHandler {
    public FrontendComponentHandler(ComponentConfig config) {
        super(config);
    }

//    @Override
//    public void onComponentCreated(FaceletContext ctx, UIComponent c, UIComponent parent) {
//        FrontendComponent component = (FrontendComponent) c;
//        component.setTagName(tag.getLocalName());
//    }
}

