package celestial;

import com.google.gson.JsonObject;

public class hm_3 extends hZ_2 {
   private final Xh_1 class_;

   public hm_3(ho_3 var1, Xh_1 var2) {
      super(hu_3.class_, var1);
      this.class_ = var2;
   }

   @Override
   public JsonObject class_(rWH var1) {
      JsonObject var2 = super.class_(var1);
      var2.add("item", this.class_.class_());
      return var2;
   }

   public boolean class_(rdn_3 var1) {
      return this.class_.class_(var1);
   }

   public static hm_3 class_(rpL_2 var0) {
      return new hm_3(ho_3.class_, new Xh_1((rlb_3<rdb_3>)null, var0.case_(), XF.throws_, XF.throws_, hT_2.break_, hT_2.break_, (rLi_1)null, XC.class_));
   }

   public static hm_3 break_() {
      return new hm_3(ho_3.class_, Xh_1.class_);
   }
}
