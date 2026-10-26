/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package celestial;

import celestial.LD;
import celestial.LF;
import celestial.LR;
import celestial.LU;
import celestial.Lo_1;
import celestial.Ml_1;
import celestial.Qw_1;
import celestial.Vu_1;
import celestial.cC_2;
import celestial.cm_3;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgn_3;
import com.google.common.collect.ImmutableList;
import java.util.List;

public class LK
extends Lo_1 {
    private final Vu_1 id_break;
    private final rgP_2 id_byte;
    private final LF id_protected;
    private final LF id_throws;
    public final /* synthetic */ LR id_class;

    public LK(LR lR, Vu_1 vu_1, rgP_2 rgP_22) {
        this.id_class = lR;
        this.id_break = vu_1;
        this.id_byte = rgP_22;
        this.id_protected = new LD(this, 0, 0, 75, 20, rgP_22, lF -> {
            this.id_class.id_class.id_class = vu_1;
        }, lR, vu_1, rgP_22);
        this.id_throws = new LU(this, 0, 0, 50, 20, new rgn_3("controls.reset"), lF -> {
            ((Qw_1)this.id_class.id_native.id_class[20]).id_class(vu_1, vu_1.id_private(), vu_1.id_finally());
            Vu_1.id_byte();
        }, lR, rgP_22);
    }

    @Override
    public boolean id_class(double d, double d2, int n) {
        return this.id_protected.id_class(d, d2, n) || this.id_throws.id_class(d, d2, n);
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl, float f) {
        boolean bl2 = this.id_class.id_class.id_class == this.id_break;
        ((cm_3)this.id_class.id_native.id_class[15]).id_byte(ml_1, this.id_byte, n3 + 90 - this.id_class.id_throws, n2 + n5 / 2 - 4, 0xFFFFFF);
        this.id_throws.id_volatile = n3 + 190;
        this.id_throws.id_final = n2;
        this.id_throws.id_int = !this.id_break.id_volatile();
        this.id_throws.id_class(ml_1, n6, n7, f);
        this.id_protected.id_volatile = n3 + 105;
        this.id_protected.id_final = n2;
        this.id_protected.id_break(this.id_break.id_native());
        boolean bl3 = false;
        if (!this.id_break.id_extends()) {
            for (Vu_1 vu_1 : ((Qw_1)this.id_class.id_native.id_class[20]).f) {
                if (vu_1 == this.id_break || !this.id_break.id_byte(vu_1)) continue;
                bl3 = true;
                break;
            }
        }
        if (bl2) {
            this.id_protected.id_break(new rgN_2("> ").id_class(this.id_protected.C_().id_case().id_class(rgF_2.YELLOW)).id_break(" <").id_class(rgF_2.YELLOW));
        } else if (bl3) {
            this.id_protected.id_break(this.id_protected.C_().id_case().id_class(rgF_2.RED));
        }
        this.id_protected.id_class(ml_1, n6, n7, f);
    }

    @Override
    public boolean id_break(double d, double d2, int n) {
        if (this.id_protected.id_break(d, d2, n)) {
            return true;
        }
        return this.id_throws.id_break(d, d2, n);
    }

    @Override
    public List<? extends cC_2> x_() {
        return ImmutableList.of((Object)this.id_protected, (Object)this.id_throws);
    }
}

