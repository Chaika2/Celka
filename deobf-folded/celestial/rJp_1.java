package celestial;

public class rJp_1 extends rJr_1 {
   private final rsA_2 id_class;
   private final rXl_1 id_break;
   private int id_byte;
   private boolean id_protected;
   private boolean id_catch;

   public int id_byte() {
      return this.id_byte;
   }

   public rJp_1(int var1, rhz_3 var2) {
      this(var1, var2, new ib_3(var2.id_throws));
   }

   public rJp_1(int var1, rhz_3 var2, rsA_2 var3) {
      super(rJP.id_super, var1);
      this.id_class = var3;
      this.id_break = new rXl_1(var3);
      this.id_break(new rJY(this.id_break, 0, 136, 37));
      this.id_break(new rJY(this.id_break, 1, 162, 37));
      this.id_break(new rJq_1(var2.id_throws, var3, this.id_break, 2, 220, 37));

      for (int var4 = 0; var4 < 3; var4++) {
         for (int var5 = 0; var5 < 9; var5++) {
            this.id_break(new rJY(var2, var5 + var4 * 9 + 9, 108 + var5 * 18, 84 + var4 * 18));
         }
      }

      for (int var6 = 0; var6 < 9; var6++) {
         this.id_break(new rJY(var2, var6, 108 + var6 * 18, 142));
      }
   }

   public int id_class() {
      return this.id_class.id_protected();
   }

   @Override
   public rdn_3 id_class(rhd_3 var1, int var2) {
      rdn_3 var3 = rdn_3.id_break;
      rJY var4 = this.id_throws.get(var2);
      if (var4 != null && var4.id_break()) {
         rdn_3 var5 = var4.id_class();
         var3 = var5.id_implements();
         if (var2 == 2) {
            if (!this.id_class(var5, 3, 39, true)) {
               return rdn_3.id_break;
            }

            var4.id_class(var5, var3);
            this.id_catch();
         } else if (var2 != 0 && var2 != 1) {
            if (var2 >= 3 && var2 < 30) {
               if (!this.id_class(var5, 30, 39, false)) {
                  return rdn_3.id_break;
               }
            } else if (var2 >= 30 && var2 < 39 && !this.id_class(var5, 3, 30, false)) {
               return rdn_3.id_break;
            }
         } else if (!this.id_class(var5, 3, 39, false)) {
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

         var4.id_class(var1, var5);
      }

      return var3;
   }

   @Override
   public boolean id_class(rdn_3 var1, rJY var2) {
      return false;
   }

   public void id_class(boolean var1) {
      this.id_protected = var1;
   }

   @Override
   public void id_class(rXu_1 var1) {
      this.id_break.id_byte();
      super.id_class(var1);
   }

   public void id_class(rdf_3 var1) {
      this.id_class.id_class(var1);
   }

   @Override
   public boolean id_class(rhd_3 var1) {
      return this.id_class.id_class() == var1;
   }

   private void id_break(int var1, rdn_3 var2) {
      if (!var2.id_class()) {
         for (int var3 = 3; var3 < 39; var3++) {
            rdn_3 var4 = this.id_throws.get(var3).id_class();
            if (!var4.id_class() && this.id_break(var2, var4)) {
               rdn_3 var5 = this.id_break.id_extends(var1);
               int var6 = var5.id_class() ? 0 : var5.id_char();
               int var7 = Math.min(var2.id_byte() - var6, var4.id_char());
               rdn_3 var8 = var4.id_implements();
               int var9 = var6 + var7;
               var4.id_catch(var7);
               var8.id_throws(var9);
               this.id_break.id_break(var1, var8);
               if (var9 >= var2.id_byte()) {
                  break;
               }
            }
         }
      }
   }

   private boolean id_break(rdn_3 var1, rdn_3 var2) {
      return var1.id_break() == var2.id_break() && rdn_3.id_class(var1, var2);
   }

   @Override
   public void id_break(rhd_3 var1) {
      super.id_break(var1);
      this.id_class.id_class((rhd_3)null);
      if (!this.id_class.id_byte().id_continue) {
         if (!var1.BM() || var1 instanceof rhN_2 && ((rhN_2)var1).id_int()) {
            rdn_3 var2 = this.id_break.id_native(0);
            if (!var2.id_class()) {
               var1.id_class(var2, false);
            }

            var2 = this.id_break.id_native(1);
            if (!var2.id_class()) {
               var1.id_class(var2, false);
            }
         } else {
            ((rhz_3)var1.id_implements[1]).id_class((rYB)var1.id_throws[7], this.id_break.id_native(0));
            ((rhz_3)var1.id_implements[1]).id_class((rYB)var1.id_throws[7], this.id_break.id_native(1));
         }
      }
   }

   public int id_break() {
      return this.id_break.id_throws();
   }

   public void id_break(boolean var1) {
      this.id_catch = var1;
   }

   public rdf_3 id_throws() {
      return this.id_class.id_break();
   }

   public void id_throws(int var1) {
      this.id_class.id_class(var1);
   }

   public void id_catch(int var1) {
      if (this.id_throws().size() > var1) {
         rdn_3 var2 = this.id_break.id_extends(0);
         if (!var2.id_class()) {
            if (!this.id_class(var2, 3, 39, true)) {
               return;
            }

            this.id_break.id_break(0, var2);
         }

         rdn_3 var3 = this.id_break.id_extends(1);
         if (!var3.id_class()) {
            if (!this.id_class(var3, 3, 39, true)) {
               return;
            }

            this.id_break.id_break(1, var3);
         }

         if (this.id_break.id_extends(0).id_class() && this.id_break.id_extends(1).id_class()) {
            rdn_3 var4 = this.id_throws().get(var1).id_break();
            this.id_break(0, var4);
            rdn_3 var5 = this.id_throws().get(var1).id_byte();
            this.id_break(1, var5);
         }
      }
   }

   private void id_catch() {
      if (!this.id_class.id_byte().id_continue) {
         an_3 var1 = (an_3)this.id_class;
         this.id_class.id_byte().id_class(var1.rx(), var1.re(), var1.BO(), this.id_class.id_case(), rqL_2.NEUTRAL, 1.0F, 1.0F, false);
      }
   }

   public void id_case(int var1) {
      this.id_byte = var1;
   }

   public boolean id_case() {
      return this.id_protected;
   }

   public void id_protected(int var1) {
      this.id_break.id_class(var1);
   }

   public boolean id_protected() {
      return this.id_catch;
   }
}
