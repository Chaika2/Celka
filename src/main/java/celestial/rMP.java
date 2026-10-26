/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.rBl_1;
import celestial.rba_3;
import celestial.rqn_3;

public class rMP
extends rBl_1 {
    public final /* synthetic */ rba_3 id_break;

    @Override
    public void id_byte() {
        this.id_break.id_return(false);
        super.id_byte();
    }

    public rMP(rba_3 rba_32, double d, boolean bl) {
        this.id_break = rba_32;
        super(rba_32, d, bl);
    }

    @Override
    protected void id_class(iB_2 iB_22, double d) {
        double d2 = this.id_class(iB_22);
        if (d <= d2 && this.id_private()) {
            this.id_catch();
            this.id_class.id_public(iB_22);
            this.id_break.id_class(rqn_3.SZ, 1.0f, 1.0f);
        }
    }

    @Override
    public boolean id_class() {
        return !this.id_break.sJ() && !this.id_break.Sc() && !this.id_break.x() && !this.id_break.sx() && super.id_class();
    }
}

