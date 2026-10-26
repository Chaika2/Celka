package celestial;

import java.util.Random;

public class dO_2 extends xF_2 implements kX_2 {
   public static final rCm_1 id_final = rCT.d;
   private static final rjC_2[] id_volatile = new rjC_2[]{
      xd_3.id_class(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      xd_3.id_class(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      xd_3.id_class(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      xd_3.id_class(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      xd_3.id_class(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      xd_3.id_class(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      xd_3.id_class(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      xd_3.id_class(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   public xc_3 id_byte(int var1) {
      return this.id_continue().id_class(this.id_break(), Integer.valueOf(var1));
   }

   protected dO_2(Jq_1 var1) {
      super(var1);
      this.id_extends(this.id_abstract.id_break().id_class(this.id_break(), Integer.valueOf(0)));
   }

   @Override
   public rdn_3 id_class(rRq_1 var1, rfH_2 var2, xc_3 var3) {
      return new rdn_3(this.id_finally());
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, an_3 var4) {
      if (var4 instanceof rGx_1 && var2.B().id_break(rRu_1.id_break)) {
         var2.id_class(var3, true, var4);
      }

      super.id_class(var1, var2, var3, var4);
   }

   @Override
   public boolean id_class(xc_3 var1, rRR var2, rfH_2 var3) {
      return (var2.id_class(var3, 0) >= 8 || var2.id_case(var3)) && super.id_class(var1, var2, var3);
   }

   protected int id_class(rYB var1) {
      return rfU_2.id_class(var1.id_int, 2, 5);
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return id_volatile[var1.id_byte(this.id_break())];
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_final);
   }

   @Override
   public void id_class(rrEm_1 var1, Random var2, rfH_2 var3, xc_3 var4) {
      this.id_class((rYB)var1, var3, var4);
   }

   @Override
   public boolean id_class(rYB var1, Random var2, rfH_2 var3, xc_3 var4) {
      return true;
   }

   @Override
   public boolean id_class(rRq_1 var1, rfH_2 var2, xc_3 var3, boolean var4) {
      return !this.id_implements(var3);
   }

   protected static float id_class(xd_3 var0, rRq_1 var1, rfH_2 var2) {
      float var3 = 1.0F;
      rfH_2 var4 = var2.id_break();

      for (int var5 = -1; var5 <= 1; var5++) {
         for (int var6 = -1; var6 <= 1; var6++) {
            float var7 = 0.0F;
            xc_3 var8 = var1.id_byte(var4.id_break(var5, 0, var6));
            if (var8.id_class(xu_3.PS)) {
               var7 = 1.0F;
               if (var8.id_byte(dy_3.id_volatile) > 0) {
                  var7 = 3.0F;
               }
            }

            if (var5 != 0 || var6 != 0) {
               var7 /= 4.0F;
            }

            var3 += var7;
         }
      }

      rfH_2 var12 = var2.id_private();
      rfH_2 var13 = var2.id_protected();
      rfH_2 var14 = var2.id_byte();
      rfH_2 var15 = var2.id_extends();
      boolean var9 = var0 == var1.id_byte(var14).id_break() || var0 == var1.id_byte(var15).id_break();
      boolean var10 = var0 == var1.id_byte(var12).id_break() || var0 == var1.id_byte(var13).id_break();
      if (var9 && var10) {
         var3 /= 2.0F;
      } else {
         boolean var11 = var0 == var1.id_byte(var14.id_private()).id_break()
            || var0 == var1.id_byte(var15.id_private()).id_break()
            || var0 == var1.id_byte(var15.id_protected()).id_break()
            || var0 == var1.id_byte(var14.id_protected()).id_break();
         if (var11) {
            var3 /= 2.0F;
         }
      }

      return var3;
   }

   @Override
   public void id_class(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (var2.id_class(var3, 0) >= 9) {
         int var5 = this.id_private(var1);
         if (var5 < this.id_implements()) {
            float var6 = id_class(this, var2, var3);
            if (var4.nextInt((int)(25.0F / var6) + 1) == 0) {
               var2.id_class(var3, this.id_byte(var5 + 1), 2);
            }
         }
      }
   }

   public void id_class(rYB var1, rfH_2 var2, xc_3 var3) {
      int var4 = this.id_private(var3) + this.id_class(var1);
      int var5 = this.id_implements();
      if (var4 > var5) {
         var4 = var5;
      }

      var1.id_class(var2, this.id_byte(var4), 2);
   }

   public rCm_1 id_break() {
      return id_final;
   }

   protected rpL_2 id_finally() {
      return rdy_3.hP;
   }

   @Override
   protected boolean id_catch(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return var1.id_class(xu_3.PS);
   }

   public int id_implements() {
      return 7;
   }

   public boolean id_implements(xc_3 var1) {
      return var1.id_byte(this.id_break()) >= this.id_implements();
   }

   protected int id_private(xc_3 var1) {
      return var1.id_byte(this.id_break());
   }

   @Override
   public boolean a_(xc_3 var1) {
      return !this.id_implements(var1);
   }
}
