/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rqO_2;
import celestial.rrbb_3;
import celestial.rrzE_2;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class rrMW {
    public static String id_class(String string, String string2) {
        Properties properties = rrMW.id_class(string);
        if (properties == null) {
            return null;
        }
        String string3 = properties.getProperty(string2);
        if (string3 != null) {
            string3 = string3.trim();
        }
        return string3;
    }

    public static Properties id_class(String string) {
        try {
            rqO_2 rqO_22 = new rqO_2(string);
            InputStream inputStream = rrbb_3.id_class(rqO_22);
            if (inputStream == null) {
                return null;
            }
            rrzE_2 rrzE_22 = new rrzE_2();
            rrzE_22.load(inputStream);
            inputStream.close();
            return rrzE_22;
        }
        catch (FileNotFoundException fileNotFoundException) {
            return null;
        }
        catch (IOException iOException) {
            rrbb_3.id_protected("Error parsing: " + string);
            rrbb_3.id_protected(iOException.getClass().getName() + ": " + iOException.getMessage());
            return null;
        }
    }
}

