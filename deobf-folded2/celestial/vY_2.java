package celestial;

public class vY_2 extends vm_3 implements rpC_2 {
   private rgP_2 id_class;
   private rgP_2 id_throws;
   private int id_case;
   private boolean id_catch;
   private final rrbT_2 id_private = rrbt_3.id_class();

   @Override
   public void id_byte(rgP_2 var1) {
      this.id_class = var1;
      this.id_protected(new rgn_3("progress.working"));
   }

   public vY_2() {
      super(rgN_2.id_byte);
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      if (this.id_catch) {
         this.id_volatile.id_break(null);
      } else {
         if (this.id_private != null && (gm_3)this.id_volatile.id_class[56] == null) {
            this.id_private.id_class(this.id_package, this.id_int);
         } else {
            this.id_class(var1);
         }

         if (this.id_case > 0) {
            if (this.id_class != null) {
               id_class(var1, this.id_super, this.id_class, this.id_package / 2, 70, 16777215);
            }

            if (this.id_throws != null && this.id_case != 0) {
               id_class(var1, this.id_super, new rgN_2("").id_class(this.id_throws).id_break(" " + this.id_case + "%"), this.id_package / 2, 90, 16777215);
            }
         }

         super.id_class(var1, var2, var3, var4);
      }
   }

   @Override
   public void id_break(int var1) {
      this.id_case = var1;
   }

   @Override
   public void id_break(rgP_2 var1) {
      this.id_byte(var1);
   }

   @Override
   public void id_finally() {
      this.id_catch = true;
   }

   @Override
   public void id_protected(rgP_2 var1) {
      this.id_throws = var1;
      this.id_break(0);
   }

   @Override
   public boolean E_() {
      return false;
   }
}
