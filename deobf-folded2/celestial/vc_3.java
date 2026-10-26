package celestial;

import com.google.common.collect.ImmutableList;
import java.util.List;

public class vc_3 implements vN_2 {
   private final List<String> id_class;

   public vc_3(rdn_3 var1) {
      this.id_class = id_break(var1);
   }

   @Override
   public rgS_2 id_class(int var1) {
      return rgS_2.id_protected(this.id_class.get(var1));
   }

   @Override
   public int id_class() {
      return this.id_class.size();
   }

   private static List<String> id_break(rdn_3 var0) {
      rcd_3 var1 = var0.id_package();
      return (List<String>)(var1 != null ? vz_3.id_class(var1) : ImmutableList.of());
   }
}
