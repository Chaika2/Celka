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
   private static final Logger id_byte = LogManager.getLogger();
   public static final Codec<reu_3> id_class = RecordCodecBuilder.create(
      var0 -> var0.group(
               rqO_2.id_class.fieldOf("name").forGetter(reu_3::id_break),
               rqO_2.id_class.fieldOf("fallback").forGetter(reu_3::id_class),
               Codec.mapPair(rev_3.id_byte.fieldOf("element"), Codec.INT.fieldOf("weight"))
                  .codec()
                  .listOf()
                  .promotePartial(rqR_2.id_class("Pool element: ", id_byte::error))
                  .fieldOf("elements")
                  .forGetter(var0x -> var0x.id_throws)
            )
            .apply(var0, reu_3::new)
   );
   public static final Codec<Supplier<reu_3>> id_break = rVA.id_class(rVL.A, id_class);
   private final rqO_2 id_protected;
   private final List<Pair<rev_3, Integer>> id_throws;
   private final List<rev_3> id_case;
   private final rqO_2 id_catch;
   private int id_private = Integer.MIN_VALUE;

   public int id_byte() {
      return this.id_case.size();
   }

   public reu_3(rqO_2 var1, rqO_2 var2, List<Pair<rev_3, Integer>> var3) {
      this.id_protected = var1;
      this.id_throws = var3;
      this.id_case = Lists.newArrayList();

      for (Pair var5 : var3) {
         rev_3 var6 = (rev_3)var5.getFirst();

         for (int var7 = 0; var7 < var5.getSecond(); var7++) {
            this.id_case.add(var6);
         }
      }

      this.id_catch = var2;
   }

   public reu_3(rqO_2 var1, rqO_2 var2, List<Pair<Function<rem_3, ? extends rev_3>, Integer>> var3, rem_3 var4) {
      this.id_protected = var1;
      this.id_throws = Lists.newArrayList();
      this.id_case = Lists.newArrayList();

      for (Pair var6 : var3) {
         rev_3 var7 = (rev_3)((Function)var6.getFirst()).apply(var4);
         this.id_throws.add(Pair.of(var7, (Integer)var6.getSecond()));

         for (int var8 = 0; var8 < var6.getSecond(); var8++) {
            this.id_case.add(var7);
         }
      }

      this.id_catch = var2;
   }

   public int id_class(rrPt_1 var1) {
      if (this.id_private == Integer.MIN_VALUE) {
         this.id_private = this.id_case.stream().mapToInt(var1x -> var1x.id_class(var1, rfH_2.id_protected, rqd_3.NONE).id_throws()).max().orElse(0);
      }

      return this.id_private;
   }

   public rev_3 id_class(Random var1) {
      return this.id_case.get(var1.nextInt(this.id_case.size()));
   }

   public rqO_2 id_class() {
      return this.id_catch;
   }

   public List<rev_3> id_break(Random var1) {
      return ImmutableList.copyOf((rev_3[])ObjectArrays.shuffle((rev_3[])this.id_case.toArray(new rev_3[0]), var1));
   }

   public rqO_2 id_break() {
      return this.id_protected;
   }
}
