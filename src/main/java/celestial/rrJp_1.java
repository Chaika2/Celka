/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.wK_2;
import celestial.xc_3;
import celestial.xu_3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class rrJp_1 {
    private List<wK_2> id_class = new ArrayList<wK_2>();
    private List<xc_3> id_break = new ArrayList<xc_3>();
    private List<wK_2> id_byte = Arrays.asList(new wK_2[1]);

    public List<wK_2> id_class(wK_2 wK_22) {
        this.id_byte.set(0, wK_22);
        return this.id_byte;
    }

    public wK_2 id_class(int n) {
        return this.id_class.get(n);
    }

    public void id_class(wK_2 wK_22, xc_3 xc_32) {
        if (wK_22 != null) {
            this.id_class.add(wK_22);
            this.id_break.add(xc_32);
        }
    }

    public int id_class() {
        return this.id_class.size();
    }

    public xc_3 id_break(int n) {
        return n >= 0 && n < this.id_break.size() ? this.id_break.get(n) : xu_3.id_class.id_continue();
    }

    public void id_break() {
        this.id_class.clear();
        this.id_break.clear();
    }
}

