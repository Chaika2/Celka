/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.is_3;
import celestial.rfU_2;

public class rPf_1 {
    private final is_3 id_class;
    private int id_break;
    private float id_byte;

    private void id_byte() {
        Float f = Float.valueOf(rfU_2.id_break(((Float)this.id_class.id_private[25]).floatValue(), ((Float)this.id_class.id_private[23]).floatValue(), (float)this.id_class.S()));
        this.id_class.id_private[25] = f;
    }

    public rPf_1(is_3 is_32) {
        this.id_class = is_32;
    }

    public void id_class() {
        if (this.id_case()) {
            Float f = Float.valueOf(((Float)this.id_class.id_throws[15]).floatValue());
            this.id_class.id_private[23] = f;
            this.id_byte();
            this.id_byte = ((Float)this.id_class.id_private[25]).floatValue();
            this.id_break = 0;
        } else if (this.id_throws()) {
            if (Math.abs(((Float)this.id_class.id_private[25]).floatValue() - this.id_byte) > 15.0f) {
                this.id_break = 0;
                this.id_byte = ((Float)this.id_class.id_private[25]).floatValue();
                this.id_break();
            } else {
                ++this.id_break;
                if (this.id_break > 10) {
                    this.id_protected();
                }
            }
        }
    }

    private void id_break() {
        Float f = Float.valueOf(rfU_2.id_break(((Float)this.id_class.id_private[23]).floatValue(), ((Float)this.id_class.id_private[25]).floatValue(), (float)this.id_class.S()));
        this.id_class.id_private[23] = f;
    }

    private boolean id_throws() {
        return this.id_class.Bh().isEmpty() || !(this.id_class.Bh().get(0) instanceof is_3);
    }

    private boolean id_case() {
        double d;
        double d2 = this.id_class.rx() - (Double)this.id_class.id_throws[8];
        return d2 * d2 + (d = this.id_class.BO() - (Double)this.id_class.id_throws[10]) * d > 2.500000277905201E-7;
    }

    private void id_protected() {
        int n = this.id_break - 10;
        float f = rfU_2.id_class((float)n / 10.0f, 0.0f, 1.0f);
        float f2 = (float)this.id_class.S() * (1.0f - f);
        Float f3 = Float.valueOf(rfU_2.id_break(((Float)this.id_class.id_private[23]).floatValue(), ((Float)this.id_class.id_private[25]).floatValue(), f2));
        this.id_class.id_private[23] = f3;
    }
}

