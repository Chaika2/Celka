package celestial;

public class cs_3 extends cr_3 {
   private final cb_3 id_class;
   private int id_package;

   @Override
   public void id_byte() {
      if (!(Boolean)this.id_class.id_throws[27] && this.id_package >= 0) {
         if (this.id_class.W()) {
            this.id_package++;
         } else {
            this.id_package -= 2;
         }

         this.id_package = Math.min(this.id_package, 40);
         this.id_throws = Math.max(0.0F, Math.min((float)this.id_package / 40.0F, 1.0F));
      } else {
         this.id_super();
      }
   }

   public cs_3(cb_3 var1) {
      super(rqn_3.id_super, rqL_2.AMBIENT);
      this.id_class = var1;
      this.id_finally = true;
      this.id_extends = 0;
      this.id_throws = 1.0F;
      this.id_volatile = true;
      this.id_final = true;
   }
}
