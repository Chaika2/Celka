/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 */
package celestial;

import celestial.QY;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.rrWF;
import celestial.rrbb_3;
import celestial.rrxr_3;
import celestial.rrzE_2;
import celestial.ub_3;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.Executor;

public class rrWv_1 {
    public static float id_class(Properties properties, String string, float f) {
        String string2 = properties.getProperty(string);
        if (string2 == null) {
            return f;
        }
        float f2 = rrbb_3.id_class(string2, Float.MIN_VALUE);
        if (f2 == Float.MIN_VALUE) {
            rrbb_3.id_protected("Invalid value for " + string + ": " + string2);
            return f;
        }
        return f2;
    }

    public static boolean id_class(Properties properties, String string, boolean bl) {
        String string2 = properties.getProperty(string);
        if (string2 == null) {
            return bl;
        }
        String string3 = string2.toLowerCase().trim();
        if (!string3.equals("true") && !string3.equals("on")) {
            if (!string3.equals("false") && !string3.equals("off")) {
                rrbb_3.id_protected("Invalid value for " + string + ": " + string2);
                return bl;
            }
            return false;
        }
        return true;
    }

    public static void id_class() {
        rrWF rrWF2 = new rrWF();
        Executor executor = rqR_2.id_case();
        QY qY = QY.id_instanceof();
        ub_3 ub_32 = (ub_3)rrxr_3.id_class(qY, rrxr_3.Su);
        if (ub_32 != null) {
            ub_32.id_break().id_class(rrWF2, rrbb_3.x(), executor, qY);
        }
    }

    public static Int2ObjectMap<Float> id_class(Properties properties) {
        Int2ObjectOpenHashMap int2ObjectOpenHashMap = new Int2ObjectOpenHashMap();
        for (String string : properties.keySet()) {
            String string2;
            float f;
            String string3;
            int n;
            String string4;
            if (!string.startsWith(string4 = "width.") || (n = rrbb_3.id_class(string3 = string.substring(string4.length()), -1)) < 0 || !((f = rrbb_3.id_class(string2 = properties.getProperty(string), -1.0f)) >= 0.0f)) continue;
            char c = (char)n;
            int2ObjectOpenHashMap.put((int)c, (Object)new Float(f));
        }
        return int2ObjectOpenHashMap;
    }

    public static Properties id_class(rqO_2 rqO_22) {
        String string = rqO_22.id_break();
        rrzE_2 rrzE_22 = new rrzE_2();
        String string2 = ".png";
        if (!string.endsWith(string2)) {
            return rrzE_22;
        }
        String string3 = string.substring(0, string.length() - string2.length()) + ".properties";
        try {
            rqO_2 rqO_23 = new rqO_2(rqO_22.id_byte(), string3);
            InputStream inputStream = rrbb_3.id_class(rrbb_3.x(), rqO_23);
            if (inputStream == null) {
                return rrzE_22;
            }
            rrbb_3.id_case("Loading " + string3);
            rrzE_22.load(inputStream);
            inputStream.close();
        }
        catch (FileNotFoundException fileNotFoundException) {
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        return rrzE_22;
    }

    public static rqO_2 id_break(rqO_2 rqO_22) {
        if (!rrbb_3.U()) {
            return rqO_22;
        }
        if (rqO_22 == null) {
            return rqO_22;
        }
        if (!rrbb_3.id_final()) {
            return rqO_22;
        }
        Object object = rqO_22.id_break();
        String string = "textures/";
        String string2 = "optifine/";
        if (!((String)object).startsWith(string)) {
            return rqO_22;
        }
        object = ((String)object).substring(string.length());
        object = string2 + (String)object;
        rqO_2 rqO_23 = new rqO_2(rqO_22.id_byte(), (String)object);
        return rrbb_3.id_break(rrbb_3.x(), rqO_23) ? rqO_23 : rqO_22;
    }
}

