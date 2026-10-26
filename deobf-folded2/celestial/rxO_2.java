package celestial;

import java.util.List;
import org.apache.commons.lang3.Validate;

public class rxO_2 extends rku_3 {
   public rxL_2 id_byte() {
      return ((JL)this.id_catch()).id_break();
   }

   public rxO_2(xd_3 var1, xd_3 var2, rdO_2 var3) {
      super(var1, var2, var3);
      Validate.isInstanceOf(JL.class, var1);
      Validate.isInstanceOf(JL.class, var2);
   }

   public static void id_class(rdn_3 var0, List<rgP_2> var1) {
      rcd_3 var2 = var0.id_break("BlockEntityTag");
      if (var2 != null && var2.id_throws("Patterns")) {
         rcy_3 var3 = var2.id_protected("Patterns", 10);

         for (int var4 = 0; var4 < var3.size() && var4 < 6; var4++) {
            rcd_3 var5 = var3.id_class(var4);
            rxL_2 var6 = rxL_2.id_class(var5.id_private("Color"));
            rHE var7 = rHE.id_class(var5.id_native("Pattern"));
            if (var7 != null) {
               var1.add(new rgn_3("block.minecraft.banner." + var7.id_class() + "." + var6.id_byte()).id_class(rgF_2.GRAY));
            }
         }
      }
   }

   @Override
   public void id_class(rdn_3 var1, rYB var2, List<rgP_2> var3, VD var4) {
      id_class(var1, var3);
   }
}
