package celestial;

public class rsh_3 {
   public static final rsh_3 id_class = id_class("kebab", 16, 16);
   public static final rsh_3 id_break = id_class("aztec", 16, 16);
   public static final rsh_3 id_byte = id_class("alban", 16, 16);
   public static final rsh_3 id_protected = id_class("aztec2", 16, 16);
   public static final rsh_3 id_throws = id_class("bomb", 16, 16);
   public static final rsh_3 id_case = id_class("plant", 16, 16);
   public static final rsh_3 id_catch = id_class("wasteland", 16, 16);
   public static final rsh_3 id_private = id_class("pool", 32, 16);
   public static final rsh_3 id_implements = id_class("courbet", 32, 16);
   public static final rsh_3 id_finally = id_class("sea", 32, 16);
   public static final rsh_3 id_extends = id_class("sunset", 32, 16);
   public static final rsh_3 id_native = id_class("creebet", 32, 16);
   public static final rsh_3 id_volatile = id_class("wanderer", 16, 32);
   public static final rsh_3 id_final = id_class("graham", 16, 32);
   public static final rsh_3 id_package = id_class("match", 32, 32);
   public static final rsh_3 id_int = id_class("bust", 32, 32);
   public static final rsh_3 id_new = id_class("stage", 32, 32);
   public static final rsh_3 id_continue = id_class("void", 32, 32);
   public static final rsh_3 id_super = id_class("skull_and_roses", 32, 32);
   public static final rsh_3 id_this = id_class("wither", 32, 32);
   public static final rsh_3 id_else = id_class("fighters", 64, 32);
   public static final rsh_3 id_synchronized = id_class("pointer", 64, 64);
   public static final rsh_3 id_return = id_class("pigscene", 64, 64);
   public static final rsh_3 id_public = id_class("burning_skull", 64, 64);
   public static final rsh_3 id_goto = id_class("skeleton", 64, 48);
   public static final rsh_3 id_while = id_class("donkey_kong", 64, 48);
   private final int id_try;
   private final int id_instanceof;

   public rsh_3(int var1, int var2) {
      this.id_try = var1;
      this.id_instanceof = var2;
   }

   private static rsh_3 id_class(String var0, int var1, int var2) {
      return rVL.id_class(rVL.P, var0, new rsh_3(var1, var2));
   }

   public int id_class() {
      return this.id_try;
   }

   public int id_break() {
      return this.id_instanceof;
   }
}
