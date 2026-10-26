package celestial;

public class rHZ extends ryO_2 {
   private boolean id_class;
   private boolean id_break;
   private boolean id_byte;
   private boolean id_protected;
   private final rHm_1 id_throws = new rHv_1(this);

   public void id_byte(boolean var1) {
      this.id_protected = var1;
   }

   @Override
   public void id_int() {
      this.id_float();
      super.id_int();
   }

   public rHZ() {
      super(ryW_2.id_synchronized);
   }

   @Override
   public void id_class(xc_3 var1, rcd_3 var2) {
      super.id_class(var1, var2);
      this.id_throws.id_break(var2);
      this.id_class = var2.id_new("powered");
      this.id_byte = var2.id_new("conditionMet");
      this.id_break(var2.id_new("auto"));
   }

   @Override
   public rcd_3 id_class(rcd_3 var1) {
      super.id_class(var1);
      this.id_throws.id_class(var1);
      var1.id_class("powered", this.id_catch());
      var1.id_class("conditionMet", this.id_extends());
      var1.id_class("auto", this.id_private());
      return var1;
   }

   public void id_class(boolean var1) {
      this.id_class = var1;
   }

   public void id_break(boolean var1) {
      boolean var2 = this.id_break;
      this.id_break = var1;
      if (!var2 && var1 && !this.id_class && this.id_extends != null && this.id_final() != rHF.SEQUENCE) {
         this.id_new();
      }
   }

   public rHm_1 id_throws() {
      return this.id_throws;
   }

   public void id_finally() {
      rHF var1 = this.id_final();
      if (var1 == rHF.AUTO && (this.id_class || this.id_break) && this.id_extends != null) {
         this.id_new();
      }
   }

   public boolean id_catch() {
      return this.id_class;
   }

   public boolean id_extends() {
      return this.id_byte;
   }

   private void id_new() {
      xd_3 var1 = this.id_abstract().id_break();
      if (var1 instanceof xK_2) {
         this.id_native();
         this.id_extends.id_finally().id_class(this.id_native, var1, 1);
      }
   }

   public boolean id_package() {
      xc_3 var1 = this.id_extends.id_byte(this.id_char());
      return var1.id_break() instanceof xK_2 ? var1.id_byte(xK_2.id_final) : false;
   }

   public boolean id_private() {
      return this.id_break;
   }

   public rHF id_final() {
      xc_3 var1 = this.id_abstract();
      if (var1.id_class(xu_3.SZ)) {
         return rHF.REDSTONE;
      } else if (var1.id_class(xu_3.bI)) {
         return rHF.AUTO;
      } else {
         return var1.id_class(xu_3.bf) ? rHF.SEQUENCE : rHF.REDSTONE;
      }
   }

   public boolean id_volatile() {
      return this.id_protected;
   }

   public boolean id_native() {
      this.id_byte = true;
      if (this.id_package()) {
         rfH_2 var1 = this.id_native.id_break(this.id_extends.id_byte(this.id_native).id_byte(xK_2.id_volatile).id_case());
         if (this.id_extends.id_byte(var1).id_break() instanceof xK_2) {
            ryO_2 var2 = this.id_extends.id_class(var1);
            this.id_byte = var2 instanceof rHZ && ((rHZ)var2).id_throws().id_case() > 0;
         } else {
            this.id_byte = false;
         }
      }

      return this.id_byte;
   }

   @Override
   public boolean ac_() {
      return true;
   }

   @Override
   public rFy_1 Y_() {
      if (this.id_volatile()) {
         this.id_byte(false);
         rcd_3 var1 = this.id_class(new rcd_3());
         return new rFy_1(this.id_native, 2, var1);
      } else {
         return null;
      }
   }
}
