/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 */
package celestial;

import celestial.Ax_1;
import celestial.Fu_1;
import celestial.HF;
import celestial.Hd_1;
import celestial.IC;
import celestial.Iq_1;
import celestial.Ml_1;
import celestial.Np_1;
import celestial.QY;
import celestial.cb_3;
import celestial.fD_2;
import celestial.fZ_2;
import celestial.rHE;
import celestial.rHG;
import celestial.rHb_1;
import celestial.rJL;
import celestial.rJY;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfU_2;
import celestial.rgP_2;
import celestial.rhd_3;
import celestial.rhz_3;
import celestial.rqO_2;
import celestial.rqn_3;
import celestial.rxL_2;
import celestial.rxO_2;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class vP_2
extends Fu_1<rJL> {
    private static final rqO_2 id_class = new rqO_2("textures/gui/container/loom.png");
    private static final int id_throws = (rHE.BANNER_PATTERNS_COUNT - rHE.BANNERS_WITH_ITEMS - 1 + 4 - 1) / 4;
    private final Iq_1 id_case;
    private List<Pair<rHE, rxL_2>> id_catch;
    private rdn_3 id_private = rdn_3.id_break;
    private rdn_3 id_implements = rdn_3.id_break;
    private rdn_3 id_finally = rdn_3.id_break;
    private boolean id_boolean;
    private boolean id_transient;
    private boolean id_for;
    private float id_double;
    private boolean id_switch;
    private int r = 1;

    private void id_byte(int n, int n2, int n3) {
        rdn_3 rdn_32 = new rdn_3(rdy_3.di);
        rcd_3 rcd_32 = rdn_32.id_class("BlockEntityTag");
        rcy_3 rcy_32 = new rHG().id_class(rHE.BASE, rxL_2.GRAY).id_class(rHE.values()[n], rxL_2.WHITE).id_class();
        rcd_32.id_class("Patterns", rcy_32);
        Ml_1 ml_1 = new Ml_1();
        ml_1.id_class();
        ml_1.id_class((double)((float)n2 + 0.5f), (double)(n3 + 16), 0.0);
        ml_1.id_class(6.0f, -6.0f, 1.0f);
        ml_1.id_class(0.5, 0.5, 0.0);
        ml_1.id_class(0.5, 0.5, 0.5);
        float f = 0.6666667f;
        ml_1.id_class(0.6666667f, -0.6666667f, -0.6666667f);
        Hd_1 hd_1 = this.id_volatile.id_interface().id_break();
        this.id_case.id_case = 0.0f;
        this.id_case.id_protected = -32.0f;
        List<Pair<rHE, rxL_2>> list = rHb_1.id_class(rxL_2.GRAY, rHb_1.id_class(rdn_32));
        fD_2.id_class(ml_1, hd_1, 0xF000F0, fZ_2.id_class, this.id_case, IC.id_case, true, list);
        ml_1.id_break();
        hd_1.id_break();
    }

    public vP_2(rJL rJL2, rhz_3 rhz_32, rgP_2 rgP_22) {
        super(rJL2, rhz_32, rgP_22);
        this.id_case = fD_2.id_class();
        rJL2.id_class(this::id_finally);
        this.id_goto -= 2;
    }

    @Override
    public boolean id_class(double d, double d2, int n, double d3, double d4) {
        if (this.id_switch && this.id_boolean) {
            int n2 = this.id_abstract + 13;
            int n3 = n2 + 56;
            this.id_double = ((float)d2 - (float)n2 - 7.5f) / ((float)(n3 - n2) - 15.0f);
            this.id_double = rfU_2.id_class(this.id_double, 0.0f, 1.0f);
            int n4 = id_throws - 4;
            int n5 = (int)((double)(this.id_double * (float)n4) + 0.5);
            if (n5 < 0) {
                n5 = 0;
            }
            this.r = 1 + n5 * 4;
            return true;
        }
        return super.id_class(d, d2, n, d3, d4);
    }

    @Override
    protected boolean id_class(double d, double d2, int n, int n2, int n3) {
        return d < (double)n || d2 < (double)n2 || d >= (double)(n + this.id_synchronized) || d2 >= (double)(n2 + this.id_return);
    }

    @Override
    public boolean id_class(double d, double d2, double d3) {
        if (this.id_boolean) {
            int n = id_throws - 4;
            this.id_double = (float)((double)this.id_double - d3 / (double)n);
            this.id_double = rfU_2.id_class(this.id_double, 0.0f, 1.0f);
            this.r = 1 + (int)((double)(this.id_double * (float)n) + 0.5) * 4;
        }
        return true;
    }

    @Override
    protected void id_class(Ml_1 ml_1, float f, int n, int n2) {
        this.id_class(ml_1);
        this.id_volatile.A().id_class(id_class);
        int n3 = this.id_char;
        int n4 = this.id_abstract;
        this.id_break(ml_1, n3, n4, 0, 0, this.id_synchronized, this.id_return);
        rJY rJY2 = ((rJL)this.id_instanceof).id_break();
        rJY rJY3 = ((rJL)this.id_instanceof).id_byte();
        rJY rJY4 = ((rJL)this.id_instanceof).id_protected();
        rJY rJY5 = ((rJL)this.id_instanceof).id_throws();
        if (!rJY2.id_break()) {
            this.id_break(ml_1, n3 + rJY2.id_throws, n4 + rJY2.id_case, this.id_synchronized, 0, 16, 16);
        }
        if (!rJY3.id_break()) {
            this.id_break(ml_1, n3 + rJY3.id_throws, n4 + rJY3.id_case, this.id_synchronized + 16, 0, 16, 16);
        }
        if (!rJY4.id_break()) {
            this.id_break(ml_1, n3 + rJY4.id_throws, n4 + rJY4.id_case, this.id_synchronized + 32, 0, 16, 16);
        }
        int n5 = (int)(41.0f * this.id_double);
        this.id_break(ml_1, n3 + 119, n4 + 13 + n5, 232 + (this.id_boolean ? 0 : 12), 0, 12, 15);
        HF.id_byte();
        if (this.id_catch != null && !this.id_for) {
            Hd_1 hd_1 = this.id_volatile.id_interface().id_break();
            ml_1.id_class();
            ml_1.id_class((double)(n3 + 139), (double)(n4 + 52), 0.0);
            ml_1.id_class(24.0f, -24.0f, 1.0f);
            ml_1.id_class(0.5, 0.5, 0.5);
            float f2 = 0.6666667f;
            ml_1.id_class(0.6666667f, -0.6666667f, -0.6666667f);
            this.id_case.id_case = 0.0f;
            this.id_case.id_protected = -32.0f;
            fD_2.id_class(ml_1, hd_1, 0xF000F0, fZ_2.id_class, this.id_case, IC.id_case, true, this.id_catch);
            ml_1.id_break();
            hd_1.id_break();
        } else if (this.id_for) {
            this.id_break(ml_1, n3 + rJY5.id_throws - 2, n4 + rJY5.id_case - 2, this.id_synchronized, 17, 17, 16);
        }
        if (this.id_boolean) {
            int n6 = n3 + 60;
            int n7 = n4 + 13;
            int n8 = this.r + 16;
            for (int i = this.r; i < n8 && i < rHE.BANNER_PATTERNS_COUNT - rHE.BANNERS_WITH_ITEMS; ++i) {
                int n9 = i - this.r;
                int n10 = n6 + n9 % 4 * 14;
                int n11 = n7 + n9 / 4 * 14;
                this.id_volatile.A().id_class(id_class);
                int n12 = this.id_return;
                if (i == ((rJL)this.id_instanceof).id_class()) {
                    n12 += 14;
                } else if (n >= n10 && n2 >= n11 && n < n10 + 14 && n2 < n11 + 14) {
                    n12 += 28;
                }
                this.id_break(ml_1, n10, n11, 0, n12, 14, 14);
                this.id_byte(i, n10, n11);
            }
        } else if (this.id_transient) {
            int n13 = n3 + 60;
            int n14 = n4 + 13;
            this.id_volatile.A().id_class(id_class);
            this.id_break(ml_1, n13, n14, 0, this.id_return, 14, 14);
            int n15 = ((rJL)this.id_instanceof).id_class();
            this.id_byte(n15, n13, n14);
        }
        HF.id_protected();
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        super.id_class(ml_1, n, n2, f);
        this.id_break(ml_1, n, n2);
    }

    @Override
    public boolean id_break(double d, double d2, int n) {
        this.id_switch = false;
        if (this.id_boolean) {
            int n2 = this.id_char + 60;
            int n3 = this.id_abstract + 13;
            int n4 = this.r + 16;
            for (int i = this.r; i < n4; ++i) {
                int n5 = i - this.r;
                double d3 = d - (double)(n2 + n5 % 4 * 14);
                double d4 = d2 - (double)(n3 + n5 / 4 * 14);
                if (!(d3 >= 0.0) || !(d4 >= 0.0) || !(d3 < 14.0) || !(d4 < 14.0) || !((rJL)this.id_instanceof).id_break((rhd_3)((cb_3)this.id_volatile.id_class[57]), i)) continue;
                QY.id_instanceof().c().id_class(Np_1.id_class(rqn_3.dI, 1.0f));
                ((Ax_1)this.id_volatile.id_class[55]).id_class(((rJL)this.id_instanceof).id_case, i);
                return true;
            }
            n2 = this.id_char + 119;
            n3 = this.id_abstract + 9;
            if (d >= (double)n2 && d < (double)(n2 + 12) && d2 >= (double)n3 && d2 < (double)(n3 + 56)) {
                this.id_switch = true;
            }
        }
        return super.id_break(d, d2, n);
    }

    private void id_finally() {
        rdn_3 rdn_32 = ((rJL)this.id_instanceof).id_throws().id_class();
        this.id_catch = rdn_32.id_class() ? null : rHb_1.id_class(((rxO_2)rdn_32.id_break()).id_byte(), rHb_1.id_class(rdn_32));
        rdn_3 rdn_33 = ((rJL)this.id_instanceof).id_break().id_class();
        rdn_3 rdn_34 = ((rJL)this.id_instanceof).id_byte().id_class();
        rdn_3 rdn_35 = ((rJL)this.id_instanceof).id_protected().id_class();
        rcd_3 rcd_32 = rdn_33.id_class("BlockEntityTag");
        boolean bl = this.id_for = rcd_32.id_byte("Patterns", 9) && !rdn_33.id_class() && rcd_32.id_protected("Patterns", 10).size() >= 6;
        if (this.id_for) {
            this.id_catch = null;
        }
        if (!(rdn_3.id_break(rdn_33, this.id_private) && rdn_3.id_break(rdn_34, this.id_implements) && rdn_3.id_break(rdn_35, this.id_finally))) {
            this.id_boolean = !rdn_33.id_class() && !rdn_34.id_class() && rdn_35.id_class() && !this.id_for;
            this.id_transient = !this.id_for && !rdn_35.id_class() && !rdn_33.id_class() && !rdn_34.id_class();
        }
        this.id_private = rdn_33.id_implements();
        this.id_implements = rdn_34.id_implements();
        this.id_finally = rdn_35.id_implements();
    }
}

