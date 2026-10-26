package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZm_1 {
   private static short[] id_break;
   private static byte[] id_byte;
   private static float[] id_protected;
   public Object[] id_class;

   public rrZK id_byte() {
      return (rrZK)this.id_class[3];
   }

   public rrZm_1(rrvJ var1, rrtu_3 var2, int var3) {
      this.id_implements();
      ArrayList var8 = new ArrayList();
      this.id_class[5] = var8;
      rrZI var9 = new rrZI(var1, var2, var3 + 7, 5);
      this.id_class[0] = var9;
      rrZw_1 var10 = new rrZw_1(var1, (float)var3 + 6.5F, 10.0F);
      this.id_class[1] = var10;
      rrZf_1 var11 = new rrZf_1(var1, var3 + 7, 5);
      this.id_class[2] = var11;
      rrZK var12 = new rrZK(var1, var2, (float)var3 + 6.5F, 10.0F);
      this.id_class[3] = var12;
      rrZj_1 var13 = new rrZj_1(var1, var2, (float)var3 + 6.5F, 10.0F);
      this.id_class[4] = var13;
      ((List)this.id_class[5]).addAll(List.of(this.id_class[0], this.id_class[1], this.id_class[2], this.id_class[3], this.id_class[4]));
   }

   static {
      ntfClinit();
   }

   public rrZf_1 id_class() {
      return (rrZf_1)this.id_class[2];
   }

   public rrZN id_class(Category var1) {
      return (rrZN)(switch (((int[])rrZZ.id_class[0])[var1.ordinal()]) {
         case 1, 2, 3, 4, 5 -> (rrZI)this.id_class[0];
         case 6 -> (rrZK)this.id_class[3];
         case 7 -> (rrZj_1)this.id_class[4];
         case 8 -> (rrZw_1)this.id_class[1];
         case 9 -> (rrZf_1)this.id_class[2];
         default -> throw new IncompatibleClassChangeError();
      });
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1164437158;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{92, -53, -6, 19, -120, 43, -40, -123}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6626958858748187082L;
   }

   public List<rrZN> id_break() {
      return (List<rrZN>)this.id_class[5];
   }

   public rrZj_1 id_throws() {
      return (rrZj_1)this.id_class[4];
   }

   private static void id_finally() {
      id_byte = new byte[]{7, 5, 7, 5, 6};
   }

   private static void id_catch() {
      id_protected = new float[]{6.5F, 10.0F, 6.5F, 10.0F, 6.5F, 10.0F};
   }

   public rrZw_1 id_case() {
      return (rrZw_1)this.id_class[1];
   }

   private void id_implements() {
      if (this.id_class == null) {
         this.id_class = new Object[6];
         Object[] var1 = this.id_class;
      }
   }

   public rrZI id_protected() {
      return (rrZI)this.id_class[0];
   }

   private static void id_private() {
      id_break = new short[]{5, 0, 1, 2, 3, 4, 5, 0, 1, 2, 3, 4, 0, 0, 3, 4, 1, 2, 0, 1, 2, 3, 4, 5};
   }
}
