package celestial;

public class NF extends cr_3 {
   private final rsJ_2 id_class;
   private float id_package = 0.0F;

   @Override
   public void id_byte() {
      if ((Boolean)this.id_class.id_throws[27]) {
         this.id_super();
      } else {
         this.id_catch = (double)((float)this.id_class.rx());
         this.id_private = (double)((float)this.id_class.re());
         this.id_implements = (double)((float)this.id_class.BO());
         float var1 = rfU_2.id_class(an_3.id_case(this.id_class.rv()));
         if ((double)var1 >= 0.01) {
            this.id_package = rfU_2.id_class(this.id_package + 0.0025F, 0.0F, 1.0F);
            this.id_throws = rfU_2.id_catch(rfU_2.id_class(var1, 0.0F, 0.5F), 0.0F, 0.7F);
         } else {
            this.id_package = 0.0F;
            this.id_throws = 0.0F;
         }
      }
   }

   public NF(rsJ_2 var1) {
      super(rqn_3.GV, rqL_2.NEUTRAL);
      this.id_class = var1;
      this.id_finally = true;
      this.id_extends = 0;
      this.id_throws = 0.0F;
      this.id_catch = (double)((float)var1.rx());
      this.id_private = (double)((float)var1.re());
      this.id_implements = (double)((float)var1.BO());
   }

   @Override
   public boolean id_throws() {
      return !this.id_class.BF();
   }

   @Override
   public boolean id_protected() {
      return true;
   }
}
