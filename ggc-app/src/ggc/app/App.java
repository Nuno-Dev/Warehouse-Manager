package ggc.app;

import pt.tecnico.uilib.Dialog;
import pt.tecnico.uilib.menus.Menu;
import ggc.WarehouseManager;
import ggc.exceptions.ImportFileException;
import java.io.*;

/** Main driver for the management application. */
public class App {

  /** @param args command line arguments. */
  public static void main(String[] args) {
    WarehouseManager manager = new WarehouseManager();

    String datafile = System.getProperty("import");
    if (datafile != null) {
      try {
        manager.importFile(datafile);
      } catch (ImportFileException e) {
        e.printStackTrace();
      }
    }

    Menu menu = new ggc.app.main.Menu(manager);
    menu.open();

  }
}