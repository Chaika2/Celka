package celestial;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Criticals extends Module {
   private static float[] break_;
   private static short[] byte_;
   private static boolean[] protected_;
   private static String[] throws_;

   public Criticals() {
      super("Criticals", "Позволяет всегда бить\nкритическами ударами", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[0]);
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      throws_ = new String[]{
         new String("Criticals"), new String("Позволяет всегда бить\nкритическами ударами"), new String("Необходимо использовать версию 1.17.1 или выше")
      };
   }

   @EventTarget
   public void class_(q_1 var1) {
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0] && !this.return_()) {
         this.byte_(false);
      }
   }

   @Override
   public void class_(boolean var1) {
      if (!this.return_()) {
         this.byte_(false);
      } else {
         super.class_(var1);
      }
   }

   @EventTarget
   public void class_(rrFj_1 var1) {
      if (!((cb_3)import_.class_[57]).BL()) {
         float var2 = (Float)((cb_3)import_.class_[57]).throws_[15] + rrfQ_2.byte_(-0.0015F, 0.00105F);
         float var3 = (Float)((cb_3)import_.class_[57]).throws_[16] + rrfQ_2.byte_(-0.0015F, 0.00105F);
         double var4 = ((cb_3)import_.class_[57]).re() - (double)rrfQ_2.byte_(3.5E-5F, 6.5E-5F);
         ((Aq_1)((cb_3)import_.class_[57]).break_[0])
            .break_(new rZX(((cb_3)import_.class_[57]).rx(), var4, ((cb_3)import_.class_[57]).BO(), var2, var3, false));
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 75817713;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5623468838187463472L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-84, 118, -29, -41, -70, -38, -3, -105}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void continue_() {
      protected_ = new boolean[]{false, false, false, false, true, true, false};
   }

   private static void else_() {
      byte_ = new short[]{0, 57, 57, 15, 57, 16, 57, 57, 0, 57, 57, 0, 0, 2000, 57, 57};
   }

   public boolean new_() {
      return this.aJ_() && (cb_3)import_.class_[57] != null && !((cb_3)import_.class_[57]).BL() ? true : protected_[6];
   }

   private boolean return_() {
      if (rrjA_2.protected_().throws_().throws_(ProtocolVersion.v1_17_1)) {
         String var1 = "Необходимо использовать версию 1.17.1 или выше";
         rrfu_3.byte_(rrfu_3.class_((Module)this) + var1);
         ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtx_3(this.final_(), var1, 2000));
         return false;
      } else {
         return protected_[4];
      }
   }

   private static void super_() {
      break_ = new float[]{-0.0015F, 0.00105F, -0.0015F, 0.00105F, 3.5E-5F, 6.5E-5F};
   }
}
