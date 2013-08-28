package my.simplegwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;

public class SimpleGwt implements EntryPoint {

    private TextBox text;

    @Override
    public void onModuleLoad() {
        text = new TextBox();
        text.setText("Hello World!!!");
        RootPanel.get("text").add(text);
    }
}
