/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Dv_1;
import celestial.Dw_1;
import celestial.OR;
import celestial.Ot_1;
import celestial.XD;
import celestial.hS_2;
import celestial.hr_3;
import celestial.rVL;
import celestial.rdb_3;
import celestial.rkf_3;
import celestial.rkg_3;
import celestial.rkl_3;
import celestial.rpL_2;
import celestial.rqO_2;
import java.util.function.Consumer;

public class DZ {
    private final rdb_3 id_class;
    private final rkg_3 id_break;
    private final float id_byte;
    private final int id_protected;
    private final Ot_1 id_throws = Ot_1.id_class();
    private String id_case;
    private final rkl_3<?> id_catch;

    private DZ(rpL_2 rpL_22, rkg_3 rkg_32, float f, int n, rkl_3<?> rkl_32) {
        this.id_class = rpL_22.id_case();
        this.id_break = rkg_32;
        this.id_byte = f;
        this.id_protected = n;
        this.id_catch = rkl_32;
    }

    public void id_class(Consumer<Dw_1> consumer) {
        this.id_class(consumer, rVL.id_for.id_break(this.id_class));
    }

    public void id_class(Consumer<Dw_1> consumer, String string) {
        rqO_2 rqO_22 = new rqO_2(string);
        rqO_2 rqO_23 = rVL.id_for.id_break(this.id_class);
        if (rqO_22.equals(rqO_23)) {
            throw new IllegalStateException("Recipe " + rqO_22 + " should remove its 'save' argument");
        }
        this.id_class(consumer, rqO_22);
    }

    public void id_class(Consumer<Dw_1> consumer, rqO_2 rqO_22) {
        this.id_class(rqO_22);
        this.id_throws.id_class(new rqO_2("recipes/root")).id_class("has_the_recipe", XD.id_class(rqO_22)).id_class(OR.id_class(rqO_22)).id_class(hS_2.id_break);
        consumer.accept(new Dv_1(rqO_22, this.id_case == null ? "" : this.id_case, this.id_break, this.id_class, this.id_byte, this.id_protected, this.id_throws, new rqO_2(rqO_22.id_byte(), "recipes/" + this.id_class.id_new().id_break() + "/" + rqO_22.id_break()), this.id_catch));
    }

    private void id_class(rqO_2 rqO_22) {
        if (this.id_throws.id_byte().isEmpty()) {
            throw new IllegalStateException("No way of obtaining recipe " + rqO_22);
        }
    }

    public static DZ id_class(rkg_3 rkg_32, rpL_2 rpL_22, float f, int n, rkl_3<?> rkl_32) {
        return new DZ(rpL_22, rkg_32, f, n, rkl_32);
    }

    public static DZ id_class(rkg_3 rkg_32, rpL_2 rpL_22, float f, int n) {
        return DZ.id_class(rkg_32, rpL_22, f, n, rkf_3.id_new);
    }

    public DZ id_class(String string, hr_3 hr_32) {
        this.id_throws.id_class(string, hr_32);
        return this;
    }

    public static DZ id_break(rkg_3 rkg_32, rpL_2 rpL_22, float f, int n) {
        return DZ.id_class(rkg_32, rpL_22, f, n, rkf_3.id_int);
    }
}

