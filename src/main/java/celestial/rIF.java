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

public class rIF
extends rIx_1 {
    public static final Map<String, String> id_class = ImmutableMap.builder().put((Object)"minecraft:zombie_pigman_spawn_egg", (Object)"minecraft:zombified_piglin_spawn_egg").build();

    public rIF(Schema schema) {
        super("EntityZombifiedPiglinRenameFix", schema, true);
    }

    @Override
    protected String id_class(String string) {
        return Objects.equals("minecraft:zombie_pigman", string) ? "minecraft:zombified_piglin" : string;
    }
}

