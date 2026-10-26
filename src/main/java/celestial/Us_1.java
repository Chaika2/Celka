/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.Dw_1;
import celestial.OR;
import celestial.Ot_1;
import celestial.UE;
import celestial.XD;
import celestial.hS_2;
import celestial.hr_3;
import celestial.rVL;
import celestial.rdb_3;
import celestial.rkg_3;
import celestial.rlb_3;
import celestial.rpL_2;
import celestial.rqO_2;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Consumer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Us_1 {
    private static final Logger id_class = LogManager.getLogger();
    private final rdb_3 id_break;
    private final int id_byte;
    private final List<rkg_3> id_protected = Lists.newArrayList();
    private final Ot_1 id_throws = Ot_1.id_class();
    private String id_case;

    public Us_1(rpL_2 rpL_22, int n) {
        this.id_break = rpL_22.id_case();
        this.id_byte = n;
    }

    public void id_class(Consumer<Dw_1> consumer, String string) {
        rqO_2 rqO_22 = rVL.id_for.id_break(this.id_break);
        if (new rqO_2(string).equals(rqO_22)) {
            throw new IllegalStateException("Shapeless Recipe " + string + " should remove its 'save' argument");
        }
        this.id_class(consumer, new rqO_2(string));
    }

    public void id_class(Consumer<Dw_1> consumer) {
        this.id_class(consumer, rVL.id_for.id_break(this.id_break));
    }

    public Us_1 id_class(String string) {
        this.id_case = string;
        return this;
    }

    public Us_1 id_class(String string, hr_3 hr_32) {
        this.id_throws.id_class(string, hr_32);
        return this;
    }

    public void id_class(Consumer<Dw_1> consumer, rqO_2 rqO_22) {
        this.id_class(rqO_22);
        this.id_throws.id_class(new rqO_2("recipes/root")).id_class("has_the_recipe", XD.id_class(rqO_22)).id_class(OR.id_class(rqO_22)).id_class(hS_2.id_break);
        consumer.accept(new UE(rqO_22, this.id_break, this.id_byte, this.id_case == null ? "" : this.id_case, this.id_protected, this.id_throws, new rqO_2(rqO_22.id_byte(), "recipes/" + this.id_break.id_new().id_break() + "/" + rqO_22.id_break())));
    }

    private void id_class(rqO_2 rqO_22) {
        if (this.id_throws.id_byte().isEmpty()) {
            throw new IllegalStateException("No way of obtaining recipe " + rqO_22);
        }
    }

    public Us_1 id_class(rkg_3 rkg_32, int n) {
        for (int i = 0; i < n; ++i) {
            this.id_protected.add(rkg_32);
        }
        return this;
    }

    public Us_1 id_class(rlb_3<rdb_3> rlb_32) {
        return this.id_class(rkg_3.id_class(rlb_32));
    }

    public static Us_1 id_class(rpL_2 rpL_22, int n) {
        return new Us_1(rpL_22, n);
    }

    public static Us_1 id_class(rpL_2 rpL_22) {
        return new Us_1(rpL_22, 1);
    }

    public Us_1 id_class(rkg_3 rkg_32) {
        return this.id_class(rkg_32, 1);
    }

    public Us_1 id_break(rpL_2 rpL_22) {
        return this.id_break(rpL_22, 1);
    }

    public Us_1 id_break(rpL_2 rpL_22, int n) {
        for (int i = 0; i < n; ++i) {
            this.id_class(rkg_3.id_class(rpL_22));
        }
        return this;
    }
}

