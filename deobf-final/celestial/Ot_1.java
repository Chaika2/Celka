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
   private rqO_2 class_;
   private OT break_;
   private OU byte_;
   private Og_1 protected_ = Og_1.class_;
   private Map<String, OK> throws_ = Maps.newLinkedHashMap();
   private String[][] case_;
   private hS_2 catch_ = hS_2.class_;

   public Map<String, OK> byte_() {
      return this.throws_;
   }

   Ot_1(rqO_2 var1, OU var2, Og_1 var3, Map<String, OK> var4, String[][] var5) {
      this.class_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
      this.throws_ = var4;
      this.case_ = var5;
   }

   private Ot_1() {
   }

   @Override
   public String toString() {
      return "Task Advancement{parentId="
         + this.class_
         + ", display="
         + this.byte_
         + ", rewards="
         + this.protected_
         + ", criteria="
         + this.throws_
         + ", requirements="
         + Arrays.deepToString(this.case_)
         + "}";
   }

   public boolean class_(Function<rqO_2, OT> var1) {
      if (this.class_ == null) {
         return true;
      } else {
         if (this.break_ == null) {
            this.break_ = (OT)var1.apply(this.class_);
         }

         return this.break_ != null;
      }
   }

   public OT class_(Consumer<OT> var1, String var2) {
      OT var3 = this.break_(new rqO_2(var2));
      var1.accept(var3);
      return var3;
   }

   public static Ot_1 class_() {
      return new Ot_1();
   }

   public Ot_1 class_(hS_2 var1) {
      this.catch_ = var1;
      return this;
   }

   public void class_(ruu_3 var1) {
      if (this.class_ == null) {
         var1.writeBoolean(false);
      } else {
         var1.writeBoolean(true);
         var1.class_(this.class_);
      }

      if (this.byte_ == null) {
         var1.writeBoolean(false);
      } else {
         var1.writeBoolean(true);
         this.byte_.class_(var1);
      }

      OK.class_(this.throws_, var1);
      var1.protected_(this.case_.length);

      for (String[] var5 : this.case_) {
         var1.protected_(var5.length);

         for (String var9 : var5) {
            var1.class_(var9);
         }
      }
   }

   public static Ot_1 class_(JsonObject var0, rWl_1 var1) {
      rqO_2 var2 = var0.has("parent") ? new rqO_2(rpY_2.case_(var0, "parent")) : null;
      OU var3 = var0.has("display") ? OU.class_(rpY_2.native_(var0, "display")) : null;
      Og_1 var4 = var0.has("rewards") ? Og_1.class_(rpY_2.native_(var0, "rewards")) : Og_1.class_;
      Map var5 = OK.break_(rpY_2.native_(var0, "criteria"), var1);
      if (var5.isEmpty()) {
         throw new JsonSyntaxException("Advancement criteria cannot be empty");
      } else {
         JsonArray var6 = rpY_2.class_(var0, "requirements", new JsonArray());
         String[][] var7 = new String[var6.size()][];

         for (int var8 = 0; var8 < var6.size(); var8++) {
            JsonArray var9 = rpY_2.implements_(var6.get(var8), "requirements[" + var8 + "]");
            var7[var8] = new String[var9.size()];

            for (int var10 = 0; var10 < var9.size(); var10++) {
               var7[var8][var10] = rpY_2.class_(var9.get(var10), "requirements[" + var8 + "][" + var10 + "]");
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

   public Ot_1 class_(String var1, OK var2) {
      if (this.throws_.containsKey(var1)) {
         throw new IllegalArgumentException("Duplicate criterion " + var1);
      } else {
         this.throws_.put(var1, var2);
         return this;
      }
   }

   public Ot_1 class_(OU var1) {
      this.byte_ = var1;
      return this;
   }

   public Ot_1 class_(rpL_2 var1, rgP_2 var2, rgP_2 var3, rqO_2 var4, Oe_1 var5, boolean var6, boolean var7, boolean var8) {
      return this.class_(new OU(new rdn_3(var1.case_()), var2, var3, var4, var5, var6, var7, var8));
   }

   public Ot_1 class_(rdn_3 var1, rgP_2 var2, rgP_2 var3, rqO_2 var4, Oe_1 var5, boolean var6, boolean var7, boolean var8) {
      return this.class_(new OU(var1, var2, var3, var4, var5, var6, var7, var8));
   }

   public Ot_1 class_(rqO_2 var1) {
      this.class_ = var1;
      return this;
   }

   public Ot_1 class_(OT var1) {
      this.break_ = var1;
      return this;
   }

   public Ot_1 class_(Og_1 var1) {
      this.protected_ = var1;
      return this;
   }

   public Ot_1 class_(OR var1) {
      return this.class_(var1.class_());
   }

   public Ot_1 class_(String var1, hr_3 var2) {
      return this.class_(var1, new OK(var2));
   }

   public JsonObject break_() {
      if (this.case_ == null) {
         this.case_ = this.catch_.createRequirements(this.throws_.keySet());
      }

      JsonObject var1 = new JsonObject();
      if (this.break_ != null) {
         var1.addProperty("parent", this.break_.private_().toString());
      } else if (this.class_ != null) {
         var1.addProperty("parent", this.class_.toString());
      }

      if (this.byte_ != null) {
         var1.add("display", this.byte_.extends_());
      }

      var1.add("rewards", this.protected_.class_());
      JsonObject var2 = new JsonObject();

      for (Entry var4 : this.throws_.entrySet()) {
         var2.add((String)var4.getKey(), ((OK)var4.getValue()).break_());
      }

      var1.add("criteria", var2);
      JsonArray var13 = new JsonArray();

      for (String[] var7 : this.case_) {
         JsonArray var8 = new JsonArray();

         for (String var12 : var7) {
            var8.add(var12);
         }

         var13.add(var8);
      }

      var1.add("requirements", var13);
      return var1;
   }

   public static Ot_1 break_(ruu_3 var0) {
      rqO_2 var1 = var0.readBoolean() ? var0.volatile_() : null;
      OU var2 = var0.readBoolean() ? OU.break_(var0) : null;
      Map var3 = OK.byte_(var0);
      String[][] var4 = new String[var0.case_()][];

      for (int var5 = 0; var5 < var4.length; var5++) {
         var4[var5] = new String[var0.case_()];

         for (int var6 = 0; var6 < var4[var5].length; var6++) {
            var4[var5][var6] = var0.throws_(32767);
         }
      }

      return new Ot_1(var1, var2, Og_1.class_, var3, var4);
   }

   public OT break_(rqO_2 var1) {
      if (!this.class_(var0 -> null)) {
         throw new IllegalStateException("Tried to build incomplete advancement!");
      } else {
         if (this.case_ == null) {
            this.case_ = this.catch_.createRequirements(this.throws_.keySet());
         }

         return new OT(var1, this.break_, this.byte_, this.protected_, this.throws_, this.case_);
      }
   }
}
