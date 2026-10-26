/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.Ml_1;
import celestial.TR;
import celestial.pg_3;
import celestial.qc_3;
import celestial.rMl_1;
import celestial.rMq_1;
import celestial.rfU_2;
import celestial.rje_3;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.wS_2;
import com.google.common.collect.Maps;
import java.util.Map;

public class qv_3
extends qc_3<rMl_1, wS_2<rMl_1>> {
    private static final Map<rMq_1, rqO_2> id_class = rqR_2.id_class(Maps.newEnumMap(rMq_1.class), enumMap -> {
        enumMap.put(rMq_1.NORMAL, new rqO_2("textures/entity/panda/panda.png"));
        enumMap.put(rMq_1.LAZY, new rqO_2("textures/entity/panda/lazy_panda.png"));
        enumMap.put(rMq_1.WORRIED, new rqO_2("textures/entity/panda/worried_panda.png"));
        enumMap.put(rMq_1.PLAYFUL, new rqO_2("textures/entity/panda/playful_panda.png"));
        enumMap.put(rMq_1.BROWN, new rqO_2("textures/entity/panda/brown_panda.png"));
        enumMap.put(rMq_1.WEAK, new rqO_2("textures/entity/panda/weak_panda.png"));
        enumMap.put(rMq_1.AGGRESSIVE, new rqO_2("textures/entity/panda/aggressive_panda.png"));
    });

    public qv_3(pg_3 pg_32) {
        super(pg_32, new wS_2(9, 0.0f), 0.9f);
        this.id_class(new TR(this));
    }

    @Override
    public rqO_2 id_class(rMl_1 rMl_12) {
        return id_class.getOrDefault((Object)rMl_12.sF(), id_class.get((Object)rMq_1.NORMAL));
    }

    private float id_class(float f, float f2, int n, float f3, float f4) {
        return (float)n < f4 ? rfU_2.id_catch(f3, f, f2) : f;
    }

    @Override
    protected void id_class(rMl_1 rMl_12, Ml_1 ml_1, float f, float f2, float f3) {
        float f4;
        float f5;
        float f6;
        super.id_class(rMl_12, ml_1, f, f2, f3);
        if (rMl_12.id_super > 0) {
            float f7;
            int n = rMl_12.id_super;
            int n2 = n + 1;
            f6 = 7.0f;
            float f8 = f7 = rMl_12.n_() ? 0.3f : 0.8f;
            if (n < 8) {
                float f9 = (float)(90 * n) / 7.0f;
                float f10 = (float)(90 * n2) / 7.0f;
                float f11 = this.id_class(f9, f10, n2, f3, 8.0f);
                ml_1.id_class(0.0, (double)((f7 + 0.2f) * (f11 / 90.0f)), 0.0);
                ml_1.id_class(rje_3.id_break.id_byte(-f11));
            } else if (n < 16) {
                float f12 = ((float)n - 8.0f) / 7.0f;
                float f13 = 90.0f + 90.0f * f12;
                float f14 = 90.0f + 90.0f * ((float)n2 - 8.0f) / 7.0f;
                float f15 = this.id_class(f13, f14, n2, f3, 16.0f);
                ml_1.id_class(0.0, (double)(f7 + 0.2f + (f7 - 0.2f) * (f15 - 90.0f) / 90.0f), 0.0);
                ml_1.id_class(rje_3.id_break.id_byte(-f15));
            } else if ((float)n < 24.0f) {
                float f16 = ((float)n - 16.0f) / 7.0f;
                float f17 = 180.0f + 90.0f * f16;
                float f18 = 180.0f + 90.0f * ((float)n2 - 16.0f) / 7.0f;
                float f19 = this.id_class(f17, f18, n2, f3, 24.0f);
                ml_1.id_class(0.0, (double)(f7 + f7 * (270.0f - f19) / 90.0f), 0.0);
                ml_1.id_class(rje_3.id_break.id_byte(-f19));
            } else if (n < 32) {
                float f20 = ((float)n - 24.0f) / 7.0f;
                float f21 = 270.0f + 90.0f * f20;
                float f22 = 270.0f + 90.0f * ((float)n2 - 24.0f) / 7.0f;
                float f23 = this.id_class(f21, f22, n2, f3, 32.0f);
                ml_1.id_class(0.0, (double)(f7 * ((360.0f - f23) / 90.0f)), 0.0);
                ml_1.id_class(rje_3.id_break.id_byte(-f23));
            }
        }
        if ((f5 = rMl_12.id_throw(f3)) > 0.0f) {
            ml_1.id_class(0.0, (double)(0.8f * f5), 0.0);
            ml_1.id_class(rje_3.id_break.id_byte(rfU_2.id_catch(f5, ((Float)rMl_12.id_throws[16]).floatValue(), ((Float)rMl_12.id_throws[16]).floatValue() + 90.0f)));
            ml_1.id_class(0.0, (double)(-1.0f * f5), 0.0);
            if (rMl_12.sl()) {
                float f24 = (float)(Math.cos((double)((Integer)rMl_12.id_throws[41]).intValue() * 1.25) * Math.PI * (double)0.05f);
                ml_1.id_class(rje_3.id_protected.id_byte(f24));
                if (rMl_12.n_()) {
                    ml_1.id_class(0.0, (double)0.8f, (double)0.55f);
                }
            }
        }
        if ((f4 = rMl_12.id_interface(f3)) > 0.0f) {
            f6 = rMl_12.n_() ? 0.5f : 1.3f;
            ml_1.id_class(0.0, (double)(f6 * f4), 0.0);
            ml_1.id_class(rje_3.id_break.id_byte(rfU_2.id_catch(f4, ((Float)rMl_12.id_throws[16]).floatValue(), ((Float)rMl_12.id_throws[16]).floatValue() + 180.0f)));
        }
    }
}

