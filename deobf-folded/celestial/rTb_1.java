package celestial;

public class rTb_1 extends rTG {
   private final rcd_3 id_class;

   public rTb_1(int var1, rcd_3 var2) {
      super(var1);
      this.id_class = var2;
      rqO_2 var3 = rqO_2.id_break(var2.id_native("id"));
      if (var3 != null) {
         var2.id_class("id", var3.toString());
      } else {
         var2.id_class("id", "minecraft:pig");
      }
   }

   public rTb_1(rcd_3 var1) {
      this(var1.id_byte("Weight", 99) ? var1.id_private("Weight") : 1, var1.id_int("Entity"));
   }

   public rTb_1() {
      super(1);
      this.id_class = new rcd_3();
      this.id_class.id_class("id", "minecraft:pig");
   }

   public rcd_3 id_class() {
      rcd_3 var1 = new rcd_3();
      var1.id_class("Entity", this.id_class);
      var1.id_break("Weight", this.id_byte);
      return var1;
   }

   public rcd_3 id_break() {
      return this.id_class;
   }
}
