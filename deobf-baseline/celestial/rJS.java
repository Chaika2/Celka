package celestial;

public class rJS extends rJY {
   private final rXk_1 id_class;
   private final rhd_3 id_break;
   private int id_catch;

   public rJS(rhd_3 var1, rXk_1 var2, rXu_1 var3, int var4, int var5, int var6) {
      super(var3, var4, var5, var6);
      this.id_break = var1;
      this.id_class = var2;
   }

   @Override
   public rdn_3 id_class(rhd_3 var1, rdn_3 var2) {
      this.b_(var2);
      rqs_3 var3 = ((rYB)var1.id_throws[7]).id_implements().id_byte(rkj_3.id_class, this.id_class, (rYB)var1.id_throws[7]);

      for (int var4 = 0; var4 < var3.size(); var4++) {
         rdn_3 var5 = this.id_class.id_extends(var4);
         rdn_3 var6 = (rdn_3)var3.get(var4);
         if (!var5.id_class()) {
            this.id_class.id_class(var4, 1);
            var5 = this.id_class.id_extends(var4);
         }

         if (!var6.id_class()) {
            if (var5.id_class()) {
               this.id_class.id_break(var4, var6);
            } else if (rdn_3.id_byte(var5, var6) && rdn_3.id_class(var5, var6)) {
               var6.id_case(var5.id_char());
               this.id_class.id_break(var4, var6);
            } else if (!((rhz_3)this.id_break.id_implements[1]).id_throws(var6)) {
               this.id_break.id_class(var6, false);
            }
         }
      }

      return var2;
   }

   @Override
   protected void id_class(rdn_3 var1, int var2) {
      this.id_catch += var2;
      this.b_(var1);
   }

   @Override
   public boolean id_class(rdn_3 var1) {
      return false;
   }

   @Override
   public rdn_3 id_class(int var1) {
      if (this.id_break()) {
         this.id_catch = this.id_catch + Math.min(var1, this.id_class().id_char());
      }

      return super.id_class(var1);
   }

   @Override
   protected void id_break(int var1) {
      this.id_catch += var1;
   }

   @Override
   protected void b_(rdn_3 var1) {
      if (this.id_catch > 0) {
         var1.id_class((rYB)this.id_break.id_throws[7], this.id_break, this.id_catch);
      }

      if (this.id_byte instanceof rXv_1) {
         ((rXv_1)this.id_byte).id_class(this.id_break);
      }

      this.id_catch = 0;
   }
}
