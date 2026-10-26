/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonParser
 *  org.apache.commons.io.FilenameUtils
 */
package celestial.manager;

import celestial.QY;
import celestial.rrZs_1;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import org.apache.commons.io.FilenameUtils;

public class ConfigManager
implements rrZs_1 {
    public static Object[] id_class = new Object[]{new Gson(), new JsonParser()};
    public Object[] id_break = new Object[2];

    public ConfigManager() {
        this.id_break[0] = new HashMap();
        this.id_case();
    }

    @Override
    public File id_class() {
        if ((File)this.id_break[1] == null) {
            File var5 = new File((File)QY.id_instanceof().id_class[24], "Celestial");
            this.id_break[1] = var5;
            ((File)this.id_break[1]).mkdir();
        }
        return (File)this.id_break[1];
    }

    @Override
    public void id_class(File var1, JsonElement var2) {
        Thread var3 = new Thread(() -> {
            try {
                String var2x = ((Gson)id_class[0]).toJson(var2);
                byte[] var3x = var2x.getBytes(StandardCharsets.UTF_8);
                byte[] var4 = ConfigManager.id_class(var3x);
                Files.write(var1.toPath(), var4, new OpenOption[0]);
            }
            catch (IOException var5) {
                var5.printStackTrace();
            }
        });
        var3.start();
    }

    @Override
    public boolean id_class(File var1) {
        return var1.exists();
    }

    @Override
    public File id_class(String var1) {
        return (File)((Map)this.id_break[0]).get(var1);
    }

    @Override
    public void id_class(String var1, File var2) {
        try {
            if (FilenameUtils.getExtension((String)var2.getName()).equals("")) {
                var2.mkdirs();
            } else {
                var2.createNewFile();
            }
            ((Map)this.id_break[0]).put(var1, var2);
        }
        catch (IOException var4) {
            var4.printStackTrace();
        }
    }

    private static byte[] id_class(byte[] var0) throws IOException {
        if (var0.length == 0) {
            return var0;
        }
        Deflater var1 = new Deflater();
        var1.setLevel(9);
        var1.setInput(var0);
        var1.finish();
        ByteArrayOutputStream var2 = new ByteArrayOutputStream(var0.length);
        byte[] var3 = new byte[1024];
        while (!var1.finished()) {
            int var4 = var1.deflate(var3);
            var2.write(var3, 0, var4);
        }
        var2.close();
        var1.end();
        return var2.toByteArray();
    }

    private static byte[] id_break(byte[] var0) throws DataFormatException, IOException {
        if (var0.length == 0) {
            return var0;
        }
        Inflater var1 = new Inflater();
        var1.setInput(var0);
        ByteArrayOutputStream var2 = new ByteArrayOutputStream(var0.length);
        byte[] var3 = new byte[1024];
        while (!var1.finished()) {
            int var4 = var1.inflate(var3);
            var2.write(var3, 0, var4);
        }
        var2.close();
        var1.end();
        return var2.toByteArray();
    }

    @Override
    public JsonElement id_break(File var1) {
        try {
            if (!var1.exists()) {
                return null;
            }
            byte[] var2 = Files.readAllBytes(var1.toPath());
            byte[] var3 = ConfigManager.id_break(var2);
            String var4 = new String(var3, 0, var3.length, StandardCharsets.UTF_8);
            return ((JsonParser)id_class[1]).parse(var4);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    private void id_case() {
        File var1 = this.id_class();
        this.id_class("configs", new File(var1, "configs"));
        this.id_class("creeperfarm", new File(var1, "creeperfarm"));
        this.id_class("misc", new File(var1, "misc"));
        this.id_class("proxy", new File(var1, "proxy"));
    }
}

