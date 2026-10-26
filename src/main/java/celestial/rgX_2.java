/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.gson.Gson
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rgJ_2;
import celestial.rgS_2;
import celestial.rpY_2;
import celestial.rpl_3;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.regex.Pattern;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class rgX_2 {
    private static final Logger id_class = LogManager.getLogger();
    private static final Gson id_break = new Gson();
    private static final Pattern id_byte = Pattern.compile("%(\\d+\\$)?[\\d.]*[df]");
    private static volatile rgX_2 id_protected = rgX_2.id_break();

    public static rgX_2 id_byte() {
        return id_protected;
    }

    public abstract boolean id_class();

    public abstract rpl_3 id_class(rgS_2 var1);

    public List<rpl_3> id_class(List<rgS_2> list) {
        return (List)list.stream().map(rgX_2.id_byte()::id_class).collect(ImmutableList.toImmutableList());
    }

    public abstract String id_class(String var1);

    public static void id_class(InputStream inputStream, BiConsumer<String, String> biConsumer) {
        JsonObject jsonObject = (JsonObject)id_break.fromJson((Reader)new InputStreamReader(inputStream, StandardCharsets.UTF_8), JsonObject.class);
        for (Map.Entry entry : jsonObject.entrySet()) {
            String string = id_byte.matcher(rpY_2.id_class((JsonElement)entry.getValue(), (String)entry.getKey())).replaceAll("%$1s");
            biConsumer.accept((String)entry.getKey(), string);
        }
    }

    public static void id_class(rgX_2 rgX_22) {
        id_protected = rgX_22;
    }

    private static rgX_2 id_break() {
        InputStream inputStream;
        ImmutableMap.Builder builder = ImmutableMap.builder();
        BiConsumer<String, String> biConsumer = (arg_0, arg_1) -> ((ImmutableMap.Builder)builder).put(arg_0, arg_1);
        try {
            inputStream = rgX_2.class.getResourceAsStream("/assets/minecraft/celestial/lang/en_us.json");
            try {
                rgX_2.id_class(inputStream, biConsumer);
            }
            finally {
                if (inputStream != null) {
                    inputStream.close();
                }
            }
        }
        catch (JsonParseException | IOException throwable) {
            id_class.error("Couldn't read strings from /assets/minecraft/celestial/lang/en_us.json", throwable);
        }
        inputStream = builder.build();
        return new rgJ_2((Map)((Object)inputStream));
    }

    public abstract boolean id_break(String var1);
}

