package celestial;

public class iq_3 {
   public static final iq_3 id_class = id_class("core");
   public static final iq_3 id_break = id_class("idle");
   public static final iq_3 id_byte = id_class("work");
   public static final iq_3 id_protected = id_class("play");
   public static final iq_3 id_throws = id_class("rest");
   public static final iq_3 id_case = id_class("meet");
   public static final iq_3 id_catch = id_class("panic");
   public static final iq_3 id_private = id_class("raid");
   public static final iq_3 id_implements = id_class("pre_raid");
   public static final iq_3 id_finally = id_class("hide");
   public static final iq_3 id_extends = id_class("fight");
   public static final iq_3 id_native = id_class("celebrate");
   public static final iq_3 id_volatile = id_class("admire_item");
   public static final iq_3 id_final = id_class("avoid");
   public static final iq_3 id_package = id_class("ride");
   private final String id_int;
   private final int id_new;

   private iq_3(String var1) {
      this.id_int = var1;
      this.id_new = var1.hashCode();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         iq_3 var2 = (iq_3)var1;
         return this.id_int.equals(var2.id_int);
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return this.id_class();
   }

   @Override
   public int hashCode() {
      return this.id_new;
   }

   public String id_class() {
      return this.id_int;
   }

   private static iq_3 id_class(String var0) {
      return rVL.id_class(rVL.z, var0, new iq_3(var0));
   }
}
