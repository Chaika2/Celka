package celestial;

import java.nio.Buffer;
import java.nio.IntBuffer;

public class rrxZ_2 {
   private static IntBuffer class_ = rrbb_3.break_(1024);
   private static IntBuffer break_ = rrbb_3.break_(1024);
   private static boolean byte_;

   public static void class_(int var0, rrxm_3 var1) {
      byte_ = rrbb_3.rs();
      rrxC_2[] var2 = var1.class_();

      for (int var3 = 0; var3 < var2.length; var3++) {
         rrxC_2 var4 = var2[var3];
         class_(var0, var4);
      }
   }

   private static void class_(int var0, rrxC_2 var1) {
      fj_3 var2 = var1.class_();
      int[] var3 = var1.break_();
      int[] var4 = var1.byte_();
      MT.super_(var2.case_);
      if (byte_) {
         int var5 = var2.extends_ != null ? var2.extends_.case_ : 0;
         int var6 = var2.native_ != null ? var2.native_.case_ : 0;
         fJ_2 var7 = var2.extends_();
         rrdA.class_(var5, var6, var7.package_(), var7.int_(), var7.volatile_());
         if (rrdZ.PV.case_()) {
            rrdZ.PV.class_(var2.case_(), var2.private_(), var2.catch_(), var2.implements_());
         }
      }

      if (class_.capacity() < var3.length) {
         int var8 = rfU_2.byte_(var3.length);
         class_ = rrbb_3.break_(var8);
         break_ = rrbb_3.break_(var8);
      }

      ((Buffer)class_).clear();
      ((Buffer)break_).clear();
      class_.put(var3);
      break_.put(var4);
      ((Buffer)class_).flip();
      ((Buffer)break_).flip();
      MT.class_(var0, class_, break_);
   }
}
