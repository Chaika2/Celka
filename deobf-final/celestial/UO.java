package celestial;

import com.google.gson.JsonObject;

public class UO implements Dw_1 {
   private final rqO_2 class_;
   private final rkg_3 break_;
   private final rkg_3 byte_;
   private final rdb_3 protected_;
   private final Ot_1 throws_;
   private final rqO_2 case_;
   private final rkf_3<?> catch_;

   @Override
   public JsonObject byte_() {
      return this.throws_.break_();
   }

   public UO(rqO_2 var1, rkf_3<?> var2, rkg_3 var3, rkg_3 var4, rdb_3 var5, Ot_1 var6, rqO_2 var7) {
      this.class_ = var1;
      this.catch_ = var2;
      this.break_ = var3;
      this.byte_ = var4;
      this.protected_ = var5;
      this.throws_ = var6;
      this.case_ = var7;
   }

   @Override
   public rkf_3<?> class_() {
      return this.catch_;
   }

   @Override
   public void class_(JsonObject var1) {
      var1.add("base", this.break_.byte_());
      var1.add("addition", this.byte_.byte_());
      JsonObject var2 = new JsonObject();
      var2.addProperty("item", rVL.for_.break_(this.protected_).toString());
      var1.add("result", var2);
   }

   @Override
   public rqO_2 break_() {
      return this.class_;
   }

   @Override
   public rqO_2 protected_() {
      return this.case_;
   }
}
