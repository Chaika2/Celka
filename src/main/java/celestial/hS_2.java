/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.util.Collection;

public interface hS_2 {
    public static final hS_2 id_class = collection -> {
        String[][] stringArray = new String[collection.size()][];
        int n = 0;
        for (String string : collection) {
            stringArray[n++] = new String[]{string};
        }
        return stringArray;
    };
    public static final hS_2 id_break = collection -> new String[][]{collection.toArray(new String[0])};

    public String[][] createRequirements(Collection<String> var1);
}

