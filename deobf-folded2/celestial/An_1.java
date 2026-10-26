package celestial;

public class An_1 implements rmO_2 {
   private final rnW_2 id_class;
   private final rud_3 id_break;

   public An_1(rnW_2 var1, rud_3 var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   @Override
   public rud_3 id_class() {
      return this.id_break;
   }

   @Override
   public void id_class(rgP_2 var1, rgP_2 var2) {
   }

   @Override
   public void id_class(rmJ_2 var1) {
      this.id_break.id_class(var1.id_break());
      this.id_break.id_class(new rmW_2(this.id_class, this.id_break));
   }
}
