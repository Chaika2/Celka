/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.types.templates.List$ListType
 *  com.mojang.serialization.Dynamic
 */
package celestial;

import celestial.rTC;
import celestial.rfU_2;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.List;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class rIk_1
extends DataFix {
    private static final int[] id_class = new int[]{0, 10, 50, 100, 150};

    public rIk_1(Schema schema, boolean bl) {
        super(schema, bl);
    }

    public static int id_class(int n) {
        return id_class[rfU_2.id_class(n - 1, 0, id_class.length - 1)];
    }

    private static Typed<?> id_class(Typed<?> typed, int n) {
        return typed.update(DSL.remainderFinder(), dynamic2 -> dynamic2.update("VillagerData", dynamic -> dynamic.set("level", dynamic.createInt(n))));
    }

    private static Typed<?> id_break(Typed<?> typed, int n) {
        int n2 = rIk_1.id_class(n);
        return typed.update(DSL.remainderFinder(), dynamic -> dynamic.set("Xp", dynamic.createInt(n2)));
    }

    public TypeRewriteRule makeRule() {
        Type type = this.getInputSchema().getChoiceType(rTC.id_int, "minecraft:villager");
        OpticFinder opticFinder = DSL.namedChoice((String)"minecraft:villager", (Type)type);
        OpticFinder opticFinder2 = type.findField("Offers");
        Type type2 = opticFinder2.type();
        OpticFinder opticFinder3 = type2.findField("Recipes");
        List.ListType listType = (List.ListType)opticFinder3.type();
        OpticFinder opticFinder4 = listType.getElement().finder();
        return this.fixTypeEverywhereTyped("Villager level and xp rebuild", this.getInputSchema().getType(rTC.id_int), typed -> typed.updateTyped(opticFinder, type, typed2 -> {
            Optional optional;
            int n;
            Dynamic dynamic = (Dynamic)typed2.get(DSL.remainderFinder());
            int n2 = dynamic.get("VillagerData").get("level").asInt(0);
            Typed<?> typed3 = typed2;
            if ((n2 == 0 || n2 == 1) && (n2 = rfU_2.id_class((n = typed2.getOptionalTyped(opticFinder2).flatMap(typed -> typed.getOptionalTyped(opticFinder3)).map(typed -> typed.getAllTyped(opticFinder4).size()).orElse(0).intValue()) / 2, 1, 5)) > 1) {
                typed3 = rIk_1.id_class(typed2, n2);
            }
            if (!(optional = dynamic.get("Xp").asNumber().result()).isPresent()) {
                typed3 = rIk_1.id_break(typed3, n2);
            }
            return typed3;
        }));
    }
}

