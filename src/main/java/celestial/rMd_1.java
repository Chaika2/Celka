/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.iB_2;
import celestial.rBI;
import celestial.rYB;
import celestial.rba_3;
import celestial.rqn_3;
import celestial.rrEm_1;
import java.util.UUID;
import java.util.function.Predicate;

public class rMd_1
extends rBI<iB_2> {
    private iB_2 id_finally;
    private iB_2 id_extends;
    private int id_native;
    public final /* synthetic */ rba_3 id_implements;

    @Override
    public void id_byte() {
        this.id_class(this.id_finally);
        this.id_byte = this.id_finally;
        if (this.id_extends != null) {
            this.id_native = this.id_extends.Sb();
        }
        this.id_implements.id_class(rqn_3.Su, 1.0f, 1.0f);
        this.id_implements.id_goto(true);
        this.id_implements.sF();
        super.id_byte();
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public rMd_1(rba_3 rba_32, Class clazz, boolean bl, boolean bl2, Predicate predicate) {
        this.id_implements = rba_32;
        super(rba_32, clazz, 10, bl, bl2, predicate);
    }

    @Override
    public boolean id_class() {
        if (this.id_break > 0 && this.id_throws.Sa().nextInt(this.id_break) != 0) {
            return false;
        }
        for (UUID uUID : this.id_implements.sZ()) {
            iB_2 iB_22;
            an_3 an_32;
            if (uUID == null || !((rYB)this.id_implements.id_throws[7] instanceof rrEm_1) || !((an_32 = ((rrEm_1)((rYB)this.id_implements.id_throws[7])).id_break(uUID)) instanceof iB_2)) continue;
            this.id_extends = iB_22 = (iB_2)an_32;
            this.id_finally = iB_22.Sr();
            int n = iB_22.Sb();
            return n != this.id_native && this.id_class(this.id_finally, this.id_protected);
        }
        return false;
    }
}

