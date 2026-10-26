package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCr_1 extends rrnK_2 {
   private static float[] id_protected;
   private static double[] id_case;
   private static short[] id_catch;
   private static boolean[] id_private;
   private static byte[] id_implements;
   public Object[] id_byte;

   @Override
   public float id_byte() {
      return 52.0F;
   }

   @Override
   public float id_int() {
      AttackAura var1 = this.id_continue();
      if (this.id_extends() == (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[1]) {
         iB_2 var2 = var1.id_continue();
         PX var3 = this.id_private();
         if (var2 != null && var3 != null) {
            float var4 = var1.id_try();
            an_3 var5 = Ph_1.id_class(var2, ((cb_3)id_import.id_class[57]).id_new(1.0F), new PX(var3.id_throws(), var3.id_protected()), var4, true);
            if (var5 != var2) {
               return -1.0F;
            }
         }
      }

      return 5.0F;
   }

   public rrCr_1(AttackAura var1) {
      super(var1, new rrTT(var1));
      this.id_goto();
      rrTf_1 var6 = (var1x, var2) -> {
         this.id_goto();
         float var3 = var2.id_throws();
         float var4 = var2.id_protected();
         if (!(Boolean)this.id_byte[id_catch[10]]) {
            Pr_1 var5 = this.id_implements().id_protected();
            var3 += (float)(Math.sin((double)((Integer)((cb_3)id_import.id_class[57]).id_throws[41]).intValue()) * 3.0);
            var4 += (float)Math.cos((double)((Integer)((cb_3)id_import.id_class[57]).id_throws[41]).intValue()) * 0.5F;
            var3 += (float)rrfQ_2.id_class(var5, -0.5, 0.5);
            var4 += (float)rrfQ_2.id_class(var5, -0.5, 0.5);
         }

         return new PX(var3, var4);
      };
      this.id_byte[1] = var6;
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_case = new double[]{3.0, -0.5, 0.5, -0.5, 0.5};
   }

   @Override
   public void id_class(q_1 var1) {
      this.id_goto();
      super.id_class(var1);
      AttackAura var2 = this.id_continue();
      rrnD_2 var3 = var2.id_long();
      iB_2 var4 = var2.id_continue();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_catch[1]]) {
         this.id_class(var4, (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[id_catch[2]]);
         if (var3.id_class(var2)) {
            Boolean var9 = true;
            this.id_byte[id_catch[3]] = var9;
            this.id_class(var4, (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[1]);
            this.id_class(var4);
         } else {
            Boolean var10 = id_private[1];
            this.id_byte[id_catch[5]] = var10;
         }
      }

      var3.id_class(var2, var1);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5857290385354911740L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1516174425;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{53, -88, 83, -47, -10, 55, -95, 88}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void id_goto() {
      if (this.id_byte == null) {
         this.id_byte = new Object[2];
         this.id_byte[0] = false;
      }
   }

   private static void id_else() {
      id_catch = new short[]{1, 0, 0, 0, 1, 0, 1, 57, 1, 0, 0, 57, 41, 57, 41};
   }

   private static void id_return() {
      id_private = new boolean[]{true, false, true, false, false, false};
   }

   private static void id_public() {
      id_implements = new byte[]{2};
   }

   @Override
   public rrTf_1 id_protected() {
      this.id_goto();
      return (rrTf_1)this.id_byte[1];
   }

   @Override
   public void id_volatile() {
      this.id_goto();
      super.id_volatile();
      Boolean var5 = id_private[3];
      this.id_byte[id_catch[9]] = var5;
   }

   private static void id_synchronized() {
      id_protected = new float[]{52.0F, 1.0F, -1.0F, 5.0F, 0.5F};
   }
}
