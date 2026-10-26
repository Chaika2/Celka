package celestial;

public class rMO extends rPR {
   public rMO(rba_3 var1) {
      super(var1);
      this.id_private = var1;
   }

   @Override
   public void id_class() {
      if (!this.id_private.Sc()) {
         super.id_class();
      }
   }

   @Override
   protected boolean id_break() {
      return !this.id_private.sd() && !this.id_private.x() && !this.id_private.su() & !this.id_private.sx();
   }
}
