package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrvj_1 extends rrtN_2 {
   private static long[] byte_;
   private static float[] protected_;
   private static byte[] native_;
   private static boolean[] volatile_;
   public static Object[] class_;
   private static String[] final_;
   public Object[] break_;
   private static short[] package_;

   @Override
   public String byte_() {
      return this.catch_();
   }

   public rrvj_1(String var1, Supplier<Float> var2, Supplier<Float> var3) {
      super(var2, var3, new rrNM((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[3], 0.5F));
      this.throw_();
      AnimValue var9 = new AnimValue(0.5F, false);
      this.break_[3] = var9;
      float var4 = this.import_();
      this.break_[0] = var1;
      this.class_((rrwE_2)rrwE_2.staticFields6648a4467c4f300f966c59969d37f426[0], var4, var4);
   }

   static {
      ntfClinit();
   }

   private static void B() {
      byte_ = new long[]{0L, 700L, 0L, 0L, 0L, 0L, 50L, 0L, 0L, 0L, 700L, 0L, 0L, 700L, 50L};
   }

   private static void S() {
      package_ = new short[]{
         3, 3, 0, 0, 2, 0, 2, 2, 2, 3, 5, 6, 4, 5, 6, 7, 4, 5, 6, 7, 3, 4, 5, 3, 6, 7, 7, 6, 6, 7, 3, 6, 5, 3, 5, 4, 5, 6, 20, 0, 1, 1, 2, 2, 3, 4
      };
   }

   public void this_() {
      this.throw_();
      if ((Boolean)this.break_[2]) {
         this.class_((rrwE_2)rrwE_2.staticFields6648a4467c4f300f966c59969d37f426[0], this.default_(), this.abstract_());
         Boolean var7 = false;
         this.break_[2] = var7;
      } else {
         float var1 = this.default_() + this.implements_() / 2.0F;
         float var2 = this.abstract_() + this.ao_() / 2.0F;
         this.class_(rrwE_2.class_(var1, var2, const_.volatile_(), const_.final_()));
         Boolean var8 = true;
         this.break_[2] = var8;
      }

      String var15 = this.break_[2] ? "Центрирование включено" : final_[1];
      if (((AnimValue)this.break_[3]).byte_() > 0.05F) {
         this.break_[5] = var15;
         Long var10 = 0L;
         this.break_[6] = var10;
      } else {
         this.break_[4] = var15;
         Object var12 = null;
         this.break_[5] = var12;
         Long var13 = 700L;
         this.break_[6] = var13;
         Long var14 = System.currentTimeMillis();
         this.break_[7] = var14;
      }
   }

   private static void s() {
      final_ = new String[]{new String("Центрирование включено"), new String("Центрирование выключено")};
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-24, 29, 106, -58, -119, -91, 107, 115}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1182521989;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1296912347771965003L;
   }

   @Override
   public boolean class_(rrtu_3 var1, int var2, int var3) {
      return this.transient_().break_((float)var2, (float)var3);
   }

   public void class_(boolean var1) {
      this.throw_();
      Boolean var6 = var1;
      this.break_[2] = var6;
   }

   public boolean class_() {
      return false;
   }

   public void break_(boolean var1) {
      this.throw_();
      Boolean var6 = var1;
      this.break_[1] = var6;
   }

   public String break_() {
      this.throw_();
      return (String)this.break_[4];
   }

   @Override
   public String catch_() {
      this.throw_();
      return (String)this.break_[0];
   }

   private static void G() {
      volatile_ = new boolean[]{false, false, true, false, true, false, false, false, true, false, false, true, false, false, false, true};
   }

   public boolean continue_() {
      this.throw_();
      return (Boolean)this.break_[2];
   }

   public void else_() {
      this.throw_();
      if ((String)this.break_[4] != null || (String)this.break_[5] != null || ((AnimValue)this.break_[3]).byte_() != 0.0F) {
         long var1 = System.currentTimeMillis();
         if ((Long)this.break_[6] > 0L) {
            long var3 = this.break_[7] > 0L ? Math.min(var1 - (Long)this.break_[7], 50L) : byte_[7];
            Long var9 = Math.max(0L, (Long)this.break_[6] - var3);
            this.break_[6] = var9;
         }

         Long var10 = var1;
         this.break_[7] = var10;
         ((AnimValue)this.break_[3]).class_(this.break_[6] > 0L ? true : volatile_[5]);
         if ((String)this.break_[5] != null && ((AnimValue)this.break_[3]).byte_() < 0.01F) {
            String var11 = (String)this.break_[5];
            this.break_[4] = var11;
            Object var12 = null;
            this.break_[5] = var12;
            Long var13 = 700L;
            this.break_[6] = var13;
         }
      }
   }

   @Override
   public boolean new_() {
      return false;
   }

   public abstract boolean package_();

   public AnimValue return_() {
      this.throw_();
      return (AnimValue)this.break_[3];
   }

   public boolean super_() {
      this.throw_();
      return (Boolean)this.break_[1];
   }

   private void throw_() {
      if (this.break_ == null) {
         this.break_ = new Object[8];
         Object[] var1 = this.break_;
         var1[1] = false;
         var1[2] = false;
         var1[6] = 0L;
         var1[7] = 0L;
      }
   }

   private static void try_() {
      protected_ = new float[]{0.5F, 0.5F, 2.0F, 2.0F, 0.05F, 0.0F, 0.01F};
   }

   private static void while_() {
      Object[] var0 = new Object[]{700L, 50L};
      class_ = var0;
   }

   private static void E() {
      native_ = new byte[]{8, 2, 6, 7, 2};
   }

   @Override
   public void ar_() {
      this.throw_();
      super.ar_();
      Object var5 = null;
      this.break_[4] = var5;
      Object var6 = null;
      this.break_[5] = var6;
      Long var7 = 0L;
      this.break_[6] = var7;
      Long var8 = 0L;
      this.break_[7] = var8;
      ((AnimValue)this.break_[3]).class_(false);
   }

   @Override
   public void as_() {
      this.float_().class_(this.package_());
   }

   @Override
   public boolean aq_() {
      if (((Qw_1)import_.class_[20]).R && !this.class_()) {
         return false;
      } else {
         return !this.package_() && !this.float_().case_() ? volatile_[9] : volatile_[8];
      }
   }
}
