/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rcd_3;
import celestial.rco_3;
import celestial.rdb_3;
import celestial.rdn_3;
import java.util.function.Predicate;

public class RU
implements Predicate<rdn_3> {
    private final rdb_3 id_class;
    private final rcd_3 id_break;

    public RU(rdb_3 rdb_32, rcd_3 rcd_32) {
        this.id_class = rdb_32;
        this.id_break = rcd_32;
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.id_class((rdn_3)object);
    }

    public boolean id_class(rdn_3 rdn_32) {
        return rdn_32.id_break() == this.id_class && rco_3.id_class(this.id_break, rdn_32.id_package(), true);
    }
}

