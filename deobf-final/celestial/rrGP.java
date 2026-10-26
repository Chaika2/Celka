package celestial;

import com.mojang.serialization.Lifecycle;
import java.util.Set;

public interface rrGP {
   rcd_3 char_();

   rrSp_1 long_();

   Lifecycle float_();

   int interface_();

   rcd_3 class_(rVm_1 var1, rcd_3 var2);

   void class_(rcd_3 var1);

   void class_(rRO var1);

   void class_(rRl_1 var1);

   default void class_(Ko_1 var1) {
      var1.class_("Known server brands", () -> String.join(", ", this.while_()));
      var1.class_("Level was modded", () -> Boolean.toString(this.goto_()));
      var1.class_("Level storage version", () -> {
         int var1x = this.interface_();
         return String.format("0x%05X - %s", var1x, this.implements_(var1x));
      });
   }

   void class_(rTH var1);

   void class_(String var1, boolean var2);

   void break_(rcd_3 var1);

   rRu_1 finally_();

   rRO extends_();

   boolean goto_();

   boolean continue_();

   default String implements_(int var1) {
      switch (var1) {
         case 19132:
            return "McRegion";
         case 19133:
            return "Anvil";
         default:
            return "Unknown?";
      }
   }

   boolean implements_();

   rrGB instanceof_();

   rRl_1 new_();

   rYE throw_();

   rcd_3 try_();

   Set<String> while_();

   rTH public_();

   void protected_(boolean var1);

   rcd_3 abstract_();

   String volatile_();

   boolean native_();
}
