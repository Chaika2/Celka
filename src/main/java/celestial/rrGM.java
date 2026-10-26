/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rdn_3;
import celestial.rhd_3;
import celestial.rrGb_1;
import celestial.ruS_2;
import celestial.rvF_2;
import celestial.rxI_2;

public class rrGM {
    public final rhd_3 id_class;
    private boolean id_protected = true;
    private int id_throws;
    private int id_case;
    private int id_catch = 127;
    private int id_private = 127;
    private int id_implements;
    public int id_break;
    public final /* synthetic */ rrGb_1 id_byte;

    public rrGM(rrGb_1 rrGb_12, rhd_3 rhd_32) {
        this.id_byte = rrGb_12;
        this.id_class = rhd_32;
    }

    public ruS_2<?> id_class(rdn_3 rdn_32) {
        if (this.id_protected) {
            this.id_protected = false;
            return new rvF_2(rxI_2.id_protected(rdn_32), this.id_byte.id_case, this.id_byte.id_protected, this.id_byte.id_private, this.id_byte.id_finally.values(), this.id_byte.id_catch, this.id_throws, this.id_case, this.id_catch + 1 - this.id_throws, this.id_private + 1 - this.id_case);
        }
        return this.id_implements++ % 5 == 0 ? new rvF_2(rxI_2.id_protected(rdn_32), this.id_byte.id_case, this.id_byte.id_protected, this.id_byte.id_private, this.id_byte.id_finally.values(), this.id_byte.id_catch, 0, 0, 0, 0) : null;
    }

    public void id_class(int n, int n2) {
        if (this.id_protected) {
            this.id_throws = Math.min(this.id_throws, n);
            this.id_case = Math.min(this.id_case, n2);
            this.id_catch = Math.max(this.id_catch, n);
            this.id_private = Math.max(this.id_private, n2);
        } else {
            this.id_protected = true;
            this.id_throws = n;
            this.id_case = n2;
            this.id_catch = n;
            this.id_private = n2;
        }
    }
}

