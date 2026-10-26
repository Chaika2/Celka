/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rpH_2;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public final class aH_2
extends Enum<aH_2>
implements rpH_2 {
    public static final /* enum */ aH_2 MONSTER = new aH_2("monster", 70, false, false, 128);
    public static final /* enum */ aH_2 CREATURE = new aH_2("creature", 10, true, true, 128);
    public static final /* enum */ aH_2 AMBIENT = new aH_2("ambient", 15, true, false, 128);
    public static final /* enum */ aH_2 WATER_CREATURE = new aH_2("water_creature", 5, true, false, 128);
    public static final /* enum */ aH_2 WATER_AMBIENT = new aH_2("water_ambient", 20, true, false, 64);
    public static final /* enum */ aH_2 MISC = new aH_2("misc", -1, true, true, 128);
    public static final Codec<aH_2> CODEC;
    private static final Map<String, aH_2> VALUES_MAP;
    private final int maxNumberOfCreature;
    private final boolean isPeacefulCreature;
    private final boolean isAnimal;
    private final String name;
    private final int randomDespawnDistance;
    private final int instantDespawnDistance;
    private static final /* synthetic */ aH_2[] $VALUES;

    public int id_byte() {
        return this.maxNumberOfCreature;
    }

    private aH_2(String string2, int n2, boolean bl, boolean bl2, int n3) {
        this.randomDespawnDistance = 32;
        this.name = string2;
        this.maxNumberOfCreature = n2;
        this.isPeacefulCreature = bl;
        this.isAnimal = bl2;
        this.instantDespawnDistance = n3;
    }

    static {
        $VALUES = aH_2.id_implements();
        CODEC = rpH_2.id_class(aH_2::values, aH_2::id_class);
        VALUES_MAP = Arrays.stream(aH_2.values()).collect(Collectors.toMap(aH_2::id_break, aH_22 -> aH_22));
    }

    public static aH_2[] values() {
        return (aH_2[])$VALUES.clone();
    }

    public static aH_2 valueOf(String string) {
        return Enum.valueOf(aH_2.class, string);
    }

    @Override
    public String id_class() {
        return this.name;
    }

    public static aH_2 id_class(String string) {
        return VALUES_MAP.get(string);
    }

    public String id_break() {
        return this.name;
    }

    public boolean id_throws() {
        return this.isAnimal;
    }

    public int id_catch() {
        return 32;
    }

    public int id_case() {
        return this.instantDespawnDistance;
    }

    private static /* synthetic */ aH_2[] id_implements() {
        return new aH_2[]{MONSTER, CREATURE, AMBIENT, WATER_CREATURE, WATER_AMBIENT, MISC};
    }

    public boolean id_protected() {
        return this.isPeacefulCreature;
    }

    public boolean id_private() {
        return this == MONSTER;
    }
}

