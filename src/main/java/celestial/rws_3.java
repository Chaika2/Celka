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
import celestial.rtK_2;
import celestial.rti_3;
import celestial.rwW_2;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;

public class rws_3
extends rwW_2 {
    public rws_3(Schema schema, boolean bl) {
        super(schema, bl, "BlockEntityJukeboxFix", rTC.id_extends, "minecraft:jukebox");
    }

    @Override
    protected Typed<?> id_class(Typed<?> typed) {
        Type type = this.getInputSchema().getChoiceType(rTC.id_extends, "minecraft:jukebox");
        Type type2 = type.findFieldType("RecordItem");
        OpticFinder opticFinder = DSL.fieldFinder((String)"RecordItem", (Type)type2);
        Dynamic dynamic = (Dynamic)typed.get(DSL.remainderFinder());
        int n = dynamic.get("Record").asInt(0);
        if (n > 0) {
            dynamic.remove("Record");
            String string = rti_3.id_class(rtK_2.id_class(n), 0);
            if (string != null) {
                Dynamic dynamic2 = dynamic.emptyMap();
                dynamic2 = dynamic2.set("id", dynamic2.createString(string));
                dynamic2 = dynamic2.set("Count", dynamic2.createByte((byte)1));
                return typed.set(opticFinder, (Typed)((Pair)type2.readTyped(dynamic2).result().orElseThrow(() -> new IllegalStateException("Could not create record item stack."))).getFirst()).set(DSL.remainderFinder(), (Object)dynamic);
            }
        }
        return typed;
    }
}

