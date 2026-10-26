package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrzi_3 {
   private static byte[] class_;
   public static Object[] byte_;
   private static String[] break_;
   private static short[] throws_;
   public Object[] protected_;
   private static boolean[] case_;

   public static rrzi_3 byte_(byte[] var0) {
      rrzi_3 var1 = (rrzi_3)((ThreadLocal)byte_[0]).get();
      if (var1 == null) {
         var1 = new rrzi_3(var0, -1);
         ((ThreadLocal)byte_[0]).set(var1);
      }

      return var1.class_(var0);
   }

   private static void byte_() {
      case_ = new boolean[]{
         true,
         true,
         true,
         true,
         false,
         false,
         false,
         true,
         true,
         true,
         true,
         false,
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         true,
         true,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         true,
         false
      };
   }

   public rrzi_3(byte[] var1, boolean var2) {
      this.class_();
      Integer var7 = -1;
      this.protected_[3] = var7;
      this.break_(var1);
      Boolean var8 = var2;
      this.protected_[2] = var8;
      Integer var9 = -1;
      this.protected_[3] = var9;
   }

   public rrzi_3() {
      this.class_();
      Integer var5 = -1;
      this.protected_[3] = var5;
   }

   public rrzi_3(byte[] var1, int var2) {
      this.class_();
      Integer var7 = -1;
      this.protected_[3] = var7;
      this.break_(var1);
      Integer var8 = var2;
      this.protected_[3] = var8;
   }

   public rrzi_3(byte[] var1, int var2, int var3) {
      this.class_();
      Integer var9 = -1;
      this.protected_[3] = var9;
      int var4 = var2 + 46;
      if (var1[var4 + var3 - 1] == 47) {
         Boolean var10 = true;
         this.protected_[2] = var10;
         var3--;
      }

      if (var3 > 0 && var1[var4] == 47) {
         byte[] var11 = Arrays.copyOfRange(var1, var4, var4 + var3);
         this.protected_[0] = var11;
      } else {
         byte[] var12 = new byte[var3 + 1];
         this.protected_[0] = var12;
         System.arraycopy(var1, var4, (byte[])this.protected_[0], 1, var3);
         ((byte[])this.protected_[0])[0] = 47;
      }

      this.break_(this.protected_((byte[])this.protected_[0]));
      Integer var13 = var2;
      this.protected_[3] = var13;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof rrzi_3)) {
         return false;
      } else {
         return var1 instanceof rrQr_1 ? ((rrQr_1)var1).equals(this) : Arrays.equals((byte[])this.protected_[0], (byte[])((rrzi_3)var1).protected_[0]);
      }
   }

   @Override
   public String toString() {
      return this.private_() + (this.protected_[2] ? " (dir)" : break_[1]) + ", index: " + (Integer)this.protected_[3];
   }

   @Override
   public int hashCode() {
      return (Integer)this.protected_[1];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2547119164657317820L;
   }

   private void class_() {
      if (this.protected_ == null) {
         this.protected_ = new Object[6];
         Object[] var1 = this.protected_;
         var1[1] = 0;
         var1[2] = false;
         var1[3] = 0;
      }
   }

   private byte[] class_(byte[] var1, int var2) {
      byte[] var3 = new byte[var1.length - 1];

      int var4;
      for (var4 = 0; var4 < var2; var4++) {
         var3[var4] = var1[var4];
      }

      int var5 = var4;
      byte var6 = 0;

      while (var4 < var1.length) {
         byte var7 = var1[var4++];
         if (var7 != 47 || var6 != 47) {
            var3[var5++] = var7;
            var6 = var7;
         }
      }

      if (var5 > 1 && var3[var5 - 1] == 47) {
         var5--;
      }

      return var5 == var3.length ? var3 : Arrays.copyOf(var3, var5);
   }

   public rrzi_3 class_(byte[] var1) {
      this.break_(var1);
      return this;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -453899879;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-115, -93, 82, -105, 83, -52, 12, 3}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void break_(byte[] var1) {
      this.protected_[0] = var1;
      Integer var7 = Arrays.hashCode(var1);
      this.protected_[1] = var7;
   }

   private static void break_() {
      break_ = new String[]{new String(" (dir)"), new String(" ")};
   }

   private static void throws_() {
      throws_ = new short[]{3, 3, 2, 3, 3, 3, 3, 2, 0, 0, 0, 0, 0, 3, 0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3};
   }

   public boolean catch_() {
      return (Boolean)this.protected_[2];
   }

   private static void case_() {
      class_ = new byte[]{-1, -1, -1, -1, -1, 46, 47, 47, 47, 47, 47, 47, 47, 47, 47, -1, 47, 47, 46, 46, 2, 6, 2, 3, 2};
   }

   private static void implements_() {
      Object[] var0 = new Object[]{new ThreadLocal(), true};
      byte_ = var0;
   }

   private byte[] protected_(byte[] var1) {
      int var2 = var1.length;
      if (var2 == 0) {
         return var1;
      } else {
         byte var3 = case_[5];

         for (int var4 = 0; var4 < var2; var4++) {
            byte var5 = var1[var4];
            if (var5 == 47 && var3 == 47) {
               return this.class_(var1, var4 - 1);
            }

            var3 = var5;
         }

         return var2 > 1 && var3 == 47 ? Arrays.copyOf(var1, var2 - 1) : var1;
      }
   }

   boolean protected_() {
      if (!(Boolean)byte_[1] && ((byte[])this.protected_[0])[0] != 47) {
         throw new AssertionError();
      } else if (((byte[])this.protected_[0]).length == 1) {
         return false;
      } else {
         for (int var1 = case_[18]; var1 < ((byte[])this.protected_[0]).length; var1++) {
            int var2 = var1;

            while (var1 < ((byte[])this.protected_[0]).length && ((byte[])this.protected_[0])[var1] != 47) {
               var1++;
            }

            if (((byte[])this.protected_[0])[var2] == 46) {
               int var3 = var1 - var2;
               if (var3 == 1 || ((byte[])this.protected_[0])[var2 + 1] == 46 && var3 == 2) {
                  return case_[21];
               }
            }
         }

         return case_[22];
      }
   }

   public String private_() {
      return new String((byte[])this.protected_[0]);
   }
}
