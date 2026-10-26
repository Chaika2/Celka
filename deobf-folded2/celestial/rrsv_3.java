package celestial;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class rrsv_3 extends rrsN_2 {
   public static final Codec<rrsv_3> id_throws = RecordCodecBuilder.create(var0 -> id_class(var0).apply(var0, rrsv_3::new));

   public rrsv_3(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   private static void id_class(rKH var0, Random var1, rfw_3 var2, Set<rfH_2> var3, rfi_3 var4, rDv_1 var5, rfH_2 var6, int var7, int var8, int var9) {
      var2.id_class(var6, var7, var8, var9);
      id_class(var0, var1, var2, var3, var4, var5);
   }

   @Override
   protected rrsA_2<?> id_class() {
      return rrsA_2.id_byte;
   }

   @Override
   public List<rrPY> id_class(rKH var1, Random var2, int var3, rfH_2 var4, Set<rfH_2> var5, rfi_3 var6, rDv_1 var7) {
      rfH_2 var8 = var4.id_break();
      id_class(var1, var8);
      id_class(var1, var8.id_extends());
      id_class(var1, var8.id_protected());
      id_class(var1, var8.id_protected().id_extends());
      rfw_3 var9 = new rfw_3();

      for (int var10 = 0; var10 < var3; var10++) {
         id_class(var1, var2, var9, var5, var6, var7, var4, 0, var10, 0);
         if (var10 < var3 - 1) {
            id_class(var1, var2, var9, var5, var6, var7, var4, 1, var10, 0);
            id_class(var1, var2, var9, var5, var6, var7, var4, 1, var10, 1);
            id_class(var1, var2, var9, var5, var6, var7, var4, 0, var10, 1);
         }
      }

      return ImmutableList.of(new rrPY(var4.id_break(var3), 0, true));
   }
}
