/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Dw_1;
import celestial.OR;
import celestial.Ot_1;
import celestial.Ub_1;
import celestial.XD;
import celestial.hS_2;
import celestial.hr_3;
import celestial.rVL;
import celestial.rdb_3;
import celestial.rkf_3;
import celestial.rkg_3;
import celestial.rpL_2;
import celestial.rqO_2;
import java.util.function.Consumer;

public class UG {
    private final rdb_3 id_class;
    private final rkg_3 id_break;
    private final int id_byte;
    private final Ot_1 id_protected = Ot_1.id_class();
    private String id_throws;
    private final rkf_3<?> id_case;

    public UG(rkf_3<?> rkf_32, rkg_3 rkg_32, rpL_2 rpL_22, int n) {
        this.id_case = rkf_32;
        this.id_class = rpL_22.id_case();
        this.id_break = rkg_32;
        this.id_byte = n;
    }

    public void id_class(Consumer<Dw_1> consumer, String string) {
        rqO_2 rqO_22 = rVL.id_for.id_break(this.id_class);
        if (new rqO_2(string).equals(rqO_22)) {
            throw new IllegalStateException("Single Item Recipe " + string + " should remove its 'save' argument");
        }
        this.id_class(consumer, new rqO_2(string));
    }

    public void id_class(Consumer<Dw_1> consumer, rqO_2 rqO_22) {
        this.id_class(rqO_22);
        this.id_protected.id_class(new rqO_2("recipes/root")).id_class("has_the_recipe", XD.id_class(rqO_22)).id_class(OR.id_class(rqO_22)).id_class(hS_2.id_break);
        consumer.accept(new Ub_1(rqO_22, this.id_case, this.id_throws == null ? "" : this.id_throws, this.id_break, this.id_class, this.id_byte, this.id_protected, new rqO_2(rqO_22.id_byte(), "recipes/" + this.id_class.id_new().id_break() + "/" + rqO_22.id_break())));
    }

    private void id_class(rqO_2 rqO_22) {
        if (this.id_protected.id_byte().isEmpty()) {
            throw new IllegalStateException("No way of obtaining recipe " + rqO_22);
        }
    }

    public UG id_class(String string, hr_3 hr_32) {
        this.id_protected.id_class(string, hr_32);
        return this;
    }

    public static UG id_class(rkg_3 rkg_32, rpL_2 rpL_22, int n) {
        return new UG(rkf_3.id_this, rkg_32, rpL_22, n);
    }

    public static UG id_class(rkg_3 rkg_32, rpL_2 rpL_22) {
        return new UG(rkf_3.id_this, rkg_32, rpL_22, 1);
    }
}

