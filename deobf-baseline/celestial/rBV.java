package celestial;

public class rBV extends rBu_1 {
   private final boolean id_class;
   private int id_break;

   @Override
   public void id_byte() {
      this.id_break = 20;
      this.id_class(true);
   }

   public rBV(is_3 var1, boolean var2) {
      super(var1);
      this.id_protected = var1;
      this.id_class = var2;
   }

   @Override
   public boolean id_break() {
      return this.id_class && this.id_break > 0 && super.id_break();
   }

   @Override
   public void id_throws() {
      this.id_break--;
      super.id_throws();
   }

   @Override
   public void id_protected() {
      this.id_class(false);
   }
}
