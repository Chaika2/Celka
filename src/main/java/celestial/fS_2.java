/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.util.Pair
 */
package celestial;

import celestial.IC;
import celestial.IJ;
import celestial.IU;
import celestial.IV;
import celestial.Id_1;
import celestial.Ig_1;
import celestial.Ix_1;
import celestial.fb_3;
import celestial.fj_3;
import celestial.rCF;
import celestial.rqO_2;
import celestial.xc_3;
import celestial.xd_3;
import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class fS_2
implements Id_1 {
    private final rCF<xd_3, xc_3> id_class;
    private final List<fb_3> id_break;

    public fS_2(rCF<xd_3, xc_3> rCF2, List<fb_3> list) {
        this.id_class = rCF2;
        this.id_break = list;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof fS_2)) {
            return false;
        }
        fS_2 fS_22 = (fS_2)object;
        return Objects.equals(this.id_class, fS_22.id_class) && Objects.equals(this.id_break, fS_22.id_break);
    }

    public int hashCode() {
        return Objects.hash(this.id_class, this.id_break);
    }

    @Override
    public Collection<Ig_1> id_class(Function<rqO_2, Id_1> function, Set<Pair<String, String>> set) {
        return this.id_class().stream().flatMap(fb_32 -> fb_32.id_class().id_class(function, set).stream()).collect(Collectors.toSet());
    }

    @Override
    public IJ id_class(IC iC, Function<Ig_1, fj_3> function, Ix_1 ix_1, rqO_2 rqO_22) {
        IV iV = new IV();
        for (fb_3 fb_32 : this.id_class()) {
            IJ iJ = fb_32.id_class().id_class(iC, function, ix_1, rqO_22);
            if (iJ == null) continue;
            iV.id_class(fb_32.id_class(this.id_class), iJ);
        }
        return iV.id_class();
    }

    public List<fb_3> id_class() {
        return this.id_break;
    }

    public Set<IU> id_break() {
        HashSet hashSet = Sets.newHashSet();
        for (fb_3 fb_32 : this.id_break) {
            hashSet.add(fb_32.id_class());
        }
        return hashSet;
    }

    @Override
    public Collection<rqO_2> id_throws() {
        return this.id_class().stream().flatMap(fb_32 -> fb_32.id_class().id_throws().stream()).collect(Collectors.toSet());
    }
}

