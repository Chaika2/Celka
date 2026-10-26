/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rQA;
import celestial.rQC;
import celestial.rQH;
import celestial.rQJ;
import celestial.rQT;
import celestial.rQV;
import celestial.rQW;
import celestial.rQb_1;
import celestial.rQc_1;
import celestial.rQd_1;
import celestial.rQf_1;
import celestial.rQh_1;
import celestial.rQm_1;
import celestial.rQp_1;
import celestial.rQv_1;
import celestial.rQw_1;
import celestial.rQz_1;
import celestial.rVL;
import celestial.rWY;
import celestial.rWi_1;
import celestial.rqO_2;
import celestial.rzy_3;
import java.util.function.Predicate;

public class rQF {
    public static final rWi_1 id_class = rQF.id_class("inverted", new rQc_1());
    public static final rWi_1 id_break = rQF.id_class("alternative", new rQb_1());
    public static final rWi_1 id_byte = rQF.id_class("random_chance", new rQC());
    public static final rWi_1 id_protected = rQF.id_class("random_chance_with_looting", new rQH());
    public static final rWi_1 id_throws = rQF.id_class("entity_properties", new rQd_1());
    public static final rWi_1 id_case = rQF.id_class("killed_by_player", new rQm_1());
    public static final rWi_1 id_catch = rQF.id_class("entity_scores", new rQW());
    public static final rWi_1 id_private = rQF.id_class("block_state_property", new rQh_1());
    public static final rWi_1 id_implements = rQF.id_class("match_tool", new rQA());
    public static final rWi_1 id_finally = rQF.id_class("table_bonus", new rQw_1());
    public static final rWi_1 id_extends = rQF.id_class("survives_explosion", new rQT());
    public static final rWi_1 id_native = rQF.id_class("damage_source_properties", new rQJ());
    public static final rWi_1 id_volatile = rQF.id_class("location_check", new rQv_1());
    public static final rWi_1 id_final = rQF.id_class("weather_check", new rQV());
    public static final rWi_1 id_package = rQF.id_class("reference", new rQp_1());
    public static final rWi_1 id_int = rQF.id_class("time_check", new rQf_1());

    private static rWi_1 id_class(String string, rWY<? extends rQz_1> rWY2) {
        return rVL.id_class(rVL.c, new rqO_2(string), new rWi_1(rWY2));
    }

    public static Object id_class() {
        return rzy_3.id_class(rVL.c, "condition", "condition", rQz_1::id_break).id_class();
    }

    public static <T> Predicate<T> id_class(Predicate<T>[] predicateArray) {
        switch (predicateArray.length) {
            case 0: {
                return object -> true;
            }
            case 1: {
                return predicateArray[0];
            }
            case 2: {
                return predicateArray[0].and(predicateArray[1]);
            }
        }
        return object -> {
            for (Predicate predicate : predicateArray) {
                if (predicate.test(object)) continue;
                return false;
            }
            return true;
        };
    }

    public static <T> Predicate<T> id_break(Predicate<T>[] predicateArray) {
        switch (predicateArray.length) {
            case 0: {
                return object -> false;
            }
            case 1: {
                return predicateArray[0];
            }
            case 2: {
                return predicateArray[0].or(predicateArray[1]);
            }
        }
        return object -> {
            for (Predicate predicate : predicateArray) {
                if (!predicate.test(object)) continue;
                return true;
            }
            return false;
        };
    }
}

