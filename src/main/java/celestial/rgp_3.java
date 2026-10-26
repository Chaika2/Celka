/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.gson.JsonElement
 */
package celestial;

import celestial.rgB_2;
import celestial.rgP_2;
import celestial.rgT_2;
import celestial.rgq_3;
import celestial.rgy_3;
import com.google.common.collect.ImmutableMap;
import com.google.gson.JsonElement;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

public class rgp_3<T> {
    public static final rgp_3<rgP_2> id_class = new rgp_3<rgP_2>("show_text", true, rgB_2::id_class, rgB_2::id_break, Function.identity());
    public static final rgp_3<rgT_2> id_break = new rgp_3<rgT_2>("show_item", true, jsonElement -> rgT_2.id_class(jsonElement), rgT_22 -> rgT_22.id_break(), rgP_22 -> rgT_2.id_class(rgP_22));
    public static final rgp_3<rgq_3> id_byte = new rgp_3<rgq_3>("show_entity", true, rgq_3::id_class, rgq_3::id_class, rgq_3::id_class);
    private static final Map<String, rgp_3> id_protected = (Map)Stream.of(id_class, id_break, id_byte).collect(ImmutableMap.toImmutableMap(rgp_3::id_break, rgp_32 -> rgp_32));
    private final String id_throws;
    private final boolean id_case;
    private final Function<JsonElement, T> id_catch;
    private final Function<T, JsonElement> id_private;
    private final Function<rgP_2, T> id_implements;

    public rgp_3(String string, boolean bl, Function<JsonElement, T> function, Function<T, JsonElement> function2, Function<rgP_2, T> function3) {
        this.id_throws = string;
        this.id_case = bl;
        this.id_catch = function;
        this.id_private = function2;
        this.id_implements = function3;
    }

    public String toString() {
        return "<action " + this.id_throws + ">";
    }

    public boolean id_class() {
        return this.id_case;
    }

    public JsonElement id_class(Object object) {
        return this.id_private.apply(this.id_break(object));
    }

    public static rgp_3 id_class(String string) {
        return id_protected.get(string);
    }

    public rgy_3 id_class(JsonElement jsonElement) {
        T t = this.id_catch.apply(jsonElement);
        return t == null ? null : new rgy_3(this, t);
    }

    public rgy_3 id_class(rgP_2 rgP_22) {
        T t = this.id_implements.apply(rgP_22);
        return t == null ? null : new rgy_3(this, t);
    }

    public String id_break() {
        return this.id_throws;
    }

    public T id_break(Object object) {
        return (T)object;
    }
}

