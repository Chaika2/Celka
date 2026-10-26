package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class XC {
   public static final XC id_class = new XC((rcd_3)null);
   private final rcd_3 id_break;

   public XC(rcd_3 var1) {
      this.id_break = var1;
   }

   public JsonElement id_class() {
      return (JsonElement)(this != id_class && this.id_break != null ? new JsonPrimitive(this.id_break.toString()) : JsonNull.INSTANCE);
   }

   public static XC id_class(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         rcd_3 var1;
         try {
            var1 = rcH_2.id_class(rpY_2.id_class(var0, "nbt"));
         } catch (CommandSyntaxException var3) {
            throw new JsonSyntaxException("Invalid nbt tag: " + var3.getMessage());
         }

         return new XC(var1);
      } else {
         return id_class;
      }
   }

   public boolean id_class(rdn_3 var1) {
      return this == id_class ? true : this.id_class(var1.id_package());
   }

   public boolean id_class(rcZ_2 var1) {
      return var1 == null ? this == id_class : this.id_break == null || rco_3.id_class(this.id_break, var1, true);
   }

   public boolean id_class(an_3 var1) {
      return this == id_class ? true : this.id_class(id_break(var1));
   }

   public static rcd_3 id_break(an_3 var0) {
      rcd_3 var1 = var0.id_case(new rcd_3());
      if (var0 instanceof rhd_3) {
         rdn_3 var2 = ((rhz_3)((rhd_3)var0).id_implements[1]).id_byte();
         if (!var2.id_class()) {
            var1.id_class("SelectedItem", var2.id_break(new rcd_3()));
         }
      }

      return var1;
   }
}
