package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtq_3 extends rrtm_3 {
   public Object[] id_byte;
   private static short[] id_protected;
   private static byte[] id_throws;
   private static boolean[] id_native;
   private static float[] id_volatile;

   @Override
   public void id_byte(int var1, int var2, int var3) {
      this.id_public();
      super.id_byte(var1, var2, var3);
      ((rrtY_2)this.id_byte[id_protected[9]]).id_byte(var1, var2, var3);
   }

   public rrtq_3(rrtN_2 var1, rrIv_1 var2, float var3, float var4, float var5, float var6) {
      super(var3, var4, var5, var6);
      this.id_public();
      this.id_byte[id_protected[0]] = var1;
      this.id_byte[id_protected[1]] = var2;
      rrtY_2 var13 = new rrtY_2(this, var2, (rrtK_2)rrtK_2.staticFieldsc4d05dcb6ab834399a1b48042de01686[id_protected[2]]);
      this.id_byte[id_protected[3]] = var13;
      ((rrIv_1)this.id_byte[id_protected[4]]).id_class((rrtY_2)this.id_byte[id_protected[5]]);
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean id_class(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      this.id_public();
      if (var4 == 0 && super.id_class(var1, var2, var3, var4, var5)) {
         ((rrtY_2)this.id_byte[id_protected[6]]).id_class(var1, var2, var3, var4, id_native[0]);
         return id_native[1];
      } else {
         return id_native[2];
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1713167873914147669L;
   }

   @Override
   public boolean id_class(char var1, int var2) {
      this.id_public();
      ((rrtY_2)this.id_byte[id_protected[10]]).id_class(var1, var2);
      return super.id_class(var1, var2);
   }

   @Override
   public void id_class(int var1, int var2, int var3) {
      this.id_public();
      super.id_class(var1, var2, var3);
      ((rrtY_2)this.id_byte[id_protected[8]]).id_class(var1, var2, var3);
   }

   @Override
   public boolean id_class(rrtu_3 var1, int var2, int var3, int var4) {
      this.id_public();
      super.id_class(var1, var2, var3, var4);
      ((rrtY_2)this.id_byte[id_protected[7]]).id_throws();
      return id_native[3];
   }

   @Override
   public void id_class(Ml_1 var1, rrtu_3 var2, int var3, int var4) {
      super.id_class(var1, var2, var3, var4);
      rruv_1 var5 = this.id_volatile();
      float var6 = this.id_package();
      float var7 = this.id_final();
      float var8 = this.id_new();
      float var9 = var5.id_class();
      this.id_private().id_interface().id_class(var1, () -> {
         this.id_public();
         ((rrtY_2)this.id_byte[id_protected[15]]).id_class(var1, var2, var6, var7, var8, var9, var3, var4, id_native[4]);
      });
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1225413495;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{12, -128, 122, 46, -75, 15, -86, -94}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Setting<?> id_finally() {
      this.id_public();
      return (rrIv_1)this.id_byte[id_protected[14]];
   }

   private static void id_goto() {
      id_volatile = new float[]{3.0F, 10.0F};
   }

   @Override
   public void id_case() {
      this.id_public();
      super.id_case();
      ((rrtY_2)this.id_byte[id_protected[11]]).id_private();
   }

   @Override
   public void id_else() {
      this.id_public();
      super.id_else();
      ((rrtY_2)this.id_byte[id_protected[12]]).id_protected();
   }

   private static void id_return() {
      id_throws = new byte[]{3};
   }

   private static void id_while() {
      id_native = new boolean[]{false, true, false, false, false};
   }

   private void id_public() {
      if (this.id_byte == null) {
         this.id_byte = new Object[id_throws[0]];
         Object[] var1 = this.id_byte;
      }
   }

   @Override
   public rrtN_2 id_private() {
      this.id_public();
      return (rrtN_2)this.id_byte[id_protected[13]];
   }

   @Override
   public rruv_1 id_volatile() {
      return new rruv_1(this.id_package(), this.id_final() - id_volatile[0], this.id_new(), this.id_continue() - id_volatile[1]);
   }

   private static void id_synchronized() {
      id_protected = new short[]{0, 1, 0, 2, 1, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2};
   }
}
