package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtI_2 {
   public Object[] id_class;
   private static short[] id_break;
   private static byte[] id_byte;
   private static float[] id_protected;
   private static boolean[] id_throws;

   public float id_byte() {
      return ((rrtw_3)this.id_class[id_break[11]]).id_final();
   }

   public rrtI_2(rrtw_3 var1) {
      this.id_catch();
      this.id_class[id_break[0]] = var1;
   }

   static {
      ntfClinit();
   }

   public boolean id_class(rrtu_3 var1, float var2, float var3, int var4, int var5, int var6) {
      if (!((rrtw_3)this.id_class[id_break[2]]).id_return().id_protected()) {
         return id_throws[0];
      } else {
         boolean var7 = ((rrtw_3)this.id_class[id_break[3]]).id_class(var1, this, var2, var3, var4, var5, var6);
         if (!var7 && var6 < id_byte[0]) {
            ((rrtw_3)this.id_class[id_break[4]]).id_class(!((rrtw_3)this.id_class[id_break[5]]).id_class() ? id_throws[1] : id_throws[2]);
         }

         return var7;
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1953597121147496050L;
   }

   public boolean id_class(rrtu_3 var1, int var2, int var3, int var4) {
      if (!((rrtw_3)this.id_class[id_break[6]]).id_return().id_case()) {
         return id_throws[3];
      } else if (var1.id_class(((rrtw_3)this.id_class[id_break[7]]).id_private(), var2, var3)) {
         ((rrtw_3)this.id_class[id_break[8]]).id_class(id_throws[4]);
         return id_throws[5];
      } else {
         return id_throws[6];
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 937799035;
   }

   public void id_class(Ml_1 var1, int var2, int var3) {
      ((rrtw_3)this.id_class[id_break[1]]).id_class(var1, this, var2, var3);
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{24, 119, 44, -99, 22, -121, -66, -75}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public float id_class() {
      return Math.max(id_protected[0], ((rrtw_3)this.id_class[id_break[12]]).id_class(id_protected[1], id_protected[2]));
   }

   public float id_break() {
      return ((rrtw_3)this.id_class[id_break[9]]).id_package() + ((rrtw_3)this.id_class[id_break[10]]).id_new() - this.id_private();
   }

   public float id_throws() {
      return this.id_private();
   }

   private static void id_finally() {
      id_break = new short[14];
   }

   private void id_catch() {
      if (this.id_class == null) {
         this.id_class = new Object[id_throws[7]];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_extends() {
      id_byte = new byte[]{3};
   }

   private static void id_case() {
      id_throws = new boolean[]{false, true, false, false, false, true, false, true};
   }

   private static void id_implements() {
      id_protected = new float[]{10.0F, 10.0F, 0.0F};
   }

   public rruv_1 id_protected() {
      return new rruv_1(this.id_break(), this.id_byte(), this.id_throws(), this.id_class());
   }

   private float id_private() {
      return ((rrtw_3)this.id_class[id_break[13]]).id_public();
   }
}
