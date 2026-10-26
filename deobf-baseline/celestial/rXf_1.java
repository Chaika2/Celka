package celestial;

public class rXf_1 extends rJr_1 {
   private final rXu_1 id_class;
   private final rpF_2 id_break;
   private final rJY id_byte;

   public rXf_1(int var1, rhz_3 var2) {
      this(var1, var2, new rXA(5), new rpI_2(2));
   }

   public rXf_1(int var1, rhz_3 var2, rXu_1 var3, rpF_2 var4) {
      super(rJP.id_extends, var1);
      id_class(var3, 5);
      id_class(var4, 2);
      this.id_class = var3;
      this.id_break = var4;
      this.id_break(new rXg_1(var3, 0, 56, 51));
      this.id_break(new rXg_1(var3, 1, 79, 58));
      this.id_break(new rXg_1(var3, 2, 102, 51));
      this.id_byte = this.id_break(new rXV(var3, 3, 79, 17));
      this.id_break(new rXj_1(var3, 4, 17, 17));
      this.id_class(var4);

      for (int var5 = 0; var5 < 3; var5++) {
         for (int var6 = 0; var6 < 9; var6++) {
            this.id_break(new rJY(var2, var6 + var5 * 9 + 9, 8 + var6 * 18, 84 + var5 * 18));
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
         if ((var2 < 0 || var2 > 2) && var2 != 3 && var2 != 4) {
            if (rXj_1.id_protected(var3)) {
               if (this.id_class(var5, 4, 5, false) || this.id_byte.id_class(var5) && !this.id_class(var5, 3, 4, false)) {
                  return rdn_3.id_break;
               }
            } else if (this.id_byte.id_class(var5)) {
               if (!this.id_class(var5, 3, 4, false)) {
                  return rdn_3.id_break;
               }
            } else if (rXg_1.id_protected(var3) && var3.id_char() == 1) {
               if (!this.id_class(var5, 0, 3, false)) {
                  return rdn_3.id_break;
               }
            } else if (var2 >= 5 && var2 < 32) {
               if (!this.id_class(var5, 32, 41, false)) {
                  return rdn_3.id_break;
               }
            } else if (var2 >= 32 && var2 < 41) {
               if (!this.id_class(var5, 5, 32, false)) {
                  return rdn_3.id_break;
               }
            } else if (!this.id_class(var5, 5, 41, false)) {
               return rdn_3.id_break;
            }
         } else {
            if (!this.id_class(var5, 5, 41, true)) {
               return rdn_3.id_break;
            }

            var4.id_class(var5, var3);
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

   public int id_class() {
      return this.id_break.id_class(1);
   }

   @Override
   public boolean id_class(rhd_3 var1) {
      return this.id_class.id_byte(var1);
   }

   public int id_break() {
      return this.id_break.id_class(0);
   }
}
