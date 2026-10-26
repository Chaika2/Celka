package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rruu_1 {
   private static boolean[] id_break;
   private static short[] id_byte;
   private static float[] id_protected;
   private static long[] id_throws;
   private static byte[] id_case;
   public Object[] id_class;

   public rrum_1 id_byte() {
      return (rrum_1)this.id_class[4];
   }

   public void id_byte(float var1) {
      Float var6 = var1;
      this.id_class[2] = var6;
   }

   private static void id_int() {
      id_byte = new short[]{5, 5, 6, 1, 2, 5, 5, 0, 1, 2, 3, 4, 5, 6, 0, 1, 2, 3, 4};
   }

   public rruu_1() {
      this.id_package();
      Float var5 = 0.3F;
      this.id_class[5] = var5;
      AnimValue var6 = new AnimValue((Float)this.id_class[5], true);
      this.id_class[6] = var6;
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_protected = new float[]{0.3F, 1.0F, 0.2F, 0.0F, 0.0F, 0.0F};
   }

   public void id_class(long var1) {
      Long var7 = var1;
      this.id_class[3] = var7;
   }

   public <T extends rruu_1> T id_class(float var1) {
      Float var6 = var1;
      this.id_class[5] = var6;
      return (T)this;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1798350005;
   }

   public void id_class(rrum_1 var1) {
      this.id_class[4] = var1;
   }

   public void id_class(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5) {
   }

   public abstract Supplier<rjK_2> id_class();

   public String id_class(String var1) {
      rrum_1 var2 = this.id_byte();
      if (var2 != null && this.id_throws() > id_throws[0]) {
         if ((float)(System.currentTimeMillis() - this.id_throws()) > var2.id_class()) {
            this.id_class(id_throws[1]);
         }

         return var2.id_break();
      } else {
         return var1;
      }
   }

   public void id_class(boolean var1) {
      AnimValue var2 = this.id_case();
      var2.id_break().id_break((Float)this.id_class[5]);
      var2.id_class(var1);
   }

   private static long id_break(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1086682412161052963L;
   }

   public rruv_1 id_break() {
      return this.id_catch();
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{110, 0, 52, -7, 25, -107, -41, -57}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_break(float var1) {
      Float var6 = var1;
      this.id_class[1] = var6;
   }

   public void id_break(boolean var1) {
      Boolean var6 = var1;
      this.id_class[id_byte[14]] = var6;
   }

   public long id_throws() {
      return (Long)this.id_class[3];
   }

   public float id_finally() {
      return 1.0F - 0.2F * this.id_protected();
   }

   public rruv_1 id_catch() {
      rjK_2 var1 = this.id_class().get();
      rjK_2 var2 = this.id_extends().get();
      return new rruv_1(var1.id_byte + (Float)this.id_class[1], var1.id_protected + (Float)this.id_class[2], var2.id_byte, var2.id_protected);
   }

   public abstract Supplier<rjK_2> id_extends();

   public AnimValue id_case() {
      return (AnimValue)this.id_class[6];
   }

   private static void id_continue() {
      id_case = new byte[]{7, 2, 3, 5};
   }

   public float id_implements() {
      return (Float)this.id_class[2];
   }

   private static void id_new() {
      id_throws = new long[3];
   }

   private void id_package() {
      if (this.id_class == null) {
         this.id_class = new Object[7];
         Object[] var1 = this.id_class;
         var1[id_break[1]] = id_break[2];
         var1[1] = id_protected[3];
         var1[2] = id_protected[4];
         var1[3] = id_throws[2];
         var1[5] = id_protected[5];
      }
   }

   private static void id_super() {
      id_break = new boolean[]{true, false, false, true};
   }

   public float id_protected() {
      return this.id_case().id_byte();
   }

   public float id_private() {
      return (Float)this.id_class[1];
   }

   public float id_final() {
      return (Float)this.id_class[5];
   }

   public boolean id_volatile() {
      return this.id_case().id_case();
   }

   public boolean id_native() {
      return (Boolean)this.id_class[id_byte[7]];
   }
}
