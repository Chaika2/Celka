package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.function.Supplier;

public final class rRX {
   public static final Codec<rRX> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(rRJ.final_.fieldOf("type").forGetter(rRX::class_), rKd_1.class_.fieldOf("generator").forGetter(rRX::byte_))
            .apply(var0, var0.stable(rRX::new))
   );
   public static final rqM_2<rRX> break_ = rqM_2.class_(rVL.import_, new rqO_2("overworld"));
   public static final rqM_2<rRX> byte_ = rqM_2.class_(rVL.import_, new rqO_2("the_nether"));
   public static final rqM_2<rRX> protected_ = rqM_2.class_(rVL.import_, new rqO_2("the_end"));
   private static final LinkedHashSet<rqM_2<rRX>> throws_ = Sets.newLinkedHashSet(ImmutableList.of(break_, byte_, protected_));
   private final Supplier<rRJ> case_;
   private final rKd_1 catch_;

   public rKd_1 byte_() {
      return this.catch_;
   }

   public rRX(Supplier<rRJ> var1, rKd_1 var2) {
      this.case_ = var1;
      this.catch_ = var2;
   }

   public static rVC<rRX> class_(rVC<rRX> var0) {
      rVC var1 = new rVC<>(rVL.import_, Lifecycle.experimental());

      for (rqM_2 var3 : throws_) {
         rRX var4 = (rRX)var0.class_(var3);
         if (var4 != null) {
            var1.class_(var3, var4, var0.protected_(var4));
         }
      }

      for (Entry var6 : var0.throws_()) {
         rqM_2 var7 = (rqM_2)var6.getKey();
         if (!throws_.contains(var7)) {
            var1.class_(var7, (rRX)var6.getValue(), var0.protected_((rRX)var6.getValue()));
         }
      }

      return var1;
   }

   public Supplier<rRJ> class_() {
      return this.case_;
   }

   public static boolean class_(long var0, rVC<rRX> var2) {
      ArrayList var3 = Lists.newArrayList(var2.throws_());
      if (var3.size() != throws_.size()) {
         return false;
      } else {
         Entry var4 = (Entry)var3.get(0);
         Entry var5 = (Entry)var3.get(1);
         Entry var6 = (Entry)var3.get(2);
         if (var4.getKey() != break_ || var5.getKey() != byte_ || var6.getKey() != protected_) {
            return false;
         } else if (!((rRX)var4.getValue()).break_().class_(rRJ.implements_) && ((rRX)var4.getValue()).break_() != rRJ.volatile_) {
            return false;
         } else if (!((rRX)var5.getValue()).break_().class_(rRJ.finally_)) {
            return false;
         } else if (!((rRX)var6.getValue()).break_().class_(rRJ.extends_)) {
            return false;
         } else if (((rRX)var5.getValue()).byte_() instanceof rKT && ((rRX)var6.getValue()).byte_() instanceof rKT) {
            rKT var7 = (rKT)((rRX)var5.getValue()).byte_();
            rKT var8 = (rKT)((rRX)var6.getValue()).byte_();
            if (!var7.class_(var0, rKW.throws_)) {
               return false;
            } else if (!var8.class_(var0, rKW.case_)) {
               return false;
            } else if (!(var7.protected_() instanceof rYD)) {
               return false;
            } else {
               rYD var9 = (rYD)var7.protected_();
               if (!var9.break_(var0)) {
                  return false;
               } else if (!(var8.protected_() instanceof rYK)) {
                  return false;
               } else {
                  rYK var10 = (rYK)var8.protected_();
                  return var10.break_(var0);
               }
            }
         } else {
            return false;
         }
      }
   }

   public rRJ break_() {
      return this.case_.get();
   }
}
