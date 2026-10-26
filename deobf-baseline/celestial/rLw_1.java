package celestial;

public class rLw_1 extends rLy_1 {
   private boolean id_class;

   @Override
   public void id_byte(boolean var1) {
   }

   @Override
   protected rjU_2 id_byte() {
      return new rjU_2(this.id_break.rx(), this.id_break.id_byte(0.5), this.id_break.BO());
   }

   public rLw_1(is_3 var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   protected boolean id_class(rjU_2 var1, rjU_2 var2, int var3, int var4, int var5) {
      rjU_2 var6 = new rjU_2(var2.id_break, var2.id_byte + (double)this.id_break.Bm() * 0.5, var2.id_protected);
      return this.id_byte.id_class(new rjB_2(var1, var6, rjS_2.COLLIDER, rjs_3.NONE, this.id_break)).id_byte() == rjM_2.MISS;
   }

   @Override
   public boolean id_class(rfH_2 var1) {
      return !this.id_byte.id_byte(var1).id_implements(this.id_byte, var1);
   }

   @Override
   protected rLl_1 id_class(int var1) {
      this.id_class = this.id_break instanceof rbo_3;
      this.id_int = new rLt_1(this.id_class);
      return new rLl_1(this.id_int, var1);
   }

   @Override
   public void id_class() {
      this.id_case++;
      if (this.id_final) {
         this.id_implements();
      }

      if (!this.id_native()) {
         if (this.id_break()) {
            this.id_extends();
         } else if (this.id_protected != null && !this.id_protected.id_byte()) {
            rjU_2 var1 = this.id_protected.id_class(this.id_break);
            if (rfU_2.id_byte(this.id_break.rx()) == rfU_2.id_byte(var1.id_break)
               && rfU_2.id_byte(this.id_break.re()) == rfU_2.id_byte(var1.id_byte)
               && rfU_2.id_byte(this.id_break.BO()) == rfU_2.id_byte(var1.id_protected)) {
               this.id_protected.id_class();
            }
         }

         ruP_2.id_class(this.id_byte, this.id_break, this.id_protected, this.id_volatile);
         if (!this.id_native()) {
            rjU_2 var2 = this.id_protected.id_class(this.id_break);
            this.id_break.id_super().id_class(var2.id_break, var2.id_byte, var2.id_protected, this.id_throws);
         }
      }
   }

   @Override
   protected void id_class(rjU_2 var1) {
      if (this.id_case - this.id_catch > 100) {
         if (var1.id_implements(this.id_private) < 2.25) {
            this.id_final();
         }

         this.id_catch = this.id_case;
         this.id_private = var1;
      }

      if (this.id_protected != null && !this.id_protected.id_byte()) {
         rfH_2 var2 = this.id_protected.id_catch();
         if (var2.equals(this.id_implements)) {
            this.id_finally = this.id_finally + (rqR_2.id_break() - this.id_extends);
         } else {
            this.id_implements = var2;
            double var3 = var1.id_case(rjU_2.id_class(this.id_implements));
            this.id_native = this.id_break.sB() > 0.0F ? var3 / (double)this.id_break.sB() * 100.0 : 0.0;
         }

         if (this.id_native > 0.0 && (double)this.id_finally > this.id_native * 2.0) {
            this.id_implements = rja_3.id_case;
            this.id_finally = 0L;
            this.id_native = 0.0;
            this.id_final();
         }

         this.id_extends = rqR_2.id_break();
      }
   }

   @Override
   protected boolean id_break() {
      return this.id_class || this.id_package();
   }

   @Override
   protected void id_extends() {
      if (this.id_protected != null) {
         rjU_2 var1 = this.id_byte();
         float var2 = this.id_break.PN();
         float var3 = var2 > 0.75F ? var2 / 2.0F : 0.75F - var2 / 2.0F;
         rjU_2 var4 = this.id_break.rv();
         if (Math.abs(var4.id_break) > 0.2 || Math.abs(var4.id_protected) > 0.2) {
            var3 = (float)((double)var3 * var4.id_case() * 6.0);
         }

         byte var5 = 6;
         rjU_2 var6 = rjU_2.id_protected(this.id_protected.id_catch());
         if (Math.abs(this.id_break.rx() - var6.id_break) < (double)var3
            && Math.abs(this.id_break.BO() - var6.id_protected) < (double)var3
            && Math.abs(this.id_break.re() - var6.id_byte) < (double)(var3 * 2.0F)) {
            this.id_protected.id_class();
         }

         for (int var7 = Math.min(this.id_protected.id_case() + 6, this.id_protected.id_throws() - 1); var7 > this.id_protected.id_case(); var7--) {
            var6 = this.id_protected.id_class(this.id_break, var7);
            if (!(var6.id_implements(var1) > 36.0) && this.id_class(var1, var6, 0, 0, 0)) {
               this.id_protected.id_byte(var7);
               break;
            }
         }

         this.id_class(var1);
      }
   }
}
