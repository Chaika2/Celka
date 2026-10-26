package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Date;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class C_while implements C_this {
   private static byte[] break_;
   public Object[] class_;
   private static boolean[] byte_;
   private static long[] protected_;
   private static String[] throws_;
   private static short[] case_;

   @Override
   public String byte_() {
      return (String)this.class_[0];
   }

   public C_while(String var1, C_else var2, rU_2 var3, long var4) {
      this.catch_();
      this.class_[0] = var1;
      this.class_[1] = var2;
      this.class_[3] = var3;
      Long var13 = var4;
      this.class_[2] = var13;
   }

   public C_while(String var1, C_else var2, rU_2 var3) {
      this(var1, var2, var3, System.currentTimeMillis());
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == null) {
         return false;
      } else if (!(var1 instanceof C_this var2)) {
         return false;
      } else {
         return ((String)this.class_[0]).equals(var2.byte_()) && (C_else)this.class_[1] == var2.break_() && ((rU_2)this.class_[3]).equals(var2.class_())
            ? true
            : byte_[5];
      }
   }

   @Override
   public String toString() {
      return String.format("%s %s %s", (String)this.class_[0], rU_2.class_((rfH_2)((rU_2)this.class_[3])).toString(), new Date((Long)this.class_[2]).toString());
   }

   @Override
   public int hashCode() {
      return ((String)this.class_[0]).hashCode()
         ^ ((C_else)this.class_[1]).hashCode()
         ^ ((rU_2)this.class_[3]).hashCode()
         ^ Long.hashCode((Long)this.class_[2]);
   }

   @Override
   public rU_2 class_() {
      return (rU_2)this.class_[3];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-53, 100, 34, 118, -11, 112, -10, -23}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1167426005761382253L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 300072883;
   }

   @Override
   public C_else break_() {
      return (C_else)this.class_[1];
   }

   private static void throws_() {
      byte_ = new boolean[]{false, true, false, false, true, false};
   }

   private static void finally_() {
      case_ = new short[]{0, 1, 3, 2, 0, 1, 3, 2, 0, 1, 2, 3, 0, 3, 2, 0, 1, 3};
   }

   private void catch_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         Object[] var1 = this.class_;
         var1[2] = 0L;
      }
   }

   private static void case_() {
      protected_ = new long[1];
   }

   private static void implements_() {
      break_ = new byte[]{3, 2, 4, 2};
   }

   @Override
   public long protected_() {
      return (Long)this.class_[2];
   }

   private static void private_() {
      throws_ = new String[]{new String("%s %s %s")};
   }
}
