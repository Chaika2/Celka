/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 */
package celestial;

import celestial.rTC;
import celestial.rtS_2;
import celestial.rwW_2;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;

public class rwL_2
extends rwW_2 {
    public rwL_2(Schema schema, boolean bl) {
        super(schema, bl, "BlockEntityBlockStateFix", rTC.id_extends, "minecraft:piston");
    }

    @Override
    protected Typed<?> id_class(Typed<?> typed) {
        Type type = this.getOutputSchema().getChoiceType(rTC.id_extends, "minecraft:piston");
        Type type2 = type.findFieldType("blockState");
        OpticFinder opticFinder = DSL.fieldFinder((String)"blockState", (Type)type2);
        Dynamic dynamic = (Dynamic)typed.get(DSL.remainderFinder());
        int n = dynamic.get("blockId").asInt(0);
        dynamic = dynamic.remove("blockId");
        int n2 = dynamic.get("blockData").asInt(0) & 0xF;
        dynamic = dynamic.remove("blockData");
        Dynamic<?> dynamic2 = rtS_2.id_break(n << 4 | n2);
        Typed typed2 = (Typed)type.pointTyped(typed.getOps()).orElseThrow(() -> new IllegalStateException("Could not create new piston block entity."));
        return typed2.set(DSL.remainderFinder(), (Object)dynamic).set(opticFinder, (Typed)((Pair)type2.readTyped(dynamic2).result().orElseThrow(() -> new IllegalStateException("Could not parse newly created block state tag."))).getFirst());
    }
}

