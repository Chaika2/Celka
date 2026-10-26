/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ComparisonChain
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Ordering
 */
package celestial;

import celestial.Aw_1;
import celestial.LE;
import celestial.LG;
import celestial.LS;
import celestial.Lb_1;
import celestial.Ml_1;
import celestial.QY;
import celestial.cY_2;
import celestial.ch_3;
import celestial.rRl_1;
import celestial.rgP_2;
import celestial.rgn_3;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import java.util.Collection;
import java.util.List;

public class LJ
implements LE,
LS {
    private static final Ordering<Aw_1> id_class = Ordering.from((aw_1, aw_12) -> ComparisonChain.start().compare((Comparable)aw_1.id_class().getId(), (Comparable)aw_12.id_class().getId()).result());
    private static final rgP_2 id_break = new rgn_3("spectatorMenu.teleport");
    private static final rgP_2 id_byte = new rgn_3("spectatorMenu.teleport.prompt");
    private final List<LS> id_protected = Lists.newArrayList();

    @Override
    public rgP_2 id_byte() {
        return id_break;
    }

    public LJ() {
        this(id_class.sortedCopy(QY.id_instanceof().id_void().id_throws()));
    }

    public LJ(Collection<Aw_1> collection) {
        for (Aw_1 aw_1 : id_class.sortedCopy(collection)) {
            if (aw_1.id_break() == rRl_1.SPECTATOR) continue;
            this.id_protected.add(new LG(aw_1.id_class()));
        }
    }

    @Override
    public void id_class(Ml_1 ml_1, float f, int n) {
        QY.id_instanceof().A().id_class(cY_2.id_class);
        ch_3.id_class(ml_1, 0, 0, 0.0f, 0.0f, 16, 16, 256, 256);
    }

    @Override
    public List<LS> id_class() {
        return this.id_protected;
    }

    @Override
    public void id_class(Lb_1 lb_1) {
        lb_1.id_class(this);
    }

    @Override
    public rgP_2 id_break() {
        return id_byte;
    }

    @Override
    public boolean id_protected() {
        return !this.id_protected.isEmpty();
    }
}

