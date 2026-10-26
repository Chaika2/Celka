/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.av_3;
import celestial.iB_2;
import celestial.is_3;
import celestial.rfU_2;
import celestial.rhd_3;
import celestial.rjU_2;

public interface ir_3 {
    default public boolean id_class(is_3 is_32, av_3 av_32, rjU_2 rjU_22) {
        an_3 an_32;
        if (!is_32.BM()) {
            return false;
        }
        an_3 an_33 = an_32 = is_32.Bh().isEmpty() ? null : is_32.Bh().get(0);
        if (is_32.BP() && is_32.G() && an_32 instanceof rhd_3) {
            rhd_3 rhd_32 = (rhd_3)an_32;
            Float f = Float.valueOf(rhd_32.sO());
            is_32.id_throws[15] = f;
            Float f2 = Float.valueOf(((Float)is_32.id_throws[15]).floatValue());
            is_32.id_throws[17] = f2;
            Float f3 = Float.valueOf(rhd_32.Bo() * 0.5f);
            is_32.id_throws[16] = f3;
            is_32.id_case(((Float)is_32.id_throws[15]).floatValue(), ((Float)is_32.id_throws[16]).floatValue());
            Float f4 = Float.valueOf(((Float)is_32.id_throws[15]).floatValue());
            is_32.id_private[23] = f4;
            Float f5 = Float.valueOf(((Float)is_32.id_throws[15]).floatValue());
            is_32.id_private[25] = f5;
            Float f6 = Float.valueOf(1.0f);
            is_32.id_throws[37] = f6;
            Float f7 = Float.valueOf(is_32.sB() * 0.1f);
            is_32.id_private[29] = f7;
            if (av_32.id_class && av_32.id_break++ > av_32.id_byte) {
                av_32.id_class = false;
            }
            if (is_32.Po()) {
                float f8 = this.id_throws();
                if (av_32.id_class) {
                    f8 += f8 * 1.15f * rfU_2.id_class((float)av_32.id_break / (float)av_32.id_byte * (float)Math.PI);
                }
                is_32.id_super(f8);
                this.id_class(new rjU_2(0.0, 0.0, 1.0));
                Integer n = 0;
                is_32.id_private[45] = n;
            } else {
                is_32.id_class((iB_2)is_32, false);
                is_32.id_byte(rjU_2.id_class);
            }
            return true;
        }
        Float f = Float.valueOf(0.5f);
        is_32.id_throws[37] = f;
        Float f9 = Float.valueOf(0.02f);
        is_32.id_private[29] = f9;
        this.id_class(rjU_22);
        return false;
    }

    public void id_class(rjU_2 var1);

    public float id_throws();

    public boolean id_protected();
}

