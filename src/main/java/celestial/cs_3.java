/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.cb_3;
import celestial.cr_3;
import celestial.rqL_2;
import celestial.rqn_3;

public class cs_3
extends cr_3 {
    private final cb_3 id_class;
    private int id_package;

    @Override
    public void id_byte() {
        if (!((Boolean)this.id_class.id_throws[27]).booleanValue() && this.id_package >= 0) {
            this.id_package = this.id_class.W() ? ++this.id_package : (this.id_package -= 2);
            this.id_package = Math.min(this.id_package, 40);
            this.id_throws = Math.max(0.0f, Math.min((float)this.id_package / 40.0f, 1.0f));
        } else {
            this.id_super();
        }
    }

    public cs_3(cb_3 cb_32) {
        super(rqn_3.id_super, rqL_2.AMBIENT);
        this.id_class = cb_32;
        this.id_finally = true;
        this.id_extends = 0;
        this.id_throws = 1.0f;
        this.id_volatile = true;
        this.id_final = true;
    }
}

