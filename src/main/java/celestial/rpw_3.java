/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.iB_2;
import celestial.rdn_3;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rpX_2;

public class rpw_3
extends rpX_2 {
    private final an_3 id_public;

    public rpw_3(String string, an_3 an_32, an_3 an_33) {
        super(string, an_32);
        this.id_public = an_33;
    }

    @Override
    public rgP_2 id_class(iB_2 iB_22) {
        rgP_2 rgP_22 = this.id_public == null ? this.id_return.L_() : this.id_public.L_();
        rdn_3 rdn_32 = this.id_public instanceof iB_2 ? ((iB_2)this.id_public).ss() : rdn_3.id_break;
        String string = "death.attack." + this.id_synchronized;
        String string2 = string + ".item";
        return !rdn_32.id_class() && rdn_32.id_this() ? new rgn_3(string2, iB_22.L_(), rgP_22, rdn_32.id_throw()) : new rgn_3(string, iB_22.L_(), rgP_22);
    }

    @Override
    public an_3 id_finally() {
        return this.id_return;
    }

    @Override
    public an_3 id_extends() {
        return this.id_public;
    }
}

