package celestial;

public class rRK {
   public static final rRK id_class = new rRK("");
   private final String id_break;

   public rRK(String var1) {
      this.id_break = var1;
   }

   public boolean id_class(rdn_3 var1) {
      return this.id_break.isEmpty() || !var1.id_class() && var1.id_this() && this.id_break.equals(var1.id_continue().getString());
   }

   public void id_class(rcd_3 var1) {
      if (!this.id_break.isEmpty()) {
         var1.id_class("Lock", this.id_break);
      }
   }

   public static rRK id_break(rcd_3 var0) {
      return var0.id_byte("Lock", 8) ? new rRK(var0.id_native("Lock")) : id_class;
   }
}
