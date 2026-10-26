/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.an_3;
import celestial.rAa_1;
import celestial.rAi_1;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rgF_2;
import celestial.rgP_2;
import celestial.rhd_3;
import celestial.rnB_2;
import celestial.rnP_2;
import celestial.rnr_3;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class rns_3 {
    private final Map<String, rnP_2> id_class = Maps.newHashMap();
    private final Map<rAi_1, List<rnP_2>> id_break = Maps.newHashMap();
    private final Map<String, Map<rnP_2, rAa_1>> id_byte = Maps.newHashMap();
    private final rnP_2[] id_protected = new rnP_2[19];
    private final Map<String, rnB_2> id_throws = Maps.newHashMap();
    private final Map<String, rnB_2> id_case = Maps.newHashMap();
    private static String[] id_catch;

    public Collection<String> id_byte() {
        return Lists.newArrayList(this.id_byte.keySet());
    }

    public rnP_2 id_byte(String string) {
        return this.id_class.get(string);
    }

    public void id_byte(rnP_2 rnP_22) {
        this.id_class.remove(rnP_22.id_break());
        for (int i = 0; i < 19; ++i) {
            if (this.id_class(i) != rnP_22) continue;
            this.id_class(i, (rnP_2)null);
        }
        List<rnP_2> list = this.id_break.get(rnP_22.id_byte());
        if (list != null) {
            list.remove(rnP_22);
        }
        for (Map<rnP_2, rAa_1> map : this.id_byte.values()) {
            map.remove(rnP_22);
        }
        this.id_case(rnP_22);
    }

    public void id_byte(rnB_2 rnB_22) {
    }

    public void id_byte(String string, rnP_2 rnP_22) {
        if (rnP_22 == null) {
            Map<rnP_2, rAa_1> map = this.id_byte.remove(string);
            if (map != null) {
                this.id_implements(string);
            }
        } else {
            Map<rnP_2, rAa_1> map = this.id_byte.get(string);
            if (map != null) {
                rAa_1 rAa_12 = map.remove(rnP_22);
                if (map.size() < 1) {
                    Map<rnP_2, rAa_1> map2 = this.id_byte.remove(string);
                    if (map2 != null) {
                        this.id_implements(string);
                    }
                } else if (rAa_12 != null) {
                    this.id_protected(string, rnP_22);
                }
            }
        }
    }

    public boolean id_class(String string, rnB_2 rnB_22) {
        if (string.length() > 40) {
            throw new IllegalArgumentException("The player name '" + string + "' is too long!");
        }
        if (this.id_private(string) != null) {
            this.id_catch(string);
        }
        this.id_case.put(string, rnB_22);
        return rnB_22.id_case().add(string);
    }

    public void id_class(rnB_2 rnB_22) {
        try {
            this.id_throws.remove(rnB_22.id_class());
            for (String string : rnB_22.id_case()) {
                this.id_case.remove(string);
            }
            this.id_protected(rnB_22);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void id_class(int n, rnP_2 rnP_22) {
        this.id_protected[n] = rnP_22;
    }

    public rnP_2 id_class(int n) {
        return this.id_protected[n];
    }

    protected void id_class(rcy_3 rcy_32) {
        for (int i = 0; i < rcy_32.size(); ++i) {
            rcd_3 rcd_32 = rcy_32.id_class(i);
            rnP_2 rnP_22 = this.id_break(rcd_32.id_native("Objective"));
            String string = rcd_32.id_native("Name");
            if (string.length() > 40) {
                string = string.substring(0, 40);
            }
            rAa_1 rAa_12 = this.id_break(string, rnP_22);
            rAa_12.id_break(rcd_32.id_private("Score"));
            if (!rcd_32.id_throws("Locked")) continue;
            rAa_12.id_class(rcd_32.id_new("Locked"));
        }
    }

    public void id_class(an_3 an_32) {
        if (an_32 != null && !(an_32 instanceof rhd_3) && !an_32.BM()) {
            String string = an_32.rz();
            this.id_byte(string, null);
            this.id_catch(string);
        }
    }

    public void id_class(rAa_1 rAa_12) {
    }

    public Collection<rnP_2> id_class() {
        return this.id_class.values();
    }

    public boolean id_class(String string, rnP_2 rnP_22) {
        Map<rnP_2, rAa_1> map = this.id_byte.get(string);
        if (map == null) {
            return false;
        }
        rAa_1 rAa_12 = map.get(rnP_22);
        return rAa_12 != null;
    }

    public Collection<rAa_1> id_class(rnP_2 rnP_22) {
        ArrayList arrayList = Lists.newArrayList();
        for (Map<rnP_2, rAa_1> map : this.id_byte.values()) {
            rAa_1 rAa_12 = map.get(rnP_22);
            if (rAa_12 == null) continue;
            arrayList.add(rAa_12);
        }
        arrayList.sort(rAa_1.id_class);
        return arrayList;
    }

    public boolean id_class(String string) {
        return this.id_class.containsKey(string);
    }

    public final void id_class(rAi_1 rAi_12, String string, Consumer<rAa_1> consumer) {
        this.id_break.getOrDefault(rAi_12, Collections.emptyList()).forEach(rnP_22 -> consumer.accept(this.id_break(string, (rnP_2)rnP_22)));
    }

    public rnP_2 id_class(String string, rAi_1 rAi_13, rgP_2 rgP_22, rnr_3 rnr_32) {
        if (string.length() > 16) {
            throw new IllegalArgumentException("The objective name '" + string + "' is too long!");
        }
        if (this.id_class.containsKey(string)) {
            throw new IllegalArgumentException("An objective with the name '" + string + "' already exists!");
        }
        rnP_2 rnP_22 = new rnP_2(this, string, rAi_13, rgP_22, rnr_32);
        this.id_break.computeIfAbsent(rAi_13, rAi_12 -> Lists.newArrayList()).add(rnP_22);
        this.id_class.put(string, rnP_22);
        this.id_protected(rnP_22);
        return rnP_22;
    }

    public rAa_1 id_break(String string2, rnP_2 rnP_23) {
        if (string2.length() > 40) {
            throw new IllegalArgumentException("The player name '" + string2 + "' is too long!");
        }
        Map map = this.id_byte.computeIfAbsent(string2, string -> Maps.newHashMap());
        return map.computeIfAbsent(rnP_23, rnP_22 -> {
            rAa_1 rAa_12 = new rAa_1(this, (rnP_2)rnP_22, string2);
            rAa_12.id_break(0);
            return rAa_12;
        });
    }

    public static String id_break(int n) {
        rgF_2 rgF_22;
        switch (n) {
            case 0: {
                return "list";
            }
            case 1: {
                return "sidebar";
            }
            case 2: {
                return "belowName";
            }
        }
        if (n >= 3 && n <= 18 && (rgF_22 = rgF_2.id_class(n - 3)) != null && rgF_22 != rgF_2.RESET) {
            return "sidebar.team." + rgF_22.id_throws();
        }
        return null;
    }

    public void id_break(rnB_2 rnB_22) {
    }

    public rnP_2 id_break(String string) {
        return this.id_class.get(string);
    }

    public void id_break(String string, rnB_2 rnB_22) {
        if (this.id_private(string) == rnB_22) {
            this.id_case.remove(string);
            rnB_22.id_case().remove(string);
        }
    }

    public Collection<rAa_1> id_break(rnP_2 rnP_22) {
        ArrayList arrayList = Lists.newArrayList();
        for (Map<rnP_2, rAa_1> map : this.id_byte.values()) {
            rAa_1 rAa_12 = map.get(rnP_22);
            if (rAa_12 == null) continue;
            arrayList.add(rAa_12);
        }
        return arrayList;
    }

    public Collection<String> id_break() {
        return this.id_class.keySet();
    }

    public void id_throws(rnP_2 rnP_22) {
    }

    public Collection<rnB_2> id_throws() {
        return this.id_throws.values();
    }

    public rnB_2 id_throws(String string) {
        return this.id_throws.get(string);
    }

    public static int id_finally(String string) {
        String string2;
        rgF_2 rgF_22;
        if ("list".equalsIgnoreCase(string)) {
            return 0;
        }
        if ("sidebar".equalsIgnoreCase(string)) {
            return 1;
        }
        if ("belowName".equalsIgnoreCase(string)) {
            return 2;
        }
        if (string.startsWith("sidebar.team.") && (rgF_22 = rgF_2.id_break(string2 = string.substring("sidebar.team.".length()))) != null && rgF_22.id_class() >= 0) {
            return rgF_22.id_class() + 3;
        }
        return -1;
    }

    public static String[] id_catch() {
        if (id_catch == null) {
            id_catch = new String[19];
            for (int i = 0; i < 19; ++i) {
                rns_3.id_catch[i] = rns_3.id_break(i);
            }
        }
        return id_catch;
    }

    public boolean id_catch(String string) {
        rnB_2 rnB_22 = this.id_private(string);
        if (rnB_22 != null) {
            this.id_break(string, rnB_22);
            return true;
        }
        return false;
    }

    public rnB_2 id_case(String string) {
        if (string.length() > 16) {
            throw new IllegalArgumentException("The team name '" + string + "' is too long!");
        }
        rnB_2 rnB_22 = this.id_throws(string);
        if (rnB_22 != null) {
            throw new IllegalArgumentException("A team with the name '" + string + "' already exists!");
        }
        rnB_22 = new rnB_2(this, string);
        this.id_throws.put(string, rnB_22);
        this.id_break(rnB_22);
        return rnB_22;
    }

    public Map<String, rnB_2> id_case() {
        return this.id_case;
    }

    public void id_case(rnP_2 rnP_22) {
    }

    public void id_implements(String string) {
    }

    public Map<rnP_2, rAa_1> id_protected(String string) {
        HashMap hashMap = this.id_byte.get(string);
        if (hashMap == null) {
            hashMap = Maps.newHashMap();
        }
        return hashMap;
    }

    public Collection<String> id_protected() {
        return this.id_throws.keySet();
    }

    public void id_protected(String string, rnP_2 rnP_22) {
    }

    public void id_protected(rnB_2 rnB_22) {
    }

    public void id_protected(rnP_2 rnP_22) {
    }

    protected rcy_3 id_private() {
        rcy_3 rcy_32 = new rcy_3();
        this.id_byte.values().stream().map(Map::values).forEach(collection -> collection.stream().filter(rAa_12 -> rAa_12.id_protected() != null).forEach(rAa_12 -> {
            rcd_3 rcd_32 = new rcd_3();
            rcd_32.id_class("Name", rAa_12.id_throws());
            rcd_32.id_class("Objective", rAa_12.id_protected().id_break());
            rcd_32.id_break("Score", rAa_12.id_break());
            rcd_32.id_class("Locked", rAa_12.id_catch());
            rcy_32.add(rcd_32);
        }));
        return rcy_32;
    }

    public rnB_2 id_private(String string) {
        return this.id_case.get(string);
    }
}

