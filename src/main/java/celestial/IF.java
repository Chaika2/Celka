/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.IC;
import celestial.IJ;
import celestial.IZ;
import celestial.Id_1;
import celestial.If_1;
import celestial.Ig_1;
import celestial.fj_3;
import celestial.gm_3;
import celestial.iB_2;
import celestial.rdn_3;
import celestial.rqO_2;
import celestial.rrbU_2;
import celestial.rrbb_3;
import celestial.we_3;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class IF {
    public static final IF id_class = new IF();
    private final List<IZ> id_byte = Lists.newArrayList();
    private final List<IJ> id_protected;
    private rrbU_2 id_throws;
    public static rqO_2 id_break = null;

    public IF(IC iC, Id_1 id_1, Function<rqO_2, Id_1> function, Function<Ig_1, fj_3> function2, List<IZ> list) {
        this.id_protected = list.stream().map(iZ -> {
            Id_1 id_12 = (Id_1)function.apply(iZ.id_class());
            return Objects.equals(id_12, id_1) ? null : iC.id_class(iZ.id_class(), If_1.X0_Y0, function2);
        }).collect(Collectors.toList());
        Collections.reverse(this.id_protected);
        for (int i = list.size() - 1; i >= 0; --i) {
            this.id_byte.add(list.get(i));
        }
        if (this.id_byte.size() > 65) {
            this.id_throws = rrbU_2.id_class(this.id_byte);
        }
    }

    public IF(IC iC, we_3 we_32, Function<rqO_2, Id_1> function, List<IZ> list) {
        this(iC, we_32, function, iC.id_protected()::id_class, list);
    }

    private IF() {
        this.id_protected = Collections.emptyList();
    }

    public ImmutableList<IZ> id_class() {
        return ImmutableList.copyOf(this.id_byte);
    }

    public IJ id_class(IJ iJ, rdn_3 rdn_32, gm_3 gm_32, iB_2 iB_22) {
        boolean bl = rrbb_3.rd();
        if (bl) {
            id_break = null;
        }
        if (!this.id_byte.isEmpty()) {
            Integer n;
            if (this.id_throws != null && (n = this.id_throws.id_class(rdn_32, gm_32, iB_22)) != null) {
                int n2 = n;
                if (n2 >= 0 && n2 < this.id_protected.size()) {
                    IJ iJ2;
                    if (bl) {
                        id_break = this.id_byte.get(n2).id_class();
                    }
                    if ((iJ2 = this.id_protected.get(n2)) != null) {
                        return iJ2;
                    }
                }
                return iJ;
            }
            for (int i = 0; i < this.id_byte.size(); ++i) {
                IZ iZ = this.id_byte.get(i);
                if (!iZ.id_class(rdn_32, gm_32, iB_22)) continue;
                IJ iJ3 = this.id_protected.get(i);
                if (bl) {
                    id_break = iZ.id_class();
                }
                if (this.id_throws != null) {
                    this.id_throws.id_class(rdn_32, gm_32, iB_22, i);
                }
                if (iJ3 == null) {
                    return iJ;
                }
                return iJ3;
            }
            if (this.id_throws != null) {
                this.id_throws.id_class(rdn_32, gm_32, iB_22, rrbU_2.id_class);
            }
        }
        return iJ;
    }
}

