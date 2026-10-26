/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.iB_2;
import celestial.rYG;
import celestial.rfH_2;
import celestial.rrbD_2;
import java.util.UUID;

public class rrMG
implements rrbD_2 {
    private an_3 id_class;

    @Override
    public rYG id_byte() {
        return this.id_class.BQ().id_class;
    }

    public void id_class(an_3 an_32) {
        this.id_class = an_32;
    }

    @Override
    public int id_class() {
        UUID uUID = this.id_class.ro();
        long l = uUID.getLeastSignificantBits();
        return (int)(l & Integer.MAX_VALUE);
    }

    @Override
    public rfH_2 id_break() {
        return this.id_class.BQ().id_break;
    }

    @Override
    public int id_throws() {
        if (!(this.id_class instanceof iB_2)) {
            return 0;
        }
        iB_2 iB_22 = (iB_2)this.id_class;
        return (int)iB_22.Ss();
    }

    public an_3 id_catch() {
        return this.id_class;
    }

    @Override
    public int id_case() {
        if (!(this.id_class instanceof iB_2)) {
            return 0;
        }
        iB_2 iB_22 = (iB_2)this.id_class;
        return (int)iB_22.SK();
    }

    @Override
    public String id_protected() {
        return this.id_class.Bk() ? this.id_class.rD().getString() : null;
    }
}

