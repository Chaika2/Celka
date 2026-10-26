package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFL {
   public static Object[] id_class;
   private static boolean[] id_byte;
   private static float[] id_protected;
   private static byte[] id_throws;
   private static short[] id_case;
   public Object[] id_break;

   public boolean id_byte() {
      return (Boolean)this.id_break[id_case[27]];
   }

   public rrFL(float var1, float var2, float var3) {
      this.id_implements();
      rdn_3 var8 = rdn_3.id_break;
      this.id_break[id_case[0]] = var8;
      rdn_3 var9 = rdn_3.id_break;
      this.id_break[id_case[1]] = var9;
      Boolean var10 = id_byte[0];
      this.id_break[id_case[2]] = var10;
      Boolean var11 = id_byte[1];
      this.id_break[id_case[3]] = var11;
      AnimValue var12 = new AnimValue((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[id_case[4]], var1, id_byte[2]).id_package();
      this.id_break[id_case[5]] = var12;
      AnimValue var13 = new AnimValue((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[id_case[6]], var2, id_byte[3]);
      this.id_break[id_case[7]] = var13;
      AnimValue var14 = new AnimValue((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[id_case[8]], var3, id_byte[4]);
      this.id_break[id_case[9]] = var14;
   }

   static {
      ntfClinit();
   }

   public void id_class(rdn_3 var1) {
      if (!rdn_3.id_byte(var1, (rdn_3)this.id_break[id_case[12]])) {
         if (!var1.id_class() && !((rdn_3)this.id_break[id_case[13]]).id_class()) {
            ((AnimValue)this.id_break[id_case[14]]).id_extends();
         }

         rdn_3 var6 = var1.id_implements();
         this.id_break[id_case[15]] = var6;
      }

      ((AnimValue)this.id_break[id_case[16]]).id_class(!var1.id_class() ? id_byte[6] : id_byte[7]);
      if (!var1.id_class()) {
         this.id_break[id_case[17]] = var1;
         Boolean var8 = id_byte[8];
         this.id_break[id_case[18]] = var8;
      } else if (((AnimValue)this.id_break[id_case[19]]).id_byte() < id_protected[0]) {
         Boolean var9 = id_byte[9];
         this.id_break[id_case[20]] = var9;
         Boolean var10 = id_byte[10];
         this.id_break[id_case[21]] = var10;
      }

      ((AnimValue)this.id_break[id_case[22]]).id_class(id_byte[11]);
   }

   public void id_class(Ml_1 var1, float var2, float var3, float var4, float var5, float var6) {
      float var7 = ((AnimValue)this.id_break[id_case[30]]).id_byte();
      if (!(var7 <= id_protected[1]) && !((rdn_3)this.id_break[id_case[31]]).id_class()) {
         float var8 = rfU_2.id_class(var4 * var7, id_protected[2], id_protected[3]);
         if (!(var8 <= id_protected[4])) {
            float var9 = id_protected[5] + id_protected[6] * ((AnimValue)this.id_break[id_case[32]]).id_byte();
            float var10 = var5 * (id_protected[7] - var9) / id_protected[8];
            float var11 = (id_protected[9] - var7) * id_protected[10];
            rrfD_2.id_class(
               var1,
               (rdn_3)this.id_break[id_case[33]],
               var2 + var10,
               var3 + var10 + var11,
               var8,
               var9 * var6,
               id_protected[11],
               id_protected[12],
               id_throws[0],
               id_byte[13],
               id_byte[14]
            );
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 301653027;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{92, 99, 89, 56, -60, -52, 46, -23}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_class(float var1) {
      if (!(Boolean)this.id_break[id_case[23]]) {
         ((AnimValue)this.id_break[id_case[24]]).id_class(var1);
         Boolean var6 = id_byte[12];
         this.id_break[id_case[25]] = var6;
      }

      ((AnimValue)this.id_break[id_case[26]]).id_break(var1);
   }

   public float id_class() {
      return ((AnimValue)this.id_break[id_case[28]]).id_byte();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8112820882067099157L;
   }

   public void id_break() {
      ((AnimValue)this.id_break[id_case[10]]).id_package();
      Boolean var5 = id_byte[5];
      this.id_break[id_case[11]] = var5;
   }

   private static void id_throws() {
      id_case = new short[]{3, 4, 5, 6, 0, 0, 0, 1, 0, 2, 0, 6, 3, 3, 1, 3, 0, 4, 5, 0, 5, 6, 1, 6, 2, 6, 2, 5, 2, 0, 0, 4, 1, 4};
   }

   private static void id_finally() {
      Object[] var0 = new Object[]{-1.0842022E-19F, -1.0842022E-19F, 0.0F};
      id_class = var0;
   }

   private static void id_catch() {
      id_protected = new float[]{0.05F, 0.001F, 0.0F, 1.0F, 0.001F, 0.1F, 0.9F, 1.0F, 2.0F, 1.0F, 5.0F, 2.0F, 13.0F, 0.05F, 0.1F, 5.0F};
   }

   private static void id_case() {
      id_throws = new byte[]{13, 7, 5, 6, 3, 2};
   }

   private void id_implements() {
      if (this.id_break == null) {
         this.id_break = new Object[id_throws[1]];
         Object[] var1 = this.id_break;
         var1[id_throws[2]] = id_byte[15];
         var1[id_throws[3]] = id_byte[16];
      }
   }

   public float id_protected() {
      return ((AnimValue)this.id_break[id_case[29]]).id_byte();
   }

   private static void id_private() {
      id_byte = new boolean[]{false, false, false, false, true, false, true, false, true, false, false, true, true, true, true, false, false, false, true};
   }
}
