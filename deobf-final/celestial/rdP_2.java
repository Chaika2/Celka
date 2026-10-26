package celestial;

public class rdP_2 extends rdb_3 {
   private final int class_;
   private final String break_;

   public rdP_2(int var1, String var2, rdO_2 var3) {
      super(var3);
      this.class_ = var1;
      this.break_ = "textures/entity/horse/armor/horse_armor_" + var2 + ".png";
   }

   public rqO_2 catch_() {
      return new rqO_2(this.break_);
   }

   public int private_() {
      return this.class_;
   }
}
