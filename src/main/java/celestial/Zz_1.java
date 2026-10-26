/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.ZJ;
import celestial.ZN;
import celestial.ZQ;
import celestial.ZW;
import celestial.Zx_1;
import celestial.jI_2;
import celestial.rRA;
import celestial.rRC;
import celestial.rRF;
import celestial.rRL;
import celestial.rRm_1;
import celestial.rRn_1;
import celestial.rRu_1;
import celestial.rVi_1;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rpl_3;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Zz_1
implements rRF {
    public final /* synthetic */ ZJ id_class;
    public final /* synthetic */ rRu_1 id_break;
    public final /* synthetic */ Map id_byte;
    public final /* synthetic */ ZW id_protected;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public Zz_1(ZW zW, ZJ zJ, rRu_1 rRu_12, Map map) {
        this.id_protected = zW;
        this.id_class = zJ;
        this.id_break = rRu_12;
        this.id_byte = map;
    }

    private <T extends rRC<T>> void id_class(rRA<T> rRA2, ZQ<T> zQ) {
        Object object;
        ImmutableList immutableList;
        rgn_3 rgn_32 = new rgn_3(rRA2.id_break());
        rVi_1 rVi_12 = new rgN_2(rRA2.id_class()).id_class(rgF_2.YELLOW);
        T t = this.id_break.id_class(rRA2);
        String string = ((rRC)t).id_break();
        rVi_1 rVi_13 = new rgn_3("editGamerule.default", new rgN_2(string)).id_class(rgF_2.GRAY);
        String string2 = rRA2.id_break() + ".description";
        if (jI_2.id_class(string2)) {
            ImmutableList.Builder builder = ImmutableList.builder().add((Object)rVi_12.id_catch());
            rgn_3 rgn_33 = new rgn_3(string2);
            this.id_protected.id_class.id_super.id_break(rgn_33, 150).forEach(arg_0 -> ((ImmutableList.Builder)builder).add(arg_0));
            immutableList = builder.add((Object)rVi_13.id_catch()).build();
            object = rgn_33.getString() + "\n" + rVi_13.getString();
        } else {
            immutableList = ImmutableList.of((Object)rVi_12.id_catch(), (Object)rVi_13.id_catch());
            object = rVi_13.getString();
        }
        this.id_byte.computeIfAbsent(rRA2.id_byte(), rRZ2 -> Maps.newHashMap()).put(rRA2, zQ.create(rgn_32, (List<rpl_3>)immutableList, (String)object, t));
    }

    @Override
    public void id_class(rRA<rRm_1> rRA2, rRn_1<rRm_1> rRn_12) {
        this.id_class(rRA2, (rgP_2 rgP_22, List<rpl_3> list, String string, T rRm_12) -> {
            ZJ zJ = this.id_protected.id_class;
            Objects.requireNonNull(zJ);
            return new Zx_1(zJ, rgP_22, list, string, (rRm_1)rRm_12);
        });
    }

    @Override
    public void id_break(rRA<rRL> rRA2, rRn_1<rRL> rRn_12) {
        this.id_class(rRA2, (rgP_2 rgP_22, List<rpl_3> list, String string, T rRL2) -> {
            ZJ zJ = this.id_protected.id_class;
            Objects.requireNonNull(zJ);
            return new ZN(zJ, rgP_22, list, string, (rRL)rRL2);
        });
    }
}

