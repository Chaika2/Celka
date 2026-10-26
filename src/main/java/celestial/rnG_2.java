/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 */
package celestial;

import celestial.rAa_1;
import celestial.rFB;
import celestial.rFH;
import celestial.rFc_1;
import celestial.rhN_2;
import celestial.rnB_2;
import celestial.rnP_2;
import celestial.rnW_2;
import celestial.rnb_3;
import celestial.rns_3;
import celestial.ruS_2;
import celestial.rvM_2;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class rnG_2
extends rns_3 {
    private final rnW_2 id_class;
    private final Set<rnP_2> id_break = Sets.newHashSet();
    private Runnable[] id_byte = new Runnable[0];

    @Override
    public void id_byte(rnB_2 rnB_22) {
        super.id_byte(rnB_22);
        this.id_class.x().id_class(new rFc_1(rnB_22, 2));
        this.id_implements();
    }

    public rnG_2(rnW_2 rnW_22) {
        this.id_class = rnW_22;
    }

    @Override
    public boolean id_class(String string, rnB_2 rnB_22) {
        if (super.id_class(string, rnB_22)) {
            this.id_class.x().id_class(new rFc_1(rnB_22, Arrays.asList(string), 3));
            this.id_implements();
            return true;
        }
        return false;
    }

    @Override
    public void id_class(int n, rnP_2 rnP_22) {
        rnP_2 rnP_23 = this.id_class(n);
        super.id_class(n, rnP_22);
        if (rnP_23 != rnP_22 && rnP_23 != null) {
            if (this.id_extends(rnP_23) > 0) {
                this.id_class.x().id_class(new rvM_2(n, rnP_22));
            } else {
                this.id_finally(rnP_23);
            }
        }
        if (rnP_22 != null) {
            if (this.id_break.contains(rnP_22)) {
                this.id_class.x().id_class(new rvM_2(n, rnP_22));
            } else {
                this.id_private(rnP_22);
            }
        }
        this.id_implements();
    }

    @Override
    public void id_class(rAa_1 rAa_12) {
        super.id_class(rAa_12);
        if (this.id_break.contains(rAa_12.id_protected())) {
            this.id_class.x().id_class(new rFH(rnb_3.CHANGE, rAa_12.id_protected().id_break(), rAa_12.id_throws(), rAa_12.id_break()));
        }
        this.id_implements();
    }

    public void id_class(Runnable runnable) {
        this.id_byte = Arrays.copyOf(this.id_byte, this.id_byte.length + 1);
        this.id_byte[this.id_byte.length - 1] = runnable;
    }

    @Override
    public void id_break(rnB_2 rnB_22) {
        super.id_break(rnB_22);
        this.id_class.x().id_class(new rFc_1(rnB_22, 0));
        this.id_implements();
    }

    @Override
    public void id_break(String string, rnB_2 rnB_22) {
        super.id_break(string, rnB_22);
        this.id_class.x().id_class(new rFc_1(rnB_22, Arrays.asList(string), 4));
        this.id_implements();
    }

    @Override
    public void id_throws(rnP_2 rnP_22) {
        super.id_throws(rnP_22);
        if (this.id_break.contains(rnP_22)) {
            this.id_class.x().id_class(new rFB(rnP_22, 2));
        }
        this.id_implements();
    }

    public void id_finally(rnP_2 rnP_22) {
        List<ruS_2<?>> list = this.id_implements(rnP_22);
        for (rhN_2 rhN_22 : this.id_class.x().id_super()) {
            for (ruS_2<?> ruS_22 : list) {
                rhN_22.id_class.id_class(ruS_22);
            }
        }
        this.id_break.remove(rnP_22);
    }

    public List<ruS_2<?>> id_catch(rnP_2 rnP_22) {
        ArrayList arrayList = Lists.newArrayList();
        arrayList.add(new rFB(rnP_22, 0));
        for (int i = 0; i < 19; ++i) {
            if (this.id_class(i) != rnP_22) continue;
            arrayList.add(new rvM_2(i, rnP_22));
        }
        for (rAa_1 rAa_12 : this.id_class(rnP_22)) {
            arrayList.add(new rFH(rnb_3.CHANGE, rAa_12.id_protected().id_break(), rAa_12.id_throws(), rAa_12.id_break()));
        }
        return arrayList;
    }

    public int id_extends(rnP_2 rnP_22) {
        int n = 0;
        for (int i = 0; i < 19; ++i) {
            if (this.id_class(i) != rnP_22) continue;
            ++n;
        }
        return n;
    }

    @Override
    public void id_case(rnP_2 rnP_22) {
        super.id_case(rnP_22);
        if (this.id_break.contains(rnP_22)) {
            this.id_finally(rnP_22);
        }
        this.id_implements();
    }

    public List<ruS_2<?>> id_implements(rnP_2 rnP_22) {
        ArrayList arrayList = Lists.newArrayList();
        arrayList.add(new rFB(rnP_22, 1));
        for (int i = 0; i < 19; ++i) {
            if (this.id_class(i) != rnP_22) continue;
            arrayList.add(new rvM_2(i, rnP_22));
        }
        return arrayList;
    }

    protected void id_implements() {
        for (Runnable runnable : this.id_byte) {
            runnable.run();
        }
    }

    @Override
    public void id_implements(String string) {
        super.id_implements(string);
        this.id_class.x().id_class(new rFH(rnb_3.REMOVE, null, string, 0));
        this.id_implements();
    }

    @Override
    public void id_protected(rnP_2 rnP_22) {
        super.id_protected(rnP_22);
        this.id_implements();
    }

    @Override
    public void id_protected(String string, rnP_2 rnP_22) {
        super.id_protected(string, rnP_22);
        if (this.id_break.contains(rnP_22)) {
            this.id_class.x().id_class(new rFH(rnb_3.REMOVE, rnP_22.id_break(), string, 0));
        }
        this.id_implements();
    }

    @Override
    public void id_protected(rnB_2 rnB_22) {
        super.id_protected(rnB_22);
        this.id_class.x().id_class(new rFc_1(rnB_22, 1));
        this.id_implements();
    }

    public void id_private(rnP_2 rnP_22) {
        List<ruS_2<?>> list = this.id_catch(rnP_22);
        for (rhN_2 rhN_22 : this.id_class.x().id_super()) {
            for (ruS_2<?> ruS_22 : list) {
                rhN_22.id_class.id_class(ruS_22);
            }
        }
        this.id_break.add(rnP_22);
    }
}

