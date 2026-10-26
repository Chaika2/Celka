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
   public final aI_2<?> class_;
   public final UUID break_;
   public final rgP_2 byte_;
   private List<rgP_2> protected_;

   public rgq_3(aI_2<?> var1, UUID var2, rgP_2 var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rgq_3 var2 = (rgq_3)var1;
         return this.class_.equals(var2.class_) && this.break_.equals(var2.break_) && Objects.equals(this.byte_, var2.byte_);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.class_.hashCode();
      var1 = 31 * var1 + this.break_.hashCode();
      return 31 * var1 + (this.byte_ != null ? this.byte_.hashCode() : 0);
   }

   public JsonElement class_() {
      JsonObject var1 = new JsonObject();
      var1.addProperty("type", rVL.transient_.break_(this.class_).toString());
      var1.addProperty("id", this.break_.toString());
      if (this.byte_ != null) {
         var1.add("name", rgB_2.break_(this.byte_));
      }

      return var1;
   }

   public static rgq_3 class_(JsonElement var0) {
      if (!var0.isJsonObject()) {
         return null;
      } else {
         JsonObject var1 = var0.getAsJsonObject();
         aI_2 var2 = rVL.transient_.class_(new rqO_2(rpY_2.case_(var1, "type")));
         UUID var3 = UUID.fromString(rpY_2.case_(var1, "id"));
         rVi_1 var4 = rgB_2.class_(var1.get("name"));
         return new rgq_3(var2, var3, var4);
      }
   }

   public static rgq_3 class_(rgP_2 var0) {
      try {
         rcd_3 var1 = rcH_2.class_(var0.getString());
         rVi_1 var2 = rgB_2.class_(var1.native_("name"));
         aI_2 var3 = rVL.transient_.class_(new rqO_2(var1.native_("type")));
         UUID var4 = UUID.fromString(var1.native_("id"));
         return new rgq_3(var3, var4, var2);
      } catch (JsonSyntaxException | CommandSyntaxException var5) {
         return null;
      }
   }

   public List<rgP_2> break_() {
      if (this.protected_ == null) {
         this.protected_ = Lists.newArrayList();
         if (this.byte_ != null) {
            this.protected_.add(this.byte_);
         }

         this.protected_.add(new rgn_3("gui.entity_tooltip.type", this.class_.implements_()));
         this.protected_.add(new rgN_2(this.break_.toString()));
      }

      return this.protected_;
   }
}
