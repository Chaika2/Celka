/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.common.collect.Maps
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonSyntaxException
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.jf_3;
import celestial.rAL;
import celestial.rVL;
import celestial.rXu_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rkj_3;
import celestial.rkw_3;
import celestial.rpY_2;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.rqs_3;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rWB
extends jf_3 {
    private static final Gson id_class = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
    private static final Logger id_break = LogManager.getLogger();
    private Map<rkj_3<?>, Map<rqO_2, rkw_3<?>>> id_byte = ImmutableMap.of();
    private boolean id_protected;

    public <C extends rXu_1, T extends rkw_3<C>> rqs_3<rdn_3> id_byte(rkj_3<T> rkj_32, C c, rYB rYB2) {
        Optional<T> optional = this.id_class(rkj_32, c, rYB2);
        if (optional.isPresent()) {
            return ((rkw_3)optional.get()).id_break(c);
        }
        rqs_3<rdn_3> rqs_32 = rqs_3.id_class(c.id_else(), rdn_3.id_break);
        for (int i = 0; i < rqs_32.size(); ++i) {
            rqs_32.set(i, c.id_extends(i));
        }
        return rqs_32;
    }

    public Stream<rqO_2> id_byte() {
        return this.id_byte.values().stream().flatMap(map -> map.keySet().stream());
    }

    public rWB() {
        super(id_class, "recipes");
    }

    @Override
    protected void id_class(Map<rqO_2, JsonElement> map, rAL rAL2) {
        this.id_protected = false;
        HashMap hashMap = Maps.newHashMap();
        for (Map.Entry<rqO_2, JsonElement> entry2 : map.entrySet()) {
            rqO_2 rqO_22 = entry2.getKey();
            try {
                rkw_3<?> rkw_32 = rWB.id_class(rqO_22, rpY_2.id_private(entry2.getValue(), "top element"));
                hashMap.computeIfAbsent(rkw_32.id_catch(), rkj_32 -> ImmutableMap.builder()).put((Object)rqO_22, rkw_32);
            }
            catch (JsonParseException | IllegalArgumentException throwable) {
                id_break.error("Parsing error loading recipe {}", (Object)rqO_22, (Object)throwable);
            }
        }
        this.id_byte = (Map)hashMap.entrySet().stream().collect(ImmutableMap.toImmutableMap(Map.Entry::getKey, entry -> ((ImmutableMap.Builder)entry.getValue()).build()));
        id_break.info("Loaded {} recipes", (Object)hashMap.size());
    }

    public <C extends rXu_1, T extends rkw_3<C>> Optional<T> id_class(rkj_3<T> rkj_32, C c, rYB rYB2) {
        return this.id_break(rkj_32).values().stream().flatMap(rkw_32 -> rqR_2.id_class(rkj_32.id_class(rkw_32, rYB2, c))).findFirst();
    }

    public Optional<? extends rkw_3<?>> id_class(rqO_2 rqO_22) {
        return this.id_byte.values().stream().map(map -> (rkw_3)map.get(rqO_22)).filter(Objects::nonNull).findFirst();
    }

    public <C extends rXu_1, T extends rkw_3<C>> List<T> id_class(rkj_3<T> rkj_32) {
        return this.id_break(rkj_32).values().stream().map(rkw_32 -> rkw_32).collect(Collectors.toList());
    }

    public void id_class(Iterable<rkw_3<?>> iterable) {
        this.id_protected = false;
        HashMap hashMap = Maps.newHashMap();
        iterable.forEach(rkw_32 -> {
            Map map2 = hashMap.computeIfAbsent(rkw_32.id_catch(), rkj_32 -> Maps.newHashMap());
            rkw_3 rkw_33 = map2.put(rkw_32.id_case(), rkw_32);
            if (rkw_33 != null) {
                throw new IllegalStateException("Duplicate recipe ignored with ID " + rkw_32.id_case());
            }
        });
        this.id_byte = ImmutableMap.copyOf((Map)hashMap);
    }

    public static rkw_3<?> id_class(rqO_2 rqO_22, JsonObject jsonObject) {
        String string = rpY_2.id_case(jsonObject, "type");
        return rVL.M.id_break(new rqO_2(string)).orElseThrow(() -> new JsonSyntaxException("Invalid or unsupported recipe type '" + string + "'")).id_break(rqO_22, jsonObject);
    }

    private <C extends rXu_1, T extends rkw_3<C>> Map<rqO_2, rkw_3<C>> id_break(rkj_3<T> rkj_32) {
        return this.id_byte.getOrDefault(rkj_32, Collections.emptyMap());
    }

    public Collection<rkw_3<?>> id_break() {
        return this.id_byte.values().stream().flatMap(map -> map.values().stream()).collect(Collectors.toSet());
    }

    public <C extends rXu_1, T extends rkw_3<C>> List<T> id_break(rkj_3<T> rkj_32, C c, rYB rYB2) {
        return this.id_break(rkj_32).values().stream().flatMap(rkw_32 -> rqR_2.id_class(rkj_32.id_class(rkw_32, rYB2, c))).sorted(Comparator.comparing(rkw_32 -> rkw_32.id_byte().id_finally())).collect(Collectors.toList());
    }
}

