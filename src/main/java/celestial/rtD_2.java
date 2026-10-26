/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 */
package celestial;

import celestial.rTC;
import celestial.rgB_2;
import celestial.rgN_2;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.stream.Stream;

public class rtD_2
extends DataFix {
    public rtD_2(Schema schema, boolean bl) {
        super(schema, bl);
    }

    private static String id_class(String string) {
        return rgB_2.id_class(new rgN_2(string));
    }

    private static <T> Stream<Dynamic<T>> id_class(Stream<Dynamic<T>> stream) {
        return stream.map(dynamic -> (Dynamic)DataFixUtils.orElse((Optional)dynamic.asString().map(rtD_2::id_class).map(arg_0 -> ((Dynamic)dynamic).createString(arg_0)).result(), (Object)dynamic));
    }

    protected TypeRewriteRule makeRule() {
        Type type = this.getInputSchema().getType(rTC.id_native);
        OpticFinder opticFinder = type.findField("tag");
        return this.fixTypeEverywhereTyped("Item Lore componentize", type, typed2 -> typed2.updateTyped(opticFinder, typed -> typed.update(DSL.remainderFinder(), dynamic -> dynamic.update("display", dynamic2 -> dynamic2.update("Lore", dynamic -> (Dynamic)DataFixUtils.orElse((Optional)dynamic.asStreamOpt().map(rtD_2::id_class).map(arg_0 -> ((Dynamic)dynamic).createList(arg_0)).result(), (Object)dynamic))))));
    }
}

