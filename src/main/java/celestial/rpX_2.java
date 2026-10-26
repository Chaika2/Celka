/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.iB_2;
import celestial.rdn_3;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhd_3;
import celestial.rjU_2;
import celestial.rye_3;

public class rpX_2
extends rye_3 {
    protected final an_3 id_return;
    private boolean id_public;

    public rpX_2(String string, an_3 an_32) {
        super(string);
        this.id_return = an_32;
    }

    @Override
    public String toString() {
        return "EntityDamageSource (" + this.id_return + ")";
    }

    @Override
    public rgP_2 id_class(iB_2 iB_22) {
        rdn_3 rdn_32 = this.id_return instanceof iB_2 ? ((iB_2)this.id_return).ss() : rdn_3.id_break;
        String string = "death.attack." + this.id_synchronized;
        return !rdn_32.id_class() && rdn_32.id_this() ? new rgn_3(string + ".item", iB_22.L_(), this.id_return.L_(), rdn_32.id_throw()) : new rgn_3(string, iB_22.L_(), this.id_return.L_());
    }

    @Override
    public an_3 id_extends() {
        return this.id_return;
    }

    public boolean id_goto() {
        return this.id_public;
    }

    @Override
    public rjU_2 id_return() {
        return this.id_return != null ? this.id_return.Ps() : null;
    }

    @Override
    public boolean id_super() {
        return this.id_return != null && this.id_return instanceof iB_2 && !(this.id_return instanceof rhd_3);
    }

    public rpX_2 id_public() {
        this.id_public = true;
        return this;
    }
}

