/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 */
package celestial;

import celestial.rTC;
import celestial.rwW_2;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class rTK
extends rwW_2 {
    public rTK(Schema schema, boolean bl) {
        super(schema, bl, "BlockEntityBannerColorFix", rTC.id_extends, "minecraft:banner");
    }

    public Dynamic<?> id_class(Dynamic<?> dynamic2) {
        dynamic2 = dynamic2.update("Base", dynamic -> dynamic.createInt(15 - dynamic.asInt(0)));
        return dynamic2.update("Patterns", dynamic -> (Dynamic)DataFixUtils.orElse((Optional)dynamic.asStreamOpt().map(stream -> stream.map(dynamic2 -> dynamic2.update("Color", dynamic -> dynamic.createInt(15 - dynamic.asInt(0))))).map(arg_0 -> ((Dynamic)dynamic).createList(arg_0)).result(), (Object)dynamic));
    }

    @Override
    protected Typed<?> id_class(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), this::id_class);
    }
}

