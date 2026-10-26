package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCi_1 extends rrTF<NoSlow> {
   private static boolean[] break_;
   public Object[] class_;
   private static short[] byte_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         this.class_[0] = 0;
      }
   }

   public rrCi_1(NoSlow var1) {
      super(var1);
      this.byte_();
   }

   static {
      ntfClinit();
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.byte_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         if (((cb_3)import_.class_[57]).return_()) {
            Integer var6 = (Integer)this.class_[0] + 1;
            this.class_[0] = var6;
         } else {
            Integer var7 = 0;
            this.class_[0] = var7;
         }
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1494124884;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-68, 37, -60, -5, -61, 34, 56, 62}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @EventTarget
   public void class_(rrAB var1) {
      this.byte_();
      rdn_3 var2 = var1.catch_();
      if ((rrfq_3)rrfp_3.class_[1] != (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[4]
         || !var1.class_(rdy_3.hp) && !var1.class_(rdy_3.hy)
         || rrjS_2.protected_()) {
         if ((Integer)this.class_[0] > 1 && ((cb_3)import_.class_[57]).Sw() > 1) {
            var1.class_(true);
            Integer var7 = 0;
            this.class_[0] = var7;
         }
      }
   }

   private static void class_() {
      byte_ = new short[]{0, 57, 0, 0, 0, 1, 4, 0, 57, 0, 0};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3775181783992640341L;
   }

   private static void break_() {
      break_ = new boolean[]{true, false, true, true, true, false, false, true, false, false};
   }

   @Override
   public boolean aK_() {
      this.byte_();
      Integer var5 = 0;
      this.class_[0] = var5;
      return super.aK_();
   }
}
