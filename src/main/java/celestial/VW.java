/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfU_2;
import java.util.Arrays;
import java.util.Comparator;

public final class VW
extends Enum<VW> {
    public static final /* enum */ VW FAST = new VW(0, "options.graphics.fast");
    public static final /* enum */ VW FANCY = new VW(1, "options.graphics.fancy");
    public static final /* enum */ VW FABULOUS = new VW(2, "options.graphics.fabulous");
    private static final VW[] field_238159_d_;
    private final int field_238160_e_;
    private final String field_238161_f_;
    private static final /* synthetic */ VW[] $VALUES;

    public VW id_byte() {
        return VW.id_class(this.id_class() + 1);
    }

    private VW(int n2, String string2) {
        this.field_238160_e_ = n2;
        this.field_238161_f_ = string2;
    }

    static {
        $VALUES = VW.id_protected();
        field_238159_d_ = (VW[])Arrays.stream(VW.values()).sorted(Comparator.comparingInt(VW::id_class)).toArray(VW[]::new);
    }

    public String toString() {
        switch (this) {
            case FAST: {
                return "fast";
            }
            case FANCY: {
                return "fancy";
            }
            case FABULOUS: {
                return "fabulous";
            }
        }
        throw new IllegalArgumentException();
    }

    public static VW[] values() {
        return (VW[])$VALUES.clone();
    }

    public static VW valueOf(String string) {
        return Enum.valueOf(VW.class, string);
    }

    public int id_class() {
        return this.field_238160_e_;
    }

    public static VW id_class(int n) {
        return field_238159_d_[rfU_2.id_break(n, field_238159_d_.length)];
    }

    public String id_break() {
        return this.field_238161_f_;
    }

    private static /* synthetic */ VW[] id_protected() {
        return new VW[]{FAST, FANCY, FABULOUS};
    }
}

