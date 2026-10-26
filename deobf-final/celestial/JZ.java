package celestial;

import com.google.gson.JsonObject;

public class JZ extends hZ_2 {
   private final ho_3 class_;
   private final Xh_1 break_;

   public JZ(ho_3 var1, ho_3 var2, Xh_1 var3) {
      super(Jm_1.class_, var1);
      this.class_ = var2;
      this.break_ = var3;
   }

   @Override
   public JsonObject class_(rWH var1) {
      JsonObject var2 = super.class_(var1);
      var2.add("item", this.break_.class_());
      var2.add("villager", this.class_.class_(var1));
      return var2;
   }

   public boolean class_(rzr_3 var1, rdn_3 var2) {
      return !this.class_.class_(var1) ? false : this.break_.class_(var2);
   }

   public static JZ break_() {
      return new JZ(ho_3.class_, ho_3.class_, Xh_1.class_);
   }
}
