package celestial;

import com.google.common.base.Joiner;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class rgx_3 extends rgZ_2 implements rgr_3 {
   private static final Logger id_catch = LogManager.getLogger();
   protected final boolean id_byte;
   protected final String id_protected;
   protected final YJ id_throws;

   protected rgx_3(String var1, YJ var2, boolean var3) {
      this.id_protected = var1;
      this.id_throws = var2;
      this.id_byte = var3;
   }

   public rgx_3(String var1, boolean var2) {
      this(var1, id_class(var1), var2);
   }

   @Override
   public rVi_1 id_class(gy_3 var1, an_3 var2, int var3) throws CommandSyntaxException {
      if (var1 != null && this.id_throws != null) {
         Stream var4 = this.id_class(var1).flatMap(var1x -> {
            try {
               return this.id_throws.id_class(var1x).stream();
            } catch (CommandSyntaxException var3x) {
               return Stream.empty();
            }
         }).map(rcZ_2::id_native);
         return (rVi_1)(this.id_byte ? var4.flatMap(var3x -> {
            try {
               rVi_1 var4x = rgB_2.id_class(var3x);
               return Stream.of(rgv_3.id_class(var1, var4x, var2, var3));
            } catch (Exception var5) {
               id_catch.warn("Failed to parse component: " + var3x, var5);
               return Stream.of();
            }
         }).reduce((var0, var1x) -> var0.id_break(", ").id_class(var1x)).orElse(new rgN_2("")) : new rgN_2(Joiner.on(", ").join(var4.iterator())));
      } else {
         return new rgN_2("");
      }
   }

   protected abstract Stream<rcd_3> id_class(gy_3 var1) throws CommandSyntaxException;

   private static YJ id_class(String var0) {
      try {
         return new YE().id_class(new StringReader(var0));
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   public boolean id_implements() {
      return this.id_byte;
   }

   public String id_private() {
      return this.id_protected;
   }
}
