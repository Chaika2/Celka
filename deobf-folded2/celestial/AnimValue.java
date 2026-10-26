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
      return (Float)this.id_class[2];
   }

   public float id_byte(float var1) {
      return this.id_byte() + Math.min(1.0F, var1) * (1.0F - this.id_byte());
   }

   public rrNE id_int() {
      return (rrNE)this.id_class[1];
   }

   public AnimValue(float var1, boolean var2) {
      this((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[0], var1, var2);
   }

   public AnimValue(rrQK var1, float var2, boolean var3) {
      this.id_this();
      rrNE var8 = (rrNE)rrNE.staticFieldsf494c4277fc533979058c6d61fda001b[0];
      this.id_class[1] = var8;
      Float var9 = -1.0F;
      this.id_class[3] = var9;
      Boolean var10 = true;
      this.id_class[4] = var10;
      rrNb_1 var11 = new rrNb_1(var1, (double)var2);
      this.id_class[0] = var11;
      if (var3) {
         this.id_class();
      }
   }

   static {
      ntfClinit();
   }

   private void id_this() {
      if (this.id_class == null) {
         this.id_class = new Object[6];
         Object[] var1 = this.id_class;
         var1[2] = 0.0F;
         var1[3] = 0.0F;
         var1[4] = false;
         var1[5] = false;
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -849740837;
   }

   public void id_class(float var1) {
      Float var6 = var1;
      this.id_class[2] = var6;
      ((rrNb_1)this.id_class[0]).id_class(var1);
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
      this.id_class[3] = var7;
      this.id_class[1] = var1;
      if ((Boolean)this.id_class[5] && (Float)this.id_class[2] != var2) {
         Boolean var9 = false;
         this.id_class[5] = var9;
         this.id_class(var2);
      } else if (!(Boolean)this.id_class[4] || !this.id_protected()) {
         ((rrNb_1)this.id_class[0]).id_class((double)var2);
         ((rrNb_1)this.id_class[0]).id_protected();
         Float var10 = (float)((rrNb_1)this.id_class[0]).id_byte();
         this.id_class[2] = var10;
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2512908034542653956L;
   }

   public void id_class() {
      Float var5 = 1.0F;
      this.id_class[3] = var5;
      Float var6 = 1.0F;
      this.id_class[2] = var6;
      ((rrNb_1)this.id_class[0]).id_class(1.0);
      ((rrNb_1)this.id_class[0]).id_break();
   }

   public void id_class(boolean var1) {
      byte var2 = var1 ? 1 : id_throws[3];
      Float var7 = (float)var2;
      this.id_class[3] = var7;
      rrNE var8 = var1 ? (rrNE)rrNE.staticFieldsf494c4277fc533979058c6d61fda001b[0] : (rrNE)rrNE.staticFieldsf494c4277fc533979058c6d61fda001b[1];
      this.id_class[1] = var8;
      if ((Boolean)this.id_class[5] && (Float)this.id_class[2] != (float)var2) {
         Boolean var9 = false;
         this.id_class[5] = var9;
         this.id_class((float)var2);
      } else if (!(Boolean)this.id_class[4] || !this.id_protected()) {
         ((rrNb_1)this.id_class[0]).id_class((double)var2);
         ((rrNb_1)this.id_class[0]).id_protected();
         Float var10 = (float)((rrNb_1)this.id_class[0]).id_byte();
         this.id_class[2] = var10;
      }
   }

   public rrNb_1 id_break() {
      return (rrNb_1)this.id_class[0];
   }

   public void id_break(float var1) {
      this.id_class((rrNE)rrNE.staticFieldsf494c4277fc533979058c6d61fda001b[0], var1);
   }

   public AnimValue id_throws() {
      Boolean var5 = false;
      this.id_class[4] = var5;
      return this;
   }

   public boolean id_finally() {
      return (rrNE)this.id_class[1] == (rrNE)rrNE.staticFieldsf494c4277fc533979058c6d61fda001b[0] ? true : id_throws[15];
   }

   public boolean id_catch() {
      return this.id_new() && this.id_protected() ? true : id_throws[11];
   }

   public void id_extends() {
      Float var5 = 0.0F;
      this.id_class[2] = var5;
      ((rrNb_1)this.id_class[0]).id_case();
   }

   @Override
   public boolean id_case() {
      return this.id_byte() > 0.0F ? true : id_throws[6];
   }

   public float id_continue() {
      return this.id_class[3] > 1.0F ? (Float)this.id_class[3] - this.id_byte() : id_byte[5] - this.id_byte();
   }

   private static void id_else() {
      id_throws = new boolean[]{
         true, false, true, false, false, true, false, true, false, true, true, false, true, false, true, false, true, false, false, true, false, false, false
      };
   }

   public float id_implements() {
      return (Float)this.id_class[3];
   }

   public boolean id_new() {
      return (rrNE)this.id_class[1] == (rrNE)rrNE.staticFieldsf494c4277fc533979058c6d61fda001b[1] ? true : id_throws[17];
   }

   public AnimValue id_package() {
      Boolean var5 = true;
      this.id_class[5] = var5;
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
      return this.id_byte() == this.id_class[3] ? true : id_throws[8];
   }

   public boolean id_private() {
      return (Boolean)this.id_class[5];
   }

   public float id_final() {
      if ((Float)this.id_class[3] < 0.0F) {
         this.id_class((rrNE)rrNE.staticFieldsf494c4277fc533979058c6d61fda001b[0], 1.0F);
      } else if (this.id_protected()) {
         boolean var1 = this.id_class[3] >= 0.999F ? true : id_throws[20];
         this.id_class(
            var1 ? (rrNE)rrNE.staticFieldsf494c4277fc533979058c6d61fda001b[1] : (rrNE)rrNE.staticFieldsf494c4277fc533979058c6d61fda001b[0],
            var1 ? 0.0F : id_byte[13]
         );
      } else {
         this.id_class((rrNE)this.id_class[1], (Float)this.id_class[3]);
      }

      return (Float)this.id_class[2];
   }

   public boolean id_volatile() {
      return this.id_finally() && this.id_protected() ? true : id_throws[13];
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
      return (Boolean)this.id_class[4];
   }
}
