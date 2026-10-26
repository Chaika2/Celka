package celestial;

import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCs_1 extends rrnK_2 {
   private static boolean[] id_case;
   private static double[] id_catch;
   public Object[] id_byte;
   private static String[] id_private;
   public static Object[] id_protected;
   private static short[] id_implements;
   private static byte[] id_finally;
   private static float[] id_extends;

   @Override
   public float id_byte() {
      this.id_instanceof();
      return this.id_byte[id_implements[20]] ? -1.0F : 1.0F;
   }

   @Override
   public float id_int() {
      this.id_instanceof();
      return this.id_byte[id_implements[21]] ? -1.0F : 1.0F;
   }

   public rrCs_1(AttackAura var1) {
      super(var1, id_class(var1));
      this.id_instanceof();
      Float var6 = 1.0F;
      this.id_byte[1] = var6;
      rrTH var7 = (var1x, var2, var3) -> {
         this.id_instanceof();
         float var4 = rfU_2.id_catch(var2 - var1x);
         float var5 = this.id_while();
         float var6x = (float)Math.sin((double)var5 * Math.PI);
         float var7x = var1x + var4 * var6x;
         if ((Float)this.id_byte[1] < 1.0F) {
            if (!(Boolean)this.id_byte[5]) {
               Float var13 = var7x;
               this.id_byte[3] = var13;
               Boolean var14 = true;
               this.id_byte[5] = var14;
            }

            float var8x = Math.min((Float)this.id_byte[1] + (float)(Math.random() / 20.0), 1.0F);
            return var1x + ((Float)this.id_byte[3] - var1x) * var8x;
         } else {
            return var7x;
         }
      };
      this.id_byte[7] = var7;
      rrTH var8 = (var1x, var2, var3) -> {
         this.id_instanceof();
         float var4 = var2 - var1x;
         float var5 = this.id_while();
         float var6x = (float)Math.sin((double)var5 * Math.PI);
         float var7x = var1x + var4 * var6x;
         if ((Float)this.id_byte[1] < 1.0F) {
            if (!(Boolean)this.id_byte[6]) {
               Float var13 = var7x;
               this.id_byte[4] = var13;
               Boolean var14 = true;
               this.id_byte[6] = var14;
            }

            float var8x = Math.min((Float)this.id_byte[1] + (float)(Math.random() / 20.0), 1.0F);
            return var1x + ((Float)this.id_byte[4] - var1x) * var8x;
         } else {
            return var7x;
         }
      };
      this.id_byte[8] = var8;
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_private = new String[]{
         new String(
            ".*(snow|banner|sign|step|frame|conduit|bamboo|anvil|chipped_anvil|damaged_anvil|nether_brick_wall|grindstone|stonecutter|lantern|soul_lantern|campfire|soul_campfire|daylight_detector|lectern|brewing_stand|cauldron|table|slab|stair|chest|ladder|vine|waterlily|wall|chain|carpet|pane|fence|fence_gate|gate|rod|bed|skull|pot|hopper|door|bars|piston|lily|plate|farm|path).*"
         )
      };
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 87498120;
   }

   @Override
   public void id_class(q_1 var1) {
      this.id_instanceof();
      super.id_class(var1);
      AttackAura var2 = this.id_continue();
      rrnD_2 var3 = var2.id_long();
      iB_2 var4 = var2.id_continue();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_implements[3]]) {
         if (var4 != null && !(Boolean)this.id_byte[2]) {
            Float var9 = id_extends[1];
            this.id_byte[1] = var9;
            Boolean var10 = id_case[0];
            this.id_byte[5] = var10;
            Boolean var11 = id_case[1];
            this.id_byte[6] = var11;
         }

         Boolean var12 = var4 != null ? true : id_case[3];
         this.id_byte[2] = var12;
         if ((Float)this.id_byte[1] < 1.0F) {
            Float var13 = (Float)this.id_byte[1] + 0.35F;
            this.id_byte[1] = var13;
            if ((Float)this.id_byte[1] > 1.0F) {
               Float var14 = 1.0F;
               this.id_byte[1] = var14;
            }
         }

         Boolean var15 = id_case[4];
         this.id_byte[id_implements[14]] = var15;
         this.id_class(var4, (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[id_implements[15]]);
         if (var3.id_class(var2)) {
            Boolean var16 = true;
            this.id_byte[id_implements[16]] = var16;
            this.id_class(var4, (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[1]);
            this.id_class(var4);
         }
      }

      var3.id_class(var2, var1);
   }

   private static rrTT id_class(AttackAura var0) {
      rrTT var1 = new rrTT(var0);
      var1.id_class(new rrCE(var1));
      return var1;
   }

   @Override
   public boolean id_class(xc_3 var1) {
      return !var1.id_break().id_byte ? true : ((Set)id_protected[4]).contains(var1.id_break());
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7171201720677317873L;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{7, 13, -99, 57, -12, 32, -113, 118}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public rrTH id_finally() {
      this.id_instanceof();
      return (rrTH)this.id_byte[7];
   }

   private static void id_goto() {
      id_case = new boolean[]{
         false, false, true, false, false, true, false, true, false, false, false, true, true, false, false, true, false, false, false, false, true
      };
   }

   private static void id_else() {
      Object[] var0 = new Object[]{0.0F, 0.0F, 3.689349E19F, 0.12676056, new HashSet()};
      id_protected = var0;
   }

   private void id_instanceof() {
      if (this.id_byte == null) {
         this.id_byte = new Object[9];
         this.id_byte[0] = false;
         this.id_byte[1] = 0.0F;
         this.id_byte[2] = false;
         this.id_byte[3] = 0.0F;
         this.id_byte[4] = 0.0F;
         this.id_byte[5] = false;
         this.id_byte[6] = false;
      }
   }

   @Override
   public rrTH id_package() {
      this.id_instanceof();
      return (rrTH)this.id_byte[8];
   }

   private static void id_return() {
      id_finally = new byte[]{4, 4, 9, 2, 3, 4, 5, 6, 5, 2, 3};
   }

   private static void id_try() {
      id_implements = new short[]{1, 7, 8, 0, 2, 1, 5, 6, 2, 1, 1, 1, 1, 1, 0, 0, 0, 1, 57, 57, 0, 0, 7, 8, 4, 2, 5, 6, 1, 6, 4, 6, 1, 4, 1, 5, 3, 5, 1, 3};
   }

   private float id_while() {
      float var1 = ((cb_3)id_import.id_class[57]).id_class(1.0F, id_case[6]);
      double var2 = ((cb_3)id_import.id_class[57]).id_class(iQ_2.id_private);
      if (var2 > 1.6) {
         var1 *= (float)(1.6 / var2);
      }

      float var4;
      if (var2 < 2.0) {
         float var5 = 1.70158F;
         float var6 = var5 + 1.0F;
         var4 = var6 * var1 * var1 * var1 - var5 * var1 * var1;
      } else if (var1 < 0.5F) {
         var4 = 8.0F * var1 * var1 * var1 * var1;
      } else {
         float var7 = var1 - 1.0F;
         var4 = 1.0F - 8.0F * var7 * var7 * var7 * var7;
      }

      float var8 = 1.0F + 29.0F * var4;
      return var8 / 50.0F;
   }

   private static void id_public() {
      id_catch = new double[]{1.6, 1.6, 2.0, Math.PI, 20.0, Math.PI, 20.0, 0.12676056};
   }

   @Override
   public rrTf_1 id_protected() {
      return null;
   }

   @Override
   public void id_volatile() {
      this.id_instanceof();
      super.id_volatile();
      Boolean var5 = id_case[8];
      this.id_byte[2] = var5;
      Boolean var6 = id_case[9];
      this.id_byte[5] = var6;
      Boolean var7 = id_case[10];
      this.id_byte[6] = var7;
   }

   private static void id_synchronized() {
      id_extends = new float[]{
         1.0F,
         0.0F,
         1.0F,
         0.35F,
         1.0F,
         1.0F,
         1.0F,
         1.70158F,
         1.0F,
         0.5F,
         8.0F,
         1.0F,
         1.0F,
         8.0F,
         1.0F,
         29.0F,
         50.0F,
         -1.0F,
         1.0F,
         -1.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         1.0F,
         0.0F,
         0.0F,
         0.0F,
         30.0F,
         1.0F,
         0.35F
      };
   }
}
