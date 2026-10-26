package celestial;

import com.google.common.collect.ImmutableList;
import java.util.List;

public class vc_3 implements vN_2 {
   private final List<String> class_;

   public vc_3(rdn_3 var1) {
      this.class_ = break_(var1);
   }

   @Override
   public rgS_2 class_(int var1) {
      return rgS_2.protected_(this.class_.get(var1));
   }

   @Override
   public int class_() {
      return this.class_.size();
   }

   private static List<String> break_(rdn_3 var0) {
      rcd_3 var1 = var0.package_();
      return (List<String>)(var1 != null ? vz_3.class_(var1) : ImmutableList.of());
   }
}
