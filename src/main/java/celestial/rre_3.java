/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 */
package celestial;

import celestial.iB_2;
import celestial.iC_2;
import celestial.il_3;
import celestial.rPZ;
import celestial.rPm_1;
import celestial.rTB;
import celestial.rrEm_1;
import celestial.rra_3;
import celestial.rri_3;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class rre_3<E extends iB_2>
extends rPm_1<E> {
    private final Set<il_3<?>> id_class;
    private final rra_3 id_byte;
    private final rri_3 id_protected;
    private final rTB<rPm_1<? super E>> id_throws = new rTB();

    @Override
    protected void id_byte(rrEm_1 rrEm_12, E e, long l) {
        this.id_throws.id_byte().filter(rPm_12 -> rPm_12.id_class() == rPZ.RUNNING).forEach(rPm_12 -> rPm_12.id_case(rrEm_12, e, l));
    }

    public rre_3(Map<il_3<?>, iC_2> map, Set<il_3<?>> set, rra_3 rra_32, rri_3 rri_32, List<Pair<rPm_1<? super E>, Integer>> list) {
        super(map);
        this.id_class = set;
        this.id_byte = rra_32;
        this.id_protected = rri_32;
        list.forEach(pair -> this.id_throws.id_class((rPm_1)pair.getFirst(), (Integer)pair.getSecond()));
    }

    @Override
    public String toString() {
        Set set = this.id_throws.id_byte().filter(rPm_12 -> rPm_12.id_class() == rPZ.RUNNING).collect(Collectors.toSet());
        return "(" + this.getClass().getSimpleName() + "): " + set;
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, E e, long l) {
        return this.id_throws.id_byte().filter(rPm_12 -> rPm_12.id_class() == rPZ.RUNNING).anyMatch(rPm_12 -> rPm_12.id_class(rrEm_12, e, l));
    }

    @Override
    protected boolean id_class(long l) {
        return false;
    }

    @Override
    protected void id_break(rrEm_1 rrEm_12, E e, long l) {
        this.id_throws.id_byte().filter(rPm_12 -> rPm_12.id_class() == rPZ.RUNNING).forEach(rPm_12 -> rPm_12.id_catch(rrEm_12, e, l));
        this.id_class.forEach(((iB_2)e).SF()::id_break);
    }

    @Override
    protected void id_protected(rrEm_1 rrEm_12, E e, long l) {
        this.id_byte.id_class(this.id_throws);
        this.id_protected.id_class(this.id_throws, rrEm_12, e, l);
    }
}

