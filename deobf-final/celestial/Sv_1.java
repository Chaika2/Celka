package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class Sv_1 implements MinecraftAccessor {
   public Object[] class_;
   private static byte[] break_;
   private static short[] byte_;
   private static boolean[] protected_;

   private boolean byte_(String var1) {
      if (var1 != null && (String)this.class_[2] != null) {
         return !((String)this.class_[2]).equalsIgnoreCase(var1.toLowerCase()) ? true : protected_[3];
      } else {
         return !Objects.equals(var1, (String)this.class_[2]) ? true : protected_[5];
      }
   }

   public void byte_() {
      ((SL)this.class_[0]).break_();
      Object var5 = null;
      this.class_[2] = var5;
      Object var6 = null;
      this.class_[1] = var6;
      Boolean var7 = false;
      this.class_[3] = var7;
   }

   public Sv_1(SL var1) {
      this.extends_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2055049176;
   }

   public void class_(SC var1) {
      String var6 = this.throws_();
      this.class_[2] = var6;
   }

   public void class_(rrLO var1) {
   }

   public void class_(rrFK var1) {
      this.byte_();
   }

   public void class_(rrAM var1) {
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -223482382786578799L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{104, -37, -105, 63, -123, 123, 102, 59}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public boolean class_() {
      return (Boolean)this.class_[3];
   }

   public void class_(q_1 var1) {
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         SC var2 = this.case_().catch_();
         if (var2 != null) {
            String var7 = this.throws_();
            this.class_[1] = var7;
            if (this.byte_((String)this.class_[1])) {
               Boolean var8 = true;
               this.class_[3] = var8;
            }

            if ((Boolean)this.class_[3] && this.break_((String)this.class_[1])) {
               this.catch_();
            }
         }
      }
   }

   public void class_(rrAl_1 var1) {
   }

   public abstract boolean break_(String var1);

   public String break_() {
      return (String)this.class_[1];
   }

   public abstract String throws_();

   private static void finally_() {
      protected_ = new boolean[]{true, false, true, false, true, false, false};
   }

   public void catch_() {
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrLG.class_(((SL)this.class_[0]).catch_()));
      this.byte_();
   }

   private void extends_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         Object[] var1 = this.class_;
         var1[3] = false;
      }
   }

   public SL case_() {
      return (SL)this.class_[0];
   }

   private static void implements_() {
      byte_ = new short[]{0, 0, 1, 1, 3, 3, 1, 0, 0, 0, 2, 1, 3, 2, 2, 2, 2, 0, 1, 2, 3};
   }

   public String protected_() {
      return (String)this.class_[2];
   }

   private static void private_() {
      break_ = new byte[]{4, 3};
   }
}
