package celestial;

import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Function;
import org.apache.commons.lang3.ArrayUtils;

public class Ot_1 {
   private rqO_2 id_class;
   private OT id_break;
   private OU id_byte;
   private Og_1 id_protected = Og_1.id_class;
   private Map<String, OK> id_throws = Maps.newLinkedHashMap();
   private String[][] id_case;
   private hS_2 id_catch = hS_2.id_class;

   public Map<String, OK> id_byte() {
      return this.id_throws;
   }

   Ot_1(rqO_2 var1, OU var2, Og_1 var3, Map<String, OK> var4, String[][] var5) {
      this.id_class = var1;
      this.id_byte = var2;
      this.id_protected = var3;
      this.id_throws = var4;
      this.id_case = var5;
   }

   private Ot_1() {
   }

   @Override
   public String toString() {
      return "Task Advancement{parentId="
         + this.id_class
         + ", display="
         + this.id_byte
         + ", rewards="
         + this.id_protected
         + ", criteria="
         + this.id_throws
         + ", requirements="
         + Arrays.deepToString(this.id_case)
         + "}";
   }

   public boolean id_class(Function<rqO_2, OT> var1) {
      if (this.id_class == null) {
         return true;
      } else {
         if (this.id_break == null) {
            this.id_break = (OT)var1.apply(this.id_class);
         }

         return this.id_break != null;
      }
   }

   public OT id_class(Consumer<OT> var1, String var2) {
      OT var3 = this.id_break(new rqO_2(var2));
      var1.accept(var3);
      return var3;
   }

   public static Ot_1 id_class() {
      return new Ot_1();
   }

   public Ot_1 id_class(hS_2 var1) {
      this.id_catch = var1;
      return this;
   }

   public void id_class(ruu_3 var1) {
      if (this.id_class == null) {
         var1.writeBoolean(false);
      } else {
         var1.writeBoolean(true);
         var1.id_class(this.id_class);
      }

      if (this.id_byte == null) {
         var1.writeBoolean(false);
      } else {
         var1.writeBoolean(true);
         this.id_byte.id_class(var1);
      }

      OK.id_class(this.id_throws, var1);
      var1.id_protected(this.id_case.length);

      for (String[] var5 : this.id_case) {
         var1.id_protected(var5.length);

         for (String var9 : var5) {
            var1.id_class(var9);
         }
      }
   }

   public static Ot_1 id_class(JsonObject var0, rWl_1 var1) {
      rqO_2 var2 = var0.has("parent") ? new rqO_2(rpY_2.id_case(var0, "parent")) : null;
      OU var3 = var0.has("display") ? OU.id_class(rpY_2.id_native(var0, "display")) : null;
      Og_1 var4 = var0.has("rewards") ? Og_1.id_class(rpY_2.id_native(var0, "rewards")) : Og_1.id_class;
      Map var5 = OK.id_break(rpY_2.id_native(var0, "criteria"), var1);
      if (var5.isEmpty()) {
         throw new JsonSyntaxException("Advancement criteria cannot be empty");
      } else {
         JsonArray var6 = rpY_2.id_class(var0, "requirements", new JsonArray());
         String[][] var7 = new String[var6.size()][];

         for (int var8 = 0; var8 < var6.size(); var8++) {
            JsonArray var9 = rpY_2.id_implements(var6.get(var8), "requirements[" + var8 + "]");
            var7[var8] = new String[var9.size()];

            for (int var10 = 0; var10 < var9.size(); var10++) {
               var7[var8][var10] = rpY_2.id_class(var9.get(var10), "requirements[" + var8 + "][" + var10 + "]");
            }
         }

         if (var7.length == 0) {
            var7 = new String[var5.size()][];
            int var16 = 0;

            for (String var22 : var5.keySet()) {
               var7[var16++] = new String[]{var22};
            }
         }

         for (String[] var11 : var7) {
            if (var11.length == 0 && var5.isEmpty()) {
               throw new JsonSyntaxException("Requirement entry cannot be empty");
            }

            for (String var15 : var11) {
               if (!var5.containsKey(var15)) {
                  throw new JsonSyntaxException("Unknown required criterion '" + var15 + "'");
               }
            }
         }

         for (String var21 : var5.keySet()) {
            boolean var24 = false;

            for (String[] var28 : var7) {
               if (ArrayUtils.contains(var28, var21)) {
                  var24 = true;
                  break;
               }
            }

            if (!var24) {
               throw new JsonSyntaxException(
                  "Criterion '" + var21 + "' isn't a requirement for completion. This isn't supported behaviour, all criteria must be required."
               );
            }
         }

         return new Ot_1(var2, var3, var4, var5, var7);
      }
   }

   public Ot_1 id_class(String var1, OK var2) {
      if (this.id_throws.containsKey(var1)) {
         throw new IllegalArgumentException("Duplicate criterion " + var1);
      } else {
         this.id_throws.put(var1, var2);
         return this;
      }
   }

   public Ot_1 id_class(OU var1) {
      this.id_byte = var1;
      return this;
   }

   public Ot_1 id_class(rpL_2 var1, rgP_2 var2, rgP_2 var3, rqO_2 var4, Oe_1 var5, boolean var6, boolean var7, boolean var8) {
      return this.id_class(new OU(new rdn_3(var1.id_case()), var2, var3, var4, var5, var6, var7, var8));
   }

   public Ot_1 id_class(rdn_3 var1, rgP_2 var2, rgP_2 var3, rqO_2 var4, Oe_1 var5, boolean var6, boolean var7, boolean var8) {
      return this.id_class(new OU(var1, var2, var3, var4, var5, var6, var7, var8));
   }

   public Ot_1 id_class(rqO_2 var1) {
      this.id_class = var1;
      return this;
   }

   public Ot_1 id_class(OT var1) {
      this.id_break = var1;
      return this;
   }

   public Ot_1 id_class(Og_1 var1) {
      this.id_protected = var1;
      return this;
   }

   public Ot_1 id_class(OR var1) {
      return this.id_class(var1.id_class());
   }

   public Ot_1 id_class(String var1, hr_3 var2) {
      return this.id_class(var1, new OK(var2));
   }

   public JsonObject id_break() {
      if (this.id_case == null) {
         this.id_case = this.id_catch.createRequirements(this.id_throws.keySet());
      }

      JsonObject var1 = new JsonObject();
      if (this.id_break != null) {
         var1.addProperty("parent", this.id_break.id_private().toString());
      } else if (this.id_class != null) {
         var1.addProperty("parent", this.id_class.toString());
      }

      if (this.id_byte != null) {
         var1.add("display", this.id_byte.id_extends());
      }

      var1.add("rewards", this.id_protected.id_class());
      JsonObject var2 = new JsonObject();

      for (Entry var4 : this.id_throws.entrySet()) {
         var2.add((String)var4.getKey(), ((OK)var4.getValue()).id_break());
      }

      var1.add("criteria", var2);
      JsonArray var13 = new JsonArray();

      for (String[] var7 : this.id_case) {
         JsonArray var8 = new JsonArray();

         for (String var12 : var7) {
            var8.add(var12);
         }

         var13.add(var8);
      }

      var1.add("requirements", var13);
      return var1;
   }

   public static Ot_1 id_break(ruu_3 var0) {
      rqO_2 var1 = var0.readBoolean() ? var0.id_volatile() : null;
      OU var2 = var0.readBoolean() ? OU.id_break(var0) : null;
      Map var3 = OK.id_byte(var0);
      String[][] var4 = new String[var0.id_case()][];

      for (int var5 = 0; var5 < var4.length; var5++) {
         var4[var5] = new String[var0.id_case()];

         for (int var6 = 0; var6 < var4[var5].length; var6++) {
            var4[var5][var6] = var0.id_throws(32767);
         }
      }

      return new Ot_1(var1, var2, Og_1.id_class, var3, var4);
   }

   public OT id_break(rqO_2 var1) {
      if (!this.id_class(var0 -> null)) {
         throw new IllegalStateException("Tried to build incomplete advancement!");
      } else {
         if (this.id_case == null) {
            this.id_case = this.id_catch.createRequirements(this.id_throws.keySet());
         }

         return new OT(var1, this.id_break, this.id_byte, this.id_protected, this.id_throws, this.id_case);
      }
   }
}
