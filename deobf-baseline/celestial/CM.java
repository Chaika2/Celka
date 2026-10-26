package celestial;

public class CM extends CL {
   private int id_class;
   private final int id_break = 8;

   CM(gm_3 var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
   }

   @Override
   public void id_case() {
      for (int var1 = 0; var1 < 6; var1++) {
         double var2 = this.id_catch + (this.id_continue.nextDouble() - this.id_continue.nextDouble()) * 4.0;
         double var4 = this.id_private + (this.id_continue.nextDouble() - this.id_continue.nextDouble()) * 4.0;
         double var6 = this.id_implements + (this.id_continue.nextDouble() - this.id_continue.nextDouble()) * 4.0;
         this.id_byte.id_class(rLQ.id_return, var2, var4, var6, (double)((float)this.id_class / 8.0F), 0.0, 0.0);
      }

      this.id_class++;
      if (this.id_class == 8) {
         this.id_finally();
      }
   }
}
