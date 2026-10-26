package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.BiFunction;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIm_1 extends Setting<Float> {
   private static byte[] id_byte;
   public Object[] id_break;
   private static short[] id_protected;
   private static boolean[] id_throws;
   private static float[] id_case;

   public void id_byte(BiFunction<rrIm_1, Float, String> var1) {
      this.id_this();
      this.id_break[5] = var1;
   }

   public boolean id_int() {
      this.id_this();
      return this.id_byte() >= this.id_break[1] ? true : id_throws[1];
   }

   public rrIm_1(String var1, Float var2, Float var3, Float var4, Float var5) {
      super(var1, var2);
      this.id_this();
      Float var10 = var2;
      this.id_break[2] = var10;
      Float var11 = var5;
      this.id_break[3] = var11;
      Float var12 = var3;
      this.id_break[0] = var12;
      Float var13 = var4;
      this.id_break[1] = var13;
   }

   static {
      ntfClinit();
   }

   private void id_this() {
      if (this.id_break == null) {
         this.id_break = new Object[7];
         Object[] var1 = this.id_break;
         var1[0] = 0.0F;
         var1[1] = 0.0F;
         var1[2] = 0.0F;
         var1[3] = 0.0F;
         var1[4] = false;
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2082567561;
   }

   public void id_class(Float var1, boolean var2, boolean var3) {
      this.id_this();
      super.id_class(rfU_2.id_class(var1, (Float)this.id_break[0], (Float)this.id_break[1]), var2, var3);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2368810573262168265L;
   }

   public float id_class() {
      this.id_this();
      return (Float)this.id_break[0];
   }

   public rrIm_1 id_class(BiFunction<rrIm_1, Float, String> var1) {
      this.id_this();
      this.id_break[5] = var1;
      return this;
   }

   public rrIm_1 id_break(BiFunction<rrIm_1, Float, String> var1) {
      this.id_this();
      this.id_break[6] = var1;
      return this;
   }

   public BiFunction<rrIm_1, Float, String> id_break() {
      this.id_this();
      return (BiFunction<rrIm_1, Float, String>)this.id_break[6];
   }

   public rrIm_1 id_finally() {
      this.id_this();
      Boolean var5 = true;
      this.id_break[4] = var5;
      return this;
   }

   public float id_extends() {
      this.id_this();
      return (Float)this.id_break[2];
   }

   private static void id_continue() {
      id_case = new float[4];
   }

   private static void id_else() {
      id_protected = new short[]{2, 3, 0, 1, 0, 1, 1, 5, 6, 4, 0, 1, 2, 3, 4, 5, 6, 5, 6};
   }

   private static void id_new() {
      id_throws = new boolean[]{true, false, true, false, true, false};
   }

   public BiFunction<rrIm_1, Float, String> id_package() {
      this.id_this();
      return (BiFunction<rrIm_1, Float, String>)this.id_break[5];
   }

   private static void id_super() {
      id_byte = new byte[]{7, 2, 3, 4};
   }

   public void id_protected(BiFunction<rrIm_1, Float, String> var1) {
      this.id_this();
      this.id_break[6] = var1;
   }

   public static String id_protected(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{96, -10, 127, -38, 122, 48, 114, 43}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public boolean id_final() {
      this.id_this();
      return (Boolean)this.id_break[4];
   }

   public float id_volatile() {
      this.id_this();
      return (Float)this.id_break[3];
   }

   public float id_native() {
      this.id_this();
      return (Float)this.id_break[1];
   }
}
