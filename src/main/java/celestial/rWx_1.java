/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rXu_1;
import celestial.rdn_3;
import celestial.rkf_3;
import celestial.rkg_3;
import celestial.rkj_3;
import celestial.rkw_3;
import celestial.rqO_2;
import celestial.rqs_3;

public abstract class rWx_1
implements rkw_3<rXu_1> {
    protected final rkg_3 id_class;
    protected final rdn_3 id_break;
    private final rkj_3<?> id_throws;
    private final rkf_3<?> id_case;
    protected final rqO_2 id_byte;
    protected final String id_protected;

    @Override
    public rdn_3 id_byte() {
        return this.id_break;
    }

    public rWx_1(rkj_3<?> rkj_32, rkf_3<?> rkf_32, rqO_2 rqO_22, String string, rkg_3 rkg_32, rdn_3 rdn_32) {
        this.id_throws = rkj_32;
        this.id_case = rkf_32;
        this.id_byte = rqO_22;
        this.id_protected = string;
        this.id_class = rkg_32;
        this.id_break = rdn_32;
    }

    @Override
    public rdn_3 id_class(rXu_1 rXu_12) {
        return this.id_break.id_implements();
    }

    @Override
    public rqs_3<rkg_3> id_class() {
        rqs_3<rkg_3> rqs_32 = rqs_3.id_class();
        rqs_32.add(this.id_class);
        return rqs_32;
    }

    @Override
    public boolean id_class(int n, int n2) {
        return true;
    }

    @Override
    public rkj_3<?> id_catch() {
        return this.id_throws;
    }

    @Override
    public rqO_2 id_case() {
        return this.id_byte;
    }

    @Override
    public String id_protected() {
        return this.id_protected;
    }

    @Override
    public rkf_3<?> W_() {
        return this.id_case;
    }
}

