/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.rVi_1;
import celestial.rgP_2;
import celestial.rgX_2;
import celestial.rgc_3;
import celestial.rpl_3;
import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public abstract class rgZ_2
implements rVi_1 {
    protected final List<rgP_2> id_case = Lists.newArrayList();
    private rpl_3 id_byte = rpl_3.id_class;
    private rgX_2 id_protected;
    private rgc_3 id_throws = rgc_3.id_class;

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof rgZ_2)) {
            return false;
        }
        rgZ_2 rgZ_22 = (rgZ_2)object;
        return this.id_case.equals(rgZ_22.id_case) && Objects.equals(this.id_class(), rgZ_22.id_class());
    }

    public String toString() {
        return "BaseComponent{style=" + this.id_throws + ", siblings=" + this.id_case + "}";
    }

    public int hashCode() {
        return Objects.hash(this.id_class(), this.id_case);
    }

    @Override
    public rVi_1 id_class(rgc_3 rgc_32) {
        this.id_throws = rgc_32;
        return this;
    }

    @Override
    public rgc_3 id_class() {
        return this.id_throws;
    }

    @Override
    public rVi_1 id_class(int n, rgP_2 rgP_22) {
        this.id_case.add(n, rgP_22);
        return this;
    }

    @Override
    public rVi_1 id_class(int n, Collection<rgP_2> collection) {
        this.id_case.addAll(n, collection);
        return this;
    }

    @Override
    public rVi_1 id_class(rgP_2 rgP_22) {
        this.id_case.add(rgP_22);
        return this;
    }

    @Override
    public String id_break() {
        return "";
    }

    @Override
    public /* synthetic */ rVi_1 id_throws() {
        return this.id_finally();
    }

    public abstract rgZ_2 id_finally();

    @Override
    public rpl_3 id_catch() {
        rgX_2 rgX_22 = rgX_2.id_byte();
        if (this.id_protected != rgX_22) {
            this.id_byte = rgX_22.id_class(this);
            this.id_protected = rgX_22;
        }
        return this.id_byte;
    }

    @Override
    public final rVi_1 id_case() {
        rgZ_2 rgZ_22 = this.id_finally();
        rgZ_22.id_case.addAll(this.id_case);
        rgZ_22.id_class(this.id_throws);
        return rgZ_22;
    }

    @Override
    public List<rgP_2> id_protected() {
        return this.id_case;
    }
}

