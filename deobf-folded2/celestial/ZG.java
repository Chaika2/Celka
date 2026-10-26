package celestial;

public class ZG extends vm_3 {
   private final rgP_2 id_class;
   private cv_3 id_throws = cv_3.id_class;
   private final vm_3 id_case;
   private int id_catch;

   public ZG(vm_3 var1, rgP_2 var2, rgP_2 var3) {
      super(var2);
      this.id_case = var1;
      this.id_class = var3;
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_class(var1);
      id_class(var1, this.id_super, this.id_extends, this.id_package / 2, this.id_int / 2 - this.id_catch / 2 - 18, 11184810);
      this.id_throws.id_class(var1, this.id_package / 2, this.id_int / 2 - this.id_catch / 2);
      super.id_class(var1, var2, var3, var4);
   }

   private void id_finally() {
      if ((Ak_1)rrfp_3.id_class[0] != null) {
         this.id_volatile.id_break(new mt_3(new rrvL(), id_import, (Ak_1)rrfp_3.id_class[0]));
      }
   }

   @Override
   public boolean E_() {
      return false;
   }

   @Override
   protected void v_() {
      super.v_();
      this.id_throws = cv_3.id_class(this.id_super, this.id_class, this.id_package - 50);
      this.id_catch = this.id_throws.id_class() * 9;
      int var1 = Math.min(this.id_int / 2 + this.id_catch / 2 + 9, this.id_int - 30);
      this.id_class(new LF(this.id_package / 2 - 100, var1, 200, 20, new rgn_3("gui.toMenu"), var1x -> this.id_volatile.id_break(this.id_case)));
      if (!this.id_volatile.id_switch() && (rrfq_3)rrfp_3.id_class[1] != null) {
         this.id_class(new LF(this.id_package / 2 - 100, var1 + 25, 200, 20, new rgn_3("menu.reconnect"), var1x -> this.id_finally()));
      }

      Aq_1 var2 = id_import.id_void();
      rrFK.id_class((rrFD)rrFD.staticFields1658baa549203f63991cdcef51acf497[1], this.id_class, var2 == null ? null : var2.id_class());
   }
}
