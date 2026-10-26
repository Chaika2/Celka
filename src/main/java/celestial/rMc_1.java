/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.is_3;
import celestial.rBA;
import celestial.rba_3;

public class rMc_1
extends rBA {
    public final /* synthetic */ rba_3 id_catch;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public rMc_1(rba_3 rba_32, is_3 is_32, Class clazz, float f) {
        this.id_catch = rba_32;
        super(is_32, clazz, f);
    }

    @Override
    public boolean id_class() {
        return super.id_class() && !this.id_catch.sx() && !this.id_catch.su();
    }

    @Override
    public boolean id_break() {
        return super.id_break() && !this.id_catch.sx() && !this.id_catch.su();
    }
}

