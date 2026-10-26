/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.rqR_2;
import celestial.uA_2;
import celestial.uC_2;
import celestial.uZ_2;
import celestial.uu_3;
import com.google.common.collect.Maps;
import com.google.gson.JsonObject;
import java.util.Map;
import java.util.function.Function;

public final class uN_2
extends Enum<uN_2> {
    public static final /* enum */ uN_2 BITMAP = new uN_2("bitmap", uZ_2::id_class);
    public static final /* enum */ uN_2 TTF = new uN_2("ttf", uA_2::id_class);
    public static final /* enum */ uN_2 LEGACY_UNICODE = new uN_2("legacy_unicode", uC_2::id_class);
    private static final Map<String, uN_2> TYPES_BY_NAME;
    private final String name;
    private final Function<JsonObject, uu_3> factoryDeserializer;
    private static final /* synthetic */ uN_2[] $VALUES;

    private uN_2(String string2, Function<JsonObject, uu_3> function) {
        this.name = string2;
        this.factoryDeserializer = function;
    }

    static {
        $VALUES = uN_2.id_class();
        TYPES_BY_NAME = rqR_2.id_class(Maps.newHashMap(), hashMap -> {
            for (uN_2 uN_22 : uN_2.values()) {
                hashMap.put(uN_22.name, uN_22);
            }
        });
    }

    public static uN_2[] values() {
        return (uN_2[])$VALUES.clone();
    }

    public static uN_2 valueOf(String string) {
        return Enum.valueOf(uN_2.class, string);
    }

    public uu_3 id_class(JsonObject jsonObject) {
        return this.factoryDeserializer.apply(jsonObject);
    }

    private static /* synthetic */ uN_2[] id_class() {
        return new uN_2[]{BITMAP, TTF, LEGACY_UNICODE};
    }

    public static uN_2 id_class(String string) {
        uN_2 uN_22 = TYPES_BY_NAME.get(string);
        if (uN_22 == null) {
            throw new IllegalArgumentException("Invalid type: " + string);
        }
        return uN_22;
    }
}

