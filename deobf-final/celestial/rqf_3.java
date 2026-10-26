package celestial;

import java.util.Arrays;

public enum rqf_3 {
   P123(0, 1, 2),
   P213(1, 0, 2),
   P132(0, 2, 1),
   P231(1, 2, 0),
   P312(2, 0, 1),
   P321(2, 1, 0);

   private final int[] field_239183_g_;
   private final rjj_3 field_239184_h_;
   private static final rqf_3[][] field_239185_i_ = rqR_2.class_(new rqf_3[values().length][values().length], var0 -> {
      for (rqf_3 var4 : values()) {
         for (rqf_3 var8 : values()) {
            int[] var9 = new int[3];

            for (int var10 = 0; var10 < 3; var10++) {
               var9[var10] = var4.field_239183_g_[var8.field_239183_g_[var10]];
            }

            rqf_3 var11 = Arrays.stream(values()).filter(var1 -> Arrays.equals(var1.field_239183_g_, var9)).findFirst().get();
            var0[var4.ordinal()][var8.ordinal()] = var11;
         }
      }
   });

   private rqf_3(int var3, int var4, int var5) {
      this.field_239183_g_ = new int[]{var3, var4, var5};
      this.field_239184_h_ = new rjj_3();
      this.field_239184_h_.class_(0, this.class_(0), 1.0F);
      this.field_239184_h_.class_(1, this.class_(1), 1.0F);
      this.field_239184_h_.class_(2, this.class_(2), 1.0F);
   }

   public rjj_3 class_() {
      return this.field_239184_h_;
   }

   public int class_(int var1) {
      return this.field_239183_g_[var1];
   }

   public rqf_3 class_(rqf_3 var1) {
      return field_239185_i_[this.ordinal()][var1.ordinal()];
   }
}
