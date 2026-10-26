/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Reference2ReferenceOpenHashMap
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial;

import celestial.IF;
import celestial.IJ;
import celestial.Ik_1;
import celestial.fj_3;
import celestial.rpr_3;
import celestial.wK_2;
import celestial.xc_3;
import it.unimi.dsi.fastutil.objects.Reference2ReferenceOpenHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Predicate;
import org.apache.commons.lang3.tuple.Pair;

public class Ij_1
implements IJ {
    private final List<Pair<Predicate<xc_3>, IJ>> id_catch;
    protected final boolean id_class;
    protected final boolean id_break;
    protected final boolean id_byte;
    protected final fj_3 id_protected;
    protected final Ik_1 id_throws;
    protected final IF id_case;
    private final Map<xc_3, List<IJ>> id_private = new Reference2ReferenceOpenHashMap();

    @Override
    public boolean id_byte() {
        return this.id_byte;
    }

    public Ij_1(List<Pair<Predicate<xc_3>, IJ>> list) {
        this.id_catch = list;
        IJ iJ = (IJ)list.iterator().next().getRight();
        this.id_class = iJ.id_class();
        this.id_break = iJ.id_break();
        this.id_byte = iJ.id_byte();
        this.id_protected = iJ.id_throws();
        this.id_throws = iJ.id_case();
        this.id_case = iJ.id_catch();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public List<wK_2> id_class(xc_3 xc_32, rpr_3 rpr_32, Random random) {
        List<IJ> list;
        if (xc_32 == null) {
            return Collections.emptyList();
        }
        Object object = this.id_private;
        synchronized (object) {
            list = this.id_private.get(xc_32);
            if (list == null) {
                list = new ArrayList<IJ>(this.id_catch.size());
                for (Pair<Predicate<xc_3>, IJ> pair : this.id_catch) {
                    if (!((Predicate)pair.getLeft()).test(xc_32)) continue;
                    list.add((IJ)pair.getRight());
                }
                this.id_private.put(xc_32, list);
            }
        }
        object = new ArrayList();
        long l = random.nextLong();
        for (IJ iJ : list) {
            random.setSeed(l);
            object.addAll(iJ.id_class(xc_32, rpr_32, random));
        }
        return object;
    }

    @Override
    public boolean id_class() {
        return this.id_class;
    }

    @Override
    public boolean id_break() {
        return this.id_break;
    }

    @Override
    public fj_3 id_throws() {
        return this.id_protected;
    }

    @Override
    public IF id_catch() {
        return this.id_case;
    }

    @Override
    public Ik_1 id_case() {
        return this.id_throws;
    }

    @Override
    public boolean id_protected() {
        return false;
    }
}

