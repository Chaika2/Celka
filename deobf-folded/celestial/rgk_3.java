package celestial;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class rgk_3 extends rgx_3 {
   private final String id_catch;
   private final Rn_1 id_private;

   private rgk_3(String var1, YJ var2, boolean var3, String var4, Rn_1 var5) {
      super(var1, var2, var3);
      this.id_catch = var4;
      this.id_private = var5;
   }

   public rgk_3(String var1, boolean var2, String var3) {
      super(var1, var2);
      this.id_catch = var3;
      this.id_private = id_class(var3);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof rgk_3 var2)
            ? false
            : Objects.equals(this.id_catch, var2.id_catch) && Objects.equals(this.id_protected, var2.id_protected) && super.equals(var1);
      }
   }

   @Override
   public String toString() {
      return "EntityNbtComponent{selector='"
         + this.id_catch
         + "'path='"
         + this.id_protected
         + "', siblings="
         + this.id_case
         + ", style="
         + this.id_class()
         + "}";
   }

   @Override
   protected Stream<rcd_3> id_class(gy_3 var1) throws CommandSyntaxException {
      if (this.id_private != null) {
         List var2 = this.id_private.id_break(var1);
         return var2.stream().map(XC::id_break);
      } else {
         return Stream.empty();
      }
   }

   private static Rn_1 id_class(String var0) {
      try {
         RC var1 = new RC(new StringReader(var0));
         return var1.id_super();
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   public String id_extends() {
      return this.id_catch;
   }

   public rgk_3 id_native() {
      return new rgk_3(this.id_protected, this.id_throws, this.id_byte, this.id_catch, this.id_private);
   }
}
