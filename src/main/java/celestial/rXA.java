/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.rWr_1;
import celestial.rXC;
import celestial.rXZ;
import celestial.rXm_1;
import celestial.rXu_1;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rhd_3;
import celestial.rqs_3;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.stream.Collectors;

public class rXA
implements rXZ,
rXu_1 {
    private final int id_class;
    private final rqs_3<rdn_3> id_break;
    private List<rXm_1> id_byte;

    @Override
    public boolean id_byte(rhd_3 rhd_32) {
        return true;
    }

    private void id_byte(rdn_3 rdn_32) {
        for (int i = 0; i < this.id_class; ++i) {
            rdn_3 rdn_33 = this.id_extends(i);
            if (!rdn_33.id_class()) continue;
            this.id_break(i, rdn_32.id_implements());
            rdn_32.id_throws(0);
            return;
        }
    }

    public rcy_3 id_byte() {
        rcy_3 rcy_32 = new rcy_3();
        for (int i = 0; i < this.id_else(); ++i) {
            rdn_3 rdn_32 = this.id_extends(i);
            if (rdn_32.id_class()) continue;
            rcy_32.add(rdn_32.id_break(new rcd_3()));
        }
        return rcy_32;
    }

    public rXA(rdn_3 ... rdn_3Array) {
        this.id_class = rdn_3Array.length;
        this.id_break = rqs_3.id_class(rdn_3.id_break, rdn_3Array);
    }

    public rXA(int n) {
        this.id_class = n;
        this.id_break = rqs_3.id_class(n, rdn_3.id_break);
    }

    public String toString() {
        return this.id_break.stream().filter(rdn_32 -> !rdn_32.id_class()).collect(Collectors.toList()).toString();
    }

    private boolean id_class(rdn_3 rdn_32, rdn_3 rdn_33) {
        return rdn_32.id_break() == rdn_33.id_break() && rdn_3.id_class(rdn_32, rdn_33);
    }

    public void id_class(rXm_1 rXm_12) {
        if (this.id_byte == null) {
            this.id_byte = Lists.newArrayList();
        }
        this.id_byte.add(rXm_12);
    }

    public void id_class(rcy_3 rcy_32) {
        for (int i = 0; i < rcy_32.size(); ++i) {
            rdn_3 rdn_32 = rdn_3.id_class(rcy_32.id_class(i));
            if (rdn_32.id_class()) continue;
            this.id_class(rdn_32);
        }
    }

    @Override
    public void id_class(rWr_1 rWr_12) {
        for (rdn_3 rdn_32 : this.id_break) {
            rWr_12.id_break(rdn_32);
        }
    }

    public rdn_3 id_class(rdb_3 rdb_32, int n) {
        rdn_3 rdn_32 = new rdn_3(rdb_32, 0);
        for (int i = this.id_class - 1; i >= 0; --i) {
            rdn_3 rdn_33 = this.id_extends(i);
            if (!rdn_33.id_break().equals(rdb_32)) continue;
            int n2 = n - rdn_32.id_char();
            rdn_3 rdn_34 = rdn_33.id_class(n2);
            rdn_32.id_case(rdn_34.id_char());
            if (rdn_32.id_char() == n) break;
        }
        if (!rdn_32.id_class()) {
            this.id_break();
        }
        return rdn_32;
    }

    public rdn_3 id_class(rdn_3 rdn_32) {
        rdn_3 rdn_33 = rdn_32.id_implements();
        this.id_protected(rdn_33);
        if (rdn_33.id_class()) {
            return rdn_3.id_break;
        }
        this.id_byte(rdn_33);
        return rdn_33.id_class() ? rdn_3.id_break : rdn_33;
    }

    @Override
    public rdn_3 id_class(int n, int n2) {
        rdn_3 rdn_32 = rXC.id_class(this.id_break, n, n2);
        if (!rdn_32.id_class()) {
            this.id_break();
        }
        return rdn_32;
    }

    public boolean id_break(rdn_3 rdn_32) {
        boolean bl = false;
        for (rdn_3 rdn_33 : this.id_break) {
            if (!rdn_33.id_class() && (!this.id_class(rdn_33, rdn_32) || rdn_33.id_char() >= rdn_33.id_byte())) continue;
            bl = true;
            break;
        }
        return bl;
    }

    public void id_break(rXm_1 rXm_12) {
        this.id_byte.remove(rXm_12);
    }

    @Override
    public void id_break(int n, rdn_3 rdn_32) {
        this.id_break.set(n, rdn_32);
        if (!rdn_32.id_class() && rdn_32.id_char() > this.ab_()) {
            rdn_32.id_throws(this.ab_());
        }
        this.id_break();
    }

    private void id_break(rdn_3 rdn_32, rdn_3 rdn_33) {
        int n = Math.min(this.ab_(), rdn_33.id_byte());
        int n2 = Math.min(rdn_32.id_char(), n - rdn_33.id_char());
        if (n2 > 0) {
            rdn_33.id_case(n2);
            rdn_32.id_catch(n2);
            this.id_break();
        }
    }

    @Override
    public void id_break() {
        if (this.id_byte != null) {
            for (rXm_1 rXm_12 : this.id_byte) {
                rXm_12.id_class(this);
            }
        }
    }

    @Override
    public rdn_3 id_extends(int n) {
        return n >= 0 && n < this.id_break.size() ? this.id_break.get(n) : rdn_3.id_break;
    }

    @Override
    public int id_else() {
        return this.id_class;
    }

    @Override
    public boolean id_return() {
        for (rdn_3 rdn_32 : this.id_break) {
            if (rdn_32.id_class()) continue;
            return false;
        }
        return true;
    }

    @Override
    public void id_public() {
        this.id_break.clear();
        this.id_break();
    }

    private void id_protected(rdn_3 rdn_32) {
        for (int i = 0; i < this.id_class; ++i) {
            rdn_3 rdn_33 = this.id_extends(i);
            if (!this.id_class(rdn_33, rdn_32)) continue;
            this.id_break(rdn_32, rdn_33);
            if (!rdn_32.id_class()) continue;
            return;
        }
    }

    public List<rdn_3> id_protected() {
        List<rdn_3> list = this.id_break.stream().filter(rdn_32 -> !rdn_32.id_class()).collect(Collectors.toList());
        this.id_public();
        return list;
    }

    @Override
    public rdn_3 id_native(int n) {
        rdn_3 rdn_32 = this.id_break.get(n);
        if (rdn_32.id_class()) {
            return rdn_3.id_break;
        }
        this.id_break.set(n, rdn_3.id_break);
        return rdn_32;
    }
}

