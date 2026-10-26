/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rpH_2;
import java.util.Arrays;
import java.util.Optional;

public final class rHV
extends Enum<rHV>
implements rpH_2 {
    public static final /* enum */ rHV ROLLABLE = new rHV("rollable");
    public static final /* enum */ rHV ALIGNED = new rHV("aligned");
    private final String field_235672_c_;
    private static final /* synthetic */ rHV[] $VALUES;

    private rHV(String string2) {
        this.field_235672_c_ = string2;
    }

    static {
        $VALUES = rHV.id_break();
    }

    public static rHV[] values() {
        return (rHV[])$VALUES.clone();
    }

    public static rHV valueOf(String string) {
        return Enum.valueOf(rHV.class, string);
    }

    public static Optional<rHV> id_class(String string) {
        return Arrays.stream(rHV.values()).filter(rHV2 -> rHV2.id_class().equals(string)).findFirst();
    }

    @Override
    public String id_class() {
        return this.field_235672_c_;
    }

    private static /* synthetic */ rHV[] id_break() {
        return new rHV[]{ROLLABLE, ALIGNED};
    }
}

