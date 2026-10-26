package celestial;

public class rXT extends rJr_1 {
   private final rXu_1 id_class = new rXt_1(this, 1);
   private final rXw_1 id_break;
   private final rpq_3 id_byte;
   private final rpF_2 id_protected;

   public rLR id_byte() {
      return rLR.id_class(this.id_protected.id_class(2));
   }

   public rXT(int var1, rXu_1 var2) {
      this(var1, var2, new rpI_2(3), rpq_3.id_class);
   }

   public rXT(int var1, rXu_1 var2, rpF_2 var3, rpq_3 var4) {
      super(rJP.id_implements, var1);
      id_class(var3, 3);
      this.id_protected = var3;
      this.id_byte = var4;
      this.id_break = new rXw_1(this, this.id_class, 0, 136, 110);
      this.id_break(this.id_break);
      this.id_class(var3);
      byte var5 = 36;
      short var6 = 137;

      for (int var7 = 0; var7 < 3; var7++) {
         for (int var8 = 0; var8 < 9; var8++) {
            this.id_break(new rJY(var2, var8 + var7 * 9 + 9, 36 + var8 * 18, 137 + var7 * 18));
         }
      }

      for (int var9 = 0; var9 < 9; var9++) {
         this.id_break(new rJY(var2, var9, 36 + var9 * 18, 195));
      }
   }

   public int id_class() {
      return this.id_protected.id_class(0);
   }

   @Override
   public rdn_3 id_class(rhd_3 var1, int var2) {
      rdn_3 var3 = rdn_3.id_break;
      rJY var4 = this.id_throws.get(var2);
      if (var4 != null && var4.id_break()) {
         rdn_3 var5 = var4.id_class();
         var3 = var5.id_implements();
         if (var2 == 0) {
            if (!this.id_class(var5, 1, 37, true)) {
               return rdn_3.id_break;
            }

            var4.id_class(var5, var3);
         } else if (!this.id_break.id_break() && this.id_break.id_class(var5) && var5.id_char() == 1) {
            if (!this.id_class(var5, 0, 1, false)) {
               return rdn_3.id_break;
            }
         } else if (var2 >= 1 && var2 < 28) {
            if (!this.id_class(var5, 28, 37, false)) {
               return rdn_3.id_break;
            }
         } else if (var2 >= 28 && var2 < 37) {
            if (!this.id_class(var5, 1, 28, false)) {
               return rdn_3.id_break;
            }
         } else if (!this.id_class(var5, 1, 37, false)) {
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
   public void id_class(int var1, int var2) {
      super.id_class(var1, var2);
      this.id_native();
   }

   @Override
   public boolean id_class(rhd_3 var1) {
      return id_class(this.id_byte, var1, xu_3.Sv);
   }

   @Override
   public void id_break(rhd_3 var1) {
      super.id_break(var1);
      if (!((rYB)var1.id_throws[7]).id_continue) {
         rdn_3 var2 = this.id_break.id_class(this.id_break.id_protected());
         if (!var2.id_class()) {
            var1.id_class(var2, false);
         }
      }
   }

   public void id_break(int var1, int var2) {
      if (this.id_break.id_break()) {
         this.id_protected.id_class(1, var1);
         this.id_protected.id_class(2, var2);
         this.id_break.id_class(1);
      }
   }

   public rLR id_break() {
      return rLR.id_class(this.id_protected.id_class(1));
   }

   public boolean id_protected() {
      return !this.id_class.id_extends(0).id_class();
   }
}
