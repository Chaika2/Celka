/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.rBW;
import celestial.rBk_1;
import celestial.rEJ;
import java.util.EnumSet;

public class rBs_1
extends rBk_1 {
    private final rEJ id_class;
    private iB_2 id_break;

    @Override
    public void id_byte() {
        this.id_class.id_public().id_final();
        this.id_break = this.id_class.I_();
    }

    public rBs_1(rEJ rEJ2) {
        this.id_class = rEJ2;
        this.id_class(EnumSet.of(rBW.MOVE));
    }

    @Override
    public boolean id_class() {
        iB_2 iB_22 = this.id_class.I_();
        return this.id_class.L() > 0 || iB_22 != null && this.id_class.id_int(iB_22) < 9.0;
    }

    @Override
    public void id_throws() {
        if (this.id_break == null) {
            this.id_class.id_class(-1);
        } else if (this.id_class.id_int(this.id_break) > 49.0) {
            this.id_class.id_class(-1);
        } else if (!this.id_class.id_goto().id_class(this.id_break)) {
            this.id_class.id_class(-1);
        } else {
            this.id_class.id_class(1);
        }
    }

    @Override
    public void id_protected() {
        this.id_break = null;
    }
}

