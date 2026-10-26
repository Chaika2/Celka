package celestial;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;

public class riT_2 extends ral_3 {
   private static final List<rYf_1> id_else = ImmutableList.of(new rYf_1(aI_2.W, 1, 1, 1));

   @Override
   public List<rYf_1> id_byte() {
      return id_else;
   }

   public riT_2(Codec<rrrI> var1) {
      super(var1, 0, true, true);
   }

   protected boolean id_class(rKd_1 var1, rYY var2, long var3, rqm_3 var5, int var6, int var7, rYG var8, rfj_3 var9, rrrI var10) {
      int var11 = var6 >> 4;
      int var12 = var7 >> 4;
      var5.setSeed((long)(var11 ^ var12 << 4) ^ var3);
      var5.nextInt();
      return var5.nextInt(5) != 0 ? false : !this.id_class(var1, var3, var5, var6, var7);
   }

   private boolean id_class(rKd_1 var1, long var2, rqm_3 var4, int var5, int var6) {
      rrSI var7 = var1.id_break().id_class(rrrZ.id_new);
      if (var7 == null) {
         return false;
      } else {
         for (int var8 = var5 - 10; var8 <= var5 + 10; var8++) {
            for (int var9 = var6 - 10; var9 <= var6 + 10; var9++) {
               rfj_3 var10 = rrrZ.id_new.id_class(var7, var2, var4, var8, var9);
               if (var8 == var10.id_break && var9 == var10.id_byte) {
                  return true;
               }
            }
         }

         return false;
      }
   }
}
