package celestial;

import java.util.Calendar;

public class jr_3<T extends ryO_2 & rHw_1> extends jW_2<T> {
   private final Iq_1 id_class;
   private final Iq_1 id_break;
   private final Iq_1 id_byte;
   private final Iq_1 id_protected;
   private final Iq_1 id_throws;
   private final Iq_1 id_case;
   private final Iq_1 id_private;
   private final Iq_1 id_implements;
   private final Iq_1 id_finally;
   private boolean id_extends;

   public jr_3(jz_3 var1) {
      super(var1);
      Calendar var2 = Calendar.getInstance();
      if (var2.get(2) + 1 == 12 && var2.get(5) >= 24 && var2.get(5) <= 26) {
         this.id_extends = true;
      }

      this.id_break = new Iq_1(64, 64, 0, 19);
      this.id_break.id_class(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F, 0.0F);
      this.id_class = new Iq_1(64, 64, 0, 0);
      this.id_class.id_class(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F, 0.0F);
      this.id_class.id_protected = 9.0F;
      this.id_class.id_throws = 1.0F;
      this.id_byte = new Iq_1(64, 64, 0, 0);
      this.id_byte.id_class(7.0F, -1.0F, 15.0F, 2.0F, 4.0F, 1.0F, 0.0F);
      this.id_byte.id_protected = 8.0F;
      this.id_throws = new Iq_1(64, 64, 0, 19);
      this.id_throws.id_class(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F, 0.0F);
      this.id_protected = new Iq_1(64, 64, 0, 0);
      this.id_protected.id_class(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F, 0.0F);
      this.id_protected.id_protected = 9.0F;
      this.id_protected.id_throws = 1.0F;
      this.id_case = new Iq_1(64, 64, 0, 0);
      this.id_case.id_class(15.0F, -1.0F, 15.0F, 1.0F, 4.0F, 1.0F, 0.0F);
      this.id_case.id_protected = 8.0F;
      this.id_implements = new Iq_1(64, 64, 0, 19);
      this.id_implements.id_class(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F, 0.0F);
      this.id_private = new Iq_1(64, 64, 0, 0);
      this.id_private.id_class(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F, 0.0F);
      this.id_private.id_protected = 9.0F;
      this.id_private.id_throws = 1.0F;
      this.id_finally = new Iq_1(64, 64, 0, 0);
      this.id_finally.id_class(0.0F, -1.0F, 15.0F, 1.0F, 4.0F, 1.0F, 0.0F);
      this.id_finally.id_protected = 8.0F;
   }

   @Override
   public void id_class(T var1, float var2, Ml_1 var3, Hx_1 var4, int var5, int var6) {
      rYB var7 = var1.id_while();
      boolean var8 = var7 != null;
      xc_3 var9 = var8 ? var1.id_abstract() : xu_3.re.id_continue().id_class(xt_3.id_final, rpr_3.SOUTH);
      rCt_1 var10 = var9.id_break(xt_3.id_package) ? var9.id_byte(xt_3.id_package) : rCt_1.SINGLE;
      if (var9.id_break() instanceof JI var12) {
         boolean var13 = var10 != rCt_1.SINGLE;
         var3.id_class();
         float var14 = var9.id_byte(xt_3.id_final).id_package();
         var3.id_class(0.5, 0.5, 0.5);
         var3.id_class(rje_3.id_protected.id_byte(-var14));
         var3.id_class(-0.5, -0.5, -0.5);
         ryJ_2 var15;
         if (var8) {
            var15 = var12.id_class(var9, var7, var1.id_char(), true);
         } else {
            var15 = ryX_2::id_break;
         }

         float var16 = var15.apply(xt_3.id_class((rHw_1)var1)).get(var2);
         var16 = 1.0F - var16;
         var16 = 1.0F - var16 * var16 * var16;
         int var17 = var15.apply(new jB_2()).applyAsInt(var5);
         Ig_1 var18 = lp_3.id_class(var1, var10, this.id_extends);
         Ok_1 var19 = var18.id_class(var4, HU::id_byte);
         if (var13) {
            if (var10 == rCt_1.LEFT) {
               this.id_class(var3, var19, this.id_private, this.id_finally, this.id_implements, var16, var17, var6);
            } else {
               this.id_class(var3, var19, this.id_protected, this.id_case, this.id_throws, var16, var17, var6);
            }
         } else {
            this.id_class(var3, var19, this.id_class, this.id_byte, this.id_break, var16, var17, var6);
         }

         var3.id_break();
      }
   }

   private void id_class(Ml_1 var1, Ok_1 var2, Iq_1 var3, Iq_1 var4, Iq_1 var5, float var6, int var7, int var8) {
      var3.id_case = -(var6 * (float) (Math.PI / 2));
      var4.id_case = var3.id_case;
      var3.id_class(var1, var2, var7, var8);
      var4.id_class(var1, var2, var7, var8);
      var5.id_class(var1, var2, var7, var8);
   }
}
