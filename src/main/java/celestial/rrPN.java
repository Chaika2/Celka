/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfi_3;
import celestial.rfj_3;
import celestial.rpa_3;
import celestial.rqR_2;
import celestial.rqd_3;
import celestial.rrPA;
import celestial.rrPT;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class rrPN {
    private rpa_3 id_class = rpa_3.NONE;
    private rqd_3 id_break = rqd_3.NONE;
    private rfH_2 id_byte = rfH_2.id_protected;
    private boolean id_protected;
    private rfj_3 id_throws;
    private rfi_3 id_case;
    private boolean id_catch = true;
    private Random id_private;
    private int id_implements;
    private final List<rrPA> id_finally = Lists.newArrayList();
    private boolean id_extends;
    private boolean id_native;

    public rpa_3 id_byte() {
        return this.id_class;
    }

    public rrPN id_byte(boolean bl) {
        this.id_native = bl;
        return this;
    }

    public rrPN id_class(Random random) {
        this.id_private = random;
        return this;
    }

    public rrPT id_class(List<rrPT> list, rfH_2 rfH_22) {
        int n = list.size();
        if (n == 0) {
            throw new IllegalStateException("No palettes");
        }
        return list.get(this.id_break(rfH_22).nextInt(n));
    }

    public rrPN id_class(rrPA rrPA2) {
        this.id_finally.add(rrPA2);
        return this;
    }

    public rrPN id_class(rpa_3 rpa_32) {
        this.id_class = rpa_32;
        return this;
    }

    public rrPN id_class() {
        rrPN rrPN2 = new rrPN();
        rrPN2.id_class = this.id_class;
        rrPN2.id_break = this.id_break;
        rrPN2.id_byte = this.id_byte;
        rrPN2.id_protected = this.id_protected;
        rrPN2.id_throws = this.id_throws;
        rrPN2.id_case = this.id_case;
        rrPN2.id_catch = this.id_catch;
        rrPN2.id_private = this.id_private;
        rrPN2.id_implements = this.id_implements;
        rrPN2.id_finally.addAll(this.id_finally);
        rrPN2.id_extends = this.id_extends;
        rrPN2.id_native = this.id_native;
        return rrPN2;
    }

    public rrPN id_class(rqd_3 rqd_32) {
        this.id_break = rqd_32;
        return this;
    }

    public rrPN id_class(rfH_2 rfH_22) {
        this.id_byte = rfH_22;
        return this;
    }

    public rrPN id_class(boolean bl) {
        this.id_protected = bl;
        return this;
    }

    public rrPN id_class(rfi_3 rfi_32) {
        this.id_case = rfi_32;
        return this;
    }

    public rrPN id_class(rfj_3 rfj_32) {
        this.id_throws = rfj_32;
        return this;
    }

    private rfi_3 id_break(rfj_3 rfj_32) {
        if (rfj_32 == null) {
            return this.id_case;
        }
        int n = rfj_32.id_break * 16;
        int n2 = rfj_32.id_byte * 16;
        return new rfi_3(n, 0, n2, n + 16 - 1, 255, n2 + 16 - 1);
    }

    public rrPN id_break() {
        this.id_finally.clear();
        return this;
    }

    public Random id_break(rfH_2 rfH_22) {
        if (this.id_private != null) {
            return this.id_private;
        }
        return rfH_22 == null ? new Random(rqR_2.id_break()) : new Random(rfU_2.id_class(rfH_22));
    }

    public rrPN id_break(boolean bl) {
        this.id_extends = bl;
        return this;
    }

    public rrPN id_break(rrPA rrPA2) {
        this.id_finally.remove(rrPA2);
        return this;
    }

    public rfH_2 id_throws() {
        return this.id_byte;
    }

    public void id_finally() {
        if (this.id_throws != null) {
            this.id_case = this.id_break(this.id_throws);
        }
    }

    public rfi_3 id_catch() {
        if (this.id_case == null && this.id_throws != null) {
            this.id_finally();
        }
        return this.id_case;
    }

    public boolean id_extends() {
        return this.id_catch;
    }

    public boolean id_case() {
        return this.id_protected;
    }

    public List<rrPA> id_implements() {
        return this.id_finally;
    }

    public rqd_3 id_protected() {
        return this.id_break;
    }

    public boolean id_private() {
        return this.id_extends;
    }

    public boolean id_native() {
        return this.id_native;
    }
}

