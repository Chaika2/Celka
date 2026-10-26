package celestial;

public class rLP implements rLr_1 {
   private static final rgP_2 id_class = new rgn_3("multiplayer.status.request_handled");
   private final rnW_2 id_break;
   private final rud_3 id_byte;
   private boolean id_protected;

   public rLP(rnW_2 var1, rud_3 var2) {
      this.id_break = var1;
      this.id_byte = var2;
   }

   @Override
   public void id_class(rLS var1) {
      if (this.id_protected) {
         this.id_byte.id_class(id_class);
      } else {
         this.id_protected = true;
         this.id_byte.id_class(new rLb_1(this.id_break.L()));
      }
   }

   @Override
   public void id_class(rLB var1) {
      this.id_byte.id_class(new rLG(var1.id_break()));
      this.id_byte.id_class(id_class);
   }

   @Override
   public void id_class(rgP_2 var1, rgP_2 var2) {
   }

   @Override
   public rud_3 id_class() {
      return this.id_byte;
   }
}
