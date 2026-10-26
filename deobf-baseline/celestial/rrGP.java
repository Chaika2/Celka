package celestial;

import com.mojang.serialization.Lifecycle;
import java.util.Set;

public interface rrGP {
   rcd_3 id_char();

   rrSp_1 id_long();

   Lifecycle id_float();

   int id_interface();

   rcd_3 id_class(rVm_1 var1, rcd_3 var2);

   void id_class(rcd_3 var1);

   void id_class(rRO var1);

   void id_class(rRl_1 var1);

   default void id_class(Ko_1 var1) {
      var1.id_class("Known server brands", () -> String.join(", ", this.id_while()));
      var1.id_class("Level was modded", () -> Boolean.toString(this.id_goto()));
      var1.id_class("Level storage version", () -> {
         int var1x = this.id_interface();
         return String.format("0x%05X - %s", var1x, this.id_implements(var1x));
      });
   }

   void id_class(rTH var1);

   void id_class(String var1, boolean var2);

   void id_break(rcd_3 var1);

   rRu_1 id_finally();

   rRO id_extends();

   boolean id_goto();

   boolean id_continue();

   default String id_implements(int var1) {
      switch (var1) {
         case 19132:
            return "McRegion";
         case 19133:
            return "Anvil";
         default:
            return "Unknown?";
      }
   }

   boolean id_implements();

   rrGB id_instanceof();

   rRl_1 id_new();

   rYE id_throw();

   rcd_3 id_try();

   Set<String> id_while();

   rTH id_public();

   void id_protected(boolean var1);

   rcd_3 id_abstract();

   String id_volatile();

   boolean id_native();
}
