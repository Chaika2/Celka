/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
package celestial;

import celestial.aI_2;
import celestial.an_3;
import celestial.iB_2;
import celestial.rAB;
import celestial.rAS;
import celestial.rLQ;
import celestial.rLY;
import celestial.rLi_1;
import celestial.rVL;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rhm_3;
import celestial.rmE_2;
import celestial.rut_3;
import celestial.ruw_3;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;

public class rhF_2
extends rhm_3 {
    private static final rut_3<Integer> id_private = rmE_2.id_class(rhF_2.class, ruw_3.id_break);
    private rLi_1 id_implements = rAS.id_class;
    private final Set<rLY> id_finally = Sets.newHashSet();
    private boolean id_extends;

    private void id_byte(int n) {
        this.id_extends = true;
        ((rmE_2)this.id_throws[49]).id_break(id_private, n);
    }

    public static int id_byte(rdn_3 rdn_32) {
        rcd_3 rcd_32 = rdn_32.id_package();
        return rcd_32 != null && rcd_32.id_byte("CustomPotionColor", 99) ? rcd_32.id_private("CustomPotionColor") : -1;
    }

    public rhF_2(aI_2<? extends rhF_2> aI_22, rYB rYB2) {
        super((aI_2<? extends rhm_3>)aI_22, rYB2);
    }

    public rhF_2(rYB rYB2, iB_2 iB_22) {
        super(aI_2.id_byte, iB_22, rYB2);
    }

    public rhF_2(rYB rYB2, double d, double d2, double d3) {
        super(aI_2.id_byte, d, d2, d3, rYB2);
    }

    @Override
    public void id_this() {
        super.id_this();
        if (((rYB)this.id_throws[7]).id_continue) {
            if (this.id_class) {
                if (this.id_break % 5 == 0) {
                    this.id_break(1);
                }
            } else {
                this.id_break(2);
            }
        } else if (this.id_class && this.id_break != 0 && !this.id_finally.isEmpty() && this.id_break >= 600) {
            ((rYB)this.id_throws[7]).id_class((an_3)this, (byte)0);
            this.id_implements = rAS.id_class;
            this.id_finally.clear();
            ((rmE_2)this.id_throws[49]).id_break(id_private, -1);
        }
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        if (this.id_implements != rAS.id_class && this.id_implements != null) {
            rcd_32.id_class("Potion", rVL.id_double.id_break(this.id_implements).toString());
        }
        if (this.id_extends) {
            rcd_32.id_break("Color", this.id_super());
        }
        if (!this.id_finally.isEmpty()) {
            rcy_3 rcy_32 = new rcy_3();
            for (rLY rLY2 : this.id_finally) {
                rcy_32.add(rLY2.id_class(new rcd_3()));
            }
            rcd_32.id_class("CustomPotionEffects", rcy_32);
        }
    }

    @Override
    public void id_class(byte by) {
        if (by == 0) {
            int n = this.id_super();
            if (n != -1) {
                double d = (double)(n >> 16 & 0xFF) / 255.0;
                double d2 = (double)(n >> 8 & 0xFF) / 255.0;
                double d3 = (double)(n >> 0 & 0xFF) / 255.0;
                for (int i = 0; i < 20; ++i) {
                    ((rYB)this.id_throws[7]).id_class(rLQ.id_else, this.id_break(0.5), this.Ph(), this.id_protected(0.5), d, d2, d3);
                }
            }
        } else {
            super.id_class(by);
        }
    }

    @Override
    protected void id_class(iB_2 iB_22) {
        super.id_class(iB_22);
        for (rLY rLY2 : this.id_implements.id_class()) {
            iB_22.id_break(new rLY(rLY2.id_class(), Math.max(rLY2.id_break() / 8, 1), rLY2.id_byte(), rLY2.id_protected(), rLY2.id_throws()));
        }
        if (!this.id_finally.isEmpty()) {
            for (rLY rLY2 : this.id_finally) {
                iB_22.id_break(rLY2);
            }
        }
    }

    public void id_class(rLY rLY2) {
        this.id_finally.add(rLY2);
        this.BQ().id_break(id_private, rAB.id_class(rAB.id_class(this.id_implements, this.id_finally)));
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        if (rcd_32.id_byte("Potion", 8)) {
            this.id_implements = rAB.id_byte(rcd_32);
        }
        for (rLY rLY2 : rAB.id_break(rcd_32)) {
            this.id_class(rLY2);
        }
        if (rcd_32.id_byte("Color", 99)) {
            this.id_byte(rcd_32.id_private("Color"));
        } else {
            this.id_public();
        }
    }

    private void id_break(int n) {
        int n2 = this.id_super();
        if (n2 != -1 && n > 0) {
            double d = (double)(n2 >> 16 & 0xFF) / 255.0;
            double d2 = (double)(n2 >> 8 & 0xFF) / 255.0;
            double d3 = (double)(n2 >> 0 & 0xFF) / 255.0;
            for (int i = 0; i < n; ++i) {
                ((rYB)this.id_throws[7]).id_class(rLQ.id_else, this.id_break(0.5), this.Ph(), this.id_protected(0.5), d, d2, d3);
            }
        }
    }

    public void id_break(rdn_3 rdn_32) {
        if (rdn_32.id_break() == rdy_3.kz) {
            int n;
            this.id_implements = rAB.id_protected(rdn_32);
            List<rLY> list = rAB.id_break(rdn_32);
            if (!list.isEmpty()) {
                for (rLY rLY2 : list) {
                    this.id_finally.add(new rLY(rLY2));
                }
            }
            if ((n = rhF_2.id_byte(rdn_32)) == -1) {
                this.id_public();
            } else {
                this.id_byte(n);
            }
        } else if (rdn_32.id_break() == rdy_3.OO) {
            this.id_implements = rAS.id_class;
            this.id_finally.clear();
            ((rmE_2)this.id_throws[49]).id_break(id_private, -1);
        }
    }

    @Override
    protected rdn_3 id_catch() {
        if (this.id_finally.isEmpty() && this.id_implements == rAS.id_class) {
            return new rdn_3(rdy_3.OO);
        }
        rdn_3 rdn_32 = new rdn_3(rdy_3.kz);
        rAB.id_class(rdn_32, this.id_implements);
        rAB.id_class(rdn_32, this.id_finally);
        if (this.id_extends) {
            rdn_32.id_int().id_break("CustomPotionColor", this.id_super());
        }
        return rdn_32;
    }

    public int id_super() {
        return ((rmE_2)this.id_throws[49]).id_class(id_private);
    }

    private void id_public() {
        this.id_extends = false;
        if (this.id_implements == rAS.id_class && this.id_finally.isEmpty()) {
            ((rmE_2)this.id_throws[49]).id_break(id_private, -1);
        } else {
            ((rmE_2)this.id_throws[49]).id_break(id_private, rAB.id_class(rAB.id_class(this.id_implements, this.id_finally)));
        }
    }

    @Override
    protected void m_() {
        super.m_();
        ((rmE_2)this.id_throws[49]).id_class(id_private, -1);
    }
}

