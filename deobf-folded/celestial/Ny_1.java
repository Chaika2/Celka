package celestial;

public class Ny_1 extends cr_3 {
   private final rhd_3 id_class;
   private final rsJ_2 id_package;

   @Override
   public void id_byte() {
      if (!(Boolean)this.id_package.id_throws[27] && this.id_class.Pm() && this.id_class.ra() == this.id_package) {
         float var1 = rfU_2.id_class(an_3.id_case(this.id_package.rv()));
         if ((double)var1 >= 0.01) {
            this.id_throws = 0.0F + rfU_2.id_class(var1, 0.0F, 1.0F) * 0.75F;
         } else {
            this.id_throws = 0.0F;
         }
      } else {
         this.id_super();
      }
   }

   public Ny_1(rhd_3 var1, rsJ_2 var2) {
      super(rqn_3.Gj, rqL_2.NEUTRAL);
      this.id_class = var1;
      this.id_package = var2;
      this.id_native = NN.NONE;
      this.id_finally = true;
      this.id_extends = 0;
      this.id_throws = 0.0F;
   }

   @Override
   public boolean id_throws() {
      return !this.id_package.BF();
   }

   @Override
   public boolean id_protected() {
      return true;
   }
}
