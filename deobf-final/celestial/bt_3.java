package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bt_3 implements PP {
   private static boolean[] throws_;
   private static short[] case_;
   public Object[] class_;
   public static Object[] break_;
   private static byte[] catch_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
         var1[1] = 0;
      }
   }

   public bt_3(Ps_1 var1) {
      this.byte_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1167898005152649688L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -970880217;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-24, 57, 14, 90, -78, 30, -95, 3}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void class_(boolean var1) {
      if ((Integer)this.class_[1] > 0) {
         Integer var11 = (Integer)this.class_[1] - 1;
         this.class_[1] = var11;
      } else {
         rjG_2 var2 = ((Ps_1)this.class_[0]).byte_();
         if (var1 && !((Ps_1)this.class_[0]).catch_().long_() && var2 != null && var2.byte_() == rjM_2.BLOCK) {
            Integer var12 = (Integer)C_class.instanceof_().PO.class_[0] - 1;
            this.class_[1] = var12;

            for (rpm_3 var6 : rpm_3.values()) {
               if (((Ps_1)this.class_[0]).native_().break_(((Ps_1)this.class_[0]).catch_(), ((Ps_1)this.class_[0]).case_(), var6, (rff_3)var2) == ryZ_2.SUCCESS
                  )
                {
                  ((Ps_1)this.class_[0]).catch_().class_(var6);
                  return;
               }

               if (!((Ps_1)this.class_[0]).catch_().protected_(var6).class_() && ((Ps_1)this.class_[0]).native_().class_(var6) == ryZ_2.SUCCESS) {
                  return;
               }
            }
         }
      }
   }

   private static void class_() {
      throws_ = new boolean[]{true, true, false, true, false, true, false, true};
   }

   private static void break_() {
      Object[] var0 = new Object[]{1};
      break_ = var0;
   }

   private static void throws_() {
      case_ = new short[]{0, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0};
   }

   private static void protected_() {
      catch_ = new byte[]{2};
   }
}
