/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 */
package celestial;

import celestial.rTC;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Map;
import java.util.Optional;

public class rwS_2
extends DataFix {
    private static final Map<String, String> id_class = ImmutableMap.builder().put((Object)"down", (Object)"down_south").put((Object)"up", (Object)"up_north").put((Object)"north", (Object)"north_up").put((Object)"south", (Object)"south_up").put((Object)"west", (Object)"west_up").put((Object)"east", (Object)"east_up").build();

    public rwS_2(Schema schema, boolean bl) {
        super(schema, bl);
    }

    private static Dynamic<?> id_class(Dynamic<?> dynamic2) {
        Optional optional = dynamic2.get("Name").asString().result();
        return optional.equals(Optional.of("minecraft:jigsaw")) ? dynamic2.update("Properties", dynamic -> {
            String string = dynamic.get("facing").asString("north");
            return dynamic.remove("facing").set("orientation", dynamic.createString(id_class.getOrDefault(string, string)));
        }) : dynamic2;
    }

    protected TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("jigsaw_rotation_fix", this.getInputSchema().getType(rTC.id_volatile), typed -> typed.update(DSL.remainderFinder(), rwS_2::id_class));
    }
}

