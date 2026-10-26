package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFK {
   public Object[] class_;
   private static byte[] byte_;
   private static boolean[] protected_;
   private static short[] throws_;
   private static String[] case_;
   public static Object[] break_;

   private static void byte_() {
      byte_ = new byte[]{2};
   }

   public rrFK() {
      this.throws_();
      rgP_2 var5 = rgP_2.byte_("");
      this.class_[0] = var5;
      rrFD var6 = (rrFD)rrFD.staticFields1658baa549203f63991cdcef51acf497[0];
      this.class_[1] = var6;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 204323302;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{122, -86, -7, 31, -49, 30, -13, 94}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7327561169185998678L;
   }

   public static rrFK class_(rrFD var0, rgP_2 var1) {
      ((rrFK)break_[0]).class_[0] = var1;
      ((rrFK)break_[0]).class_[1] = var0;
      return (rrFK)break_[0];
   }

   public rrFD class_() {
      return (rrFD)this.class_[1];
   }

   public static void class_(rrFD var0, rgP_2 var1, rud_3 var2) {
      rrFK var3 = class_(var0, var1);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var3);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).class_(var3);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).byte_().class_(var3);
      rrfp_3.break_(var0 == (rrFD)rrFD.staticFields1658baa549203f63991cdcef51acf497[0] ? rrfp_3.break_() : null, var2);
      rrfc_3.class_();
   }

   public rgP_2 break_() {
      return (rgP_2)this.class_[0];
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
      }
   }

   private static void catch_() {
      case_ = new String[]{new String("")};
   }

   private static void case_() {
      Object[] var0 = new Object[]{new rrFK()};
      break_ = var0;
   }

   private static void protected_() {
      throws_ = new short[]{0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1};
   }

   private static void private_() {
      protected_ = new boolean[]{false, true};
   }
}
