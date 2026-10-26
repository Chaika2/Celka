package celestial;

import com.google.common.collect.Maps;
import java.util.Map;

public class Wt_1 extends xd_3 {
   private static final rpr_3[] else_ = rpr_3.values();
   public static final rCN volatile_ = rCT.void_;
   public static final rCN final_ = rCT.static_;
   public static final rCN package_ = rCT.import_;
   public static final rCN int_ = rCT.short_;
   public static final rCN new_ = rCT.long_;
   public static final rCN continue_ = rCT.float_;
   public static final Map<rpr_3, rCN> super_ = rqR_2.class_(Maps.newEnumMap(rpr_3.class), var0 -> {
      var0.put(rpr_3.NORTH, volatile_);
      var0.put(rpr_3.EAST, final_);
      var0.put(rpr_3.SOUTH, package_);
      var0.put(rpr_3.WEST, int_);
      var0.put(rpr_3.UP, new_);
      var0.put(rpr_3.DOWN, continue_);
   });
   protected final rjC_2[] this_;

   protected Wt_1(float var1, Jq_1 var2) {
      super(var2);
      this.this_ = this.class_(var1);
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return this.this_[this.private_(var1)];
   }

   private rjC_2[] class_(float var1) {
      float var2 = 0.5F - var1;
      float var3 = 0.5F + var1;
      rjC_2 var4 = xd_3.class_(
         (double)(var2 * 16.0F), (double)(var2 * 16.0F), (double)(var2 * 16.0F), (double)(var3 * 16.0F), (double)(var3 * 16.0F), (double)(var3 * 16.0F)
      );
      rjC_2[] var5 = new rjC_2[else_.length];

      for (int var6 = 0; var6 < else_.length; var6++) {
         rpr_3 var7 = else_[var6];
         var5[var6] = rjw_3.class_(
            0.5 + Math.min((double)(-var1), (double)var7.implements_() * 0.5),
            0.5 + Math.min((double)(-var1), (double)var7.finally_() * 0.5),
            0.5 + Math.min((double)(-var1), (double)var7.extends_() * 0.5),
            0.5 + Math.max((double)var1, (double)var7.implements_() * 0.5),
            0.5 + Math.max((double)var1, (double)var7.finally_() * 0.5),
            0.5 + Math.max((double)var1, (double)var7.extends_() * 0.5)
         );
      }

      rjC_2[] var10 = new rjC_2[64];

      for (int var11 = 0; var11 < 64; var11++) {
         rjC_2 var8 = var4;

         for (int var9 = 0; var9 < else_.length; var9++) {
            if ((var11 & 1 << var9) != 0) {
               var8 = rjw_3.class_(var8, var5[var9]);
            }
         }

         var10[var11] = var8;
      }

      return var10;
   }

   protected int private_(xc_3 var1) {
      int var2 = 0;

      for (int var3 = 0; var3 < else_.length; var3++) {
         if (var1.byte_(super_.get(else_[var3]))) {
            var2 |= 1 << var3;
         }
      }

      return var2;
   }

   @Override
   public boolean a_(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return false;
   }
}
