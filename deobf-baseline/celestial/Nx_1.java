package celestial;

public class Nx_1 extends cr_3 {
   private final cb_3 id_class;
   private int id_package;

   @Override
   public void id_byte() {
      this.id_package++;
      if (!(Boolean)this.id_class.id_throws[27] && (this.id_package <= 20 || this.id_class.Sy())) {
         this.id_catch = (double)((float)this.id_class.rx());
         this.id_private = (double)((float)this.id_class.re());
         this.id_implements = (double)((float)this.id_class.BO());
         float var1 = (float)this.id_class.rv().id_catch();
         if ((double)var1 >= 1.0E-7) {
            this.id_throws = rfU_2.id_class(var1 / 4.0F, 0.0F, 1.0F);
         } else {
            this.id_throws = 0.0F;
         }

         if (this.id_package < 20) {
            this.id_throws = 0.0F;
         } else if (this.id_package < 40) {
            this.id_throws = (float)((double)this.id_throws * ((double)(this.id_package - 20) / 20.0));
         }

         float var2 = 0.8F;
         if (this.id_throws > 0.8F) {
            this.id_case = 1.0F + (this.id_throws - 0.8F);
         } else {
            this.id_case = 1.0F;
         }
      } else {
         this.id_super();
      }
   }

   public Nx_1(cb_3 var1) {
      super(rqn_3.Bz, rqL_2.PLAYERS);
      this.id_class = var1;
      this.id_finally = true;
      this.id_extends = 0;
      this.id_throws = 0.1F;
   }
}
