package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.mojang.serialization.JsonOps;
import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class XN {
   private static final Logger id_break = LogManager.getLogger();
   public static final XN id_class = new XN(
      Xm_1.id_throws, Xm_1.id_throws, Xm_1.id_throws, (rqM_2<rYG>)null, (rrrZ<?>)null, (rqM_2<rYB>)null, (Boolean)null, XQ.id_class, hO_2.id_class, XS.id_class
   );
   private final Xm_1 id_byte;
   private final Xm_1 id_protected;
   private final Xm_1 id_throws;
   private final rqM_2<rYG> id_case;
   private final rrrZ<?> id_catch;
   private final rqM_2<rYB> id_private;
   private final Boolean id_implements;
   private final XQ id_finally;
   private final hO_2 id_extends;
   private final XS id_native;

   public XN(Xm_1 var1, Xm_1 var2, Xm_1 var3, rqM_2<rYG> var4, rrrZ<?> var5, rqM_2<rYB> var6, Boolean var7, XQ var8, hO_2 var9, XS var10) {
      this.id_byte = var1;
      this.id_protected = var2;
      this.id_throws = var3;
      this.id_case = var4;
      this.id_catch = var5;
      this.id_private = var6;
      this.id_implements = var7;
      this.id_finally = var8;
      this.id_extends = var9;
      this.id_native = var10;
   }

   public boolean id_class(rrEm_1 var1, float var2, float var3, float var4) {
      if (!this.id_byte.id_break(var2)) {
         return false;
      } else if (!this.id_protected.id_break(var3)) {
         return false;
      } else if (!this.id_throws.id_break(var4)) {
         return false;
      } else if (this.id_private != null && this.id_private != var1.E()) {
         return false;
      } else {
         rfH_2 var5 = new rfH_2((double)var2, (double)var3, (double)var4);
         boolean var6 = var1.id_synchronized(var5);
         Optional var7 = var1.id_new().id_break(rVL.n).id_byte(var1.id_implements(var5));
         if (!var7.isPresent()) {
            return false;
         } else if (this.id_case == null || var6 && this.id_case == var7.get()) {
            if (this.id_catch == null || var6 && var1.id_protected().id_class(var5, true, this.id_catch).id_throws()) {
               if (this.id_implements == null || var6 && this.id_implements == xn_3.id_class(var1, var5)) {
                  if (!this.id_finally.id_class(var1, var5)) {
                     return false;
                  } else {
                     return !this.id_extends.id_class(var1, var5) ? false : this.id_native.id_class(var1, var5);
                  }
               } else {
                  return false;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   public static XN id_class(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var1 = rpY_2.id_private(var0, "location");
         JsonObject var2 = rpY_2.id_class(var1, "position", new JsonObject());
         Xm_1 var3 = Xm_1.id_class(var2.get("x"));
         Xm_1 var4 = Xm_1.id_class(var2.get("y"));
         Xm_1 var5 = Xm_1.id_class(var2.get("z"));
         rqM_2 var6 = var1.has("dimension")
            ? rqO_2.id_class
               .parse(JsonOps.INSTANCE, var1.get("dimension"))
               .resultOrPartial(id_break::error)
               .map(var0x -> rqM_2.id_class(rVL.id_static, var0x))
               .orElse((rqM_2)null)
            : null;
         rrrZ var7 = var1.has("feature") ? (rrrZ)rrrZ.id_class.get(rpY_2.id_case(var1, "feature")) : null;
         rqM_2 var8 = null;
         if (var1.has("biome")) {
            rqO_2 var9 = new rqO_2(rpY_2.id_case(var1, "biome"));
            var8 = rqM_2.id_class(rVL.n, var9);
         }

         Boolean var13 = var1.has("smokey") ? var1.get("smokey").getAsBoolean() : null;
         XQ var10 = XQ.id_class(var1.get("light"));
         hO_2 var11 = hO_2.id_class(var1.get("block"));
         XS var12 = XS.id_class(var1.get("fluid"));
         return new XN(var3, var4, var5, var8, var7, var6, var13, var10, var11, var12);
      } else {
         return id_class;
      }
   }

   public JsonElement id_class() {
      if (this == id_class) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject var1 = new JsonObject();
         if (!this.id_byte.id_byte() || !this.id_protected.id_byte() || !this.id_throws.id_byte()) {
            JsonObject var2 = new JsonObject();
            var2.add("x", this.id_byte.id_protected());
            var2.add("y", this.id_protected.id_protected());
            var2.add("z", this.id_throws.id_protected());
            var1.add("position", var2);
         }

         if (this.id_private != null) {
            rYB.id_break.encodeStart(JsonOps.INSTANCE, this.id_private).resultOrPartial(id_break::error).ifPresent(var1x -> var1.add("dimension", var1x));
         }

         if (this.id_catch != null) {
            var1.addProperty("feature", this.id_catch.id_catch());
         }

         if (this.id_case != null) {
            var1.addProperty("biome", this.id_case.id_class().toString());
         }

         if (this.id_implements != null) {
            var1.addProperty("smokey", this.id_implements);
         }

         var1.add("light", this.id_finally.id_class());
         var1.add("block", this.id_extends.id_class());
         var1.add("fluid", this.id_native.id_class());
         return var1;
      }
   }

   public static XN id_class(rrrZ<?> var0) {
      return new XN(
         Xm_1.id_throws, Xm_1.id_throws, Xm_1.id_throws, (rqM_2<rYG>)null, var0, (rqM_2<rYB>)null, (Boolean)null, XQ.id_class, hO_2.id_class, XS.id_class
      );
   }

   public boolean id_class(rrEm_1 var1, double var2, double var4, double var6) {
      return this.id_class(var1, (float)var2, (float)var4, (float)var6);
   }

   public static XN id_class(rqM_2<rYG> var0) {
      return new XN(
         Xm_1.id_throws, Xm_1.id_throws, Xm_1.id_throws, var0, (rrrZ<?>)null, (rqM_2<rYB>)null, (Boolean)null, XQ.id_class, hO_2.id_class, XS.id_class
      );
   }

   public static XN id_break(rqM_2<rYB> var0) {
      return new XN(
         Xm_1.id_throws, Xm_1.id_throws, Xm_1.id_throws, (rqM_2<rYG>)null, (rrrZ<?>)null, var0, (Boolean)null, XQ.id_class, hO_2.id_class, XS.id_class
      );
   }
}
