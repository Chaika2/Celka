package celestial;

import com.mojang.brigadier.arguments.StringArgumentType;
import java.io.IOException;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rAp_1 implements AutoCloseable {
   private static final Logger id_class = LogManager.getLogger();
   private static final rAK id_break = new rAK(
      new rgn_3("resourcePack.broken_assets").id_class(new rgF_2[]{rgF_2.RED, rgF_2.ITALIC}), rqu_3.id_class().getPackVersion()
   );
   private final String id_byte;
   private final Supplier<rAC> id_protected;
   private final rgP_2 id_throws;
   private final rgP_2 id_case;
   private final rAl_1 id_catch;
   private final rAT id_private;
   private final boolean id_implements;
   private final boolean id_finally;
   private final rAZ id_extends;

   public rAl_1 id_byte() {
      return this.id_catch;
   }

   public rAp_1(String var1, boolean var2, Supplier<rAC> var3, rgP_2 var4, rgP_2 var5, rAl_1 var6, rAT var7, boolean var8, rAZ var9) {
      this.id_byte = var1;
      this.id_protected = var3;
      this.id_throws = var4;
      this.id_case = var5;
      this.id_catch = var6;
      this.id_implements = var2;
      this.id_private = var7;
      this.id_finally = var8;
      this.id_extends = var9;
   }

   public rAp_1(String var1, boolean var2, Supplier<rAC> var3, rAC var4, rAK var5, rAT var6, rAZ var7) {
      this(var1, var2, var3, new rgN_2(var4.id_class()), var5.id_class(), rAl_1.id_class(var5.id_break()), var6, false, var7);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof rAp_1 var2) ? false : this.id_byte.equals(var2.id_byte);
      }
   }

   @Override
   public int hashCode() {
      return this.id_byte.hashCode();
   }

   public static rAp_1 id_class(String var0, boolean var1, Supplier<rAC> var2, rAq_1 var3, rAT var4, rAZ var5) {
      try {
         rAp_1 var8;
         try (rAC var6 = (rAC)var2.get()) {
            rAK var7 = var6.id_class(rAK.id_class);
            if (var1 && var7 == null) {
               id_class.error(
                  "Broken/missing pack.mcmeta detected, fudging it into existance. Please check that your launcher has downloaded all assets for the game correctly!"
               );
               var7 = id_break;
            }

            if (var7 == null) {
               id_class.warn("Couldn't find pack meta for pack {}", var0);
               return null;
            }

            var8 = var3.create(var0, var1, var2, var6, var7, var4, var5);
         }

         return var8;
      } catch (IOException var11) {
         id_class.warn("Couldn't get pack info for: {}", var11.toString());
         return null;
      }
   }

   public rgP_2 id_class(boolean var1) {
      return rgv_3.id_class(this.id_extends.decorate(new rgN_2(this.id_byte)))
         .id_class(
            var2 -> var2.id_class(var1 ? rgF_2.GREEN : rgF_2.RED)
                  .id_class(StringArgumentType.escapeIfRequired(this.id_byte))
                  .id_class(new rgy_3(rgp_3.id_class, new rgN_2("").id_class(this.id_throws).id_break("\n").id_class(this.id_case)))
         );
   }

   public rgP_2 id_class() {
      return this.id_throws;
   }

   @Override
   public void close() {
   }

   public rgP_2 id_break() {
      return this.id_case;
   }

   public String id_throws() {
      return this.id_byte;
   }

   public boolean id_catch() {
      return this.id_finally;
   }

   public boolean id_case() {
      return this.id_implements;
   }

   public rAZ id_implements() {
      return this.id_extends;
   }

   public rAC id_protected() {
      return this.id_protected.get();
   }

   public rAT id_private() {
      return this.id_private;
   }
}
