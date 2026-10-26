package celestial;

import com.google.common.collect.ImmutableList;
import java.util.List;

public class vu_3 implements vN_2 {
   private final List<String> id_class;

   public vu_3(rdn_3 var1) {
      this.id_class = id_break(var1);
   }

   @Override
   public rgS_2 id_class(int var1) {
      String var2 = this.id_class.get(var1);

      try {
         rVi_1 var3 = rgB_2.id_class(var2);
         if (var3 != null) {
            return var3;
         }
      } catch (Exception var4) {
      }

      return rgS_2.id_protected(var2);
   }

   @Override
   public int id_class() {
      return this.id_class.size();
   }

   private static List<String> id_break(rdn_3 var0) {
      rcd_3 var1 = var0.id_package();
      return (List<String>)(var1 != null && rkZ_2.id_class(var1)
         ? vz_3.id_class(var1)
         : ImmutableList.of(rgB_2.id_class(new rgn_3("book.invalid.tag").id_class(rgF_2.DARK_RED))));
   }
}
