/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Multimap
 *  com.google.common.collect.Sets
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.mojang.datafixers.util.Pair
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.DA;
import celestial.DT;
import celestial.Dn_1;
import celestial.UA;
import celestial.UF;
import celestial.UL;
import celestial.Un_1;
import celestial.Uv_1;
import celestial.rQs_1;
import celestial.rqO_2;
import celestial.rzA_2;
import celestial.rzC_2;
import celestial.rzf_3;
import celestial.rzk_3;
import celestial.rzl_3;
import celestial.rzz_3;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mojang.datafixers.util.Pair;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DY
implements DT {
    private static final Logger id_break = LogManager.getLogger();
    private static final Gson id_byte = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
    private final DA id_protected;
    private final List<Pair<Supplier<Consumer<BiConsumer<rqO_2, rzA_2>>>, rzk_3>> id_throws = ImmutableList.of((Object)Pair.of(UA::new, (Object)rzz_3.id_throws), (Object)Pair.of(UF::new, (Object)rzz_3.id_break), (Object)Pair.of(UL::new, (Object)rzz_3.id_case), (Object)Pair.of(Uv_1::new, (Object)rzz_3.id_native), (Object)Pair.of(rzf_3::new, (Object)rzz_3.id_private), (Object)Pair.of(Un_1::new, (Object)rzz_3.id_catch));

    public DY(DA dA) {
        this.id_protected = dA;
    }

    private static Path id_class(Path path, rqO_2 rqO_22) {
        return path.resolve("data/" + rqO_22.id_byte() + "/loot_tables/" + rqO_22.id_break() + ".json");
    }

    @Override
    public String id_class() {
        return "LootTables";
    }

    @Override
    public void id_class(Dn_1 dn_1) {
        Path path = this.id_protected.id_break();
        HashMap hashMap = Maps.newHashMap();
        this.id_throws.forEach(pair -> ((Consumer)((Supplier)pair.getFirst()).get()).accept((rqO_22, rzA_22) -> {
            if (hashMap.put(rqO_22, rzA_22.id_class((rzk_3)pair.getSecond()).id_break()) != null) {
                throw new IllegalStateException("Duplicate loot table " + rqO_22);
            }
        }));
        rQs_1 rQs_12 = new rQs_1(rzz_3.id_extends, rqO_22 -> null, hashMap::get);
        for (rqO_2 rqO_23 : Sets.difference(rzl_3.id_class(), hashMap.keySet())) {
            rQs_12.id_class("Missing built-in table: " + rqO_23);
        }
        hashMap.forEach((rqO_22, rzL_22) -> rzC_2.id_class(rQs_12, rqO_22, rzL_22));
        Multimap<String, String> multimap = rQs_12.id_class();
        if (!multimap.isEmpty()) {
            multimap.forEach((string, string2) -> id_break.warn("Found validation problem in " + string + ": " + string2));
            throw new IllegalStateException("Failed to validate loot tables, see logs");
        }
        hashMap.forEach((rqO_22, rzL_22) -> {
            Path path2 = DY.id_class(path, rqO_22);
            try {
                DT.id_class(id_byte, dn_1, rzC_2.id_class(rzL_22), path2);
            }
            catch (IOException iOException) {
                id_break.error("Couldn't save loot table {}", (Object)path2, (Object)iOException);
            }
        });
    }
}

