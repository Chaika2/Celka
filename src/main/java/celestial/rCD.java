/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rpH_2;

public final class rCD
extends Enum<rCD>
implements rpH_2 {
    public static final /* enum */ rCD SAVE = new rCD("save");
    public static final /* enum */ rCD LOAD = new rCD("load");
    public static final /* enum */ rCD CORNER = new rCD("corner");
    public static final /* enum */ rCD DATA = new rCD("data");
    private final String name;
    private final rgP_2 field_242702_f;
    private static final /* synthetic */ rCD[] $VALUES;

    private static /* synthetic */ rCD[] id_byte() {
        return new rCD[]{SAVE, LOAD, CORNER, DATA};
    }

    private rCD(String string2) {
        this.name = string2;
        this.field_242702_f = new rgn_3("structure_block.mode_info." + string2);
    }

    static {
        $VALUES = rCD.id_byte();
    }

    public static rCD[] values() {
        return (rCD[])$VALUES.clone();
    }

    public static rCD valueOf(String string) {
        return Enum.valueOf(rCD.class, string);
    }

    @Override
    public String id_class() {
        return this.name;
    }

    public rgP_2 id_break() {
        return this.field_242702_f;
    }
}

