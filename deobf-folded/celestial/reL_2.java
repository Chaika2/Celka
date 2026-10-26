package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class reL_2 extends rev_3 {
   public static final Codec<reL_2> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(rev_3.id_byte.listOf().fieldOf("elements").forGetter(var0x -> var0x.id_break), id_break()).apply(var0, reL_2::new)
   );
   private final List<rev_3> id_break;

   public reL_2(List<rev_3> var1, rem_3 var2) {
      super(var2);
      if (var1.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.id_break = var1;
         this.id_break(var2);
      }
   }

   @Override
   public String toString() {
      return "List[" + this.id_break.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   @Override
   public rfi_3 id_class(rrPt_1 var1, rfH_2 var2, rqd_3 var3) {
      rfi_3 var4 = rfi_3.id_class();

      for (rev_3 var6 : this.id_break) {
         rfi_3 var7 = var6.id_class(var1, var2, var3);
         var4.id_break(var7);
      }

      return var4;
   }

   @Override
   public boolean id_class(rrPt_1 var1, rRI var2, rrrA var3, rKd_1 var4, rfH_2 var5, rfH_2 var6, rqd_3 var7, rfi_3 var8, Random var9, boolean var10) {
      for (rev_3 var12 : this.id_break) {
         if (!var12.id_class(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public red_3<?> id_class() {
      return red_3.id_break;
   }

   @Override
   public rev_3 id_class(rem_3 var1) {
      super.id_class(var1);
      this.id_break(var1);
      return this;
   }

   @Override
   public List<rrPp_1> id_class(rrPt_1 var1, rfH_2 var2, rqd_3 var3, Random var4) {
      return this.id_break.get(0).id_class(var1, var2, var3, var4);
   }

   private void id_break(rem_3 var1) {
      this.id_break.forEach(var1x -> var1x.id_class(var1));
   }
}
