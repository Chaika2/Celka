package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruF {
   public Object[] id_class;
   private static boolean[] id_break;
   private static byte[] id_byte;
   private static short[] id_protected;

   public void id_byte() {
      if ((Runnable)this.id_class[id_protected[18]] != null) {
         ((Runnable)this.id_class[id_protected[19]]).run();
         ((rruu_1)this.id_class[id_protected[20]]).id_class(System.currentTimeMillis());
      }
   }

   public rruF(rrtN_2 var1, rruu_1 var2) {
      this.id_native();
      Supplier var7 = () -> id_break[10];
      this.id_class[id_protected[4]] = var7;
      Supplier var8 = () -> id_break[9];
      this.id_class[id_protected[5]] = var8;
      Boolean var9 = id_break[1];
      this.id_class[id_protected[6]] = var9;
      this.id_class[id_protected[7]] = var2;
      this.id_class[id_protected[8]] = var1;
   }

   public rruF(rruu_1 var1) {
      this.id_native();
      Supplier var6 = () -> id_break[10];
      this.id_class[id_protected[0]] = var6;
      Supplier var7 = () -> id_break[9];
      this.id_class[id_protected[1]] = var7;
      Boolean var8 = id_break[0];
      this.id_class[id_protected[2]] = var8;
      this.id_class[id_protected[3]] = var1;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1224512915;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7229057078044666079L;
   }

   public rruF id_class(boolean var1) {
      Boolean var6 = var1;
      this.id_class[id_protected[29]] = var6;
      return this;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-32, -123, -121, -98, 124, 25, -33, 8}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_class(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5) {
      if ((Boolean)((Supplier)this.id_class[id_protected[9]]).get()) {
         boolean var6 = this.id_class().id_break((float)var3, (float)var4);
         if (var5 && rrtu_3.id_class(var2, var3, var4)) {
            var6 = id_break[2];
         }

         if ((rrtN_2)this.id_class[id_protected[10]] != null && var2.id_class((rrtN_2)this.id_class[id_protected[11]], var3, var4)) {
            var6 = id_break[3];
         }

         ((rruu_1)this.id_class[id_protected[12]]).id_break((Boolean)((Supplier)this.id_class[id_protected[13]]).get());
         ((rruu_1)this.id_class[id_protected[14]]).id_class(var6);
         ((rruu_1)this.id_class[id_protected[15]]).id_class(var1, var2, var3, var4, var5);
      }
   }

   public boolean id_class(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      boolean var6 = var4 == 0 && ((Supplier)this.id_class[id_protected[16]]).get() && ((Supplier)this.id_class[id_protected[17]]).get()
         ? id_break[4]
         : id_break[5];
      if (var5 && rrtu_3.id_class(var1, var2, var3)) {
         var6 = id_break[6];
      }

      if (var6) {
         this.id_byte();
         return id_break[7];
      } else {
         return id_break[8];
      }
   }

   public rruF id_class(Supplier<Boolean> var1) {
      this.id_class[id_protected[25]] = var1;
      return this;
   }

   public rruF id_class(Runnable var1) {
      this.id_class[id_protected[28]] = var1;
      return this;
   }

   public rruv_1 id_class() {
      return ((rruu_1)this.id_class[id_protected[21]]).id_catch();
   }

   public boolean id_break() {
      return (Boolean)this.id_class[id_protected[24]];
   }

   public rruF id_break(Supplier<Boolean> var1) {
      this.id_class[id_protected[26]] = var1;
      return this;
   }

   public boolean id_throws() {
      return (Boolean)((Supplier)this.id_class[id_protected[27]]).get();
   }

   private static void id_finally() {
      id_protected = new short[]{1, 2, 5, 0, 1, 2, 5, 0, 4, 2, 4, 4, 0, 1, 0, 0, 2, 1, 3, 3, 0, 0, 0, 0, 5, 1, 2, 2, 3, 5};
   }

   private static void id_catch() {
      id_break = new boolean[]{true, true, false, false, true, false, false, true, false, true, true, false};
   }

   public rruu_1 id_case() {
      return (rruu_1)this.id_class[id_protected[23]];
   }

   private static void id_implements() {
      id_byte = new byte[]{6, 5};
   }

   public rruv_1 id_protected() {
      return ((rruu_1)this.id_class[id_protected[22]]).id_break();
   }

   private void id_native() {
      if (this.id_class == null) {
         this.id_class = new Object[id_byte[0]];
         Object[] var1 = this.id_class;
         var1[id_byte[1]] = id_break[11];
      }
   }
}
