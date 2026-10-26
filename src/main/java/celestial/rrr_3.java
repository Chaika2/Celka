/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.ay_3;
import celestial.iB_2;
import celestial.il_3;
import celestial.rrEm_1;
import java.util.Random;
import java.util.Set;

public abstract class rrr_3<E extends iB_2> {
    private static final Random id_class = new Random();
    private static final ay_3 id_break = new ay_3().id_class(16.0).id_break().id_protected();
    private static final ay_3 id_byte = new ay_3().id_class(16.0).id_break().id_protected().id_throws();
    private final int id_protected;
    private long id_throws;

    public rrr_3(int n) {
        this.id_protected = n;
        this.id_throws = id_class.nextInt(n);
    }

    public rrr_3() {
        this(20);
    }

    protected abstract void id_class(rrEm_1 var1, E var2);

    public abstract Set<il_3<?>> id_class();

    protected static boolean id_class(iB_2 iB_22, iB_2 iB_23) {
        return iB_22.SF().id_break(il_3.id_package, iB_23) ? id_byte.id_class(iB_22, iB_23) : id_break.id_class(iB_22, iB_23);
    }

    public final void id_break(rrEm_1 rrEm_12, E e) {
        if (--this.id_throws <= 0L) {
            this.id_throws = this.id_protected;
            this.id_class(rrEm_12, e);
        }
    }
}

