/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 */
package celestial;

import celestial.IC;
import celestial.IJ;
import celestial.IK;
import celestial.Id_1;
import celestial.Ig_1;
import celestial.Ii_1;
import celestial.Ix_1;
import celestial.fj_3;
import celestial.rqO_2;
import com.mojang.datafixers.util.Pair;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IU
implements Id_1 {
    private final List<IK> id_class;

    public IU(List<IK> list) {
        this.id_class = list;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof IU) {
            IU iU = (IU)object;
            return this.id_class.equals(iU.id_class);
        }
        return false;
    }

    public int hashCode() {
        return this.id_class.hashCode();
    }

    @Override
    public IJ id_class(IC iC, Function<Ig_1, fj_3> function, Ix_1 ix_1, rqO_2 rqO_22) {
        if (this.id_class().isEmpty()) {
            return null;
        }
        Ii_1 ii_1 = new Ii_1();
        for (IK iK : this.id_class()) {
            IJ iJ = iC.id_class(iK.id_byte(), iK);
            ii_1.id_class(iJ, iK.id_protected());
        }
        return ii_1.id_class();
    }

    @Override
    public Collection<Ig_1> id_class(Function<rqO_2, Id_1> function, Set<Pair<String, String>> set) {
        return this.id_class().stream().map(IK::id_byte).distinct().flatMap(rqO_22 -> ((Id_1)function.apply((rqO_2)rqO_22)).id_class(function, set).stream()).collect(Collectors.toSet());
    }

    public List<IK> id_class() {
        return this.id_class;
    }

    @Override
    public Collection<rqO_2> id_throws() {
        return this.id_class().stream().map(IK::id_byte).collect(Collectors.toSet());
    }
}

