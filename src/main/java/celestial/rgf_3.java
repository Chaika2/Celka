/*
 * Decompiled with CFR 0.152.
 */
package celestial;

@FunctionalInterface
public interface rgf_3 {
    public static final rgf_3 id_class = (string, n) -> false;
    public static final rgf_3 id_break = (string, n) -> string.length() == n;

    public boolean shouldIgnore(String var1, int var2);
}

