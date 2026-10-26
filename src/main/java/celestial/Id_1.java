/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 */
package celestial;

import celestial.IC;
import celestial.IJ;
import celestial.Ig_1;
import celestial.Ix_1;
import celestial.fj_3;
import celestial.rqO_2;
import com.mojang.datafixers.util.Pair;
import java.util.Collection;
import java.util.Set;
import java.util.function.Function;

public interface Id_1 {
    public Collection<Ig_1> id_class(Function<rqO_2, Id_1> var1, Set<Pair<String, String>> var2);

    public IJ id_class(IC var1, Function<Ig_1, fj_3> var2, Ix_1 var3, rqO_2 var4);

    public Collection<rqO_2> id_throws();
}

