package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Arrays;

public class wF_2<T extends an_3> extends wN_2<T> {
   private final Iq_1[] id_class;
   private final Iq_1[] id_break;
   private final ImmutableList<Iq_1> id_byte;
   private final float[] id_protected = new float[7];
   private static final int[][] id_throws = new int[][]{{3, 2, 2}, {4, 3, 2}, {6, 4, 3}, {3, 3, 3}, {2, 2, 3}, {2, 1, 2}, {1, 1, 2}};
   private static final int[][] id_case = new int[][]{{0, 0}, {0, 4}, {0, 9}, {0, 16}, {0, 22}, {11, 0}, {13, 4}};

   public wF_2() {
      this.id_class = new Iq_1[7];
      float var1 = -3.5F;

      for (int var2 = 0; var2 < this.id_class.length; var2++) {
         this.id_class[var2] = new Iq_1(this, id_case[var2][0], id_case[var2][1]);
         this.id_class[var2]
            .id_class(
               (float)id_throws[var2][0] * -0.5F,
               0.0F,
               (float)id_throws[var2][2] * -0.5F,
               (float)id_throws[var2][0],
               (float)id_throws[var2][1],
               (float)id_throws[var2][2]
            );
         this.id_class[var2].id_class(0.0F, (float)(24 - id_throws[var2][1]), var1);
         this.id_protected[var2] = var1;
         if (var2 < this.id_class.length - 1) {
            var1 += (float)(id_throws[var2][2] + id_throws[var2 + 1][2]) * 0.5F;
         }
      }

      this.id_break = new Iq_1[3];
      this.id_break[0] = new Iq_1(this, 20, 0);
      this.id_break[0].id_class(-5.0F, 0.0F, (float)id_throws[2][2] * -0.5F, 10.0F, 8.0F, (float)id_throws[2][2]);
      this.id_break[0].id_class(0.0F, 16.0F, this.id_protected[2]);
      this.id_break[1] = new Iq_1(this, 20, 11);
      this.id_break[1].id_class(-3.0F, 0.0F, (float)id_throws[4][2] * -0.5F, 6.0F, 4.0F, (float)id_throws[4][2]);
      this.id_break[1].id_class(0.0F, 20.0F, this.id_protected[4]);
      this.id_break[2] = new Iq_1(this, 20, 18);
      this.id_break[2].id_class(-3.0F, 0.0F, (float)id_throws[4][2] * -0.5F, 6.0F, 5.0F, (float)id_throws[1][2]);
      this.id_break[2].id_class(0.0F, 19.0F, this.id_protected[1]);
      Builder var3 = ImmutableList.builder();
      var3.addAll(Arrays.asList(this.id_class));
      var3.addAll(Arrays.asList(this.id_break));
      this.id_byte = var3.build();
   }

   @Override
   public void id_class(T var1, float var2, float var3, float var4, float var5, float var6) {
      for (int var7 = 0; var7 < this.id_class.length; var7++) {
         this.id_class[var7].id_catch = rfU_2.id_break(var4 * 0.9F + (float)var7 * 0.15F * (float) Math.PI)
            * (float) Math.PI
            * 0.05F
            * (float)(1 + Math.abs(var7 - 2));
         this.id_class[var7].id_byte = rfU_2.id_class(var4 * 0.9F + (float)var7 * 0.15F * (float) Math.PI) * (float) Math.PI * 0.2F * (float)Math.abs(var7 - 2);
      }

      this.id_break[0].id_catch = this.id_class[2].id_catch;
      this.id_break[1].id_catch = this.id_class[4].id_catch;
      this.id_break[1].id_byte = this.id_class[4].id_byte;
      this.id_break[2].id_catch = this.id_class[1].id_catch;
      this.id_break[2].id_byte = this.id_class[1].id_byte;
   }

   public ImmutableList<Iq_1> id_break() {
      return this.id_byte;
   }
}
