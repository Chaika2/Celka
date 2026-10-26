package celestial;

import java.util.Optional;

public class rJa_1 extends rJI<rXk_1> {
   private final rXk_1 id_class = new rXk_1(this, 3, 3);
   private final rXd_1 id_break = new rXd_1();
   private final rpq_3 id_byte;
   private final rhd_3 id_protected;

   @Override
   public int id_byte() {
      return this.id_class.id_protected();
   }

   public rJa_1(int var1, rhz_3 var2) {
      this(var1, var2, rpq_3.id_class);
   }

   public rJa_1(int var1, rhz_3 var2, rpq_3 var3) {
      super(rJP.id_native, var1);
      this.id_byte = var3;
      this.id_protected = var2.id_throws;
      this.id_break(new rJS(var2.id_throws, this.id_class, this.id_break, 0, 124, 35));

      for (int var4 = 0; var4 < 3; var4++) {
         for (int var5 = 0; var5 < 3; var5++) {
            this.id_break(new rJY(this.id_class, var5 + var4 * 3, 30 + var5 * 18, 17 + var4 * 18));
         }
      }

      for (int var6 = 0; var6 < 3; var6++) {
         for (int var8 = 0; var8 < 9; var8++) {
            this.id_break(new rJY(var2, var8 + var6 * 9 + 9, 8 + var8 * 18, 84 + var6 * 18));
         }
      }

      for (int var7 = 0; var7 < 9; var7++) {
         this.id_break(new rJY(var2, var7, 8 + var7 * 18, 142));
      }
   }

   @Override
   public rdn_3 id_class(rhd_3 var1, int var2) {
      rdn_3 var3 = rdn_3.id_break;
      rJY var4 = this.id_throws.get(var2);
      if (var4 != null && var4.id_break()) {
         rdn_3 var5 = var4.id_class();
         var3 = var5.id_implements();
         if (var2 == 0) {
            this.id_byte.id_class((var2x, var3x) -> var5.id_break().id_break(var5, var2x, var1));
            if (!this.id_class(var5, 10, 46, true)) {
               return rdn_3.id_break;
            }

            var4.id_class(var5, var3);
         } else if (var2 >= 10 && var2 < 46) {
            if (!this.id_class(var5, 1, 10, false)) {
               if (var2 < 37) {
                  if (!this.id_class(var5, 37, 46, false)) {
                     return rdn_3.id_break;
                  }
               } else if (!this.id_class(var5, 10, 37, false)) {
                  return rdn_3.id_break;
               }
            }
         } else if (!this.id_class(var5, 10, 46, false)) {
            return rdn_3.id_break;
         }

         if (var5.id_class()) {
            var4.id_break(rdn_3.id_break);
         } else {
            var4.id_byte();
         }

         if (var5.id_char() == var3.id_char()) {
            return rdn_3.id_break;
         }

         rdn_3 var6 = var4.id_class(var1, var5);
         if (var2 == 0) {
            var1.id_class(var6, false);
         }
      }

      return var3;
   }

   @Override
   public boolean id_class(rdn_3 var1, rJY var2) {
      return var2.id_byte != this.id_break && super.id_class(var1, var2);
   }

   @Override
   public boolean id_class(rhd_3 var1) {
      return id_class(this.id_byte, var1, xu_3.PP);
   }

   @Override
   public void id_class(rWr_1 var1) {
      this.id_class.id_class(var1);
   }

   @Override
   public void id_class() {
      this.id_class.id_public();
      this.id_break.id_public();
   }

   @Override
   public void id_class(rXu_1 var1) {
      this.id_byte.id_class((var1x, var2) -> id_class(this.id_case, var1x, this.id_protected, this.id_class, this.id_break));
   }

   @Override
   public boolean id_class(rkw_3<? super rXk_1> var1) {
      return var1.id_class(this.id_class, (rYB)this.id_protected.id_throws[7]);
   }

   protected static void id_class(int var0, rYB var1, rhd_3 var2, rXk_1 var3, rXd_1 var4) {
      if (!var1.id_continue) {
         rhN_2 var5 = (rhN_2)var2;
         rdn_3 var6 = rdn_3.id_break;
         Optional var7 = var1.id_const().V().id_class(rkj_3.id_class, var3, var1);
         if (var7.isPresent()) {
            rkt_3 var8 = (rkt_3)var7.get();
            if (var4.id_class(var1, var5, var8)) {
               var6 = var8.id_class(var3);
            }
         }

         var4.id_break(0, var6);
         var5.id_class.id_class(new rFM(var0, 0, var6));
      }
   }

   @Override
   public void id_break(rhd_3 var1) {
      super.id_break(var1);
      this.id_byte.id_class((var2, var3) -> this.id_class(var1, var2, this.id_class));
   }

   @Override
   public int id_break() {
      return 0;
   }

   @Override
   public int id_throws() {
      return 10;
   }

   @Override
   public rke_3 id_implements() {
      return rke_3.CRAFTING;
   }

   @Override
   public int id_protected() {
      return this.id_class.id_byte();
   }
}
