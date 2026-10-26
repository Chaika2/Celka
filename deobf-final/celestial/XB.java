package celestial;

import com.google.gson.JsonObject;
import java.util.Collection;

public class XB extends hZ_2 {
   private final Xh_1 class_;
   private final ho_3 break_;
   private final Xh_1 byte_;

   public XB(ho_3 var1, Xh_1 var2, ho_3 var3, Xh_1 var4) {
      super(XP.class_, var1);
      this.class_ = var2;
      this.break_ = var3;
      this.byte_ = var4;
   }

   @Override
   public JsonObject class_(rWH var1) {
      JsonObject var2 = super.class_(var1);
      var2.add("rod", this.class_.class_());
      var2.add("entity", this.break_.class_(var1));
      var2.add("item", this.byte_.class_());
      return var2;
   }

   public boolean class_(rdn_3 var1, rzr_3 var2, Collection<rdn_3> var3) {
      if (!this.class_.class_(var1)) {
         return false;
      } else if (!this.break_.class_(var2)) {
         return false;
      } else {
         if (this.byte_ != Xh_1.class_) {
            boolean var4 = false;
            an_3 var5 = var2.break_(rzQ_2.class_);
            if (var5 instanceof rsE_2 var6 && this.byte_.class_(var6.protected_())) {
               var4 = true;
            }

            for (rdn_3 var7 : var3) {
               if (this.byte_.class_(var7)) {
                  var4 = true;
                  break;
               }
            }

            if (!var4) {
               return false;
            }
         }

         return true;
      }
   }

   public static XB class_(Xh_1 var0, hY_2 var1, Xh_1 var2) {
      return new XB(ho_3.class_, var0, ho_3.class_(var1), var2);
   }
}
