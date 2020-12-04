import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.FacesRenderer;
import javax.faces.render.Renderer;
import java.io.IOException;

@FacesRenderer(componentFamily = "frontend.component", rendererType = "frontend.mytag")
public class TagRenderer extends Renderer {
    @Override
    public void encodeEnd(FacesContext context, UIComponent component) throws IOException {
        final String tag = "app-root";
        ResponseWriter writer = context.getResponseWriter();
        writer.startElement(tag, component);
        writer.endElement(tag);
    }
}
