/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 */
package celestial;

import celestial.rTC;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;

public abstract class rwC_2
extends DataFix {
    public rwC_2(Schema schema, boolean bl) {
        super(schema, bl);
    }

    protected abstract String id_class(String var1);

    private <T> Dynamic<T> id_class(Dynamic<T> dynamic2) {
        return dynamic2.update("Sections", dynamic -> dynamic.updateMapValues(pair -> pair.mapSecond(dynamic2 -> dynamic2.update("Records", dynamic -> (Dynamic)DataFixUtils.orElse(this.id_break((Dynamic)dynamic), (Object)dynamic)))));
    }

    private <T> Optional<Dynamic<T>> id_break(Dynamic<T> dynamic) {
        return dynamic.asStreamOpt().map(stream -> dynamic.createList(stream.map(dynamic2 -> dynamic2.update("type", dynamic -> (Dynamic)DataFixUtils.orElse((Optional)dynamic.asString().map(this::id_class).map(arg_0 -> ((Dynamic)dynamic).createString(arg_0)).result(), (Object)dynamic))))).result();
    }

    protected TypeRewriteRule makeRule() {
        Type type = DSL.named((String)rTC.id_finally.typeName(), (Type)DSL.remainderType());
        if (!Objects.equals(type, this.getInputSchema().getType(rTC.id_finally))) {
            throw new IllegalStateException("Poi type is not what was expected.");
        }
        return this.fixTypeEverywhere("POI rename", type, dynamicOps -> pair -> pair.mapSecond(this::id_class));
    }
}

