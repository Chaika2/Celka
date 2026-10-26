/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Dw_1;
import celestial.OR;
import celestial.Ot_1;
import celestial.UO;
import celestial.XD;
import celestial.hS_2;
import celestial.hr_3;
import celestial.rdb_3;
import celestial.rkf_3;
import celestial.rkg_3;
import celestial.rqO_2;
import java.util.function.Consumer;

public class UM {
    private final rkg_3 id_class;
    private final rkg_3 id_break;
    private final rdb_3 id_byte;
    private final Ot_1 id_protected = Ot_1.id_class();
    private final rkf_3<?> id_throws;

    public UM(rkf_3<?> rkf_32, rkg_3 rkg_32, rkg_3 rkg_33, rdb_3 rdb_32) {
        this.id_throws = rkf_32;
        this.id_class = rkg_32;
        this.id_break = rkg_33;
        this.id_byte = rdb_32;
    }

    public void id_class(Consumer<Dw_1> consumer, String string) {
        this.id_class(consumer, new rqO_2(string));
    }

    public void id_class(Consumer<Dw_1> consumer, rqO_2 rqO_22) {
        this.id_class(rqO_22);
        this.id_protected.id_class(new rqO_2("recipes/root")).id_class("has_the_recipe", XD.id_class(rqO_22)).id_class(OR.id_class(rqO_22)).id_class(hS_2.id_break);
        consumer.accept(new UO(rqO_22, this.id_throws, this.id_class, this.id_break, this.id_byte, this.id_protected, new rqO_2(rqO_22.id_byte(), "recipes/" + this.id_byte.id_new().id_break() + "/" + rqO_22.id_break())));
    }

    private void id_class(rqO_2 rqO_22) {
        if (this.id_protected.id_byte().isEmpty()) {
            throw new IllegalStateException("No way of obtaining recipe " + rqO_22);
        }
    }

    public UM id_class(String string, hr_3 hr_32) {
        this.id_protected.id_class(string, hr_32);
        return this;
    }

    public static UM id_class(rkg_3 rkg_32, rkg_3 rkg_33, rdb_3 rdb_32) {
        return new UM(rkf_3.id_else, rkg_32, rkg_33, rdb_32);
    }
}

