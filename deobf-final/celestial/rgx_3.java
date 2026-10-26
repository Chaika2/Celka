package celestial;

import com.google.common.base.Joiner;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class rgx_3 extends rgZ_2 implements rgr_3 {
   private static final Logger catch_ = LogManager.getLogger();
   protected final boolean byte_;
   protected final String protected_;
   protected final YJ throws_;

   protected rgx_3(String var1, YJ var2, boolean var3) {
      this.protected_ = var1;
      this.throws_ = var2;
      this.byte_ = var3;
   }

   public rgx_3(String var1, boolean var2) {
      this(var1, class_(var1), var2);
   }

   @Override
   public rVi_1 class_(gy_3 var1, an_3 var2, int var3) throws CommandSyntaxException {
      if (var1 != null && this.throws_ != null) {
         Stream var4 = this.class_(var1).flatMap(var1x -> {
            try {
               return this.throws_.class_(var1x).stream();
            } catch (CommandSyntaxException var3x) {
               return Stream.empty();
            }
         }).map(rcZ_2::native_);
         return (rVi_1)(this.byte_ ? var4.flatMap(var3x -> {
            try {
               rVi_1 var4x = rgB_2.class_(var3x);
               return Stream.of(rgv_3.class_(var1, var4x, var2, var3));
            } catch (Exception var5) {
               catch_.warn("Failed to parse component: " + var3x, var5);
               return Stream.of();
            }
         }).reduce((var0, var1x) -> var0.break_(", ").class_(var1x)).orElse(new rgN_2("")) : new rgN_2(Joiner.on(", ").join(var4.iterator())));
      } else {
         return new rgN_2("");
      }
   }

   protected abstract Stream<rcd_3> class_(gy_3 var1) throws CommandSyntaxException;

   private static YJ class_(String var0) {
      try {
         return new YE().class_(new StringReader(var0));
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   public boolean implements_() {
      return this.byte_;
   }

   public String private_() {
      return this.protected_;
   }
}
