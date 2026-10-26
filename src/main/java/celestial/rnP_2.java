/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rAi_1;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgp_3;
import celestial.rgv_3;
import celestial.rgy_3;
import celestial.rnr_3;
import celestial.rns_3;

public class rnP_2 {
    private final rns_3 id_class;
    private final String id_break;
    private final rAi_1 id_byte;
    private rgP_2 id_protected;
    private rgP_2 id_throws;
    private rnr_3 id_case;

    public rAi_1 id_byte() {
        return this.id_byte;
    }

    public rnP_2(rns_3 rns_32, String string, rAi_1 rAi_12, rgP_2 rgP_22, rnr_3 rnr_32) {
        this.id_class = rns_32;
        this.id_break = string;
        this.id_byte = rAi_12;
        this.id_protected = rgP_22;
        this.id_throws = this.id_catch();
        this.id_case = rnr_32;
    }

    public void id_class(rgP_2 rgP_22) {
        this.id_protected = rgP_22;
        this.id_throws = this.id_catch();
        this.id_class.id_throws(this);
    }

    public void id_class(rnr_3 rnr_32) {
        this.id_case = rnr_32;
        this.id_class.id_throws(this);
    }

    public rns_3 id_class() {
        return this.id_class;
    }

    public String id_break() {
        return this.id_break;
    }

    public rgP_2 id_throws() {
        return this.id_throws;
    }

    private rgP_2 id_catch() {
        return rgv_3.id_class(this.id_protected.id_case().id_class(rgc_32 -> rgc_32.id_class(new rgy_3(rgp_3.id_class, new rgN_2(this.id_break)))));
    }

    public rnr_3 id_case() {
        return this.id_case;
    }

    public rgP_2 id_protected() {
        return this.id_protected;
    }
}

