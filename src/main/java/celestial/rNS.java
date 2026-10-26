/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rzQ_2;
import celestial.rzd_3;

public final class rNS
extends Enum<rNS> {
    public static final /* enum */ rNS THIS = new rNS("this", rzQ_2.id_class);
    public static final /* enum */ rNS KILLER = new rNS("killer", rzQ_2.id_protected);
    public static final /* enum */ rNS KILLER_PLAYER = new rNS("killer_player", rzQ_2.id_break);
    public static final /* enum */ rNS BLOCK_ENTITY = new rNS("block_entity", rzQ_2.id_private);
    public final String name;
    public final rzd_3<?> parameter;
    private static final /* synthetic */ rNS[] $VALUES;

    private rNS(String string2, rzd_3<?> rzd_32) {
        this.name = string2;
        this.parameter = rzd_32;
    }

    static {
        $VALUES = rNS.id_class();
    }

    public static rNS[] values() {
        return (rNS[])$VALUES.clone();
    }

    public static rNS valueOf(String string) {
        return Enum.valueOf(rNS.class, string);
    }

    private static /* synthetic */ rNS[] id_class() {
        return new rNS[]{THIS, KILLER, KILLER_PLAYER, BLOCK_ENTITY};
    }

    public static rNS id_class(String string) {
        for (rNS rNS2 : rNS.values()) {
            if (!rNS2.name.equals(string)) continue;
            return rNS2;
        }
        throw new IllegalArgumentException("Invalid name source " + string);
    }
}

