/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.datafixers.schemas.Schema
 */
package celestial;

import celestial.rIx_1;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.schemas.Schema;
import java.util.Map;

public class rtC_2
extends rIx_1 {
    public static final Map<String, String> id_class = ImmutableMap.builder().put((Object)"minecraft:salmon_mob", (Object)"minecraft:salmon").put((Object)"minecraft:cod_mob", (Object)"minecraft:cod").build();
    public static final Map<String, String> id_break = ImmutableMap.builder().put((Object)"minecraft:salmon_mob_spawn_egg", (Object)"minecraft:salmon_spawn_egg").put((Object)"minecraft:cod_mob_spawn_egg", (Object)"minecraft:cod_spawn_egg").build();

    public rtC_2(Schema schema, boolean bl) {
        super("EntityCodSalmonFix", schema, bl);
    }

    @Override
    protected String id_class(String string) {
        return id_class.getOrDefault(string, string);
    }
}

