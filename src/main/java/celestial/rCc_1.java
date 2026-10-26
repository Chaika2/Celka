/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.rCu_1;
import celestial.rpr_3;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class rCc_1
extends rCu_1<rpr_3> {
    protected rCc_1(String string, Collection<rpr_3> collection) {
        super(string, rpr_3.class, collection);
    }

    public static rCc_1 id_class(String string, Collection<rpr_3> collection) {
        return new rCc_1(string, collection);
    }

    public static rCc_1 id_class(String string, rpr_3 ... rpr_3Array) {
        return rCc_1.id_class(string, Lists.newArrayList((Object[])rpr_3Array));
    }

    public static rCc_1 id_class(String string, Predicate<rpr_3> predicate) {
        return rCc_1.id_class(string, Arrays.stream(rpr_3.values()).filter(predicate).collect(Collectors.toList()));
    }
}

