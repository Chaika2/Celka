/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rAZ;
import celestial.rAl_1;
import celestial.rgP_2;
import celestial.rqO_2;

public interface vd_3 {
    public rqO_2 id_byte();

    public void id_int();

    default public boolean id_this() {
        return this.id_package() && !this.id_implements();
    }

    public rgP_2 id_throws();

    public rAZ id_catch();

    public boolean id_extends();

    public rgP_2 id_case();

    default public rgP_2 id_continue() {
        return this.id_catch().decorate(this.id_case());
    }

    public boolean id_implements();

    public void id_new();

    public boolean id_package();

    default public boolean id_super() {
        return !this.id_package();
    }

    public rAl_1 id_protected();

    public boolean id_private();

    public void id_final();

    public boolean id_volatile();

    public void id_native();
}

