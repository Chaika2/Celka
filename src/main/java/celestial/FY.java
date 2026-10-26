/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.Aq_1;
import celestial.Aw_1;
import celestial.Fe_1;
import celestial.Fo_1;
import celestial.Lf_1;
import celestial.Lr_1;
import celestial.Ml_1;
import celestial.QY;
import celestial.cb_3;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

public class FY
extends Lf_1<Fo_1> {
    private final Fe_1 id_class;
    private final QY id_throws;
    private final List<Fo_1> id_case = Lists.newArrayList();
    private String id_catch;

    public FY(Fe_1 fe_1, QY qY, int n, int n2, int n3, int n4, int n5) {
        super(qY, n, n2, n3, n4, n5);
        this.id_class = fe_1;
        this.id_throws = qY;
        this.id_protected(false);
        this.id_throws(false);
    }

    public void id_class(Aw_1 aw_1, Lr_1 lr_1) {
        UUID uUID = aw_1.id_class().getId();
        for (Fo_1 fo_1 : this.id_case) {
            if (!fo_1.id_break().equals(uUID)) continue;
            fo_1.id_byte(false);
            return;
        }
        if ((lr_1 == Lr_1.ALL || this.id_throws.id_volatile().id_byte(uUID)) && (Strings.isNullOrEmpty((String)this.id_catch) || aw_1.id_class().getName().toLowerCase(Locale.ROOT).contains(this.id_catch))) {
            Fo_1 fo_1 = new Fo_1(this.id_throws, this.id_class, aw_1.id_class().getId(), aw_1.id_class().getName(), aw_1::id_case);
            this.id_break(fo_1);
            this.id_case.add(fo_1);
        }
    }

    @Override
    public void id_class(UUID uUID) {
        for (Fo_1 fo_1 : this.id_case) {
            if (!fo_1.id_break().equals(uUID)) continue;
            fo_1.id_byte(true);
            return;
        }
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        double d = this.id_throws.id_else().id_return();
        RenderSystem.enableScissor((int)((double)this.id_continue() * d), (int)((double)(this.id_package - this.id_new) * d), (int)((double)(this.id_protected() + 6) * d), (int)((double)(this.id_package - (this.id_package - this.id_new) - this.id_int - 4) * d));
        super.id_class(ml_1, n, n2, f);
        RenderSystem.disableScissor();
    }

    public void id_class(Collection<UUID> collection, double d) {
        this.id_case.clear();
        for (UUID uUID : collection) {
            Aw_1 aw_1 = ((Aq_1)((cb_3)this.id_throws.id_class[57]).id_break[0]).id_class(uUID);
            if (aw_1 == null) continue;
            this.id_case.add(new Fo_1(this.id_throws, this.id_class, aw_1.id_class().getId(), aw_1.id_class().getName(), aw_1::id_case));
        }
        this.id_implements();
        this.id_case.sort((fo_1, fo_12) -> fo_1.id_class().compareToIgnoreCase(fo_12.id_class()));
        this.id_class(this.id_case);
        this.id_class(d);
    }

    @Override
    public void id_class(String string) {
        this.id_catch = string;
    }

    private void id_implements() {
        if (this.id_catch != null) {
            this.id_case.removeIf(fo_1 -> !fo_1.id_class().toLowerCase(Locale.ROOT).contains(this.id_catch));
            this.id_class(this.id_case);
        }
    }

    public boolean id_private() {
        return this.id_case.isEmpty();
    }
}

