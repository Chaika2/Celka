/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.google.common.collect.Sets$SetView
 */
package celestial;

import celestial.re_3;
import celestial.rnW_2;
import celestial.rqO_2;
import celestial.rrEm_1;
import celestial.rzC_2;
import celestial.rzZ_2;
import celestial.rzd_3;
import celestial.rzk_3;
import celestial.rzr_3;
import celestial.rzs_3;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class rzP_2 {
    private final rrEm_1 id_class;
    private final Map<rzd_3<?>, Object> id_break = Maps.newIdentityHashMap();
    private final Map<rqO_2, rzs_3> id_byte = Maps.newHashMap();
    private Random id_protected;
    private float id_throws;

    public rzP_2(rrEm_1 rrEm_12) {
        this.id_class = rrEm_12;
    }

    public <T> T id_class(rzd_3<T> rzd_32) {
        Object object = this.id_break.get(rzd_32);
        if (object == null) {
            throw new IllegalArgumentException("No parameter " + rzd_32);
        }
        return (T)object;
    }

    public rrEm_1 id_class() {
        return this.id_class;
    }

    public rzP_2 id_class(rqO_2 rqO_22, rzs_3 rzs_32) {
        rzs_3 rzs_33 = this.id_byte.put(rqO_22, rzs_32);
        if (rzs_33 != null) {
            throw new IllegalStateException("Duplicated dynamic drop '" + this.id_byte + "'");
        }
        return this;
    }

    public rzr_3 id_class(rzk_3 rzk_32) {
        Sets.SetView setView = Sets.difference(this.id_break.keySet(), rzk_32.id_break());
        if (!setView.isEmpty()) {
            throw new IllegalArgumentException("Parameters not allowed in this parameter set: " + (Set)setView);
        }
        Sets.SetView setView2 = Sets.difference(rzk_32.id_class(), this.id_break.keySet());
        if (!setView2.isEmpty()) {
            throw new IllegalArgumentException("Missing required parameters: " + (Set)setView2);
        }
        Random random = this.id_protected;
        if (random == null) {
            random = new Random();
        }
        rnW_2 rnW_22 = this.id_class(this.id_class);
        rzC_2 rzC_22 = this.id_class(rnW_22);
        rzZ_2 rzZ_22 = this.id_break(rnW_22);
        return new rzr_3(random, this.id_throws, this.id_class, rzC_22::id_class, rzZ_22::id_class, this.id_break, this.id_byte);
    }

    private rnW_2 id_class(rrEm_1 rrEm_12) {
        if (rrEm_12 == null) {
            return null;
        }
        return rrEm_12.id_const();
    }

    private rzC_2 id_class(rnW_2 rnW_22) {
        if (rnW_22 == null) {
            return re_3.id_byte();
        }
        return rnW_22.o();
    }

    public rzP_2 id_class(Random random) {
        this.id_protected = random;
        return this;
    }

    public rzP_2 id_class(long l) {
        if (l != 0L) {
            this.id_protected = new Random(l);
        }
        return this;
    }

    public rzP_2 id_class(float f) {
        this.id_throws = f;
        return this;
    }

    public <T> rzP_2 id_class(rzd_3<T> rzd_32, T t) {
        this.id_break.put(rzd_32, t);
        return this;
    }

    public rzP_2 id_class(long l, Random random) {
        this.id_protected = l == 0L ? random : new Random(l);
        return this;
    }

    private rzZ_2 id_break(rnW_2 rnW_22) {
        if (rnW_22 == null) {
            return re_3.id_class();
        }
        return rnW_22.K();
    }

    public <T> rzP_2 id_break(rzd_3<T> rzd_32, T t) {
        if (t == null) {
            this.id_break.remove(rzd_32);
        } else {
            this.id_break.put(rzd_32, t);
        }
        return this;
    }

    public <T> T id_break(rzd_3<T> rzd_32) {
        return (T)this.id_break.get(rzd_32);
    }
}

