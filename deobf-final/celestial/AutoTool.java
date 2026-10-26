package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class AutoTool extends Module {
   private static boolean[] byte_;
   public Object[] break_;
   private static String[] protected_;
   private static byte[] throws_;
   private static short[] catch_;
   private static float[] private_;

   public AutoTool() {
      super("Auto Tool", "Автоматически берет лучший\nинструмент для ломания блока", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[3]);
      this.else_();
      Integer var5 = -1;
      this.break_[0] = var5;
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      catch_ = new short[]{3, 0, 0, 57, 0, 57, 1, 0, 57, 1, 57, 1, 0, 57, 1, 1, 0, 57, 1, 0, 0, 57, 1, 56, 57, 57, 56, 0};
   }

   @EventTarget
   public void class_(rrLH var1) {
      this.else_();
      if (var1.protected_() == (rrLy_1)rrLy_1.staticFields4117bd257b2839b395dedb8ac6b8a087[0]) {
         if (var1.byte_() || ((cb_3)import_.class_[57]).native_()) {
            return;
         }

         if ((Integer)this.break_[0] != -1) {
            ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_ = (Integer)this.break_[0];
         }

         Pair var2 = this.class_(var1.class_(), var1.break_());
         if (var2 == null) {
            return;
         }

         int var3 = (Integer)var2.getRight();
         if (var3 == -1 || var3 == ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_) {
            return;
         }

         Integer var8 = ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_;
         this.break_[0] = var8;
         ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_ = var3;
      } else if (var1.protected_() == (rrLy_1)rrLy_1.staticFields4117bd257b2839b395dedb8ac6b8a087[1] && (Integer)this.break_[0] != -1) {
         ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_ = (Integer)this.break_[0];
         Integer var9 = -1;
         this.break_[0] = var9;
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2408093434591521583L;
   }

   public Pair<rdn_3, Integer> class_(xc_3 var1, rfH_2 var2) {
      rdn_3 var3 = rdn_3.break_;
      int var4 = -1;
      float var5 = 0.0F;

      for (int var6 = 0; var6 < 9; var6++) {
         rdn_3 var7 = ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).class_.get(var6);
         if (!var7.class_() && var7.break_().class_(var1, (gm_3)import_.class_[56], var2, (cb_3)import_.class_[57])) {
            float var8 = var1.class_((cb_3)import_.class_[57], var7, (gm_3)import_.class_[56], var2);
            if (!(var8 <= 0.0F) && var8 > var5) {
               var5 = var8;
               var4 = var6;
               var3 = var7;
            }
         }
      }

      return Pair.of(var3, var4);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -96290820;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-123, -111, -54, 44, -109, 14, -24, 60}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void throws_(boolean var1) {
      this.else_();
      super.throws_(var1);
      Integer var6 = -1;
      this.break_[0] = var6;
   }

   private static void continue_() {
      byte_ = new boolean[]{false, true, false, false};
   }

   private void else_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
         this.break_[0] = 0;
      }
   }

   private static void new_() {
      private_ = new float[2];
   }

   private static void return_() {
      protected_ = new String[]{new String("Auto Tool"), new String("Автоматически берет лучший\nинструмент для ломания блока")};
   }

   private static void super_() {
      throws_ = new byte[]{-1, -1, -1, -1, -1, -1, 9, -1};
   }
}
