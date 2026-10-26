package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;

public class hl_3 {
   public static final hl_3 class_ = new hl_3(Xm_1.throws_, Xm_1.throws_, Xm_1.throws_, Xm_1.throws_, Xm_1.throws_);
   private final Xm_1 break_;
   private final Xm_1 byte_;
   private final Xm_1 protected_;
   private final Xm_1 throws_;
   private final Xm_1 case_;

   public hl_3(Xm_1 var1, Xm_1 var2, Xm_1 var3, Xm_1 var4, Xm_1 var5) {
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
      this.throws_ = var4;
      this.case_ = var5;
   }

   public JsonElement class_() {
      if (this == class_) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject var1 = new JsonObject();
         var1.add("x", this.break_.protected_());
         var1.add("y", this.byte_.protected_());
         var1.add("z", this.protected_.protected_());
         var1.add("horizontal", this.throws_.protected_());
         var1.add("absolute", this.case_.protected_());
         return var1;
      }
   }

   public boolean class_(double var1, double var3, double var5, double var7, double var9, double var11) {
      float var13 = (float)(var1 - var7);
      float var14 = (float)(var3 - var9);
      float var15 = (float)(var5 - var11);
      if (!this.break_.break_(rfU_2.throws_(var13)) || !this.byte_.break_(rfU_2.throws_(var14)) || !this.protected_.break_(rfU_2.throws_(var15))) {
         return false;
      } else {
         return !this.throws_.class_((double)(var13 * var13 + var15 * var15))
            ? false
            : this.case_.class_((double)(var13 * var13 + var14 * var14 + var15 * var15));
      }
   }

   public static hl_3 class_(Xm_1 var0) {
      return new hl_3(Xm_1.throws_, Xm_1.throws_, Xm_1.throws_, var0, Xm_1.throws_);
   }

   public static hl_3 class_(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var1 = rpY_2.private_(var0, "distance");
         Xm_1 var2 = Xm_1.class_(var1.get("x"));
         Xm_1 var3 = Xm_1.class_(var1.get("y"));
         Xm_1 var4 = Xm_1.class_(var1.get("z"));
         Xm_1 var5 = Xm_1.class_(var1.get("horizontal"));
         Xm_1 var6 = Xm_1.class_(var1.get("absolute"));
         return new hl_3(var2, var3, var4, var5, var6);
      } else {
         return class_;
      }
   }

   public static hl_3 break_(Xm_1 var0) {
      return new hl_3(Xm_1.throws_, var0, Xm_1.throws_, Xm_1.throws_, Xm_1.throws_);
   }
}
