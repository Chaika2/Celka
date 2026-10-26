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
import java.util.Objects;

public class rwq_3
extends rIx_1 {
    public static final Map<String, String> id_class = ImmutableMap.builder().put((Object)"minecraft:puffer_fish_spawn_egg", (Object)"minecraft:pufferfish_spawn_egg").build();

    public rwq_3(Schema schema, boolean bl) {
        super("EntityPufferfishRenameFix", schema, bl);
    }

    @Override
    protected String id_class(String string) {
        return Objects.equals("minecraft:puffer_fish", string) ? "minecraft:pufferfish" : string;
    }
}

