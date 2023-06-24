//import model.FileHandler;
import model.listToy.ListToy;
import model.listToy.ServiceData;
import model.listToy.ServiceListToy;
import model.toy.Toy;
import presenter.Presenter;
import ui.Console;
import ui.View;

import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        ListToy<Toy> listToy = new ListToy<>();
        ServiceListToy tr = new ServiceListToy(listToy);
        ServiceData data = new ServiceData();
        View consoleView = new Console();
        new Presenter(consoleView,tr, data);
        consoleView.start();
    }
}
