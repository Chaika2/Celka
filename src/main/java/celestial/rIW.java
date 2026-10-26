/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 */
package celestial;

import celestial.rTC;
import celestial.rwW_2;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Map;
import java.util.Optional;

public class rIW
extends rwW_2 {
    public rIW(Schema schema, String string) {
        super(schema, false, "Villager profession data fix (" + string + ")", rTC.id_int, string);
    }

    @Override
    protected Typed<?> id_class(Typed<?> typed) {
        Dynamic dynamic = (Dynamic)typed.get(DSL.remainderFinder());
        return typed.set(DSL.remainderFinder(), (Object)dynamic.remove("Profession").remove("Career").remove("CareerLevel").set("VillagerData", dynamic.createMap((Map)ImmutableMap.of((Object)dynamic.createString("type"), (Object)dynamic.createString("minecraft:plains"), (Object)dynamic.createString("profession"), (Object)dynamic.createString(rIW.id_class(dynamic.get("Profession").asInt(0), dynamic.get("Career").asInt(0))), (Object)dynamic.createString("level"), (Object)((Dynamic)DataFixUtils.orElse((Optional)dynamic.get("CareerLevel").result(), (Object)dynamic.createInt(1)))))));
    }

    private static String id_class(int n, int n2) {
        if (n == 0) {
            if (n2 == 2) {
                return "minecraft:fisherman";
            }
            if (n2 == 3) {
                return "minecraft:shepherd";
            }
            return n2 == 4 ? "minecraft:fletcher" : "minecraft:farmer";
        }
        if (n == 1) {
            return n2 == 2 ? "minecraft:cartographer" : "minecraft:librarian";
        }
        if (n == 2) {
            return "minecraft:cleric";
        }
        if (n == 3) {
            if (n2 == 2) {
                return "minecraft:weaponsmith";
            }
            return n2 == 3 ? "minecraft:toolsmith" : "minecraft:armorer";
        }
        if (n == 4) {
            return n2 == 2 ? "minecraft:leatherworker" : "minecraft:butcher";
        }
        return n == 5 ? "minecraft:nitwit" : "minecraft:none";
    }
}

