package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrvj_1 extends rrtN_2 {
   private static long[] id_byte;
   private static float[] id_protected;
   private static byte[] id_native;
   private static boolean[] id_volatile;
   public static Object[] id_class;
   private static String[] id_final;
   public Object[] id_break;
   private static short[] id_package;

   @Override
   public String id_byte() {
      return this.id_catch();
   }

   public rrvj_1(String var1, Supplier<Float> var2, Supplier<Float> var3) {
      super(var2, var3, new rrNM((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[id_package[0]], id_protected[0]));
      this.id_throw();
      AnimValue var9 = new AnimValue(id_protected[1], id_volatile[0]);
      this.id_break[id_package[1]] = var9;
      float var4 = this.id_import();
      this.id_break[id_package[2]] = var1;
      this.id_class((rrwE_2)rrwE_2.staticFields6648a4467c4f300f966c59969d37f426[id_package[3]], var4, var4);
   }

   static {
      ntfClinit();
   }

   private static void B() {
      id_byte = new long[]{0L, 700L, 0L, 0L, 0L, 0L, 50L, 0L, 0L, 0L, 700L, 0L, 0L, 700L, 50L};
   }

   private static void S() {
      id_package = new short[]{
         3, 3, 0, 0, 2, 0, 2, 2, 2, 3, 5, 6, 4, 5, 6, 7, 4, 5, 6, 7, 3, 4, 5, 3, 6, 7, 7, 6, 6, 7, 3, 6, 5, 3, 5, 4, 5, 6, 20, 0, 1, 1, 2, 2, 3, 4
      };
   }

   public void id_this() {
      this.id_throw();
      if ((Boolean)this.id_break[id_package[4]]) {
         this.id_class((rrwE_2)rrwE_2.staticFields6648a4467c4f300f966c59969d37f426[id_package[5]], this.id_default(), this.id_abstract());
         Boolean var7 = id_volatile[1];
         this.id_break[id_package[6]] = var7;
      } else {
         float var1 = this.id_default() + this.id_implements() / id_protected[2];
         float var2 = this.id_abstract() + this.ao_() / id_protected[3];
         this.id_class(rrwE_2.id_class(var1, var2, id_const.id_volatile(), id_const.id_final()));
         Boolean var8 = id_volatile[2];
         this.id_break[id_package[7]] = var8;
      }

      String var15 = this.id_break[id_package[8]] ? id_final[0] : id_final[1];
      if (((AnimValue)this.id_break[id_package[9]]).id_byte() > id_protected[4]) {
         this.id_break[id_package[10]] = var15;
         Long var10 = id_byte[0];
         this.id_break[id_package[11]] = var10;
      } else {
         this.id_break[id_package[12]] = var15;
         Object var12 = null;
         this.id_break[id_package[13]] = var12;
         Long var13 = id_byte[1];
         this.id_break[id_package[14]] = var13;
         Long var14 = System.currentTimeMillis();
         this.id_break[id_package[15]] = var14;
      }
   }

   private static void s() {
      id_final = new String[]{new String("Центрирование включено"), new String("Центрирование выключено")};
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-24, 29, 106, -58, -119, -91, 107, 115}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1182521989;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1296912347771965003L;
   }

   @Override
   public boolean id_class(rrtu_3 var1, int var2, int var3) {
      return this.id_transient().id_break((float)var2, (float)var3);
   }

   public void id_class(boolean var1) {
      this.id_throw();
      Boolean var6 = var1;
      this.id_break[id_package[43]] = var6;
   }

   public boolean id_class() {
      return id_volatile[6];
   }

   public void id_break(boolean var1) {
      this.id_throw();
      Boolean var6 = var1;
      this.id_break[id_package[41]] = var6;
   }

   public String id_break() {
      this.id_throw();
      return (String)this.id_break[id_package[45]];
   }

   @Override
   public String id_catch() {
      this.id_throw();
      return (String)this.id_break[id_package[39]];
   }

   private static void G() {
      id_volatile = new boolean[]{false, false, true, false, true, false, false, false, true, false, false, true, false, false, false, true};
   }

   public boolean id_continue() {
      this.id_throw();
      return (Boolean)this.id_break[id_package[42]];
   }

   public void id_else() {
      this.id_throw();
      if ((String)this.id_break[id_package[21]] != null
         || (String)this.id_break[id_package[22]] != null
         || ((AnimValue)this.id_break[id_package[23]]).id_byte() != id_protected[5]) {
         long var1 = System.currentTimeMillis();
         if ((Long)this.id_break[id_package[24]] > id_byte[4]) {
            long var3 = this.id_break[id_package[25]] > id_byte[5] ? Math.min(var1 - (Long)this.id_break[id_package[26]], id_byte[6]) : id_byte[7];
            Long var9 = Math.max(id_byte[8], (Long)this.id_break[id_package[27]] - var3);
            this.id_break[id_package[28]] = var9;
         }

         Long var10 = var1;
         this.id_break[id_package[29]] = var10;
         ((AnimValue)this.id_break[id_package[30]]).id_class(this.id_break[id_package[31]] > id_byte[9] ? id_volatile[4] : id_volatile[5]);
         if ((String)this.id_break[id_package[32]] != null && ((AnimValue)this.id_break[id_package[33]]).id_byte() < id_protected[6]) {
            String var11 = (String)this.id_break[id_package[34]];
            this.id_break[id_package[35]] = var11;
            Object var12 = null;
            this.id_break[id_package[36]] = var12;
            Long var13 = id_byte[10];
            this.id_break[id_package[37]] = var13;
         }
      }
   }

   @Override
   public boolean id_new() {
      return id_volatile[10];
   }

   public abstract boolean id_package();

   public AnimValue id_return() {
      this.id_throw();
      return (AnimValue)this.id_break[id_package[44]];
   }

   public boolean id_super() {
      this.id_throw();
      return (Boolean)this.id_break[id_package[40]];
   }

   private void id_throw() {
      if (this.id_break == null) {
         this.id_break = new Object[id_native[0]];
         Object[] var1 = this.id_break;
         var1[id_volatile[11]] = id_volatile[12];
         var1[id_native[1]] = id_volatile[13];
         var1[id_native[2]] = id_byte[11];
         var1[id_native[3]] = id_byte[12];
      }
   }

   private static void id_try() {
      id_protected = new float[]{0.5F, 0.5F, 2.0F, 2.0F, 0.05F, 0.0F, 0.01F};
   }

   private static void id_while() {
      Object[] var0 = new Object[]{700L, 50L};
      id_class = var0;
   }

   private static void E() {
      id_native = new byte[]{8, 2, 6, 7, 2};
   }

   @Override
   public void ar_() {
      this.id_throw();
      super.ar_();
      Object var5 = null;
      this.id_break[id_package[16]] = var5;
      Object var6 = null;
      this.id_break[id_package[17]] = var6;
      Long var7 = id_byte[2];
      this.id_break[id_package[18]] = var7;
      Long var8 = id_byte[3];
      this.id_break[id_package[19]] = var8;
      ((AnimValue)this.id_break[id_package[20]]).id_class(id_volatile[3]);
   }

   @Override
   public void as_() {
      this.id_float().id_class(this.id_package());
   }

   @Override
   public boolean aq_() {
      if (((Qw_1)id_import.id_class[id_package[38]]).R && !this.id_class()) {
         return id_volatile[7];
      } else {
         return !this.id_package() && !this.id_float().id_case() ? id_volatile[9] : id_volatile[8];
      }
   }
}
