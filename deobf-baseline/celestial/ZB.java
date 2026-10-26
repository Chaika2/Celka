package celestial;

public class ZB extends vm_3 {
   private cv_3 id_class;
   private final Runnable id_throws;

   public ZB(Runnable var1) {
      super(new rgn_3("datapackFailure.title"));
      this.id_class = cv_3.id_class;
      this.id_throws = var1;
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_class(var1);
      this.id_class.id_class(var1, this.id_package / 2, 70);
      super.id_class(var1, var2, var3, var4);
   }

   @Override
   public boolean E_() {
      return false;
   }

   @Override
   protected void v_() {
      super.v_();
      this.id_class = cv_3.id_class(this.id_super, this.id_new(), this.id_package - 50);
      this.id_class(new LF(this.id_package / 2 - 155, this.id_int / 6 + 96, 150, 20, new rgn_3("datapackFailure.safeMode"), var1 -> this.id_throws.run()));
      this.id_class(
         new LF(this.id_package / 2 - 155 + 160, this.id_int / 6 + 96, 150, 20, new rgn_3("gui.toTitle"), var1 -> this.id_volatile.id_break((vm_3)null))
      );
   }
}
