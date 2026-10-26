/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.types.templates.List$ListType
 *  com.mojang.datafixers.util.Pair
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
import com.mojang.datafixers.types.templates.List;
import com.mojang.datafixers.util.Pair;
import java.util.Objects;
import java.util.function.Function;

public class rIz_1
extends rwW_2 {
    public rIz_1(Schema schema, boolean bl) {
        super(schema, bl, "Villager trade fix", rTC.id_int, "minecraft:villager");
    }

    @Override
    protected Typed<?> id_class(Typed<?> typed2) {
        OpticFinder opticFinder = typed2.getType().findField("Offers");
        OpticFinder opticFinder2 = opticFinder.type().findField("Recipes");
        Type type = opticFinder2.type();
        if (!(type instanceof List.ListType)) {
            throw new IllegalStateException("Recipes are expected to be a list.");
        }
        List.ListType listType = (List.ListType)type;
        Type type2 = listType.getElement();
        OpticFinder opticFinder3 = DSL.typeFinder((Type)type2);
        OpticFinder opticFinder4 = type2.findField("buy");
        OpticFinder opticFinder5 = type2.findField("buyB");
        OpticFinder opticFinder6 = type2.findField("sell");
        OpticFinder opticFinder7 = DSL.fieldFinder((String)"id", (Type)DSL.named((String)rTC.id_continue.typeName(), rTA.id_class()));
        Function<Typed, Typed> function = typed -> this.id_class((OpticFinder<Pair<String, String>>)opticFinder7, (Typed<?>)typed);
        return typed2.updateTyped(opticFinder, typed -> typed.updateTyped(opticFinder2, typed2 -> typed2.updateTyped(opticFinder3, typed -> typed.updateTyped(opticFinder4, function).updateTyped(opticFinder5, function).updateTyped(opticFinder6, function))));
    }

    private Typed<?> id_class(OpticFinder<Pair<String, String>> opticFinder, Typed<?> typed) {
        return typed.update(opticFinder, pair -> pair.mapSecond(string -> Objects.equals(string, "minecraft:carved_pumpkin") ? "minecraft:pumpkin" : string));
    }
}

