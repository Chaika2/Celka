package celestial;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Objects;
import java.util.stream.Stream;

public class rgd_3 extends rgx_3 {
   private final String id_catch;
   private final Rf_1 id_private;

   private rgd_3(String var1, YJ var2, boolean var3, String var4, Rf_1 var5) {
      super(var1, var2, var3);
      this.id_catch = var4;
      this.id_private = var5;
   }

   public rgd_3(String var1, boolean var2, String var3) {
      super(var1, var2);
      this.id_catch = var3;
      this.id_private = this.id_class(this.id_catch);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof rgd_3 var2)
            ? false
            : Objects.equals(this.id_catch, var2.id_catch) && Objects.equals(this.id_protected, var2.id_protected) && super.equals(var1);
      }
   }

   @Override
   public String toString() {
      return "BlockPosArgument{pos='" + this.id_catch + "'path='" + this.id_protected + "', siblings=" + this.id_case + ", style=" + this.id_class() + "}";
   }

   @Override
   protected Stream<rcd_3> id_class(gy_3 var1) {
      if (this.id_private != null) {
         rrEm_1 var2 = var1.id_final();
         rfH_2 var3 = this.id_private.id_byte(var1);
         if (var2.id_synchronized(var3)) {
            ryO_2 var4 = var2.id_class(var3);
            if (var4 != null) {
               return Stream.of(var4.id_class(new rcd_3()));
            }
         }
      }

      return Stream.empty();
   }

   private Rf_1 id_class(String var1) {
      try {
         return RM.id_class().id_class(new StringReader(var1));
      } catch (CommandSyntaxException var3) {
         return null;
      }
   }

   public String id_extends() {
      return this.id_catch;
   }

   public rgd_3 id_native() {
      return new rgd_3(this.id_protected, this.id_throws, this.id_byte, this.id_catch, this.id_private);
   }
}
