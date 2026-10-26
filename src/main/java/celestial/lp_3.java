/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package celestial;

import celestial.HU;
import celestial.Ig_1;
import celestial.Qr_1;
import celestial.fJ_2;
import celestial.rCt_1;
import celestial.rHE;
import celestial.rHq_1;
import celestial.rqO_2;
import celestial.rxL_2;
import celestial.ryO_2;
import celestial.ryQ_2;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class lp_3 {
    public static final rqO_2 id_class = new rqO_2("textures/atlas/shulker_boxes.png");
    public static final rqO_2 id_break = new rqO_2("textures/atlas/beds.png");
    public static final rqO_2 id_byte = new rqO_2("textures/atlas/banner_patterns.png");
    public static final rqO_2 id_protected = new rqO_2("textures/atlas/shield_patterns.png");
    public static final rqO_2 id_throws = new rqO_2("textures/atlas/signs.png");
    public static final rqO_2 id_case = new rqO_2("textures/atlas/chest.png");
    private static final HU id_else = HU.id_protected(id_class);
    private static final HU id_synchronized = HU.id_break(id_break);
    private static final HU id_return = HU.id_extends(id_byte);
    private static final HU id_public = HU.id_extends(id_protected);
    private static final HU id_goto = HU.id_protected(id_throws);
    private static final HU id_while = HU.id_byte(id_case);
    private static final HU id_try = HU.id_break(fJ_2.id_class);
    private static final HU id_instanceof = HU.id_byte(fJ_2.id_class);
    private static final HU id_throw = HU.id_case(fJ_2.id_class);
    private static final HU id_interface = HU.id_catch(fJ_2.id_class);
    public static final Ig_1 id_catch = new Ig_1(id_class, new rqO_2("entity/shulker/shulker"));
    public static final List<Ig_1> id_private = (List)Stream.of("white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black").map(string -> new Ig_1(id_class, new rqO_2("entity/shulker/shulker_" + string))).collect(ImmutableList.toImmutableList());
    public static final Map<Qr_1, Ig_1> id_implements = Qr_1.id_class().collect(Collectors.toMap(Function.identity(), lp_3::id_class));
    public static final Ig_1[] id_finally = (Ig_1[])Arrays.stream(rxL_2.values()).sorted(Comparator.comparingInt(rxL_2::id_break)).map(rxL_22 -> new Ig_1(id_break, new rqO_2("entity/bed/" + rxL_22.id_byte()))).toArray(Ig_1[]::new);
    public static final Ig_1 id_extends = lp_3.id_class("trapped");
    public static final Ig_1 id_native = lp_3.id_class("trapped_left");
    public static final Ig_1 id_volatile = lp_3.id_class("trapped_right");
    public static final Ig_1 id_final = lp_3.id_class("christmas");
    public static final Ig_1 id_package = lp_3.id_class("christmas_left");
    public static final Ig_1 id_int = lp_3.id_class("christmas_right");
    public static final Ig_1 id_new = lp_3.id_class("normal");
    public static final Ig_1 id_continue = lp_3.id_class("normal_left");
    public static final Ig_1 id_super = lp_3.id_class("normal_right");
    public static final Ig_1 id_this = lp_3.id_class("ender");

    public static HU id_byte() {
        return id_synchronized;
    }

    private static Ig_1 id_class(rCt_1 rCt_12, Ig_1 ig_1, Ig_1 ig_12, Ig_1 ig_13) {
        switch (rCt_12) {
            case LEFT: {
                return ig_12;
            }
            case RIGHT: {
                return ig_13;
            }
        }
        return ig_1;
    }

    public static Ig_1 id_class(ryO_2 ryO_22, rCt_1 rCt_12, boolean bl) {
        if (bl) {
            return lp_3.id_class(rCt_12, id_final, id_package, id_int);
        }
        if (ryO_22 instanceof ryQ_2) {
            return lp_3.id_class(rCt_12, id_extends, id_native, id_volatile);
        }
        return ryO_22 instanceof rHq_1 ? id_this : lp_3.id_class(rCt_12, id_new, id_continue, id_super);
    }

    private static Ig_1 id_class(String string) {
        return new Ig_1(id_case, new rqO_2("entity/chest/" + string));
    }

    public static HU id_class() {
        return id_return;
    }

    public static Ig_1 id_class(Qr_1 qr_1) {
        return new Ig_1(id_throws, new rqO_2("entity/signs/" + qr_1.id_break()));
    }

    public static void id_class(Consumer<Ig_1> consumer) {
        consumer.accept(id_catch);
        id_private.forEach(consumer);
        for (rHE rHE2 : rHE.values()) {
            consumer.accept(new Ig_1(id_byte, rHE2.id_class(true)));
            consumer.accept(new Ig_1(id_protected, rHE2.id_class(false)));
        }
        id_implements.values().forEach(consumer);
        for (Ig_1 ig_1 : id_finally) {
            consumer.accept(ig_1);
        }
        consumer.accept(id_extends);
        consumer.accept(id_native);
        consumer.accept(id_volatile);
        consumer.accept(id_final);
        consumer.accept(id_package);
        consumer.accept(id_int);
        consumer.accept(id_new);
        consumer.accept(id_continue);
        consumer.accept(id_super);
        consumer.accept(id_this);
    }

    public static HU id_break() {
        return id_public;
    }

    public static HU id_throws() {
        return id_goto;
    }

    public static HU id_finally() {
        return id_interface;
    }

    public static HU id_catch() {
        return id_try;
    }

    public static HU id_case() {
        return id_while;
    }

    public static HU id_implements() {
        return id_throw;
    }

    public static HU id_protected() {
        return id_else;
    }

    public static HU id_private() {
        return id_instanceof;
    }
}

