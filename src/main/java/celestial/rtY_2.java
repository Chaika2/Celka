/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 */
package celestial;

import celestial.rTC;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;

public class rtY_2
extends DataFix {
    private static boolean id_byte(Dynamic<?> dynamic) {
        return dynamic.get("id").asString("").equals("Iglu");
    }

    public rtY_2(Schema schema, boolean bl) {
        super(schema, bl);
    }

    private static <T> Dynamic<T> id_class(Dynamic<T> dynamic) {
        boolean bl = dynamic.get("Children").asStreamOpt().map(stream -> stream.allMatch(rtY_2::id_byte)).result().orElse(false);
        return bl ? dynamic.set("id", dynamic.createString("Igloo")).remove("Children") : dynamic.update("Children", rtY_2::id_break);
    }

    private static <T> Dynamic<T> id_break(Dynamic<T> dynamic) {
        return dynamic.asStreamOpt().map(stream -> stream.filter(dynamic -> !rtY_2.id_byte(dynamic))).map(arg_0 -> dynamic.createList(arg_0)).result().orElse(dynamic);
    }

    protected TypeRewriteRule makeRule() {
        Type type = this.getInputSchema().getType(rTC.id_this);
        Type type2 = this.getOutputSchema().getType(rTC.id_this);
        return this.writeFixAndRead("IglooMetadataRemovalFix", type, type2, rtY_2::id_class);
    }
}

