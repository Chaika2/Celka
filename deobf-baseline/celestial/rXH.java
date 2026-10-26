package celestial;

public abstract class rXH extends rJI<rXu_1> {
   private final rXu_1 id_break;
   private final rpF_2 id_byte;
   protected final rYB id_class;
   private final rkj_3<? extends rkv_3> id_protected;
   private final rke_3 id_catch;

   @Override
   public int id_byte() {
      return 1;
   }

   protected rXH(rJP<?> var1, rkj_3<? extends rkv_3> var2, rke_3 var3, int var4, rhz_3 var5) {
      this(var1, var2, var3, var4, var5, new rXA(3), new rpI_2(4));
   }

   protected rXH(rJP<?> var1, rkj_3<? extends rkv_3> var2, rke_3 var3, int var4, rhz_3 var5, rXu_1 var6, rpF_2 var7) {
      super(var1, var4);
      this.id_protected = var2;
      this.id_catch = var3;
      id_class(var6, 3);
      id_class(var7, 4);
      this.id_break = var6;
      this.id_byte = var7;
      this.id_class = (rYB)var5.id_throws.id_throws[7];
      this.id_break(new rJY(var6, 0, 56, 17));
      this.id_break(new rJh_1(this, var6, 1, 56, 53));
      this.id_break(new rJX(var5.id_throws, var6, 2, 116, 35));

      for (int var8 = 0; var8 < 3; var8++) {
         for (int var9 = 0; var9 < 9; var9++) {
            this.id_break(new rJY(var5, var9 + var8 * 9 + 9, 8 + var9 * 18, 84 + var8 * 18));
         }
      }

      for (int var10 = 0; var10 < 9; var10++) {
         this.id_break(new rJY(var5, var10, 8 + var10 * 18, 142));
      }

      this.id_class(var7);
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
         } else if (var2 != 1 && var2 != 0) {
            if (this.id_class(var5)) {
               if (!this.id_class(var5, 0, 1, false)) {
                  return rdn_3.id_break;
               }
            } else if (this.id_break(var5)) {
               if (!this.id_class(var5, 1, 2, false)) {
                  return rdn_3.id_break;
               }
            } else if (var2 >= 3 && var2 < 30) {
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

   protected boolean id_class(rdn_3 var1) {
      return this.id_class.id_implements().id_class(this.id_protected, new rXA(var1), this.id_class).isPresent();
   }

   @Override
   public boolean id_class(rhd_3 var1) {
      return this.id_break.id_byte(var1);
   }

   @Override
   public void id_class(rWr_1 var1) {
      if (this.id_break instanceof rXZ) {
         ((rXZ)this.id_break).id_class(var1);
      }
   }

   @Override
   public void id_class() {
      this.id_break.id_public();
   }

   @Override
   public boolean id_class(rkw_3<? super rXu_1> var1) {
      return var1.id_class(this.id_break, this.id_class);
   }

   @Override
   public void id_class(boolean var1, rkw_3<?> var2, rhN_2 var3) {
      new rWG<>(this).id_class(var3, var2, var1);
   }

   @Override
   public int id_break() {
      return 2;
   }

   protected boolean id_break(rdn_3 var1) {
      return rHS.id_break(var1);
   }

   @Override
   public int id_throws() {
      return 3;
   }

   public int id_catch() {
      int var1 = this.id_byte.id_class(1);
      if (var1 == 0) {
         var1 = 200;
      }

      return this.id_byte.id_class(0) * 13 / var1;
   }

   public int id_case() {
      int var1 = this.id_byte.id_class(2);
      int var2 = this.id_byte.id_class(3);
      return var2 != 0 && var1 != 0 ? var1 * 24 / var2 : 0;
   }

   @Override
   public rke_3 id_implements() {
      return this.id_catch;
   }

   @Override
   public int id_protected() {
      return 1;
   }

   public boolean id_private() {
      return this.id_byte.id_class(0) > 0;
   }
}
