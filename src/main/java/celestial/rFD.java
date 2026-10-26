/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.gV_2;
import celestial.gy_3;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rjK_2;
import celestial.rjU_2;
import celestial.rnW_2;
import celestial.rrEm_1;
import java.util.UUID;

public class rFD
implements gV_2 {
    private static final rgN_2 id_class = new rgN_2("Rcon");
    private final StringBuffer id_break = new StringBuffer();
    private final rnW_2 id_protected;

    public gy_3 id_byte() {
        rrEm_1 rrEm_12 = this.id_protected.id_abstract();
        return new gy_3(this, rjU_2.id_byte(rrEm_12.X()), rjK_2.id_class, rrEm_12, 4, "Rcon", id_class, this.id_protected, null);
    }

    public rFD(rnW_2 rnW_22) {
        this.id_protected = rnW_22;
    }

    @Override
    public boolean C() {
        return true;
    }

    @Override
    public boolean l() {
        return true;
    }

    @Override
    public void id_class(rgP_2 rgP_22, UUID uUID) {
        this.id_break.append(rgP_22.getString());
    }

    public void id_class() {
        this.id_break.setLength(0);
    }

    public String id_break() {
        return this.id_break.toString();
    }

    @Override
    public boolean H() {
        return this.id_protected.id_super();
    }
}

