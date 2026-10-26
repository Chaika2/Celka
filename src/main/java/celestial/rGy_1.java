/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iQ_2;
import celestial.rGA;
import celestial.rPY;
import celestial.rPo_1;

public class rGy_1
extends rPY {
    private float id_implements;
    private int id_finally;
    private final rGA id_extends;
    private boolean id_native;

    public rGy_1(rGA rGA2) {
        super(rGA2);
        this.id_extends = rGA2;
        this.id_implements = 180.0f * ((Float)rGA2.id_throws[15]).floatValue() / (float)Math.PI;
    }

    @Override
    public void id_class() {
        Float f = Float.valueOf(this.id_class(((Float)this.id_class.id_throws[15]).floatValue(), this.id_implements, 90.0f));
        this.id_class.id_throws[15] = f;
        Float f2 = Float.valueOf(((Float)this.id_class.id_throws[15]).floatValue());
        this.id_class.id_private[25] = f2;
        Float f3 = Float.valueOf(((Float)this.id_class.id_throws[15]).floatValue());
        this.id_class.id_private[23] = f3;
        if (this.id_private != rPo_1.MOVE_TO) {
            this.id_class.id_catch(0.0f);
        } else {
            this.id_private = rPo_1.WAIT;
            if (this.id_class.BL()) {
                this.id_class.id_super((float)(this.id_throws * this.id_class.id_class(iQ_2.id_protected)));
                if (this.id_finally-- <= 0) {
                    this.id_finally = this.id_extends.id_implements();
                    if (this.id_native) {
                        this.id_finally /= 3;
                    }
                    this.id_extends.id_else().id_class();
                    if (this.id_extends.sz()) {
                        this.id_extends.id_class(this.id_extends.sd(), this.id_extends.Si(), this.id_extends.id_throws());
                    }
                } else {
                    Float f4 = Float.valueOf(0.0f);
                    this.id_extends.id_private[42] = f4;
                    Float f5 = Float.valueOf(0.0f);
                    this.id_extends.id_private[44] = f5;
                    this.id_class.id_super(0.0f);
                }
            } else {
                this.id_class.id_super((float)(this.id_throws * this.id_class.id_class(iQ_2.id_protected)));
            }
        }
    }

    public void id_class(double d) {
        this.id_throws = d;
        this.id_private = rPo_1.MOVE_TO;
    }

    public void id_class(float f, boolean bl) {
        this.id_implements = f;
        this.id_native = bl;
    }
}

