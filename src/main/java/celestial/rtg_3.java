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

import celestial.rTA;
import celestial.rTC;
import celestial.rwW_2;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class rtg_3
extends rwW_2 {
    public rtg_3(Schema schema, boolean bl) {
        super(schema, bl, "EntityHorseSaddleFix", rTC.id_int, "EntityHorse");
    }

    @Override
    protected Typed<?> id_class(Typed<?> typed) {
        OpticFinder opticFinder = DSL.fieldFinder((String)"id", (Type)DSL.named((String)rTC.id_continue.typeName(), rTA.id_class()));
        Type type = this.getInputSchema().getTypeRaw(rTC.id_native);
        OpticFinder opticFinder2 = DSL.fieldFinder((String)"SaddleItem", (Type)type);
        Optional optional = typed.getOptionalTyped(opticFinder2);
        Dynamic dynamic = (Dynamic)typed.get(DSL.remainderFinder());
        if (!optional.isPresent() && dynamic.get("Saddle").asBoolean(false)) {
            Typed typed2 = (Typed)type.pointTyped(typed.getOps()).orElseThrow(IllegalStateException::new);
            typed2 = typed2.set(opticFinder, (Object)Pair.of((Object)rTC.id_continue.typeName(), (Object)"minecraft:saddle"));
            Dynamic dynamic2 = dynamic.emptyMap();
            dynamic2 = dynamic2.set("Count", dynamic2.createByte((byte)1));
            dynamic2 = dynamic2.set("Damage", dynamic2.createShort((short)0));
            typed2 = typed2.set(DSL.remainderFinder(), (Object)dynamic2);
            dynamic.remove("Saddle");
            return typed.set(opticFinder2, typed2).set(DSL.remainderFinder(), (Object)dynamic);
        }
        return typed;
    }
}

