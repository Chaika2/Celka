package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAK extends Om_1 {
   private static short[] byte_;
   private static boolean[] protected_;
   private static byte[] throws_;
   public Object[] class_;
   public static Object[] break_;

   public rrAK() {
      this.private_();
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5420951777635316875L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -71448828;
   }

   public static rrAK class_(int var0, int var1, int var2, rXa_1 var3) {
      ((rrAK)break_[0]).class_(false);
      rrAK var10000 = (rrAK)break_[0];
      Integer var8 = var0;
      var10000.class_[0] = var8;
      var10000 = (rrAK)break_[0];
      Integer var9 = var1;
      var10000.class_[1] = var9;
      var10000 = (rrAK)break_[0];
      Integer var10 = var2;
      var10000.class_[2] = var10;
      ((rrAK)break_[0]).class_[3] = var3;
      return (rrAK)break_[0];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{65, 21, -124, -9, -106, 124, 58, 94}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rXa_1 class_() {
      this.private_();
      return (rXa_1)this.class_[3];
   }

   public static rrAK break_(int var0, int var1, int var2, rXa_1 var3) {
      rrAK var4 = class_(var0, var1, var2, var3);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var4);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_(var4);
      return var4;
   }

   public int break_() {
      this.private_();
      return (Integer)this.class_[2];
   }

   public int throws_() {
      this.private_();
      return (Integer)this.class_[1];
   }

   private static void finally_() {
      protected_ = new boolean[]{false, false, false, false, true, false, false, true};
   }

   private static void catch_() {
      Object[] var0 = new Object[]{new rrAK()};
      break_ = var0;
   }

   private static void case_() {
      throws_ = new byte[]{4, 2};
   }

   private static void implements_() {
      byte_ = new short[]{0, 0, 0, 0, 1, 0, 2, 0, 3, 0, 0, 0, 0, 1, 2, 3};
   }

   public int protected_() {
      this.private_();
      return (Integer)this.class_[0];
   }

   private void private_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         Object[] var1 = this.class_;
         var1[0] = 0;
         var1[1] = 0;
         var1[2] = 0;
      }
   }
}
