/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.rBA;
import celestial.rMl_1;
import celestial.rYB;
import celestial.rhd_3;

public class rMg_1
extends rBA {
    private final rMl_1 id_catch;

    public rMg_1(rMl_1 rMl_12, Class<? extends iB_2> clazz, float f) {
        super(rMl_12, clazz, f);
        this.id_catch = rMl_12;
    }

    public void id_class(iB_2 iB_22) {
        this.id_break = iB_22;
    }

    @Override
    public boolean id_class() {
        if (this.id_class.Sa().nextFloat() >= this.id_protected) {
            return false;
        }
        if (this.id_break == null) {
            this.id_break = this.id_throws == rhd_3.class ? ((rYB)this.id_class.id_throws[7]).id_class(this.id_case, this.id_class, this.id_class.rx(), this.id_class.rH(), this.id_class.BO()) : ((rYB)this.id_class.id_throws[7]).id_break(this.id_throws, this.id_case, this.id_class, this.id_class.rx(), this.id_class.rH(), this.id_class.BO(), this.id_class.rN().id_byte(this.id_byte, 3.0, this.id_byte));
        }
        return this.id_catch.sy() && this.id_break != null;
    }

    @Override
    public boolean id_break() {
        return this.id_break != null && super.id_break();
    }

    @Override
    public void id_throws() {
        if (this.id_break != null) {
            super.id_throws();
        }
    }
}

