package celestial;

import java.util.Arrays;

public class ty_3<T extends an_3> extends wN_2<T> {
   private static final int[][] id_class = new int[][]{{4, 3, 2}, {6, 4, 5}, {3, 3, 1}, {1, 2, 1}};
   private static final int[][] id_break = new int[][]{{0, 0}, {0, 5}, {0, 14}, {0, 18}};
   private static final int id_byte = id_class.length;
   private final Iq_1[] id_protected = new Iq_1[id_byte];

   public ty_3() {
      float var1 = -3.5F;

      for (int var2 = 0; var2 < this.id_protected.length; var2++) {
         this.id_protected[var2] = new Iq_1(this, id_break[var2][0], id_break[var2][1]);
         this.id_protected[var2]
            .id_class(
               (float)id_class[var2][0] * -0.5F,
               0.0F,
               (float)id_class[var2][2] * -0.5F,
               (float)id_class[var2][0],
               (float)id_class[var2][1],
               (float)id_class[var2][2]
            );
         this.id_protected[var2].id_class(0.0F, (float)(24 - id_class[var2][1]), var1);
         if (var2 < this.id_protected.length - 1) {
            var1 += (float)(id_class[var2][2] + id_class[var2 + 1][2]) * 0.5F;
         }
      }
   }

   @Override
   public Iterable<Iq_1> id_class() {
      return Arrays.asList(this.id_protected);
   }

   @Override
   public void id_class(T var1, float var2, float var3, float var4, float var5, float var6) {
      for (int var7 = 0; var7 < this.id_protected.length; var7++) {
         this.id_protected[var7].id_catch = rfU_2.id_break(var4 * 0.9F + (float)var7 * 0.15F * (float) Math.PI)
            * (float) Math.PI
            * 0.01F
            * (float)(1 + Math.abs(var7 - 2));
         this.id_protected[var7].id_byte = rfU_2.id_class(var4 * 0.9F + (float)var7 * 0.15F * (float) Math.PI)
            * (float) Math.PI
            * 0.1F
            * (float)Math.abs(var7 - 2);
      }
   }
}
