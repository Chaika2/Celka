package celestial;

public class rhx_3 {
   public boolean id_class;
   public boolean id_break;
   public boolean id_byte;
   public boolean id_protected;
   public boolean id_throws = true;
   private float id_case = 0.05F;
   private float id_catch = 0.1F;

   public void id_class(float var1) {
      this.id_case = var1;
   }

   public float id_class() {
      return this.id_case;
   }

   public void id_class(rcd_3 var1) {
      rcd_3 var2 = new rcd_3();
      var2.id_class("invulnerable", this.id_class);
      var2.id_class("flying", this.id_break);
      var2.id_class("mayfly", this.id_byte);
      var2.id_class("instabuild", this.id_protected);
      var2.id_class("mayBuild", this.id_throws);
      var2.id_class("flySpeed", this.id_case);
      var2.id_class("walkSpeed", this.id_catch);
      var1.id_class("abilities", var2);
   }

   public void id_break(float var1) {
      this.id_catch = var1;
   }

   public float id_break() {
      return this.id_catch;
   }

   public void id_break(rcd_3 var1) {
      if (var1.id_byte("abilities", 10)) {
         rcd_3 var2 = var1.id_int("abilities");
         this.id_class = var2.id_new("invulnerable");
         this.id_break = var2.id_new("flying");
         this.id_byte = var2.id_new("mayfly");
         this.id_protected = var2.id_new("instabuild");
         if (var2.id_byte("flySpeed", 99)) {
            this.id_case = var2.id_finally("flySpeed");
            this.id_catch = var2.id_finally("walkSpeed");
         }

         if (var2.id_byte("mayBuild", 1)) {
            this.id_throws = var2.id_new("mayBuild");
         }
      }
   }
}
