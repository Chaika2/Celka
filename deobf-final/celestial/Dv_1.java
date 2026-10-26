package celestial;

import com.google.gson.JsonObject;

public class Dv_1 implements Dw_1 {
   private final rqO_2 class_;
   private final String break_;
   private final rkg_3 byte_;
   private final rdb_3 protected_;
   private final float throws_;
   private final int case_;
   private final Ot_1 catch_;
   private final rqO_2 private_;
   private final rkf_3<? extends rkv_3> implements_;

   @Override
   public JsonObject byte_() {
      return this.catch_.break_();
   }

   public Dv_1(rqO_2 var1, String var2, rkg_3 var3, rdb_3 var4, float var5, int var6, Ot_1 var7, rqO_2 var8, rkf_3<? extends rkv_3> var9) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      this.throws_ = var5;
      this.case_ = var6;
      this.catch_ = var7;
      this.private_ = var8;
      this.implements_ = var9;
   }

   @Override
   public void class_(JsonObject var1) {
      if (!this.break_.isEmpty()) {
         var1.addProperty("group", this.break_);
      }

      var1.add("ingredient", this.byte_.byte_());
      var1.addProperty("result", rVL.for_.break_(this.protected_).toString());
      var1.addProperty("experience", this.throws_);
      var1.addProperty("cookingtime", this.case_);
   }

   @Override
   public rkf_3<?> class_() {
      return this.implements_;
   }

   @Override
   public rqO_2 break_() {
      return this.class_;
   }

   @Override
   public rqO_2 protected_() {
      return this.private_;
   }
}
