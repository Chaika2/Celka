package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrays;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class reu_3 {
   private static final Logger byte_ = LogManager.getLogger();
   public static final Codec<reu_3> class_ = RecordCodecBuilder.create(
      var0 -> var0.group(
               rqO_2.class_.fieldOf("name").forGetter(reu_3::break_),
               rqO_2.class_.fieldOf("fallback").forGetter(reu_3::class_),
               Codec.mapPair(rev_3.byte_.fieldOf("element"), Codec.INT.fieldOf("weight"))
                  .codec()
                  .listOf()
                  .promotePartial(rqR_2.class_("Pool element: ", byte_::error))
                  .fieldOf("elements")
                  .forGetter(var0x -> var0x.throws_)
            )
            .apply(var0, reu_3::new)
   );
   public static final Codec<Supplier<reu_3>> break_ = rVA.class_(rVL.A, class_);
   private final rqO_2 protected_;
   private final List<Pair<rev_3, Integer>> throws_;
   private final List<rev_3> case_;
   private final rqO_2 catch_;
   private int private_ = Integer.MIN_VALUE;

   public int byte_() {
      return this.case_.size();
   }

   public reu_3(rqO_2 var1, rqO_2 var2, List<Pair<rev_3, Integer>> var3) {
      this.protected_ = var1;
      this.throws_ = var3;
      this.case_ = Lists.newArrayList();

      for (Pair var5 : var3) {
         rev_3 var6 = (rev_3)var5.getFirst();

         for (int var7 = 0; var7 < var5.getSecond(); var7++) {
            this.case_.add(var6);
         }
      }

      this.catch_ = var2;
   }

   public reu_3(rqO_2 var1, rqO_2 var2, List<Pair<Function<rem_3, ? extends rev_3>, Integer>> var3, rem_3 var4) {
      this.protected_ = var1;
      this.throws_ = Lists.newArrayList();
      this.case_ = Lists.newArrayList();

      for (Pair var6 : var3) {
         rev_3 var7 = (rev_3)((Function)var6.getFirst()).apply(var4);
         this.throws_.add(Pair.of(var7, (Integer)var6.getSecond()));

         for (int var8 = 0; var8 < var6.getSecond(); var8++) {
            this.case_.add(var7);
         }
      }

      this.catch_ = var2;
   }

   public int class_(rrPt_1 var1) {
      if (this.private_ == Integer.MIN_VALUE) {
         this.private_ = this.case_.stream().mapToInt(var1x -> var1x.class_(var1, rfH_2.protected_, rqd_3.NONE).throws_()).max().orElse(0);
      }

      return this.private_;
   }

   public rev_3 class_(Random var1) {
      return this.case_.get(var1.nextInt(this.case_.size()));
   }

   public rqO_2 class_() {
      return this.catch_;
   }

   public List<rev_3> break_(Random var1) {
      return ImmutableList.copyOf((rev_3[])ObjectArrays.shuffle((rev_3[])this.case_.toArray(new rev_3[0]), var1));
   }

   public rqO_2 break_() {
      return this.protected_;
   }
}
