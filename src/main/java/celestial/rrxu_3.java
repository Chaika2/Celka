/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.fj_3;
import celestial.rrWH;
import celestial.rrbb_3;
import celestial.rrxA_2;
import celestial.rrxC_2;
import celestial.rrxm_3;
import celestial.rrzJ_2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class rrxu_3 {
    private int id_class;
    private HU id_break;
    private fj_3[] id_byte;
    private boolean id_protected;
    private boolean[] id_throws = new boolean[256];
    private List<rrxC_2> id_case = new ArrayList<rrxC_2>();
    private rrWH id_catch = new rrWH(16);
    private rrWH id_private = new rrWH(16);

    private void id_class(int n, int n2) {
        int n3 = n2 - n;
        if (n3 > 0) {
            int n4 = n * 4;
            int n5 = n3 * 4;
            this.id_catch.id_class(n4);
            this.id_private.id_class(n5);
        }
    }

    private int id_class(fj_3 fj_32, int n) {
        this.id_catch.id_break();
        this.id_private.id_break();
        int n2 = -1;
        int n3 = -1;
        int n4 = this.id_class / 4;
        for (int i = n; i < n4; ++i) {
            fj_3 fj_33 = this.id_byte[i];
            if (fj_33 == fj_32) {
                if (n3 >= 0) continue;
                n3 = i;
                continue;
            }
            if (n3 < 0) continue;
            this.id_class(n3, i);
            if (!this.id_protected) {
                this.id_case.add(new rrxC_2(fj_32, this.id_catch.id_throws(), this.id_private.id_throws()));
                return i;
            }
            n3 = -1;
            if (n2 >= 0) continue;
            n2 = i;
        }
        if (n3 >= 0) {
            this.id_class(n3, n4);
        }
        if (n2 < 0) {
            n2 = n4;
        }
        this.id_case.add(new rrxC_2(fj_32, this.id_catch.id_throws(), this.id_private.id_throws()));
        return n2;
    }

    public rrxm_3 id_class(int n, HU hU, fj_3[] fj_3Array) {
        if (fj_3Array == null) {
            return null;
        }
        this.id_class = n;
        this.id_break = hU;
        this.id_byte = fj_3Array;
        this.id_protected = this.id_break != rrxA_2.id_protected;
        int n2 = rrbb_3.rF().id_throws();
        if (this.id_throws.length <= n2) {
            this.id_throws = new boolean[n2 + 1];
        }
        Arrays.fill(this.id_throws, false);
        this.id_case.clear();
        int n3 = 0;
        int n4 = -1;
        int n5 = this.id_class / 4;
        for (int i = 0; i < n5; ++i) {
            int n6;
            fj_3 fj_32 = this.id_byte[i];
            if (fj_32 == null || this.id_throws[n6 = fj_32.id_new()]) continue;
            if (fj_32 == rrzJ_2.id_byte) {
                if (n4 >= 0) continue;
                n4 = i;
                continue;
            }
            i = this.id_class(fj_32, i) - 1;
            ++n3;
            if (!this.id_protected) continue;
            this.id_throws[n6] = true;
        }
        if (n4 >= 0) {
            this.id_class(rrzJ_2.id_byte, n4);
            ++n3;
        }
        rrxC_2[] rrxC_2Array = this.id_case.toArray(new rrxC_2[this.id_case.size()]);
        return new rrxm_3(rrxC_2Array);
    }
}

