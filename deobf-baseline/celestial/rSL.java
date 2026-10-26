package celestial;

public class rSL extends rSp_1 {
   private rjU_2 id_break;
   private int id_byte;

   @Override
   public void id_byte() {
      this.id_break = null;
      this.id_byte = 0;
   }

   public rSL(rSu_1 var1) {
      super(var1);
   }

   @Override
   public void id_class() {
      if (this.id_byte++ % 10 == 0) {
         float var1 = (this.id_class.Sa().nextFloat() - 0.5F) * 8.0F;
         float var2 = (this.id_class.Sa().nextFloat() - 0.5F) * 4.0F;
         float var3 = (this.id_class.Sa().nextFloat() - 0.5F) * 8.0F;
         ((rYB)this.id_class.id_throws[7])
            .id_class(
               rLQ.id_synchronized,
               this.id_class.rx() + (double)var1,
               this.id_class.re() + 2.0 + (double)var2,
               this.id_class.BO() + (double)var3,
               0.0,
               0.0,
               0.0
            );
      }
   }

   @Override
   public void id_break() {
      this.id_byte++;
      if (this.id_break == null) {
         rfH_2 var1 = ((rYB)this.id_class.id_throws[7]).id_class(rKv_1.MOTION_BLOCKING, rUs_1.id_class);
         this.id_break = rjU_2.id_protected(var1);
      }

      double var3 = this.id_break.id_protected(this.id_class.rx(), this.id_class.re(), this.id_class.BO());
      if (!(var3 < 100.0) && !(var3 > 22500.0) && !(Boolean)this.id_class.id_throws[23] && !(Boolean)this.id_class.id_throws[24]) {
         this.id_class.id_public(1.0F);
      } else {
         this.id_class.id_public(0.0F);
      }
   }

   @Override
   public float id_throws() {
      return 3.0F;
   }

   @Override
   public rjU_2 id_case() {
      return this.id_break;
   }

   @Override
   public rST<rSL> id_protected() {
      return rST.id_finally;
   }
}
