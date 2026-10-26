/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 */
package celestial;

import celestial.LV;
import celestial.Ml_1;
import celestial.QY;
import celestial.jI_2;
import celestial.rCi_1;
import celestial.rlB_2;
import celestial.vT_2;
import celestial.vp_3;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;

public class vq_3
extends LV<vT_2> {
    public final /* synthetic */ vp_3 id_class;

    public vq_3(vp_3 vp_32, QY qY) {
        this.id_class = vp_32;
        super(qY, vp_32.id_package, vp_32.id_int, 32, vp_32.id_int - 64, 10);
        ObjectArrayList objectArrayList = new ObjectArrayList(rlB_2.id_implements.iterator());
        objectArrayList.sort(Comparator.comparing(rCi_12 -> jI_2.id_class(vp_3.id_class(rCi_12), new Object[0])));
        for (rCi_1 rCi_13 : objectArrayList) {
            this.id_break(new vT_2(this, rCi_13));
        }
    }

    @Override
    protected void id_class(Ml_1 ml_1) {
        this.id_class.id_class(ml_1);
    }
}

