/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.io.Files
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  org.apache.commons.io.IOUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rpY_2;
import celestial.rqO_2;
import com.google.common.collect.Maps;
import com.google.common.io.Files;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class jo_3 {
    protected static final Logger id_class = LogManager.getLogger();
    private final Map<String, File> id_break = Maps.newHashMap();
    private final Map<rqO_2, File> id_byte = Maps.newHashMap();

    protected jo_3() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public jo_3(File file, String string) {
        File file2 = new File(file, "objects");
        File file3 = new File(file, "indexes/" + string + ".json");
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = Files.newReader((File)file3, (Charset)StandardCharsets.UTF_8);
            JsonObject jsonObject = rpY_2.id_class(bufferedReader);
            JsonObject jsonObject2 = rpY_2.id_class(jsonObject, "objects", (JsonObject)null);
            if (jsonObject2 != null) {
                for (Map.Entry entry : jsonObject2.entrySet()) {
                    JsonObject jsonObject3 = (JsonObject)entry.getValue();
                    String string2 = (String)entry.getKey();
                    String[] stringArray = string2.split("/", 2);
                    String string3 = rpY_2.id_case(jsonObject3, "hash");
                    File file4 = new File(file2, string3.substring(0, 2) + "/" + string3);
                    if (stringArray.length == 1) {
                        this.id_break.put(stringArray[0], file4);
                        continue;
                    }
                    this.id_byte.put(new rqO_2(stringArray[0], stringArray[1]), file4);
                }
            }
        }
        catch (JsonParseException jsonParseException) {
            id_class.error("Unable to parse resource index file: {}", (Object)file3);
        }
        catch (FileNotFoundException fileNotFoundException) {
            id_class.error("Can't find the resource index file: {}", (Object)file3);
        }
        finally {
            IOUtils.closeQuietly((Reader)bufferedReader);
        }
    }

    public File id_class(String string) {
        return this.id_break.get(string);
    }

    public Collection<rqO_2> id_class(String string, String string2, int n, Predicate<String> predicate) {
        return this.id_byte.keySet().stream().filter(rqO_22 -> {
            String string3 = rqO_22.id_break();
            return rqO_22.id_byte().equals(string2) && !string3.endsWith(".mcmeta") && string3.startsWith(string + "/") && predicate.test(string3);
        }).collect(Collectors.toList());
    }

    public File id_class(rqO_2 rqO_22) {
        return this.id_byte.get(rqO_22);
    }
}

