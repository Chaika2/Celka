package celestial;

import com.google.common.collect.UnmodifiableIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;

public class dV_2 extends xd_3 implements kd_3 {
   public static final rCN id_volatile = Wt_1.id_volatile;
   public static final rCN id_final = Wt_1.id_final;
   public static final rCN id_package = Wt_1.id_package;
   public static final rCN id_int = Wt_1.id_int;
   public static final rCN id_new = rCT.id_throw;
   protected static final Map<rpr_3, rCN> id_continue = Wt_1.id_super
      .entrySet()
      .stream()
      .filter(var0 -> var0.getKey().id_final().id_protected())
      .collect(rqR_2.id_class());
   protected final rjC_2[] id_super;
   protected final rjC_2[] id_this;
   private final Object2IntMap<xc_3> id_else = new Object2IntOpenHashMap();

   protected dV_2(float var1, float var2, float var3, float var4, float var5, Jq_1 var6) {
      super(var6);
      this.id_super = this.id_class(var1, var2, var5, 0.0F, var5);
      this.id_this = this.id_class(var1, var2, var3, 0.0F, var4);
      UnmodifiableIterator var7 = this.id_abstract.id_class().iterator();

      while (var7.hasNext()) {
         xc_3 var8 = (xc_3)var7.next();
         this.id_private(var8);
      }
   }

   protected rjC_2[] id_class(float var1, float var2, float var3, float var4, float var5) {
      float var6 = 8.0F - var1;
      float var7 = 8.0F + var1;
      float var8 = 8.0F - var2;
      float var9 = 8.0F + var2;
      rjC_2 var10 = xd_3.id_class((double)var6, 0.0, (double)var6, (double)var7, (double)var3, (double)var7);
      rjC_2 var11 = xd_3.id_class((double)var8, (double)var4, 0.0, (double)var9, (double)var5, (double)var9);
      rjC_2 var12 = xd_3.id_class((double)var8, (double)var4, (double)var8, (double)var9, (double)var5, 16.0);
      rjC_2 var13 = xd_3.id_class(0.0, (double)var4, (double)var8, (double)var9, (double)var5, (double)var9);
      rjC_2 var14 = xd_3.id_class((double)var8, (double)var4, (double)var8, 16.0, (double)var5, (double)var9);
      rjC_2 var15 = rjw_3.id_class(var11, var14);
      rjC_2 var16 = rjw_3.id_class(var12, var13);
      rjC_2[] var17 = new rjC_2[]{
         rjw_3.id_class(),
         var12,
         var13,
         var16,
         var11,
         rjw_3.id_class(var12, var11),
         rjw_3.id_class(var13, var11),
         rjw_3.id_class(var16, var11),
         var14,
         rjw_3.id_class(var12, var14),
         rjw_3.id_class(var13, var14),
         rjw_3.id_class(var16, var14),
         var15,
         rjw_3.id_class(var12, var15),
         rjw_3.id_class(var13, var15),
         rjw_3.id_class(var16, var15)
      };

      for (int var18 = 0; var18 < 16; var18++) {
         var17[var18] = rjw_3.id_class(var10, var17[var18]);
      }

      return var17;
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpa_3 var2) {
      switch (var2) {
         case LEFT_RIGHT:
            return var1.id_class(id_volatile, var1.id_byte(id_package)).id_class(id_package, var1.id_byte(id_volatile));
         case FRONT_BACK:
            return var1.id_class(id_final, var1.id_byte(id_int)).id_class(id_int, var1.id_byte(id_final));
         default:
            return super.id_class(var1, var2);
      }
   }

   @Override
   public xc_3 id_class(xc_3 var1, rqd_3 var2) {
      switch (var2) {
         case CLOCKWISE_180:
            return var1.id_class(id_volatile, var1.id_byte(id_package))
               .id_class(id_final, var1.id_byte(id_int))
               .id_class(id_package, var1.id_byte(id_volatile))
               .id_class(id_int, var1.id_byte(id_final));
         case COUNTERCLOCKWISE_90:
            return var1.id_class(id_volatile, var1.id_byte(id_final))
               .id_class(id_final, var1.id_byte(id_package))
               .id_class(id_package, var1.id_byte(id_int))
               .id_class(id_int, var1.id_byte(id_volatile));
         case CLOCKWISE_90:
            return var1.id_class(id_volatile, var1.id_byte(id_int))
               .id_class(id_final, var1.id_byte(id_volatile))
               .id_class(id_package, var1.id_byte(id_final))
               .id_class(id_int, var1.id_byte(id_package));
         default:
            return var1;
      }
   }

   @Override
   public boolean id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return this.id_this[this.id_private(var1)];
   }

   private static int id_class(rpr_3 var0) {
      return 1 << var0.id_protected();
   }

   @Override
   public rjC_2 id_break(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return this.id_super[this.id_private(var1)];
   }

   @Override
   public rXE id_throws(xc_3 var1) {
      return var1.id_byte(id_new) ? rXG.id_byte.id_class(false) : super.id_throws(var1);
   }

   protected int id_private(xc_3 var1) {
      return this.id_else.computeIntIfAbsent(var1, var0 -> {
         int var1x = 0;
         if (var0.id_byte(id_volatile)) {
            var1x |= id_class(rpr_3.NORTH);
         }

         if (var0.id_byte(id_final)) {
            var1x |= id_class(rpr_3.EAST);
         }

         if (var0.id_byte(id_package)) {
            var1x |= id_class(rpr_3.SOUTH);
         }

         if (var0.id_byte(id_int)) {
            var1x |= id_class(rpr_3.WEST);
         }

         return var1x;
      });
   }

   @Override
   public boolean a_(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return !var1.id_byte(id_new);
   }
}
