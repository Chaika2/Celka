/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.Hash$Strategy
 *  it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet
 */
package celestial;

import celestial.HR;
import celestial.HU;
import celestial.Ha_1;
import celestial.He_1;
import celestial.Hi_1;
import celestial.jZ_2;
import celestial.rqO_2;
import celestial.rrWX;
import celestial.rrxL_2;
import celestial.yP_2;
import it.unimi.dsi.fastutil.Hash;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public final class yr_3
extends HU {
    private static final ObjectOpenCustomHashSet<yr_3> E = new ObjectOpenCustomHashSet((Hash.Strategy)yP_2.INSTANCE);
    public final Ha_1 G;
    public final int b;
    private final Optional<HU> M;
    private final boolean O;
    private Map<rqO_2, yr_3> h = new HashMap<rqO_2, yr_3>();

    @Override
    public rqO_2 id_float() {
        Optional<rqO_2> optional = this.G.id_class.id_protected();
        return !optional.isPresent() ? null : optional.get();
    }

    private yr_3(String string, jZ_2 jZ_22, int n, int n2, boolean bl, boolean bl2, Ha_1 ha_1) {
        super(string, jZ_22, n, n2, bl, bl2, () -> rrxL_2.id_class(ha_1.id_new), () -> rrxL_2.id_break(ha_1.id_new));
        this.G = ha_1;
        this.M = ha_1.id_int == He_1.AFFECTS_OUTLINE ? ha_1.id_class.id_protected().map(rqO_22 -> yr_3.id_class(rqO_22, ha_1.id_catch)) : Optional.empty();
        this.O = ha_1.id_int == He_1.IS_OUTLINE;
        this.b = rrWX.id_class(super.hashCode(), (Object)ha_1);
    }

    @Override
    public boolean equals(Object object) {
        return this == object;
    }

    @Override
    public String toString() {
        return this.id_class + ":RenderType[" + this.G + ", ]";
    }

    @Override
    public int hashCode() {
        return this.b;
    }

    public static yr_3 id_break(String string, jZ_2 jZ_22, int n, int n2, boolean bl, boolean bl2, Ha_1 ha_1) {
        return (yr_3)E.addOrGet((Object)new yr_3(string, jZ_22, n, n2, bl, bl2, ha_1));
    }

    @Override
    public Optional<HU> id_instanceof() {
        return this.M;
    }

    public yr_3 id_super(rqO_2 rqO_22) {
        if (rqO_22 == null) {
            return this;
        }
        Optional<rqO_2> optional = this.G.id_class.id_protected();
        if (!optional.isPresent()) {
            return this;
        }
        rqO_2 rqO_23 = optional.get();
        if (rqO_23 == null) {
            return this;
        }
        if (rqO_22.equals(rqO_23)) {
            return this;
        }
        yr_3 yr_32 = this.h.get(rqO_22);
        if (yr_32 == null) {
            Hi_1 hi_1 = this.G.id_break();
            hi_1.id_class(new HR(rqO_22, this.G.id_class.id_throws(), this.G.id_class.id_case()));
            Ha_1 ha_1 = hi_1.id_class(this.O);
            yr_32 = yr_3.id_class(this.id_class, this.id_while(), this.id_try(), this.id_goto(), this.id_interface(), this.id_throws(), ha_1);
            this.h.put(rqO_22, yr_32);
        }
        return yr_32;
    }

    @Override
    public boolean id_throw() {
        return this.O;
    }
}

