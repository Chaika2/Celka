/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Qw_1;
import celestial.rqr_3;
import celestial.rrAO;
import celestial.rrQX;

public class rqP_2
extends rqr_3 {
    private final Qw_1 id_class;

    public rqP_2(Qw_1 qw_1) {
        this.id_class = qw_1;
    }

    @Override
    public void id_class(boolean bl) {
        rrAO rrAO2 = rrAO.id_class(this.id_class.h.id_protected(), this.id_class.J.id_protected(), this.id_class.X.id_protected(), this.id_class.x.id_protected(), this.id_protected == this.id_throws ? 0.0f : (this.id_protected ? 1.0f : -1.0f), this.id_case == this.id_catch ? 0.0f : (this.id_case ? 1.0f : -1.0f), this.id_class.d.id_protected(), this.id_class.k.id_protected(), 0.3);
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrAO2);
        if (rrAO2.id_byte()) {
            this.id_protected = false;
            this.id_throws = false;
            this.id_case = false;
            this.id_catch = false;
            this.id_byte = 0.0f;
            this.id_break = 0.0f;
            this.id_private = false;
            this.id_implements = false;
            return;
        }
        if (this.id_finally) {
            rrAO2.id_protected(false);
            rrAO2.id_byte(false);
            rrAO2.id_case(false);
            rrAO2.id_throws(false);
            rrAO2.id_break(0.0f);
            rrAO2.id_class(0.0f);
        }
        if (this.id_extends) {
            rrAO2.id_break(false);
        }
        if (this.id_native) {
            rrAO2.id_catch(false);
        }
        double d = rrAO2.id_case();
        this.id_protected = rrAO2.id_extends();
        this.id_throws = rrAO2.id_class();
        this.id_case = rrAO2.id_protected();
        this.id_catch = rrAO2.id_finally();
        this.id_byte = rrAO2.id_catch();
        this.id_break = rrAO2.id_throws();
        this.id_private = rrAO2.id_break();
        this.id_implements = rrAO2.id_implements();
        if (bl) {
            this.id_break = (float)((double)this.id_break * d);
            this.id_byte = (float)((double)this.id_byte * d);
        }
        this.id_finally = false;
        this.id_extends = false;
        this.id_native = false;
    }
}

