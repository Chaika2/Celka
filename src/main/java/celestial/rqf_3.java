/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rjj_3;
import celestial.rqR_2;
import java.util.Arrays;

public final class rqf_3
extends Enum<rqf_3> {
    public static final /* enum */ rqf_3 P123 = new rqf_3(0, 1, 2);
    public static final /* enum */ rqf_3 P213 = new rqf_3(1, 0, 2);
    public static final /* enum */ rqf_3 P132 = new rqf_3(0, 2, 1);
    public static final /* enum */ rqf_3 P231 = new rqf_3(1, 2, 0);
    public static final /* enum */ rqf_3 P312 = new rqf_3(2, 0, 1);
    public static final /* enum */ rqf_3 P321 = new rqf_3(2, 1, 0);
    private final int[] field_239183_g_;
    private final rjj_3 field_239184_h_;
    private static final rqf_3[][] field_239185_i_;
    private static final /* synthetic */ rqf_3[] $VALUES;

    private rqf_3(int n2, int n3, int n4) {
        this.field_239183_g_ = new int[]{n2, n3, n4};
        this.field_239184_h_ = new rjj_3();
        this.field_239184_h_.id_class(0, this.id_class(0), 1.0f);
        this.field_239184_h_.id_class(1, this.id_class(1), 1.0f);
        this.field_239184_h_.id_class(2, this.id_class(2), 1.0f);
    }

    static {
        $VALUES = rqf_3.id_break();
        field_239185_i_ = rqR_2.id_class(new rqf_3[rqf_3.values().length][rqf_3.values().length], (T rqf_3Array) -> {
            for (rqf_3 rqf_33 : rqf_3.values()) {
                for (rqf_3 rqf_34 : rqf_3.values()) {
                    rqf_3 rqf_35;
                    int[] nArray = new int[3];
                    for (int i = 0; i < 3; ++i) {
                        nArray[i] = rqf_33.field_239183_g_[rqf_34.field_239183_g_[i]];
                    }
                    rqf_3Array[rqf_33.ordinal()][rqf_34.ordinal()] = rqf_35 = Arrays.stream(rqf_3.values()).filter(rqf_32 -> Arrays.equals(rqf_32.field_239183_g_, nArray)).findFirst().get();
                }
            }
        });
    }

    public static rqf_3[] values() {
        return (rqf_3[])$VALUES.clone();
    }

    public static rqf_3 valueOf(String string) {
        return Enum.valueOf(rqf_3.class, string);
    }

    public rjj_3 id_class() {
        return this.field_239184_h_;
    }

    public int id_class(int n) {
        return this.field_239183_g_[n];
    }

    public rqf_3 id_class(rqf_3 rqf_32) {
        return field_239185_i_[this.ordinal()][rqf_32.ordinal()];
    }

    private static /* synthetic */ rqf_3[] id_break() {
        return new rqf_3[]{P123, P213, P132, P231, P312, P321};
    }
}

