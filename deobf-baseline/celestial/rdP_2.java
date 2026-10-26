package celestial;

public class rdP_2 extends rdb_3 {
   private final int id_class;
   private final String id_break;

   public rdP_2(int var1, String var2, rdO_2 var3) {
      super(var3);
      this.id_class = var1;
      this.id_break = "textures/entity/horse/armor/horse_armor_" + var2 + ".png";
   }

   public rqO_2 id_catch() {
      return new rqO_2(this.id_break);
   }

   public int id_private() {
      return this.id_class;
   }
}
