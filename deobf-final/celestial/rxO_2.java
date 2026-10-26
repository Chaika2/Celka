package celestial;

import java.util.List;
import org.apache.commons.lang3.Validate;

public class rxO_2 extends rku_3 {
   public rxL_2 byte_() {
      return ((JL)this.catch_()).break_();
   }

   public rxO_2(xd_3 var1, xd_3 var2, rdO_2 var3) {
      super(var1, var2, var3);
      Validate.isInstanceOf(JL.class, var1);
      Validate.isInstanceOf(JL.class, var2);
   }

   public static void class_(rdn_3 var0, List<rgP_2> var1) {
      rcd_3 var2 = var0.break_("BlockEntityTag");
      if (var2 != null && var2.throws_("Patterns")) {
         rcy_3 var3 = var2.protected_("Patterns", 10);

         for (int var4 = 0; var4 < var3.size() && var4 < 6; var4++) {
            rcd_3 var5 = var3.class_(var4);
            rxL_2 var6 = rxL_2.class_(var5.private_("Color"));
            rHE var7 = rHE.class_(var5.native_("Pattern"));
            if (var7 != null) {
               var1.add(new rgn_3("block.minecraft.banner." + var7.class_() + "." + var6.byte_()).class_(rgF_2.GRAY));
            }
         }
      }
   }

   @Override
   public void class_(rdn_3 var1, rYB var2, List<rgP_2> var3, VD var4) {
      class_(var1, var3);
   }
}
