/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Streams
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.DK;
import celestial.Do_1;
import celestial.UX;
import celestial.rqO_2;
import celestial.xd_3;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Streams;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class DD {
    private final Optional<rqO_2> id_class;
    private final Set<UX> id_break;
    private Optional<String> id_byte;

    public DD(Optional<rqO_2> optional, Optional<String> optional2, UX ... uXArray) {
        this.id_class = optional;
        this.id_byte = optional2;
        this.id_break = ImmutableSet.copyOf((Object[])uXArray);
    }

    private Map<UX, rqO_2> id_class(Do_1 do_1) {
        return (Map)Streams.concat((Stream[])new Stream[]{this.id_break.stream(), do_1.id_class()}).collect(ImmutableMap.toImmutableMap(Function.identity(), do_1::id_class));
    }

    public rqO_2 id_class(xd_3 xd_32, Do_1 do_1, BiConsumer<rqO_2, Supplier<JsonElement>> biConsumer) {
        return this.id_class(DK.id_class(xd_32, this.id_byte.orElse("")), do_1, biConsumer);
    }

    public rqO_2 id_class(xd_3 xd_32, String string, Do_1 do_1, BiConsumer<rqO_2, Supplier<JsonElement>> biConsumer) {
        return this.id_class(DK.id_class(xd_32, string + this.id_byte.orElse("")), do_1, biConsumer);
    }

    public rqO_2 id_class(rqO_2 rqO_22, Do_1 do_1, BiConsumer<rqO_2, Supplier<JsonElement>> biConsumer) {
        Map<UX, rqO_2> map = this.id_class(do_1);
        biConsumer.accept(rqO_22, () -> {
            JsonObject jsonObject = new JsonObject();
            this.id_class.ifPresent(rqO_22 -> jsonObject.addProperty("parent", rqO_22.toString()));
            if (!map.isEmpty()) {
                JsonObject jsonObject2 = new JsonObject();
                map.forEach((uX, rqO_22) -> jsonObject2.addProperty(uX.id_class(), rqO_22.toString()));
                jsonObject.add("textures", (JsonElement)jsonObject2);
            }
            return jsonObject;
        });
        return rqO_22;
    }

    public rqO_2 id_break(xd_3 xd_32, String string, Do_1 do_1, BiConsumer<rqO_2, Supplier<JsonElement>> biConsumer) {
        return this.id_class(DK.id_class(xd_32, string), do_1, biConsumer);
    }
}

