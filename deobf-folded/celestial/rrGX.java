package celestial;

public class rrGX {
   private final rfH_2 id_class;
   private final int id_break;
   private final int id_byte;

   public int id_byte() {
      return this.id_break;
   }

   public rrGX(rfH_2 var1, int var2, int var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
   }

   public static String id_class(rfH_2 var0) {
      return "frame-" + var0.b_() + "," + var0.c_() + "," + var0.d_();
   }

   public static rrGX id_class(rcd_3 var0) {
      rfH_2 var1 = rco_3.id_break(var0.id_int("Pos"));
      int var2 = var0.id_private("Rotation");
      int var3 = var0.id_private("EntityId");
      return new rrGX(var1, var2, var3);
   }

   public rcd_3 id_class() {
      rcd_3 var1 = new rcd_3();
      var1.id_class("Pos", rco_3.id_class(this.id_class));
      var1.id_break("Rotation", this.id_break);
      var1.id_break("EntityId", this.id_byte);
      return var1;
   }

   public rfH_2 id_break() {
      return this.id_class;
   }

   public String id_throws() {
      return id_class(this.id_class);
   }

   public int id_protected() {
      return this.id_byte;
   }
}
