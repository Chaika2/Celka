/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKd_1;
import celestial.rUt_1;
import celestial.rVm_1;
import celestial.rYG;
import celestial.rfi_3;
import celestial.rii_3;
import celestial.rrPt_1;
import celestial.rrrH;
import celestial.rrrZ;
import celestial.rrrd_1;
import celestial.rrrn_1;
import java.util.List;

public class rrrm_1
extends rrrH<rUt_1> {
    private final long id_throws;

    public rrrm_1(rrrZ<rUt_1> rrrZ2, int n, int n2, rfi_3 rfi_32, int n3, long l) {
        super(rrrZ2, n, n2, rfi_32, n3, l);
        this.id_throws = l;
    }

    @Override
    public void id_class(rVm_1 rVm_12, rKd_1 rKd_12, rrPt_1 rrPt_12, int n, int n2, rYG rYG2, rUt_1 rUt_12) {
        rrrd_1 rrrd_12;
        int n3 = 0;
        do {
            this.id_break.clear();
            this.id_byte = rfi_3.id_class();
            this.id_protected.id_byte(this.id_throws + (long)n3++, n, n2);
            rii_3.id_class();
            rrrd_12 = new rrrd_1(this.id_protected, (n << 4) + 2, (n2 << 4) + 2);
            this.id_break.add(rrrd_12);
            rrrd_12.id_class(rrrd_12, this.id_break, this.id_protected);
            List<rrrn_1> list = rrrd_12.id_byte;
            while (!list.isEmpty()) {
                int n4 = this.id_protected.nextInt(list.size());
                rrrn_1 rrrn_12 = list.remove(n4);
                rrrn_12.id_class(rrrd_12, this.id_break, this.id_protected);
            }
            this.id_break();
            this.id_class(rKd_12.id_case(), this.id_protected, 10);
        } while (this.id_break.isEmpty() || rrrd_12.id_break == null);
    }
}

