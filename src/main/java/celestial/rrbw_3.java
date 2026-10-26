/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rqO_2;
import celestial.rrWD;
import celestial.rrbI_2;
import celestial.rrbb_3;
import celestial.rrzE_2;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Random;

public class rrbw_3 {
    private static rrbI_2 id_class = null;
    private static final Random id_break = new Random();

    private static String[] id_byte() {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add("textures/gui/title/background");
        for (int i = 0; i < 100; ++i) {
            String string = "optifine/gui/background" + i;
            String string2 = string + "/panorama_0.png";
            rqO_2 rqO_22 = new rqO_2(string2);
            if (!rrbb_3.id_byte(rqO_22)) continue;
            arrayList.add(string);
        }
        return arrayList.toArray(new String[arrayList.size()]);
    }

    private static int id_class(int[] nArray) {
        int n = rrWD.id_break(nArray);
        int n2 = id_break.nextInt(n);
        int n3 = 0;
        for (int i = 0; i < nArray.length; ++i) {
            if ((n3 += nArray[i]) <= n2) continue;
            return i;
        }
        return nArray.length - 1;
    }

    private static Properties[] id_class(String[] stringArray) {
        Properties[] propertiesArray = new Properties[stringArray.length];
        for (int i = 0; i < stringArray.length; ++i) {
            String string = stringArray[i];
            if (i == 0) {
                string = "optifine/gui";
            } else {
                rrbb_3.id_byte("CustomPanorama: " + string);
            }
            rqO_2 rqO_22 = new rqO_2(string + "/background.properties");
            try {
                InputStream inputStream = rrbb_3.id_class(rqO_22);
                if (inputStream == null) continue;
                rrzE_2 rrzE_22 = new rrzE_2();
                rrzE_22.load(inputStream);
                rrbb_3.id_byte("CustomPanorama: " + rqO_22.id_break());
                propertiesArray[i] = rrzE_22;
                inputStream.close();
                continue;
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        return propertiesArray;
    }

    public static rrbI_2 id_class() {
        return id_class;
    }

    private static int[] id_class(Properties[] propertiesArray) {
        int[] nArray = new int[propertiesArray.length];
        for (int i = 0; i < nArray.length; ++i) {
            Properties properties = propertiesArray[i];
            if (properties == null) {
                properties = propertiesArray[0];
            }
            if (properties == null) {
                nArray[i] = 1;
                continue;
            }
            String string = properties.getProperty("weight", null);
            nArray[i] = rrbb_3.id_class(string, 1);
        }
        return nArray;
    }

    public static void id_break() {
        id_class = null;
        String[] stringArray = rrbw_3.id_byte();
        if (stringArray.length > 1) {
            rrbI_2 rrbI_22;
            Properties[] propertiesArray = rrbw_3.id_class(stringArray);
            int[] nArray = rrbw_3.id_class(propertiesArray);
            int n = rrbw_3.id_class(nArray);
            String string = stringArray[n];
            Properties properties = propertiesArray[n];
            if (properties == null) {
                properties = propertiesArray[0];
            }
            if (properties == null) {
                properties = new rrzE_2();
            }
            id_class = rrbI_22 = new rrbI_2(string, properties);
        }
    }
}

