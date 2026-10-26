/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonElement
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.DA;
import celestial.DG;
import celestial.DJ;
import celestial.DK;
import celestial.DT;
import celestial.Dg_1;
import celestial.Dn_1;
import celestial.Dt_1;
import celestial.rVL;
import celestial.rdb_3;
import celestial.rqO_2;
import celestial.xd_3;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Dx_1
implements DT {
    private static final Logger id_break = LogManager.getLogger();
    private static final Gson id_byte = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
    private final DA id_protected;

    public Dx_1(DA dA) {
        this.id_protected = dA;
    }

    private <T> void id_class(Dn_1 dn_1, Path path, Map<T, ? extends Supplier<JsonElement>> map, BiFunction<Path, T, Path> biFunction) {
        map.forEach((object, supplier) -> {
            Path path2 = (Path)biFunction.apply(path, object);
            try {
                DT.id_class(id_byte, dn_1, (JsonElement)supplier.get(), path2);
            }
            catch (Exception exception) {
                id_break.error("Couldn't save {}", (Object)path2, (Object)exception);
            }
        });
    }

    private static Path id_class(Path path, xd_3 xd_32) {
        rqO_2 rqO_22 = rVL.id_strictfp.id_break(xd_32);
        return path.resolve("assets/" + rqO_22.id_byte() + "/blockstates/" + rqO_22.id_break() + ".json");
    }

    private static Path id_class(Path path, rqO_2 rqO_22) {
        return path.resolve("assets/" + rqO_22.id_byte() + "/models/" + rqO_22.id_break() + ".json");
    }

    @Override
    public String id_class() {
        return "Block State Definitions";
    }

    @Override
    public void id_class(Dn_1 dn_1) {
        Path path = this.id_protected.id_break();
        HashMap hashMap = Maps.newHashMap();
        Consumer<Dt_1> consumer = dt_1 -> {
            xd_3 xd_32 = dt_1.id_class();
            Dt_1 dt_12 = hashMap.put(xd_32, dt_1);
            if (dt_12 != null) {
                throw new IllegalStateException("Duplicate blockstate definition for " + xd_32);
            }
        };
        HashMap hashMap2 = Maps.newHashMap();
        HashSet hashSet = Sets.newHashSet();
        BiConsumer<rqO_2, Supplier<JsonElement>> biConsumer = (rqO_22, supplier) -> {
            Supplier supplier2 = hashMap2.put(rqO_22, supplier);
            if (supplier2 != null) {
                throw new IllegalStateException("Duplicate model definition for " + rqO_22);
            }
        };
        Consumer<rdb_3> consumer2 = hashSet::add;
        new DG(consumer, biConsumer, consumer2).id_class();
        new Dg_1(biConsumer).id_class();
        List list = rVL.id_strictfp.id_case().filter(xd_32 -> !hashMap.containsKey(xd_32)).collect(Collectors.toList());
        if (!list.isEmpty()) {
            throw new IllegalStateException("Missing blockstate definitions for: " + list);
        }
        rVL.id_strictfp.forEach(xd_32 -> {
            rdb_3 rdb_32 = rdb_3.id_throws.get(xd_32);
            if (rdb_32 != null) {
                if (hashSet.contains(rdb_32)) {
                    return;
                }
                rqO_2 rqO_22 = DK.id_class(rdb_32);
                if (!hashMap2.containsKey(rqO_22)) {
                    hashMap2.put(rqO_22, new DJ(DK.id_class(xd_32)));
                }
            }
        });
        this.id_class(dn_1, path, hashMap, Dx_1::id_class);
        this.id_class(dn_1, path, hashMap2, Dx_1::id_class);
    }
}

