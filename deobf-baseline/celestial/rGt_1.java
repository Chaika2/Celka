package celestial;

public abstract class rGt_1 extends rBk_1 {
   protected int id_break;
   protected int id_byte;

   @Override
   public void id_byte() {
      this.id_break = this.id_volatile();
      this.id_protected.id_protected = this.id_catch();
      this.id_byte = (Integer)this.id_protected.id_throws[41] + this.id_private();
      rqA_2 var1 = this.id_extends();
      if (var1 != null) {
         this.id_protected.id_class(var1, 1.0F, 1.0F);
      }

      this.id_protected.id_class(this.id_native());
   }

   protected rGt_1(rGp_1 var1) {
      this.id_protected = var1;
   }

   @Override
   public boolean id_class() {
      iB_2 var1 = this.id_protected.I_();
      if (var1 == null || !var1.BM()) {
         return false;
      } else {
         return this.id_protected.sn() ? false : (Integer)this.id_protected.id_throws[41] >= this.id_byte;
      }
   }

   @Override
   public boolean id_break() {
      iB_2 var1 = this.id_protected.I_();
      return var1 != null && var1.BM() && this.id_break > 0;
   }

   @Override
   public void id_throws() {
      this.id_break--;
      if (this.id_break == 0) {
         this.id_finally();
         this.id_protected.id_class(this.id_protected.sc(), 1.0F, 1.0F);
      }
   }

   protected abstract void id_finally();

   protected abstract int id_catch();

   protected abstract rqA_2 id_extends();

   protected abstract int id_private();

   protected int id_volatile() {
      return 20;
   }

   protected abstract rGT id_native();
}
