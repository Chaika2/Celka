package celestial;

import com.google.common.collect.Maps;
import java.util.Map;

public class WT extends xd_3 {
   private final xd_3 id_volatile;
   private static final Map<xd_3, xd_3> id_final = Maps.newIdentityHashMap();

   public WT(xd_3 var1, Jq_1 var2) {
      super(var2);
      this.id_volatile = var1;
      id_final.put(var1, this);
   }

   public static xc_3 id_class(xd_3 var0) {
      return id_final.get(var0).id_continue();
   }

   @Override
   public void id_class(xc_3 var1, rrEm_1 var2, rfH_2 var3, rdn_3 var4) {
      super.id_class(var1, var2, var3, var4);
      if (var2.B().id_break(rRu_1.id_case) && eA_2.id_class(eY_2.id_else, var4) == 0) {
         this.id_class(var2, var3);
      }
   }

   @Override
   public void id_class(rYB var1, rfH_2 var2, rRW var3) {
      if (var1 instanceof rrEm_1) {
         this.id_class((rrEm_1)var1, var2);
      }
   }

   private void id_class(rrEm_1 var1, rfH_2 var2) {
      rGZ var3 = aI_2.L.id_class(var1);
      var3.id_class((double)var2.b_() + 0.5, (double)var2.c_(), (double)var2.d_() + 0.5, 0.0F, 0.0F);
      var1.a_(var3);
      var3.id_float();
   }

   public xd_3 id_break() {
      return this.id_volatile;
   }

   public static boolean id_private(xc_3 var0) {
      return id_final.containsKey(var0.id_break());
   }
}
