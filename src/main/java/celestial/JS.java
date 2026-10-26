/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonNull
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.JE;
import celestial.JG;
import celestial.Jb_1;
import celestial.rCF;
import celestial.rCn_1;
import celestial.rXE;
import celestial.rpY_2;
import celestial.xc_3;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class JS {
    public static final JS id_class = new JS((List<JG>)ImmutableList.of());
    private final List<JG> id_break;

    public JS(List<JG> list) {
        this.id_break = ImmutableList.copyOf(list);
    }

    public static JS id_class(JsonElement jsonElement) {
        if (jsonElement != null && !jsonElement.isJsonNull()) {
            JsonObject jsonObject = rpY_2.id_private(jsonElement, "properties");
            ArrayList arrayList = Lists.newArrayList();
            for (Map.Entry entry : jsonObject.entrySet()) {
                arrayList.add(JS.id_class((String)entry.getKey(), (JsonElement)entry.getValue()));
            }
            return new JS(arrayList);
        }
        return id_class;
    }

    public JsonElement id_class() {
        if (this == id_class) {
            return JsonNull.INSTANCE;
        }
        JsonObject jsonObject = new JsonObject();
        if (!this.id_break.isEmpty()) {
            this.id_break.forEach(jG -> jsonObject.add(jG.id_break(), jG.id_class()));
        }
        return jsonObject;
    }

    private static JG id_class(String string, JsonElement jsonElement) {
        if (jsonElement.isJsonPrimitive()) {
            String string2 = jsonElement.getAsString();
            return new JE(string, string2);
        }
        JsonObject jsonObject = rpY_2.id_private(jsonElement, "value");
        String string3 = jsonObject.has("min") ? JS.id_break(jsonObject.get("min")) : null;
        String string4 = jsonObject.has("max") ? JS.id_break(jsonObject.get("max")) : null;
        return string3 != null && string3.equals(string4) ? new JE(string, string3) : new Jb_1(string, string3, string4);
    }

    public <S extends rCn_1<?, S>> boolean id_class(rCF<?, S> rCF2, S s) {
        for (JG jG : this.id_break) {
            if (jG.id_class(rCF2, s)) continue;
            return false;
        }
        return true;
    }

    public boolean id_class(xc_3 xc_32) {
        return this.id_class(xc_32.id_break().id_new(), xc_32);
    }

    public boolean id_class(rXE rXE2) {
        return this.id_class(rXE2.id_class().id_catch(), rXE2);
    }

    public void id_class(rCF<?, ?> rCF2, Consumer<String> consumer) {
        this.id_break.forEach(jG -> jG.id_class(rCF2, consumer));
    }

    private static String id_break(JsonElement jsonElement) {
        return jsonElement.isJsonNull() ? null : jsonElement.getAsString();
    }
}

