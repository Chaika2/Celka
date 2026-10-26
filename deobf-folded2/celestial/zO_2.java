package celestial;

import java.util.Random;

public class zO_2 extends xF_2 implements kX_2 {
   public static final rCm_1 id_volatile = rCT.d;
   protected static final rjC_2[] id_final = new rjC_2[]{
      xd_3.id_class(7.0, 0.0, 7.0, 9.0, 2.0, 9.0),
      xd_3.id_class(7.0, 0.0, 7.0, 9.0, 4.0, 9.0),
      xd_3.id_class(7.0, 0.0, 7.0, 9.0, 6.0, 9.0),
      xd_3.id_class(7.0, 0.0, 7.0, 9.0, 8.0, 9.0),
      xd_3.id_class(7.0, 0.0, 7.0, 9.0, 10.0, 9.0),
      xd_3.id_class(7.0, 0.0, 7.0, 9.0, 12.0, 9.0),
      xd_3.id_class(7.0, 0.0, 7.0, 9.0, 14.0, 9.0),
      xd_3.id_class(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private final zh_3 id_package;

   protected zO_2(zh_3 var1, Jq_1 var2) {
      super(var2);
      this.id_package = var1;
      this.id_extends(this.id_abstract.id_break().id_class(id_volatile, Integer.valueOf(0)));
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return id_final[var1.id_byte(id_volatile)];
   }

   @Override
   public boolean id_class(rRq_1 var1, rfH_2 var2, xc_3 var3, boolean var4) {
      return var3.id_byte(id_volatile) != 7;
   }

   @Override
   public void id_class(rrEm_1 var1, Random var2, rfH_2 var3, xc_3 var4) {
      int var5 = Math.min(7, var4.id_byte(id_volatile) + rfU_2.id_class(var1.id_int, 2, 5));
      xc_3 var6 = var4.id_class(id_volatile, Integer.valueOf(var5));
      var1.id_class(var3, var6, 2);
      if (var5 == 7) {
         var6.id_break(var1, var3, var1.id_int);
      }
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_volatile);
   }

   @Override
   public boolean id_class(rYB var1, Random var2, rfH_2 var3, xc_3 var4) {
      return true;
   }

   @Override
   public void id_class(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (var2.id_class(var3, 0) >= 9) {
         float var5 = dO_2.id_class(this, var2, var3);
         if (var4.nextInt((int)(25.0F / var5) + 1) == 0) {
            int var6 = var1.id_byte(id_volatile);
            if (var6 < 7) {
               var1 = var1.id_class(id_volatile, Integer.valueOf(var6 + 1));
               var2.id_class(var3, var1, 2);
            } else {
               rpr_3 var7 = rpb_3.HORIZONTAL.id_class(var4);
               rfH_2 var8 = var3.id_break(var7);
               xc_3 var9 = var2.id_byte(var8.id_break());
               if (var2.id_byte(var8).id_catch()
                  && (
                     var9.id_class(xu_3.PS)
                        || var9.id_class(xu_3.id_finally)
                        || var9.id_class(xu_3.id_extends)
                        || var9.id_class(xu_3.id_native)
                        || var9.id_class(xu_3.id_implements)
                  )) {
                  var2.id_break(var8, this.id_package.id_continue());
                  var2.id_break(var3, this.id_package.id_implements().id_continue().id_class(kE_2.p, var7));
               }
            }
         }
      }
   }

   @Override
   public rdn_3 id_class(rRq_1 var1, rfH_2 var2, xc_3 var3) {
      rdb_3 var4 = this.id_break();
      return var4 == null ? rdn_3.id_break : new rdn_3(var4);
   }

   protected rdb_3 id_break() {
      if (this.id_package == xu_3.Pg) {
         return rdy_3.Jk;
      } else {
         return this.id_package == xu_3.Bg ? rdy_3.JW : null;
      }
   }

   @Override
   protected boolean id_catch(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return var1.id_class(xu_3.PS);
   }

   public zh_3 id_implements() {
      return this.id_package;
   }
}
