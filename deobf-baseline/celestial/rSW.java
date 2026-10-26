package celestial;

public class rSW extends rBl_1 {
   private final rbB_2 id_break;
   private int id_byte;

   @Override
   public void id_byte() {
      super.id_byte();
      this.id_byte = 0;
   }

   public rSW(rbB_2 var1, double var2, boolean var4) {
      super(var1, var2, var4);
      this.id_break = var1;
   }

   @Override
   public void id_throws() {
      super.id_throws();
      this.id_byte++;
      if (this.id_byte >= 5 && this.id_finally() < this.id_extends() / 2) {
         this.id_break.id_case(true);
      } else {
         this.id_break.id_case(false);
      }
   }

   @Override
   public void id_protected() {
      super.id_protected();
      this.id_break.id_case(false);
   }
}
