/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hx_1;
import celestial.Hz_1;
import celestial.IJ;
import celestial.IQ;
import celestial.Ml_1;
import celestial.fJ_2;
import celestial.fZ_2;
import celestial.module.render.ItemPhysics;
import celestial.pV_2;
import celestial.pg_3;
import celestial.rYB;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rfU_2;
import celestial.rje_3;
import celestial.rqO_2;
import celestial.rrQX;
import celestial.rsE_2;
import celestial.rxJ_2;
import java.util.Random;

public class qX_2
extends pV_2<rsE_2> {
    private final Hz_1 id_class;
    private final Random id_throws = new Random();

    public qX_2(pg_3 pg_32, Hz_1 hz_1) {
        super(pg_32);
        this.id_class = hz_1;
        this.id_byte = 0.15f;
        this.id_protected = 0.75f;
    }

    @Override
    public rqO_2 id_class(rsE_2 rsE_22) {
        return fJ_2.id_class;
    }

    private int id_class(rdn_3 rdn_32) {
        if (rdn_32.id_char() > 48) {
            return 5;
        }
        if (rdn_32.id_char() > 32) {
            return 4;
        }
        if (rdn_32.id_char() > 16) {
            return 3;
        }
        if (rdn_32.id_char() > 1) {
            return 2;
        }
        return 1;
    }

    @Override
    public void id_class(rsE_2 rsE_22, float f, float f2, Ml_1 ml_1, Hx_1 hx_1, int n) {
        float f3;
        float f4;
        float f5;
        float f6;
        ItemPhysics itemPhysics = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().Z();
        boolean bl = itemPhysics.aJ_();
        float f7 = itemPhysics.id_new();
        ml_1.id_class();
        rdn_3 rdn_32 = rsE_22.id_protected();
        int n2 = rdn_32.id_class() ? 187 : rdb_3.id_class(rdn_32.id_break()) + rdn_32.id_catch();
        this.id_throws.setSeed(n2);
        IJ iJ = this.id_class.id_class(rdn_32, (rYB)rsE_22.id_throws[7], null);
        boolean bl2 = iJ.id_break();
        int n3 = this.id_class(rdn_32);
        if (!bl) {
            float f8 = rfU_2.id_class(((float)rsE_22.id_catch() + f2) / 10.0f + rsE_22.id_class) * 0.1f + 0.1f;
            if (!this.id_case()) {
                f8 = 0.0f;
            }
            f6 = iJ.id_case().id_class((IQ)IQ.GROUND).id_protected.id_break();
            ml_1.id_class(0.0, (double)(f8 + 0.25f * f6), 0.0);
            f5 = rsE_22.id_byte(f2);
            ml_1.id_class(rje_3.id_protected.id_break(f5));
        } else {
            boolean bl3 = rsE_22.PZ();
            if (bl3) {
                ml_1.id_class(0.0, (double)0.15f, 0.0);
            }
            if (rsE_22.BL() || bl3) {
                ml_1.id_class(rje_3.id_protected.id_byte(((Float)rsE_22.id_throws[15]).floatValue()));
                ml_1.id_class(rje_3.id_break.id_byte(((Float)rsE_22.id_throws[16]).floatValue() + (rsE_22.id_protected().id_break() instanceof rxJ_2 ? 0.0f : 90.0f)));
            } else {
                f6 = (((float)rsE_22.id_catch() + f2) / 20.0f + rsE_22.id_class) * 57.295776f;
                ml_1.id_class(rje_3.id_break.id_byte(f6 * f7));
            }
        }
        float f9 = iJ.id_case().id_private.id_protected.id_class();
        f6 = iJ.id_case().id_private.id_protected.id_break();
        f5 = iJ.id_case().id_private.id_protected.id_byte();
        if (!bl2) {
            float f10 = -0.0f * (float)(n3 - 1) * 0.5f * f9;
            f4 = -0.0f * (float)(n3 - 1) * 0.5f * f6;
            f3 = -0.09375f * (float)(n3 - 1) * 0.5f * f5;
            ml_1.id_class((double)f10, (double)f4, (double)f3);
        }
        for (int i = 0; i < n3; ++i) {
            ml_1.id_class();
            if (i > 0) {
                if (bl2) {
                    f4 = (this.id_throws.nextFloat() * 2.0f - 1.0f) * 0.15f;
                    f3 = (this.id_throws.nextFloat() * 2.0f - 1.0f) * 0.15f;
                    float f11 = (this.id_throws.nextFloat() * 2.0f - 1.0f) * 0.15f;
                    if (!this.id_throws()) {
                        f4 = 0.0f;
                        f3 = 0.0f;
                    }
                    ml_1.id_class((double)f4, (double)f3, (double)f11);
                } else {
                    f4 = (this.id_throws.nextFloat() * 2.0f - 1.0f) * 0.15f * 0.5f;
                    f3 = (this.id_throws.nextFloat() * 2.0f - 1.0f) * 0.15f * 0.5f;
                    ml_1.id_class((double)f4, (double)f3, 0.0);
                }
            }
            this.id_class.id_class(rdn_32, IQ.GROUND, false, ml_1, hx_1, n, fZ_2.id_class, iJ);
            ml_1.id_break();
            if (bl2) continue;
            ml_1.id_class((double)(0.0f * f9), (double)(0.0f * f6), (double)(0.09375f * f5));
        }
        ml_1.id_break();
        super.id_class(rsE_22, f, f2, ml_1, hx_1, n);
    }

    public boolean id_throws() {
        return true;
    }

    public boolean id_case() {
        return true;
    }
}

