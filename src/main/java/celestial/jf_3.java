/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.Gson
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonParseException
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.jY_2;
import celestial.rAF;
import celestial.rAL;
import celestial.rpY_2;
import celestial.rqO_2;
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class jf_3
extends jY_2<Map<rqO_2, JsonElement>> {
    private static final Logger id_class = LogManager.getLogger();
    private static final int id_break = ".json".length();
    private final Gson id_byte;
    private final String id_protected;

    public jf_3(Gson gson, String string) {
        this.id_byte = gson;
        this.id_protected = string;
    }

    protected Map<rqO_2, JsonElement> id_class(rAL rAL2) {
        HashMap hashMap = Maps.newHashMap();
        int n = this.id_protected.length() + 1;
        for (rqO_2 rqO_22 : rAL2.id_class(this.id_protected, (String string) -> string.endsWith(".json"))) {
            String string2 = rqO_22.id_break();
            rqO_2 rqO_23 = new rqO_2(rqO_22.id_byte(), string2.substring(n, string2.length() - id_break));
            try {
                rAF rAF2 = rAL2.id_class(rqO_22);
                try {
                    InputStream inputStream = rAF2.id_break();
                    try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));){
                        JsonElement jsonElement = rpY_2.id_class(this.id_byte, (Reader)bufferedReader, JsonElement.class);
                        if (jsonElement != null) {
                            JsonElement jsonElement2 = hashMap.put(rqO_23, jsonElement);
                            if (jsonElement2 == null) continue;
                            throw new IllegalStateException("Duplicate data file ignored with ID " + rqO_23);
                        }
                        id_class.error("Couldn't load data file {} from {} as it's null or empty", (Object)rqO_23, (Object)rqO_22);
                    }
                    finally {
                        if (inputStream == null) continue;
                        inputStream.close();
                    }
                }
                finally {
                    if (rAF2 == null) continue;
                    rAF2.close();
                }
            }
            catch (JsonParseException | IOException | IllegalArgumentException throwable) {
                id_class.error("Couldn't parse data file {} from {}", (Object)rqO_23, (Object)rqO_22, (Object)throwable);
            }
        }
        return hashMap;
    }

    @Override
    protected /* synthetic */ Object id_break(rAL rAL2) {
        return this.id_class(rAL2);
    }
}

