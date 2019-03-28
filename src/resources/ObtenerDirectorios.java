package resources;

import java.io.File;
import java.util.ArrayList;
import resources.model.Dir;

public class ObtenerDirectorios {

    public static void obtenerDirectorios(File dir, ArrayList<Dir> directoriosAPI) {

        File listFile[] = dir.listFiles();
        if (listFile != null) {
            for (File listFile_ : listFile) {
                if (listFile_.isDirectory()) {
                    obtenerDirectorios(listFile_, directoriosAPI);
                } else {
                    String ruta = listFile_.getPath();
                    Integer pos = ruta.indexOf("API");
                    if (pos == -1) {
                        pos = 0;
                    }
                    //System.out.println(pos);
                    directoriosAPI.add(new Dir(ruta, pos));
                }
            }
        }
    }
}
