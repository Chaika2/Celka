/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 */
package celestial;

import celestial.rTC;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class rwI_2
extends DataFix {
    public rwI_2(Schema schema) {
        super(schema, false);
    }

    private <T> Dynamic<T> id_class(Dynamic<T> dynamic) {
        boolean bl = dynamic.get("Name").asString().result().filter("minecraft:redstone_wire"::equals).isPresent();
        return !bl ? dynamic : dynamic.update("Properties", dynamic2 -> {
            String string = dynamic2.get("east").asString("none");
            String string2 = dynamic2.get("west").asString("none");
            String string3 = dynamic2.get("north").asString("none");
            String string4 = dynamic2.get("south").asString("none");
            boolean bl = rwI_2.id_class(string) || rwI_2.id_class(string2);
            boolean bl2 = rwI_2.id_class(string3) || rwI_2.id_class(string4);
            String string5 = !rwI_2.id_class(string) && !bl2 ? "side" : string;
            String string6 = !rwI_2.id_class(string2) && !bl2 ? "side" : string2;
            String string7 = !rwI_2.id_class(string3) && !bl ? "side" : string3;
            String string8 = !rwI_2.id_class(string4) && !bl ? "side" : string4;
            return dynamic2.update("east", dynamic -> dynamic.createString(string5)).update("west", dynamic -> dynamic.createString(string6)).update("north", dynamic -> dynamic.createString(string7)).update("south", dynamic -> dynamic.createString(string8));
        });
    }

    private static boolean id_class(String string) {
        return !"none".equals(string);
    }

    protected TypeRewriteRule makeRule() {
        Schema schema = this.getInputSchema();
        return this.fixTypeEverywhereTyped("RedstoneConnectionsFix", schema.getType(rTC.id_volatile), typed -> typed.update(DSL.remainderFinder(), this::id_class));
    }
}

