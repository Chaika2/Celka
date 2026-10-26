/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package celestial;

import celestial.Id_1;
import celestial.fS_2;
import celestial.fb_3;
import celestial.rCF;
import celestial.rCZ;
import celestial.xc_3;
import celestial.xd_3;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class IH {
    private final List<Id_1> id_class;
    private final List<Object> id_break;

    public IH(List<Id_1> list, List<Object> list2) {
        this.id_class = list;
        this.id_break = list2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof IH)) {
            return false;
        }
        IH iH = (IH)object;
        return Objects.equals(this.id_class, iH.id_class) && Objects.equals(this.id_break, iH.id_break);
    }

    public int hashCode() {
        return 31 * this.id_class.hashCode() + this.id_break.hashCode();
    }

    private static List<Object> id_class(xc_3 xc_32, Collection<rCZ<?>> collection) {
        return (List)collection.stream().map(xc_32::id_byte).collect(ImmutableList.toImmutableList());
    }

    public static IH id_class(xc_3 xc_32, Id_1 id_1, Collection<rCZ<?>> collection) {
        List<Object> list = IH.id_class(xc_32, collection);
        return new IH((List<Id_1>)ImmutableList.of((Object)id_1), list);
    }

    public static IH id_class(xc_3 xc_32, fS_2 fS_22, Collection<rCZ<?>> collection) {
        rCF<xd_3, xc_3> rCF2 = xc_32.id_break().id_new();
        List list = (List)fS_22.id_class().stream().filter(fb_32 -> fb_32.id_class(rCF2).test(xc_32)).map(fb_3::id_class).collect(ImmutableList.toImmutableList());
        List<Object> list2 = IH.id_class(xc_32, collection);
        return new IH(list, list2);
    }
}

