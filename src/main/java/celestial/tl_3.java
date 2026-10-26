/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package celestial;

import celestial.Iq_1;
import celestial.an_3;
import celestial.cG_2;
import celestial.iB_2;
import celestial.rjU_2;
import celestial.tX_2;
import com.google.common.collect.ImmutableList;

public class tl_3<T extends iB_2>
extends tX_2<T> {
    private final Iq_1 id_class;
    private final Iq_1 id_break = new Iq_1(this, 22, 0);

    public tl_3() {
        this.id_break.id_class(-10.0f, 0.0f, 0.0f, 10.0f, 20.0f, 2.0f, 1.0f);
        this.id_class = new Iq_1(this, 22, 0);
        this.id_class.id_implements = true;
        this.id_class.id_class(0.0f, 0.0f, 0.0f, 10.0f, 20.0f, 2.0f, 1.0f);
    }

    @Override
    public void id_class(T t, float f, float f2, float f3, float f4, float f5) {
        float f6 = 0.2617994f;
        float f7 = -0.2617994f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        if (((iB_2)t).Sy()) {
            float f10 = 1.0f;
            rjU_2 rjU_22 = ((an_3)t).rv();
            if (rjU_22.id_byte < 0.0) {
                rjU_2 rjU_23 = rjU_22.id_protected();
                f10 = 1.0f - (float)Math.pow(-rjU_23.id_byte, 1.5);
            }
            f6 = f10 * 0.34906584f + (1.0f - f10) * f6;
            f7 = f10 * -1.5707964f + (1.0f - f10) * f7;
        } else if (((an_3)t).x()) {
            f6 = 0.69813174f;
            f7 = -0.7853982f;
            f8 = 3.0f;
            f9 = 0.08726646f;
        }
        this.id_break.id_byte = 5.0f;
        this.id_break.id_protected = f8;
        if (t instanceof cG_2) {
            cG_2 cG_22 = (cG_2)t;
            Float f11 = Float.valueOf((float)((double)((Float)cG_22.id_class[2]).floatValue() + (double)(f6 - ((Float)cG_22.id_class[2]).floatValue()) * 0.1));
            cG_22.id_class[2] = f11;
            Float f12 = Float.valueOf((float)((double)((Float)cG_22.id_class[3]).floatValue() + (double)(f9 - ((Float)cG_22.id_class[3]).floatValue()) * 0.1));
            cG_22.id_class[3] = f12;
            Float f13 = Float.valueOf((float)((double)((Float)cG_22.id_class[4]).floatValue() + (double)(f7 - ((Float)cG_22.id_class[4]).floatValue()) * 0.1));
            cG_22.id_class[4] = f13;
            this.id_break.id_case = ((Float)cG_22.id_class[2]).floatValue();
            this.id_break.id_catch = ((Float)cG_22.id_class[3]).floatValue();
            this.id_break.id_private = ((Float)cG_22.id_class[4]).floatValue();
        } else {
            this.id_break.id_case = f6;
            this.id_break.id_private = f7;
            this.id_break.id_catch = f9;
        }
        this.id_class.id_byte = -this.id_break.id_byte;
        this.id_class.id_catch = -this.id_break.id_catch;
        this.id_class.id_protected = this.id_break.id_protected;
        this.id_class.id_case = this.id_break.id_case;
        this.id_class.id_private = -this.id_break.id_private;
    }

    @Override
    protected Iterable<Iq_1> id_class() {
        return ImmutableList.of();
    }

    @Override
    protected Iterable<Iq_1> id_break() {
        return ImmutableList.of((Object)this.id_break, (Object)this.id_class);
    }
}

