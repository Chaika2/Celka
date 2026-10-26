package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrtm_3 implements MinecraftAccessor, rrtc_3, rrwf_3 {
   private static int[] id_byte;
   private static byte[] id_protected;
   private static float[] id_throws;
   public static Object[] id_class;
   public Object[] id_break;
   private static short[] id_native;
   private static boolean[] id_volatile;

   private void id_byte(Ml_1 var1, rrtu_3 var2, int var3, int var4) {
   }

   public float id_byte() {
      return (Float)this.id_break[id_native[15]];
   }

   public void id_byte(int var1, int var2, int var3) {
   }

   public float id_int() {
      return ((rrtv_3)this.id_break[id_native[13]]).id_class().id_byte();
   }

   public rrtm_3(float var1, float var2, float var3, float var4) {
      this(var1, var2);
      Float var9 = var3;
      this.id_break[id_native[4]] = var9;
      Float var10 = var4;
      this.id_break[id_native[5]] = var10;
   }

   public rrtm_3(float var1, float var2) {
      this.id_return();
      rrtv_3 var7 = new rrtv_3(id_throws[0], id_volatile[0]);
      this.id_break[id_native[0]] = var7;
      rrtv_3 var8 = new rrtv_3(id_throws[1], id_volatile[1]);
      this.id_break[id_native[1]] = var8;
      Float var9 = var1;
      this.id_break[id_native[2]] = var9;
      Float var10 = var2;
      this.id_break[id_native[3]] = var10;
   }

   static {
      ntfClinit();
   }

   public rrtv_3 id_this() {
      return (rrtv_3)this.id_break[id_native[14]];
   }

   public int id_class(int var1) {
      return (int)((float)var1 * this.id_int());
   }

   public boolean id_class(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      if (!this.id_private().P()) {
         return id_volatile[2];
      } else if ((float)var3 < this.id_private().id_abstract() + id_throws[2] && this.id_volatile().id_break((float)var2, (float)var3)) {
         this.id_class(var1, var2, var3, var4);
         return id_volatile[3];
      } else {
         return id_volatile[4];
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{90, 31, 95, -86, 34, 97, 103, 48}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3923469962346456546L;
   }

   public float id_class(rrtm_3 var1) {
      rrtN_2 var2 = this.id_private();
      float var3 = var2.id_interface().id_byte() && !var2.P() ? id_throws[7] : var1.id_int();
      return (var1.id_continue() + id_throws[8]) * var3;
   }

   public boolean id_class(float var1, float var2, float var3) {
      return var1 >= this.id_package() && var1 <= this.id_package() + this.id_new() && var2 >= this.id_final() && var2 <= this.id_final() + var3
         ? id_volatile[10]
         : id_volatile[11];
   }

   public boolean id_class(rrtu_3 var1, int var2, int var3, int var4) {
      return id_volatile[7];
   }

   public void id_class(Ml_1 var1, rrtu_3 var2, int var3, int var4) {
      if (!this.id_private().ap_()) {
         ((rrtv_3)this.id_break[id_native[6]]).id_class().id_class(this.id_finally().id_private());
      }
   }

   public void id_class(float var1) {
      Float var6 = var1;
      this.id_break[id_native[16]] = var6;
   }

   public static boolean id_class(rrtm_3 var0, rrtN_2 var1) {
      float var2 = var0.id_final();
      float var3 = var1.id_abstract();
      float var4 = var1.ao_();
      float var5 = var0.id_class(var0);
      float var6 = var0.id_super();
      byte var7 = id_protected[0];
      return !(var2 + var5 + var6 < var3 + (float)var7) && !(var2 > var3 + var4 + (float)var7) ? id_volatile[15] : id_volatile[14];
   }

   public boolean id_class(char var1, int var2) {
      return id_volatile[8];
   }

   public void id_class(int var1, int var2, int var3) {
   }

   public int id_class(int var1, AnimValue var2) {
      return (int)((float)var1 * var2.id_byte());
   }

   public void id_break() {
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1359720828;
   }

   public void id_break(Ml_1 var1, rrtu_3 var2, int var3, int var4) {
      this.id_byte(var1, var2, var3, var4);
   }

   public boolean id_break(int var1, int var2, int var3) {
      return var3 == 0 ? id_volatile[5] : id_volatile[6];
   }

   public void id_break(float var1) {
      Float var6 = var1;
      this.id_break[id_native[10]] = var6;
   }

   public boolean id_throws() {
      return !this.id_finally().id_private() && !(this.id_int() > id_throws[10]) ? id_volatile[13] : id_volatile[12];
   }

   public void id_catch() {
   }

   public void id_extends() {
   }

   private static void id_goto() {
      id_protected = new byte[]{20, 7, 2, 3, 4};
   }

   public void id_case() {
   }

   public float id_continue() {
      return (Float)this.id_break[id_native[12]];
   }

   public void id_else() {
   }

   public boolean id_implements() {
      return id_volatile[9];
   }

   private static void id_instanceof() {
      id_native = new short[]{5, 6, 0, 1, 2, 3, 5, 0, 1, 4, 1, 2, 3, 5, 5, 4, 4, 5};
   }

   public float id_new() {
      return (Float)this.id_break[id_native[11]];
   }

   public float id_package() {
      return this.id_private().id_default() + (Float)this.id_break[id_native[7]];
   }

   private void id_return() {
      if (this.id_break == null) {
         this.id_break = new Object[id_protected[1]];
         Object[] var1 = this.id_break;
         var1[id_volatile[16]] = id_throws[11];
         var1[id_volatile[17]] = id_throws[12];
         var1[id_protected[2]] = id_throws[13];
         var1[id_protected[3]] = id_throws[14];
         var1[id_protected[4]] = id_throws[15];
      }
   }

   public float id_super() {
      return id_throws[9];
   }

   private static void id_try() {
      id_volatile = new boolean[]{
         false, false, false, false, true, true, false, false, false, false, true, false, true, false, true, false, false, true, true, false
      };
   }

   private static void id_while() {
      id_throws = new float[]{0.5F, 0.4F, 5.0F, 22.0F, 0.0F, 0.6F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F};
   }

   private static void id_public() {
      id_byte = new int[]{6781311};
   }

   public List<? extends rrtn_3> id_protected() {
      return Collections.emptyList();
   }

   public abstract rrtN_2 id_private();

   public float id_final() {
      rrtN_2 var1 = this.id_private();
      float var2 = id_throws[3];

      for (rrtm_3 var4 : this.id_private().id_strictfp()) {
         if (var4.id_throws()) {
            var4.id_break(var2);
            var2 += this.id_class(var4);
         }
      }

      float var5 = !var1.P() && var1.id_interface().id_byte() ? id_throws[4] : this.id_continue() * id_throws[5] * (id_throws[6] - this.id_int());
      return var1.id_abstract() + ((Float)this.id_break[id_native[8]] - var5) + (Float)this.id_break[id_native[9]];
   }

   public abstract rruv_1 id_volatile();

   private static void id_synchronized() {
      Object[] var0 = new Object[]{6781311};
      id_class = var0;
   }

   public void id_native() {
      ((rrtv_3)this.id_break[id_native[17]]).id_class().id_extends();
   }

   public void aP_() {
   }
}
