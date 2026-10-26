/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Lists
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  com.google.gson.JsonSyntaxException
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.HO;
import celestial.jY_2;
import celestial.rAF;
import celestial.rAL;
import celestial.rqO_2;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HM
extends jY_2<HO> {
    private static final Logger id_class = LogManager.getLogger();
    private static final rqO_2 id_break = new rqO_2("gpu_warnlist.json");
    private ImmutableMap<String, String> id_byte = ImmutableMap.of();
    private boolean id_protected;
    private boolean id_throws;
    private boolean id_case;

    public boolean id_byte() {
        return this.id_break() && !this.id_throws;
    }

    private static JsonObject id_byte(rAL rAL2) {
        JsonObject jsonObject = null;
        try (rAF rAF2 = rAL2.id_class(id_break);
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(rAF2.id_break(), StandardCharsets.UTF_8));){
            jsonObject = new JsonParser().parse((Reader)bufferedReader).getAsJsonObject();
        }
        catch (JsonSyntaxException | IOException throwable) {
            id_class.warn("Failed to load GPU warnlist");
        }
        return jsonObject;
    }

    @Override
    protected void id_class(HO hO, rAL rAL2) {
        this.id_byte = hO.id_class();
    }

    private static void id_class(JsonArray jsonArray, List<Pattern> list) {
        jsonArray.forEach(jsonElement -> list.add(Pattern.compile(jsonElement.getAsString(), 2)));
    }

    protected HO id_class(rAL rAL2) {
        ArrayList arrayList = Lists.newArrayList();
        ArrayList arrayList2 = Lists.newArrayList();
        ArrayList arrayList3 = Lists.newArrayList();
        JsonObject jsonObject = HM.id_byte(rAL2);
        if (jsonObject != null) {
            HM.id_class(jsonObject.getAsJsonArray("renderer"), arrayList);
            HM.id_class(jsonObject.getAsJsonArray("version"), arrayList2);
            HM.id_class(jsonObject.getAsJsonArray("vendor"), arrayList3);
        }
        return new HO(arrayList, arrayList2, arrayList3);
    }

    @Override
    protected /* synthetic */ Object id_break(rAL rAL2) {
        return this.id_class(rAL2);
    }

    public boolean id_break() {
        return !this.id_byte.isEmpty();
    }

    public void id_throws() {
        this.id_throws = true;
    }

    public String id_finally() {
        return (String)this.id_byte.get((Object)"renderer");
    }

    public boolean id_catch() {
        return this.id_protected && !this.id_throws;
    }

    public String id_extends() {
        return (String)this.id_byte.get((Object)"version");
    }

    public void id_case() {
        this.id_throws = true;
        this.id_case = true;
    }

    public void id_implements() {
        this.id_protected = false;
        this.id_throws = false;
        this.id_case = false;
    }

    public void id_protected() {
        this.id_protected = true;
    }

    public boolean id_private() {
        return this.id_case;
    }

    public String id_volatile() {
        StringBuilder stringBuilder = new StringBuilder();
        this.id_byte.forEach((string, string2) -> stringBuilder.append((String)string).append(": ").append((String)string2));
        return stringBuilder.length() == 0 ? null : stringBuilder.toString();
    }

    public String id_native() {
        return (String)this.id_byte.get((Object)"vendor");
    }
}

