/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 */
package celestial;

import celestial.rlj_3;
import celestial.rrEm_1;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class rlR_2 {
    private static final Collection<rlj_3> id_class = Lists.newArrayList();
    private static final Set<String> id_break = Sets.newHashSet();
    private static final Map<String, Consumer<rrEm_1>> id_byte = Maps.newHashMap();
    private static final Collection<rlj_3> id_protected = Sets.newHashSet();

    public static Consumer<rrEm_1> id_byte(String string) {
        return id_byte.get(string);
    }

    public static Collection<rlj_3> id_byte() {
        return id_protected;
    }

    public static void id_class(rlj_3 rlj_32) {
        id_protected.add(rlj_32);
    }

    private static boolean id_class(rlj_3 rlj_32, String string) {
        return rlj_32.id_class().toLowerCase().startsWith(string.toLowerCase() + ".");
    }

    public static Collection<rlj_3> id_class() {
        return id_class;
    }

    public static Collection<rlj_3> id_class(String string) {
        return id_class.stream().filter(rlj_32 -> rlR_2.id_class(rlj_32, string)).collect(Collectors.toList());
    }

    public static boolean id_break(String string) {
        return id_break.contains(string);
    }

    public static Collection<String> id_break() {
        return id_break;
    }

    public static rlj_3 id_throws(String string) {
        Optional<rlj_3> optional = rlR_2.id_protected(string);
        if (!optional.isPresent()) {
            throw new IllegalArgumentException("Can't find the test function for " + string);
        }
        return optional.get();
    }

    public static void id_protected() {
        id_protected.clear();
    }

    public static Optional<rlj_3> id_protected(String string) {
        return rlR_2.id_class().stream().filter(rlj_32 -> rlj_32.id_class().equalsIgnoreCase(string)).findFirst();
    }
}

