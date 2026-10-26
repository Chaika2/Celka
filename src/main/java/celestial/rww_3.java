/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.datafixers.schemas.Schema
 */
package celestial;

import celestial.rwT_2;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.schemas.Schema;
import java.util.Map;

public class rww_3
extends rwT_2 {
    private static final Map<String, String> id_class = ImmutableMap.builder().put((Object)"minecraft:acacia_bark", (Object)"minecraft:acacia_wood").put((Object)"minecraft:birch_bark", (Object)"minecraft:birch_wood").put((Object)"minecraft:dark_oak_bark", (Object)"minecraft:dark_oak_wood").put((Object)"minecraft:jungle_bark", (Object)"minecraft:jungle_wood").put((Object)"minecraft:oak_bark", (Object)"minecraft:oak_wood").put((Object)"minecraft:spruce_bark", (Object)"minecraft:spruce_wood").build();

    public rww_3(Schema schema, boolean bl) {
        super(schema, bl, "Recipes renamening fix", string -> id_class.getOrDefault(string, (String)string));
    }
}

