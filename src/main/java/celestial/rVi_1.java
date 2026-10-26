/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgc_3;
import java.util.Collection;
import java.util.List;
import java.util.function.UnaryOperator;

public interface rVi_1
extends rgP_2 {
    public rVi_1 id_class(int var1, Collection<rgP_2> var2);

    default public rVi_1 id_class(UnaryOperator<rgc_3> unaryOperator) {
        this.id_class((rgc_3)unaryOperator.apply(this.id_class()));
        return this;
    }

    default public rVi_1 id_class(rgF_2 ... rgF_2Array) {
        this.id_class(this.id_class().id_class(rgF_2Array));
        return this;
    }

    default public rVi_1 id_class(rgF_2 rgF_22) {
        this.id_class(this.id_class().id_break(rgF_22));
        return this;
    }

    default public rVi_1 id_class(String string, String string2, boolean bl) {
        List<rgP_2> list = this.id_protected();
        if (list.isEmpty()) {
            String string3 = this.getString();
            if (!bl) {
                string3 = string3.toLowerCase();
            }
            return new rgN_2(string3.replace(string, string2)).id_class(this.id_class());
        }
        rVi_1 rVi_12 = this.id_throws();
        for (rgP_2 rgP_22 : list) {
            String string4 = rgP_22.getString();
            if (!bl) {
                string4 = string4.toLowerCase();
            }
            if (string4.contains(string)) {
                string4 = string4.replace(string, string2);
                rVi_12.id_class(new rgN_2(string4).id_class(rgP_22.id_class()));
                continue;
            }
            rVi_12.id_class(rgP_22);
        }
        return rVi_12;
    }

    public rVi_1 id_class(rgc_3 var1);

    public rVi_1 id_class(rgP_2 var1);

    public rVi_1 id_class(int var1, rgP_2 var2);

    default public rVi_1 id_break(String string) {
        return this.id_class(new rgN_2(string));
    }

    default public rVi_1 id_break(rgF_2 rgF_22) {
        this.id_class(this.id_class().id_break(rgF_22));
        return this;
    }

    default public rVi_1 id_break(rgc_3 rgc_32) {
        this.id_class(rgc_32.id_class(this.id_class()));
        return this;
    }
}

