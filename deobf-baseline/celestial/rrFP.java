package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFP extends rrFr_1 {
   private static long[] id_byte;
   private static String[] id_protected;
   private static double[] id_throws;
   private static short[] id_case;
   private static boolean[] id_catch;
   private static byte[] id_private;
   private static float[] id_implements;
   public Object[] id_break;

   @Override
   public boolean id_byte() {
      return id_catch[0];
   }

   private long id_byte(long var1) {
      this.id_super();
      long var3 = var1 - (Long)this.id_break[id_case[32]];
      if (var3 >= id_byte[3] && var3 < id_byte[4]) {
         float var5 = (float)var3 / id_implements[3];
         float var6 = var5 < id_implements[4] ? var5 : id_implements[5] - var5;
         return var1 - (long)(var6 * id_implements[6]);
      } else {
         return var1;
      }
   }

   private static void id_int() {
      id_case = new short[]{8, 10, 0, 1, 2, 3, 1, 8, 5, 4, 6, 7, 6, 4, 1, 0, 0, 5, 0, 6, 57, 57, 3, 7, 0, 8, 10, 5, 0, 9, 10, 9, 10, 2, 57, 57, 1, 2, 0};
   }

   public rrFP(rrHv_1 var1) {
      this.id_super();
      String var7 = id_protected[0];
      this.id_break[id_case[0]] = var7;
      Long var8 = id_byte[0];
      this.id_break[id_case[1]] = var8;
      this.id_break[id_case[2]] = var1;
      rdn_3 var2 = var1.id_byte();
      rdn_3 var10 = var2.id_implements();
      this.id_break[id_case[3]] = var10;
      Predicate var11 = var1.id_protected();
      this.id_break[id_case[4]] = var11;
      rdb_3 var12 = var2.id_break();
      this.id_break[id_case[5]] = var12;
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_implements = new float[]{0.0F, 300.0F, -4.0F, 300.0F, 0.5F, 1.0F, 300.0F};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 779070896;
   }

   @Override
   public rdn_3 id_class() {
      this.id_super();
      return (rdn_3)this.id_break[id_case[6]];
   }

   @Override
   public float id_class(long var1) {
      this.id_super();
      long var3 = var1 - (Long)this.id_break[id_case[26]];
      if (var3 >= id_byte[1] && var3 < id_byte[2]) {
         float var5 = (float)var3 / id_implements[1];
         return id_implements[2] * (float)Math.sin(id_throws[0] * (double)var5);
      } else {
         return id_implements[0];
      }
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{34, -122, -33, 3, 66, 75, 49, -21}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_break(rrZO var1) {
      this.id_super();
      int var2 = this.id_continue();
      Boolean var7 = var2 > 0 ? id_catch[5] : id_catch[6];
      this.id_break[id_case[13]] = var7;
      ((rdn_3)this.id_break[id_case[14]]).id_throws(var2);
      Boolean var8 = ((rrHv_1)this.id_break[id_case[15]]).id_throws().id_finally()
            != (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[id_case[16]]
         ? id_catch[7]
         : id_catch[8];
      this.id_break[id_case[17]] = var8;
      Boolean var9 = ((rrHv_1)this.id_break[id_case[18]]).id_class().aJ_();
      this.id_break[id_case[19]] = var9;
      Boolean var10 = (cb_3)id_import.id_class[id_case[20]] != null && ((cb_3)id_import.id_class[id_case[21]]).sK().id_class((rdb_3)this.id_break[id_case[22]])
         ? id_catch[9]
         : id_catch[10];
      this.id_break[id_case[23]] = var10;
      String var11 = ((rrHv_1)this.id_break[id_case[24]]).id_throws().id_finally().id_break();
      this.id_break[id_case[25]] = var11;
   }

   @Override
   public void id_break(long var1) {
      this.id_protected(var1);
   }

   @Override
   public boolean id_break(boolean var1) {
      this.id_super();
      return var1 && this.id_break[id_case[12]] ? id_catch[3] : id_catch[4];
   }

   private static long id_throws(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3516123892194555693L;
   }

   public rrHv_1 id_extends() {
      this.id_super();
      return (rrHv_1)this.id_break[id_case[38]];
   }

   private int id_continue() {
      this.id_super();
      if ((Predicate)this.id_break[id_case[33]] != null && (cb_3)id_import.id_class[id_case[34]] != null) {
         int var1 = id_catch[14];

         for (int var2 = id_catch[15]; var2 < id_private[0]; var2++) {
            rdn_3 var3 = ((rhz_3)((cb_3)id_import.id_class[id_case[35]]).id_implements[id_case[36]]).id_extends(var2);
            if (((Predicate)this.id_break[id_case[37]]).test(var3)) {
               var1 += var3.id_char();
            }
         }

         return var1;
      } else {
         return id_catch[13];
      }
   }

   @Override
   public String id_implements() {
      this.id_super();
      return (String)this.id_break[id_case[7]];
   }

   private static void id_new() {
      id_protected = new String[]{new String("")};
   }

   private static void id_package() {
      id_private = new byte[]{45, 11, 4, 5, 6, 7, 9, 10};
   }

   private void id_super() {
      if (this.id_break == null) {
         this.id_break = new Object[id_private[1]];
         Object[] var1 = this.id_break;
         var1[id_private[2]] = id_catch[16];
         var1[id_private[3]] = id_catch[17];
         var1[id_private[4]] = id_catch[18];
         var1[id_private[5]] = id_catch[19];
         var1[id_private[6]] = id_catch[20];
         var1[id_private[7]] = id_byte[5];
      }
   }

   @Override
   public boolean id_protected() {
      this.id_super();
      return this.id_break[id_case[8]] && this.id_break[id_case[9]] && this.id_break[id_case[10]] && !this.id_break[id_case[11]] ? id_catch[1] : id_catch[2];
   }

   private void id_protected(long var1) {
      this.id_super();
      boolean var3 = this.id_break[id_case[27]] && ((rrHv_1)this.id_break[id_case[28]]).id_throws().id_break() ? id_catch[11] : id_catch[12];
      if (var3 && !(Boolean)this.id_break[id_case[29]]) {
         Long var8 = this.id_byte(var1);
         this.id_break[id_case[30]] = var8;
      }

      Boolean var9 = var3;
      this.id_break[id_case[31]] = var9;
   }

   private static void id_final() {
      id_byte = new long[]{-4611686018427387904L, 0L, 300L, 0L, 300L, 0L};
   }

   private static void id_volatile() {
      id_catch = new boolean[]{
         false, true, false, true, false, true, false, true, false, true, false, true, false, false, false, false, false, false, false, false, false
      };
   }

   private static void id_native() {
      id_throws = new double[]{Math.PI};
   }
}
