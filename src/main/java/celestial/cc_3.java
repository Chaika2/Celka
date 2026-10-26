/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Ordering
 */
package celestial;

import celestial.Fb_1;
import celestial.Ml_1;
import celestial.cb_3;
import celestial.fC_2;
import celestial.fj_3;
import celestial.jI_2;
import celestial.rJr_1;
import celestial.rLK;
import celestial.rLR;
import celestial.rLY;
import celestial.rgP_2;
import celestial.rhz_3;
import com.google.common.collect.Ordering;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collection;
import java.util.List;

public abstract class cc_3<T extends rJr_1>
extends Fb_1<T> {
    protected boolean id_class;

    private void id_byte(Ml_1 ml_1, int n, int n2, Iterable<rLY> iterable) {
        int n3 = this.id_abstract;
        for (rLY rLY2 : iterable) {
            Object object = jI_2.id_class(rLY2.id_class().id_byte(), new Object[0]);
            if (rLY2.id_byte() >= 1 && rLY2.id_byte() <= 9) {
                object = (String)object + " " + jI_2.id_class("enchantment.level." + (rLY2.id_byte() + 1), new Object[0]);
            }
            this.id_super.id_class(ml_1, (String)object, (float)(n + 10 + 18), (float)(n3 + 6), 0xFFFFFF);
            String string = rLK.id_class(rLY2, 1.0f);
            this.id_super.id_class(ml_1, string, (float)(n + 10 + 18), (float)(n3 + 6 + 10), 0x7F7F7F);
            n3 += n2;
        }
    }

    public cc_3(T t, rhz_3 rhz_32, rgP_2 rgP_22) {
        super(t, rhz_32, rgP_22);
    }

    private void id_class(Ml_1 ml_1, int n, int n2, Iterable<rLY> iterable) {
        this.id_volatile.A().id_class(id_else);
        int n3 = this.id_abstract;
        for (rLY rLY2 : iterable) {
            RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
            this.id_break(ml_1, n, n3, 0, 166, 140, 32);
            n3 += n2;
        }
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        super.id_class(ml_1, n, n2, f);
        if (this.id_class) {
            this.id_break(ml_1);
        }
    }

    private void id_break(Ml_1 ml_1) {
        int n = this.id_char - 124;
        Collection<rLY> collection = ((cb_3)this.id_volatile.id_class[57]).So();
        if (!collection.isEmpty()) {
            RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
            int n2 = 33;
            if (collection.size() > 5) {
                n2 = 132 / (collection.size() - 1);
            }
            List list = Ordering.natural().sortedCopy(collection);
            this.id_class(ml_1, n, n2, list);
            this.id_break(ml_1, n, n2, list);
            this.id_byte(ml_1, n, n2, list);
        }
    }

    private void id_break(Ml_1 ml_1, int n, int n2, Iterable<rLY> iterable) {
        fC_2 fC_22 = this.id_volatile.id_abstract();
        int n3 = this.id_abstract;
        for (rLY rLY2 : iterable) {
            rLR rLR2 = rLY2.id_class();
            fj_3 fj_32 = fC_22.id_class(rLR2);
            this.id_volatile.A().id_class(fj_32.id_extends().id_protected());
            cc_3.id_class(ml_1, n + 6, n3 + 7, this.h_(), 18, 18, fj_32);
            n3 += n2;
        }
    }

    protected void id_throws() {
        this.id_class = !((cb_3)this.id_volatile.id_class[57]).So().isEmpty();
    }

    @Override
    protected void v_() {
        super.v_();
        this.id_throws();
    }
}

