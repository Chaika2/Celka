package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryo_1 extends rrpu_3 implements rrnF_2 {
   public Object[] id_class;
   private static String[] id_break;
   private static boolean[] id_byte;
   private static byte[] id_protected;
   private static float[] id_case;
   private static short[] id_catch;
   private static long[] id_private;

   private static int id_byte(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 122563942;
   }

   @Override
   public rdn_3 id_byte() {
      return ((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[3]).id_break().id_class();
   }

   public rryo_1(FtHelper var1) {
      super(var1);
      this.id_goto();
      rrIF var6 = new rrIF("Активация", (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[0]);
      this.id_class[0] = var6;
      rrTT var7 = new rrTT(this);
      this.id_class[1] = var7;
      rrfP_2 var8 = new rrfP_2();
      this.id_class[2] = var8;
      Integer var9 = -1;
      this.id_class[6] = var9;
      var1.id_class(new GroupSetting("Снежок заморозка", (rrIF)this.id_class[0]));
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_private = new long[]{300L, 0L};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 422496432546343129L;
   }

   @EventTarget
   public void id_class(rrLu_1 var1) {
      this.id_goto();
      ((rrfP_2)this.id_class[2]).id_class(var1);
   }

   private int id_class(int var1) {
      this.id_goto();
      if (var1 == -2) {
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         return var1;
      } else if (var1 == -3) {
         rrfo_3.id_class(rpm_3.OFF_HAND);
         return var1;
      } else if (var1 >= 0 && var1 < 9) {
         rrfo_3.id_class(var1);
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         rrfo_3.id_class(((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_protected);
         return var1;
      } else if (var1 >= 9 && var1 <= 36) {
         ((rrfP_2)this.id_class[2]).id_class(((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_protected);
         ((Ax_1)id_import.id_class[55]).id_class(var1);
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         Long var6 = rqR_2.id_break();
         this.id_class[4] = var6;
         return var1;
      } else {
         return id_protected[12];
      }
   }

   @EventTarget
   public void id_class(rrLB var1) {
      this.id_goto();
      if (var1.id_break() == ((rrIF)this.id_class[0]).id_finally().id_byte()) {
         Boolean var6 = true;
         this.id_class[3] = var6;
      }
   }

   @EventTarget
   public void id_class(q_1 var1) {
      this.id_goto();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         ((rrfP_2)this.id_class[2]).id_class(rqR_2.id_break() - this.id_class[4] > 300L ? true : id_byte[4]);
         if ((Boolean)this.id_class[3]) {
            FtHelper var2 = this.id_continue();
            int var3 = this.id_else();
            int var4 = this.id_package();
            rryD var5 = this.id_break(var3);
            switch (((int[])rryK.id_class[0])[var5.ordinal()]) {
               case 1:
                  int var23 = ((cb_3)id_import.id_class[57]).sK().id_protected(rdy_3.Jd);
                  float var7 = (float)var23 / 20.0F;
                  rrfu_3.id_class(var2, "снежка заморозки", var7);
                  Boolean var12 = false;
                  this.id_class[3] = var12;
                  return;
               case 2:
                  Boolean var13 = false;
                  this.id_class[3] = var13;
                  return;
            }

            label50:
            if (var5 == (rryD)rryD.staticFields24c72777b502351fbafe71530c75a9f7[0]) {
               if (var4 > 0) {
                  ((rrTT)this.id_class[1])
                     .id_class(
                        (rrTg_1)() -> new PX((Float)((cb_3)id_import.id_class[57]).id_break[45], (Float)((cb_3)id_import.id_class[57]).id_break[46]),
                        (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[0]
                     );
               }

               if (var4 != 0) {
                  int var10002 = (Integer)this.id_class[5] + 1;
                  Integer var14 = var10002;
                  this.id_class[5] = var14;
                  if (var10002 < var4) {
                     break label50;
                  }
               }

               int var6 = this.id_class(var3);
               if (var6 > 8) {
                  Integer var15 = var6;
                  this.id_class[6] = var15;
                  Integer var16 = 0;
                  this.id_class[7] = var16;
               }

               if (var4 != 0) {
                  ((rrTT)this.id_class[1]).id_final();
                  ((rrTT)this.id_class[1]).id_finally();
               }

               Integer var17 = 0;
               this.id_class[5] = var17;
               Boolean var18 = false;
               this.id_class[3] = var18;
            }
         }

         if ((Integer)this.id_class[6] != -1) {
            byte var22 = !((cb_3)id_import.id_class[57]).sV() && !((cb_3)id_import.id_class[57]).sZ() ? id_protected[3] : id_byte[11];
            int var24 = (Integer)this.id_class[7] + 1;
            Integer var19 = var24;
            this.id_class[7] = var19;
            if (var24 > var22) {
               ((Ax_1)id_import.id_class[55]).id_class((Integer)this.id_class[6]);
               Integer var20 = -1;
               this.id_class[6] = var20;
               Integer var21 = 0;
               this.id_class[7] = var21;
            }
         }
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{67, 12, -11, -70, 85, 114, 32, -127}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private rryD id_break(int var1) {
      if (var1 == -1) {
         return (rryD)rryD.staticFields24c72777b502351fbafe71530c75a9f7[1];
      } else {
         return ((cb_3)id_import.id_class[57]).sK().id_class(rdy_3.hU)
            ? (rryD)rryD.staticFields24c72777b502351fbafe71530c75a9f7[2]
            : (rryD)rryD.staticFields24c72777b502351fbafe71530c75a9f7[0];
      }
   }

   @Override
   public float id_break() {
      return -1.0F;
   }

   @Override
   public rrIF id_throws() {
      this.id_goto();
      return (rrIF)this.id_class[0];
   }

   @Override
   public rrTp_1 id_catch() {
      return (rrTp_1)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[3];
   }

   private void id_goto() {
      if (this.id_class == null) {
         this.id_class = new Object[8];
         this.id_class[3] = false;
         this.id_class[4] = 0L;
         this.id_class[5] = 0;
         this.id_class[6] = 0;
         this.id_class[7] = 0;
      }
   }

   private int id_else() {
      Predicate var1 = this.id_protected();
      if (var1 == null) {
         return -1;
      } else if (var1.test(((cb_3)id_import.id_class[57]).ss())) {
         return -2;
      } else if (var1.test(((cb_3)id_import.id_class[57]).Sn())) {
         return -3;
      } else {
         for (int var2 = id_byte[16]; var2 < 45; var2++) {
            rdn_3 var3 = ((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_extends(var2);
            if (var1.test(var3)) {
               return var2;
            }
         }

         return id_protected[17];
      }
   }

   private static void id_new() {
      id_protected = new byte[]{-1, 8, -1, 2, -1, -1, -1, -2, -3, 9, 9, 36, -1, -1, -2, -3, 45, -1, 2, 8, 3, 4, 5, 6, 7};
   }

   private int id_package() {
      return (C_volatile)rrTT.id_break[3] instanceof rrTT && ((C_volatile)rrTT.id_break[3]).id_byte() != null ? 2 : id_byte[17];
   }

   private static void id_return() {
      id_catch = new short[]{
         0,
         0,
         1,
         2,
         6,
         0,
         0,
         3,
         2,
         0,
         2,
         4,
         3,
         0,
         57,
         3,
         3,
         0,
         1,
         0,
         5,
         5,
         6,
         7,
         1,
         1,
         5,
         3,
         6,
         57,
         57,
         7,
         7,
         55,
         6,
         6,
         7,
         3,
         6,
         7,
         1,
         57,
         2,
         0,
         57,
         1,
         2,
         57,
         1,
         55,
         4,
         3,
         0,
         57,
         57,
         57,
         1,
         3,
         3,
         3,
         57,
         45,
         57,
         46
      };
   }

   private static void id_public() {
      id_byte = new boolean[]{
         true,
         false,
         true,
         true,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         false,
         false,
         false,
         true,
         true,
         false,
         false,
         false,
         false,
         false
      };
   }

   @Override
   public Predicate<rdn_3> id_protected() {
      return var0 -> {
         if (var0.id_break() != rdy_3.hU) {
            return false;
         } else if (var0.id_continue().id_byte().equalsIgnoreCase("[★] Снежок заморозка")) {
            return true;
         } else {
            return !var0.id_protected("freezeball") && !var0.id_protected("spooky-item") ? id_byte[21] : id_byte[20];
         }
      };
   }

   @Override
   public float id_private() {
      return -1.0F;
   }

   private static void id_final() {
      id_case = new float[]{20.0F, -1.0F, -1.0F};
   }

   private static void id_synchronized() {
      id_break = new String[]{
         new String("Активация"),
         new String("Снежок заморозка"),
         new String("снежка заморозки"),
         new String("[★] Снежок заморозка"),
         new String("freezeball"),
         new String("spooky-item")
      };
   }

   @Override
   public boolean aK_() {
      this.id_goto();
      Boolean var5 = false;
      this.id_class[3] = var5;
      Integer var6 = -1;
      this.id_class[6] = var6;
      Integer var7 = 0;
      this.id_class[7] = var7;
      return super.aK_();
   }
}
