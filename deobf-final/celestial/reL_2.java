package celestial;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class reL_2 extends rev_3 {
   public static final Codec<reL_2> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(rev_3.byte_.listOf().fieldOf("elements").forGetter(var0x -> var0x.break_), break_()).apply(var0, reL_2::new)
   );
   private final List<rev_3> break_;

   public reL_2(List<rev_3> var1, rem_3 var2) {
      super(var2);
      if (var1.isEmpty()) {
         throw new IllegalArgumentException("Elements are empty");
      } else {
         this.break_ = var1;
         this.break_(var2);
      }
   }

   @Override
   public String toString() {
      return "List[" + this.break_.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
   }

   @Override
   public rfi_3 class_(rrPt_1 var1, rfH_2 var2, rqd_3 var3) {
      rfi_3 var4 = rfi_3.class_();

      for (rev_3 var6 : this.break_) {
         rfi_3 var7 = var6.class_(var1, var2, var3);
         var4.break_(var7);
      }

      return var4;
   }

   @Override
   public boolean class_(rrPt_1 var1, rRI var2, rrrA var3, rKd_1 var4, rfH_2 var5, rfH_2 var6, rqd_3 var7, rfi_3 var8, Random var9, boolean var10) {
      for (rev_3 var12 : this.break_) {
         if (!var12.class_(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public red_3<?> class_() {
      return red_3.break_;
   }

   @Override
   public rev_3 class_(rem_3 var1) {
      super.class_(var1);
      this.break_(var1);
      return this;
   }

   @Override
   public List<rrPp_1> class_(rrPt_1 var1, rfH_2 var2, rqd_3 var3, Random var4) {
      return this.break_.get(0).class_(var1, var2, var3, var4);
   }

   private void break_(rem_3 var1) {
      this.break_.forEach(var1x -> var1x.class_(var1));
   }
}
