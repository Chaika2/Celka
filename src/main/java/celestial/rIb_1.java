/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 */
package celestial;

import celestial.rTA;
import celestial.rTC;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;

public class rIb_1
extends DataFix {
    public rIb_1(Schema schema, boolean bl) {
        super(schema, bl);
    }

    protected TypeRewriteRule makeRule() {
        Type type = this.getOutputSchema().getType(rTC.id_catch);
        Type type2 = this.getInputSchema().getType(rTC.id_catch);
        OpticFinder opticFinder = type2.findField("stats");
        OpticFinder opticFinder2 = opticFinder.type().findField("minecraft:custom");
        OpticFinder opticFinder3 = rTA.id_class().finder();
        return this.fixTypeEverywhereTyped("SwimStatsRenameFix", type2, type, typed -> typed.updateTyped(opticFinder, typed2 -> typed2.updateTyped(opticFinder2, typed -> typed.update(opticFinder3, string -> {
            if (string.equals("minecraft:swim_one_cm")) {
                return "minecraft:walk_on_water_one_cm";
            }
            return string.equals("minecraft:dive_one_cm") ? "minecraft:walk_under_water_one_cm" : string;
        }))));
    }
}

