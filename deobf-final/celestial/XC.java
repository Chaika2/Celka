package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class XC {
   public static final XC class_ = new XC((rcd_3)null);
   private final rcd_3 break_;

   public XC(rcd_3 var1) {
      this.break_ = var1;
   }

   public JsonElement class_() {
      return (JsonElement)(this != class_ && this.break_ != null ? new JsonPrimitive(this.break_.toString()) : JsonNull.INSTANCE);
   }

   public static XC class_(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         rcd_3 var1;
         try {
            var1 = rcH_2.class_(rpY_2.class_(var0, "nbt"));
         } catch (CommandSyntaxException var3) {
            throw new JsonSyntaxException("Invalid nbt tag: " + var3.getMessage());
         }

         return new XC(var1);
      } else {
         return class_;
      }
   }

   public boolean class_(rdn_3 var1) {
      return this == class_ ? true : this.class_(var1.package_());
   }

   public boolean class_(rcZ_2 var1) {
      return var1 == null ? this == class_ : this.break_ == null || rco_3.class_(this.break_, var1, true);
   }

   public boolean class_(an_3 var1) {
      return this == class_ ? true : this.class_(break_(var1));
   }

   public static rcd_3 break_(an_3 var0) {
      rcd_3 var1 = var0.case_(new rcd_3());
      if (var0 instanceof rhd_3) {
         rdn_3 var2 = ((rhz_3)((rhd_3)var0).implements_[1]).byte_();
         if (!var2.class_()) {
            var1.class_("SelectedItem", var2.break_(new rcd_3()));
         }
      }

      return var1;
   }
}
