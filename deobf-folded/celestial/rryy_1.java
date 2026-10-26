package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryy_1 extends rrTF<ClickPearl> implements rrnF_2 {
   private static short[] id_break;
   private static byte[] id_byte;
   private static float[] id_protected;
   public Object[] id_class;
   private static boolean[] id_case;
   private static String[] id_catch;
   private static long[] id_private;

   private static int id_byte(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1929818298;
   }

   private void id_int() {
      if (this.id_class == null) {
         this.id_class = new Object[9];
         this.id_class[2] = 0L;
         this.id_class[3] = 0;
         this.id_class[4] = 0;
         this.id_class[5] = false;
         this.id_class[6] = 0;
         this.id_class[7] = 0;
      }
   }

   public rryy_1(ClickPearl var1) {
      super(var1);
      this.id_int();
      rrfP_2 var6 = new rrfP_2();
      this.id_class[id_break[0]] = var6;
      rrTT var7 = new rrTT(this);
      this.id_class[1] = var7;
      Integer var8 = -1;
      this.id_class[4] = var8;
      Integer var9 = -1;
      this.id_class[6] = var9;
      rrIk_1 var10 = new rrIk_1(id_catch[0], id_case[0]).id_class(() -> this.id_continue().id_new() == this ? true : id_case[30]);
      this.id_class[8] = var10;
      var1.id_class((rrIk_1)this.id_class[8]);
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_catch = new String[]{new String("Анти-блокер"), new String("эндер жемчуга")};
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{70, 45, 71, -50, -63, -8, 122, -56}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_class(int var1) {
      this.id_int();
      if (var1 != -1) {
         int var2 = this.id_protected(var1);
         if (var2 > 8) {
            Integer var7 = var2;
            this.id_class[6] = var7;
            Integer var8 = Integer.valueOf(id_case[18]);
            this.id_class[7] = var8;
         }
      }

      this.id_instanceof();
      Boolean var9 = id_case[19];
      this.id_class[5] = var9;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3198326777605220298L;
   }

   @EventTarget
   public void id_class(rrAY var1) {
      this.id_int();
      if (((rrIk_1)this.id_class[8]).id_class()) {
         if ((Boolean)this.id_class[5] && var1.id_class() == rpm_3.OFF_HAND) {
            var1.id_class(true);
         }

         if (var1.id_break().id_break() instanceof rxt_3) {
            rjG_2 var3 = (rjG_2)id_import.id_class[64];
            if (var3 instanceof rff_3 var2 && ((gm_3)id_import.id_class[56]).id_byte(var2.id_class()).id_byte() != QP.id_class) {
               var1.id_class(true);
            }
         }
      }
   }

   @EventTarget
   public void id_class(rrLB var1) {
      this.id_int();
      ClickPearl var2 = this.id_continue();
      boolean var3 = var1.id_break() == var2.id_continue().id_finally().id_byte() ? true : id_case[2];
      if (((rrIk_1)this.id_class[8]).id_class() && var1.id_break() == 1 && ((cb_3)id_import.id_class[57]).ss().id_break() instanceof rxt_3) {
         var3 = true;
      }

      if (var3) {
         int var4 = rrfY_2.id_class(rdy_3.Jm, id_case[5], true);
         rryp_1 var5 = this.id_break(var4);
         if (var5 == (rryp_1)rryp_1.staticFields1677081b7d6b3f3aa7e7dec6b87c7532[2]) {
            int var6 = ((cb_3)id_import.id_class[57]).sK().id_protected(rdy_3.Jm);
            float var7 = (float)var6 / 20.0F;
            rrfu_3.id_class(var2, id_catch[1], var7);
         } else if (var5 == (rryp_1)rryp_1.staticFields1677081b7d6b3f3aa7e7dec6b87c7532[id_break[10]]) {
            this.id_public();
            Boolean var12 = true;
            this.id_class[5] = var12;
         }
      }
   }

   @EventTarget
   public void id_class(rrLu_1 var1) {
      this.id_int();
      ((rrfP_2)this.id_class[id_break[16]]).id_class(var1);
   }

   @EventTarget(
      id_class = 200
   )
   public void id_class(q_1 var1) {
      this.id_int();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_break[17]]) {
         ((rrfP_2)this.id_class[id_break[18]]).id_class(System.currentTimeMillis() - this.id_class[2] > 200L ? true : id_case[11]);
         label31:
         if ((Boolean)this.id_class[5]) {
            int var2 = rrfY_2.id_class(rdy_3.Jm, id_case[12], true);
            int var3 = this.id_while();
            if (var3 > 0) {
               ((rrTT)this.id_class[1])
                  .id_class(
                     (rrTg_1)() -> new PX((Float)((cb_3)id_import.id_class[57]).id_break[45], (Float)((cb_3)id_import.id_class[57]).id_break[46]),
                     (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[id_break[22]]
                  );
            }

            if (var3 != 0) {
               int var10002 = (Integer)this.id_class[3] + 1;
               Integer var8 = var10002;
               this.id_class[3] = var8;
               if (var10002 < var3) {
                  break label31;
               }
            }

            this.id_class(var2);
            if (var3 != 0) {
               ((rrTT)this.id_class[1]).id_final();
               ((rrTT)this.id_class[1]).id_finally();
            }

            Integer var9 = Integer.valueOf(id_case[15]);
            this.id_class[3] = var9;
         }

         if ((Integer)this.id_class[6] != -1) {
            int var13 = (Integer)this.id_class[7] + 1;
            Integer var10 = var13;
            this.id_class[7] = var10;
            if (var13 > 2) {
               ((Ax_1)id_import.id_class[55]).id_class((Integer)this.id_class[6]);
               Integer var11 = -1;
               this.id_class[6] = var11;
               Integer var12 = Integer.valueOf(id_case[17]);
               this.id_class[7] = var12;
            }
         }
      }
   }

   private rryp_1 id_break(int var1) {
      if (var1 == -1) {
         return (rryp_1)rryp_1.staticFields1677081b7d6b3f3aa7e7dec6b87c7532[1];
      } else {
         return ((cb_3)id_import.id_class[57]).sK().id_class(rdy_3.Jm)
            ? (rryp_1)rryp_1.staticFields1677081b7d6b3f3aa7e7dec6b87c7532[2]
            : (rryp_1)rryp_1.staticFields1677081b7d6b3f3aa7e7dec6b87c7532[id_break[38]];
      }
   }

   @Override
   public float id_break() {
      return -1.0F;
   }

   @Override
   public rrTp_1 id_catch() {
      return (rrTp_1)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[3];
   }

   private int id_goto() {
      for (int var1 = id_case[26]; var1 < 9; var1++) {
         if (((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_extends(var1).id_break() != rdy_3.Jm) {
            return var1;
         }
      }

      return -1;
   }

   private void id_instanceof() {
      this.id_int();
      if ((Integer)this.id_class[4] != -1) {
         ((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_protected = (Integer)this.id_class[4];
         Integer var5 = -1;
         this.id_class[4] = var5;
      }
   }

   private static void id_new() {
      id_protected = new float[]{20.0F, -1.0F, -1.0F};
   }

   private static void id_return() {
      id_break = new short[]{
         0,
         1,
         4,
         6,
         8,
         8,
         8,
         57,
         2,
         57,
         0,
         5,
         8,
         5,
         64,
         56,
         0,
         0,
         0,
         2,
         5,
         1,
         0,
         3,
         3,
         1,
         1,
         3,
         6,
         7,
         7,
         55,
         6,
         6,
         7,
         1,
         57,
         2,
         0,
         6,
         7,
         5,
         57,
         57,
         57,
         57,
         1,
         0,
         57,
         1,
         55,
         57,
         2,
         8,
         64,
         56,
         57,
         57,
         1,
         4,
         57,
         1,
         55,
         57,
         56,
         8,
         64,
         56,
         3,
         3,
         4,
         57,
         1,
         4,
         4,
         57,
         1,
         3,
         5,
         6,
         7,
         1,
         57,
         45,
         57,
         46
      };
   }

   private static void id_try() {
      id_case = new boolean[]{
         false,
         true,
         false,
         true,
         true,
         false,
         true,
         true,
         true,
         true,
         true,
         false,
         false,
         true,
         true,
         false,
         true,
         false,
         false,
         false,
         false,
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
         false
      };
   }

   private int id_while() {
      this.id_int();
      if (((rrIk_1)this.id_class[8]).id_class()) {
         rjG_2 var2 = (rjG_2)id_import.id_class[64];
         if (var2 instanceof rff_3 var1 && ((gm_3)id_import.id_class[56]).id_byte(var1.id_class()).id_byte() != QP.id_class) {
            return 1;
         }
      }

      return (C_volatile)rrTT.id_break[3] instanceof rrTT && ((C_volatile)rrTT.id_break[3]).id_byte() != null ? 2 : id_case[25];
   }

   private void id_public() {
      this.id_int();
      if (((rrIk_1)this.id_class[8]).id_class()) {
         rjG_2 var2 = (rjG_2)id_import.id_class[64];
         if (var2 instanceof rff_3 var1) {
            rfH_2 var9 = var1.id_class();
            if (((gm_3)id_import.id_class[56]).id_byte(var9).id_byte() != QP.id_class) {
               if (((cb_3)id_import.id_class[57]).ss().id_break() instanceof rxt_3) {
                  Integer var8 = ((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_protected;
                  this.id_class[4] = var8;
                  int var3 = this.id_goto();
                  if (var3 != -1) {
                     ((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_protected = var3;
                  }
               }

               ((Ax_1)id_import.id_class[55]).id_class((cb_3)id_import.id_class[57], (gm_3)id_import.id_class[56], rpm_3.MAIN_HAND, var1);
            }
         }
      }
   }

   private int id_protected(int var1) {
      this.id_int();
      if (var1 == -2) {
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         ((cb_3)id_import.id_class[57]).id_class(rpm_3.MAIN_HAND, id_case[20]);
         return var1;
      } else if (var1 == -3) {
         rrfo_3.id_class(rpm_3.OFF_HAND);
         ((cb_3)id_import.id_class[57]).id_class(rpm_3.OFF_HAND, id_case[21]);
         return var1;
      } else if (var1 >= 0 && var1 < 9) {
         rrfo_3.id_class(var1);
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         ((cb_3)id_import.id_class[57]).id_class(rpm_3.MAIN_HAND, id_case[22]);
         rrfo_3.id_class(((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_protected);
         return var1;
      } else if (var1 >= 9 && var1 <= 36) {
         ((rrfP_2)this.id_class[id_break[47]]).id_class(((rhz_3)((cb_3)id_import.id_class[57]).id_implements[1]).id_protected);
         ((Ax_1)id_import.id_class[55]).id_class(var1);
         rrfo_3.id_class(rpm_3.MAIN_HAND);
         ((cb_3)id_import.id_class[57]).id_class(rpm_3.MAIN_HAND, id_case[23]);
         Long var6 = System.currentTimeMillis();
         this.id_class[2] = var6;
         return var1;
      } else {
         return -1;
      }
   }

   @Override
   public float id_private() {
      return -1.0F;
   }

   private static void id_final() {
      id_byte = new byte[]{-1, -1, -1, 2, -1, -1, -1, 8, -2, -3, 9, 9, 36, -1, -1, 2, -1, -1, 9, -1, -1, 9, 2, 3, 4, 5, 6, 7};
   }

   private static void id_synchronized() {
      id_private = new long[]{200L, 0L};
   }

   @Override
   public boolean aK_() {
      this.id_int();
      Boolean var5 = id_case[27];
      this.id_class[5] = var5;
      Integer var6 = -1;
      this.id_class[6] = var6;
      Integer var7 = Integer.valueOf(id_case[28]);
      this.id_class[7] = var7;
      ((rrTT)this.id_class[1]).id_final();
      return super.aK_();
   }
}
