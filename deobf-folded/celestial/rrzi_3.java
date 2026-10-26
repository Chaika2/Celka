package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrzi_3 {
   private static byte[] id_class;
   public static Object[] id_byte;
   private static String[] id_break;
   private static short[] id_throws;
   public Object[] id_protected;
   private static boolean[] id_case;

   public static rrzi_3 id_byte(byte[] var0) {
      rrzi_3 var1 = (rrzi_3)((ThreadLocal)id_byte[id_throws[14]]).get();
      if (var1 == null) {
         var1 = new rrzi_3(var0, -1);
         ((ThreadLocal)id_byte[id_throws[15]]).set(var1);
      }

      return var1.id_class(var0);
   }

   private static void id_byte() {
      id_case = new boolean[]{
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
      this.id_class();
      Integer var7 = -1;
      this.id_protected[3] = var7;
      this.id_break(var1);
      Boolean var8 = var2;
      this.id_protected[2] = var8;
      Integer var9 = -1;
      this.id_protected[3] = var9;
   }

   public rrzi_3() {
      this.id_class();
      Integer var5 = -1;
      this.id_protected[3] = var5;
   }

   public rrzi_3(byte[] var1, int var2) {
      this.id_class();
      Integer var7 = -1;
      this.id_protected[3] = var7;
      this.id_break(var1);
      Integer var8 = var2;
      this.id_protected[3] = var8;
   }

   public rrzi_3(byte[] var1, int var2, int var3) {
      this.id_class();
      Integer var9 = -1;
      this.id_protected[3] = var9;
      int var4 = var2 + 46;
      if (var1[var4 + var3 - 1] == 47) {
         Boolean var10 = true;
         this.id_protected[2] = var10;
         var3--;
      }

      if (var3 > 0 && var1[var4] == 47) {
         byte[] var11 = Arrays.copyOfRange(var1, var4, var4 + var3);
         this.id_protected[id_throws[8]] = var11;
      } else {
         byte[] var12 = new byte[var3 + 1];
         this.id_protected[id_throws[9]] = var12;
         System.arraycopy(var1, var4, (byte[])this.id_protected[id_throws[10]], 1, var3);
         ((byte[])this.id_protected[id_throws[11]])[id_case[4]] = 47;
      }

      this.id_break(this.id_protected((byte[])this.id_protected[id_throws[12]]));
      Integer var13 = var2;
      this.id_protected[3] = var13;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof rrzi_3)) {
         return id_case[23];
      } else {
         return var1 instanceof rrQr_1
            ? ((rrQr_1)var1).equals(this)
            : Arrays.equals((byte[])this.id_protected[id_throws[28]], (byte[])((rrzi_3)var1).id_protected[id_throws[29]]);
      }
   }

   @Override
   public String toString() {
      return this.id_private() + (this.id_protected[2] ? id_break[0] : id_break[1]) + ", index: " + (Integer)this.id_protected[3];
   }

   @Override
   public int hashCode() {
      return (Integer)this.id_protected[1];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2547119164657317820L;
   }

   private void id_class() {
      if (this.id_protected == null) {
         this.id_protected = new Object[6];
         Object[] var1 = this.id_protected;
         var1[1] = Integer.valueOf(id_case[29]);
         var1[2] = id_case[30];
         var1[3] = Integer.valueOf(id_case[31]);
      }
   }

   private byte[] id_class(byte[] var1, int var2) {
      byte[] var3 = new byte[var1.length - 1];

      int var4;
      for (var4 = id_case[11]; var4 < var2; var4++) {
         var3[var4] = var1[var4];
      }

      int var5 = var4;
      byte var6 = id_case[12];

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

   public rrzi_3 id_class(byte[] var1) {
      this.id_break(var1);
      return this;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -453899879;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-115, -93, 82, -105, 83, -52, 12, 3}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_break(byte[] var1) {
      this.id_protected[id_throws[16]] = var1;
      Integer var7 = Arrays.hashCode(var1);
      this.id_protected[1] = var7;
   }

   private static void id_break() {
      id_break = new String[]{new String(" (dir)"), new String(" ")};
   }

   private static void id_throws() {
      id_throws = new short[]{3, 3, 2, 3, 3, 3, 3, 2, 0, 0, 0, 0, 0, 3, 0, 0, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3};
   }

   public boolean id_catch() {
      return (Boolean)this.id_protected[2];
   }

   private static void id_case() {
      id_class = new byte[]{-1, -1, -1, -1, -1, 46, 47, 47, 47, 47, 47, 47, 47, 47, 47, -1, 47, 47, 46, 46, 2, 6, 2, 3, 2};
   }

   private static void id_implements() {
      Object[] var0 = new Object[]{new ThreadLocal(), true};
      id_byte = var0;
   }

   private byte[] id_protected(byte[] var1) {
      int var2 = var1.length;
      if (var2 == 0) {
         return var1;
      } else {
         byte var3 = id_case[5];

         for (int var4 = id_case[6]; var4 < var2; var4++) {
            byte var5 = var1[var4];
            if (var5 == 47 && var3 == 47) {
               return this.id_class(var1, var4 - 1);
            }

            var3 = var5;
         }

         return var2 > 1 && var3 == 47 ? Arrays.copyOf(var1, var2 - 1) : var1;
      }
   }

   boolean id_protected() {
      if (!(Boolean)id_byte[1] && ((byte[])this.id_protected[id_throws[20]])[id_case[15]] != 47) {
         throw new AssertionError();
      } else if (((byte[])this.id_protected[id_throws[21]]).length == 1) {
         return id_case[17];
      } else {
         for (int var1 = 1; var1 < ((byte[])this.id_protected[id_throws[22]]).length; var1++) {
            int var2 = var1;

            while (var1 < ((byte[])this.id_protected[id_throws[23]]).length && ((byte[])this.id_protected[id_throws[24]])[var1] != 47) {
               var1++;
            }

            if (((byte[])this.id_protected[id_throws[25]])[var2] == 46) {
               int var3 = var1 - var2;
               if (var3 == 1 || ((byte[])this.id_protected[id_throws[26]])[var2 + 1] == 46 && var3 == 2) {
                  return true;
               }
            }
         }

         return id_case[22];
      }
   }

   public String id_private() {
      return new String((byte[])this.id_protected[id_throws[27]]);
   }
}
