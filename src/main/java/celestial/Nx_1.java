/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.cb_3;
import celestial.cr_3;
import celestial.rfU_2;
import celestial.rqL_2;
import celestial.rqn_3;

public class Nx_1
extends cr_3 {
    private final cb_3 id_class;
    private int id_package;

    @Override
    public void id_byte() {
        ++this.id_package;
        if (!((Boolean)this.id_class.id_throws[27]).booleanValue() && (this.id_package <= 20 || this.id_class.Sy())) {
            this.id_catch = (float)this.id_class.rx();
            this.id_private = (float)this.id_class.re();
            this.id_implements = (float)this.id_class.BO();
            float f = (float)this.id_class.rv().id_catch();
            this.id_throws = (double)f >= 1.0E-7 ? rfU_2.id_class(f / 4.0f, 0.0f, 1.0f) : 0.0f;
            if (this.id_package < 20) {
                this.id_throws = 0.0f;
            } else if (this.id_package < 40) {
                this.id_throws = (float)((double)this.id_throws * ((double)(this.id_package - 20) / 20.0));
            }
            float f2 = 0.8f;
            this.id_case = this.id_throws > 0.8f ? 1.0f + (this.id_throws - 0.8f) : 1.0f;
        } else {
            this.id_super();
        }
    }

    public Nx_1(cb_3 cb_32) {
        super(rqn_3.Bz, rqL_2.PLAYERS);
        this.id_class = cb_32;
        this.id_finally = true;
        this.id_extends = 0;
        this.id_throws = 0.1f;
    }
}

