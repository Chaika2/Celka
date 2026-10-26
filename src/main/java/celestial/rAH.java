/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rAC;
import celestial.rAI;
import celestial.rAo_1;
import celestial.rpY_2;
import celestial.rqO_2;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class rAH
implements rAC {
    private static final Logger id_class = LogManager.getLogger();
    public final File id_break;

    protected abstract boolean id_byte(String var1);

    private static String id_byte(rAI rAI2, rqO_2 rqO_22) {
        return String.format("%s/%s/%s", rAI2.id_class(), rqO_22.id_byte(), rqO_22.id_break());
    }

    public rAH(File file) {
        this.id_break = file;
    }

    @Override
    public <T> T id_class(rAo_1<T> rAo_12) throws IOException {
        T t;
        try (InputStream inputStream = this.id_break("pack.mcmeta");){
            t = rAH.id_class(rAo_12, inputStream);
        }
        return t;
    }

    public static <T> T id_class(rAo_1<T> rAo_12, InputStream inputStream) {
        JsonObject jsonObject;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));){
            jsonObject = rpY_2.id_class(bufferedReader);
        }
        catch (JsonParseException | IOException throwable) {
            id_class.error("Couldn't load {} metadata", (Object)rAo_12.id_class(), (Object)throwable);
            return null;
        }
        if (!jsonObject.has(rAo_12.id_class())) {
            return null;
        }
        try {
            return rAo_12.id_break(rpY_2.id_native(jsonObject, rAo_12.id_class()));
        }
        catch (JsonParseException jsonParseException) {
            id_class.error("Couldn't load {} metadata", (Object)rAo_12.id_class(), (Object)jsonParseException);
            return null;
        }
    }

    protected static String id_class(File file, File file2) {
        return file.toURI().relativize(file2.toURI()).getPath();
    }

    @Override
    public InputStream id_class(rAI rAI2, rqO_2 rqO_22) throws IOException {
        return this.id_break(rAH.id_byte(rAI2, rqO_22));
    }

    @Override
    public String id_class() {
        return this.id_break.getName();
    }

    @Override
    public InputStream id_class(String string) throws IOException {
        if (!string.contains("/") && !string.contains("\\")) {
            return this.id_break(string);
        }
        throw new IllegalArgumentException("Root resources can only be filenames, not paths (no / allowed!)");
    }

    @Override
    public boolean id_break(rAI rAI2, rqO_2 rqO_22) {
        return this.id_byte(rAH.id_byte(rAI2, rqO_22));
    }

    protected abstract InputStream id_break(String var1) throws IOException;

    protected void id_protected(String string) {
        id_class.warn("ResourcePack: ignored non-lowercase namespace: {} in {}", (Object)string, (Object)this.id_break);
    }
}

