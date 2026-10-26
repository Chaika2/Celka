/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.mr_3;
import celestial.rdn_3;
import celestial.rfU_2;
import celestial.rkg_3;

public class mP_2 {
    private final rkg_3 id_break;
    private final int id_byte;
    private final int id_protected;
    public final /* synthetic */ mr_3 id_class;

    public rdn_3 id_byte() {
        rdn_3[] rdn_3Array = this.id_break.id_class();
        return rdn_3Array[rfU_2.id_protected(this.id_class.id_byte / 30.0f) % rdn_3Array.length];
    }

    public mP_2(mr_3 mr_32, rkg_3 rkg_32, int n, int n2) {
        this.id_class = mr_32;
        this.id_break = rkg_32;
        this.id_byte = n;
        this.id_protected = n2;
    }

    public int id_class() {
        return this.id_byte;
    }

    public int id_break() {
        return this.id_protected;
    }
}

