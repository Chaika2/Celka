/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package celestial;

import celestial.HC;
import celestial.HH;
import celestial.HK;
import celestial.HR;
import celestial.HT;
import celestial.HV;
import celestial.HY;
import celestial.He_1;
import celestial.Hf_1;
import celestial.Hg_1;
import celestial.Hi_1;
import celestial.Hn_1;
import celestial.Ho_1;
import celestial.Hp_1;
import celestial.Hq_1;
import celestial.Ht_1;
import celestial.Hw_1;
import celestial.Hy_1;
import celestial.rrWX;
import com.google.common.collect.ImmutableList;

public final class Ha_1 {
    public final HR id_class;
    private final Ho_1 id_break;
    private final Hp_1 id_byte;
    private final HV id_protected;
    private final HC id_throws;
    private final Hy_1 id_case;
    public final HH id_catch;
    private final Ht_1 id_private;
    private final Hf_1 id_implements;
    private final Hq_1 id_finally;
    private final HT id_extends;
    private final Hg_1 id_native;
    private final HY id_volatile;
    private final HK id_final;
    private final Hw_1 id_package;
    public final He_1 id_int;
    public final ImmutableList<Hn_1> id_new;

    public Ha_1(HR hR, Ho_1 ho_1, Hp_1 hp_1, HV hV, HC hC, Hy_1 hy_1, HH hH, Ht_1 ht_1, Hf_1 hf_1, Hq_1 hq_1, HT hT, Hg_1 hg_1, HY hY, HK hK, Hw_1 hw_1, He_1 he_1) {
        this.id_class = hR;
        this.id_break = ho_1;
        this.id_byte = hp_1;
        this.id_protected = hV;
        this.id_throws = hC;
        this.id_case = hy_1;
        this.id_catch = hH;
        this.id_private = ht_1;
        this.id_implements = hf_1;
        this.id_finally = hq_1;
        this.id_extends = hT;
        this.id_native = hg_1;
        this.id_volatile = hY;
        this.id_final = hK;
        this.id_package = hw_1;
        this.id_int = he_1;
        this.id_new = ImmutableList.of((Object)this.id_class, (Object)this.id_break, (Object)this.id_byte, (Object)this.id_protected, (Object)this.id_throws, (Object)this.id_case, (Object)this.id_catch, (Object)this.id_private, (Object)this.id_implements, (Object)this.id_finally, (Object)this.id_extends, (Object)this.id_native, (Object[])new Hn_1[]{this.id_volatile, this.id_final, this.id_package});
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            Ha_1 ha_1 = (Ha_1)object;
            return this.id_int == ha_1.id_int && this.id_new.equals(ha_1.id_new);
        }
        return false;
    }

    public String toString() {
        return "CompositeState[" + this.id_new + ", outlineProperty=" + this.id_int + "]";
    }

    public int hashCode() {
        return rrWX.id_class(this.id_new, (Object)this.id_int);
    }

    public static Hi_1 id_class() {
        return new Hi_1();
    }

    public Hi_1 id_break() {
        Hi_1 hi_1 = new Hi_1();
        hi_1.id_class(this.id_class);
        hi_1.id_class(this.id_break);
        hi_1.id_class(this.id_byte);
        hi_1.id_class(this.id_protected);
        hi_1.id_class(this.id_throws);
        hi_1.id_class(this.id_case);
        hi_1.id_class(this.id_catch);
        hi_1.id_class(this.id_private);
        hi_1.id_class(this.id_implements);
        hi_1.id_class(this.id_finally);
        hi_1.id_class(this.id_extends);
        hi_1.id_class(this.id_native);
        hi_1.id_class(this.id_volatile);
        hi_1.id_class(this.id_final);
        hi_1.id_class(this.id_package);
        return hi_1;
    }
}

