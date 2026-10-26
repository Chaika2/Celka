/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rjp_3;
import celestial.rpB_2;

public final class rjL_2
extends rjp_3 {
    private final rjp_3 id_protected;
    private final int id_throws;
    private final int id_case;
    private final int id_catch;
    private final int id_private;
    private final int id_implements;
    private final int id_finally;

    protected rjL_2(rjp_3 rjp_32, int n, int n2, int n3, int n4, int n5, int n6) {
        super(n4 - n, n5 - n2, n6 - n3);
        this.id_protected = rjp_32;
        this.id_throws = n;
        this.id_case = n2;
        this.id_catch = n3;
        this.id_private = n4;
        this.id_implements = n5;
        this.id_finally = n6;
    }

    @Override
    public int id_class(rpB_2 rpB_22) {
        return Math.max(0, this.id_protected.id_class(rpB_22) - rpB_22.id_class(this.id_throws, this.id_case, this.id_catch));
    }

    @Override
    public void id_class(int n, int n2, int n3, boolean bl, boolean bl2) {
        this.id_protected.id_class(this.id_throws + n, this.id_case + n2, this.id_catch + n3, bl, bl2);
    }

    @Override
    public boolean id_break(int n, int n2, int n3) {
        return this.id_protected.id_break(this.id_throws + n, this.id_case + n2, this.id_catch + n3);
    }

    @Override
    public int id_break(rpB_2 rpB_22) {
        return Math.min(rpB_22.id_class(this.id_private, this.id_implements, this.id_finally), this.id_protected.id_break(rpB_22) - rpB_22.id_class(this.id_throws, this.id_case, this.id_catch));
    }
}

