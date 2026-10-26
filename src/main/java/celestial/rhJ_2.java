/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfU_2;
import java.util.Arrays;
import java.util.Comparator;

public final class rhJ_2
extends Enum<rhJ_2> {
    public static final /* enum */ rhJ_2 FULL = new rhJ_2(0, "options.chat.visibility.full");
    public static final /* enum */ rhJ_2 SYSTEM = new rhJ_2(1, "options.chat.visibility.system");
    public static final /* enum */ rhJ_2 HIDDEN = new rhJ_2(2, "options.chat.visibility.hidden");
    private static final rhJ_2[] field_221255_d;
    private final int id;
    private final String resourceKey;
    private static final /* synthetic */ rhJ_2[] $VALUES;

    private static /* synthetic */ rhJ_2[] id_byte() {
        return new rhJ_2[]{FULL, SYSTEM, HIDDEN};
    }

    private rhJ_2(int n2, String string2) {
        this.id = n2;
        this.resourceKey = string2;
    }

    static {
        $VALUES = rhJ_2.id_byte();
        field_221255_d = (rhJ_2[])Arrays.stream(rhJ_2.values()).sorted(Comparator.comparingInt(rhJ_2::id_class)).toArray(rhJ_2[]::new);
    }

    public static rhJ_2[] values() {
        return (rhJ_2[])$VALUES.clone();
    }

    public static rhJ_2 valueOf(String string) {
        return Enum.valueOf(rhJ_2.class, string);
    }

    public int id_class() {
        return this.id;
    }

    public static rhJ_2 id_class(int n) {
        return field_221255_d[rfU_2.id_break(n, field_221255_d.length)];
    }

    public String id_break() {
        return this.resourceKey;
    }
}

