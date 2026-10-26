/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public final class UX {
    public static final UX id_class = UX.id_class("all");
    public static final UX id_break = UX.id_class("texture", id_class);
    public static final UX id_byte = UX.id_class("particle", id_break);
    public static final UX id_protected = UX.id_class("end", id_class);
    public static final UX id_throws = UX.id_class("bottom", id_protected);
    public static final UX id_case = UX.id_class("top", id_protected);
    public static final UX id_catch = UX.id_class("front", id_class);
    public static final UX id_private = UX.id_class("back", id_class);
    public static final UX id_implements = UX.id_class("side", id_class);
    public static final UX id_finally = UX.id_class("north", id_implements);
    public static final UX id_extends = UX.id_class("south", id_implements);
    public static final UX id_native = UX.id_class("east", id_implements);
    public static final UX id_volatile = UX.id_class("west", id_implements);
    public static final UX id_final = UX.id_class("up");
    public static final UX id_package = UX.id_class("down");
    public static final UX id_int = UX.id_class("cross");
    public static final UX id_new = UX.id_class("plant");
    public static final UX id_continue = UX.id_class("wall", id_class);
    public static final UX id_super = UX.id_class("rail");
    public static final UX id_this = UX.id_class("wool");
    public static final UX id_else = UX.id_class("pattern");
    public static final UX id_synchronized = UX.id_class("pane");
    public static final UX id_return = UX.id_class("edge");
    public static final UX id_public = UX.id_class("fan");
    public static final UX id_goto = UX.id_class("stem");
    public static final UX id_while = UX.id_class("upperstem");
    public static final UX id_try = UX.id_class("crop");
    public static final UX id_instanceof = UX.id_class("dirt");
    public static final UX id_throw = UX.id_class("fire");
    public static final UX id_interface = UX.id_class("lantern");
    public static final UX id_char = UX.id_class("platform");
    public static final UX id_abstract = UX.id_class("unsticky");
    public static final UX id_long = UX.id_class("torch");
    public static final UX id_float = UX.id_class("layer0");
    public static final UX id_void = UX.id_class("lit_log");
    private final String id_static;
    private final UX id_import;

    private UX(String string, UX uX) {
        this.id_static = string;
        this.id_import = uX;
    }

    public String toString() {
        return "#" + this.id_static;
    }

    private static UX id_class(String string) {
        return new UX(string, null);
    }

    public String id_class() {
        return this.id_static;
    }

    private static UX id_class(String string, UX uX) {
        return new UX(string, uX);
    }

    public UX id_break() {
        return this.id_import;
    }
}

