package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GO extends MP {
   public Object[] class_;
   private static short[] break_;
   private static byte[] byte_;
   private static boolean[] protected_;

   @Override
   public rP_2 byte_() {
      this.extends_();
      return (rP_2)this.class_[3];
   }

   public GO(a_1 var1, int var2, int var3) {
      this.extends_();
      List var8 = var1.break_().subList(var2, var3 + 1);
      this.class_[0] = var8;
      List var9 = var1.catch_().subList(var2, var3);
      this.class_[1] = var9;
      Integer var10 = var1.case_();
      this.class_[2] = var10;
      rP_2 var11 = var1.byte_();
      this.class_[3] = var11;
      this.throws_();
   }

   public GO(a_1 var1, int var2) {
      this(var1, 0, var2);
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-92, -105, -116, 81, -66, -49, 6, 58}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7165601208488771438L;
   }

   @Override
   public List<rU_2> break_() {
      this.extends_();
      return Collections.unmodifiableList((List<? extends rU_2>)this.class_[0]);
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -138700167;
   }

   private static void finally_() {
      break_ = new short[]{0, 1, 2, 3, 3, 1, 0, 2};
   }

   @Override
   public List<rd_3> catch_() {
      this.extends_();
      return Collections.unmodifiableList((List<? extends rd_3>)this.class_[1]);
   }

   private void extends_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         Object[] var1 = this.class_;
         var1[2] = 0;
      }
   }

   @Override
   public int case_() {
      this.extends_();
      return (Integer)this.class_[2];
   }

   private static void volatile_() {
      byte_ = new byte[]{4, 2};
   }

   private static void native_() {
      protected_ = new boolean[]{true, false, false};
   }
}
