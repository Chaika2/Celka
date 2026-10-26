/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.gson.Gson
 *  com.google.gson.JsonElement
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.jf_3;
import celestial.rAL;
import celestial.rQs_1;
import celestial.rqO_2;
import celestial.rzF_2;
import celestial.rzL_2;
import celestial.rzZ_2;
import celestial.rzl_3;
import celestial.rzz_3;
import com.google.common.collect.ImmutableMap;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rzC_2
extends jf_3 {
    private static final Logger id_class = LogManager.getLogger();
    private static final Gson id_break = rzF_2.id_byte().create();
    private Map<rqO_2, rzL_2> id_byte = ImmutableMap.of();
    private final rzZ_2 id_protected;

    public rzC_2(rzZ_2 rzZ_22) {
        super(id_break, "loot_tables");
        this.id_protected = rzZ_22;
    }

    public rzL_2 id_class(rqO_2 rqO_22) {
        return this.id_byte.getOrDefault(rqO_22, rzL_2.id_class);
    }

    @Override
    protected void id_class(Map<rqO_2, JsonElement> map, rAL rAL2) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        JsonElement jsonElement2 = map.remove(rzl_3.id_class);
        if (jsonElement2 != null) {
            id_class.warn("Datapack tried to redefine {} loot table, ignoring", (Object)rzl_3.id_class);
        }
        map.forEach((rqO_22, jsonElement) -> {
            try {
                rzL_2 rzL_22 = (rzL_2)id_break.fromJson(jsonElement, rzL_2.class);
                builder.put(rqO_22, (Object)rzL_22);
            }
            catch (Exception exception) {
                id_class.error("Couldn't parse loot table {}", rqO_22, (Object)exception);
            }
        });
        builder.put((Object)rzl_3.id_class, (Object)rzL_2.id_class);
        ImmutableMap immutableMap = builder.build();
        rQs_1 rQs_12 = new rQs_1(rzz_3.id_extends, this.id_protected::id_class, arg_0 -> ((ImmutableMap)immutableMap).get(arg_0));
        immutableMap.forEach((rqO_22, rzL_22) -> rzC_2.id_class(rQs_12, rqO_22, rzL_22));
        rQs_12.id_class().forEach((string, string2) -> id_class.warn("Found validation problem in " + string + ": " + string2));
        this.id_byte = immutableMap;
    }

    public static void id_class(rQs_1 rQs_12, rqO_2 rqO_22, rzL_2 rzL_22) {
        rzL_22.id_class(rQs_12.id_class(rzL_22.id_class()).id_class("{" + rqO_22 + "}", rqO_22));
    }

    public static JsonElement id_class(rzL_2 rzL_22) {
        return id_break.toJsonTree((Object)rzL_22);
    }

    public Set<rqO_2> id_break() {
        return this.id_byte.keySet();
    }
}

