/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.is_3;
import celestial.rPR;
import celestial.rfU_2;

public class rPj_1
extends rPR {
    private final int id_private;

    public rPj_1(is_3 is_32, int n) {
        super(is_32);
        this.id_private = n;
    }

    @Override
    public void id_class() {
        if (this.id_protected) {
            this.id_protected = false;
            Float f = Float.valueOf(this.id_class(((Float)this.id_class.id_private[25]).floatValue(), this.id_private() + 20.0f, this.id_break));
            this.id_class.id_private[25] = f;
            Float f2 = Float.valueOf(this.id_class(((Float)this.id_class.id_throws[16]).floatValue(), this.id_catch() + 10.0f, this.id_byte));
            this.id_class.id_throws[16] = f2;
        } else {
            if (this.id_class.id_public().id_native()) {
                Float f = Float.valueOf(this.id_class(((Float)this.id_class.id_throws[16]).floatValue(), 0.0f, 5.0f));
                this.id_class.id_throws[16] = f;
            }
            Float f = Float.valueOf(this.id_class(((Float)this.id_class.id_private[25]).floatValue(), ((Float)this.id_class.id_private[23]).floatValue(), this.id_break));
            this.id_class.id_private[25] = f;
        }
        float f = rfU_2.id_catch(((Float)this.id_class.id_private[25]).floatValue() - ((Float)this.id_class.id_private[23]).floatValue());
        if (f < (float)(-this.id_private)) {
            is_3 is_32 = this.id_class;
            Float f3 = Float.valueOf(((Float)is_32.id_private[23]).floatValue() - 4.0f);
            is_32.id_private[23] = f3;
        } else if (f > (float)this.id_private) {
            is_3 is_33 = this.id_class;
            Float f4 = Float.valueOf(((Float)is_33.id_private[23]).floatValue() + 4.0f);
            is_33.id_private[23] = f4;
        }
    }
}

