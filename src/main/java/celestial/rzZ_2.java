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
import celestial.rQz_1;
import celestial.rqO_2;
import celestial.rzF_2;
import celestial.rzv_3;
import celestial.rzz_3;
import com.google.common.collect.ImmutableMap;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rzZ_2
extends jf_3 {
    private static final Logger id_class = LogManager.getLogger();
    private static final Gson id_break = rzF_2.id_class().create();
    private Map<rqO_2, rQz_1> id_byte = ImmutableMap.of();

    public rzZ_2() {
        super(id_break, "predicates");
    }

    public rQz_1 id_class(rqO_2 rqO_22) {
        return this.id_byte.get(rqO_22);
    }

    @Override
    protected void id_class(Map<rqO_2, JsonElement> map, rAL rAL2) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        map.forEach((rqO_22, jsonElement) -> {
            try {
                if (jsonElement.isJsonArray()) {
                    rQz_1[] rQz_1Array = (rQz_1[])id_break.fromJson(jsonElement, rQz_1[].class);
                    builder.put(rqO_22, (Object)new rzv_3(rQz_1Array));
                } else {
                    rQz_1 rQz_12 = (rQz_1)id_break.fromJson(jsonElement, rQz_1.class);
                    builder.put(rqO_22, (Object)rQz_12);
                }
            }
            catch (Exception exception) {
                id_class.error("Couldn't parse loot table {}", rqO_22, (Object)exception);
            }
        });
        ImmutableMap immutableMap = builder.build();
        rQs_1 rQs_12 = new rQs_1(rzz_3.id_extends, ((Map)immutableMap)::get, rqO_22 -> null);
        immutableMap.forEach((rqO_22, rQz_12) -> rQz_12.id_class(rQs_12.id_break("{" + rqO_22 + "}", (rqO_2)rqO_22)));
        rQs_12.id_class().forEach((string, string2) -> id_class.warn("Found validation problem in " + string + ": " + string2));
        this.id_byte = immutableMap;
    }

    public Set<rqO_2> id_break() {
        return Collections.unmodifiableSet(this.id_byte.keySet());
    }
}

