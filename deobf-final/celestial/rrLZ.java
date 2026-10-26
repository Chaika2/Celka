package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLZ extends Om_1 implements MinecraftAccessor {
   private static byte[] byte_;
   private static boolean[] protected_;
   public Object[] class_;
   public static Object[] break_;
   private static float[] throws_;
   private static short[] case_;

   public rrLZ() {
      this.protected_();
   }

   static {
      ntfClinit();
   }

   public static rrLZ class_(ruS_2<?> var0) {
      ((rrLZ)break_[0]).class_[0] = var0;
      ((rrLZ)break_[0]).class_(false);
      return (rrLZ)break_[0];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -626080869;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-52, -91, 57, 110, -26, 120, -17, -24}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public ruS_2<?> class_() {
      this.protected_();
      return (ruS_2<?>)this.class_[0];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2158105780922762881L;
   }

   public static void class_(rrLZ var0, ruS_2<?> var1) {
      if (var1 instanceof rZO var2) {
         if (var2 instanceof rZJ || var2 instanceof rZX) {
            PX var7 = (PX)PJ.class_[0];
            var7.class_(var2.class_(0.0F));
            var7.byte_(var2.break_(0.0F));
         }
      } else if (var1 instanceof rmT_2) {
         ((Ax_1)import_.class_[55]).byte_ = System.currentTimeMillis();
      } else if (var1 instanceof rZb_1 var3) {
         if (var3.protected_() == rZM.SWAP_ITEM_WITH_OFFHAND) {
            ((Ax_1)import_.class_[55]).protected_ = System.currentTimeMillis();
         }
      } else if (var1 instanceof rmD_2 var4) {
         if (var4.break_() == rmU_2.START_FALL_FLYING) {
            ((Ax_1)import_.class_[55]).case_ = System.currentTimeMillis();
         }
      } else if (var1 instanceof rmI_2 var5) {
         if (var5.break_() == rmf_3.PERFORM_RESPAWN) {
            rrAc_1 var8 = rrAc_1.break_();
            if (var8.byte_()) {
               var0.class_(true);
            }
         }
      } else if (var1 instanceof rmt_3 var6) {
         rrNV var9 = ((rrNh_1)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[0]).throws_().switch_();
         if (var9 != null && var6.byte_() == 49) {
            rrFe_1.class_(var9, (rrFa_1)rrFa_1.staticFieldsc276c0e8494830db9e45df4464b752ad[0]);
         }
      }
   }

   private static void break_() {
      byte_ = new byte[]{49};
   }

   private static void throws_() {
      case_ = new short[]{0, 0, 0, 0, 0, 55, 55, 55, 0, 0, 0};
   }

   private static void catch_() {
      protected_ = new boolean[]{false, true, false, true, true};
   }

   private static void case_() {
      Object[] var0 = new Object[]{new rrLZ()};
      break_ = var0;
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   private static void private_() {
      throws_ = new float[2];
   }
}
