package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class OU {
   private final rgP_2 id_class;
   private final rgP_2 id_break;
   private final rdn_3 id_byte;
   private final rqO_2 id_protected;
   private final Oe_1 id_throws;
   private final boolean id_case;
   private final boolean id_catch;
   private final boolean id_private;
   private float id_implements;
   private float id_finally;

   public rdn_3 id_byte() {
      return this.id_byte;
   }

   public OU(rdn_3 var1, rgP_2 var2, rgP_2 var3, rqO_2 var4, Oe_1 var5, boolean var6, boolean var7, boolean var8) {
      this.id_class = var2;
      this.id_break = var3;
      this.id_byte = var1;
      this.id_protected = var4;
      this.id_throws = var5;
      this.id_case = var6;
      this.id_catch = var7;
      this.id_private = var8;
   }

   public static OU id_class(JsonObject var0) {
      rVi_1 var1 = rgB_2.id_class(var0.get("title"));
      rVi_1 var2 = rgB_2.id_class(var0.get("description"));
      if (var1 != null && var2 != null) {
         rdn_3 var3 = id_break(rpY_2.id_native(var0, "icon"));
         rqO_2 var4 = var0.has("background") ? new rqO_2(rpY_2.id_case(var0, "background")) : null;
         Oe_1 var5 = var0.has("frame") ? Oe_1.id_class(rpY_2.id_case(var0, "frame")) : Oe_1.TASK;
         boolean var6 = rpY_2.id_class(var0, "show_toast", true);
         boolean var7 = rpY_2.id_class(var0, "announce_to_chat", true);
         boolean var8 = rpY_2.id_class(var0, "hidden", false);
         return new OU(var3, var1, var2, var4, var5, var6, var7, var8);
      } else {
         throw new JsonSyntaxException("Both title and description must be set");
      }
   }

   public void id_class(float var1, float var2) {
      this.id_implements = var1;
      this.id_finally = var2;
   }

   public void id_class(ruu_3 var1) {
      var1.id_class(this.id_class);
      var1.id_class(this.id_break);
      var1.id_class(this.id_byte);
      var1.id_class(this.id_throws);
      byte var2 = 0;
      if (this.id_protected != null) {
         var2 |= 1;
      }

      if (this.id_case) {
         var2 |= 2;
      }

      if (this.id_private) {
         var2 |= 4;
      }

      var1.writeInt(var2);
      if (this.id_protected != null) {
         var1.id_class(this.id_protected);
      }

      var1.writeFloat(this.id_implements);
      var1.writeFloat(this.id_finally);
   }

   public rgP_2 id_class() {
      return this.id_class;
   }

   public static OU id_break(ruu_3 var0) {
      rgP_2 var1 = var0.id_throws();
      rgP_2 var2 = var0.id_throws();
      rdn_3 var3 = var0.id_extends();
      Oe_1 var4 = var0.id_class(Oe_1.class);
      int var5 = var0.readInt();
      rqO_2 var6 = (var5 & 1) != 0 ? var0.id_volatile() : null;
      boolean var7 = (var5 & 2) != 0;
      boolean var8 = (var5 & 4) != 0;
      OU var9 = new OU(var3, var1, var2, var6, var4, var7, false, var8);
      var9.id_class(var0.readFloat(), var0.readFloat());
      return var9;
   }

   private static rdn_3 id_break(JsonObject var0) {
      if (!var0.has("item")) {
         throw new JsonSyntaxException("Unsupported icon type, currently only items are supported (add 'item' key)");
      } else {
         rdb_3 var1 = rpY_2.id_catch(var0, "item");
         if (var0.has("data")) {
            throw new JsonParseException("Disallowed data tag found");
         } else {
            rdn_3 var2 = new rdn_3(var1);
            if (var0.has("nbt")) {
               try {
                  rcd_3 var3 = rcH_2.id_class(rpY_2.id_class(var0.get("nbt"), "nbt"));
                  var2.id_byte(var3);
               } catch (CommandSyntaxException var4) {
                  throw new JsonSyntaxException("Invalid nbt tag: " + var4.getMessage());
               }
            }

            return var2;
         }
      }
   }

   public rgP_2 id_break() {
      return this.id_break;
   }

   public Oe_1 id_throws() {
      return this.id_throws;
   }

   public boolean id_finally() {
      return this.id_private;
   }

   public float id_catch() {
      return this.id_finally;
   }

   public JsonElement id_extends() {
      JsonObject var1 = new JsonObject();
      var1.add("icon", this.id_native());
      var1.add("title", rgB_2.id_break(this.id_class));
      var1.add("description", rgB_2.id_break(this.id_break));
      var1.addProperty("frame", this.id_throws.id_class());
      var1.addProperty("show_toast", this.id_case);
      var1.addProperty("announce_to_chat", this.id_catch);
      var1.addProperty("hidden", this.id_private);
      if (this.id_protected != null) {
         var1.addProperty("background", this.id_protected.toString());
      }

      return var1;
   }

   public float id_case() {
      return this.id_implements;
   }

   public boolean id_implements() {
      return this.id_catch;
   }

   public rqO_2 id_protected() {
      return this.id_protected;
   }

   public boolean id_private() {
      return this.id_case;
   }

   private JsonObject id_native() {
      JsonObject var1 = new JsonObject();
      var1.addProperty("item", rVL.id_for.id_break(this.id_byte.id_break()).toString());
      if (this.id_byte.id_final()) {
         var1.addProperty("nbt", this.id_byte.id_package().toString());
      }

      return var1;
   }
}
