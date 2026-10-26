package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryC extends rrTF<ClickPearl> implements rrnF_2 {
   private static float[] id_break;
   private static short[] id_byte;
   private static long[] id_protected;
   private static String[] id_case;
   private static boolean[] id_catch;
   private static byte[] id_private;
   public Object[] id_class;

   private int id_byte(int var1) {
      this.id_else();
      if (var1 == -2) {
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         ((cb_3)id_import.id_class[57]).id_class(rpm_3.MAIN_HAND);
         return var1;
      } else if (var1 == -3) {
         rrfo_3.id_class(rpm_3.OFF_HAND);
         ((cb_3)id_import.id_class[57]).id_class(rpm_3.OFF_HAND);
         return var1;
      } else if (var1 >= 0 && var1 < 9) {
         Integer var6 = ((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_protected;
         this.id_class[4] = var6;
         ((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_protected = var1;
         rryl_1 var7 = (rryl_1)rryl_1.staticFieldsf4b744ad2cb233a5a56c412114fd18f6[0];
         this.id_class[6] = var7;
         return var1;
      } else if (var1 >= 9 && var1 <= 36) {
         ((rrfP_2)this.id_class[0]).id_class(((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_protected);
         ((Ax_1)id_import.id_class[55]).id_class(var1);
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         ((cb_3)id_import.id_class[57]).id_class(rpm_3.MAIN_HAND);
         Long var8 = System.currentTimeMillis();
         this.id_class[2] = var8;
         return var1;
      } else {
         return id_private[9];
      }
   }

   private static void id_int() {
      id_byte = new short[]{
         0,
         1,
         4,
         2,
         57,
         0,
         5,
         0,
         0,
         0,
         2,
         5,
         1,
         0,
         3,
         3,
         6,
         6,
         0,
         7,
         7,
         57,
         6,
         7,
         1,
         57,
         2,
         0,
         55,
         57,
         57,
         57,
         1,
         4,
         57,
         1,
         0,
         6,
         0,
         57,
         1,
         55,
         57,
         2,
         1,
         1,
         3,
         5,
         4,
         57,
         1,
         4,
         4,
         3,
         3,
         3,
         5,
         1,
         7,
         6,
         57,
         45,
         57,
         46
      };
   }

   public rryC(ClickPearl var1) {
      super(var1);
      this.id_else();
      rrfP_2 var6 = new rrfP_2();
      this.id_class[0] = var6;
      rrTT var7 = new rrTT(this);
      this.id_class[1] = var7;
      Integer var8 = -1;
      this.id_class[4] = var8;
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_private = new byte[]{-1, -1, -1, 8, -2, -3, 9, 9, 36, -1, -1, -1, 2, 8, 2, 3, 4, 5, 7};
   }

   @EventTarget(
      id_class = 200
   )
   public void id_class(q_1 var1) {
      this.id_else();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         ((rrfP_2)this.id_class[0]).id_class(System.currentTimeMillis() - this.id_class[2] > 200L ? true : id_catch[6]);
         if ((Boolean)this.id_class[5]) {
            int var2 = rrfY_2.id_class(rdy_3.Jm, false, true);
            int var3 = this.id_package();
            if (var3 > 0) {
               ((rrTT)this.id_class[1])
                  .id_class(
                     (rrTg_1)() -> new PX((Float)((cb_3)id_import.id_class[57]).id_break[45], (Float)((cb_3)id_import.id_class[57]).id_break[46]),
                     (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[0]
                  );
            }

            if (var3 != 0) {
               int var10002 = (Integer)this.id_class[3] + 1;
               Integer var8 = var10002;
               this.id_class[3] = var8;
               if (var10002 < var3) {
                  return;
               }
            }

            if ((rryl_1)this.id_class[6] == null) {
               this.id_class(var2);
            }

            if ((rryl_1)this.id_class[6] == (rryl_1)rryl_1.staticFieldsf4b744ad2cb233a5a56c412114fd18f6[0]) {
               int var12 = (Integer)this.id_class[7] + 1;
               Integer var9 = var12;
               this.id_class[7] = var9;
               if (var12 > 1) {
                  rrfo_3.id_class(rpm_3.MAIN_HAND);
                  ((cb_3)id_import.id_class[57]).id_class(rpm_3.MAIN_HAND);
                  this.id_synchronized();
                  this.id_throws(var3);
                  Object var10 = null;
                  this.id_class[6] = var10;
                  Integer var11 = 0;
                  this.id_class[7] = var11;
               }
            } else {
               this.id_throws(var3);
            }
         }
      }
   }

   @EventTarget
   public void id_class(rrLu_1 var1) {
      this.id_else();
      ((rrfP_2)this.id_class[0]).id_class(var1);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7541307131828579775L;
   }

   public void id_class(int var1) {
      if (var1 != -1) {
         int var2 = this.id_byte(var1);
         if (var2 > 8) {
            ((Ax_1)id_import.id_class[55]).id_class(var2);
         }
      }
   }

   @EventTarget
   public void id_class(rrLB var1) {
      this.id_else();
      ClickPearl var2 = this.id_continue();
      boolean var3 = var1.id_break() == var2.id_continue().id_finally().id_byte() ? true : id_catch[1];
      if (var3) {
         int var4 = rrfY_2.id_class(rdy_3.Jm, false, true);
         rryH var5 = this.id_break(var4);
         if (var5 == (rryH)rryH.staticFields11c0dbdf8fff34b19e0679f05309932f[2]) {
            int var6 = ((cb_3)id_import.id_class[57]).sK().id_protected(rdy_3.Jm);
            float var7 = (float)var6 / 20.0F;
            rrfu_3.id_class(var2, "эндер жемчуга", var7);
         } else if (var5 == (rryH)rryH.staticFields11c0dbdf8fff34b19e0679f05309932f[0]) {
            Boolean var12 = true;
            this.id_class[5] = var12;
         }
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-57, -52, -120, 64, -76, 47, 53, -126}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public float id_break() {
      return -1.0F;
   }

   private rryH id_break(int var1) {
      if (var1 == -1) {
         return (rryH)rryH.staticFields11c0dbdf8fff34b19e0679f05309932f[1];
      } else {
         return ((cb_3)id_import.id_class[57]).sK().id_class(rdy_3.Jm)
            ? (rryH)rryH.staticFields11c0dbdf8fff34b19e0679f05309932f[2]
            : (rryH)rryH.staticFields11c0dbdf8fff34b19e0679f05309932f[0];
      }
   }

   private void id_throws(int var1) {
      this.id_else();
      if (var1 != 0) {
         ((rrTT)this.id_class[1]).id_final();
         ((rrTT)this.id_class[1]).id_finally();
      }

      Integer var6 = 0;
      this.id_class[3] = var6;
      Boolean var7 = false;
      this.id_class[5] = var7;
   }

   @Override
   public rrTp_1 id_catch() {
      return (rrTp_1)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[3];
   }

   private static void id_goto() {
      id_catch = new boolean[]{
         true, false, false, true, true, true, false, false, true, true, true, true, false, false, false, false, false, false, false, false, false, false
      };
   }

   private void id_else() {
      if (this.id_class == null) {
         this.id_class = new Object[8];
         this.id_class[2] = 0L;
         this.id_class[3] = 0;
         this.id_class[4] = 0;
         this.id_class[5] = false;
         this.id_class[7] = 0;
      }
   }

   private static void id_new() {
      id_protected = new long[]{200L, 0L};
   }

   private int id_package() {
      return (C_volatile)rrTT.id_break[3] instanceof rrTT && ((C_volatile)rrTT.id_break[3]).id_byte() != null ? 2 : id_catch[15];
   }

   private static void id_return() {
      id_case = new String[]{new String("эндер жемчуга")};
   }

   private static void id_public() {
      id_break = new float[]{20.0F, -1.0F, -1.0F};
   }

   private static int id_protected(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -705165434;
   }

   @Override
   public float id_private() {
      return -1.0F;
   }

   private void id_synchronized() {
      this.id_else();
      if ((Integer)this.id_class[4] != -1) {
         ((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_protected = (Integer)this.id_class[4];
         Integer var5 = -1;
         this.id_class[4] = var5;
      }
   }

   @Override
   public boolean aK_() {
      this.id_else();
      Boolean var5 = false;
      this.id_class[5] = var5;
      ((rrTT)this.id_class[1]).id_final();
      Integer var6 = 0;
      this.id_class[7] = var6;
      Object var7 = null;
      this.id_class[6] = var7;
      return super.aK_();
   }
}
