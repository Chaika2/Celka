package celestial;

import com.google.common.collect.Lists;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class rgq_3 {
   public final aI_2<?> id_class;
   public final UUID id_break;
   public final rgP_2 id_byte;
   private List<rgP_2> id_protected;

   public rgq_3(aI_2<?> var1, UUID var2, rgP_2 var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rgq_3 var2 = (rgq_3)var1;
         return this.id_class.equals(var2.id_class) && this.id_break.equals(var2.id_break) && Objects.equals(this.id_byte, var2.id_byte);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.id_class.hashCode();
      var1 = 31 * var1 + this.id_break.hashCode();
      return 31 * var1 + (this.id_byte != null ? this.id_byte.hashCode() : 0);
   }

   public JsonElement id_class() {
      JsonObject var1 = new JsonObject();
      var1.addProperty("type", rVL.id_transient.id_break(this.id_class).toString());
      var1.addProperty("id", this.id_break.toString());
      if (this.id_byte != null) {
         var1.add("name", rgB_2.id_break(this.id_byte));
      }

      return var1;
   }

   public static rgq_3 id_class(JsonElement var0) {
      if (!var0.isJsonObject()) {
         return null;
      } else {
         JsonObject var1 = var0.getAsJsonObject();
         aI_2 var2 = rVL.id_transient.id_class(new rqO_2(rpY_2.id_case(var1, "type")));
         UUID var3 = UUID.fromString(rpY_2.id_case(var1, "id"));
         rVi_1 var4 = rgB_2.id_class(var1.get("name"));
         return new rgq_3(var2, var3, var4);
      }
   }

   public static rgq_3 id_class(rgP_2 var0) {
      try {
         rcd_3 var1 = rcH_2.id_class(var0.getString());
         rVi_1 var2 = rgB_2.id_class(var1.id_native("name"));
         aI_2 var3 = rVL.id_transient.id_class(new rqO_2(var1.id_native("type")));
         UUID var4 = UUID.fromString(var1.id_native("id"));
         return new rgq_3(var3, var4, var2);
      } catch (JsonSyntaxException | CommandSyntaxException var5) {
         return null;
      }
   }

   public List<rgP_2> id_break() {
      if (this.id_protected == null) {
         this.id_protected = Lists.newArrayList();
         if (this.id_byte != null) {
            this.id_protected.add(this.id_byte);
         }

         this.id_protected.add(new rgn_3("gui.entity_tooltip.type", this.id_class.id_implements()));
         this.id_protected.add(new rgN_2(this.id_break.toString()));
      }

      return this.id_protected;
   }
}
