package celestial;

public class cP_2 implements NW {
   private final cb_3 id_class;
   private final Nf_1 id_break;
   private int id_byte = 0;

   public cP_2(cb_3 var1, Nf_1 var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   @Override
   public void id_break() {
      this.id_byte--;
      if (this.id_byte <= 0 && this.id_class.W()) {
         float var1 = ((rYB)this.id_class.id_throws[7]).id_int.nextFloat();
         if (var1 < 1.0E-4F) {
            this.id_byte = 0;
            this.id_break.id_class((NQ)(new cS_2(this.id_class, rqn_3.id_synchronized)));
         } else if (var1 < 0.001F) {
            this.id_byte = 0;
            this.id_break.id_class((NQ)(new cS_2(this.id_class, rqn_3.id_else)));
         } else if (var1 < 0.01F) {
            this.id_byte = 0;
            this.id_break.id_class((NQ)(new cS_2(this.id_class, rqn_3.id_this)));
         }
      }
   }
}
