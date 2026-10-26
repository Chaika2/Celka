/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package celestial;

import celestial.rDQ;
import celestial.rDv_1;
import celestial.rKi_1;
import celestial.rKv_1;
import celestial.rrPR;
import celestial.rrsN_2;
import celestial.rrsk_3;
import com.google.common.collect.ImmutableList;
import java.util.List;

public class rDF {
    public final rKi_1 id_class;
    public final rKi_1 id_break;
    private final rrPR id_byte;
    private final rrsN_2 id_protected;
    private final rDQ id_throws;
    private List<rrsk_3> id_case = ImmutableList.of();
    private int id_catch;
    private boolean id_private;
    private rKv_1 id_implements = rKv_1.OCEAN_FLOOR;

    public rDF(rKi_1 rKi_12, rKi_1 rKi_13, rrPR rrPR2, rrsN_2 rrsN_22, rDQ rDQ2) {
        this.id_class = rKi_12;
        this.id_break = rKi_13;
        this.id_byte = rrPR2;
        this.id_protected = rrsN_22;
        this.id_throws = rDQ2;
    }

    public rDF id_class(rKv_1 rKv_12) {
        this.id_implements = rKv_12;
        return this;
    }

    public rDF id_class() {
        this.id_private = true;
        return this;
    }

    public rDF id_class(int n) {
        this.id_catch = n;
        return this;
    }

    public rDF id_class(List<rrsk_3> list) {
        this.id_case = list;
        return this;
    }

    public rDv_1 id_break() {
        return new rDv_1(this.id_class, this.id_break, this.id_byte, this.id_protected, this.id_throws, this.id_case, this.id_catch, this.id_private, this.id_implements);
    }
}

