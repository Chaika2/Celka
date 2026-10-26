/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.util.Pair
 */
package celestial;

import celestial.rcd_3;
import celestial.rke_3;
import celestial.rki_3;
import celestial.rqR_2;
import celestial.ruu_3;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import java.util.EnumMap;
import java.util.Map;

public final class rka_3 {
    private static final Map<rke_3, Pair<String, String>> id_class = ImmutableMap.of((Object)((Object)rke_3.CRAFTING), (Object)Pair.of((Object)"isGuiOpen", (Object)"isFilteringCraftable"), (Object)((Object)rke_3.FURNACE), (Object)Pair.of((Object)"isFurnaceGuiOpen", (Object)"isFurnaceFilteringCraftable"), (Object)((Object)rke_3.BLAST_FURNACE), (Object)Pair.of((Object)"isBlastingFurnaceGuiOpen", (Object)"isBlastingFurnaceFilteringCraftable"), (Object)((Object)rke_3.SMOKER), (Object)Pair.of((Object)"isSmokerGuiOpen", (Object)"isSmokerFilteringCraftable"));
    private final Map<rke_3, rki_3> id_break;

    private rka_3(Map<rke_3, rki_3> map) {
        this.id_break = map;
    }

    public rka_3() {
        this(rqR_2.id_class(Maps.newEnumMap(rke_3.class), enumMap -> {
            for (rke_3 rke_32 : rke_3.values()) {
                enumMap.put(rke_32, new rki_3(false, false));
            }
        }));
    }

    public boolean equals(Object object) {
        return this == object || object instanceof rka_3 && this.id_break.equals(((rka_3)object).id_break);
    }

    public int hashCode() {
        return this.id_break.hashCode();
    }

    public rka_3 id_class() {
        EnumMap enumMap = Maps.newEnumMap(rke_3.class);
        for (rke_3 rke_32 : rke_3.values()) {
            rki_3 rki_32 = this.id_break.get((Object)rke_32);
            enumMap.put(rke_32, rki_32.id_class());
        }
        return new rka_3(enumMap);
    }

    public void id_class(rka_3 rka_32) {
        this.id_break.clear();
        for (rke_3 rke_32 : rke_3.values()) {
            rki_3 rki_32 = rka_32.id_break.get((Object)rke_32);
            this.id_break.put(rke_32, rki_32.id_class());
        }
    }

    public void id_class(rke_3 rke_32, boolean bl) {
        this.id_break.get((Object)((Object)rke_32)).id_class = bl;
    }

    public static rka_3 id_class(ruu_3 ruu_32) {
        EnumMap enumMap = Maps.newEnumMap(rke_3.class);
        for (rke_3 rke_32 : rke_3.values()) {
            boolean bl = ruu_32.readBoolean();
            boolean bl2 = ruu_32.readBoolean();
            enumMap.put(rke_32, new rki_3(bl, bl2));
        }
        return new rka_3(enumMap);
    }

    public boolean id_class(rke_3 rke_32) {
        return this.id_break.get((Object)((Object)rke_32)).id_class;
    }

    public static rka_3 id_class(rcd_3 rcd_32) {
        EnumMap enumMap = Maps.newEnumMap(rke_3.class);
        id_class.forEach((rke_32, pair) -> {
            boolean bl = rcd_32.id_new((String)pair.getFirst());
            boolean bl2 = rcd_32.id_new((String)pair.getSecond());
            enumMap.put(rke_32, new rki_3(bl, bl2));
        });
        return new rka_3(enumMap);
    }

    public boolean id_break(rke_3 rke_32) {
        return this.id_break.get((Object)((Object)rke_32)).id_break;
    }

    public void id_break(rcd_3 rcd_32) {
        id_class.forEach((rke_32, pair) -> {
            rki_3 rki_32 = this.id_break.get(rke_32);
            rcd_32.id_class((String)pair.getFirst(), rki_32.id_class);
            rcd_32.id_class((String)pair.getSecond(), rki_32.id_break);
        });
    }

    public void id_break(rke_3 rke_32, boolean bl) {
        this.id_break.get((Object)((Object)rke_32)).id_break = bl;
    }

    public void id_break(ruu_3 ruu_32) {
        for (rke_3 rke_32 : rke_3.values()) {
            rki_3 rki_32 = this.id_break.get((Object)rke_32);
            if (rki_32 == null) {
                ruu_32.writeBoolean(false);
                ruu_32.writeBoolean(false);
                continue;
            }
            ruu_32.writeBoolean(rki_32.id_class);
            ruu_32.writeBoolean(rki_32.id_break);
        }
    }
}

