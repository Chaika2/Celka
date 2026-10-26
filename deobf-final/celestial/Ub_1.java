package celestial;

import com.google.gson.JsonObject;

public class Ub_1 implements Dw_1 {
   private final rqO_2 class_;
   private final String break_;
   private final rkg_3 byte_;
   private final rdb_3 protected_;
   private final int throws_;
   private final Ot_1 case_;
   private final rqO_2 catch_;
   private final rkf_3<?> private_;

   @Override
   public JsonObject byte_() {
      return this.case_.break_();
   }

   public Ub_1(rqO_2 var1, rkf_3<?> var2, String var3, rkg_3 var4, rdb_3 var5, int var6, Ot_1 var7, rqO_2 var8) {
      this.class_ = var1;
      this.private_ = var2;
      this.break_ = var3;
      this.byte_ = var4;
      this.protected_ = var5;
      this.throws_ = var6;
      this.case_ = var7;
      this.catch_ = var8;
   }

   @Override
   public rkf_3<?> class_() {
      return this.private_;
   }

   @Override
   public void class_(JsonObject var1) {
      if (!this.break_.isEmpty()) {
         var1.addProperty("group", this.break_);
      }

      var1.add("ingredient", this.byte_.byte_());
      var1.addProperty("result", rVL.for_.break_(this.protected_).toString());
      var1.addProperty("count", this.throws_);
   }

   @Override
   public rqO_2 break_() {
      return this.class_;
   }

   @Override
   public rqO_2 protected_() {
      return this.catch_;
   }
}
