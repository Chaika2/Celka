/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  org.apache.commons.io.IOUtils
 */
package celestial;

import celestial.Vs_1;
import celestial.fN_2;
import celestial.ff_3;
import celestial.fo_3;
import celestial.rAL;
import celestial.rrdJ;
import celestial.rrdZ;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import org.apache.commons.io.IOUtils;

public class rrdl_1
extends ff_3 {
    private String id_class;

    public rrdl_1(String string) {
        this.id_class = string;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static Vs_1 id_class(String string, Vs_1 vs_1) {
        String string2 = string + ".mcmeta";
        String string3 = "texture";
        InputStream inputStream = rrdZ.id_finally(string2);
        if (inputStream != null) {
            Vs_1 vs_12;
            Object object;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            try {
                JsonObject jsonObject = new JsonParser().parse((Reader)bufferedReader).getAsJsonObject();
                object = jsonObject.getAsJsonObject(string3);
                if (object == null) {
                    Vs_1 vs_13 = vs_1;
                    return vs_13;
                }
                Vs_1 vs_14 = Vs_1.id_class.id_class((JsonObject)object);
                if (vs_14 == null) {
                    Vs_1 vs_15 = vs_1;
                    return vs_15;
                }
                vs_12 = vs_14;
            }
            catch (RuntimeException runtimeException) {
                rrdJ.id_break("Error reading metadata: " + string2);
                rrdJ.id_break(runtimeException.getClass().getName() + ": " + runtimeException.getMessage());
                object = vs_1;
                return object;
            }
            finally {
                IOUtils.closeQuietly((Reader)bufferedReader);
                IOUtils.closeQuietly((InputStream)inputStream);
            }
            return vs_12;
        }
        return vs_1;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a_(rAL rAL2) throws IOException {
        this.id_continue();
        InputStream inputStream = rrdZ.id_finally(this.id_class);
        if (inputStream == null) {
            throw new FileNotFoundException("Shader texture not found: " + this.id_class);
        }
        try {
            fN_2 fN_22 = fN_2.id_class(inputStream);
            Vs_1 vs_1 = rrdl_1.id_class(this.id_class, new Vs_1(false, false));
            fo_3.id_class(this.id_new(), fN_22.id_class(), fN_22.id_break());
            fN_22.id_class(0, 0, 0, 0, 0, fN_22.id_class(), fN_22.id_break(), vs_1.id_class(), vs_1.id_break(), false, true);
        }
        finally {
            IOUtils.closeQuietly((InputStream)inputStream);
        }
    }
}

