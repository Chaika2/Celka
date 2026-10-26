/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.CommandDispatcher
 */
package celestial;

import celestial.Oi_1;
import celestial.gf_3;
import celestial.gj_3;
import celestial.gt_3;
import celestial.gy_3;
import celestial.rAQ;
import celestial.rRu_1;
import celestial.rlb_3;
import celestial.rnW_2;
import celestial.rqO_2;
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class Oa_1 {
    private static final rqO_2 id_class = new rqO_2("tick");
    private static final rqO_2 id_break = new rqO_2("load");
    private final rnW_2 id_byte;
    private boolean id_protected;
    private final ArrayDeque<Oi_1> id_throws = new ArrayDeque();
    private final List<Oi_1> id_case = Lists.newArrayList();
    private final List<gt_3> id_catch = Lists.newArrayList();
    private boolean id_private;
    private rAQ id_implements;

    public void id_byte() {
        this.id_class(this.id_catch, id_class);
        if (this.id_private) {
            this.id_private = false;
            List<gt_3> list = this.id_implements.id_byte().id_break(id_break).id_class();
            this.id_class(list, id_break);
        }
    }

    public Oa_1(rnW_2 rnW_22, rAQ rAQ2) {
        this.id_byte = rnW_22;
        this.id_implements = rAQ2;
        this.id_break(rAQ2);
    }

    public int id_class() {
        return this.id_byte.D().id_byte(rRu_1.id_synchronized);
    }

    public Optional<gt_3> id_class(rqO_2 rqO_22) {
        return this.id_implements.id_class(rqO_22);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int id_class(gt_3 gt_32, gy_3 gy_32) {
        int n = this.id_class();
        if (this.id_protected) {
            if (this.id_throws.size() + this.id_case.size() < n) {
                this.id_case.add(new Oi_1(this, gy_32, new gf_3(gt_32)));
            }
            return 0;
        }
        try {
            int n2;
            this.id_protected = true;
            int n3 = 0;
            gj_3[] gj_3Array = gt_32.id_break();
            for (n2 = gj_3Array.length - 1; n2 >= 0; --n2) {
                this.id_throws.push(new Oi_1(this, gy_32, gj_3Array[n2]));
            }
            while (!this.id_throws.isEmpty()) {
                Oi_1 oi_1 = this.id_throws.removeFirst();
                oi_1.id_class(this.id_throws, n);
                if (!this.id_case.isEmpty()) {
                    Lists.reverse(this.id_case).forEach(this.id_throws::addFirst);
                    this.id_case.clear();
                }
                if (++n3 < n) continue;
                int n4 = n3;
                return n4;
            }
            n2 = n3;
            return n2;
        }
        finally {
            this.id_throws.clear();
            this.id_case.clear();
            this.id_protected = false;
        }
    }

    private void id_class(Collection<gt_3> collection, rqO_2 rqO_22) {
        for (gt_3 gt_32 : collection) {
            this.id_class(gt_32, this.id_protected());
        }
    }

    public void id_class(rAQ rAQ2) {
        this.id_implements = rAQ2;
        this.id_break(rAQ2);
    }

    public rlb_3<gt_3> id_break(rqO_2 rqO_22) {
        return this.id_implements.id_break(rqO_22);
    }

    private void id_break(rAQ rAQ2) {
        this.id_catch.clear();
        this.id_catch.addAll(rAQ2.id_byte().id_break(id_class).id_class());
        this.id_private = true;
    }

    public CommandDispatcher<gy_3> id_break() {
        return this.id_byte.f().id_class();
    }

    public Iterable<rqO_2> id_throws() {
        return this.id_implements.id_break().keySet();
    }

    public Iterable<rqO_2> id_case() {
        return this.id_implements.id_byte().id_break();
    }

    public gy_3 id_protected() {
        return this.id_byte.j().id_break(2).id_finally();
    }
}

