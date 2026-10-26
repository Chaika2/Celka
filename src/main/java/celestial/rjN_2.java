/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public interface rjN_2 {
    public static final rjN_2 id_class = (bl, bl2) -> false;
    public static final rjN_2 id_break = (bl, bl2) -> !bl && !bl2;
    public static final rjN_2 id_byte = (bl, bl2) -> bl2 && !bl;
    public static final rjN_2 id_protected = (bl, bl2) -> !bl;
    public static final rjN_2 id_throws = (bl, bl2) -> bl && !bl2;
    public static final rjN_2 id_case = (bl, bl2) -> !bl2;
    public static final rjN_2 id_catch = (bl, bl2) -> bl != bl2;
    public static final rjN_2 id_private = (bl, bl2) -> !bl || !bl2;
    public static final rjN_2 id_implements = (bl, bl2) -> bl && bl2;
    public static final rjN_2 id_finally = (bl, bl2) -> bl == bl2;
    public static final rjN_2 id_extends = (bl, bl2) -> bl2;
    public static final rjN_2 id_native = (bl, bl2) -> !bl || bl2;
    public static final rjN_2 id_volatile = (bl, bl2) -> bl;
    public static final rjN_2 id_final = (bl, bl2) -> bl || !bl2;
    public static final rjN_2 id_package = (bl, bl2) -> bl || bl2;
    public static final rjN_2 id_int = (bl, bl2) -> true;

    public boolean apply(boolean var1, boolean var2);
}

