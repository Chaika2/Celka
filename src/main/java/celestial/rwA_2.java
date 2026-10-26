/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 */
package celestial;

import celestial.rTC;
import celestial.rTp_1;
import celestial.rtw_3;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;

public class rwA_2
extends rTp_1 {
    public rwA_2(Schema schema) {
        super(schema, rTC.id_break);
    }

    protected TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("PlayerUUIDFix", this.getInputSchema().getType(this.id_break), typed2 -> {
            OpticFinder opticFinder = typed2.getType().findField("RootVehicle");
            return typed2.updateTyped(opticFinder, opticFinder.type(), typed -> typed.update(DSL.remainderFinder(), dynamic -> rwA_2.id_byte(dynamic, "Attach", "Attach").orElse((Dynamic<?>)dynamic))).update(DSL.remainderFinder(), dynamic -> rtw_3.id_byte(rtw_3.id_break(dynamic)));
        });
    }
}

