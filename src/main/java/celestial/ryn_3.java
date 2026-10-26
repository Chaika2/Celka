/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rpB_2;
import celestial.ryF_2;

public final class ryn_3
extends ryF_2 {
    @Override
    public ryF_2 id_class() {
        return FORWARD;
    }

    @Override
    public rpB_2 id_class(rpB_2 rpB_22) {
        return AXES[Math.floorMod(rpB_22.ordinal() - 1, 3)];
    }

    @Override
    public int id_class(int n, int n2, int n3, rpB_2 rpB_22) {
        return rpB_22.id_class(n2, n3, n);
    }
}

