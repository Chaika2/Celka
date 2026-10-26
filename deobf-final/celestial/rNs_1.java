package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class rNs_1 extends rzO_2 {
   final rNJ break_;
   final List<rNh_1> byte_;
   static final Function<an_3, rcZ_2> protected_ = XC::break_;
   static final Function<ryO_2, rcZ_2> throws_ = var0 -> var0.class_(new rcd_3());

   rNs_1(rQz_1[] var1, rNJ var2, List<rNh_1> var3) {
      super(var1);
      this.break_ = var2;
      this.byte_ = ImmutableList.copyOf(var3);
   }

   public static rNO class_(rNJ var0) {
      return new rNO(var0);
   }

   static YJ class_(String var0) {
      try {
         return new YE().class_(new StringReader(var0));
      } catch (CommandSyntaxException var2) {
         throw new IllegalArgumentException("Failed to parse path " + var0, var2);
      }
   }

   @Override
   public Set<rzd_3<?>> class_() {
      return ImmutableSet.of(this.break_.lootParam);
   }

   @Override
   public rdn_3 break_(rdn_3 var1, rzr_3 var2) {
      rcZ_2 var3 = this.break_.field_216226_g.apply(var2);
      if (var3 != null) {
         this.byte_.forEach(var2x -> var2x.class_(var1::int_, var3));
      }

      return var1;
   }

   @Override
   public rzx_3 break_() {
      return rNl_1.else_;
   }
}
