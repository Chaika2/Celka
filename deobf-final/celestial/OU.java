package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class OU {
   private final rgP_2 class_;
   private final rgP_2 break_;
   private final rdn_3 byte_;
   private final rqO_2 protected_;
   private final Oe_1 throws_;
   private final boolean case_;
   private final boolean catch_;
   private final boolean private_;
   private float implements_;
   private float finally_;

   public rdn_3 byte_() {
      return this.byte_;
   }

   public OU(rdn_3 var1, rgP_2 var2, rgP_2 var3, rqO_2 var4, Oe_1 var5, boolean var6, boolean var7, boolean var8) {
      this.class_ = var2;
      this.break_ = var3;
      this.byte_ = var1;
      this.protected_ = var4;
      this.throws_ = var5;
      this.case_ = var6;
      this.catch_ = var7;
      this.private_ = var8;
   }

   public static OU class_(JsonObject var0) {
      rVi_1 var1 = rgB_2.class_(var0.get("title"));
      rVi_1 var2 = rgB_2.class_(var0.get("description"));
      if (var1 != null && var2 != null) {
         rdn_3 var3 = break_(rpY_2.native_(var0, "icon"));
         rqO_2 var4 = var0.has("background") ? new rqO_2(rpY_2.case_(var0, "background")) : null;
         Oe_1 var5 = var0.has("frame") ? Oe_1.class_(rpY_2.case_(var0, "frame")) : Oe_1.TASK;
         boolean var6 = rpY_2.class_(var0, "show_toast", true);
         boolean var7 = rpY_2.class_(var0, "announce_to_chat", true);
         boolean var8 = rpY_2.class_(var0, "hidden", false);
         return new OU(var3, var1, var2, var4, var5, var6, var7, var8);
      } else {
         throw new JsonSyntaxException("Both title and description must be set");
      }
   }

   public void class_(float var1, float var2) {
      this.implements_ = var1;
      this.finally_ = var2;
   }

   public void class_(ruu_3 var1) {
      var1.class_(this.class_);
      var1.class_(this.break_);
      var1.class_(this.byte_);
      var1.class_(this.throws_);
      byte var2 = 0;
      if (this.protected_ != null) {
         var2 |= 1;
      }

      if (this.case_) {
         var2 |= 2;
      }

      if (this.private_) {
         var2 |= 4;
      }

      var1.writeInt(var2);
      if (this.protected_ != null) {
         var1.class_(this.protected_);
      }

      var1.writeFloat(this.implements_);
      var1.writeFloat(this.finally_);
   }

   public rgP_2 class_() {
      return this.class_;
   }

   public static OU break_(ruu_3 var0) {
      rgP_2 var1 = var0.throws_();
      rgP_2 var2 = var0.throws_();
      rdn_3 var3 = var0.extends_();
      Oe_1 var4 = var0.class_(Oe_1.class);
      int var5 = var0.readInt();
      rqO_2 var6 = (var5 & 1) != 0 ? var0.volatile_() : null;
      boolean var7 = (var5 & 2) != 0;
      boolean var8 = (var5 & 4) != 0;
      OU var9 = new OU(var3, var1, var2, var6, var4, var7, false, var8);
      var9.class_(var0.readFloat(), var0.readFloat());
      return var9;
   }

   private static rdn_3 break_(JsonObject var0) {
      if (!var0.has("item")) {
         throw new JsonSyntaxException("Unsupported icon type, currently only items are supported (add 'item' key)");
      } else {
         rdb_3 var1 = rpY_2.catch_(var0, "item");
         if (var0.has("data")) {
            throw new JsonParseException("Disallowed data tag found");
         } else {
            rdn_3 var2 = new rdn_3(var1);
            if (var0.has("nbt")) {
               try {
                  rcd_3 var3 = rcH_2.class_(rpY_2.class_(var0.get("nbt"), "nbt"));
                  var2.byte_(var3);
               } catch (CommandSyntaxException var4) {
                  throw new JsonSyntaxException("Invalid nbt tag: " + var4.getMessage());
               }
            }

            return var2;
         }
      }
   }

   public rgP_2 break_() {
      return this.break_;
   }

   public Oe_1 throws_() {
      return this.throws_;
   }

   public boolean finally_() {
      return this.private_;
   }

   public float catch_() {
      return this.finally_;
   }

   public JsonElement extends_() {
      JsonObject var1 = new JsonObject();
      var1.add("icon", this.native_());
      var1.add("title", rgB_2.break_(this.class_));
      var1.add("description", rgB_2.break_(this.break_));
      var1.addProperty("frame", this.throws_.class_());
      var1.addProperty("show_toast", this.case_);
      var1.addProperty("announce_to_chat", this.catch_);
      var1.addProperty("hidden", this.private_);
      if (this.protected_ != null) {
         var1.addProperty("background", this.protected_.toString());
      }

      return var1;
   }

   public float case_() {
      return this.implements_;
   }

   public boolean implements_() {
      return this.catch_;
   }

   public rqO_2 protected_() {
      return this.protected_;
   }

   public boolean private_() {
      return this.case_;
   }

   private JsonObject native_() {
      JsonObject var1 = new JsonObject();
      var1.addProperty("item", rVL.for_.break_(this.byte_.break_()).toString());
      if (this.byte_.final_()) {
         var1.addProperty("nbt", this.byte_.package_().toString());
      }

      return var1;
   }
}
