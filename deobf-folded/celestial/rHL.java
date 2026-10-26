package celestial;

public class rHL extends ryO_2 {
   private int id_class;

   public rHL() {
      super(ryW_2.id_continue);
   }

   public void id_class(int var1) {
      this.id_class = var1;
   }

   @Override
   public void id_class(xc_3 var1, rcd_3 var2) {
      super.id_class(var1, var2);
      this.id_class = var2.id_private("OutputSignal");
   }

   @Override
   public rcd_3 id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_break("OutputSignal", this.id_class);
      return var1;
   }

   public int id_throws() {
      return this.id_class;
   }
}
