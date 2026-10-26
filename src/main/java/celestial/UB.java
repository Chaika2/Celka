/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.Dw_1;
import celestial.OR;
import celestial.Ot_1;
import celestial.US;
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
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UB {
    private static final Logger id_class = LogManager.getLogger();
    private final rdb_3 id_break;
    private final int id_byte;
    private final List<String> id_protected = Lists.newArrayList();
    private final Map<Character, rkg_3> id_throws = Maps.newLinkedHashMap();
    private final Ot_1 id_case = Ot_1.id_class();
    private String id_catch;

    public UB(rpL_2 rpL_22, int n) {
        this.id_break = rpL_22.id_case();
        this.id_byte = n;
    }

    public static UB id_class(rpL_2 rpL_22) {
        return UB.id_class(rpL_22, 1);
    }

    public UB id_class(String string, hr_3 hr_32) {
        this.id_case.id_class(string, hr_32);
        return this;
    }

    public void id_class(Consumer<Dw_1> consumer) {
        this.id_class(consumer, rVL.id_for.id_break(this.id_break));
    }

    public void id_class(Consumer<Dw_1> consumer, String string) {
        rqO_2 rqO_22 = rVL.id_for.id_break(this.id_break);
        if (new rqO_2(string).equals(rqO_22)) {
            throw new IllegalStateException("Shaped Recipe " + string + " should remove its 'save' argument");
        }
        this.id_class(consumer, new rqO_2(string));
    }

    public void id_class(Consumer<Dw_1> consumer, rqO_2 rqO_22) {
        this.id_class(rqO_22);
        this.id_case.id_class(new rqO_2("recipes/root")).id_class("has_the_recipe", XD.id_class(rqO_22)).id_class(OR.id_class(rqO_22)).id_class(hS_2.id_break);
        consumer.accept(new US(this, rqO_22, this.id_break, this.id_byte, this.id_catch == null ? "" : this.id_catch, this.id_protected, this.id_throws, this.id_case, new rqO_2(rqO_22.id_byte(), "recipes/" + this.id_break.id_new().id_break() + "/" + rqO_22.id_break())));
    }

    private void id_class(rqO_2 rqO_22) {
        if (this.id_protected.isEmpty()) {
            throw new IllegalStateException("No pattern is defined for shaped recipe " + rqO_22 + "!");
        }
        HashSet hashSet = Sets.newHashSet(this.id_throws.keySet());
        hashSet.remove(Character.valueOf(' '));
        for (String string : this.id_protected) {
            for (int i = 0; i < string.length(); ++i) {
                char c = string.charAt(i);
                if (!this.id_throws.containsKey(Character.valueOf(c)) && c != ' ') {
                    throw new IllegalStateException("Pattern in recipe " + rqO_22 + " uses undefined symbol '" + c + "'");
                }
                hashSet.remove(Character.valueOf(c));
            }
        }
        if (!hashSet.isEmpty()) {
            throw new IllegalStateException("Ingredients are defined but not used in pattern for recipe " + rqO_22);
        }
        if (this.id_protected.size() == 1 && this.id_protected.get(0).length() == 1) {
            throw new IllegalStateException("Shaped recipe " + rqO_22 + " only takes in a single item - should it be a shapeless recipe instead?");
        }
        if (this.id_case.id_byte().isEmpty()) {
            throw new IllegalStateException("No way of obtaining recipe " + rqO_22);
        }
    }

    public static UB id_class(rpL_2 rpL_22, int n) {
        return new UB(rpL_22, n);
    }

    public UB id_class(Character c, rlb_3<rdb_3> rlb_32) {
        return this.id_class(c, rkg_3.id_class(rlb_32));
    }

    public UB id_class(Character c, rpL_2 rpL_22) {
        return this.id_class(c, rkg_3.id_class(rpL_22));
    }

    public UB id_class(Character c, rkg_3 rkg_32) {
        if (this.id_throws.containsKey(c)) {
            throw new IllegalArgumentException("Symbol '" + c + "' is already defined!");
        }
        if (c.charValue() == ' ') {
            throw new IllegalArgumentException("Symbol ' ' (whitespace) is reserved and cannot be defined");
        }
        this.id_throws.put(c, rkg_32);
        return this;
    }

    public UB id_class(String string) {
        if (!this.id_protected.isEmpty() && string.length() != this.id_protected.get(0).length()) {
            throw new IllegalArgumentException("Pattern must be the same width on every line!");
        }
        this.id_protected.add(string);
        return this;
    }

    public UB id_break(String string) {
        this.id_catch = string;
        return this;
    }
}

