package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class rNs_1 extends rzO_2 {
   final rNJ id_break;
   final List<rNh_1> id_byte;
   static final Function<an_3, rcZ_2> id_protected = XC::id_break;
   static final Function<ryO_2, rcZ_2> id_throws = var0 -> var0.id_class(new rcd_3());

   rNs_1(rQz_1[] var1, rNJ var2, List<rNh_1> var3) {
      super(var1);
      this.id_break = var2;
      this.id_byte = ImmutableList.copyOf(var3);
   }

   public static rNO id_class(rNJ var0) {
      return new rNO(var0);
   }

   static YJ id_class(String var0) {
      try {
         return new YE().id_class(new StringReader(var0));
      } catch (CommandSyntaxException var2) {
         throw new IllegalArgumentException("Failed to parse path " + var0, var2);
      }
   }

   @Override
   public Set<rzd_3<?>> id_class() {
      return ImmutableSet.of(this.id_break.lootParam);
   }

   @Override
   public rdn_3 id_break(rdn_3 var1, rzr_3 var2) {
      rcZ_2 var3 = this.id_break.field_216226_g.apply(var2);
      if (var3 != null) {
         this.id_byte.forEach(var2x -> var2x.id_class(var1::id_int, var3));
      }

      return var1;
   }

   @Override
   public rzx_3 id_break() {
      return rNl_1.id_else;
   }
}
