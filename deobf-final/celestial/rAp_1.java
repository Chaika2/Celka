package celestial;

import com.mojang.brigadier.arguments.StringArgumentType;
import java.io.IOException;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rAp_1 implements AutoCloseable {
   private static final Logger class_ = LogManager.getLogger();
   private static final rAK break_ = new rAK(
      new rgn_3("resourcePack.broken_assets").class_(new rgF_2[]{rgF_2.RED, rgF_2.ITALIC}), rqu_3.class_().getPackVersion()
   );
   private final String byte_;
   private final Supplier<rAC> protected_;
   private final rgP_2 throws_;
   private final rgP_2 case_;
   private final rAl_1 catch_;
   private final rAT private_;
   private final boolean implements_;
   private final boolean finally_;
   private final rAZ extends_;

   public rAl_1 byte_() {
      return this.catch_;
   }

   public rAp_1(String var1, boolean var2, Supplier<rAC> var3, rgP_2 var4, rgP_2 var5, rAl_1 var6, rAT var7, boolean var8, rAZ var9) {
      this.byte_ = var1;
      this.protected_ = var3;
      this.throws_ = var4;
      this.case_ = var5;
      this.catch_ = var6;
      this.implements_ = var2;
      this.private_ = var7;
      this.finally_ = var8;
      this.extends_ = var9;
   }

   public rAp_1(String var1, boolean var2, Supplier<rAC> var3, rAC var4, rAK var5, rAT var6, rAZ var7) {
      this(var1, var2, var3, new rgN_2(var4.class_()), var5.class_(), rAl_1.class_(var5.break_()), var6, false, var7);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof rAp_1 var2) ? false : this.byte_.equals(var2.byte_);
      }
   }

   @Override
   public int hashCode() {
      return this.byte_.hashCode();
   }

   public static rAp_1 class_(String var0, boolean var1, Supplier<rAC> var2, rAq_1 var3, rAT var4, rAZ var5) {
      try {
         rAp_1 var8;
         try (rAC var6 = (rAC)var2.get()) {
            rAK var7 = var6.class_(rAK.class_);
            if (var1 && var7 == null) {
               class_.error(
                  "Broken/missing pack.mcmeta detected, fudging it into existance. Please check that your launcher has downloaded all assets for the game correctly!"
               );
               var7 = break_;
            }

            if (var7 == null) {
               class_.warn("Couldn't find pack meta for pack {}", var0);
               return null;
            }

            var8 = var3.create(var0, var1, var2, var6, var7, var4, var5);
         }

         return var8;
      } catch (IOException var11) {
         class_.warn("Couldn't get pack info for: {}", var11.toString());
         return null;
      }
   }

   public rgP_2 class_(boolean var1) {
      return rgv_3.class_(this.extends_.decorate(new rgN_2(this.byte_)))
         .class_(
            var2 -> var2.class_(var1 ? rgF_2.GREEN : rgF_2.RED)
                  .class_(StringArgumentType.escapeIfRequired(this.byte_))
                  .class_(new rgy_3(rgp_3.class_, new rgN_2("").class_(this.throws_).break_("\n").class_(this.case_)))
         );
   }

   public rgP_2 class_() {
      return this.throws_;
   }

   @Override
   public void close() {
   }

   public rgP_2 break_() {
      return this.case_;
   }

   public String throws_() {
      return this.byte_;
   }

   public boolean catch_() {
      return this.finally_;
   }

   public boolean case_() {
      return this.implements_;
   }

   public rAZ implements_() {
      return this.extends_;
   }

   public rAC protected_() {
      return this.protected_.get();
   }

   public rAT private_() {
      return this.private_;
   }
}
