package celestial;

public final class UX {
   public static final UX id_class = id_class("all");
   public static final UX id_break = id_class("texture", id_class);
   public static final UX id_byte = id_class("particle", id_break);
   public static final UX id_protected = id_class("end", id_class);
   public static final UX id_throws = id_class("bottom", id_protected);
   public static final UX id_case = id_class("top", id_protected);
   public static final UX id_catch = id_class("front", id_class);
   public static final UX id_private = id_class("back", id_class);
   public static final UX id_implements = id_class("side", id_class);
   public static final UX id_finally = id_class("north", id_implements);
   public static final UX id_extends = id_class("south", id_implements);
   public static final UX id_native = id_class("east", id_implements);
   public static final UX id_volatile = id_class("west", id_implements);
   public static final UX id_final = id_class("up");
   public static final UX id_package = id_class("down");
   public static final UX id_int = id_class("cross");
   public static final UX id_new = id_class("plant");
   public static final UX id_continue = id_class("wall", id_class);
   public static final UX id_super = id_class("rail");
   public static final UX id_this = id_class("wool");
   public static final UX id_else = id_class("pattern");
   public static final UX id_synchronized = id_class("pane");
   public static final UX id_return = id_class("edge");
   public static final UX id_public = id_class("fan");
   public static final UX id_goto = id_class("stem");
   public static final UX id_while = id_class("upperstem");
   public static final UX id_try = id_class("crop");
   public static final UX id_instanceof = id_class("dirt");
   public static final UX id_throw = id_class("fire");
   public static final UX id_interface = id_class("lantern");
   public static final UX id_char = id_class("platform");
   public static final UX id_abstract = id_class("unsticky");
   public static final UX id_long = id_class("torch");
   public static final UX id_float = id_class("layer0");
   public static final UX id_void = id_class("lit_log");
   private final String id_static;
   private final UX id_import;

   private UX(String var1, UX var2) {
      this.id_static = var1;
      this.id_import = var2;
   }

   @Override
   public String toString() {
      return "#" + this.id_static;
   }

   private static UX id_class(String var0) {
      return new UX(var0, (UX)null);
   }

   public String id_class() {
      return this.id_static;
   }

   private static UX id_class(String var0, UX var1) {
      return new UX(var0, var1);
   }

   public UX id_break() {
      return this.id_import;
   }
}
