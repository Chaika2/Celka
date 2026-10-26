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
   public static final Codec<rRX> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(rRJ.id_final.fieldOf("type").forGetter(rRX::id_class), rKd_1.id_class.fieldOf("generator").forGetter(rRX::id_byte))
            .apply(var0, var0.stable(rRX::new))
   );
   public static final rqM_2<rRX> id_break = rqM_2.id_class(rVL.id_import, new rqO_2("overworld"));
   public static final rqM_2<rRX> id_byte = rqM_2.id_class(rVL.id_import, new rqO_2("the_nether"));
   public static final rqM_2<rRX> id_protected = rqM_2.id_class(rVL.id_import, new rqO_2("the_end"));
   private static final LinkedHashSet<rqM_2<rRX>> id_throws = Sets.newLinkedHashSet(ImmutableList.of(id_break, id_byte, id_protected));
   private final Supplier<rRJ> id_case;
   private final rKd_1 id_catch;

   public rKd_1 id_byte() {
      return this.id_catch;
   }

   public rRX(Supplier<rRJ> var1, rKd_1 var2) {
      this.id_case = var1;
      this.id_catch = var2;
   }

   public static rVC<rRX> id_class(rVC<rRX> var0) {
      rVC var1 = new rVC<>(rVL.id_import, Lifecycle.experimental());

      for (rqM_2 var3 : id_throws) {
         rRX var4 = (rRX)var0.id_class(var3);
         if (var4 != null) {
            var1.id_class(var3, var4, var0.id_protected(var4));
         }
      }

      for (Entry var6 : var0.id_throws()) {
         rqM_2 var7 = (rqM_2)var6.getKey();
         if (!id_throws.contains(var7)) {
            var1.id_class(var7, (rRX)var6.getValue(), var0.id_protected((rRX)var6.getValue()));
         }
      }

      return var1;
   }

   public Supplier<rRJ> id_class() {
      return this.id_case;
   }

   public static boolean id_class(long var0, rVC<rRX> var2) {
      ArrayList var3 = Lists.newArrayList(var2.id_throws());
      if (var3.size() != id_throws.size()) {
         return false;
      } else {
         Entry var4 = (Entry)var3.get(0);
         Entry var5 = (Entry)var3.get(1);
         Entry var6 = (Entry)var3.get(2);
         if (var4.getKey() != id_break || var5.getKey() != id_byte || var6.getKey() != id_protected) {
            return false;
         } else if (!((rRX)var4.getValue()).id_break().id_class(rRJ.id_implements) && ((rRX)var4.getValue()).id_break() != rRJ.id_volatile) {
            return false;
         } else if (!((rRX)var5.getValue()).id_break().id_class(rRJ.id_finally)) {
            return false;
         } else if (!((rRX)var6.getValue()).id_break().id_class(rRJ.id_extends)) {
            return false;
         } else if (((rRX)var5.getValue()).id_byte() instanceof rKT && ((rRX)var6.getValue()).id_byte() instanceof rKT) {
            rKT var7 = (rKT)((rRX)var5.getValue()).id_byte();
            rKT var8 = (rKT)((rRX)var6.getValue()).id_byte();
            if (!var7.id_class(var0, rKW.id_throws)) {
               return false;
            } else if (!var8.id_class(var0, rKW.id_case)) {
               return false;
            } else if (!(var7.id_protected() instanceof rYD)) {
               return false;
            } else {
               rYD var9 = (rYD)var7.id_protected();
               if (!var9.id_break(var0)) {
                  return false;
               } else if (!(var8.id_protected() instanceof rYK)) {
                  return false;
               } else {
                  rYK var10 = (rYK)var8.id_protected();
                  return var10.id_break(var0);
               }
            }
         } else {
            return false;
         }
      }
   }

   public rRJ id_break() {
      return this.id_case.get();
   }
}
