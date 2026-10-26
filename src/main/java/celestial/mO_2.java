/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.LZ;
import celestial.Ml_1;
import celestial.mb_3;
import celestial.mh_3;
import celestial.rdn_3;
import celestial.rfU_2;
import celestial.rgN_2;
import celestial.rkI_2;
import celestial.rkg_3;
import celestial.rkw_3;
import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Iterator;
import java.util.List;

public class mO_2
extends LZ
implements rkI_2<rkg_3> {
    public final rkw_3<?> id_case;
    private final boolean id_catch;
    protected final List<mh_3> id_class;
    public final /* synthetic */ mb_3 id_throws;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public mO_2(mb_3 mb_32, int n, int n2, rkw_3 rkw_32, boolean bl) {
        this.id_throws = mb_32;
        super(n, n2, 200, 20, rgN_2.id_byte);
        this.id_class = Lists.newArrayList();
        this.id_extends = 24;
        this.id_native = 24;
        this.id_case = rkw_32;
        this.id_catch = bl;
        this.id_class(rkw_32);
    }

    @Override
    public void id_class(Iterator<rkg_3> iterator, int n, int n2, int n3, int n4) {
        rdn_3[] rdn_3Array = iterator.next().id_class();
        if (rdn_3Array.length != 0) {
            this.id_class.add(new mh_3(this, 3 + n4 * 7, 3 + n3 * 7, rdn_3Array));
        }
    }

    protected void id_class(rkw_3<?> rkw_32) {
        this.id_class(3, 3, -1, rkw_32, rkw_32.id_class().iterator(), 0);
    }

    @Override
    public void id_break(Ml_1 ml_1, int n, int n2, float f) {
        int n3;
        RenderSystem.enableAlphaTest();
        this.id_throws.id_implements.A().id_class(mb_3.id_class);
        int n4 = 152;
        if (!this.id_catch) {
            n4 += 26;
        }
        int n5 = n3 = this.id_throws.id_volatile ? 130 : 78;
        if (this.B_()) {
            n3 += 26;
        }
        this.id_break(ml_1, this.id_volatile, this.id_final, n4, n3, this.id_extends, this.id_native);
        for (mh_3 mh_32 : this.id_class) {
            RenderSystem.pushMatrix();
            float f2 = 0.42f;
            int n6 = (int)((float)(this.id_volatile + mh_32.id_break) / 0.42f - 3.0f);
            int n7 = (int)((float)(this.id_final + mh_32.id_byte) / 0.42f - 3.0f);
            RenderSystem.scalef(0.42f, 0.42f, 1.0f);
            this.id_throws.id_implements.id_float().id_class(mh_32.id_class[rfU_2.id_protected(this.id_throws.id_native / 30.0f) % mh_32.id_class.length], n6, n7);
            RenderSystem.popMatrix();
        }
        RenderSystem.disableAlphaTest();
    }
}

