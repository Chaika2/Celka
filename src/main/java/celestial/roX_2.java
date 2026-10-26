/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.rRq_1;
import celestial.rfH_2;
import celestial.rfj_3;
import celestial.roC_2;
import celestial.roJ_2;
import celestial.roN_2;
import celestial.rol_3;
import celestial.rrse_3;
import java.io.IOException;

public abstract class roX_2
implements AutoCloseable,
rol_3 {
    public abstract String id_byte();

    public boolean id_byte(int n, int n2) {
        return true;
    }

    public void id_class(boolean bl, boolean bl2) {
    }

    public abstract rrse_3 id_class();

    public void id_class(rfj_3 rfj_32, boolean bl) {
    }

    public boolean id_class(an_3 an_32) {
        return true;
    }

    public boolean id_class(rfj_3 rfj_32) {
        return true;
    }

    public boolean id_class(rfH_2 rfH_22) {
        return true;
    }

    public roJ_2 id_class(int n, int n2, boolean bl) {
        return (roJ_2)this.id_break(n, n2, roN_2.id_volatile, bl);
    }

    @Override
    public void close() throws IOException {
    }

    public abstract roC_2 id_break(int var1, int var2, roN_2 var3, boolean var4);

    @Override
    public rRq_1 id_throws(int n, int n2) {
        return this.id_break(n, n2, roN_2.id_class, false);
    }

    public boolean id_case(int n, int n2) {
        return this.id_break(n, n2, roN_2.id_volatile, false) != null;
    }

    public roJ_2 id_protected(int n, int n2) {
        return this.id_class(n, n2, false);
    }
}

