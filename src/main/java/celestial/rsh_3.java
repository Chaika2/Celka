/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rVL;

public class rsh_3 {
    public static final rsh_3 id_class = rsh_3.id_class("kebab", 16, 16);
    public static final rsh_3 id_break = rsh_3.id_class("aztec", 16, 16);
    public static final rsh_3 id_byte = rsh_3.id_class("alban", 16, 16);
    public static final rsh_3 id_protected = rsh_3.id_class("aztec2", 16, 16);
    public static final rsh_3 id_throws = rsh_3.id_class("bomb", 16, 16);
    public static final rsh_3 id_case = rsh_3.id_class("plant", 16, 16);
    public static final rsh_3 id_catch = rsh_3.id_class("wasteland", 16, 16);
    public static final rsh_3 id_private = rsh_3.id_class("pool", 32, 16);
    public static final rsh_3 id_implements = rsh_3.id_class("courbet", 32, 16);
    public static final rsh_3 id_finally = rsh_3.id_class("sea", 32, 16);
    public static final rsh_3 id_extends = rsh_3.id_class("sunset", 32, 16);
    public static final rsh_3 id_native = rsh_3.id_class("creebet", 32, 16);
    public static final rsh_3 id_volatile = rsh_3.id_class("wanderer", 16, 32);
    public static final rsh_3 id_final = rsh_3.id_class("graham", 16, 32);
    public static final rsh_3 id_package = rsh_3.id_class("match", 32, 32);
    public static final rsh_3 id_int = rsh_3.id_class("bust", 32, 32);
    public static final rsh_3 id_new = rsh_3.id_class("stage", 32, 32);
    public static final rsh_3 id_continue = rsh_3.id_class("void", 32, 32);
    public static final rsh_3 id_super = rsh_3.id_class("skull_and_roses", 32, 32);
    public static final rsh_3 id_this = rsh_3.id_class("wither", 32, 32);
    public static final rsh_3 id_else = rsh_3.id_class("fighters", 64, 32);
    public static final rsh_3 id_synchronized = rsh_3.id_class("pointer", 64, 64);
    public static final rsh_3 id_return = rsh_3.id_class("pigscene", 64, 64);
    public static final rsh_3 id_public = rsh_3.id_class("burning_skull", 64, 64);
    public static final rsh_3 id_goto = rsh_3.id_class("skeleton", 64, 48);
    public static final rsh_3 id_while = rsh_3.id_class("donkey_kong", 64, 48);
    private final int id_try;
    private final int id_instanceof;

    public rsh_3(int n, int n2) {
        this.id_try = n;
        this.id_instanceof = n2;
    }

    private static rsh_3 id_class(String string, int n, int n2) {
        return rVL.id_class(rVL.P, string, new rsh_3(n, n2));
    }

    public int id_class() {
        return this.id_try;
    }

    public int id_break() {
        return this.id_instanceof;
    }
}

