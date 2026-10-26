/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Lg_1;
import celestial.Ml_1;
import celestial.aI_2;
import celestial.ch_3;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rlB_2;
import celestial.vt_3;

public class vw_3
extends Lg_1<vw_3> {
    private final aI_2<?> id_break;
    private final rgP_2 id_byte;
    private final rgP_2 id_protected;
    private final boolean id_throws;
    private final rgP_2 id_case;
    private final boolean id_catch;
    public final /* synthetic */ vt_3 id_class;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public vw_3(vt_3 vt_32, aI_2 aI_22) {
        this.id_class = vt_32;
        this.id_break = aI_22;
        this.id_byte = aI_22.id_implements();
        int n = vt_32.id_class.id_finally.id_class(rlB_2.id_catch.id_break(aI_22));
        if (n == 0) {
            this.id_protected = new rgn_3("stat_type.minecraft.killed.none", this.id_byte);
            this.id_throws = false;
        } else {
            this.id_protected = new rgn_3("stat_type.minecraft.killed", n, this.id_byte);
            this.id_throws = true;
        }
        int n2 = vt_32.id_class.id_finally.id_class(rlB_2.id_private.id_break(aI_22));
        if (n2 == 0) {
            this.id_case = new rgn_3("stat_type.minecraft.killed_by.none", this.id_byte);
            this.id_catch = false;
        } else {
            this.id_case = new rgn_3("stat_type.minecraft.killed_by", this.id_byte, n2);
            this.id_catch = true;
        }
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl, float f) {
        ch_3.id_break(ml_1, this.id_class.id_class.id_super, this.id_byte, n3 + 2, n2 + 1, 0xFFFFFF);
        ch_3.id_break(ml_1, this.id_class.id_class.id_super, this.id_protected, n3 + 2 + 10, n2 + 1 + 9, this.id_throws ? 0x909090 : 0x606060);
        ch_3.id_break(ml_1, this.id_class.id_class.id_super, this.id_case, n3 + 2 + 10, n2 + 1 + 18, this.id_catch ? 0x909090 : 0x606060);
    }
}

