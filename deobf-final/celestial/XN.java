package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.mojang.serialization.JsonOps;
import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class XN {
   private static final Logger break_ = LogManager.getLogger();
   public static final XN class_ = new XN(
      Xm_1.throws_, Xm_1.throws_, Xm_1.throws_, (rqM_2<rYG>)null, (rrrZ<?>)null, (rqM_2<rYB>)null, (Boolean)null, XQ.class_, hO_2.class_, XS.class_
   );
   private final Xm_1 byte_;
   private final Xm_1 protected_;
   private final Xm_1 throws_;
   private final rqM_2<rYG> case_;
   private final rrrZ<?> catch_;
   private final rqM_2<rYB> private_;
   private final Boolean implements_;
   private final XQ finally_;
   private final hO_2 extends_;
   private final XS native_;

   public XN(Xm_1 var1, Xm_1 var2, Xm_1 var3, rqM_2<rYG> var4, rrrZ<?> var5, rqM_2<rYB> var6, Boolean var7, XQ var8, hO_2 var9, XS var10) {
      this.byte_ = var1;
      this.protected_ = var2;
      this.throws_ = var3;
      this.case_ = var4;
      this.catch_ = var5;
      this.private_ = var6;
      this.implements_ = var7;
      this.finally_ = var8;
      this.extends_ = var9;
      this.native_ = var10;
   }

   public boolean class_(rrEm_1 var1, float var2, float var3, float var4) {
      if (!this.byte_.break_(var2)) {
         return false;
      } else if (!this.protected_.break_(var3)) {
         return false;
      } else if (!this.throws_.break_(var4)) {
         return false;
      } else if (this.private_ != null && this.private_ != var1.E()) {
         return false;
      } else {
         rfH_2 var5 = new rfH_2((double)var2, (double)var3, (double)var4);
         boolean var6 = var1.synchronized_(var5);
         Optional var7 = var1.new_().break_(rVL.n).byte_(var1.implements_(var5));
         if (!var7.isPresent()) {
            return false;
         } else if (this.case_ == null || var6 && this.case_ == var7.get()) {
            if (this.catch_ == null || var6 && var1.protected_().class_(var5, true, this.catch_).throws_()) {
               if (this.implements_ == null || var6 && this.implements_ == xn_3.class_(var1, var5)) {
                  if (!this.finally_.class_(var1, var5)) {
                     return false;
                  } else {
                     return !this.extends_.class_(var1, var5) ? false : this.native_.class_(var1, var5);
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

   public static XN class_(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var1 = rpY_2.private_(var0, "location");
         JsonObject var2 = rpY_2.class_(var1, "position", new JsonObject());
         Xm_1 var3 = Xm_1.class_(var2.get("x"));
         Xm_1 var4 = Xm_1.class_(var2.get("y"));
         Xm_1 var5 = Xm_1.class_(var2.get("z"));
         rqM_2 var6 = var1.has("dimension")
            ? rqO_2.class_
               .parse(JsonOps.INSTANCE, var1.get("dimension"))
               .resultOrPartial(break_::error)
               .map(var0x -> rqM_2.class_(rVL.static_, var0x))
               .orElse((rqM_2)null)
            : null;
         rrrZ var7 = var1.has("feature") ? (rrrZ)rrrZ.class_.get(rpY_2.case_(var1, "feature")) : null;
         rqM_2 var8 = null;
         if (var1.has("biome")) {
            rqO_2 var9 = new rqO_2(rpY_2.case_(var1, "biome"));
            var8 = rqM_2.class_(rVL.n, var9);
         }

         Boolean var13 = var1.has("smokey") ? var1.get("smokey").getAsBoolean() : null;
         XQ var10 = XQ.class_(var1.get("light"));
         hO_2 var11 = hO_2.class_(var1.get("block"));
         XS var12 = XS.class_(var1.get("fluid"));
         return new XN(var3, var4, var5, var8, var7, var6, var13, var10, var11, var12);
      } else {
         return class_;
      }
   }

   public JsonElement class_() {
      if (this == class_) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject var1 = new JsonObject();
         if (!this.byte_.byte_() || !this.protected_.byte_() || !this.throws_.byte_()) {
            JsonObject var2 = new JsonObject();
            var2.add("x", this.byte_.protected_());
            var2.add("y", this.protected_.protected_());
            var2.add("z", this.throws_.protected_());
            var1.add("position", var2);
         }

         if (this.private_ != null) {
            rYB.break_.encodeStart(JsonOps.INSTANCE, this.private_).resultOrPartial(break_::error).ifPresent(var1x -> var1.add("dimension", var1x));
         }

         if (this.catch_ != null) {
            var1.addProperty("feature", this.catch_.catch_());
         }

         if (this.case_ != null) {
            var1.addProperty("biome", this.case_.class_().toString());
         }

         if (this.implements_ != null) {
            var1.addProperty("smokey", this.implements_);
         }

         var1.add("light", this.finally_.class_());
         var1.add("block", this.extends_.class_());
         var1.add("fluid", this.native_.class_());
         return var1;
      }
   }

   public static XN class_(rrrZ<?> var0) {
      return new XN(Xm_1.throws_, Xm_1.throws_, Xm_1.throws_, (rqM_2<rYG>)null, var0, (rqM_2<rYB>)null, (Boolean)null, XQ.class_, hO_2.class_, XS.class_);
   }

   public boolean class_(rrEm_1 var1, double var2, double var4, double var6) {
      return this.class_(var1, (float)var2, (float)var4, (float)var6);
   }

   public static XN class_(rqM_2<rYG> var0) {
      return new XN(Xm_1.throws_, Xm_1.throws_, Xm_1.throws_, var0, (rrrZ<?>)null, (rqM_2<rYB>)null, (Boolean)null, XQ.class_, hO_2.class_, XS.class_);
   }

   public static XN break_(rqM_2<rYB> var0) {
      return new XN(Xm_1.throws_, Xm_1.throws_, Xm_1.throws_, (rqM_2<rYG>)null, (rrrZ<?>)null, var0, (Boolean)null, XQ.class_, hO_2.class_, XS.class_);
   }
}
