/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rXC;
import celestial.rXu_1;
import celestial.rXv_1;
import celestial.rdn_3;
import celestial.rhd_3;
import celestial.rkw_3;
import celestial.rqs_3;

public class rXd_1
implements rXu_1,
rXv_1 {
    private final rqs_3<rdn_3> id_class = rqs_3.id_class(1, rdn_3.id_break);
    private rkw_3<?> id_break;

    @Override
    public rkw_3<?> id_byte() {
        return this.id_break;
    }

    @Override
    public boolean id_byte(rhd_3 rhd_32) {
        return true;
    }

    @Override
    public void id_class(rkw_3<?> rkw_32) {
        this.id_break = rkw_32;
    }

    @Override
    public rdn_3 id_class(int n, int n2) {
        return rXC.id_class(this.id_class, 0);
    }

    @Override
    public void id_break(int n, rdn_3 rdn_32) {
        this.id_class.set(0, rdn_32);
    }

    @Override
    public void id_break() {
    }

    @Override
    public rdn_3 id_extends(int n) {
        return this.id_class.get(0);
    }

    @Override
    public int id_else() {
        return 1;
    }

    @Override
    public boolean id_return() {
        for (rdn_3 rdn_32 : this.id_class) {
            if (rdn_32.id_class()) continue;
            return false;
        }
        return true;
    }

    @Override
    public void id_public() {
        this.id_class.clear();
    }

    @Override
    public rdn_3 id_native(int n) {
        return rXC.id_class(this.id_class, 0);
    }
}

