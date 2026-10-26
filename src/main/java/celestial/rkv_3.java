/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rXu_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rkg_3;
import celestial.rkj_3;
import celestial.rkw_3;
import celestial.rqO_2;
import celestial.rqs_3;

public abstract class rkv_3
implements rkw_3<rXu_1> {
    protected final rkj_3<?> id_class;
    protected final rqO_2 id_break;
    protected final String id_byte;
    protected final rkg_3 id_protected;
    protected final rdn_3 id_throws;
    protected final float id_case;
    protected final int id_catch;

    @Override
    public rdn_3 id_byte() {
        return this.id_throws;
    }

    public rkv_3(rkj_3<?> rkj_32, rqO_2 rqO_22, String string, rkg_3 rkg_32, rdn_3 rdn_32, float f, int n) {
        this.id_class = rkj_32;
        this.id_break = rqO_22;
        this.id_byte = string;
        this.id_protected = rkg_32;
        this.id_throws = rdn_32;
        this.id_case = f;
        this.id_catch = n;
    }

    @Override
    public boolean id_class(int n, int n2) {
        return true;
    }

    @Override
    public rqs_3<rkg_3> id_class() {
        rqs_3<rkg_3> rqs_32 = rqs_3.id_class();
        rqs_32.add(this.id_protected);
        return rqs_32;
    }

    @Override
    public boolean id_class(rXu_1 rXu_12, rYB rYB2) {
        return this.id_protected.id_class(rXu_12.id_extends(0));
    }

    @Override
    public rdn_3 id_class(rXu_1 rXu_12) {
        return this.id_throws.id_implements();
    }

    public float id_break() {
        return this.id_case;
    }

    public int id_throws() {
        return this.id_catch;
    }

    @Override
    public rkj_3<?> id_catch() {
        return this.id_class;
    }

    @Override
    public rqO_2 id_case() {
        return this.id_break;
    }

    @Override
    public String id_protected() {
        return this.id_byte;
    }
}

