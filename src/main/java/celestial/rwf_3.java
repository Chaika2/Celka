/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.OptionalDynamic
 */
package celestial;

import celestial.rTC;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Codec;
import com.mojang.serialization.OptionalDynamic;
import java.util.List;

public class rwf_3
extends DataFix {
    private static final Codec<List<Float>> id_class = Codec.FLOAT.listOf();

    public rwf_3(Schema schema, boolean bl) {
        super(schema, bl);
    }

    private static boolean id_class(OptionalDynamic<?> optionalDynamic, int n) {
        return optionalDynamic.flatMap(arg_0 -> id_class.parse(arg_0)).map(list -> list.size() == n && list.stream().allMatch(f -> f.floatValue() == 0.0f)).result().orElse(false);
    }

    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("EntityRedundantChanceTagsFix", this.getInputSchema().getType(rTC.id_int), typed -> typed.update(DSL.remainderFinder(), dynamic -> {
            if (rwf_3.id_class(dynamic.get("HandDropChances"), 2)) {
                dynamic = dynamic.remove("HandDropChances");
            }
            if (rwf_3.id_class(dynamic.get("ArmorDropChances"), 4)) {
                dynamic = dynamic.remove("ArmorDropChances");
            }
            return dynamic;
        }));
    }
}

