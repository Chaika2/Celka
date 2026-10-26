package celestial;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;

public class riL_2 extends rrrZ<rUt_1> {
   private static final List<rYf_1> id_else = ImmutableList.of(new rYf_1(aI_2.id_abstract, 1, 2, 4));

   @Override
   public List<rYf_1> id_byte() {
      return id_else;
   }

   public riL_2(Codec<rUt_1> var1) {
      super(var1);
   }

   @Override
   public rrrv_1<rUt_1> id_class() {
      return riA_2::new;
   }

   protected boolean id_class(rKd_1 var1, rYY var2, long var3, rqm_3 var5, int var6, int var7, rYG var8, rfj_3 var9, rUt_1 var10) {
      for (rYG var12 : var2.id_class(var6 * 16 + 9, var1.id_case(), var7 * 16 + 9, 16)) {
         if (!var12.id_throws().id_class(this)) {
            return false;
         }
      }

      for (rYG var14 : var2.id_class(var6 * 16 + 9, var1.id_case(), var7 * 16 + 9, 29)) {
         if (var14.id_this() != rYh_1.OCEAN && var14.id_this() != rYh_1.RIVER) {
            return false;
         }
      }

      return true;
   }

   @Override
   protected boolean id_break() {
      return false;
   }
}
