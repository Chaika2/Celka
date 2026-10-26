/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Oa_1;
import celestial.gt_3;
import celestial.rqO_2;
import java.util.Optional;

public class gw_3 {
    public static final gw_3 id_class = new gw_3((rqO_2)null);
    private final rqO_2 id_break;
    private boolean id_byte;
    private Optional<gt_3> id_protected = Optional.empty();

    public gw_3(rqO_2 rqO_22) {
        this.id_break = rqO_22;
    }

    public gw_3(gt_3 gt_32) {
        this.id_byte = true;
        this.id_break = null;
        this.id_protected = Optional.of(gt_32);
    }

    public Optional<gt_3> id_class(Oa_1 oa_1) {
        if (!this.id_byte) {
            if (this.id_break != null) {
                this.id_protected = oa_1.id_class(this.id_break);
            }
            this.id_byte = true;
        }
        return this.id_protected;
    }

    public rqO_2 id_class() {
        return this.id_protected.map(gt_32 -> gt_32.id_break).orElse(this.id_break);
    }
}

