package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrlY_2 extends rrTF<ChestStealer> {
   private static boolean[] break_;
   private static byte[] byte_;
   public Object[] class_;
   private static float[] protected_;
   private static short[] case_;
   private static String[] catch_;

   private static void byte_() {
      case_ = new short[]{0, 1, 0, 0, 73, 0, 57, 1, 0, 1, 55, 57, 4, 1};
   }

   public rrlY_2(ChestStealer var1) {
      super(var1);
      this.throws_();
      rrIm_1 var6 = new rrIm_1("Задержка", 10.0F, 10.0F, 500.0F, 10.0F).class_(() -> this.continue_().new_() == this ? true : break_[5]);
      this.class_[0] = var6;
      rrfw_3 var7 = new rrfw_3();
      this.class_[1] = var7;
      var1.class_((rrIm_1)this.class_[0]);
   }

   static {
      ntfClinit();
   }

   private boolean class_(rJY var1) {
      return !var1.break_() ? false : break_[3];
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.throws_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         vm_3 var3 = (vm_3)import_.class_[73];
         if (var3 instanceof Fc_1 var2) {
            rrNV var9 = ((rrNh_1)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[0]).throws_().switch_();
            if (var9 != null) {
               return;
            }

            int var4 = ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).throws_();
            if (var4 == -1) {
               return;
            }

            List var5 = var2.G_().class_(null).stream().filter(this::class_).collect(Collectors.toList());
            Collections.shuffle(var5);
            float var6 = ((rrIm_1)this.class_[0]).byte_();

            for (rJY var8 : var5) {
               if (((rrfw_3)this.class_[1]).class_((double)var6)) {
                  ((Ax_1)import_.class_[55]).break_(((rJr_1)((cb_3)import_.class_[57]).implements_[4]).case_, var8.protected_, 0, rXa_1.QUICK_MOVE, true);
                  ((rrfw_3)this.class_[1]).class_();
               }
            }
         }
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-124, 1, 100, 30, -34, 8, -11, -31}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -9026094422882420581L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -405168900;
   }

   private static void break_() {
      catch_ = new String[]{new String("Задержка")};
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
      }
   }

   private static void case_() {
      protected_ = new float[]{10.0F, 10.0F, 500.0F, 10.0F};
   }

   private static void protected_() {
      break_ = new boolean[]{false, true, false, true, true, false};
   }

   private static void private_() {
      byte_ = new byte[]{-1, 2};
   }
}
