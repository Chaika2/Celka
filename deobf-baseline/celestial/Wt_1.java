package celestial;

import com.google.common.collect.Maps;
import java.util.Map;

public class Wt_1 extends xd_3 {
   private static final rpr_3[] id_else = rpr_3.values();
   public static final rCN id_volatile = rCT.id_void;
   public static final rCN id_final = rCT.id_static;
   public static final rCN id_package = rCT.id_import;
   public static final rCN id_int = rCT.id_short;
   public static final rCN id_new = rCT.id_long;
   public static final rCN id_continue = rCT.id_float;
   public static final Map<rpr_3, rCN> id_super = rqR_2.id_class(Maps.newEnumMap(rpr_3.class), var0 -> {
      var0.put(rpr_3.NORTH, id_volatile);
      var0.put(rpr_3.EAST, id_final);
      var0.put(rpr_3.SOUTH, id_package);
      var0.put(rpr_3.WEST, id_int);
      var0.put(rpr_3.UP, id_new);
      var0.put(rpr_3.DOWN, id_continue);
   });
   protected final rjC_2[] id_this;

   protected Wt_1(float var1, Jq_1 var2) {
      super(var2);
      this.id_this = this.id_class(var1);
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return this.id_this[this.id_private(var1)];
   }

   private rjC_2[] id_class(float var1) {
      float var2 = 0.5F - var1;
      float var3 = 0.5F + var1;
      rjC_2 var4 = xd_3.id_class(
         (double)(var2 * 16.0F), (double)(var2 * 16.0F), (double)(var2 * 16.0F), (double)(var3 * 16.0F), (double)(var3 * 16.0F), (double)(var3 * 16.0F)
      );
      rjC_2[] var5 = new rjC_2[id_else.length];

      for (int var6 = 0; var6 < id_else.length; var6++) {
         rpr_3 var7 = id_else[var6];
         var5[var6] = rjw_3.id_class(
            0.5 + Math.min((double)(-var1), (double)var7.id_implements() * 0.5),
            0.5 + Math.min((double)(-var1), (double)var7.id_finally() * 0.5),
            0.5 + Math.min((double)(-var1), (double)var7.id_extends() * 0.5),
            0.5 + Math.max((double)var1, (double)var7.id_implements() * 0.5),
            0.5 + Math.max((double)var1, (double)var7.id_finally() * 0.5),
            0.5 + Math.max((double)var1, (double)var7.id_extends() * 0.5)
         );
      }

      rjC_2[] var10 = new rjC_2[64];

      for (int var11 = 0; var11 < 64; var11++) {
         rjC_2 var8 = var4;

         for (int var9 = 0; var9 < id_else.length; var9++) {
            if ((var11 & 1 << var9) != 0) {
               var8 = rjw_3.id_class(var8, var5[var9]);
            }
         }

         var10[var11] = var8;
      }

      return var10;
   }

   protected int id_private(xc_3 var1) {
      int var2 = 0;

      for (int var3 = 0; var3 < id_else.length; var3++) {
         if (var1.id_byte(id_super.get(id_else[var3]))) {
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
