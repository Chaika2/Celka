/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_throws;
import celestial.PB;
import celestial.QY;
import celestial.rVe_1;
import celestial.rVi_1;
import celestial.rgF_2;
import celestial.rgP_2;
import celestial.rrfu_3;
import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Stream;

public interface PP {
    public static final PP a_ = new PB();
    public static final QY b_ = QY.id_instanceof();

    default public void id_byte(String string) {
        if (!((Boolean)C_throws.id_break().Pp.id_class[0]).booleanValue()) {
            return;
        }
        this.c_(string, false);
    }

    default public void id_byte(String string, boolean bl) {
        if (((Boolean)C_throws.id_break().rX.id_class[0]).booleanValue()) {
            this.b_(string, bl);
        }
    }

    default public void id_class(rVi_1 ... rVi_1Array) {
        this.id_class((Boolean)C_throws.id_break().ro.id_class[0], rVi_1Array);
    }

    default public void id_class(String string2, rgF_2 rgF_22, boolean bl) {
        Stream.of(string2.split("\n")).forEach(string -> {
            rVe_1 rVe_12 = new rVe_1(string.replace("\t", "    "));
            rVe_12.id_class(rVe_12.id_class().id_class(rgF_22));
            this.id_class(bl, rVe_12);
        });
    }

    default public void id_class(String string, rgF_2 rgF_22) {
        this.id_class(string, rgF_22, (Boolean)C_throws.id_break().ro.id_class[0]);
    }

    default public void id_class(boolean bl, rVi_1 ... rVi_1Array) {
        rVe_1 rVe_12 = new rVe_1("");
        rVe_12.id_class(PP.id_throws(rVe_12.getString()));
        Arrays.asList(rVi_1Array).forEach(rVe_12::id_class);
        if (bl) {
            this.id_class(PP.id_throws(rVe_12.getString()), (rgP_2)rVe_12);
        } else {
            b_.execute(() -> ((Consumer)C_throws.id_break().id_implements.id_class[0]).accept(rVe_12));
        }
    }

    default public void id_class(rgP_2 rgP_22, rgP_2 rgP_23) {
    }

    public static rgP_2 id_throws(String string) {
        return rrfu_3.id_break(string).id_break();
    }

    default public void id_catch(String string) {
        this.b_(string, false);
    }

    default public void id_case(String string) {
        this.c_(string, (Boolean)C_throws.id_break().ro.id_class[0]);
    }

    default public void id_protected(String string) {
        this.id_byte(string, false);
    }

    default public void c_(String string, boolean bl) {
        this.id_class(string, rgF_2.GRAY, bl);
    }

    default public void b_(String string, boolean bl) {
        b_.execute(() -> ((BiConsumer)C_throws.id_break().Pu.id_class[0]).accept(string, bl));
    }
}

