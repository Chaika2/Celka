/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.cG_2;
import celestial.rfU_2;
import celestial.rrca_3;
import celestial.rruE;
import celestial.rruO;
import celestial.rruS;
import celestial.rrub_1;
import celestial.rrud_1;
import celestial.rruh_1;
import celestial.rrux_1;

public interface rrce_3 {
    public void id_class(rruO var1);

    default public void id_class(cG_2 cG_22) {
        rruO rruO2 = this.id_throws();
        if (rruO2 == null || rruO2.id_break()) {
            return;
        }
        double d = (Double)cG_22.id_implements[13] - cG_22.rx();
        double d2 = (Double)cG_22.id_implements[15] - cG_22.BO();
        float f = ((Float)cG_22.id_private[24]).floatValue() + ((Float)cG_22.id_private[23]).floatValue() - ((Float)cG_22.id_private[24]).floatValue();
        double d3 = rfU_2.id_class(f * ((float)Math.PI / 180));
        double d4 = -rfU_2.id_break(f * ((float)Math.PI / 180));
        float f2 = ((Integer)((rruE)rruS.id_class[0]).id_class[5]).intValue();
        float f3 = ((Integer)((rruE)rruS.id_class[0]).id_class[6]).intValue();
        if (cG_22.W()) {
            f2 *= 2.0f;
        }
        double d5 = rfU_2.id_class(((Double)cG_22.id_throws[9] - cG_22.re()) * 10.0, 0.0, 1.0);
        if (cG_22.W()) {
            rruO2.id_class((float)((Integer)((rruE)rruS.id_class[0]).id_class[4]).intValue() / 10.0f);
        } else {
            rruO2.id_class((float)((Integer)((rruE)rruS.id_class[0]).id_class[4]).intValue());
        }
        rrub_1 rrub_12 = new rrub_1(0.0f, -1.0f, 0.0f);
        rrux_1 rrux_12 = new rrux_1((float)(cG_22.rx() - (Double)cG_22.id_throws[8]), (float)(cG_22.BO() - (Double)cG_22.id_throws[10]));
        rrux_12.id_byte(-((Float)cG_22.id_throws[15]).floatValue());
        double d6 = d * d3 + d2 * d4 + d5 + (double)(cG_22.x() && !rruO2.id_throws() ? 3 : 0);
        double d7 = (cG_22.re() - (Double)cG_22.id_throws[9]) * (double)f2 + (double)(cG_22.x() && !rruO2.id_throws() ? 1 : 0);
        double d8 = -((Float)rrux_12.id_class[0]).floatValue() * f3;
        rruO2.id_class(cG_22.x());
        rrub_1 rrub_13 = new rrub_1((float)d6, (float)d7, (float)d8);
        if (cG_22.rP()) {
            float f4 = ((Float)cG_22.id_throws[16]).floatValue();
            rrub_12.id_class(f4 += 90.0f);
            rrub_13.id_class(f4);
        }
        rruO2.id_break(rrub_12);
        rruO2.id_class(rrub_13);
        rruO2.id_byte();
    }

    default public void id_class(cG_2 cG_22, int n) {
        rruO rruO2 = this.id_throws();
        if (rruO2 == null || this.id_break(rruO2)) {
            rruO2 = this.s_();
            this.id_class(rruO2);
        }
        if (rruO2 == null) {
            return;
        }
        boolean bl = rruO2.id_class(n);
        if (bl) {
            rruO2.id_class(new rrub_1(1.0f, 1.0f, 0.0f));
            for (int i = 0; i < 5; ++i) {
                this.id_class(cG_22);
            }
        }
    }

    default public boolean id_break(rruO rruO2) {
        rrca_3 rrca_32 = (rrca_3)((Object)((rruE)rruS.id_class[0]).id_class[3]);
        return rrca_32 == (rrca_3)((Object)rrca_3.staticFieldsb97ca5f62a0f31cea6ad2f4a102e3de3[1]) && rruO2.getClass() != rruh_1.class || rrca_32 == (rrca_3)((Object)rrca_3.staticFieldsb97ca5f62a0f31cea6ad2f4a102e3de3[2]) && rruO2.getClass() != rrud_1.class;
    }

    public rruO id_throws();

    default public rruO s_() {
        rrca_3 rrca_32 = (rrca_3)((Object)((rruE)rruS.id_class[0]).id_class[3]);
        if (rrca_32 == (rrca_3)((Object)rrca_3.staticFieldsb97ca5f62a0f31cea6ad2f4a102e3de3[1])) {
            return new rruh_1();
        }
        if (rrca_32 == (rrca_3)((Object)rrca_3.staticFieldsb97ca5f62a0f31cea6ad2f4a102e3de3[2])) {
            return new rrud_1();
        }
        return null;
    }
}

