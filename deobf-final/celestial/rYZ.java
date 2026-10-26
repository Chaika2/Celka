package celestial;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rYZ implements rYn_1 {
   private static final Logger protected_ = LogManager.getLogger();
   private static final int throws_ = (int)Math.round(Math.log(16.0) / Math.log(2.0)) - 2;
   private static final int case_ = (int)Math.round(Math.log(256.0) / Math.log(2.0)) - 2;
   public static final int class_ = 1 << throws_ + throws_ + case_;
   public static final int break_ = (1 << throws_) - 1;
   public static final int byte_ = (1 << case_) - 1;
   private final rpn_3<rYG> catch_;
   private final rYG[] private_;

   public rYZ(rpn_3<rYG> var1, rfj_3 var2, rYY var3, int[] var4) {
      this(var1);
      int var5 = var2.break_() >> 2;
      int var6 = var2.byte_() >> 2;
      if (var4 != null) {
         for (int var7 = 0; var7 < var4.length; var7++) {
            this.private_[var7] = (rYG)var1.class_(var4[var7]);
            if (this.private_[var7] == null) {
               int var8 = var7 & break_;
               int var9 = var7 >> throws_ + throws_ & byte_;
               int var10 = var7 >> throws_ & break_;
               this.private_[var7] = var3.protected_(var5 + var8, var9, var6 + var10);
            }
         }
      } else {
         for (int var11 = 0; var11 < this.private_.length; var11++) {
            int var12 = var11 & break_;
            int var13 = var11 >> throws_ + throws_ & byte_;
            int var14 = var11 >> throws_ & break_;
            this.private_[var11] = var3.protected_(var5 + var12, var13, var6 + var14);
         }
      }
   }

   public rYZ(rpn_3<rYG> var1, rfj_3 var2, rYY var3) {
      this(var1);
      int var4 = var2.break_() >> 2;
      int var5 = var2.byte_() >> 2;

      for (int var6 = 0; var6 < this.private_.length; var6++) {
         int var7 = var6 & break_;
         int var8 = var6 >> throws_ + throws_ & byte_;
         int var9 = var6 >> throws_ & break_;
         this.private_[var6] = var3.protected_(var4 + var7, var8, var5 + var9);
      }
   }

   public rYZ(rpn_3<rYG> var1, int[] var2) {
      this(var1);

      for (int var3 = 0; var3 < this.private_.length; var3++) {
         int var4 = var2[var3];
         rYG var5 = (rYG)var1.class_(var4);
         if (var5 == null) {
            protected_.warn("Received invalid biome id: " + var4);
            this.private_[var3] = (rYG)var1.class_(0);
         } else {
            this.private_[var3] = var5;
         }
      }
   }

   private rYZ(rpn_3<rYG> var1) {
      this(var1, new rYG[class_]);
   }

   public rYZ(rpn_3<rYG> var1, rYG[] var2) {
      this.catch_ = var1;
      this.private_ = var2;
   }

   public int[] class_() {
      int[] var1 = new int[this.private_.length];

      for (int var2 = 0; var2 < this.private_.length; var2++) {
         var1[var2] = this.catch_.class_(this.private_[var2]);
      }

      return var1;
   }

   @Override
   public rYG protected_(int var1, int var2, int var3) {
      int var4 = var1 & break_;
      int var5 = rfU_2.class_(var2, 0, byte_);
      int var6 = var3 & break_;
      return this.private_[var5 << throws_ + throws_ | var6 << throws_ | var4];
   }
}
