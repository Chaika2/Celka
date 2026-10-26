/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrdD;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class rrkb_1 {
    private String id_class = null;
    private Map<String, String> id_break = new LinkedHashMap<String, String>();
    private Set<String> id_byte = new LinkedHashSet<String>();

    public Collection<String> id_byte() {
        return new LinkedHashSet<String>(this.id_byte);
    }

    public void id_byte(String string) {
        this.id_byte.remove(string);
    }

    public rrkb_1(String string) {
        this.id_class = string;
    }

    public void id_class(Collection<String> collection) {
        this.id_byte.addAll(collection);
    }

    public String id_class(String string) {
        return this.id_break.get(string);
    }

    public void id_class(String string, String string2) {
        this.id_break.put(string, string2);
    }

    public String id_class() {
        return this.id_class;
    }

    public void id_class(rrdD[] rrdDArray) {
        for (int i = 0; i < rrdDArray.length; ++i) {
            rrdD rrdD2 = rrdDArray[i];
            String string = rrdD2.id_class();
            String string2 = this.id_break.get(string);
            if (string2 == null) continue;
            rrdD2.id_break(string2);
        }
    }

    public void id_class(rrkb_1 rrkb_12) {
        if (rrkb_12 != null) {
            this.id_break.putAll(rrkb_12.id_break);
        }
    }

    public String[] id_break() {
        Set<String> set = this.id_break.keySet();
        return set.toArray(new String[set.size()]);
    }

    public void id_break(String string) {
        this.id_byte.add(string);
    }

    public boolean id_protected(String string) {
        return this.id_byte.contains(string);
    }
}

