package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AnimValue implements rrNG {
   private static double[] id_break;
   public Object[] id_class;
   private static float[] id_byte;
   private static short[] id_protected;
   private static boolean[] id_throws;
   private static byte[] id_case;

   @Override
   public float id_byte() {
      return (Float)this.id_class[id_protected[30]];
   }

   public float id_byte(float var1) {
      return this.id_byte() + Math.min(id_byte[2], var1) * (id_byte[3] - this.id_byte());
   }

   public rrNE id_int() {
      return (rrNE)this.id_class[id_protected[56]];
   }

   public AnimValue(float var1, boolean var2) {
      this((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[id_protected[5]], var1, var2);
   }

   public AnimValue(rrQK var1, float var2, boolean var3) {
      this.id_this();
      rrNE var8 = (rrNE)rrNE.staticFieldsf494c4277fc533979058c6d61fda001b[id_protected[0]];
      this.id_class[id_protected[1]] = var8;
      Float var9 = id_byte[0];
      this.id_class[id_protected[2]] = var9;
      Boolean var10 = id_throws[0];
      this.id_class[id_protected[3]] = var10;
      rrNb_1 var11 = new rrNb_1(var1, (double)var2);
      this.id_class[id_protected[4]] = var11;
      if (var3) {
         this.id_class();
      }
   }

   static {
      ntfClinit();
   }

   private void id_this() {
      if (this.id_class == null) {
         this.id_class = new Object[id_case[0]];
         Object[] var1 = this.id_class;
         var1[id_case[1]] = id_byte[14];
         var1[id_case[2]] = id_byte[15];
         var1[id_case[3]] = id_throws[21];
         var1[id_case[4]] = id_throws[22];
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -849740837;
   }

   public void id_class(float var1) {
      Float var6 = var1;
      this.id_class[id_protected[33]] = var6;
      ((rrNb_1)this.id_class[id_protected[34]]).id_class(var1);
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-75, -58, 3, -56, -37, 123, 112, -96}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_class(rrNE var1, float var2) {
      Float var7 = var2;
      this.id_class[id_protected[7]] = var7;
      this.id_class[id_protected[8]] = var1;
      if ((Boolean)this.id_class[id_protected[9]] && (Float)this.id_class[id_protected[10]] != var2) {
         Boolean var9 = id_throws[1];
         this.id_class[id_protected[11]] = var9;
         this.id_class(var2);
      } else if (!(Boolean)this.id_class[id_protected[12]] || !this.id_protected()) {
         ((rrNb_1)this.id_class[id_protected[13]]).id_class((double)var2);
         ((rrNb_1)this.id_class[id_protected[14]]).id_protected();
         Float var10 = (float)((rrNb_1)this.id_class[id_protected[15]]).id_byte();
         this.id_class[id_protected[16]] = var10;
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2512908034542653956L;
   }

   public void id_class() {
      Float var5 = id_byte[6];
      this.id_class[id_protected[35]] = var5;
      Float var6 = id_byte[7];
      this.id_class[id_protected[36]] = var6;
      ((rrNb_1)this.id_class[id_protected[37]]).id_class(id_break[0]);
      ((rrNb_1)this.id_class[id_protected[38]]).id_break();
   }

   public void id_class(boolean var1) {
      byte var2 = var1 ? id_throws[2] : id_throws[3];
      Float var7 = (float)var2;
      this.id_class[id_protected[17]] = var7;
      rrNE var8 = var1
         ? (rrNE)rrNE.staticFieldsf494c4277fc533979058c6d61fda001b[id_protected[18]]
         : (rrNE)rrNE.staticFieldsf494c4277fc533979058c6d61fda001b[id_protected[19]];
      this.id_class[id_protected[20]] = var8;
      if ((Boolean)this.id_class[id_protected[21]] && (Float)this.id_class[id_protected[22]] != (float)var2) {
         Boolean var9 = id_throws[4];
         this.id_class[id_protected[23]] = var9;
         this.id_class((float)var2);
      } else if (!(Boolean)this.id_class[id_protected[24]] || !this.id_protected()) {
         ((rrNb_1)this.id_class[id_protected[25]]).id_class((double)var2);
         ((rrNb_1)this.id_class[id_protected[26]]).id_protected();
         Float var10 = (float)((rrNb_1)this.id_class[id_protected[27]]).id_byte();
         this.id_class[id_protected[28]] = var10;
      }
   }

   public rrNb_1 id_break() {
      return (rrNb_1)this.id_class[id_protected[55]];
   }

   public void id_break(float var1) {
      this.id_class((rrNE)rrNE.staticFieldsf494c4277fc533979058c6d61fda001b[id_protected[6]], var1);
   }

   public AnimValue id_throws() {
      Boolean var5 = id_throws[18];
      this.id_class[id_protected[46]] = var5;
      return this;
   }

   public boolean id_finally() {
      return (rrNE)this.id_class[id_protected[42]] == (rrNE)rrNE.staticFieldsf494c4277fc533979058c6d61fda001b[id_protected[43]] ? id_throws[14] : id_throws[15];
   }

   public boolean id_catch() {
      return this.id_new() && this.id_protected() ? id_throws[10] : id_throws[11];
   }

   public void id_extends() {
      Float var5 = id_byte[8];
      this.id_class[id_protected[40]] = var5;
      ((rrNb_1)this.id_class[id_protected[41]]).id_case();
   }

   @Override
   public boolean id_case() {
      return this.id_byte() > id_byte[1] ? id_throws[5] : id_throws[6];
   }

   public float id_continue() {
      return this.id_class[id_protected[31]] > id_byte[4] ? (Float)this.id_class[id_protected[32]] - this.id_byte() : id_byte[5] - this.id_byte();
   }

   private static void id_else() {
      id_throws = new boolean[]{
         true, false, true, false, false, true, false, true, false, true, true, false, true, false, true, false, true, false, false, true, false, false, false
      };
   }

   public float id_implements() {
      return (Float)this.id_class[id_protected[57]];
   }

   public boolean id_new() {
      return (rrNE)this.id_class[id_protected[44]] == (rrNE)rrNE.staticFieldsf494c4277fc533979058c6d61fda001b[id_protected[45]] ? id_throws[16] : id_throws[17];
   }

   public AnimValue id_package() {
      Boolean var5 = id_throws[9];
      this.id_class[id_protected[39]] = var5;
      return this;
   }

   private static void id_return() {
      id_byte = new float[]{-1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.999F, 0.0F, 1.0F, 0.0F, 0.0F};
   }

   private static void id_super() {
      id_break = new double[]{1.0};
   }

   private static void id_public() {
      id_case = new byte[]{6, 2, 3, 4, 5};
   }

   @Override
   public boolean id_protected() {
      return this.id_byte() == this.id_class[id_protected[29]] ? id_throws[7] : id_throws[8];
   }

   public boolean id_private() {
      return (Boolean)this.id_class[id_protected[59]];
   }

   public float id_final() {
      if ((Float)this.id_class[id_protected[47]] < id_byte[9]) {
         this.id_class((rrNE)rrNE.staticFieldsf494c4277fc533979058c6d61fda001b[id_protected[48]], id_byte[10]);
      } else if (this.id_protected()) {
         boolean var1 = this.id_class[id_protected[49]] >= id_byte[11] ? id_throws[19] : id_throws[20];
         this.id_class(
            var1
               ? (rrNE)rrNE.staticFieldsf494c4277fc533979058c6d61fda001b[id_protected[50]]
               : (rrNE)rrNE.staticFieldsf494c4277fc533979058c6d61fda001b[id_protected[51]],
            var1 ? id_byte[12] : id_byte[13]
         );
      } else {
         this.id_class((rrNE)this.id_class[id_protected[52]], (Float)this.id_class[id_protected[53]]);
      }

      return (Float)this.id_class[id_protected[54]];
   }

   public boolean id_volatile() {
      return this.id_finally() && this.id_protected() ? id_throws[12] : id_throws[13];
   }

   private static void id_synchronized() {
      id_protected = new short[]{
         0,
         1,
         3,
         4,
         0,
         0,
         0,
         3,
         1,
         5,
         2,
         5,
         4,
         0,
         0,
         0,
         2,
         3,
         0,
         1,
         1,
         5,
         2,
         5,
         4,
         0,
         0,
         0,
         2,
         3,
         2,
         3,
         3,
         2,
         0,
         3,
         2,
         0,
         0,
         5,
         2,
         0,
         1,
         0,
         1,
         1,
         4,
         3,
         0,
         3,
         1,
         0,
         1,
         3,
         2,
         0,
         1,
         3,
         4,
         5
      };
   }

   public boolean id_native() {
      return (Boolean)this.id_class[id_protected[58]];
   }
}
