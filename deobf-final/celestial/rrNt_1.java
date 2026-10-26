package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNt_1 extends rrNw_1 {
   private static short[] byte_;
   public Object[] class_;
   private static byte[] protected_;

   public rrNV byte_() {
      this.finally_();
      return (rrNV)this.class_[0];
   }

   public rrNt_1(rdn_3 var1) {
      super(var1);
      this.finally_();
   }

   public rrNt_1(rdn_3 var1, String var2, int var3) {
      super(var1, var2, var3);
      this.finally_();
   }

   public rrNt_1(rJY var1, String var2, int var3) {
      super(var1, var2, var3);
      this.finally_();
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-40, -24, -73, 12, -18, 117, 37, -51}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void class_(rrNV var1) {
      this.finally_();
      this.class_[0] = var1;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4165677108383829384L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -446287462;
   }

   public void class_(List<rrNt_1> var1) {
      this.finally_();
      this.class_[1] = var1;
   }

   public List<rJY> class_() {
      this.finally_();
      return (List<rJY>)this.class_[2];
   }

   public void break_(List<rJY> var1) {
      this.finally_();
      this.class_[2] = var1;
   }

   public List<rrNt_1> break_() {
      this.finally_();
      return (List<rrNt_1>)this.class_[1];
   }

   private void finally_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
      }
   }

   private static void implements_() {
      protected_ = new byte[]{3};
   }

   private static void private_() {
      byte_ = new short[]{0, 1, 2, 0, 1, 2};
   }
}
