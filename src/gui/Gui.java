package gui;

import javax.swing.*;
import java.util.HashMap;

public interface Gui {
    public HashMap<String, String> getInput();
    public HashMap<String, JTable> getOutput();
}
