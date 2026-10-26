package celestial;

import com.google.common.collect.ImmutableList;
import java.util.List;

public class vu_3 implements vN_2 {
   private final List<String> class_;

   public vu_3(rdn_3 var1) {
      this.class_ = break_(var1);
   }

   @Override
   public rgS_2 class_(int var1) {
      String var2 = this.class_.get(var1);

      try {
         rVi_1 var3 = rgB_2.class_(var2);
         if (var3 != null) {
            return var3;
         }
      } catch (Exception var4) {
      }

      return rgS_2.protected_(var2);
   }

   @Override
   public int class_() {
      return this.class_.size();
   }

   private static List<String> break_(rdn_3 var0) {
      rcd_3 var1 = var0.package_();
      return (List<String>)(var1 != null && rkZ_2.class_(var1)
         ? vz_3.class_(var1)
         : ImmutableList.of(rgB_2.class_(new rgn_3("book.invalid.tag").class_(rgF_2.DARK_RED))));
   }
}
